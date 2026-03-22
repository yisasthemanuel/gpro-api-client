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
 * PracticeResponseLapsDoneInnerDriCommentsInner
 */

@JsonTypeName("PracticeResponse_lapsDone_inner_driComments_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class PracticeResponseLapsDoneInnerDriCommentsInner {

  private @Nullable String part;

  private @Nullable String text;

  public PracticeResponseLapsDoneInnerDriCommentsInner part(@Nullable String part) {
    this.part = part;
    return this;
  }

  /**
   * Get part
   * @return part
   */
  
  @JsonProperty("part")
  public @Nullable String getPart() {
    return part;
  }

  public void setPart(@Nullable String part) {
    this.part = part;
  }

  public PracticeResponseLapsDoneInnerDriCommentsInner text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PracticeResponseLapsDoneInnerDriCommentsInner practiceResponseLapsDoneInnerDriCommentsInner = (PracticeResponseLapsDoneInnerDriCommentsInner) o;
    return Objects.equals(this.part, practiceResponseLapsDoneInnerDriCommentsInner.part) &&
        Objects.equals(this.text, practiceResponseLapsDoneInnerDriCommentsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(part, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PracticeResponseLapsDoneInnerDriCommentsInner {\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

