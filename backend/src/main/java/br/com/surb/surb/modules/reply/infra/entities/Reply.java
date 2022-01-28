package br.com.surb.surb.modules.reply.infra.entities;

import br.com.surb.surb.modules.topic.infra.entities.Topic;
import br.com.surb.surb.modules.user.infra.jpa.entities.User;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_reply")
public class Reply implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String body;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private boolean status;

  @ManyToOne
  @JoinColumn(name = "topic_id")
  private Topic topic;

  @ManyToOne
  @JoinColumn(name = "author_id")
  private User author;

  @ManyToMany
  @JoinTable(name = "tb_reply_likes",
    joinColumns = @JoinColumn(name = "reply_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id")
  )
  private final Set<User> likes = new HashSet<>();

  public Reply(){}

  public Reply(Long id, String body, Instant createdAt, Instant updatedAt, boolean status) {
    this.id = id;
    this.body = body;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public Set<User> getLikes() {
    return likes;
  }

  @PrePersist
  public void prePersist(){
    createdAt = Instant.now();
    status = Boolean.TRUE;
  }

  @PreUpdate
  public void preUpdate(){
    updatedAt = Instant.now();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Reply reply = (Reply) o;
    return Objects.equals(id, reply.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
