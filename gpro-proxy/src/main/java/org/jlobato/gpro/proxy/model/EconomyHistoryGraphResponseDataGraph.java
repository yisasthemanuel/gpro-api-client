package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.EconomyHistoryGraphResponseDataGraphChart;
import org.jlobato.gpro.proxy.model.EconomyHistoryGraphResponseDataGraphSeriesInner;
import org.jlobato.gpro.proxy.model.EconomyHistoryGraphResponseDataGraphXAxis;
import org.jlobato.gpro.proxy.model.EconomyHistoryGraphResponseDataGraphYAxis;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphAccessibility;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphCredits;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitle;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphTitle;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphTooltip;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryGraphResponseDataGraph
 */

@JsonTypeName("EconomyHistoryGraphResponse_dataGraph")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryGraphResponseDataGraph {

  private @Nullable EconomyHistoryGraphResponseDataGraphChart chart;

  private @Nullable SnFHistoryResponseDataGraphAccessibility accessibility;

  private @Nullable SnFHistoryResponseDataGraphTitle title;

  private @Nullable SnFHistoryResponseDataGraphSubtitle subtitle;

  private @Nullable SnFHistoryResponseDataGraphCredits credits;

  private @Nullable SnFHistoryResponseDataGraphTooltip tooltip;

  @Valid
  private List<@Valid EconomyHistoryGraphResponseDataGraphSeriesInner> series = new ArrayList<>();

  private @Nullable EconomyHistoryGraphResponseDataGraphXAxis xAxis;

  private @Nullable EconomyHistoryGraphResponseDataGraphYAxis yAxis;

  public EconomyHistoryGraphResponseDataGraph chart(@Nullable EconomyHistoryGraphResponseDataGraphChart chart) {
    this.chart = chart;
    return this;
  }

  /**
   * Get chart
   * @return chart
   */
  @Valid 
  @JsonProperty("chart")
  public @Nullable EconomyHistoryGraphResponseDataGraphChart getChart() {
    return chart;
  }

  public void setChart(@Nullable EconomyHistoryGraphResponseDataGraphChart chart) {
    this.chart = chart;
  }

  public EconomyHistoryGraphResponseDataGraph accessibility(@Nullable SnFHistoryResponseDataGraphAccessibility accessibility) {
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

  public EconomyHistoryGraphResponseDataGraph title(@Nullable SnFHistoryResponseDataGraphTitle title) {
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

  public EconomyHistoryGraphResponseDataGraph subtitle(@Nullable SnFHistoryResponseDataGraphSubtitle subtitle) {
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

  public EconomyHistoryGraphResponseDataGraph credits(@Nullable SnFHistoryResponseDataGraphCredits credits) {
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

  public EconomyHistoryGraphResponseDataGraph tooltip(@Nullable SnFHistoryResponseDataGraphTooltip tooltip) {
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

  public EconomyHistoryGraphResponseDataGraph series(List<@Valid EconomyHistoryGraphResponseDataGraphSeriesInner> series) {
    this.series = series;
    return this;
  }

  public EconomyHistoryGraphResponseDataGraph addSeriesItem(EconomyHistoryGraphResponseDataGraphSeriesInner seriesItem) {
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
  public List<@Valid EconomyHistoryGraphResponseDataGraphSeriesInner> getSeries() {
    return series;
  }

  public void setSeries(List<@Valid EconomyHistoryGraphResponseDataGraphSeriesInner> series) {
    this.series = series;
  }

  public EconomyHistoryGraphResponseDataGraph xAxis(@Nullable EconomyHistoryGraphResponseDataGraphXAxis xAxis) {
    this.xAxis = xAxis;
    return this;
  }

  /**
   * Get xAxis
   * @return xAxis
   */
  @Valid 
  @JsonProperty("xAxis")
  public @Nullable EconomyHistoryGraphResponseDataGraphXAxis getxAxis() {
    return xAxis;
  }

  public void setxAxis(@Nullable EconomyHistoryGraphResponseDataGraphXAxis xAxis) {
    this.xAxis = xAxis;
  }

  public EconomyHistoryGraphResponseDataGraph yAxis(@Nullable EconomyHistoryGraphResponseDataGraphYAxis yAxis) {
    this.yAxis = yAxis;
    return this;
  }

  /**
   * Get yAxis
   * @return yAxis
   */
  @Valid 
  @JsonProperty("yAxis")
  public @Nullable EconomyHistoryGraphResponseDataGraphYAxis getyAxis() {
    return yAxis;
  }

  public void setyAxis(@Nullable EconomyHistoryGraphResponseDataGraphYAxis yAxis) {
    this.yAxis = yAxis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryGraphResponseDataGraph economyHistoryGraphResponseDataGraph = (EconomyHistoryGraphResponseDataGraph) o;
    return Objects.equals(this.chart, economyHistoryGraphResponseDataGraph.chart) &&
        Objects.equals(this.accessibility, economyHistoryGraphResponseDataGraph.accessibility) &&
        Objects.equals(this.title, economyHistoryGraphResponseDataGraph.title) &&
        Objects.equals(this.subtitle, economyHistoryGraphResponseDataGraph.subtitle) &&
        Objects.equals(this.credits, economyHistoryGraphResponseDataGraph.credits) &&
        Objects.equals(this.tooltip, economyHistoryGraphResponseDataGraph.tooltip) &&
        Objects.equals(this.series, economyHistoryGraphResponseDataGraph.series) &&
        Objects.equals(this.xAxis, economyHistoryGraphResponseDataGraph.xAxis) &&
        Objects.equals(this.yAxis, economyHistoryGraphResponseDataGraph.yAxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, accessibility, title, subtitle, credits, tooltip, series, xAxis, yAxis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryGraphResponseDataGraph {\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    xAxis: ").append(toIndentedString(xAxis)).append("\n");
    sb.append("    yAxis: ").append(toIndentedString(yAxis)).append("\n");
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

