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
 * EconomyHistoryESGraphResponseDataGraphSeriesInner
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph_series_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraphSeriesInner {

  private @Nullable String type;

  private @Nullable String name;

  @Valid
  private List<List<String>> data = new ArrayList<>();

  public EconomyHistoryESGraphResponseDataGraphSeriesInner type(@Nullable String type) {
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

  public EconomyHistoryESGraphResponseDataGraphSeriesInner name(@Nullable String name) {
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

  public EconomyHistoryESGraphResponseDataGraphSeriesInner data(List<List<String>> data) {
    this.data = data;
    return this;
  }

  public EconomyHistoryESGraphResponseDataGraphSeriesInner addDataItem(List<String> dataItem) {
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
  @Valid 
  @JsonProperty("data")
  public List<List<String>> getData() {
    return data;
  }

  public void setData(List<List<String>> data) {
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
    EconomyHistoryESGraphResponseDataGraphSeriesInner economyHistoryESGraphResponseDataGraphSeriesInner = (EconomyHistoryESGraphResponseDataGraphSeriesInner) o;
    return Objects.equals(this.type, economyHistoryESGraphResponseDataGraphSeriesInner.type) &&
        Objects.equals(this.name, economyHistoryESGraphResponseDataGraphSeriesInner.name) &&
        Objects.equals(this.data, economyHistoryESGraphResponseDataGraphSeriesInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraphSeriesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

