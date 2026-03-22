package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphChartBackgroundColor;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphChartScrollablePlotArea;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphChart
 */

@JsonTypeName("StandingsResponse_dataGraph_chart")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphChart {

  private @Nullable StandingsResponseDataGraphChartScrollablePlotArea scrollablePlotArea;

  private @Nullable Integer height;

  private @Nullable StandingsResponseDataGraphChartBackgroundColor backgroundColor;

  private @Nullable String borderColor;

  private @Nullable Integer borderWidth;

  private @Nullable String className;

  private @Nullable String plotBackgroundColor;

  private @Nullable String plotBorderColor;

  private @Nullable Integer plotBorderWidth;

  private @Nullable Integer marginBottom;

  public StandingsResponseDataGraphChart scrollablePlotArea(@Nullable StandingsResponseDataGraphChartScrollablePlotArea scrollablePlotArea) {
    this.scrollablePlotArea = scrollablePlotArea;
    return this;
  }

  /**
   * Get scrollablePlotArea
   * @return scrollablePlotArea
   */
  @Valid 
  @JsonProperty("scrollablePlotArea")
  public @Nullable StandingsResponseDataGraphChartScrollablePlotArea getScrollablePlotArea() {
    return scrollablePlotArea;
  }

  public void setScrollablePlotArea(@Nullable StandingsResponseDataGraphChartScrollablePlotArea scrollablePlotArea) {
    this.scrollablePlotArea = scrollablePlotArea;
  }

  public StandingsResponseDataGraphChart height(@Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  
  @JsonProperty("height")
  public @Nullable Integer getHeight() {
    return height;
  }

  public void setHeight(@Nullable Integer height) {
    this.height = height;
  }

  public StandingsResponseDataGraphChart backgroundColor(@Nullable StandingsResponseDataGraphChartBackgroundColor backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Get backgroundColor
   * @return backgroundColor
   */
  @Valid 
  @JsonProperty("backgroundColor")
  public @Nullable StandingsResponseDataGraphChartBackgroundColor getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(@Nullable StandingsResponseDataGraphChartBackgroundColor backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public StandingsResponseDataGraphChart borderColor(@Nullable String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Get borderColor
   * @return borderColor
   */
  
  @JsonProperty("borderColor")
  public @Nullable String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(@Nullable String borderColor) {
    this.borderColor = borderColor;
  }

  public StandingsResponseDataGraphChart borderWidth(@Nullable Integer borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  /**
   * Get borderWidth
   * @return borderWidth
   */
  
  @JsonProperty("borderWidth")
  public @Nullable Integer getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(@Nullable Integer borderWidth) {
    this.borderWidth = borderWidth;
  }

  public StandingsResponseDataGraphChart className(@Nullable String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
   */
  
  @JsonProperty("className")
  public @Nullable String getClassName() {
    return className;
  }

  public void setClassName(@Nullable String className) {
    this.className = className;
  }

  public StandingsResponseDataGraphChart plotBackgroundColor(@Nullable String plotBackgroundColor) {
    this.plotBackgroundColor = plotBackgroundColor;
    return this;
  }

  /**
   * Get plotBackgroundColor
   * @return plotBackgroundColor
   */
  
  @JsonProperty("plotBackgroundColor")
  public @Nullable String getPlotBackgroundColor() {
    return plotBackgroundColor;
  }

  public void setPlotBackgroundColor(@Nullable String plotBackgroundColor) {
    this.plotBackgroundColor = plotBackgroundColor;
  }

  public StandingsResponseDataGraphChart plotBorderColor(@Nullable String plotBorderColor) {
    this.plotBorderColor = plotBorderColor;
    return this;
  }

  /**
   * Get plotBorderColor
   * @return plotBorderColor
   */
  
  @JsonProperty("plotBorderColor")
  public @Nullable String getPlotBorderColor() {
    return plotBorderColor;
  }

  public void setPlotBorderColor(@Nullable String plotBorderColor) {
    this.plotBorderColor = plotBorderColor;
  }

  public StandingsResponseDataGraphChart plotBorderWidth(@Nullable Integer plotBorderWidth) {
    this.plotBorderWidth = plotBorderWidth;
    return this;
  }

  /**
   * Get plotBorderWidth
   * @return plotBorderWidth
   */
  
  @JsonProperty("plotBorderWidth")
  public @Nullable Integer getPlotBorderWidth() {
    return plotBorderWidth;
  }

  public void setPlotBorderWidth(@Nullable Integer plotBorderWidth) {
    this.plotBorderWidth = plotBorderWidth;
  }

  public StandingsResponseDataGraphChart marginBottom(@Nullable Integer marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

  /**
   * Get marginBottom
   * @return marginBottom
   */
  
  @JsonProperty("marginBottom")
  public @Nullable Integer getMarginBottom() {
    return marginBottom;
  }

  public void setMarginBottom(@Nullable Integer marginBottom) {
    this.marginBottom = marginBottom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphChart standingsResponseDataGraphChart = (StandingsResponseDataGraphChart) o;
    return Objects.equals(this.scrollablePlotArea, standingsResponseDataGraphChart.scrollablePlotArea) &&
        Objects.equals(this.height, standingsResponseDataGraphChart.height) &&
        Objects.equals(this.backgroundColor, standingsResponseDataGraphChart.backgroundColor) &&
        Objects.equals(this.borderColor, standingsResponseDataGraphChart.borderColor) &&
        Objects.equals(this.borderWidth, standingsResponseDataGraphChart.borderWidth) &&
        Objects.equals(this.className, standingsResponseDataGraphChart.className) &&
        Objects.equals(this.plotBackgroundColor, standingsResponseDataGraphChart.plotBackgroundColor) &&
        Objects.equals(this.plotBorderColor, standingsResponseDataGraphChart.plotBorderColor) &&
        Objects.equals(this.plotBorderWidth, standingsResponseDataGraphChart.plotBorderWidth) &&
        Objects.equals(this.marginBottom, standingsResponseDataGraphChart.marginBottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollablePlotArea, height, backgroundColor, borderColor, borderWidth, className, plotBackgroundColor, plotBorderColor, plotBorderWidth, marginBottom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphChart {\n");
    sb.append("    scrollablePlotArea: ").append(toIndentedString(scrollablePlotArea)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    plotBackgroundColor: ").append(toIndentedString(plotBackgroundColor)).append("\n");
    sb.append("    plotBorderColor: ").append(toIndentedString(plotBorderColor)).append("\n");
    sb.append("    plotBorderWidth: ").append(toIndentedString(plotBorderWidth)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
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

