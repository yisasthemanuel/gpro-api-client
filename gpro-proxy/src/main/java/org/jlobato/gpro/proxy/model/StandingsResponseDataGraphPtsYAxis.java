package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphYAxisLabels;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphYAxisTitle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPtsYAxis
 */

@JsonTypeName("StandingsResponse_dataGraphPts_yAxis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPtsYAxis {

  private @Nullable Integer max;

  private @Nullable Integer min;

  private @Nullable Integer startOnTick;

  private @Nullable Integer tickInterval;

  private @Nullable Integer showFirstLabel;

  private @Nullable Integer showLastLabel;

  private @Nullable String gridLineColor;

  private @Nullable SnFHistoryResponseDataGraphYAxisLabels labels;

  private @Nullable String lineColor;

  private @Nullable String minorTickInterval;

  private @Nullable String tickColor;

  private @Nullable Integer tickWidth;

  private @Nullable StandingsResponseDataGraphYAxisTitle title;

  public StandingsResponseDataGraphPtsYAxis max(@Nullable Integer max) {
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

  public StandingsResponseDataGraphPtsYAxis min(@Nullable Integer min) {
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

  public StandingsResponseDataGraphPtsYAxis startOnTick(@Nullable Integer startOnTick) {
    this.startOnTick = startOnTick;
    return this;
  }

  /**
   * Get startOnTick
   * @return startOnTick
   */
  
  @JsonProperty("startOnTick")
  public @Nullable Integer getStartOnTick() {
    return startOnTick;
  }

  public void setStartOnTick(@Nullable Integer startOnTick) {
    this.startOnTick = startOnTick;
  }

  public StandingsResponseDataGraphPtsYAxis tickInterval(@Nullable Integer tickInterval) {
    this.tickInterval = tickInterval;
    return this;
  }

  /**
   * Get tickInterval
   * @return tickInterval
   */
  
  @JsonProperty("tickInterval")
  public @Nullable Integer getTickInterval() {
    return tickInterval;
  }

  public void setTickInterval(@Nullable Integer tickInterval) {
    this.tickInterval = tickInterval;
  }

  public StandingsResponseDataGraphPtsYAxis showFirstLabel(@Nullable Integer showFirstLabel) {
    this.showFirstLabel = showFirstLabel;
    return this;
  }

  /**
   * Get showFirstLabel
   * @return showFirstLabel
   */
  
  @JsonProperty("showFirstLabel")
  public @Nullable Integer getShowFirstLabel() {
    return showFirstLabel;
  }

  public void setShowFirstLabel(@Nullable Integer showFirstLabel) {
    this.showFirstLabel = showFirstLabel;
  }

  public StandingsResponseDataGraphPtsYAxis showLastLabel(@Nullable Integer showLastLabel) {
    this.showLastLabel = showLastLabel;
    return this;
  }

  /**
   * Get showLastLabel
   * @return showLastLabel
   */
  
  @JsonProperty("showLastLabel")
  public @Nullable Integer getShowLastLabel() {
    return showLastLabel;
  }

  public void setShowLastLabel(@Nullable Integer showLastLabel) {
    this.showLastLabel = showLastLabel;
  }

  public StandingsResponseDataGraphPtsYAxis gridLineColor(@Nullable String gridLineColor) {
    this.gridLineColor = gridLineColor;
    return this;
  }

  /**
   * Get gridLineColor
   * @return gridLineColor
   */
  
  @JsonProperty("gridLineColor")
  public @Nullable String getGridLineColor() {
    return gridLineColor;
  }

  public void setGridLineColor(@Nullable String gridLineColor) {
    this.gridLineColor = gridLineColor;
  }

  public StandingsResponseDataGraphPtsYAxis labels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
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

  public StandingsResponseDataGraphPtsYAxis lineColor(@Nullable String lineColor) {
    this.lineColor = lineColor;
    return this;
  }

  /**
   * Get lineColor
   * @return lineColor
   */
  
  @JsonProperty("lineColor")
  public @Nullable String getLineColor() {
    return lineColor;
  }

  public void setLineColor(@Nullable String lineColor) {
    this.lineColor = lineColor;
  }

  public StandingsResponseDataGraphPtsYAxis minorTickInterval(@Nullable String minorTickInterval) {
    this.minorTickInterval = minorTickInterval;
    return this;
  }

  /**
   * Get minorTickInterval
   * @return minorTickInterval
   */
  
  @JsonProperty("minorTickInterval")
  public @Nullable String getMinorTickInterval() {
    return minorTickInterval;
  }

  public void setMinorTickInterval(@Nullable String minorTickInterval) {
    this.minorTickInterval = minorTickInterval;
  }

  public StandingsResponseDataGraphPtsYAxis tickColor(@Nullable String tickColor) {
    this.tickColor = tickColor;
    return this;
  }

  /**
   * Get tickColor
   * @return tickColor
   */
  
  @JsonProperty("tickColor")
  public @Nullable String getTickColor() {
    return tickColor;
  }

  public void setTickColor(@Nullable String tickColor) {
    this.tickColor = tickColor;
  }

  public StandingsResponseDataGraphPtsYAxis tickWidth(@Nullable Integer tickWidth) {
    this.tickWidth = tickWidth;
    return this;
  }

  /**
   * Get tickWidth
   * @return tickWidth
   */
  
  @JsonProperty("tickWidth")
  public @Nullable Integer getTickWidth() {
    return tickWidth;
  }

  public void setTickWidth(@Nullable Integer tickWidth) {
    this.tickWidth = tickWidth;
  }

  public StandingsResponseDataGraphPtsYAxis title(@Nullable StandingsResponseDataGraphYAxisTitle title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @Valid 
  @JsonProperty("title")
  public @Nullable StandingsResponseDataGraphYAxisTitle getTitle() {
    return title;
  }

  public void setTitle(@Nullable StandingsResponseDataGraphYAxisTitle title) {
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
    StandingsResponseDataGraphPtsYAxis standingsResponseDataGraphPtsYAxis = (StandingsResponseDataGraphPtsYAxis) o;
    return Objects.equals(this.max, standingsResponseDataGraphPtsYAxis.max) &&
        Objects.equals(this.min, standingsResponseDataGraphPtsYAxis.min) &&
        Objects.equals(this.startOnTick, standingsResponseDataGraphPtsYAxis.startOnTick) &&
        Objects.equals(this.tickInterval, standingsResponseDataGraphPtsYAxis.tickInterval) &&
        Objects.equals(this.showFirstLabel, standingsResponseDataGraphPtsYAxis.showFirstLabel) &&
        Objects.equals(this.showLastLabel, standingsResponseDataGraphPtsYAxis.showLastLabel) &&
        Objects.equals(this.gridLineColor, standingsResponseDataGraphPtsYAxis.gridLineColor) &&
        Objects.equals(this.labels, standingsResponseDataGraphPtsYAxis.labels) &&
        Objects.equals(this.lineColor, standingsResponseDataGraphPtsYAxis.lineColor) &&
        Objects.equals(this.minorTickInterval, standingsResponseDataGraphPtsYAxis.minorTickInterval) &&
        Objects.equals(this.tickColor, standingsResponseDataGraphPtsYAxis.tickColor) &&
        Objects.equals(this.tickWidth, standingsResponseDataGraphPtsYAxis.tickWidth) &&
        Objects.equals(this.title, standingsResponseDataGraphPtsYAxis.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, startOnTick, tickInterval, showFirstLabel, showLastLabel, gridLineColor, labels, lineColor, minorTickInterval, tickColor, tickWidth, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPtsYAxis {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    startOnTick: ").append(toIndentedString(startOnTick)).append("\n");
    sb.append("    tickInterval: ").append(toIndentedString(tickInterval)).append("\n");
    sb.append("    showFirstLabel: ").append(toIndentedString(showFirstLabel)).append("\n");
    sb.append("    showLastLabel: ").append(toIndentedString(showLastLabel)).append("\n");
    sb.append("    gridLineColor: ").append(toIndentedString(gridLineColor)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lineColor: ").append(toIndentedString(lineColor)).append("\n");
    sb.append("    minorTickInterval: ").append(toIndentedString(minorTickInterval)).append("\n");
    sb.append("    tickColor: ").append(toIndentedString(tickColor)).append("\n");
    sb.append("    tickWidth: ").append(toIndentedString(tickWidth)).append("\n");
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

