package br.com.surb.surb.modules.score.dto;

import java.io.Serializable;

public class ScoreDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String email;
  private Double score;

  public ScoreDTO(){}

  public ScoreDTO(String email, Double score) {
    this.email = email;
    this.score = score;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }
}
