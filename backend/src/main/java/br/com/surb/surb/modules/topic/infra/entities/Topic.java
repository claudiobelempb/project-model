package br.com.surb.surb.modules.topic.infra.entities;

import br.com.surb.surb.modules.lesson.infra.entities.Lesson;
import br.com.surb.surb.modules.offer.infra.entities.Offer;
import br.com.surb.surb.modules.reply.infra.entities.Reply;
import br.com.surb.surb.modules.user.infra.jpa.entities.User;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.*;

@Entity
@Table(name = "tb_topic")
public class Topic implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;

  @Column(columnDefinition = "TEXT")
  private String body;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private boolean status;

  @ManyToOne
  @JoinColumn(name = "author_id")
  private User author;

  @ManyToOne
  @JoinColumn(name = "offer_id")
  private Offer offer;

  @ManyToOne
  @JoinColumn(name = "lesson_id")
  private Lesson lesson;

  @ManyToOne
  @JoinColumn(name = "reply_id")
  private Reply answer;

  @ManyToMany
  @JoinTable(name = "tb_topic_likes",
    joinColumns = @JoinColumn(name = "topic_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
  private final Set<User> likes = new HashSet<>();

  @OneToMany(mappedBy = "topic")
  private final List<Reply> replies = new ArrayList<>();

  public Topic(){}

  public Topic(Long id, String title, String body, Instant createdAt, Instant updatedAt, boolean status, User author, Offer offer, Lesson lesson) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
    this.author = author;
    this.offer = offer;
    this.lesson = lesson;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public Lesson getLesson() {
    return lesson;
  }

  public void setLesson(Lesson lesson) {
    this.lesson = lesson;
  }

  public Reply getAnswer() {
    return answer;
  }

  public void setAnswer(Reply answer) {
    this.answer = answer;
  }

  public Set<User> getLikes() {
    return likes;
  }

  public List<Reply> getReplies() {
    return replies;
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
    Topic topic = (Topic) o;
    return status == topic.status && Objects.equals(id, topic.id) && Objects.equals(title, topic.title) && Objects.equals(body, topic.body) && Objects.equals(createdAt, topic.createdAt) && Objects.equals(updatedAt, topic.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
