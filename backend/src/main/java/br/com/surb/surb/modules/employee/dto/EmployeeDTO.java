package br.com.surb.surb.modules.employee.dto;

import br.com.surb.surb.modules.employee.jpa.entities.Employee;
import br.com.surb.surb.shared.enums.TypeStatus;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class EmployeeDTO implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Long id;
  private String name;
  private String email;
  private Instant createdAt;
  private Instant updatedAt;
  private TypeStatus status;

  public EmployeeDTO(){}

  public EmployeeDTO(Long id, String name, String email, Instant createdAt, Instant updatedAt,
                     TypeStatus status) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public EmployeeDTO(Employee employee){
    id = employee.getId();
    name = employee.getName();
    email = employee.getEmail();
    createdAt = employee.getCreatedAt();
    updatedAt = employee.getUpdatedAt();
    status = employee.getStatus();
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
