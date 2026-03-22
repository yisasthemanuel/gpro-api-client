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
 * StandingsResponseDataGraphChartBackgroundColorLinearGradient
 */

@JsonTypeName("StandingsResponse_dataGraph_chart_backgroundColor_linearGradient")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphChartBackgroundColorLinearGradient {

  private @Nullable Integer x1;

  private @Nullable Integer y1;

  private @Nullable Integer x2;

  private @Nullable Integer y2;

  public StandingsResponseDataGraphChartBackgroundColorLinearGradient x1(@Nullable Integer x1) {
    this.x1 = x1;
    return this;
  }

  /**
   * Get x1
   * @return x1
   */
  
  @JsonProperty("x1")
  public @Nullable Integer getX1() {
    return x1;
  }

  public void setX1(@Nullable Integer x1) {
    this.x1 = x1;
  }

  public StandingsResponseDataGraphChartBackgroundColorLinearGradient y1(@Nullable Integer y1) {
    this.y1 = y1;
    return this;
  }

  /**
   * Get y1
   * @return y1
   */
  
  @JsonProperty("y1")
  public @Nullable Integer getY1() {
    return y1;
  }

  public void setY1(@Nullable Integer y1) {
    this.y1 = y1;
  }

  public StandingsResponseDataGraphChartBackgroundColorLinearGradient x2(@Nullable Integer x2) {
    this.x2 = x2;
    return this;
  }

  /**
   * Get x2
   * @return x2
   */
  
  @JsonProperty("x2")
  public @Nullable Integer getX2() {
    return x2;
  }

  public void setX2(@Nullable Integer x2) {
    this.x2 = x2;
  }

  public StandingsResponseDataGraphChartBackgroundColorLinearGradient y2(@Nullable Integer y2) {
    this.y2 = y2;
    return this;
  }

  /**
   * Get y2
   * @return y2
   */
  
  @JsonProperty("y2")
  public @Nullable Integer getY2() {
    return y2;
  }

  public void setY2(@Nullable Integer y2) {
    this.y2 = y2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphChartBackgroundColorLinearGradient standingsResponseDataGraphChartBackgroundColorLinearGradient = (StandingsResponseDataGraphChartBackgroundColorLinearGradient) o;
    return Objects.equals(this.x1, standingsResponseDataGraphChartBackgroundColorLinearGradient.x1) &&
        Objects.equals(this.y1, standingsResponseDataGraphChartBackgroundColorLinearGradient.y1) &&
        Objects.equals(this.x2, standingsResponseDataGraphChartBackgroundColorLinearGradient.x2) &&
        Objects.equals(this.y2, standingsResponseDataGraphChartBackgroundColorLinearGradient.y2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x1, y1, x2, y2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphChartBackgroundColorLinearGradient {\n");
    sb.append("    x1: ").append(toIndentedString(x1)).append("\n");
    sb.append("    y1: ").append(toIndentedString(y1)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
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

