package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraphPlotOptionsPie;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryESGraphResponseDataGraphPlotOptions
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph_plotOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraphPlotOptions {

  private @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPie pie;

  public EconomyHistoryESGraphResponseDataGraphPlotOptions pie(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPie pie) {
    this.pie = pie;
    return this;
  }

  /**
   * Get pie
   * @return pie
   */
  @Valid 
  @JsonProperty("pie")
  public @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPie getPie() {
    return pie;
  }

  public void setPie(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPie pie) {
    this.pie = pie;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryESGraphResponseDataGraphPlotOptions economyHistoryESGraphResponseDataGraphPlotOptions = (EconomyHistoryESGraphResponseDataGraphPlotOptions) o;
    return Objects.equals(this.pie, economyHistoryESGraphResponseDataGraphPlotOptions.pie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraphPlotOptions {\n");
    sb.append("    pie: ").append(toIndentedString(pie)).append("\n");
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

