package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitleStyle;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphRangeSelectorButtonTheme;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphRangeSelectorInputStyle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphRangeSelector
 */

@JsonTypeName("StandingsResponse_dataGraph_rangeSelector")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphRangeSelector {

  private @Nullable StandingsResponseDataGraphRangeSelectorButtonTheme buttonTheme;

  private @Nullable StandingsResponseDataGraphRangeSelectorInputStyle inputStyle;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle labelStyle;

  public StandingsResponseDataGraphRangeSelector buttonTheme(@Nullable StandingsResponseDataGraphRangeSelectorButtonTheme buttonTheme) {
    this.buttonTheme = buttonTheme;
    return this;
  }

  /**
   * Get buttonTheme
   * @return buttonTheme
   */
  @Valid 
  @JsonProperty("buttonTheme")
  public @Nullable StandingsResponseDataGraphRangeSelectorButtonTheme getButtonTheme() {
    return buttonTheme;
  }

  public void setButtonTheme(@Nullable StandingsResponseDataGraphRangeSelectorButtonTheme buttonTheme) {
    this.buttonTheme = buttonTheme;
  }

  public StandingsResponseDataGraphRangeSelector inputStyle(@Nullable StandingsResponseDataGraphRangeSelectorInputStyle inputStyle) {
    this.inputStyle = inputStyle;
    return this;
  }

  /**
   * Get inputStyle
   * @return inputStyle
   */
  @Valid 
  @JsonProperty("inputStyle")
  public @Nullable StandingsResponseDataGraphRangeSelectorInputStyle getInputStyle() {
    return inputStyle;
  }

  public void setInputStyle(@Nullable StandingsResponseDataGraphRangeSelectorInputStyle inputStyle) {
    this.inputStyle = inputStyle;
  }

  public StandingsResponseDataGraphRangeSelector labelStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle labelStyle) {
    this.labelStyle = labelStyle;
    return this;
  }

  /**
   * Get labelStyle
   * @return labelStyle
   */
  @Valid 
  @JsonProperty("labelStyle")
  public @Nullable SnFHistoryResponseDataGraphSubtitleStyle getLabelStyle() {
    return labelStyle;
  }

  public void setLabelStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle labelStyle) {
    this.labelStyle = labelStyle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphRangeSelector standingsResponseDataGraphRangeSelector = (StandingsResponseDataGraphRangeSelector) o;
    return Objects.equals(this.buttonTheme, standingsResponseDataGraphRangeSelector.buttonTheme) &&
        Objects.equals(this.inputStyle, standingsResponseDataGraphRangeSelector.inputStyle) &&
        Objects.equals(this.labelStyle, standingsResponseDataGraphRangeSelector.labelStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonTheme, inputStyle, labelStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphRangeSelector {\n");
    sb.append("    buttonTheme: ").append(toIndentedString(buttonTheme)).append("\n");
    sb.append("    inputStyle: ").append(toIndentedString(inputStyle)).append("\n");
    sb.append("    labelStyle: ").append(toIndentedString(labelStyle)).append("\n");
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

