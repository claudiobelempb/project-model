package br.com.surb.surb.modules.deliver.dto;

import br.com.surb.surb.modules.deliver.infra.entities.Deliver;
import br.com.surb.surb.shared.enums.TypeDeliver;

import java.io.Serializable;
import java.time.Instant;

public class DeliverDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;
  private String uri;
  private TypeDeliver statusDeliver;
  private String feedback;
  private Integer correctCount;
  private Instant createdAt;
  private Instant updatedAt;
  private boolean status;

  public DeliverDTO(){}

  public DeliverDTO(Long id, String uri, TypeDeliver statusDeliver, String feedback, Integer correctCount,
                    Instant createdAt, Instant updatedAt, boolean status) {
    this.id = id;
    this.uri = uri;
    this.statusDeliver = statusDeliver;
    this.feedback = feedback;
    this.correctCount = correctCount;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public DeliverDTO(Deliver deliver){
    id = deliver.getId();
    uri = deliver.getUri();
    statusDeliver = deliver.getStatusDeliver();
    feedback = deliver.getFeedback();
    correctCount = deliver.getCorrectCount();
    createdAt = deliver.getCreatedAt();
    updatedAt = deliver.getUpdatedAt();
    status = deliver.isStatus();
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
}