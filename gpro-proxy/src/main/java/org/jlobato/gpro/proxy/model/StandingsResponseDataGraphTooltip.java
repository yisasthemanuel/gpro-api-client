package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitleStyle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphTooltip
 */

@JsonTypeName("StandingsResponse_dataGraph_tooltip")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphTooltip {

  private @Nullable Integer useHTML;

  private @Nullable String backgroundColor;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle style;

  public StandingsResponseDataGraphTooltip useHTML(@Nullable Integer useHTML) {
    this.useHTML = useHTML;
    return this;
  }

  /**
   * Get useHTML
   * @return useHTML
   */
  
  @JsonProperty("useHTML")
  public @Nullable Integer getUseHTML() {
    return useHTML;
  }

  public void setUseHTML(@Nullable Integer useHTML) {
    this.useHTML = useHTML;
  }

  public StandingsResponseDataGraphTooltip backgroundColor(@Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Get backgroundColor
   * @return backgroundColor
   */
  
  @JsonProperty("backgroundColor")
  public @Nullable String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(@Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public StandingsResponseDataGraphTooltip style(@Nullable SnFHistoryResponseDataGraphSubtitleStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @Valid 
  @JsonProperty("style")
  public @Nullable SnFHistoryResponseDataGraphSubtitleStyle getStyle() {
    return style;
  }

  public void setStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle style) {
    this.style = style;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphTooltip standingsResponseDataGraphTooltip = (StandingsResponseDataGraphTooltip) o;
    return Objects.equals(this.useHTML, standingsResponseDataGraphTooltip.useHTML) &&
        Objects.equals(this.backgroundColor, standingsResponseDataGraphTooltip.backgroundColor) &&
        Objects.equals(this.style, standingsResponseDataGraphTooltip.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useHTML, backgroundColor, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphTooltip {\n");
    sb.append("    useHTML: ").append(toIndentedString(useHTML)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

