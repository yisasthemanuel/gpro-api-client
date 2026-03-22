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
 * SnFHistoryResponseDataGraphTooltip
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_tooltip")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphTooltip {

  private @Nullable Integer useHtml;

  private @Nullable String formatter;

  public SnFHistoryResponseDataGraphTooltip useHtml(@Nullable Integer useHtml) {
    this.useHtml = useHtml;
    return this;
  }

  /**
   * Get useHtml
   * @return useHtml
   */
  
  @JsonProperty("useHtml")
  public @Nullable Integer getUseHtml() {
    return useHtml;
  }

  public void setUseHtml(@Nullable Integer useHtml) {
    this.useHtml = useHtml;
  }

  public SnFHistoryResponseDataGraphTooltip formatter(@Nullable String formatter) {
    this.formatter = formatter;
    return this;
  }

  /**
   * Get formatter
   * @return formatter
   */
  
  @JsonProperty("formatter")
  public @Nullable String getFormatter() {
    return formatter;
  }

  public void setFormatter(@Nullable String formatter) {
    this.formatter = formatter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraphTooltip snFHistoryResponseDataGraphTooltip = (SnFHistoryResponseDataGraphTooltip) o;
    return Objects.equals(this.useHtml, snFHistoryResponseDataGraphTooltip.useHtml) &&
        Objects.equals(this.formatter, snFHistoryResponseDataGraphTooltip.formatter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useHtml, formatter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphTooltip {\n");
    sb.append("    useHtml: ").append(toIndentedString(useHtml)).append("\n");
    sb.append("    formatter: ").append(toIndentedString(formatter)).append("\n");
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

