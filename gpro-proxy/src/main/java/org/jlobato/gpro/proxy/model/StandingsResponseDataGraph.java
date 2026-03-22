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
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphTitle;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphYAxisLabels;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphChart;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphLegend;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphNavigation;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphNavigator;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptions;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphRangeSelector;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphScrollbar;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphSeriesInner;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphToolbar;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphTooltip;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphXAxis;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphYAxis;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraph
 */

@JsonTypeName("StandingsResponse_dataGraph")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraph {

  private @Nullable StandingsResponseDataGraphChart chart;

  private @Nullable SnFHistoryResponseDataGraphAccessibility accessibility;

  private @Nullable StandingsResponseDataGraphYAxis yAxis;

  private @Nullable StandingsResponseDataGraphXAxis xAxis;

  private @Nullable SnFHistoryResponseDataGraphAccessibility credits;

  private @Nullable SnFHistoryResponseDataGraphYAxisLabels labels;

  private @Nullable StandingsResponseDataGraphScrollbar scrollbar;

  private @Nullable StandingsResponseDataGraphNavigation navigation;

  private @Nullable StandingsResponseDataGraphRangeSelector rangeSelector;

  private @Nullable StandingsResponseDataGraphNavigator navigator;

  private @Nullable StandingsResponseDataGraphLegend legend;

  private @Nullable StandingsResponseDataGraphToolbar toolbar;

  private @Nullable String dataLabelsColor;

  private @Nullable String textColor;

  private @Nullable String maskColor;

  private @Nullable String legendBackgroundColor;

  private @Nullable String legendBackgroundColorSolid;

  private @Nullable StandingsResponseDataGraphPlotOptions plotOptions;

  private @Nullable StandingsResponseDataGraphTooltip tooltip;

  private @Nullable SnFHistoryResponseDataGraphTitle title;

  @Valid
  private List<@Valid StandingsResponseDataGraphSeriesInner> series = new ArrayList<>();

  public StandingsResponseDataGraph chart(@Nullable StandingsResponseDataGraphChart chart) {
    this.chart = chart;
    return this;
  }

  /**
   * Get chart
   * @return chart
   */
  @Valid 
  @JsonProperty("chart")
  public @Nullable StandingsResponseDataGraphChart getChart() {
    return chart;
  }

  public void setChart(@Nullable StandingsResponseDataGraphChart chart) {
    this.chart = chart;
  }

  public StandingsResponseDataGraph accessibility(@Nullable SnFHistoryResponseDataGraphAccessibility accessibility) {
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

  public StandingsResponseDataGraph yAxis(@Nullable StandingsResponseDataGraphYAxis yAxis) {
    this.yAxis = yAxis;
    return this;
  }

  /**
   * Get yAxis
   * @return yAxis
   */
  @Valid 
  @JsonProperty("yAxis")
  public @Nullable StandingsResponseDataGraphYAxis getyAxis() {
    return yAxis;
  }

  public void setyAxis(@Nullable StandingsResponseDataGraphYAxis yAxis) {
    this.yAxis = yAxis;
  }

  public StandingsResponseDataGraph xAxis(@Nullable StandingsResponseDataGraphXAxis xAxis) {
    this.xAxis = xAxis;
    return this;
  }

  /**
   * Get xAxis
   * @return xAxis
   */
  @Valid 
  @JsonProperty("xAxis")
  public @Nullable StandingsResponseDataGraphXAxis getxAxis() {
    return xAxis;
  }

  public void setxAxis(@Nullable StandingsResponseDataGraphXAxis xAxis) {
    this.xAxis = xAxis;
  }

  public StandingsResponseDataGraph credits(@Nullable SnFHistoryResponseDataGraphAccessibility credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  @Valid 
  @JsonProperty("credits")
  public @Nullable SnFHistoryResponseDataGraphAccessibility getCredits() {
    return credits;
  }

  public void setCredits(@Nullable SnFHistoryResponseDataGraphAccessibility credits) {
    this.credits = credits;
  }

  public StandingsResponseDataGraph labels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
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

  public StandingsResponseDataGraph scrollbar(@Nullable StandingsResponseDataGraphScrollbar scrollbar) {
    this.scrollbar = scrollbar;
    return this;
  }

  /**
   * Get scrollbar
   * @return scrollbar
   */
  @Valid 
  @JsonProperty("scrollbar")
  public @Nullable StandingsResponseDataGraphScrollbar getScrollbar() {
    return scrollbar;
  }

  public void setScrollbar(@Nullable StandingsResponseDataGraphScrollbar scrollbar) {
    this.scrollbar = scrollbar;
  }

  public StandingsResponseDataGraph navigation(@Nullable StandingsResponseDataGraphNavigation navigation) {
    this.navigation = navigation;
    return this;
  }

  /**
   * Get navigation
   * @return navigation
   */
  @Valid 
  @JsonProperty("navigation")
  public @Nullable StandingsResponseDataGraphNavigation getNavigation() {
    return navigation;
  }

  public void setNavigation(@Nullable StandingsResponseDataGraphNavigation navigation) {
    this.navigation = navigation;
  }

  public StandingsResponseDataGraph rangeSelector(@Nullable StandingsResponseDataGraphRangeSelector rangeSelector) {
    this.rangeSelector = rangeSelector;
    return this;
  }

  /**
   * Get rangeSelector
   * @return rangeSelector
   */
  @Valid 
  @JsonProperty("rangeSelector")
  public @Nullable StandingsResponseDataGraphRangeSelector getRangeSelector() {
    return rangeSelector;
  }

  public void setRangeSelector(@Nullable StandingsResponseDataGraphRangeSelector rangeSelector) {
    this.rangeSelector = rangeSelector;
  }

  public StandingsResponseDataGraph navigator(@Nullable StandingsResponseDataGraphNavigator navigator) {
    this.navigator = navigator;
    return this;
  }

  /**
   * Get navigator
   * @return navigator
   */
  @Valid 
  @JsonProperty("navigator")
  public @Nullable StandingsResponseDataGraphNavigator getNavigator() {
    return navigator;
  }

  public void setNavigator(@Nullable StandingsResponseDataGraphNavigator navigator) {
    this.navigator = navigator;
  }

  public StandingsResponseDataGraph legend(@Nullable StandingsResponseDataGraphLegend legend) {
    this.legend = legend;
    return this;
  }

  /**
   * Get legend
   * @return legend
   */
  @Valid 
  @JsonProperty("legend")
  public @Nullable StandingsResponseDataGraphLegend getLegend() {
    return legend;
  }

  public void setLegend(@Nullable StandingsResponseDataGraphLegend legend) {
    this.legend = legend;
  }

  public StandingsResponseDataGraph toolbar(@Nullable StandingsResponseDataGraphToolbar toolbar) {
    this.toolbar = toolbar;
    return this;
  }

  /**
   * Get toolbar
   * @return toolbar
   */
  @Valid 
  @JsonProperty("toolbar")
  public @Nullable StandingsResponseDataGraphToolbar getToolbar() {
    return toolbar;
  }

  public void setToolbar(@Nullable StandingsResponseDataGraphToolbar toolbar) {
    this.toolbar = toolbar;
  }

  public StandingsResponseDataGraph dataLabelsColor(@Nullable String dataLabelsColor) {
    this.dataLabelsColor = dataLabelsColor;
    return this;
  }

  /**
   * Get dataLabelsColor
   * @return dataLabelsColor
   */
  
  @JsonProperty("dataLabelsColor")
  public @Nullable String getDataLabelsColor() {
    return dataLabelsColor;
  }

  public void setDataLabelsColor(@Nullable String dataLabelsColor) {
    this.dataLabelsColor = dataLabelsColor;
  }

  public StandingsResponseDataGraph textColor(@Nullable String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * Get textColor
   * @return textColor
   */
  
  @JsonProperty("textColor")
  public @Nullable String getTextColor() {
    return textColor;
  }

  public void setTextColor(@Nullable String textColor) {
    this.textColor = textColor;
  }

  public StandingsResponseDataGraph maskColor(@Nullable String maskColor) {
    this.maskColor = maskColor;
    return this;
  }

  /**
   * Get maskColor
   * @return maskColor
   */
  
  @JsonProperty("maskColor")
  public @Nullable String getMaskColor() {
    return maskColor;
  }

  public void setMaskColor(@Nullable String maskColor) {
    this.maskColor = maskColor;
  }

  public StandingsResponseDataGraph legendBackgroundColor(@Nullable String legendBackgroundColor) {
    this.legendBackgroundColor = legendBackgroundColor;
    return this;
  }

  /**
   * Get legendBackgroundColor
   * @return legendBackgroundColor
   */
  
  @JsonProperty("legendBackgroundColor")
  public @Nullable String getLegendBackgroundColor() {
    return legendBackgroundColor;
  }

  public void setLegendBackgroundColor(@Nullable String legendBackgroundColor) {
    this.legendBackgroundColor = legendBackgroundColor;
  }

  public StandingsResponseDataGraph legendBackgroundColorSolid(@Nullable String legendBackgroundColorSolid) {
    this.legendBackgroundColorSolid = legendBackgroundColorSolid;
    return this;
  }

  /**
   * Get legendBackgroundColorSolid
   * @return legendBackgroundColorSolid
   */
  
  @JsonProperty("legendBackgroundColorSolid")
  public @Nullable String getLegendBackgroundColorSolid() {
    return legendBackgroundColorSolid;
  }

  public void setLegendBackgroundColorSolid(@Nullable String legendBackgroundColorSolid) {
    this.legendBackgroundColorSolid = legendBackgroundColorSolid;
  }

  public StandingsResponseDataGraph plotOptions(@Nullable StandingsResponseDataGraphPlotOptions plotOptions) {
    this.plotOptions = plotOptions;
    return this;
  }

  /**
   * Get plotOptions
   * @return plotOptions
   */
  @Valid 
  @JsonProperty("plotOptions")
  public @Nullable StandingsResponseDataGraphPlotOptions getPlotOptions() {
    return plotOptions;
  }

  public void setPlotOptions(@Nullable StandingsResponseDataGraphPlotOptions plotOptions) {
    this.plotOptions = plotOptions;
  }

  public StandingsResponseDataGraph tooltip(@Nullable StandingsResponseDataGraphTooltip tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * Get tooltip
   * @return tooltip
   */
  @Valid 
  @JsonProperty("tooltip")
  public @Nullable StandingsResponseDataGraphTooltip getTooltip() {
    return tooltip;
  }

  public void setTooltip(@Nullable StandingsResponseDataGraphTooltip tooltip) {
    this.tooltip = tooltip;
  }

  public StandingsResponseDataGraph title(@Nullable SnFHistoryResponseDataGraphTitle title) {
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

  public StandingsResponseDataGraph series(List<@Valid StandingsResponseDataGraphSeriesInner> series) {
    this.series = series;
    return this;
  }

  public StandingsResponseDataGraph addSeriesItem(StandingsResponseDataGraphSeriesInner seriesItem) {
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
  public List<@Valid StandingsResponseDataGraphSeriesInner> getSeries() {
    return series;
  }

  public void setSeries(List<@Valid StandingsResponseDataGraphSeriesInner> series) {
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
    StandingsResponseDataGraph standingsResponseDataGraph = (StandingsResponseDataGraph) o;
    return Objects.equals(this.chart, standingsResponseDataGraph.chart) &&
        Objects.equals(this.accessibility, standingsResponseDataGraph.accessibility) &&
        Objects.equals(this.yAxis, standingsResponseDataGraph.yAxis) &&
        Objects.equals(this.xAxis, standingsResponseDataGraph.xAxis) &&
        Objects.equals(this.credits, standingsResponseDataGraph.credits) &&
        Objects.equals(this.labels, standingsResponseDataGraph.labels) &&
        Objects.equals(this.scrollbar, standingsResponseDataGraph.scrollbar) &&
        Objects.equals(this.navigation, standingsResponseDataGraph.navigation) &&
        Objects.equals(this.rangeSelector, standingsResponseDataGraph.rangeSelector) &&
        Objects.equals(this.navigator, standingsResponseDataGraph.navigator) &&
        Objects.equals(this.legend, standingsResponseDataGraph.legend) &&
        Objects.equals(this.toolbar, standingsResponseDataGraph.toolbar) &&
        Objects.equals(this.dataLabelsColor, standingsResponseDataGraph.dataLabelsColor) &&
        Objects.equals(this.textColor, standingsResponseDataGraph.textColor) &&
        Objects.equals(this.maskColor, standingsResponseDataGraph.maskColor) &&
        Objects.equals(this.legendBackgroundColor, standingsResponseDataGraph.legendBackgroundColor) &&
        Objects.equals(this.legendBackgroundColorSolid, standingsResponseDataGraph.legendBackgroundColorSolid) &&
        Objects.equals(this.plotOptions, standingsResponseDataGraph.plotOptions) &&
        Objects.equals(this.tooltip, standingsResponseDataGraph.tooltip) &&
        Objects.equals(this.title, standingsResponseDataGraph.title) &&
        Objects.equals(this.series, standingsResponseDataGraph.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, accessibility, yAxis, xAxis, credits, labels, scrollbar, navigation, rangeSelector, navigator, legend, toolbar, dataLabelsColor, textColor, maskColor, legendBackgroundColor, legendBackgroundColorSolid, plotOptions, tooltip, title, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraph {\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    yAxis: ").append(toIndentedString(yAxis)).append("\n");
    sb.append("    xAxis: ").append(toIndentedString(xAxis)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    scrollbar: ").append(toIndentedString(scrollbar)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
    sb.append("    rangeSelector: ").append(toIndentedString(rangeSelector)).append("\n");
    sb.append("    navigator: ").append(toIndentedString(navigator)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    toolbar: ").append(toIndentedString(toolbar)).append("\n");
    sb.append("    dataLabelsColor: ").append(toIndentedString(dataLabelsColor)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    maskColor: ").append(toIndentedString(maskColor)).append("\n");
    sb.append("    legendBackgroundColor: ").append(toIndentedString(legendBackgroundColor)).append("\n");
    sb.append("    legendBackgroundColorSolid: ").append(toIndentedString(legendBackgroundColorSolid)).append("\n");
    sb.append("    plotOptions: ").append(toIndentedString(plotOptions)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

