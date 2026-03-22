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
 * SnFHistoryResponseDataGraphLegendItemStyle
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_legend_itemStyle")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphLegendItemStyle {

  private @Nullable String font;

  private @Nullable String color;

  public SnFHistoryResponseDataGraphLegendItemStyle font(@Nullable String font) {
    this.font = font;
    return this;
  }

  /**
   * Get font
   * @return font
   */
  
  @JsonProperty("font")
  public @Nullable String getFont() {
    return font;
  }

  public void setFont(@Nullable String font) {
    this.font = font;
  }

  public SnFHistoryResponseDataGraphLegendItemStyle color(@Nullable String color) {
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
    SnFHistoryResponseDataGraphLegendItemStyle snFHistoryResponseDataGraphLegendItemStyle = (SnFHistoryResponseDataGraphLegendItemStyle) o;
    return Objects.equals(this.font, snFHistoryResponseDataGraphLegendItemStyle.font) &&
        Objects.equals(this.color, snFHistoryResponseDataGraphLegendItemStyle.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(font, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphLegendItemStyle {\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
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

