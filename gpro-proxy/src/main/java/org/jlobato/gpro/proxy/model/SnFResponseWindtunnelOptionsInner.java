package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFResponseWindtunnelOptionsInnerValue;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFResponseWindtunnelOptionsInner
 */

@JsonTypeName("SnFResponse_windtunnelOptions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFResponseWindtunnelOptionsInner {

  private @Nullable SnFResponseWindtunnelOptionsInnerValue value;

  private @Nullable String color;

  private @Nullable String text;

  public SnFResponseWindtunnelOptionsInner value(@Nullable SnFResponseWindtunnelOptionsInnerValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Valid 
  @JsonProperty("value")
  public @Nullable SnFResponseWindtunnelOptionsInnerValue getValue() {
    return value;
  }

  public void setValue(@Nullable SnFResponseWindtunnelOptionsInnerValue value) {
    this.value = value;
  }

  public SnFResponseWindtunnelOptionsInner color(@Nullable String color) {
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

  public SnFResponseWindtunnelOptionsInner text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFResponseWindtunnelOptionsInner snFResponseWindtunnelOptionsInner = (SnFResponseWindtunnelOptionsInner) o;
    return Objects.equals(this.value, snFResponseWindtunnelOptionsInner.value) &&
        Objects.equals(this.color, snFResponseWindtunnelOptionsInner.color) &&
        Objects.equals(this.text, snFResponseWindtunnelOptionsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, color, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFResponseWindtunnelOptionsInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

