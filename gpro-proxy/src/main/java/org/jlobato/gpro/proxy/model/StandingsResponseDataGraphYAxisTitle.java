package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphYAxisTitleStyle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphYAxisTitle
 */

@JsonTypeName("StandingsResponse_dataGraph_yAxis_title")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphYAxisTitle {

  private @Nullable String text;

  private @Nullable StandingsResponseDataGraphYAxisTitleStyle style;

  public StandingsResponseDataGraphYAxisTitle text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public StandingsResponseDataGraphYAxisTitle style(@Nullable StandingsResponseDataGraphYAxisTitleStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @Valid 
  @JsonProperty("style")
  public @Nullable StandingsResponseDataGraphYAxisTitleStyle getStyle() {
    return style;
  }

  public void setStyle(@Nullable StandingsResponseDataGraphYAxisTitleStyle style) {
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
    StandingsResponseDataGraphYAxisTitle standingsResponseDataGraphYAxisTitle = (StandingsResponseDataGraphYAxisTitle) o;
    return Objects.equals(this.text, standingsResponseDataGraphYAxisTitle.text) &&
        Objects.equals(this.style, standingsResponseDataGraphYAxisTitle.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphYAxisTitle {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

