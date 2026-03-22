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
 * EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner
 */

@JsonTypeName("EconomyHistoryGraphResponse_dataGraph_yAxis_plotLines_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner {

  private @Nullable String color;

  private @Nullable Integer value;

  private @Nullable Integer width;

  public EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner color(@Nullable String color) {
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

  public EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner value(@Nullable Integer value) {
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

  public EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner width(@Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  
  @JsonProperty("width")
  public @Nullable Integer getWidth() {
    return width;
  }

  public void setWidth(@Nullable Integer width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner economyHistoryGraphResponseDataGraphYAxisPlotLinesInner = (EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner) o;
    return Objects.equals(this.color, economyHistoryGraphResponseDataGraphYAxisPlotLinesInner.color) &&
        Objects.equals(this.value, economyHistoryGraphResponseDataGraphYAxisPlotLinesInner.value) &&
        Objects.equals(this.width, economyHistoryGraphResponseDataGraphYAxisPlotLinesInner.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, value, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

