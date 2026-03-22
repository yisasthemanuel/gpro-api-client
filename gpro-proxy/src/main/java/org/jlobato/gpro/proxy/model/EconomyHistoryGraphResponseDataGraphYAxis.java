package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.EconomyHistoryGraphResponseDataGraphYAxisLabels;
import org.jlobato.gpro.proxy.model.EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphTitle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryGraphResponseDataGraphYAxis
 */

@JsonTypeName("EconomyHistoryGraphResponse_dataGraph_yAxis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryGraphResponseDataGraphYAxis {

  private @Nullable SnFHistoryResponseDataGraphTitle title;

  private @Nullable EconomyHistoryGraphResponseDataGraphYAxisLabels labels;

  @Valid
  private List<@Valid EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner> plotLines = new ArrayList<>();

  public EconomyHistoryGraphResponseDataGraphYAxis title(@Nullable SnFHistoryResponseDataGraphTitle title) {
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

  public EconomyHistoryGraphResponseDataGraphYAxis labels(@Nullable EconomyHistoryGraphResponseDataGraphYAxisLabels labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @Valid 
  @JsonProperty("labels")
  public @Nullable EconomyHistoryGraphResponseDataGraphYAxisLabels getLabels() {
    return labels;
  }

  public void setLabels(@Nullable EconomyHistoryGraphResponseDataGraphYAxisLabels labels) {
    this.labels = labels;
  }

  public EconomyHistoryGraphResponseDataGraphYAxis plotLines(List<@Valid EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner> plotLines) {
    this.plotLines = plotLines;
    return this;
  }

  public EconomyHistoryGraphResponseDataGraphYAxis addPlotLinesItem(EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner plotLinesItem) {
    if (this.plotLines == null) {
      this.plotLines = new ArrayList<>();
    }
    this.plotLines.add(plotLinesItem);
    return this;
  }

  /**
   * Get plotLines
   * @return plotLines
   */
  @Valid 
  @JsonProperty("plotLines")
  public List<@Valid EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner> getPlotLines() {
    return plotLines;
  }

  public void setPlotLines(List<@Valid EconomyHistoryGraphResponseDataGraphYAxisPlotLinesInner> plotLines) {
    this.plotLines = plotLines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryGraphResponseDataGraphYAxis economyHistoryGraphResponseDataGraphYAxis = (EconomyHistoryGraphResponseDataGraphYAxis) o;
    return Objects.equals(this.title, economyHistoryGraphResponseDataGraphYAxis.title) &&
        Objects.equals(this.labels, economyHistoryGraphResponseDataGraphYAxis.labels) &&
        Objects.equals(this.plotLines, economyHistoryGraphResponseDataGraphYAxis.plotLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, labels, plotLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryGraphResponseDataGraphYAxis {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    plotLines: ").append(toIndentedString(plotLines)).append("\n");
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

