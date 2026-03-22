package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PracticeResponseShowComment1Popover
 */

@JsonTypeName("PracticeResponse_showComment1Popover")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class PracticeResponseShowComment1Popover {

  private @Nullable Boolean open;

  private @Nullable String event;

  private @Nullable String content;

  public PracticeResponseShowComment1Popover open(@Nullable Boolean open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
   */
  
  @JsonProperty("open")
  public @Nullable Boolean getOpen() {
    return open;
  }

  public void setOpen(@Nullable Boolean open) {
    this.open = open;
  }

  public PracticeResponseShowComment1Popover event(@Nullable String event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  
  @JsonProperty("event")
  public @Nullable String getEvent() {
    return event;
  }

  public void setEvent(@Nullable String event) {
    this.event = event;
  }

  public PracticeResponseShowComment1Popover content(@Nullable String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  
  @JsonProperty("content")
  public @Nullable String getContent() {
    return content;
  }

  public void setContent(@Nullable String content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PracticeResponseShowComment1Popover practiceResponseShowComment1Popover = (PracticeResponseShowComment1Popover) o;
    return Objects.equals(this.open, practiceResponseShowComment1Popover.open) &&
        Objects.equals(this.event, practiceResponseShowComment1Popover.event) &&
        Objects.equals(this.content, practiceResponseShowComment1Popover.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(open, event, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PracticeResponseShowComment1Popover {\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

