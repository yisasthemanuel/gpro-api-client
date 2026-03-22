package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphChartBackgroundColor;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphScrollbarBarBackgroundColor;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphScrollbar
 */

@JsonTypeName("StandingsResponse_dataGraph_scrollbar")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphScrollbar {

  private @Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor barBackgroundColor;

  private @Nullable String barBorderColor;

  private @Nullable String buttonArrowColor;

  private @Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor buttonBackgroundColor;

  private @Nullable String buttonBorderColor;

  private @Nullable String rifleColor;

  private @Nullable StandingsResponseDataGraphChartBackgroundColor trackBackgroundColor;

  private @Nullable String trackBorderColor;

  public StandingsResponseDataGraphScrollbar barBackgroundColor(@Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor barBackgroundColor) {
    this.barBackgroundColor = barBackgroundColor;
    return this;
  }

  /**
   * Get barBackgroundColor
   * @return barBackgroundColor
   */
  @Valid 
  @JsonProperty("barBackgroundColor")
  public @Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor getBarBackgroundColor() {
    return barBackgroundColor;
  }

  public void setBarBackgroundColor(@Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor barBackgroundColor) {
    this.barBackgroundColor = barBackgroundColor;
  }

  public StandingsResponseDataGraphScrollbar barBorderColor(@Nullable String barBorderColor) {
    this.barBorderColor = barBorderColor;
    return this;
  }

  /**
   * Get barBorderColor
   * @return barBorderColor
   */
  
  @JsonProperty("barBorderColor")
  public @Nullable String getBarBorderColor() {
    return barBorderColor;
  }

  public void setBarBorderColor(@Nullable String barBorderColor) {
    this.barBorderColor = barBorderColor;
  }

  public StandingsResponseDataGraphScrollbar buttonArrowColor(@Nullable String buttonArrowColor) {
    this.buttonArrowColor = buttonArrowColor;
    return this;
  }

  /**
   * Get buttonArrowColor
   * @return buttonArrowColor
   */
  
  @JsonProperty("buttonArrowColor")
  public @Nullable String getButtonArrowColor() {
    return buttonArrowColor;
  }

  public void setButtonArrowColor(@Nullable String buttonArrowColor) {
    this.buttonArrowColor = buttonArrowColor;
  }

  public StandingsResponseDataGraphScrollbar buttonBackgroundColor(@Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor buttonBackgroundColor) {
    this.buttonBackgroundColor = buttonBackgroundColor;
    return this;
  }

  /**
   * Get buttonBackgroundColor
   * @return buttonBackgroundColor
   */
  @Valid 
  @JsonProperty("buttonBackgroundColor")
  public @Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor getButtonBackgroundColor() {
    return buttonBackgroundColor;
  }

  public void setButtonBackgroundColor(@Nullable StandingsResponseDataGraphScrollbarBarBackgroundColor buttonBackgroundColor) {
    this.buttonBackgroundColor = buttonBackgroundColor;
  }

  public StandingsResponseDataGraphScrollbar buttonBorderColor(@Nullable String buttonBorderColor) {
    this.buttonBorderColor = buttonBorderColor;
    return this;
  }

  /**
   * Get buttonBorderColor
   * @return buttonBorderColor
   */
  
  @JsonProperty("buttonBorderColor")
  public @Nullable String getButtonBorderColor() {
    return buttonBorderColor;
  }

  public void setButtonBorderColor(@Nullable String buttonBorderColor) {
    this.buttonBorderColor = buttonBorderColor;
  }

  public StandingsResponseDataGraphScrollbar rifleColor(@Nullable String rifleColor) {
    this.rifleColor = rifleColor;
    return this;
  }

  /**
   * Get rifleColor
   * @return rifleColor
   */
  
  @JsonProperty("rifleColor")
  public @Nullable String getRifleColor() {
    return rifleColor;
  }

  public void setRifleColor(@Nullable String rifleColor) {
    this.rifleColor = rifleColor;
  }

  public StandingsResponseDataGraphScrollbar trackBackgroundColor(@Nullable StandingsResponseDataGraphChartBackgroundColor trackBackgroundColor) {
    this.trackBackgroundColor = trackBackgroundColor;
    return this;
  }

  /**
   * Get trackBackgroundColor
   * @return trackBackgroundColor
   */
  @Valid 
  @JsonProperty("trackBackgroundColor")
  public @Nullable StandingsResponseDataGraphChartBackgroundColor getTrackBackgroundColor() {
    return trackBackgroundColor;
  }

  public void setTrackBackgroundColor(@Nullable StandingsResponseDataGraphChartBackgroundColor trackBackgroundColor) {
    this.trackBackgroundColor = trackBackgroundColor;
  }

  public StandingsResponseDataGraphScrollbar trackBorderColor(@Nullable String trackBorderColor) {
    this.trackBorderColor = trackBorderColor;
    return this;
  }

  /**
   * Get trackBorderColor
   * @return trackBorderColor
   */
  
  @JsonProperty("trackBorderColor")
  public @Nullable String getTrackBorderColor() {
    return trackBorderColor;
  }

  public void setTrackBorderColor(@Nullable String trackBorderColor) {
    this.trackBorderColor = trackBorderColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphScrollbar standingsResponseDataGraphScrollbar = (StandingsResponseDataGraphScrollbar) o;
    return Objects.equals(this.barBackgroundColor, standingsResponseDataGraphScrollbar.barBackgroundColor) &&
        Objects.equals(this.barBorderColor, standingsResponseDataGraphScrollbar.barBorderColor) &&
        Objects.equals(this.buttonArrowColor, standingsResponseDataGraphScrollbar.buttonArrowColor) &&
        Objects.equals(this.buttonBackgroundColor, standingsResponseDataGraphScrollbar.buttonBackgroundColor) &&
        Objects.equals(this.buttonBorderColor, standingsResponseDataGraphScrollbar.buttonBorderColor) &&
        Objects.equals(this.rifleColor, standingsResponseDataGraphScrollbar.rifleColor) &&
        Objects.equals(this.trackBackgroundColor, standingsResponseDataGraphScrollbar.trackBackgroundColor) &&
        Objects.equals(this.trackBorderColor, standingsResponseDataGraphScrollbar.trackBorderColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barBackgroundColor, barBorderColor, buttonArrowColor, buttonBackgroundColor, buttonBorderColor, rifleColor, trackBackgroundColor, trackBorderColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphScrollbar {\n");
    sb.append("    barBackgroundColor: ").append(toIndentedString(barBackgroundColor)).append("\n");
    sb.append("    barBorderColor: ").append(toIndentedString(barBorderColor)).append("\n");
    sb.append("    buttonArrowColor: ").append(toIndentedString(buttonArrowColor)).append("\n");
    sb.append("    buttonBackgroundColor: ").append(toIndentedString(buttonBackgroundColor)).append("\n");
    sb.append("    buttonBorderColor: ").append(toIndentedString(buttonBorderColor)).append("\n");
    sb.append("    rifleColor: ").append(toIndentedString(rifleColor)).append("\n");
    sb.append("    trackBackgroundColor: ").append(toIndentedString(trackBackgroundColor)).append("\n");
    sb.append("    trackBorderColor: ").append(toIndentedString(trackBorderColor)).append("\n");
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

