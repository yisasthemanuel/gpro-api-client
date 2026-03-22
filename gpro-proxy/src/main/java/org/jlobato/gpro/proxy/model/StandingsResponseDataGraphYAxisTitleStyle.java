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
 * StandingsResponseDataGraphYAxisTitleStyle
 */

@JsonTypeName("StandingsResponse_dataGraph_yAxis_title_style")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphYAxisTitleStyle {

  private @Nullable String color;

  private @Nullable String fontWeight;

  private @Nullable String fontSize;

  private @Nullable String fontFamily;

  public StandingsResponseDataGraphYAxisTitleStyle color(@Nullable String color) {
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

  public StandingsResponseDataGraphYAxisTitleStyle fontWeight(@Nullable String fontWeight) {
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

  public StandingsResponseDataGraphYAxisTitleStyle fontSize(@Nullable String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * Get fontSize
   * @return fontSize
   */
  
  @JsonProperty("fontSize")
  public @Nullable String getFontSize() {
    return fontSize;
  }

  public void setFontSize(@Nullable String fontSize) {
    this.fontSize = fontSize;
  }

  public StandingsResponseDataGraphYAxisTitleStyle fontFamily(@Nullable String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

  /**
   * Get fontFamily
   * @return fontFamily
   */
  
  @JsonProperty("fontFamily")
  public @Nullable String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(@Nullable String fontFamily) {
    this.fontFamily = fontFamily;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphYAxisTitleStyle standingsResponseDataGraphYAxisTitleStyle = (StandingsResponseDataGraphYAxisTitleStyle) o;
    return Objects.equals(this.color, standingsResponseDataGraphYAxisTitleStyle.color) &&
        Objects.equals(this.fontWeight, standingsResponseDataGraphYAxisTitleStyle.fontWeight) &&
        Objects.equals(this.fontSize, standingsResponseDataGraphYAxisTitleStyle.fontSize) &&
        Objects.equals(this.fontFamily, standingsResponseDataGraphYAxisTitleStyle.fontFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, fontWeight, fontSize, fontFamily);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphYAxisTitleStyle {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontWeight: ").append(toIndentedString(fontWeight)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
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

