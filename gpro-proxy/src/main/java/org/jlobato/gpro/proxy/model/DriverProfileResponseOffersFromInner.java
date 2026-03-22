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
 * DriverProfileResponseOffersFromInner
 */

@JsonTypeName("DriverProfileResponse_offersFrom_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseOffersFromInner {

  private @Nullable String manName;

  private @Nullable String manChamps;

  private @Nullable String manIDM;

  private @Nullable String manGroup;

  private @Nullable String manGroupLong;

  public DriverProfileResponseOffersFromInner manName(@Nullable String manName) {
    this.manName = manName;
    return this;
  }

  /**
   * Get manName
   * @return manName
   */
  
  @JsonProperty("manName")
  public @Nullable String getManName() {
    return manName;
  }

  public void setManName(@Nullable String manName) {
    this.manName = manName;
  }

  public DriverProfileResponseOffersFromInner manChamps(@Nullable String manChamps) {
    this.manChamps = manChamps;
    return this;
  }

  /**
   * Get manChamps
   * @return manChamps
   */
  
  @JsonProperty("manChamps")
  public @Nullable String getManChamps() {
    return manChamps;
  }

  public void setManChamps(@Nullable String manChamps) {
    this.manChamps = manChamps;
  }

  public DriverProfileResponseOffersFromInner manIDM(@Nullable String manIDM) {
    this.manIDM = manIDM;
    return this;
  }

  /**
   * Get manIDM
   * @return manIDM
   */
  
  @JsonProperty("manIDM")
  public @Nullable String getManIDM() {
    return manIDM;
  }

  public void setManIDM(@Nullable String manIDM) {
    this.manIDM = manIDM;
  }

  public DriverProfileResponseOffersFromInner manGroup(@Nullable String manGroup) {
    this.manGroup = manGroup;
    return this;
  }

  /**
   * Get manGroup
   * @return manGroup
   */
  
  @JsonProperty("manGroup")
  public @Nullable String getManGroup() {
    return manGroup;
  }

  public void setManGroup(@Nullable String manGroup) {
    this.manGroup = manGroup;
  }

  public DriverProfileResponseOffersFromInner manGroupLong(@Nullable String manGroupLong) {
    this.manGroupLong = manGroupLong;
    return this;
  }

  /**
   * Get manGroupLong
   * @return manGroupLong
   */
  
  @JsonProperty("manGroupLong")
  public @Nullable String getManGroupLong() {
    return manGroupLong;
  }

  public void setManGroupLong(@Nullable String manGroupLong) {
    this.manGroupLong = manGroupLong;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponseOffersFromInner driverProfileResponseOffersFromInner = (DriverProfileResponseOffersFromInner) o;
    return Objects.equals(this.manName, driverProfileResponseOffersFromInner.manName) &&
        Objects.equals(this.manChamps, driverProfileResponseOffersFromInner.manChamps) &&
        Objects.equals(this.manIDM, driverProfileResponseOffersFromInner.manIDM) &&
        Objects.equals(this.manGroup, driverProfileResponseOffersFromInner.manGroup) &&
        Objects.equals(this.manGroupLong, driverProfileResponseOffersFromInner.manGroupLong);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manName, manChamps, manIDM, manGroup, manGroupLong);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseOffersFromInner {\n");
    sb.append("    manName: ").append(toIndentedString(manName)).append("\n");
    sb.append("    manChamps: ").append(toIndentedString(manChamps)).append("\n");
    sb.append("    manIDM: ").append(toIndentedString(manIDM)).append("\n");
    sb.append("    manGroup: ").append(toIndentedString(manGroup)).append("\n");
    sb.append("    manGroupLong: ").append(toIndentedString(manGroupLong)).append("\n");
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

