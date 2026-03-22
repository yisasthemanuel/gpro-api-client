package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DriverProfileResponseFaceJSONNose
 */

@JsonTypeName("DriverProfileResponse_faceJSON_nose")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseFaceJSONNose {

  private @Nullable String id;

  private @Nullable Boolean flip;

  private @Nullable BigDecimal size;

  public DriverProfileResponseFaceJSONNose id(@Nullable String id) {
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

  public DriverProfileResponseFaceJSONNose flip(@Nullable Boolean flip) {
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

  public DriverProfileResponseFaceJSONNose size(@Nullable BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @Valid 
  @JsonProperty("size")
  public @Nullable BigDecimal getSize() {
    return size;
  }

  public void setSize(@Nullable BigDecimal size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponseFaceJSONNose driverProfileResponseFaceJSONNose = (DriverProfileResponseFaceJSONNose) o;
    return Objects.equals(this.id, driverProfileResponseFaceJSONNose.id) &&
        Objects.equals(this.flip, driverProfileResponseFaceJSONNose.flip) &&
        Objects.equals(this.size, driverProfileResponseFaceJSONNose.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flip, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseFaceJSONNose {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flip: ").append(toIndentedString(flip)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

