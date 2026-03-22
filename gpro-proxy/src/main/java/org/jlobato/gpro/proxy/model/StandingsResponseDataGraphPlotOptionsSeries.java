package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsSeriesMarker;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsSeriesStates;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPlotOptionsSeries
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions_series")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptionsSeries {

  private @Nullable Integer pointStart;

  private @Nullable StandingsResponseDataGraphPlotOptionsSeriesMarker marker;

  private @Nullable StandingsResponseDataGraphPlotOptionsSeriesStates states;

  public StandingsResponseDataGraphPlotOptionsSeries pointStart(@Nullable Integer pointStart) {
    this.pointStart = pointStart;
    return this;
  }

  /**
   * Get pointStart
   * @return pointStart
   */
  
  @JsonProperty("pointStart")
  public @Nullable Integer getPointStart() {
    return pointStart;
  }

  public void setPointStart(@Nullable Integer pointStart) {
    this.pointStart = pointStart;
  }

  public StandingsResponseDataGraphPlotOptionsSeries marker(@Nullable StandingsResponseDataGraphPlotOptionsSeriesMarker marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
   */
  @Valid 
  @JsonProperty("marker")
  public @Nullable StandingsResponseDataGraphPlotOptionsSeriesMarker getMarker() {
    return marker;
  }

  public void setMarker(@Nullable StandingsResponseDataGraphPlotOptionsSeriesMarker marker) {
    this.marker = marker;
  }

  public StandingsResponseDataGraphPlotOptionsSeries states(@Nullable StandingsResponseDataGraphPlotOptionsSeriesStates states) {
    this.states = states;
    return this;
  }

  /**
   * Get states
   * @return states
   */
  @Valid 
  @JsonProperty("states")
  public @Nullable StandingsResponseDataGraphPlotOptionsSeriesStates getStates() {
    return states;
  }

  public void setStates(@Nullable StandingsResponseDataGraphPlotOptionsSeriesStates states) {
    this.states = states;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphPlotOptionsSeries standingsResponseDataGraphPlotOptionsSeries = (StandingsResponseDataGraphPlotOptionsSeries) o;
    return Objects.equals(this.pointStart, standingsResponseDataGraphPlotOptionsSeries.pointStart) &&
        Objects.equals(this.marker, standingsResponseDataGraphPlotOptionsSeries.marker) &&
        Objects.equals(this.states, standingsResponseDataGraphPlotOptionsSeries.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointStart, marker, states);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptionsSeries {\n");
    sb.append("    pointStart: ").append(toIndentedString(pointStart)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

