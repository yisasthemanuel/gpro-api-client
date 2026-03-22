package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitleStyle;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsLineMarker;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPlotOptionsLine
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions_line")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptionsLine {

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle dataLabels;

  private @Nullable StandingsResponseDataGraphPlotOptionsLineMarker marker;

  public StandingsResponseDataGraphPlotOptionsLine dataLabels(@Nullable SnFHistoryResponseDataGraphSubtitleStyle dataLabels) {
    this.dataLabels = dataLabels;
    return this;
  }

  /**
   * Get dataLabels
   * @return dataLabels
   */
  @Valid 
  @JsonProperty("dataLabels")
  public @Nullable SnFHistoryResponseDataGraphSubtitleStyle getDataLabels() {
    return dataLabels;
  }

  public void setDataLabels(@Nullable SnFHistoryResponseDataGraphSubtitleStyle dataLabels) {
    this.dataLabels = dataLabels;
  }

  public StandingsResponseDataGraphPlotOptionsLine marker(@Nullable StandingsResponseDataGraphPlotOptionsLineMarker marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
   */
  @Valid 
  @JsonProperty("marker")
  public @Nullable StandingsResponseDataGraphPlotOptionsLineMarker getMarker() {
    return marker;
  }

  public void setMarker(@Nullable StandingsResponseDataGraphPlotOptionsLineMarker marker) {
    this.marker = marker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphPlotOptionsLine standingsResponseDataGraphPlotOptionsLine = (StandingsResponseDataGraphPlotOptionsLine) o;
    return Objects.equals(this.dataLabels, standingsResponseDataGraphPlotOptionsLine.dataLabels) &&
        Objects.equals(this.marker, standingsResponseDataGraphPlotOptionsLine.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataLabels, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptionsLine {\n");
    sb.append("    dataLabels: ").append(toIndentedString(dataLabels)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

