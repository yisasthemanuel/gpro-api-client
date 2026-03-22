package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NoDriverProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NoDriverProfileResponse implements GetDriverProfile200Response {

  private @Nullable String loadingDataState;

  private @Nullable String driName;

  private @Nullable Integer isSupporter;

  private @Nullable Integer driverNotFoundNote;

  private @Nullable Integer credits;

  private @Nullable Integer cash;

  public NoDriverProfileResponse loadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
    return this;
  }

  /**
   * Get loadingDataState
   * @return loadingDataState
   */
  
  @JsonProperty("loadingDataState")
  public @Nullable String getLoadingDataState() {
    return loadingDataState;
  }

  public void setLoadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
  }

  public NoDriverProfileResponse driName(@Nullable String driName) {
    this.driName = driName;
    return this;
  }

  /**
   * Get driName
   * @return driName
   */
  
  @JsonProperty("driName")
  public @Nullable String getDriName() {
    return driName;
  }

  public void setDriName(@Nullable String driName) {
    this.driName = driName;
  }

  public NoDriverProfileResponse isSupporter(@Nullable Integer isSupporter) {
    this.isSupporter = isSupporter;
    return this;
  }

  /**
   * Get isSupporter
   * @return isSupporter
   */
  
  @JsonProperty("isSupporter")
  public @Nullable Integer getIsSupporter() {
    return isSupporter;
  }

  public void setIsSupporter(@Nullable Integer isSupporter) {
    this.isSupporter = isSupporter;
  }

  public NoDriverProfileResponse driverNotFoundNote(@Nullable Integer driverNotFoundNote) {
    this.driverNotFoundNote = driverNotFoundNote;
    return this;
  }

  /**
   * Get driverNotFoundNote
   * @return driverNotFoundNote
   */
  
  @JsonProperty("driverNotFoundNote")
  public @Nullable Integer getDriverNotFoundNote() {
    return driverNotFoundNote;
  }

  public void setDriverNotFoundNote(@Nullable Integer driverNotFoundNote) {
    this.driverNotFoundNote = driverNotFoundNote;
  }

  public NoDriverProfileResponse credits(@Nullable Integer credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  
  @JsonProperty("credits")
  public @Nullable Integer getCredits() {
    return credits;
  }

  public void setCredits(@Nullable Integer credits) {
    this.credits = credits;
  }

  public NoDriverProfileResponse cash(@Nullable Integer cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Get cash
   * @return cash
   */
  
  @JsonProperty("cash")
  public @Nullable Integer getCash() {
    return cash;
  }

  public void setCash(@Nullable Integer cash) {
    this.cash = cash;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoDriverProfileResponse noDriverProfileResponse = (NoDriverProfileResponse) o;
    return Objects.equals(this.loadingDataState, noDriverProfileResponse.loadingDataState) &&
        Objects.equals(this.driName, noDriverProfileResponse.driName) &&
        Objects.equals(this.isSupporter, noDriverProfileResponse.isSupporter) &&
        Objects.equals(this.driverNotFoundNote, noDriverProfileResponse.driverNotFoundNote) &&
        Objects.equals(this.credits, noDriverProfileResponse.credits) &&
        Objects.equals(this.cash, noDriverProfileResponse.cash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, driName, isSupporter, driverNotFoundNote, credits, cash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoDriverProfileResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    driName: ").append(toIndentedString(driName)).append("\n");
    sb.append("    isSupporter: ").append(toIndentedString(isSupporter)).append("\n");
    sb.append("    driverNotFoundNote: ").append(toIndentedString(driverNotFoundNote)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
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

