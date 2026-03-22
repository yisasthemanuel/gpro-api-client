package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphYAxisLabels;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryGraphResponseDataGraphXAxis
 */

@JsonTypeName("EconomyHistoryGraphResponse_dataGraph_xAxis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryGraphResponseDataGraphXAxis {

  @Valid
  private List<String> categories = new ArrayList<>();

  @Valid
  private List<String> tickPositions = new ArrayList<>();

  private @Nullable SnFHistoryResponseDataGraphYAxisLabels labels;

  public EconomyHistoryGraphResponseDataGraphXAxis categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public EconomyHistoryGraphResponseDataGraphXAxis addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public EconomyHistoryGraphResponseDataGraphXAxis tickPositions(List<String> tickPositions) {
    this.tickPositions = tickPositions;
    return this;
  }

  public EconomyHistoryGraphResponseDataGraphXAxis addTickPositionsItem(String tickPositionsItem) {
    if (this.tickPositions == null) {
      this.tickPositions = new ArrayList<>();
    }
    this.tickPositions.add(tickPositionsItem);
    return this;
  }

  /**
   * Get tickPositions
   * @return tickPositions
   */
  
  @JsonProperty("tickPositions")
  public List<String> getTickPositions() {
    return tickPositions;
  }

  public void setTickPositions(List<String> tickPositions) {
    this.tickPositions = tickPositions;
  }

  public EconomyHistoryGraphResponseDataGraphXAxis labels(@Nullable SnFHistoryResponseDataGraphYAxisLabels labels) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryGraphResponseDataGraphXAxis economyHistoryGraphResponseDataGraphXAxis = (EconomyHistoryGraphResponseDataGraphXAxis) o;
    return Objects.equals(this.categories, economyHistoryGraphResponseDataGraphXAxis.categories) &&
        Objects.equals(this.tickPositions, economyHistoryGraphResponseDataGraphXAxis.tickPositions) &&
        Objects.equals(this.labels, economyHistoryGraphResponseDataGraphXAxis.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, tickPositions, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryGraphResponseDataGraphXAxis {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    tickPositions: ").append(toIndentedString(tickPositions)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

