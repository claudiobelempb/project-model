package br.com.surb.surb.modules.deliver.infra.entities;

import br.com.surb.surb.modules.enrollment.infra.entities.Enrollment;
import br.com.surb.surb.modules.lesson.infra.entities.Lesson;
import br.com.surb.surb.shared.enums.TypeDeliver;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_deliver")
public class Deliver implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String uri;
  private TypeDeliver statusDeliver;
  private String feedback;
  private Integer correctCount;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private boolean status;

  @ManyToOne
  @JoinColumn(name = "lesson_id")
  private Lesson lesson;

  @ManyToOne
  @JoinColumns({
    @JoinColumn(name = "offer_id"),
    @JoinColumn(name = "user_id")
  })
  private Enrollment enrollment;

  public Deliver(){}

  public Deliver(Long id, String uri, TypeDeliver statusDeliver, String feedback, Integer correctCount,
                 Instant createdAt, Instant updatedAt, boolean status, Lesson lesson, Enrollment enrollment) {
    this.id = id;
    this.uri = uri;
    this.statusDeliver = statusDeliver;
    this.feedback = feedback;
    this.correctCount = correctCount;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
    this.lesson = lesson;
    this.enrollment = enrollment;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public TypeDeliver getStatusDeliver() {
    return statusDeliver;
  }

  public void setStatusDeliver(TypeDeliver statusDeliver) {
    this.statusDeliver = statusDeliver;
  }

  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public Integer getCorrectCount() {
    return correctCount;
  }

  public void setCorrectCount(Integer correctCount) {
    this.correctCount = correctCount;
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

  public Lesson getLesson() {
    return lesson;
  }

  public void setLesson(Lesson lesson) {
    this.lesson = lesson;
  }

  public Enrollment getEnrollment() {
    return enrollment;
  }

  public void setEnrollment(Enrollment enrollment) {
    this.enrollment = enrollment;
  }

  @PrePersist
  public void prePersist(){
    createdAt = Instant.now();
    statusDeliver = TypeDeliver.PENDING;
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
    Deliver deliver = (Deliver) o;
    return Objects.equals(id, deliver.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
