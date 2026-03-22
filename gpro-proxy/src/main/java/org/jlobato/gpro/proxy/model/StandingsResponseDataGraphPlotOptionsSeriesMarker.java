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
 * StandingsResponseDataGraphPlotOptionsSeriesMarker
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions_series_marker")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptionsSeriesMarker {

  private @Nullable String symbol;

  private @Nullable Integer radius;

  public StandingsResponseDataGraphPlotOptionsSeriesMarker symbol(@Nullable String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
   */
  
  @JsonProperty("symbol")
  public @Nullable String getSymbol() {
    return symbol;
  }

  public void setSymbol(@Nullable String symbol) {
    this.symbol = symbol;
  }

  public StandingsResponseDataGraphPlotOptionsSeriesMarker radius(@Nullable Integer radius) {
    this.radius = radius;
    return this;
  }

  /**
   * Get radius
   * @return radius
   */
  
  @JsonProperty("radius")
  public @Nullable Integer getRadius() {
    return radius;
  }

  public void setRadius(@Nullable Integer radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphPlotOptionsSeriesMarker standingsResponseDataGraphPlotOptionsSeriesMarker = (StandingsResponseDataGraphPlotOptionsSeriesMarker) o;
    return Objects.equals(this.symbol, standingsResponseDataGraphPlotOptionsSeriesMarker.symbol) &&
        Objects.equals(this.radius, standingsResponseDataGraphPlotOptionsSeriesMarker.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptionsSeriesMarker {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
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

