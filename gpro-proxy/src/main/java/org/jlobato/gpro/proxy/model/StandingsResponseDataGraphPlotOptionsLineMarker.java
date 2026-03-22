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
 * StandingsResponseDataGraphPlotOptionsLineMarker
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions_line_marker")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptionsLineMarker {

  private @Nullable String lineColor;

  public StandingsResponseDataGraphPlotOptionsLineMarker lineColor(@Nullable String lineColor) {
    this.lineColor = lineColor;
    return this;
  }

  /**
   * Get lineColor
   * @return lineColor
   */
  
  @JsonProperty("lineColor")
  public @Nullable String getLineColor() {
    return lineColor;
  }

  public void setLineColor(@Nullable String lineColor) {
    this.lineColor = lineColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphPlotOptionsLineMarker standingsResponseDataGraphPlotOptionsLineMarker = (StandingsResponseDataGraphPlotOptionsLineMarker) o;
    return Objects.equals(this.lineColor, standingsResponseDataGraphPlotOptionsLineMarker.lineColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptionsLineMarker {\n");
    sb.append("    lineColor: ").append(toIndentedString(lineColor)).append("\n");
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

