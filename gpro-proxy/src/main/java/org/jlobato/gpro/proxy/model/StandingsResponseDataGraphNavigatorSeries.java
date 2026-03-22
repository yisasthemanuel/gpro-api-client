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
 * StandingsResponseDataGraphNavigatorSeries
 */

@JsonTypeName("StandingsResponse_dataGraph_navigator_series")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphNavigatorSeries {

  private @Nullable String color;

  private @Nullable String lineColor;

  public StandingsResponseDataGraphNavigatorSeries color(@Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  
  @JsonProperty("color")
  public @Nullable String getColor() {
    return color;
  }

  public void setColor(@Nullable String color) {
    this.color = color;
  }

  public StandingsResponseDataGraphNavigatorSeries lineColor(@Nullable String lineColor) {
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
    StandingsResponseDataGraphNavigatorSeries standingsResponseDataGraphNavigatorSeries = (StandingsResponseDataGraphNavigatorSeries) o;
    return Objects.equals(this.color, standingsResponseDataGraphNavigatorSeries.color) &&
        Objects.equals(this.lineColor, standingsResponseDataGraphNavigatorSeries.lineColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, lineColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphNavigatorSeries {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

