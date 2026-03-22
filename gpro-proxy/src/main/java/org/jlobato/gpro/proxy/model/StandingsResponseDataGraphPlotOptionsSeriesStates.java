package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsSeriesStatesHover;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPlotOptionsSeriesStates
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions_series_states")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptionsSeriesStates {

  private @Nullable StandingsResponseDataGraphPlotOptionsSeriesStatesHover hover;

  public StandingsResponseDataGraphPlotOptionsSeriesStates hover(@Nullable StandingsResponseDataGraphPlotOptionsSeriesStatesHover hover) {
    this.hover = hover;
    return this;
  }

  /**
   * Get hover
   * @return hover
   */
  @Valid 
  @JsonProperty("hover")
  public @Nullable StandingsResponseDataGraphPlotOptionsSeriesStatesHover getHover() {
    return hover;
  }

  public void setHover(@Nullable StandingsResponseDataGraphPlotOptionsSeriesStatesHover hover) {
    this.hover = hover;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphPlotOptionsSeriesStates standingsResponseDataGraphPlotOptionsSeriesStates = (StandingsResponseDataGraphPlotOptionsSeriesStates) o;
    return Objects.equals(this.hover, standingsResponseDataGraphPlotOptionsSeriesStates.hover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptionsSeriesStates {\n");
    sb.append("    hover: ").append(toIndentedString(hover)).append("\n");
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

