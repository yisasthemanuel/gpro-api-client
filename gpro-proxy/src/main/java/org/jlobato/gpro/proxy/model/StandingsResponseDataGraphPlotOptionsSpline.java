package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsLineMarker;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPlotOptionsSpline
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions_spline")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptionsSpline {

  private @Nullable StandingsResponseDataGraphPlotOptionsLineMarker marker;

  public StandingsResponseDataGraphPlotOptionsSpline marker(@Nullable StandingsResponseDataGraphPlotOptionsLineMarker marker) {
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
    StandingsResponseDataGraphPlotOptionsSpline standingsResponseDataGraphPlotOptionsSpline = (StandingsResponseDataGraphPlotOptionsSpline) o;
    return Objects.equals(this.marker, standingsResponseDataGraphPlotOptionsSpline.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptionsSpline {\n");
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

