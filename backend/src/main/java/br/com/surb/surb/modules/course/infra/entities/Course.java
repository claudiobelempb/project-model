package br.com.surb.surb.modules.course.infra.entities;

import br.com.surb.surb.modules.offer.infra.entities.Offer;
import br.com.surb.surb.shared.enums.TypeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_course")
public class Course implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String imgUri;
  private String imgGrayUri;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private TypeStatus status;

  /*
  associação muitos para um
  criar um coleção de offers
  * */
  @OneToMany(mappedBy = "course")
  private final List<Offer> offers = new ArrayList<>();

  public Course(){}

  public Course(Long id, String name, String imgUri, String imgGrayUri, Instant createdAt, Instant updatedAt,
                TypeStatus status) {
    this.id = id;
    this.name = name;
    this.imgUri = imgUri;
    this.imgGrayUri = imgGrayUri;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImgUri() {
    return imgUri;
  }

  public void setImgUri(String imgUri) {
    this.imgUri = imgUri;
  }

  public String getImgGrayUri() {
    return imgGrayUri;
  }

  public void setImgGrayUri(String imgGrayUri) {
    this.imgGrayUri = imgGrayUri;
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

  public List<Offer> getOffers() {
    return offers;
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
    Course course = (Course) o;
    return Objects.equals(id, course.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
