package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph_plotOptions_pie_dataLabels")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels {

  private @Nullable Integer enabled;

  private @Nullable String format;

  private @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle style;

  private @Nullable String connectorColor;

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels enabled(@Nullable Integer enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  
  @JsonProperty("enabled")
  public @Nullable Integer getEnabled() {
    return enabled;
  }

  public void setEnabled(@Nullable Integer enabled) {
    this.enabled = enabled;
  }

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels style(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @Valid 
  @JsonProperty("style")
  public @Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle getStyle() {
    return style;
  }

  public void setStyle(@Nullable EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabelsStyle style) {
    this.style = style;
  }

  public EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels connectorColor(@Nullable String connectorColor) {
    this.connectorColor = connectorColor;
    return this;
  }

  /**
   * Get connectorColor
   * @return connectorColor
   */
  
  @JsonProperty("connectorColor")
  public @Nullable String getConnectorColor() {
    return connectorColor;
  }

  public void setConnectorColor(@Nullable String connectorColor) {
    this.connectorColor = connectorColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels = (EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels) o;
    return Objects.equals(this.enabled, economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels.enabled) &&
        Objects.equals(this.format, economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels.format) &&
        Objects.equals(this.style, economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels.style) &&
        Objects.equals(this.connectorColor, economyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels.connectorColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, format, style, connectorColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraphPlotOptionsPieDataLabels {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    connectorColor: ").append(toIndentedString(connectorColor)).append("\n");
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

