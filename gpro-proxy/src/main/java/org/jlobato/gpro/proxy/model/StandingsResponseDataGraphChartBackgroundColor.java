package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphChartBackgroundColorLinearGradient;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphChartBackgroundColor
 */

@JsonTypeName("StandingsResponse_dataGraph_chart_backgroundColor")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphChartBackgroundColor {

  private @Nullable StandingsResponseDataGraphChartBackgroundColorLinearGradient linearGradient;

  @Valid
  private List<List<Integer>> stops = new ArrayList<>();

  public StandingsResponseDataGraphChartBackgroundColor linearGradient(@Nullable StandingsResponseDataGraphChartBackgroundColorLinearGradient linearGradient) {
    this.linearGradient = linearGradient;
    return this;
  }

  /**
   * Get linearGradient
   * @return linearGradient
   */
  @Valid 
  @JsonProperty("linearGradient")
  public @Nullable StandingsResponseDataGraphChartBackgroundColorLinearGradient getLinearGradient() {
    return linearGradient;
  }

  public void setLinearGradient(@Nullable StandingsResponseDataGraphChartBackgroundColorLinearGradient linearGradient) {
    this.linearGradient = linearGradient;
  }

  public StandingsResponseDataGraphChartBackgroundColor stops(List<List<Integer>> stops) {
    this.stops = stops;
    return this;
  }

  public StandingsResponseDataGraphChartBackgroundColor addStopsItem(List<Integer> stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<>();
    }
    this.stops.add(stopsItem);
    return this;
  }

  /**
   * Get stops
   * @return stops
   */
  @Valid 
  @JsonProperty("stops")
  public List<List<Integer>> getStops() {
    return stops;
  }

  public void setStops(List<List<Integer>> stops) {
    this.stops = stops;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphChartBackgroundColor standingsResponseDataGraphChartBackgroundColor = (StandingsResponseDataGraphChartBackgroundColor) o;
    return Objects.equals(this.linearGradient, standingsResponseDataGraphChartBackgroundColor.linearGradient) &&
        Objects.equals(this.stops, standingsResponseDataGraphChartBackgroundColor.stops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linearGradient, stops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphChartBackgroundColor {\n");
    sb.append("    linearGradient: ").append(toIndentedString(linearGradient)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
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

