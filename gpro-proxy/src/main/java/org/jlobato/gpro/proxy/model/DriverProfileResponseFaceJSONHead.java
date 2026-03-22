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
 * DriverProfileResponseFaceJSONHead
 */

@JsonTypeName("DriverProfileResponse_faceJSON_head")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseFaceJSONHead {

  private @Nullable String id;

  private @Nullable String shave;

  public DriverProfileResponseFaceJSONHead id(@Nullable String id) {
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

  public DriverProfileResponseFaceJSONHead shave(@Nullable String shave) {
    this.shave = shave;
    return this;
  }

  /**
   * Get shave
   * @return shave
   */
  
  @JsonProperty("shave")
  public @Nullable String getShave() {
    return shave;
  }

  public void setShave(@Nullable String shave) {
    this.shave = shave;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponseFaceJSONHead driverProfileResponseFaceJSONHead = (DriverProfileResponseFaceJSONHead) o;
    return Objects.equals(this.id, driverProfileResponseFaceJSONHead.id) &&
        Objects.equals(this.shave, driverProfileResponseFaceJSONHead.shave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shave);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseFaceJSONHead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shave: ").append(toIndentedString(shave)).append("\n");
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

