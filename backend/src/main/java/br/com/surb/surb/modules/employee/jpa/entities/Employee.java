package br.com.surb.surb.modules.employee.jpa.entities;

import br.com.surb.surb.modules.department.infra.jpa.entities.Department;
import br.com.surb.surb.shared.enums.TypeStatus;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_employee")
public class Employee implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;
  private TypeStatus status;

  @ManyToOne
  @JoinColumn(name = "department_id")
  private Department department;

//  @ManyToMany
//  @JoinTable(
//    name = "tb_employee_department",
//    joinColumns = @JoinColumn(name = "employee_id"),
//    inverseJoinColumns = @JoinColumn(name = "department_id")
//  )
//  private final Set<Department> departments = new HashSet<>();

  public Employee(){}

  public Employee(Long id, String name, String email, Department department, Instant createdAt, Instant updatedAt,
                  TypeStatus status) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.department = department;
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

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  //  public Set<Department> getDepartments() {
//    return departments;
//  }

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
    Employee employee = (Employee) o;
    return Objects.equals(id, employee.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
