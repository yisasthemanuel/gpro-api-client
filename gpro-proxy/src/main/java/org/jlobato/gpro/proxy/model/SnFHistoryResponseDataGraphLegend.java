package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphLegendItemStyle;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitleStyle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponseDataGraphLegend
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_legend")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphLegend {

  private @Nullable SnFHistoryResponseDataGraphLegendItemStyle itemStyle;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHoverStyle;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHiddenStyle;

  public SnFHistoryResponseDataGraphLegend itemStyle(@Nullable SnFHistoryResponseDataGraphLegendItemStyle itemStyle) {
    this.itemStyle = itemStyle;
    return this;
  }

  /**
   * Get itemStyle
   * @return itemStyle
   */
  @Valid 
  @JsonProperty("itemStyle")
  public @Nullable SnFHistoryResponseDataGraphLegendItemStyle getItemStyle() {
    return itemStyle;
  }

  public void setItemStyle(@Nullable SnFHistoryResponseDataGraphLegendItemStyle itemStyle) {
    this.itemStyle = itemStyle;
  }

  public SnFHistoryResponseDataGraphLegend itemHoverStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHoverStyle) {
    this.itemHoverStyle = itemHoverStyle;
    return this;
  }

  /**
   * Get itemHoverStyle
   * @return itemHoverStyle
   */
  @Valid 
  @JsonProperty("itemHoverStyle")
  public @Nullable SnFHistoryResponseDataGraphSubtitleStyle getItemHoverStyle() {
    return itemHoverStyle;
  }

  public void setItemHoverStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHoverStyle) {
    this.itemHoverStyle = itemHoverStyle;
  }

  public SnFHistoryResponseDataGraphLegend itemHiddenStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHiddenStyle) {
    this.itemHiddenStyle = itemHiddenStyle;
    return this;
  }

  /**
   * Get itemHiddenStyle
   * @return itemHiddenStyle
   */
  @Valid 
  @JsonProperty("itemHiddenStyle")
  public @Nullable SnFHistoryResponseDataGraphSubtitleStyle getItemHiddenStyle() {
    return itemHiddenStyle;
  }

  public void setItemHiddenStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHiddenStyle) {
    this.itemHiddenStyle = itemHiddenStyle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraphLegend snFHistoryResponseDataGraphLegend = (SnFHistoryResponseDataGraphLegend) o;
    return Objects.equals(this.itemStyle, snFHistoryResponseDataGraphLegend.itemStyle) &&
        Objects.equals(this.itemHoverStyle, snFHistoryResponseDataGraphLegend.itemHoverStyle) &&
        Objects.equals(this.itemHiddenStyle, snFHistoryResponseDataGraphLegend.itemHiddenStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemStyle, itemHoverStyle, itemHiddenStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphLegend {\n");
    sb.append("    itemStyle: ").append(toIndentedString(itemStyle)).append("\n");
    sb.append("    itemHoverStyle: ").append(toIndentedString(itemHoverStyle)).append("\n");
    sb.append("    itemHiddenStyle: ").append(toIndentedString(itemHiddenStyle)).append("\n");
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

