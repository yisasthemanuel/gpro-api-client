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
 * StandingsResponseDataGraphRangeSelectorButtonThemeStyle
 */

@JsonTypeName("StandingsResponse_dataGraph_rangeSelector_buttonTheme_style")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphRangeSelectorButtonThemeStyle {

  private @Nullable String color;

  private @Nullable String fontWeight;

  public StandingsResponseDataGraphRangeSelectorButtonThemeStyle color(@Nullable String color) {
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

  public StandingsResponseDataGraphRangeSelectorButtonThemeStyle fontWeight(@Nullable String fontWeight) {
    this.fontWeight = fontWeight;
    return this;
  }

  /**
   * Get fontWeight
   * @return fontWeight
   */
  
  @JsonProperty("fontWeight")
  public @Nullable String getFontWeight() {
    return fontWeight;
  }

  public void setFontWeight(@Nullable String fontWeight) {
    this.fontWeight = fontWeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphRangeSelectorButtonThemeStyle standingsResponseDataGraphRangeSelectorButtonThemeStyle = (StandingsResponseDataGraphRangeSelectorButtonThemeStyle) o;
    return Objects.equals(this.color, standingsResponseDataGraphRangeSelectorButtonThemeStyle.color) &&
        Objects.equals(this.fontWeight, standingsResponseDataGraphRangeSelectorButtonThemeStyle.fontWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, fontWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphRangeSelectorButtonThemeStyle {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontWeight: ").append(toIndentedString(fontWeight)).append("\n");
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

