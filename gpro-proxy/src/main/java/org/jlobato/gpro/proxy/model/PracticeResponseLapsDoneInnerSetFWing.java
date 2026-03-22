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
 * PracticeResponseLapsDoneInnerSetFWing
 */

@JsonTypeName("PracticeResponse_lapsDone_inner_setFWing")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class PracticeResponseLapsDoneInnerSetFWing {

  private @Nullable Integer value;

  private @Nullable String color;

  private @Nullable String comment;

  public PracticeResponseLapsDoneInnerSetFWing value(@Nullable Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  
  @JsonProperty("value")
  public @Nullable Integer getValue() {
    return value;
  }

  public void setValue(@Nullable Integer value) {
    this.value = value;
  }

  public PracticeResponseLapsDoneInnerSetFWing color(@Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  
  @JsonProperty("color")
  public @Nullable String getColor() {
    return color;
  }

  public void setColor(@Nullable String color) {
    this.color = color;
  }

  public PracticeResponseLapsDoneInnerSetFWing comment(@Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  
  @JsonProperty("comment")
  public @Nullable String getComment() {
    return comment;
  }

  public void setComment(@Nullable String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PracticeResponseLapsDoneInnerSetFWing practiceResponseLapsDoneInnerSetFWing = (PracticeResponseLapsDoneInnerSetFWing) o;
    return Objects.equals(this.value, practiceResponseLapsDoneInnerSetFWing.value) &&
        Objects.equals(this.color, practiceResponseLapsDoneInnerSetFWing.color) &&
        Objects.equals(this.comment, practiceResponseLapsDoneInnerSetFWing.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, color, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PracticeResponseLapsDoneInnerSetFWing {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

