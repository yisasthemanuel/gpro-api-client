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
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPtsSeriesInner;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPtsYAxis;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphRangeSelector;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphScrollbar;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphToolbar;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphTooltip;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphXAxis;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPts
 */

@JsonTypeName("StandingsResponse_dataGraphPts")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPts {

  private @Nullable StandingsResponseDataGraphChart chart;

  private @Nullable SnFHistoryResponseDataGraphAccessibility accessibility;

  private @Nullable StandingsResponseDataGraphPtsYAxis yAxis;

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
  private List<@Valid StandingsResponseDataGraphPtsSeriesInner> series = new ArrayList<>();

  public StandingsResponseDataGraphPts chart(@Nullable StandingsResponseDataGraphChart chart) {
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

  public StandingsResponseDataGraphPts accessibility(@Nullable SnFHistoryResponseDataGraphAccessibility accessibility) {
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

  public StandingsResponseDataGraphPts yAxis(@Nullable StandingsResponseDataGraphPtsYAxis yAxis) {
    this.yAxis = yAxis;
    return this;
  }

  /**
   * Get yAxis
   * @return yAxis
   */
  @Valid 
  @JsonProperty("yAxis")
  public @Nullable StandingsResponseDataGraphPtsYAxis getyAxis() {
    return yAxis;
  }

  public void setyAxis(@Nullable StandingsResponseDataGraphPtsYAxis yAxis) {
    this.yAxis = yAxis;
  }

  public StandingsResponseDataGraphPts xAxis(@Nullable StandingsResponseDataGraphXAxis xAxis) {
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

  public StandingsResponseDataGraphPts credits(@Nullable SnFHistoryResponseDataGraphAccessibility credits) {
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

  public StandingsResponseDataGraphPts labels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
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

  public StandingsResponseDataGraphPts scrollbar(@Nullable StandingsResponseDataGraphScrollbar scrollbar) {
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

  public StandingsResponseDataGraphPts navigation(@Nullable StandingsResponseDataGraphNavigation navigation) {
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

  public StandingsResponseDataGraphPts rangeSelector(@Nullable StandingsResponseDataGraphRangeSelector rangeSelector) {
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

  public StandingsResponseDataGraphPts navigator(@Nullable StandingsResponseDataGraphNavigator navigator) {
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

  public StandingsResponseDataGraphPts legend(@Nullable StandingsResponseDataGraphLegend legend) {
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

  public StandingsResponseDataGraphPts toolbar(@Nullable StandingsResponseDataGraphToolbar toolbar) {
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

  public StandingsResponseDataGraphPts dataLabelsColor(@Nullable String dataLabelsColor) {
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

  public StandingsResponseDataGraphPts textColor(@Nullable String textColor) {
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

  public StandingsResponseDataGraphPts maskColor(@Nullable String maskColor) {
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

  public StandingsResponseDataGraphPts legendBackgroundColor(@Nullable String legendBackgroundColor) {
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

  public StandingsResponseDataGraphPts legendBackgroundColorSolid(@Nullable String legendBackgroundColorSolid) {
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

  public StandingsResponseDataGraphPts plotOptions(@Nullable StandingsResponseDataGraphPlotOptions plotOptions) {
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

  public StandingsResponseDataGraphPts tooltip(@Nullable StandingsResponseDataGraphTooltip tooltip) {
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

  public StandingsResponseDataGraphPts title(@Nullable SnFHistoryResponseDataGraphTitle title) {
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

  public StandingsResponseDataGraphPts series(List<@Valid StandingsResponseDataGraphPtsSeriesInner> series) {
    this.series = series;
    return this;
  }

  public StandingsResponseDataGraphPts addSeriesItem(StandingsResponseDataGraphPtsSeriesInner seriesItem) {
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
  public List<@Valid StandingsResponseDataGraphPtsSeriesInner> getSeries() {
    return series;
  }

  public void setSeries(List<@Valid StandingsResponseDataGraphPtsSeriesInner> series) {
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
    StandingsResponseDataGraphPts standingsResponseDataGraphPts = (StandingsResponseDataGraphPts) o;
    return Objects.equals(this.chart, standingsResponseDataGraphPts.chart) &&
        Objects.equals(this.accessibility, standingsResponseDataGraphPts.accessibility) &&
        Objects.equals(this.yAxis, standingsResponseDataGraphPts.yAxis) &&
        Objects.equals(this.xAxis, standingsResponseDataGraphPts.xAxis) &&
        Objects.equals(this.credits, standingsResponseDataGraphPts.credits) &&
        Objects.equals(this.labels, standingsResponseDataGraphPts.labels) &&
        Objects.equals(this.scrollbar, standingsResponseDataGraphPts.scrollbar) &&
        Objects.equals(this.navigation, standingsResponseDataGraphPts.navigation) &&
        Objects.equals(this.rangeSelector, standingsResponseDataGraphPts.rangeSelector) &&
        Objects.equals(this.navigator, standingsResponseDataGraphPts.navigator) &&
        Objects.equals(this.legend, standingsResponseDataGraphPts.legend) &&
        Objects.equals(this.toolbar, standingsResponseDataGraphPts.toolbar) &&
        Objects.equals(this.dataLabelsColor, standingsResponseDataGraphPts.dataLabelsColor) &&
        Objects.equals(this.textColor, standingsResponseDataGraphPts.textColor) &&
        Objects.equals(this.maskColor, standingsResponseDataGraphPts.maskColor) &&
        Objects.equals(this.legendBackgroundColor, standingsResponseDataGraphPts.legendBackgroundColor) &&
        Objects.equals(this.legendBackgroundColorSolid, standingsResponseDataGraphPts.legendBackgroundColorSolid) &&
        Objects.equals(this.plotOptions, standingsResponseDataGraphPts.plotOptions) &&
        Objects.equals(this.tooltip, standingsResponseDataGraphPts.tooltip) &&
        Objects.equals(this.title, standingsResponseDataGraphPts.title) &&
        Objects.equals(this.series, standingsResponseDataGraphPts.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, accessibility, yAxis, xAxis, credits, labels, scrollbar, navigation, rangeSelector, navigator, legend, toolbar, dataLabelsColor, textColor, maskColor, legendBackgroundColor, legendBackgroundColorSolid, plotOptions, tooltip, title, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPts {\n");
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

