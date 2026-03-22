package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryGraphResponseDataGraphSeriesInner
 */

@JsonTypeName("EconomyHistoryGraphResponse_dataGraph_series_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryGraphResponseDataGraphSeriesInner {

  private @Nullable String type;

  private @Nullable Integer showInLegend;

  private @Nullable String color;

  @Valid
  private List<Integer> data = new ArrayList<>();

  public EconomyHistoryGraphResponseDataGraphSeriesInner type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public EconomyHistoryGraphResponseDataGraphSeriesInner showInLegend(@Nullable Integer showInLegend) {
    this.showInLegend = showInLegend;
    return this;
  }

  /**
   * Get showInLegend
   * @return showInLegend
   */
  
  @JsonProperty("showInLegend")
  public @Nullable Integer getShowInLegend() {
    return showInLegend;
  }

  public void setShowInLegend(@Nullable Integer showInLegend) {
    this.showInLegend = showInLegend;
  }

  public EconomyHistoryGraphResponseDataGraphSeriesInner color(@Nullable String color) {
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

  public EconomyHistoryGraphResponseDataGraphSeriesInner data(List<Integer> data) {
    this.data = data;
    return this;
  }

  public EconomyHistoryGraphResponseDataGraphSeriesInner addDataItem(Integer dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  
  @JsonProperty("data")
  public List<Integer> getData() {
    return data;
  }

  public void setData(List<Integer> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryGraphResponseDataGraphSeriesInner economyHistoryGraphResponseDataGraphSeriesInner = (EconomyHistoryGraphResponseDataGraphSeriesInner) o;
    return Objects.equals(this.type, economyHistoryGraphResponseDataGraphSeriesInner.type) &&
        Objects.equals(this.showInLegend, economyHistoryGraphResponseDataGraphSeriesInner.showInLegend) &&
        Objects.equals(this.color, economyHistoryGraphResponseDataGraphSeriesInner.color) &&
        Objects.equals(this.data, economyHistoryGraphResponseDataGraphSeriesInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, showInLegend, color, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryGraphResponseDataGraphSeriesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    showInLegend: ").append(toIndentedString(showInLegend)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

