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
 * AvailDriversResponseOA
 */

@JsonTypeName("AvailDriversResponse_OA")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class AvailDriversResponseOA {

  private @Nullable Integer lower;

  private @Nullable Integer upper;

  public AvailDriversResponseOA lower(@Nullable Integer lower) {
    this.lower = lower;
    return this;
  }

  /**
   * Get lower
   * @return lower
   */
  
  @JsonProperty("lower")
  public @Nullable Integer getLower() {
    return lower;
  }

  public void setLower(@Nullable Integer lower) {
    this.lower = lower;
  }

  public AvailDriversResponseOA upper(@Nullable Integer upper) {
    this.upper = upper;
    return this;
  }

  /**
   * Get upper
   * @return upper
   */
  
  @JsonProperty("upper")
  public @Nullable Integer getUpper() {
    return upper;
  }

  public void setUpper(@Nullable Integer upper) {
    this.upper = upper;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailDriversResponseOA availDriversResponseOA = (AvailDriversResponseOA) o;
    return Objects.equals(this.lower, availDriversResponseOA.lower) &&
        Objects.equals(this.upper, availDriversResponseOA.upper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lower, upper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailDriversResponseOA {\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
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

