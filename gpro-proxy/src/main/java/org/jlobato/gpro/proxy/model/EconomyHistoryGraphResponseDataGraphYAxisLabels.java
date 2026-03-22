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
 * EconomyHistoryGraphResponseDataGraphYAxisLabels
 */

@JsonTypeName("EconomyHistoryGraphResponse_dataGraph_yAxis_labels")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryGraphResponseDataGraphYAxisLabels {

  private @Nullable String format;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle style;

  public EconomyHistoryGraphResponseDataGraphYAxisLabels format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public EconomyHistoryGraphResponseDataGraphYAxisLabels style(@Nullable SnFHistoryResponseDataGraphSubtitleStyle style) {
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
    EconomyHistoryGraphResponseDataGraphYAxisLabels economyHistoryGraphResponseDataGraphYAxisLabels = (EconomyHistoryGraphResponseDataGraphYAxisLabels) o;
    return Objects.equals(this.format, economyHistoryGraphResponseDataGraphYAxisLabels.format) &&
        Objects.equals(this.style, economyHistoryGraphResponseDataGraphYAxisLabels.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryGraphResponseDataGraphYAxisLabels {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

