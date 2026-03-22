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
 * StandingsResponseDataGraphNavigatorHandles
 */

@JsonTypeName("StandingsResponse_dataGraph_navigator_handles")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphNavigatorHandles {

  private @Nullable String backgroundColor;

  private @Nullable String borderColor;

  public StandingsResponseDataGraphNavigatorHandles backgroundColor(@Nullable String backgroundColor) {
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

  public StandingsResponseDataGraphNavigatorHandles borderColor(@Nullable String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Get borderColor
   * @return borderColor
   */
  
  @JsonProperty("borderColor")
  public @Nullable String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(@Nullable String borderColor) {
    this.borderColor = borderColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphNavigatorHandles standingsResponseDataGraphNavigatorHandles = (StandingsResponseDataGraphNavigatorHandles) o;
    return Objects.equals(this.backgroundColor, standingsResponseDataGraphNavigatorHandles.backgroundColor) &&
        Objects.equals(this.borderColor, standingsResponseDataGraphNavigatorHandles.borderColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, borderColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphNavigatorHandles {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
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

