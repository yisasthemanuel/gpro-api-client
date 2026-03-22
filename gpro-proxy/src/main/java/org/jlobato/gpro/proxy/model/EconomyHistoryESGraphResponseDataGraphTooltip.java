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
 * EconomyHistoryESGraphResponseDataGraphTooltip
 */

@JsonTypeName("EconomyHistoryESGraphResponse_dataGraph_tooltip")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponseDataGraphTooltip {

  private @Nullable String pointFormat;

  public EconomyHistoryESGraphResponseDataGraphTooltip pointFormat(@Nullable String pointFormat) {
    this.pointFormat = pointFormat;
    return this;
  }

  /**
   * Get pointFormat
   * @return pointFormat
   */
  
  @JsonProperty("pointFormat")
  public @Nullable String getPointFormat() {
    return pointFormat;
  }

  public void setPointFormat(@Nullable String pointFormat) {
    this.pointFormat = pointFormat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryESGraphResponseDataGraphTooltip economyHistoryESGraphResponseDataGraphTooltip = (EconomyHistoryESGraphResponseDataGraphTooltip) o;
    return Objects.equals(this.pointFormat, economyHistoryESGraphResponseDataGraphTooltip.pointFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponseDataGraphTooltip {\n");
    sb.append("    pointFormat: ").append(toIndentedString(pointFormat)).append("\n");
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

