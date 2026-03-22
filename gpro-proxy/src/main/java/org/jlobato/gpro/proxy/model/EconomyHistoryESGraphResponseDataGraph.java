package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraphChart;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraphPlotOptions;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraphSeriesInner;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraphTooltip;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphAccessibility;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphCredits;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitle;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphTitle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryESGraphResponseDataGraph
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraph {

  private @Nullable EconomyHistoryESGraphResponseDataGraphChart chart;

  private @Nullable SnFHistoryResponseDataGraphAccessibility accessibility;

  private @Nullable SnFHistoryResponseDataGraphTitle title;

  private @Nullable SnFHistoryResponseDataGraphSubtitle subtitle;

  private @Nullable EconomyHistoryESGraphResponseDataGraphTooltip tooltip;

  private @Nullable SnFHistoryResponseDataGraphCredits credits;

  private @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptions plotOptions;

  @Valid
  private List<@Valid EconomyHistoryESGraphResponseDataGraphSeriesInner> series = new ArrayList<>();

  public EconomyHistoryESGraphResponseDataGraph chart(@Nullable EconomyHistoryESGraphResponseDataGraphChart chart) {
    this.chart = chart;
    return this;
  }

  /**
   * Get chart
   * @return chart
   */
  @Valid 
  @JsonProperty("chart")
  public @Nullable EconomyHistoryESGraphResponseDataGraphChart getChart() {
    return chart;
  }

  public void setChart(@Nullable EconomyHistoryESGraphResponseDataGraphChart chart) {
    this.chart = chart;
  }

  public EconomyHistoryESGraphResponseDataGraph accessibility(@Nullable SnFHistoryResponseDataGraphAccessibility accessibility) {
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

  public EconomyHistoryESGraphResponseDataGraph title(@Nullable SnFHistoryResponseDataGraphTitle title) {
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

  public EconomyHistoryESGraphResponseDataGraph subtitle(@Nullable SnFHistoryResponseDataGraphSubtitle subtitle) {
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

  public EconomyHistoryESGraphResponseDataGraph tooltip(@Nullable EconomyHistoryESGraphResponseDataGraphTooltip tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * Get tooltip
   * @return tooltip
   */
  @Valid 
  @JsonProperty("tooltip")
  public @Nullable EconomyHistoryESGraphResponseDataGraphTooltip getTooltip() {
    return tooltip;
  }

  public void setTooltip(@Nullable EconomyHistoryESGraphResponseDataGraphTooltip tooltip) {
    this.tooltip = tooltip;
  }

  public EconomyHistoryESGraphResponseDataGraph credits(@Nullable SnFHistoryResponseDataGraphCredits credits) {
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

  public EconomyHistoryESGraphResponseDataGraph plotOptions(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptions plotOptions) {
    this.plotOptions = plotOptions;
    return this;
  }

  /**
   * Get plotOptions
   * @return plotOptions
   */
  @Valid 
  @JsonProperty("plotOptions")
  public @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptions getPlotOptions() {
    return plotOptions;
  }

  public void setPlotOptions(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptions plotOptions) {
    this.plotOptions = plotOptions;
  }

  public EconomyHistoryESGraphResponseDataGraph series(List<@Valid EconomyHistoryESGraphResponseDataGraphSeriesInner> series) {
    this.series = series;
    return this;
  }

  public EconomyHistoryESGraphResponseDataGraph addSeriesItem(EconomyHistoryESGraphResponseDataGraphSeriesInner seriesItem) {
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
  public List<@Valid EconomyHistoryESGraphResponseDataGraphSeriesInner> getSeries() {
    return series;
  }

  public void setSeries(List<@Valid EconomyHistoryESGraphResponseDataGraphSeriesInner> series) {
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
    EconomyHistoryESGraphResponseDataGraph economyHistoryESGraphResponseDataGraph = (EconomyHistoryESGraphResponseDataGraph) o;
    return Objects.equals(this.chart, economyHistoryESGraphResponseDataGraph.chart) &&
        Objects.equals(this.accessibility, economyHistoryESGraphResponseDataGraph.accessibility) &&
        Objects.equals(this.title, economyHistoryESGraphResponseDataGraph.title) &&
        Objects.equals(this.subtitle, economyHistoryESGraphResponseDataGraph.subtitle) &&
        Objects.equals(this.tooltip, economyHistoryESGraphResponseDataGraph.tooltip) &&
        Objects.equals(this.credits, economyHistoryESGraphResponseDataGraph.credits) &&
        Objects.equals(this.plotOptions, economyHistoryESGraphResponseDataGraph.plotOptions) &&
        Objects.equals(this.series, economyHistoryESGraphResponseDataGraph.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, accessibility, title, subtitle, tooltip, credits, plotOptions, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraph {\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    plotOptions: ").append(toIndentedString(plotOptions)).append("\n");
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

