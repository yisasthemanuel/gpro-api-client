package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphPlotOptionsSeries;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponseDataGraphPlotOptions
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_plotOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphPlotOptions {

  private @Nullable SnFHistoryResponseDataGraphPlotOptionsSeries series;

  public SnFHistoryResponseDataGraphPlotOptions series(@Nullable SnFHistoryResponseDataGraphPlotOptionsSeries series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
   */
  @Valid 
  @JsonProperty("series")
  public @Nullable SnFHistoryResponseDataGraphPlotOptionsSeries getSeries() {
    return series;
  }

  public void setSeries(@Nullable SnFHistoryResponseDataGraphPlotOptionsSeries series) {
    this.series = series;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraphPlotOptions snFHistoryResponseDataGraphPlotOptions = (SnFHistoryResponseDataGraphPlotOptions) o;
    return Objects.equals(this.series, snFHistoryResponseDataGraphPlotOptions.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphPlotOptions {\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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

