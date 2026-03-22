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
 * SnFHistoryResponseDataGraphCreditsPosition
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_credits_position")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphCreditsPosition {

  private @Nullable String align;

  public SnFHistoryResponseDataGraphCreditsPosition align(@Nullable String align) {
    this.align = align;
    return this;
  }

  /**
   * Get align
   * @return align
   */
  
  @JsonProperty("align")
  public @Nullable String getAlign() {
    return align;
  }

  public void setAlign(@Nullable String align) {
    this.align = align;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraphCreditsPosition snFHistoryResponseDataGraphCreditsPosition = (SnFHistoryResponseDataGraphCreditsPosition) o;
    return Objects.equals(this.align, snFHistoryResponseDataGraphCreditsPosition.align);
  }

  @Override
  public int hashCode() {
    return Objects.hash(align);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphCreditsPosition {\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
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

