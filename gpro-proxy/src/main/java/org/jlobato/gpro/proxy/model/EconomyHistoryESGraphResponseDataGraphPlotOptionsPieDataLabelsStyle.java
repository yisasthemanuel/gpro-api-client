package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph_plotOptions_pie_dataLabels_style")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle {

  private @Nullable String color;

  private @Nullable String textShadow;

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle color(@Nullable String color) {
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

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle textShadow(@Nullable String textShadow) {
    this.textShadow = textShadow;
    return this;
  }

  /**
   * Get textShadow
   * @return textShadow
   */
  
  @JsonProperty("textShadow")
  public @Nullable String getTextShadow() {
    return textShadow;
  }

  public void setTextShadow(@Nullable String textShadow) {
    this.textShadow = textShadow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle = (EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle) o;
    return Objects.equals(this.color, economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle.color) &&
        Objects.equals(this.textShadow, economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle.textShadow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, textShadow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    textShadow: ").append(toIndentedString(textShadow)).append("\n");
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

