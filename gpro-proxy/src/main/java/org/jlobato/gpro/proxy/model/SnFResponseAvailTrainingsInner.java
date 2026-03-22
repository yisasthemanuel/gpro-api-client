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
 * SnFResponseAvailTrainingsInner
 */

@JsonTypeName("SnFResponse_availTrainings_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFResponseAvailTrainingsInner {

  private @Nullable String value;

  private @Nullable String name;

  private @Nullable String cost;

  public SnFResponseAvailTrainingsInner value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  public void setValue(@Nullable String value) {
    this.value = value;
  }

  public SnFResponseAvailTrainingsInner name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public SnFResponseAvailTrainingsInner cost(@Nullable String cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
   */
  
  @JsonProperty("cost")
  public @Nullable String getCost() {
    return cost;
  }

  public void setCost(@Nullable String cost) {
    this.cost = cost;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFResponseAvailTrainingsInner snFResponseAvailTrainingsInner = (SnFResponseAvailTrainingsInner) o;
    return Objects.equals(this.value, snFResponseAvailTrainingsInner.value) &&
        Objects.equals(this.name, snFResponseAvailTrainingsInner.name) &&
        Objects.equals(this.cost, snFResponseAvailTrainingsInner.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, name, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFResponseAvailTrainingsInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

