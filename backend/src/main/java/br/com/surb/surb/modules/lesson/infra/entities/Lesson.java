package br.com.surb.surb.modules.lesson.infra.entities;

import br.com.surb.surb.modules.deliver.infra.entities.Deliver;
import br.com.surb.surb.modules.enrollment.infra.entities.Enrollment;
import br.com.surb.surb.modules.section.infra.entities.Section;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.*;

@Entity
@Table(name = "tb_lesson")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lesson implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private Integer position;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private boolean status;

  @ManyToOne
  @JoinColumn(name = "section_id")
  private Section section;

  @ManyToMany
  @JoinTable(
    name = "tb_lessons_done",
    joinColumns = @JoinColumn(name = "lesson_id"),
    inverseJoinColumns = {
      @JoinColumn(name = "user_id"),
      @JoinColumn(name = "offer_id")
    }
  )
  private final Set<Enrollment> enrollmentsDone = new HashSet<>();

  @OneToMany(mappedBy = "lesson")
  private final List<Deliver> deliveries = new ArrayList<>();

  public Lesson(){}

  public Lesson(Long id, String title, Integer position, Instant createdAt, Instant updatedAt, boolean status,
                Section section) {
    this.id = id;
    this.title = title;
    this.position = position;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
    this.section = section;
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

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
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

  public Section getSection() {
    return section;
  }

  public void setSection(Section section) {
    this.section = section;
  }

  public List<Deliver> getDeliveries() {
    return deliveries;
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

  public Set<Enrollment> getEnrollmentsDone() {
    return enrollmentsDone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Lesson lesson = (Lesson) o;
    return Objects.equals(id, lesson.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
