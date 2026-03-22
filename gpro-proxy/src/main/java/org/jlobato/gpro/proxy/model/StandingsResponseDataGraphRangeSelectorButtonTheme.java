package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphRangeSelectorButtonThemeStates;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphRangeSelectorButtonThemeStyle;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphScrollbarBarBackgroundColor;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphRangeSelectorButtonTheme
 */

@JsonTypeName("StandingsResponse_dataGraph_rangeSelector_buttonTheme")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphRangeSelectorButtonTheme {

  private @Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor fill;

  private @Nullable String stroke;

  private @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStyle style;

  private @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStates states;

  public StandingsResponseDataGraphRangeSelectorButtonTheme fill(@Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor fill) {
    this.fill = fill;
    return this;
  }

  /**
   * Get fill
   * @return fill
   */
  @Valid 
  @JsonProperty("fill")
  public @Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor getFill() {
    return fill;
  }

  public void setFill(@Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor fill) {
    this.fill = fill;
  }

  public StandingsResponseDataGraphRangeSelectorButtonTheme stroke(@Nullable String stroke) {
    this.stroke = stroke;
    return this;
  }

  /**
   * Get stroke
   * @return stroke
   */
  
  @JsonProperty("stroke")
  public @Nullable String getStroke() {
    return stroke;
  }

  public void setStroke(@Nullable String stroke) {
    this.stroke = stroke;
  }

  public StandingsResponseDataGraphRangeSelectorButtonTheme style(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @Valid 
  @JsonProperty("style")
  public @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStyle getStyle() {
    return style;
  }

  public void setStyle(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStyle style) {
    this.style = style;
  }

  public StandingsResponseDataGraphRangeSelectorButtonTheme states(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStates states) {
    this.states = states;
    return this;
  }

  /**
   * Get states
   * @return states
   */
  @Valid 
  @JsonProperty("states")
  public @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStates getStates() {
    return states;
  }

  public void setStates(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStates states) {
    this.states = states;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphRangeSelectorButtonTheme standingsResponseDataGraphRangeSelectorButtonTheme = (StandingsResponseDataGraphRangeSelectorButtonTheme) o;
    return Objects.equals(this.fill, standingsResponseDataGraphRangeSelectorButtonTheme.fill) &&
        Objects.equals(this.stroke, standingsResponseDataGraphRangeSelectorButtonTheme.stroke) &&
        Objects.equals(this.style, standingsResponseDataGraphRangeSelectorButtonTheme.style) &&
        Objects.equals(this.states, standingsResponseDataGraphRangeSelectorButtonTheme.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fill, stroke, style, states);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphRangeSelectorButtonTheme {\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    stroke: ").append(toIndentedString(stroke)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

