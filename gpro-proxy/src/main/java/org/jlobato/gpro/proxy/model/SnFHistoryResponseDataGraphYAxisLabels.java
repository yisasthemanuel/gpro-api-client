package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitleStyle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponseDataGraphYAxisLabels
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_yAxis_labels")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphYAxisLabels {

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle style;

  public SnFHistoryResponseDataGraphYAxisLabels style(@Nullable SnFHistoryResponseDataGraphSubtitleStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @Valid 
  @JsonProperty("style")
  public @Nullable SnFHistoryResponseDataGraphSubtitleStyle getStyle() {
    return style;
  }

  public void setStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle style) {
    this.style = style;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraphYAxisLabels snFHistoryResponseDataGraphYAxisLabels = (SnFHistoryResponseDataGraphYAxisLabels) o;
    return Objects.equals(this.style, snFHistoryResponseDataGraphYAxisLabels.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphYAxisLabels {\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

