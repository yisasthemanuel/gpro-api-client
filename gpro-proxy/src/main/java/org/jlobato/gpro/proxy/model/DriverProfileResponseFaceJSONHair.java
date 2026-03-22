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
 * DriverProfileResponseFaceJSONHair
 */

@JsonTypeName("DriverProfileResponse_faceJSON_hair")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseFaceJSONHair {

  private @Nullable String id;

  private @Nullable String color;

  private @Nullable Boolean flip;

  public DriverProfileResponseFaceJSONHair id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public DriverProfileResponseFaceJSONHair color(@Nullable String color) {
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

  public DriverProfileResponseFaceJSONHair flip(@Nullable Boolean flip) {
    this.flip = flip;
    return this;
  }

  /**
   * Get flip
   * @return flip
   */
  
  @JsonProperty("flip")
  public @Nullable Boolean getFlip() {
    return flip;
  }

  public void setFlip(@Nullable Boolean flip) {
    this.flip = flip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponseFaceJSONHair driverProfileResponseFaceJSONHair = (DriverProfileResponseFaceJSONHair) o;
    return Objects.equals(this.id, driverProfileResponseFaceJSONHair.id) &&
        Objects.equals(this.color, driverProfileResponseFaceJSONHair.color) &&
        Objects.equals(this.flip, driverProfileResponseFaceJSONHair.flip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, color, flip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseFaceJSONHair {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    flip: ").append(toIndentedString(flip)).append("\n");
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

