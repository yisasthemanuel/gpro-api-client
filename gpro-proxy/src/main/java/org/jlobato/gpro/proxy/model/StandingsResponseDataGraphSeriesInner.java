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
 * StandingsResponseDataGraphSeriesInner
 */

@JsonTypeName("StandingsResponse_dataGraph_series_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphSeriesInner {

  private @Nullable String type;

  private @Nullable String name;

  private @Nullable String color;

  @Valid
  private List<Integer> data = new ArrayList<>();

  public StandingsResponseDataGraphSeriesInner type(@Nullable String type) {
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

  public StandingsResponseDataGraphSeriesInner name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public StandingsResponseDataGraphSeriesInner color(@Nullable String color) {
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

  public StandingsResponseDataGraphSeriesInner data(List<Integer> data) {
    this.data = data;
    return this;
  }

  public StandingsResponseDataGraphSeriesInner addDataItem(Integer dataItem) {
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
    StandingsResponseDataGraphSeriesInner standingsResponseDataGraphSeriesInner = (StandingsResponseDataGraphSeriesInner) o;
    return Objects.equals(this.type, standingsResponseDataGraphSeriesInner.type) &&
        Objects.equals(this.name, standingsResponseDataGraphSeriesInner.name) &&
        Objects.equals(this.color, standingsResponseDataGraphSeriesInner.color) &&
        Objects.equals(this.data, standingsResponseDataGraphSeriesInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, color, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphSeriesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

