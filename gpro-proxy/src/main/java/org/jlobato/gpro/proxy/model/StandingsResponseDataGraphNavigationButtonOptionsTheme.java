package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphScrollbarBarBackgroundColor;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphNavigationButtonOptionsTheme
 */

@JsonTypeName("StandingsResponse_dataGraph_navigation_buttonOptions_theme")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphNavigationButtonOptionsTheme {

  private @Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor fill;

  private @Nullable String stroke;

  public StandingsResponseDataGraphNavigationButtonOptionsTheme fill(@Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor fill) {
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

  public StandingsResponseDataGraphNavigationButtonOptionsTheme stroke(@Nullable String stroke) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphNavigationButtonOptionsTheme standingsResponseDataGraphNavigationButtonOptionsTheme = (StandingsResponseDataGraphNavigationButtonOptionsTheme) o;
    return Objects.equals(this.fill, standingsResponseDataGraphNavigationButtonOptionsTheme.fill) &&
        Objects.equals(this.stroke, standingsResponseDataGraphNavigationButtonOptionsTheme.stroke);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fill, stroke);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphNavigationButtonOptionsTheme {\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    stroke: ").append(toIndentedString(stroke)).append("\n");
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

