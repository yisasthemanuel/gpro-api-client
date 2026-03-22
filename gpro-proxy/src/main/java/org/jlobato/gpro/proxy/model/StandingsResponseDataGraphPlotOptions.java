package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsLine;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsLineMarker;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsSeries;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPlotOptionsSpline;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphPlotOptions
 */

@JsonTypeName("StandingsResponse_dataGraph_plotOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphPlotOptions {

  private @Nullable StandingsResponseDataGraphPlotOptionsLine line;

  private @Nullable StandingsResponseDataGraphPlotOptionsSpline spline;

  private @Nullable StandingsResponseDataGraphPlotOptionsSpline scatter;

  private @Nullable StandingsResponseDataGraphPlotOptionsLineMarker candlestick;

  private @Nullable StandingsResponseDataGraphPlotOptionsSeries series;

  public StandingsResponseDataGraphPlotOptions line(@Nullable StandingsResponseDataGraphPlotOptionsLine line) {
    this.line = line;
    return this;
  }

  /**
   * Get line
   * @return line
   */
  @Valid 
  @JsonProperty("line")
  public @Nullable StandingsResponseDataGraphPlotOptionsLine getLine() {
    return line;
  }

  public void setLine(@Nullable StandingsResponseDataGraphPlotOptionsLine line) {
    this.line = line;
  }

  public StandingsResponseDataGraphPlotOptions spline(@Nullable StandingsResponseDataGraphPlotOptionsSpline spline) {
    this.spline = spline;
    return this;
  }

  /**
   * Get spline
   * @return spline
   */
  @Valid 
  @JsonProperty("spline")
  public @Nullable StandingsResponseDataGraphPlotOptionsSpline getSpline() {
    return spline;
  }

  public void setSpline(@Nullable StandingsResponseDataGraphPlotOptionsSpline spline) {
    this.spline = spline;
  }

  public StandingsResponseDataGraphPlotOptions scatter(@Nullable StandingsResponseDataGraphPlotOptionsSpline scatter) {
    this.scatter = scatter;
    return this;
  }

  /**
   * Get scatter
   * @return scatter
   */
  @Valid 
  @JsonProperty("scatter")
  public @Nullable StandingsResponseDataGraphPlotOptionsSpline getScatter() {
    return scatter;
  }

  public void setScatter(@Nullable StandingsResponseDataGraphPlotOptionsSpline scatter) {
    this.scatter = scatter;
  }

  public StandingsResponseDataGraphPlotOptions candlestick(@Nullable StandingsResponseDataGraphPlotOptionsLineMarker candlestick) {
    this.candlestick = candlestick;
    return this;
  }

  /**
   * Get candlestick
   * @return candlestick
   */
  @Valid 
  @JsonProperty("candlestick")
  public @Nullable StandingsResponseDataGraphPlotOptionsLineMarker getCandlestick() {
    return candlestick;
  }

  public void setCandlestick(@Nullable StandingsResponseDataGraphPlotOptionsLineMarker candlestick) {
    this.candlestick = candlestick;
  }

  public StandingsResponseDataGraphPlotOptions series(@Nullable StandingsResponseDataGraphPlotOptionsSeries series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
   */
  @Valid 
  @JsonProperty("series")
  public @Nullable StandingsResponseDataGraphPlotOptionsSeries getSeries() {
    return series;
  }

  public void setSeries(@Nullable StandingsResponseDataGraphPlotOptionsSeries series) {
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
    StandingsResponseDataGraphPlotOptions standingsResponseDataGraphPlotOptions = (StandingsResponseDataGraphPlotOptions) o;
    return Objects.equals(this.line, standingsResponseDataGraphPlotOptions.line) &&
        Objects.equals(this.spline, standingsResponseDataGraphPlotOptions.spline) &&
        Objects.equals(this.scatter, standingsResponseDataGraphPlotOptions.scatter) &&
        Objects.equals(this.candlestick, standingsResponseDataGraphPlotOptions.candlestick) &&
        Objects.equals(this.series, standingsResponseDataGraphPlotOptions.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, spline, scatter, candlestick, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphPlotOptions {\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    spline: ").append(toIndentedString(spline)).append("\n");
    sb.append("    scatter: ").append(toIndentedString(scatter)).append("\n");
    sb.append("    candlestick: ").append(toIndentedString(candlestick)).append("\n");
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

