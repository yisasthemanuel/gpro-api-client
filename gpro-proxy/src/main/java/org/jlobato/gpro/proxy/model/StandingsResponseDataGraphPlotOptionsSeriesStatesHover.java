package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPlotOptionsSeriesStatesHover
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions_series_states_hover")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptionsSeriesStatesHover {

  private @Nullable Integer lineWidthPlus;

  public StandingsResponseDataGraphPlotOptionsSeriesStatesHover lineWidthPlus(@Nullable Integer lineWidthPlus) {
    this.lineWidthPlus = lineWidthPlus;
    return this;
  }

  /**
   * Get lineWidthPlus
   * @return lineWidthPlus
   */
  
  @JsonProperty("lineWidthPlus")
  public @Nullable Integer getLineWidthPlus() {
    return lineWidthPlus;
  }

  public void setLineWidthPlus(@Nullable Integer lineWidthPlus) {
    this.lineWidthPlus = lineWidthPlus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphPlotOptionsSeriesStatesHover standingsResponseDataGraphPlotOptionsSeriesStatesHover = (StandingsResponseDataGraphPlotOptionsSeriesStatesHover) o;
    return Objects.equals(this.lineWidthPlus, standingsResponseDataGraphPlotOptionsSeriesStatesHover.lineWidthPlus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineWidthPlus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptionsSeriesStatesHover {\n");
    sb.append("    lineWidthPlus: ").append(toIndentedString(lineWidthPlus)).append("\n");
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

