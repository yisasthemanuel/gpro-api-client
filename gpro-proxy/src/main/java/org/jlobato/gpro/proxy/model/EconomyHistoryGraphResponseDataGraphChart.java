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
 * EconomyHistoryGraphResponseDataGraphChart
 */

@JsonTypeName("EconomyHistoryGraphResponse_dataGraph_chart")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryGraphResponseDataGraphChart {

  private @Nullable String backgroundColor;

  private @Nullable String zoomType;

  public EconomyHistoryGraphResponseDataGraphChart backgroundColor(@Nullable String backgroundColor) {
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

  public EconomyHistoryGraphResponseDataGraphChart zoomType(@Nullable String zoomType) {
    this.zoomType = zoomType;
    return this;
  }

  /**
   * Get zoomType
   * @return zoomType
   */
  
  @JsonProperty("zoomType")
  public @Nullable String getZoomType() {
    return zoomType;
  }

  public void setZoomType(@Nullable String zoomType) {
    this.zoomType = zoomType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryGraphResponseDataGraphChart economyHistoryGraphResponseDataGraphChart = (EconomyHistoryGraphResponseDataGraphChart) o;
    return Objects.equals(this.backgroundColor, economyHistoryGraphResponseDataGraphChart.backgroundColor) &&
        Objects.equals(this.zoomType, economyHistoryGraphResponseDataGraphChart.zoomType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, zoomType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryGraphResponseDataGraphChart {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    zoomType: ").append(toIndentedString(zoomType)).append("\n");
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

