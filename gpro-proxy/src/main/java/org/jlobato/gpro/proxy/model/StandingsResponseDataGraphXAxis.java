package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphYAxisLabels;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphXAxis
 */

@JsonTypeName("StandingsResponse_dataGraph_xAxis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphXAxis {

  private @Nullable String width;

  private @Nullable SnFHistoryResponseDataGraphYAxisLabels labels;

  private @Nullable Integer opposite;

  private @Nullable Integer min;

  private @Nullable Integer max;

  private @Nullable Integer allowDecimals;

  private @Nullable Integer title;

  public StandingsResponseDataGraphXAxis width(@Nullable String width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  
  @JsonProperty("width")
  public @Nullable String getWidth() {
    return width;
  }

  public void setWidth(@Nullable String width) {
    this.width = width;
  }

  public StandingsResponseDataGraphXAxis labels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @Valid 
  @JsonProperty("labels")
  public @Nullable SnFHistoryResponseDataGraphYAxisLabels getLabels() {
    return labels;
  }

  public void setLabels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
    this.labels = labels;
  }

  public StandingsResponseDataGraphXAxis opposite(@Nullable Integer opposite) {
    this.opposite = opposite;
    return this;
  }

  /**
   * Get opposite
   * @return opposite
   */
  
  @JsonProperty("opposite")
  public @Nullable Integer getOpposite() {
    return opposite;
  }

  public void setOpposite(@Nullable Integer opposite) {
    this.opposite = opposite;
  }

  public StandingsResponseDataGraphXAxis min(@Nullable Integer min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   */
  
  @JsonProperty("min")
  public @Nullable Integer getMin() {
    return min;
  }

  public void setMin(@Nullable Integer min) {
    this.min = min;
  }

  public StandingsResponseDataGraphXAxis max(@Nullable Integer max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   */
  
  @JsonProperty("max")
  public @Nullable Integer getMax() {
    return max;
  }

  public void setMax(@Nullable Integer max) {
    this.max = max;
  }

  public StandingsResponseDataGraphXAxis allowDecimals(@Nullable Integer allowDecimals) {
    this.allowDecimals = allowDecimals;
    return this;
  }

  /**
   * Get allowDecimals
   * @return allowDecimals
   */
  
  @JsonProperty("allowDecimals")
  public @Nullable Integer getAllowDecimals() {
    return allowDecimals;
  }

  public void setAllowDecimals(@Nullable Integer allowDecimals) {
    this.allowDecimals = allowDecimals;
  }

  public StandingsResponseDataGraphXAxis title(@Nullable Integer title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @JsonProperty("title")
  public @Nullable Integer getTitle() {
    return title;
  }

  public void setTitle(@Nullable Integer title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphXAxis standingsResponseDataGraphXAxis = (StandingsResponseDataGraphXAxis) o;
    return Objects.equals(this.width, standingsResponseDataGraphXAxis.width) &&
        Objects.equals(this.labels, standingsResponseDataGraphXAxis.labels) &&
        Objects.equals(this.opposite, standingsResponseDataGraphXAxis.opposite) &&
        Objects.equals(this.min, standingsResponseDataGraphXAxis.min) &&
        Objects.equals(this.max, standingsResponseDataGraphXAxis.max) &&
        Objects.equals(this.allowDecimals, standingsResponseDataGraphXAxis.allowDecimals) &&
        Objects.equals(this.title, standingsResponseDataGraphXAxis.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, labels, opposite, min, max, allowDecimals, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphXAxis {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    opposite: ").append(toIndentedString(opposite)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    allowDecimals: ").append(toIndentedString(allowDecimals)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

