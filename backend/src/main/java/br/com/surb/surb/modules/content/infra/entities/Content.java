package br.com.surb.surb.modules.content.infra.entities;

import br.com.surb.surb.modules.lesson.infra.entities.Lesson;
import br.com.surb.surb.modules.section.infra.entities.Section;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson implements Serializable {

  private static final long serialVersionUID = 1L;

  private String textContent;
  private String videoUri;

  public Content(){}

  public Content(Long id, String title, Integer position, Instant createdAt, Instant updatedAt, boolean status,
                 Section section, String textContent, String videoUri) {
    super(id, title, position, createdAt, updatedAt, status, section);
    this.textContent = textContent;
    this.videoUri = videoUri;
  }

  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public String getVideoUri() {
    return videoUri;
  }

  public void setVideoUri(String videoUri) {
    this.videoUri = videoUri;
  }
}
