package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphYAxisLabels;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponseDataGraphYAxis
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_yAxis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphYAxis {

  private @Nullable SnFHistoryResponseDataGraphYAxisLabels labels;

  private @Nullable Integer title;

  public SnFHistoryResponseDataGraphYAxis labels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @Valid 
  @JsonProperty("labels")
  public @Nullable SnFHistoryResponseDataGraphYAxisLabels getLabels() {
    return labels;
  }

  public void setLabels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
    this.labels = labels;
  }

  public SnFHistoryResponseDataGraphYAxis title(@Nullable Integer title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @JsonProperty("title")
  public @Nullable Integer getTitle() {
    return title;
  }

  public void setTitle(@Nullable Integer title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraphYAxis snFHistoryResponseDataGraphYAxis = (SnFHistoryResponseDataGraphYAxis) o;
    return Objects.equals(this.labels, snFHistoryResponseDataGraphYAxis.labels) &&
        Objects.equals(this.title, snFHistoryResponseDataGraphYAxis.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphYAxis {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

