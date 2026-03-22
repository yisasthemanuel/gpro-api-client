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
 * CCPsHistoryResponseDataInner
 */

@JsonTypeName("CCPsHistoryResponse_data_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class CCPsHistoryResponseDataInner {

  private @Nullable Integer race;

  private @Nullable Integer power;

  private @Nullable String powerChange;

  private @Nullable Integer handl;

  private @Nullable String handlChange;

  private @Nullable Integer accel;

  private @Nullable String accelChange;

  private @Nullable Integer tPower;

  private @Nullable String tPowerChange;

  private @Nullable Integer tHandl;

  private @Nullable String tHandlChange;

  private @Nullable Integer tAccel;

  private @Nullable String tAccelChange;

  private @Nullable Integer testLaps;

  public CCPsHistoryResponseDataInner race(@Nullable Integer race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
   */
  
  @JsonProperty("race")
  public @Nullable Integer getRace() {
    return race;
  }

  public void setRace(@Nullable Integer race) {
    this.race = race;
  }

  public CCPsHistoryResponseDataInner power(@Nullable Integer power) {
    this.power = power;
    return this;
  }

  /**
   * Get power
   * @return power
   */
  
  @JsonProperty("power")
  public @Nullable Integer getPower() {
    return power;
  }

  public void setPower(@Nullable Integer power) {
    this.power = power;
  }

  public CCPsHistoryResponseDataInner powerChange(@Nullable String powerChange) {
    this.powerChange = powerChange;
    return this;
  }

  /**
   * Get powerChange
   * @return powerChange
   */
  
  @JsonProperty("powerChange")
  public @Nullable String getPowerChange() {
    return powerChange;
  }

  public void setPowerChange(@Nullable String powerChange) {
    this.powerChange = powerChange;
  }

  public CCPsHistoryResponseDataInner handl(@Nullable Integer handl) {
    this.handl = handl;
    return this;
  }

  /**
   * Get handl
   * @return handl
   */
  
  @JsonProperty("handl")
  public @Nullable Integer getHandl() {
    return handl;
  }

  public void setHandl(@Nullable Integer handl) {
    this.handl = handl;
  }

  public CCPsHistoryResponseDataInner handlChange(@Nullable String handlChange) {
    this.handlChange = handlChange;
    return this;
  }

  /**
   * Get handlChange
   * @return handlChange
   */
  
  @JsonProperty("handlChange")
  public @Nullable String getHandlChange() {
    return handlChange;
  }

  public void setHandlChange(@Nullable String handlChange) {
    this.handlChange = handlChange;
  }

  public CCPsHistoryResponseDataInner accel(@Nullable Integer accel) {
    this.accel = accel;
    return this;
  }

  /**
   * Get accel
   * @return accel
   */
  
  @JsonProperty("accel")
  public @Nullable Integer getAccel() {
    return accel;
  }

  public void setAccel(@Nullable Integer accel) {
    this.accel = accel;
  }

  public CCPsHistoryResponseDataInner accelChange(@Nullable String accelChange) {
    this.accelChange = accelChange;
    return this;
  }

  /**
   * Get accelChange
   * @return accelChange
   */
  
  @JsonProperty("accelChange")
  public @Nullable String getAccelChange() {
    return accelChange;
  }

  public void setAccelChange(@Nullable String accelChange) {
    this.accelChange = accelChange;
  }

  public CCPsHistoryResponseDataInner tPower(@Nullable Integer tPower) {
    this.tPower = tPower;
    return this;
  }

  /**
   * Get tPower
   * @return tPower
   */
  
  @JsonProperty("tPower")
  public @Nullable Integer gettPower() {
    return tPower;
  }

  public void settPower(@Nullable Integer tPower) {
    this.tPower = tPower;
  }

  public CCPsHistoryResponseDataInner tPowerChange(@Nullable String tPowerChange) {
    this.tPowerChange = tPowerChange;
    return this;
  }

  /**
   * Get tPowerChange
   * @return tPowerChange
   */
  
  @JsonProperty("tPowerChange")
  public @Nullable String gettPowerChange() {
    return tPowerChange;
  }

  public void settPowerChange(@Nullable String tPowerChange) {
    this.tPowerChange = tPowerChange;
  }

  public CCPsHistoryResponseDataInner tHandl(@Nullable Integer tHandl) {
    this.tHandl = tHandl;
    return this;
  }

  /**
   * Get tHandl
   * @return tHandl
   */
  
  @JsonProperty("tHandl")
  public @Nullable Integer gettHandl() {
    return tHandl;
  }

  public void settHandl(@Nullable Integer tHandl) {
    this.tHandl = tHandl;
  }

  public CCPsHistoryResponseDataInner tHandlChange(@Nullable String tHandlChange) {
    this.tHandlChange = tHandlChange;
    return this;
  }

  /**
   * Get tHandlChange
   * @return tHandlChange
   */
  
  @JsonProperty("tHandlChange")
  public @Nullable String gettHandlChange() {
    return tHandlChange;
  }

  public void settHandlChange(@Nullable String tHandlChange) {
    this.tHandlChange = tHandlChange;
  }

  public CCPsHistoryResponseDataInner tAccel(@Nullable Integer tAccel) {
    this.tAccel = tAccel;
    return this;
  }

  /**
   * Get tAccel
   * @return tAccel
   */
  
  @JsonProperty("tAccel")
  public @Nullable Integer gettAccel() {
    return tAccel;
  }

  public void settAccel(@Nullable Integer tAccel) {
    this.tAccel = tAccel;
  }

  public CCPsHistoryResponseDataInner tAccelChange(@Nullable String tAccelChange) {
    this.tAccelChange = tAccelChange;
    return this;
  }

  /**
   * Get tAccelChange
   * @return tAccelChange
   */
  
  @JsonProperty("tAccelChange")
  public @Nullable String gettAccelChange() {
    return tAccelChange;
  }

  public void settAccelChange(@Nullable String tAccelChange) {
    this.tAccelChange = tAccelChange;
  }

  public CCPsHistoryResponseDataInner testLaps(@Nullable Integer testLaps) {
    this.testLaps = testLaps;
    return this;
  }

  /**
   * Get testLaps
   * @return testLaps
   */
  
  @JsonProperty("testLaps")
  public @Nullable Integer getTestLaps() {
    return testLaps;
  }

  public void setTestLaps(@Nullable Integer testLaps) {
    this.testLaps = testLaps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CCPsHistoryResponseDataInner ccPsHistoryResponseDataInner = (CCPsHistoryResponseDataInner) o;
    return Objects.equals(this.race, ccPsHistoryResponseDataInner.race) &&
        Objects.equals(this.power, ccPsHistoryResponseDataInner.power) &&
        Objects.equals(this.powerChange, ccPsHistoryResponseDataInner.powerChange) &&
        Objects.equals(this.handl, ccPsHistoryResponseDataInner.handl) &&
        Objects.equals(this.handlChange, ccPsHistoryResponseDataInner.handlChange) &&
        Objects.equals(this.accel, ccPsHistoryResponseDataInner.accel) &&
        Objects.equals(this.accelChange, ccPsHistoryResponseDataInner.accelChange) &&
        Objects.equals(this.tPower, ccPsHistoryResponseDataInner.tPower) &&
        Objects.equals(this.tPowerChange, ccPsHistoryResponseDataInner.tPowerChange) &&
        Objects.equals(this.tHandl, ccPsHistoryResponseDataInner.tHandl) &&
        Objects.equals(this.tHandlChange, ccPsHistoryResponseDataInner.tHandlChange) &&
        Objects.equals(this.tAccel, ccPsHistoryResponseDataInner.tAccel) &&
        Objects.equals(this.tAccelChange, ccPsHistoryResponseDataInner.tAccelChange) &&
        Objects.equals(this.testLaps, ccPsHistoryResponseDataInner.testLaps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(race, power, powerChange, handl, handlChange, accel, accelChange, tPower, tPowerChange, tHandl, tHandlChange, tAccel, tAccelChange, testLaps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CCPsHistoryResponseDataInner {\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    powerChange: ").append(toIndentedString(powerChange)).append("\n");
    sb.append("    handl: ").append(toIndentedString(handl)).append("\n");
    sb.append("    handlChange: ").append(toIndentedString(handlChange)).append("\n");
    sb.append("    accel: ").append(toIndentedString(accel)).append("\n");
    sb.append("    accelChange: ").append(toIndentedString(accelChange)).append("\n");
    sb.append("    tPower: ").append(toIndentedString(tPower)).append("\n");
    sb.append("    tPowerChange: ").append(toIndentedString(tPowerChange)).append("\n");
    sb.append("    tHandl: ").append(toIndentedString(tHandl)).append("\n");
    sb.append("    tHandlChange: ").append(toIndentedString(tHandlChange)).append("\n");
    sb.append("    tAccel: ").append(toIndentedString(tAccel)).append("\n");
    sb.append("    tAccelChange: ").append(toIndentedString(tAccelChange)).append("\n");
    sb.append("    testLaps: ").append(toIndentedString(testLaps)).append("\n");
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

