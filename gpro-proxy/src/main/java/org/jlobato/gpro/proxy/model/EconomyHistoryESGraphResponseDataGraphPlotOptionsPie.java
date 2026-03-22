package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryESGraphResponseDataGraphPlotOptionsPie
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph_plotOptions_pie")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraphPlotOptionsPie {

  private @Nullable Integer allowPointSelect;

  private @Nullable String cursor;

  private @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels dataLabels;

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPie allowPointSelect(@Nullable Integer allowPointSelect) {
    this.allowPointSelect = allowPointSelect;
    return this;
  }

  /**
   * Get allowPointSelect
   * @return allowPointSelect
   */
  
  @JsonProperty("allowPointSelect")
  public @Nullable Integer getAllowPointSelect() {
    return allowPointSelect;
  }

  public void setAllowPointSelect(@Nullable Integer allowPointSelect) {
    this.allowPointSelect = allowPointSelect;
  }

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPie cursor(@Nullable String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
   */
  
  @JsonProperty("cursor")
  public @Nullable String getCursor() {
    return cursor;
  }

  public void setCursor(@Nullable String cursor) {
    this.cursor = cursor;
  }

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPie dataLabels(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels dataLabels) {
    this.dataLabels = dataLabels;
    return this;
  }

  /**
   * Get dataLabels
   * @return dataLabels
   */
  @Valid 
  @JsonProperty("dataLabels")
  public @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels getDataLabels() {
    return dataLabels;
  }

  public void setDataLabels(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels dataLabels) {
    this.dataLabels = dataLabels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryESGraphResponseDataGraphPlotOptionsPie economyHistoryESGraphResponseDataGraphPlotOptionsPie = (EconomyHistoryESGraphResponseDataGraphPlotOptionsPie) o;
    return Objects.equals(this.allowPointSelect, economyHistoryESGraphResponseDataGraphPlotOptionsPie.allowPointSelect) &&
        Objects.equals(this.cursor, economyHistoryESGraphResponseDataGraphPlotOptionsPie.cursor) &&
        Objects.equals(this.dataLabels, economyHistoryESGraphResponseDataGraphPlotOptionsPie.dataLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPointSelect, cursor, dataLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraphPlotOptionsPie {\n");
    sb.append("    allowPointSelect: ").append(toIndentedString(allowPointSelect)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    dataLabels: ").append(toIndentedString(dataLabels)).append("\n");
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

