package br.com.surb.surb.modules.offer.infra.entities;

import br.com.surb.surb.modules.resource.infra.entities.Resource;
import br.com.surb.surb.modules.course.infra.entities.Course;
import br.com.surb.surb.shared.enums.TypeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_offer")
public class Offer implements Serializable {

  private static final long serialVersionUID = 1L;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String edition;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant startMoment;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant endMoment;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private TypeStatus status;

  /*
  * associação muitos para um
  * criar um chave estrangeira course_id
  * */
  @ManyToOne
  @JoinColumn(name = "course_id")
  private Course course;

  @OneToMany(mappedBy = "offer")
  private final List<Resource> resources = new ArrayList<>();


  public Offer(){}

  public Offer(Long id, String edition, Instant startMoment, Instant endMoment, Instant createdAt, Instant updatedAt,
               TypeStatus status,
               Course course) {
    this.id = id;
    this.edition = edition;
    this.startMoment = startMoment;
    this.endMoment = endMoment;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
    this.course = course;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
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

  public TypeStatus getStatus() {
    return status;
  }

  public void setStatus(TypeStatus status) {
    this.status = status;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public Instant getStartMoment() {
    return startMoment;
  }

  public void setStartMoment(Instant startMoment) {
    this.startMoment = startMoment;
  }

  public Instant getEndMoment() {
    return endMoment;
  }

  public void setEndMoment(Instant endMoment) {
    this.endMoment = endMoment;
  }

  public List<Resource> getResources() {
    return resources;
  }

  @PrePersist
  public void prePersist(){
    createdAt = Instant.now();
    status = TypeStatus.ENABLED;
  }

  @PreUpdate
  public void preUpdate(){
    updatedAt = Instant.now();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Offer offer = (Offer) o;
    return Objects.equals(id, offer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
