package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphAccessibility;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphChart;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphCredits;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphLegend;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphPlotOptions;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSeriesInner;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitle;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphTitle;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphTooltip;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphYAxis;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponseDataGraph
 */

@JsonTypeName("SnFHistoryResponse_dataGraph")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraph {

  private @Nullable SnFHistoryResponseDataGraphChart chart;

  private @Nullable SnFHistoryResponseDataGraphAccessibility accessibility;

  private @Nullable SnFHistoryResponseDataGraphTitle title;

  private @Nullable SnFHistoryResponseDataGraphSubtitle subtitle;

  private @Nullable SnFHistoryResponseDataGraphPlotOptions plotOptions;

  private @Nullable SnFHistoryResponseDataGraphYAxis yAxis;

  private @Nullable SnFHistoryResponseDataGraphYAxis xAxis;

  private @Nullable SnFHistoryResponseDataGraphLegend legend;

  private @Nullable SnFHistoryResponseDataGraphCredits credits;

  private @Nullable SnFHistoryResponseDataGraphTooltip tooltip;

  @Valid
  private List<@Valid SnFHistoryResponseDataGraphSeriesInner> series = new ArrayList<>();

  public SnFHistoryResponseDataGraph chart(@Nullable SnFHistoryResponseDataGraphChart chart) {
    this.chart = chart;
    return this;
  }

  /**
   * Get chart
   * @return chart
   */
  @Valid 
  @JsonProperty("chart")
  public @Nullable SnFHistoryResponseDataGraphChart getChart() {
    return chart;
  }

  public void setChart(@Nullable SnFHistoryResponseDataGraphChart chart) {
    this.chart = chart;
  }

  public SnFHistoryResponseDataGraph accessibility(@Nullable SnFHistoryResponseDataGraphAccessibility accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  /**
   * Get accessibility
   * @return accessibility
   */
  @Valid 
  @JsonProperty("accessibility")
  public @Nullable SnFHistoryResponseDataGraphAccessibility getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(@Nullable SnFHistoryResponseDataGraphAccessibility accessibility) {
    this.accessibility = accessibility;
  }

  public SnFHistoryResponseDataGraph title(@Nullable SnFHistoryResponseDataGraphTitle title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @Valid 
  @JsonProperty("title")
  public @Nullable SnFHistoryResponseDataGraphTitle getTitle() {
    return title;
  }

  public void setTitle(@Nullable SnFHistoryResponseDataGraphTitle title) {
    this.title = title;
  }

  public SnFHistoryResponseDataGraph subtitle(@Nullable SnFHistoryResponseDataGraphSubtitle subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Get subtitle
   * @return subtitle
   */
  @Valid 
  @JsonProperty("subtitle")
  public @Nullable SnFHistoryResponseDataGraphSubtitle getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(@Nullable SnFHistoryResponseDataGraphSubtitle subtitle) {
    this.subtitle = subtitle;
  }

  public SnFHistoryResponseDataGraph plotOptions(@Nullable SnFHistoryResponseDataGraphPlotOptions plotOptions) {
    this.plotOptions = plotOptions;
    return this;
  }

  /**
   * Get plotOptions
   * @return plotOptions
   */
  @Valid 
  @JsonProperty("plotOptions")
  public @Nullable SnFHistoryResponseDataGraphPlotOptions getPlotOptions() {
    return plotOptions;
  }

  public void setPlotOptions(@Nullable SnFHistoryResponseDataGraphPlotOptions plotOptions) {
    this.plotOptions = plotOptions;
  }

  public SnFHistoryResponseDataGraph yAxis(@Nullable SnFHistoryResponseDataGraphYAxis yAxis) {
    this.yAxis = yAxis;
    return this;
  }

  /**
   * Get yAxis
   * @return yAxis
   */
  @Valid 
  @JsonProperty("yAxis")
  public @Nullable SnFHistoryResponseDataGraphYAxis getyAxis() {
    return yAxis;
  }

  public void setyAxis(@Nullable SnFHistoryResponseDataGraphYAxis yAxis) {
    this.yAxis = yAxis;
  }

  public SnFHistoryResponseDataGraph xAxis(@Nullable SnFHistoryResponseDataGraphYAxis xAxis) {
    this.xAxis = xAxis;
    return this;
  }

  /**
   * Get xAxis
   * @return xAxis
   */
  @Valid 
  @JsonProperty("xAxis")
  public @Nullable SnFHistoryResponseDataGraphYAxis getxAxis() {
    return xAxis;
  }

  public void setxAxis(@Nullable SnFHistoryResponseDataGraphYAxis xAxis) {
    this.xAxis = xAxis;
  }

  public SnFHistoryResponseDataGraph legend(@Nullable SnFHistoryResponseDataGraphLegend legend) {
    this.legend = legend;
    return this;
  }

  /**
   * Get legend
   * @return legend
   */
  @Valid 
  @JsonProperty("legend")
  public @Nullable SnFHistoryResponseDataGraphLegend getLegend() {
    return legend;
  }

  public void setLegend(@Nullable SnFHistoryResponseDataGraphLegend legend) {
    this.legend = legend;
  }

  public SnFHistoryResponseDataGraph credits(@Nullable SnFHistoryResponseDataGraphCredits credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  @Valid 
  @JsonProperty("credits")
  public @Nullable SnFHistoryResponseDataGraphCredits getCredits() {
    return credits;
  }

  public void setCredits(@Nullable SnFHistoryResponseDataGraphCredits credits) {
    this.credits = credits;
  }

  public SnFHistoryResponseDataGraph tooltip(@Nullable SnFHistoryResponseDataGraphTooltip tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * Get tooltip
   * @return tooltip
   */
  @Valid 
  @JsonProperty("tooltip")
  public @Nullable SnFHistoryResponseDataGraphTooltip getTooltip() {
    return tooltip;
  }

  public void setTooltip(@Nullable SnFHistoryResponseDataGraphTooltip tooltip) {
    this.tooltip = tooltip;
  }

  public SnFHistoryResponseDataGraph series(List<@Valid SnFHistoryResponseDataGraphSeriesInner> series) {
    this.series = series;
    return this;
  }

  public SnFHistoryResponseDataGraph addSeriesItem(SnFHistoryResponseDataGraphSeriesInner seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<>();
    }
    this.series.add(seriesItem);
    return this;
  }

  /**
   * Get series
   * @return series
   */
  @Valid 
  @JsonProperty("series")
  public List<@Valid SnFHistoryResponseDataGraphSeriesInner> getSeries() {
    return series;
  }

  public void setSeries(List<@Valid SnFHistoryResponseDataGraphSeriesInner> series) {
    this.series = series;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraph snFHistoryResponseDataGraph = (SnFHistoryResponseDataGraph) o;
    return Objects.equals(this.chart, snFHistoryResponseDataGraph.chart) &&
        Objects.equals(this.accessibility, snFHistoryResponseDataGraph.accessibility) &&
        Objects.equals(this.title, snFHistoryResponseDataGraph.title) &&
        Objects.equals(this.subtitle, snFHistoryResponseDataGraph.subtitle) &&
        Objects.equals(this.plotOptions, snFHistoryResponseDataGraph.plotOptions) &&
        Objects.equals(this.yAxis, snFHistoryResponseDataGraph.yAxis) &&
        Objects.equals(this.xAxis, snFHistoryResponseDataGraph.xAxis) &&
        Objects.equals(this.legend, snFHistoryResponseDataGraph.legend) &&
        Objects.equals(this.credits, snFHistoryResponseDataGraph.credits) &&
        Objects.equals(this.tooltip, snFHistoryResponseDataGraph.tooltip) &&
        Objects.equals(this.series, snFHistoryResponseDataGraph.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, accessibility, title, subtitle, plotOptions, yAxis, xAxis, legend, credits, tooltip, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraph {\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    plotOptions: ").append(toIndentedString(plotOptions)).append("\n");
    sb.append("    yAxis: ").append(toIndentedString(yAxis)).append("\n");
    sb.append("    xAxis: ").append(toIndentedString(xAxis)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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

