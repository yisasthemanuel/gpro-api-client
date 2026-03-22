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
 * EconomyHistoryESGraphResponseDataGraphChart
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph_chart")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraphChart {

  private @Nullable String backgroundColor;

  private @Nullable String plotBackgroundColor;

  private @Nullable String plotBorderWidth;

  private @Nullable Integer plotShadow;

  public EconomyHistoryESGraphResponseDataGraphChart backgroundColor(@Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Get backgroundColor
   * @return backgroundColor
   */
  
  @JsonProperty("backgroundColor")
  public @Nullable String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(@Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public EconomyHistoryESGraphResponseDataGraphChart plotBackgroundColor(@Nullable String plotBackgroundColor) {
    this.plotBackgroundColor = plotBackgroundColor;
    return this;
  }

  /**
   * Get plotBackgroundColor
   * @return plotBackgroundColor
   */
  
  @JsonProperty("plotBackgroundColor")
  public @Nullable String getPlotBackgroundColor() {
    return plotBackgroundColor;
  }

  public void setPlotBackgroundColor(@Nullable String plotBackgroundColor) {
    this.plotBackgroundColor = plotBackgroundColor;
  }

  public EconomyHistoryESGraphResponseDataGraphChart plotBorderWidth(@Nullable String plotBorderWidth) {
    this.plotBorderWidth = plotBorderWidth;
    return this;
  }

  /**
   * Get plotBorderWidth
   * @return plotBorderWidth
   */
  
  @JsonProperty("plotBorderWidth")
  public @Nullable String getPlotBorderWidth() {
    return plotBorderWidth;
  }

  public void setPlotBorderWidth(@Nullable String plotBorderWidth) {
    this.plotBorderWidth = plotBorderWidth;
  }

  public EconomyHistoryESGraphResponseDataGraphChart plotShadow(@Nullable Integer plotShadow) {
    this.plotShadow = plotShadow;
    return this;
  }

  /**
   * Get plotShadow
   * @return plotShadow
   */
  
  @JsonProperty("plotShadow")
  public @Nullable Integer getPlotShadow() {
    return plotShadow;
  }

  public void setPlotShadow(@Nullable Integer plotShadow) {
    this.plotShadow = plotShadow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryESGraphResponseDataGraphChart economyHistoryESGraphResponseDataGraphChart = (EconomyHistoryESGraphResponseDataGraphChart) o;
    return Objects.equals(this.backgroundColor, economyHistoryESGraphResponseDataGraphChart.backgroundColor) &&
        Objects.equals(this.plotBackgroundColor, economyHistoryESGraphResponseDataGraphChart.plotBackgroundColor) &&
        Objects.equals(this.plotBorderWidth, economyHistoryESGraphResponseDataGraphChart.plotBorderWidth) &&
        Objects.equals(this.plotShadow, economyHistoryESGraphResponseDataGraphChart.plotShadow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, plotBackgroundColor, plotBorderWidth, plotShadow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraphChart {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    plotBackgroundColor: ").append(toIndentedString(plotBackgroundColor)).append("\n");
    sb.append("    plotBorderWidth: ").append(toIndentedString(plotBorderWidth)).append("\n");
    sb.append("    plotShadow: ").append(toIndentedString(plotShadow)).append("\n");
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

