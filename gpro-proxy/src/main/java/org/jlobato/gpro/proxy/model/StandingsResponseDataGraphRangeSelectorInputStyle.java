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
 * StandingsResponseDataGraphRangeSelectorInputStyle
 */

@JsonTypeName("StandingsResponse_dataGraph_rangeSelector_inputStyle")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphRangeSelectorInputStyle {

  private @Nullable String backgroundColor;

  private @Nullable String color;

  public StandingsResponseDataGraphRangeSelectorInputStyle backgroundColor(@Nullable String backgroundColor) {
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

  public StandingsResponseDataGraphRangeSelectorInputStyle color(@Nullable String color) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphRangeSelectorInputStyle standingsResponseDataGraphRangeSelectorInputStyle = (StandingsResponseDataGraphRangeSelectorInputStyle) o;
    return Objects.equals(this.backgroundColor, standingsResponseDataGraphRangeSelectorInputStyle.backgroundColor) &&
        Objects.equals(this.color, standingsResponseDataGraphRangeSelectorInputStyle.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphRangeSelectorInputStyle {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

