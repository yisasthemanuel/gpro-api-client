package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphRangeSelectorButtonThemeStates
 */

@JsonTypeName("StandingsResponse_dataGraph_rangeSelector_buttonTheme_states")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphRangeSelectorButtonThemeStates {

  private @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover hover;

  private @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover select;

  public StandingsResponseDataGraphRangeSelectorButtonThemeStates hover(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover hover) {
    this.hover = hover;
    return this;
  }

  /**
   * Get hover
   * @return hover
   */
  @Valid 
  @JsonProperty("hover")
  public @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover getHover() {
    return hover;
  }

  public void setHover(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover hover) {
    this.hover = hover;
  }

  public StandingsResponseDataGraphRangeSelectorButtonThemeStates select(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover select) {
    this.select = select;
    return this;
  }

  /**
   * Get select
   * @return select
   */
  @Valid 
  @JsonProperty("select")
  public @Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover getSelect() {
    return select;
  }

  public void setSelect(@Nullable StandingsResponseDataGraphRangeSelectorButtonThemeStatesHover select) {
    this.select = select;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphRangeSelectorButtonThemeStates standingsResponseDataGraphRangeSelectorButtonThemeStates = (StandingsResponseDataGraphRangeSelectorButtonThemeStates) o;
    return Objects.equals(this.hover, standingsResponseDataGraphRangeSelectorButtonThemeStates.hover) &&
        Objects.equals(this.select, standingsResponseDataGraphRangeSelectorButtonThemeStates.select);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hover, select);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphRangeSelectorButtonThemeStates {\n");
    sb.append("    hover: ").append(toIndentedString(hover)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
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

