package br.com.surb.surb.modules.deliver.dto;

import br.com.surb.surb.shared.enums.TypeDeliver;

import java.io.Serializable;
import java.time.Instant;

public class DeliverUpdateDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private TypeDeliver statusDeliver;
  private String feedback;
  private Integer correctCount;
  private Instant createdAt;
  private Instant updatedAt;
  private boolean status;

  public DeliverUpdateDTO(){}

  public DeliverUpdateDTO(TypeDeliver statusDeliver, String feedback, Integer correctCount,
                          Instant createdAt, Instant updatedAt, boolean status) {
    this.statusDeliver = statusDeliver;
    this.feedback = feedback;
    this.correctCount = correctCount;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
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

}