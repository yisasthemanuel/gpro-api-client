package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphNavigatorHandles;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphNavigatorSeries;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphNavigator
 */

@JsonTypeName("StandingsResponse_dataGraph_navigator")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphNavigator {

  private @Nullable StandingsResponseDataGraphNavigatorHandles handles;

  private @Nullable String outlineColor;

  private @Nullable String maskFill;

  private @Nullable StandingsResponseDataGraphNavigatorSeries series;

  public StandingsResponseDataGraphNavigator handles(@Nullable StandingsResponseDataGraphNavigatorHandles handles) {
    this.handles = handles;
    return this;
  }

  /**
   * Get handles
   * @return handles
   */
  @Valid 
  @JsonProperty("handles")
  public @Nullable StandingsResponseDataGraphNavigatorHandles getHandles() {
    return handles;
  }

  public void setHandles(@Nullable StandingsResponseDataGraphNavigatorHandles handles) {
    this.handles = handles;
  }

  public StandingsResponseDataGraphNavigator outlineColor(@Nullable String outlineColor) {
    this.outlineColor = outlineColor;
    return this;
  }

  /**
   * Get outlineColor
   * @return outlineColor
   */
  
  @JsonProperty("outlineColor")
  public @Nullable String getOutlineColor() {
    return outlineColor;
  }

  public void setOutlineColor(@Nullable String outlineColor) {
    this.outlineColor = outlineColor;
  }

  public StandingsResponseDataGraphNavigator maskFill(@Nullable String maskFill) {
    this.maskFill = maskFill;
    return this;
  }

  /**
   * Get maskFill
   * @return maskFill
   */
  
  @JsonProperty("maskFill")
  public @Nullable String getMaskFill() {
    return maskFill;
  }

  public void setMaskFill(@Nullable String maskFill) {
    this.maskFill = maskFill;
  }

  public StandingsResponseDataGraphNavigator series(@Nullable StandingsResponseDataGraphNavigatorSeries series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
   */
  @Valid 
  @JsonProperty("series")
  public @Nullable StandingsResponseDataGraphNavigatorSeries getSeries() {
    return series;
  }

  public void setSeries(@Nullable StandingsResponseDataGraphNavigatorSeries series) {
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
    StandingsResponseDataGraphNavigator standingsResponseDataGraphNavigator = (StandingsResponseDataGraphNavigator) o;
    return Objects.equals(this.handles, standingsResponseDataGraphNavigator.handles) &&
        Objects.equals(this.outlineColor, standingsResponseDataGraphNavigator.outlineColor) &&
        Objects.equals(this.maskFill, standingsResponseDataGraphNavigator.maskFill) &&
        Objects.equals(this.series, standingsResponseDataGraphNavigator.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handles, outlineColor, maskFill, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphNavigator {\n");
    sb.append("    handles: ").append(toIndentedString(handles)).append("\n");
    sb.append("    outlineColor: ").append(toIndentedString(outlineColor)).append("\n");
    sb.append("    maskFill: ").append(toIndentedString(maskFill)).append("\n");
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

