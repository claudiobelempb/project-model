package br.com.surb.surb.modules.section.infra.entities;

import br.com.surb.surb.modules.lesson.infra.entities.Lesson;
import br.com.surb.surb.modules.resource.infra.entities.Resource;
import br.com.surb.surb.shared.enums.TypeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_section")
public class Section implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private Integer position;
  private String imgUri;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private TypeStatus status;

  /*
   * associação muitos para um
   * criar um chave estrangeira resource_id
   * */
  @ManyToOne
  @JoinColumn(name = "resource_id")
  private Resource resource;

  /*
   * alto associação com section
   * definição recursiva
   * associação uni derecional
   * criar um chave estrangeira prerequisite_id
   * */
  @ManyToOne
  @JoinColumn(name = "prerequisite_id")
  private Section section;

  @OneToMany(mappedBy = "section")
  private final List<Lesson> lessons = new ArrayList<>();

  public Section(){}

  public Section(Long id, String title, String description, Integer position, String imgUri, Instant createdAt,
                 Instant updatedAt, TypeStatus status, Resource resource, Section section) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.position = position;
    this.imgUri = imgUri;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
    this.resource = resource;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public String getImgUri() {
    return imgUri;
  }

  public void setImgUri(String imgUri) {
    this.imgUri = imgUri;
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

  public Resource getResource() {
    return resource;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public Section getSection() {
    return section;
  }

  public void setSection(Section section) {
    this.section = section;
  }

  public List<Lesson> getLessons() {
    return lessons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Section section = (Section) o;
    return Objects.equals(id, section.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
