package br.com.surb.surb.modules.department.dto;

import br.com.surb.surb.modules.department.infra.jpa.entities.Department;
import br.com.surb.surb.shared.enums.TypeStatus;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class DepartmentDTO implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  private Long id;
  private String name;
  private Instant createdAt;
  private Instant updatedAt;
  private TypeStatus status;

  public DepartmentDTO(){}

  public DepartmentDTO(Long id, String name, Instant createdAt, Instant updatedAt, TypeStatus status) {
    this.id = id;
    this.name = name;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public DepartmentDTO(Department department){
    id = department.getId();
    name = department.getName();
    createdAt = department.getCreatedAt();
    updatedAt = department.getUpdatedAt();
    status = department.getStatus();
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

}
