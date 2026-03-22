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
 * StandingsResponseDataGraphChartScrollablePlotArea
 */

@JsonTypeName("StandingsResponse_dataGraph_chart_scrollablePlotArea")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphChartScrollablePlotArea {

  private @Nullable Integer scrollPositionX;

  private @Nullable Integer minWidth;

  public StandingsResponseDataGraphChartScrollablePlotArea scrollPositionX(@Nullable Integer scrollPositionX) {
    this.scrollPositionX = scrollPositionX;
    return this;
  }

  /**
   * Get scrollPositionX
   * @return scrollPositionX
   */
  
  @JsonProperty("scrollPositionX")
  public @Nullable Integer getScrollPositionX() {
    return scrollPositionX;
  }

  public void setScrollPositionX(@Nullable Integer scrollPositionX) {
    this.scrollPositionX = scrollPositionX;
  }

  public StandingsResponseDataGraphChartScrollablePlotArea minWidth(@Nullable Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

  /**
   * Get minWidth
   * @return minWidth
   */
  
  @JsonProperty("minWidth")
  public @Nullable Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(@Nullable Integer minWidth) {
    this.minWidth = minWidth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphChartScrollablePlotArea standingsResponseDataGraphChartScrollablePlotArea = (StandingsResponseDataGraphChartScrollablePlotArea) o;
    return Objects.equals(this.scrollPositionX, standingsResponseDataGraphChartScrollablePlotArea.scrollPositionX) &&
        Objects.equals(this.minWidth, standingsResponseDataGraphChartScrollablePlotArea.minWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollPositionX, minWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphChartScrollablePlotArea {\n");
    sb.append("    scrollPositionX: ").append(toIndentedString(scrollPositionX)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
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

