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
 * DriverProfileResponseFaceJSONEyebrow
 */

@JsonTypeName("DriverProfileResponse_faceJSON_eyebrow")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseFaceJSONEyebrow {

  private @Nullable String id;

  private @Nullable Integer angle;

  public DriverProfileResponseFaceJSONEyebrow id(@Nullable String id) {
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

  public DriverProfileResponseFaceJSONEyebrow angle(@Nullable Integer angle) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponseFaceJSONEyebrow driverProfileResponseFaceJSONEyebrow = (DriverProfileResponseFaceJSONEyebrow) o;
    return Objects.equals(this.id, driverProfileResponseFaceJSONEyebrow.id) &&
        Objects.equals(this.angle, driverProfileResponseFaceJSONEyebrow.angle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, angle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseFaceJSONEyebrow {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
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

