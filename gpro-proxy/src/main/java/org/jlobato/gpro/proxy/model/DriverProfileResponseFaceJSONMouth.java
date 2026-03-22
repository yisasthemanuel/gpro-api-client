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
 * DriverProfileResponseFaceJSONMouth
 */

@JsonTypeName("DriverProfileResponse_faceJSON_mouth")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseFaceJSONMouth {

  private @Nullable String id;

  private @Nullable Boolean flip;

  public DriverProfileResponseFaceJSONMouth id(@Nullable String id) {
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

  public DriverProfileResponseFaceJSONMouth flip(@Nullable Boolean flip) {
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
    DriverProfileResponseFaceJSONMouth driverProfileResponseFaceJSONMouth = (DriverProfileResponseFaceJSONMouth) o;
    return Objects.equals(this.id, driverProfileResponseFaceJSONMouth.id) &&
        Objects.equals(this.flip, driverProfileResponseFaceJSONMouth.flip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseFaceJSONMouth {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

