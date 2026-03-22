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
 * DriverProfileResponseFaceJSONEye
 */

@JsonTypeName("DriverProfileResponse_faceJSON_eye")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseFaceJSONEye {

  private @Nullable String id;

  private @Nullable Integer angle;

  private @Nullable String color;

  public DriverProfileResponseFaceJSONEye id(@Nullable String id) {
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

  public DriverProfileResponseFaceJSONEye angle(@Nullable Integer angle) {
    this.angle = angle;
    return this;
  }

  /**
   * Get angle
   * @return angle
   */
  
  @JsonProperty("angle")
  public @Nullable Integer getAngle() {
    return angle;
  }

  public void setAngle(@Nullable Integer angle) {
    this.angle = angle;
  }

  public DriverProfileResponseFaceJSONEye color(@Nullable String color) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponseFaceJSONEye driverProfileResponseFaceJSONEye = (DriverProfileResponseFaceJSONEye) o;
    return Objects.equals(this.id, driverProfileResponseFaceJSONEye.id) &&
        Objects.equals(this.angle, driverProfileResponseFaceJSONEye.angle) &&
        Objects.equals(this.color, driverProfileResponseFaceJSONEye.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, angle, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseFaceJSONEye {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

