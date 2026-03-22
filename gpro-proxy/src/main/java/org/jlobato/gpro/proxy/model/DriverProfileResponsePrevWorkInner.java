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
 * DriverProfileResponsePrevWorkInner
 */

@JsonTypeName("DriverProfileResponse_prevWork_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponsePrevWorkInner {

  private @Nullable String manName;

  private @Nullable String champs;

  private @Nullable String manIDM;

  private @Nullable String startedS;

  private @Nullable String startedR;

  private @Nullable Integer finishedS;

  private @Nullable Integer finishedR;

  public DriverProfileResponsePrevWorkInner manName(@Nullable String manName) {
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

  public DriverProfileResponsePrevWorkInner champs(@Nullable String champs) {
    this.champs = champs;
    return this;
  }

  /**
   * Get champs
   * @return champs
   */
  
  @JsonProperty("champs")
  public @Nullable String getChamps() {
    return champs;
  }

  public void setChamps(@Nullable String champs) {
    this.champs = champs;
  }

  public DriverProfileResponsePrevWorkInner manIDM(@Nullable String manIDM) {
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

  public DriverProfileResponsePrevWorkInner startedS(@Nullable String startedS) {
    this.startedS = startedS;
    return this;
  }

  /**
   * Get startedS
   * @return startedS
   */
  
  @JsonProperty("startedS")
  public @Nullable String getStartedS() {
    return startedS;
  }

  public void setStartedS(@Nullable String startedS) {
    this.startedS = startedS;
  }

  public DriverProfileResponsePrevWorkInner startedR(@Nullable String startedR) {
    this.startedR = startedR;
    return this;
  }

  /**
   * Get startedR
   * @return startedR
   */
  
  @JsonProperty("startedR")
  public @Nullable String getStartedR() {
    return startedR;
  }

  public void setStartedR(@Nullable String startedR) {
    this.startedR = startedR;
  }

  public DriverProfileResponsePrevWorkInner finishedS(@Nullable Integer finishedS) {
    this.finishedS = finishedS;
    return this;
  }

  /**
   * Get finishedS
   * @return finishedS
   */
  
  @JsonProperty("finishedS")
  public @Nullable Integer getFinishedS() {
    return finishedS;
  }

  public void setFinishedS(@Nullable Integer finishedS) {
    this.finishedS = finishedS;
  }

  public DriverProfileResponsePrevWorkInner finishedR(@Nullable Integer finishedR) {
    this.finishedR = finishedR;
    return this;
  }

  /**
   * Get finishedR
   * @return finishedR
   */
  
  @JsonProperty("finishedR")
  public @Nullable Integer getFinishedR() {
    return finishedR;
  }

  public void setFinishedR(@Nullable Integer finishedR) {
    this.finishedR = finishedR;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponsePrevWorkInner driverProfileResponsePrevWorkInner = (DriverProfileResponsePrevWorkInner) o;
    return Objects.equals(this.manName, driverProfileResponsePrevWorkInner.manName) &&
        Objects.equals(this.champs, driverProfileResponsePrevWorkInner.champs) &&
        Objects.equals(this.manIDM, driverProfileResponsePrevWorkInner.manIDM) &&
        Objects.equals(this.startedS, driverProfileResponsePrevWorkInner.startedS) &&
        Objects.equals(this.startedR, driverProfileResponsePrevWorkInner.startedR) &&
        Objects.equals(this.finishedS, driverProfileResponsePrevWorkInner.finishedS) &&
        Objects.equals(this.finishedR, driverProfileResponsePrevWorkInner.finishedR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manName, champs, manIDM, startedS, startedR, finishedS, finishedR);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponsePrevWorkInner {\n");
    sb.append("    manName: ").append(toIndentedString(manName)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    manIDM: ").append(toIndentedString(manIDM)).append("\n");
    sb.append("    startedS: ").append(toIndentedString(startedS)).append("\n");
    sb.append("    startedR: ").append(toIndentedString(startedR)).append("\n");
    sb.append("    finishedS: ").append(toIndentedString(finishedS)).append("\n");
    sb.append("    finishedR: ").append(toIndentedString(finishedR)).append("\n");
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

