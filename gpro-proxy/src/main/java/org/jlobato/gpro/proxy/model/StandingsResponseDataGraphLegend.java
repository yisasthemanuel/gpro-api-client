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
 * StandingsResponseDataGraphLegend
 */

@JsonTypeName("StandingsResponse_dataGraph_legend")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphLegend {

  private @Nullable Integer x;

  private @Nullable Integer y;

  private @Nullable Integer padding;

  private @Nullable Integer margin;

  private @Nullable SnFHistoryResponseDataGraphLegendItemStyle itemStyle;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHoverStyle;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHiddenStyle;

  private @Nullable String layout;

  private @Nullable String align;

  private @Nullable String verticalAlign;

  private @Nullable Integer useHTML;

  private @Nullable Integer itemMarginTop;

  private @Nullable Integer itemMarginBottom;

  public StandingsResponseDataGraphLegend x(@Nullable Integer x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
   */
  
  @JsonProperty("x")
  public @Nullable Integer getX() {
    return x;
  }

  public void setX(@Nullable Integer x) {
    this.x = x;
  }

  public StandingsResponseDataGraphLegend y(@Nullable Integer y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
   */
  
  @JsonProperty("y")
  public @Nullable Integer getY() {
    return y;
  }

  public void setY(@Nullable Integer y) {
    this.y = y;
  }

  public StandingsResponseDataGraphLegend padding(@Nullable Integer padding) {
    this.padding = padding;
    return this;
  }

  /**
   * Get padding
   * @return padding
   */
  
  @JsonProperty("padding")
  public @Nullable Integer getPadding() {
    return padding;
  }

  public void setPadding(@Nullable Integer padding) {
    this.padding = padding;
  }

  public StandingsResponseDataGraphLegend margin(@Nullable Integer margin) {
    this.margin = margin;
    return this;
  }

  /**
   * Get margin
   * @return margin
   */
  
  @JsonProperty("margin")
  public @Nullable Integer getMargin() {
    return margin;
  }

  public void setMargin(@Nullable Integer margin) {
    this.margin = margin;
  }

  public StandingsResponseDataGraphLegend itemStyle(@Nullable SnFHistoryResponseDataGraphLegendItemStyle itemStyle) {
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

  public StandingsResponseDataGraphLegend itemHoverStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHoverStyle) {
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

  public StandingsResponseDataGraphLegend itemHiddenStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle itemHiddenStyle) {
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

  public StandingsResponseDataGraphLegend layout(@Nullable String layout) {
    this.layout = layout;
    return this;
  }

  /**
   * Get layout
   * @return layout
   */
  
  @JsonProperty("layout")
  public @Nullable String getLayout() {
    return layout;
  }

  public void setLayout(@Nullable String layout) {
    this.layout = layout;
  }

  public StandingsResponseDataGraphLegend align(@Nullable String align) {
    this.align = align;
    return this;
  }

  /**
   * Get align
   * @return align
   */
  
  @JsonProperty("align")
  public @Nullable String getAlign() {
    return align;
  }

  public void setAlign(@Nullable String align) {
    this.align = align;
  }

  public StandingsResponseDataGraphLegend verticalAlign(@Nullable String verticalAlign) {
    this.verticalAlign = verticalAlign;
    return this;
  }

  /**
   * Get verticalAlign
   * @return verticalAlign
   */
  
  @JsonProperty("verticalAlign")
  public @Nullable String getVerticalAlign() {
    return verticalAlign;
  }

  public void setVerticalAlign(@Nullable String verticalAlign) {
    this.verticalAlign = verticalAlign;
  }

  public StandingsResponseDataGraphLegend useHTML(@Nullable Integer useHTML) {
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

  public StandingsResponseDataGraphLegend itemMarginTop(@Nullable Integer itemMarginTop) {
    this.itemMarginTop = itemMarginTop;
    return this;
  }

  /**
   * Get itemMarginTop
   * @return itemMarginTop
   */
  
  @JsonProperty("itemMarginTop")
  public @Nullable Integer getItemMarginTop() {
    return itemMarginTop;
  }

  public void setItemMarginTop(@Nullable Integer itemMarginTop) {
    this.itemMarginTop = itemMarginTop;
  }

  public StandingsResponseDataGraphLegend itemMarginBottom(@Nullable Integer itemMarginBottom) {
    this.itemMarginBottom = itemMarginBottom;
    return this;
  }

  /**
   * Get itemMarginBottom
   * @return itemMarginBottom
   */
  
  @JsonProperty("itemMarginBottom")
  public @Nullable Integer getItemMarginBottom() {
    return itemMarginBottom;
  }

  public void setItemMarginBottom(@Nullable Integer itemMarginBottom) {
    this.itemMarginBottom = itemMarginBottom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphLegend standingsResponseDataGraphLegend = (StandingsResponseDataGraphLegend) o;
    return Objects.equals(this.x, standingsResponseDataGraphLegend.x) &&
        Objects.equals(this.y, standingsResponseDataGraphLegend.y) &&
        Objects.equals(this.padding, standingsResponseDataGraphLegend.padding) &&
        Objects.equals(this.margin, standingsResponseDataGraphLegend.margin) &&
        Objects.equals(this.itemStyle, standingsResponseDataGraphLegend.itemStyle) &&
        Objects.equals(this.itemHoverStyle, standingsResponseDataGraphLegend.itemHoverStyle) &&
        Objects.equals(this.itemHiddenStyle, standingsResponseDataGraphLegend.itemHiddenStyle) &&
        Objects.equals(this.layout, standingsResponseDataGraphLegend.layout) &&
        Objects.equals(this.align, standingsResponseDataGraphLegend.align) &&
        Objects.equals(this.verticalAlign, standingsResponseDataGraphLegend.verticalAlign) &&
        Objects.equals(this.useHTML, standingsResponseDataGraphLegend.useHTML) &&
        Objects.equals(this.itemMarginTop, standingsResponseDataGraphLegend.itemMarginTop) &&
        Objects.equals(this.itemMarginBottom, standingsResponseDataGraphLegend.itemMarginBottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, padding, margin, itemStyle, itemHoverStyle, itemHiddenStyle, layout, align, verticalAlign, useHTML, itemMarginTop, itemMarginBottom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphLegend {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    itemStyle: ").append(toIndentedString(itemStyle)).append("\n");
    sb.append("    itemHoverStyle: ").append(toIndentedString(itemHoverStyle)).append("\n");
    sb.append("    itemHiddenStyle: ").append(toIndentedString(itemHiddenStyle)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
    sb.append("    useHTML: ").append(toIndentedString(useHTML)).append("\n");
    sb.append("    itemMarginTop: ").append(toIndentedString(itemMarginTop)).append("\n");
    sb.append("    itemMarginBottom: ").append(toIndentedString(itemMarginBottom)).append("\n");
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

