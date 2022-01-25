package br.com.surb.surb.modules.enrollment.infra.entities;

import br.com.surb.surb.modules.offer.infra.entities.Offer;
import br.com.surb.surb.modules.user.infra.jpa.entities.User;
import br.com.surb.surb.shared.enums.TypeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {

  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private final EnrollmentPK id = new EnrollmentPK();

  private Instant enrollMoment;
  private Instant refundMoment;
  private boolean available;
  private boolean onlyUpdate;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private TypeStatus status;

  public Enrollment(){}

  public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available,
                    boolean onlyUpdate) {
    super();
    id.setUser(user);
    id.setOffer(offer);
    this.enrollMoment = enrollMoment;
    this.refundMoment = refundMoment;
    this.available = available;
    this.onlyUpdate = onlyUpdate;
  }

  public User getUser() {
    return id.getUser();
  }

  public void setUser(User user) {
    id.setUser(user);
  }

  public Offer getOffer() {
    return id.getOffer();
  }

  public void setOffer(Offer offer) {
    id.setOffer(offer);
  }

  public void setEnrollMoment(Instant enrollMoment) {
    this.enrollMoment = enrollMoment;
  }

  public Instant getRefundMoment() {
    return refundMoment;
  }

  public void setRefundMoment(Instant refundMoment) {
    this.refundMoment = refundMoment;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public boolean isOnlyUpdate() {
    return onlyUpdate;
  }

  public void setOnlyUpdate(boolean onlyUpdate) {
    this.onlyUpdate = onlyUpdate;
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

  @PrePersist
  public void prePersist(){
    createdAt = Instant.now();
    status = TypeStatus.ENABLED;
  }

  @PreUpdate
  public void preUpdate(){
    updatedAt = Instant.now();
  }


}
