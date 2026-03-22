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
 * RaceAnalysisResponsePitsInner
 */

@JsonTypeName("RaceAnalysisResponse_pits_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponsePitsInner {

  private @Nullable Integer idx;

  private @Nullable Integer lap;

  private @Nullable String reason;

  private @Nullable Integer tyreCond;

  private @Nullable Integer fuelLeft;

  private @Nullable Integer refilledTo;

  private @Nullable String pitTime;

  public RaceAnalysisResponsePitsInner idx(@Nullable Integer idx) {
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  
  @JsonProperty("idx")
  public @Nullable Integer getIdx() {
    return idx;
  }

  public void setIdx(@Nullable Integer idx) {
    this.idx = idx;
  }

  public RaceAnalysisResponsePitsInner lap(@Nullable Integer lap) {
    this.lap = lap;
    return this;
  }

  /**
   * Get lap
   * @return lap
   */
  
  @JsonProperty("lap")
  public @Nullable Integer getLap() {
    return lap;
  }

  public void setLap(@Nullable Integer lap) {
    this.lap = lap;
  }

  public RaceAnalysisResponsePitsInner reason(@Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  
  @JsonProperty("reason")
  public @Nullable String getReason() {
    return reason;
  }

  public void setReason(@Nullable String reason) {
    this.reason = reason;
  }

  public RaceAnalysisResponsePitsInner tyreCond(@Nullable Integer tyreCond) {
    this.tyreCond = tyreCond;
    return this;
  }

  /**
   * Get tyreCond
   * @return tyreCond
   */
  
  @JsonProperty("tyreCond")
  public @Nullable Integer getTyreCond() {
    return tyreCond;
  }

  public void setTyreCond(@Nullable Integer tyreCond) {
    this.tyreCond = tyreCond;
  }

  public RaceAnalysisResponsePitsInner fuelLeft(@Nullable Integer fuelLeft) {
    this.fuelLeft = fuelLeft;
    return this;
  }

  /**
   * Get fuelLeft
   * @return fuelLeft
   */
  
  @JsonProperty("fuelLeft")
  public @Nullable Integer getFuelLeft() {
    return fuelLeft;
  }

  public void setFuelLeft(@Nullable Integer fuelLeft) {
    this.fuelLeft = fuelLeft;
  }

  public RaceAnalysisResponsePitsInner refilledTo(@Nullable Integer refilledTo) {
    this.refilledTo = refilledTo;
    return this;
  }

  /**
   * Get refilledTo
   * @return refilledTo
   */
  
  @JsonProperty("refilledTo")
  public @Nullable Integer getRefilledTo() {
    return refilledTo;
  }

  public void setRefilledTo(@Nullable Integer refilledTo) {
    this.refilledTo = refilledTo;
  }

  public RaceAnalysisResponsePitsInner pitTime(@Nullable String pitTime) {
    this.pitTime = pitTime;
    return this;
  }

  /**
   * Get pitTime
   * @return pitTime
   */
  
  @JsonProperty("pitTime")
  public @Nullable String getPitTime() {
    return pitTime;
  }

  public void setPitTime(@Nullable String pitTime) {
    this.pitTime = pitTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponsePitsInner raceAnalysisResponsePitsInner = (RaceAnalysisResponsePitsInner) o;
    return Objects.equals(this.idx, raceAnalysisResponsePitsInner.idx) &&
        Objects.equals(this.lap, raceAnalysisResponsePitsInner.lap) &&
        Objects.equals(this.reason, raceAnalysisResponsePitsInner.reason) &&
        Objects.equals(this.tyreCond, raceAnalysisResponsePitsInner.tyreCond) &&
        Objects.equals(this.fuelLeft, raceAnalysisResponsePitsInner.fuelLeft) &&
        Objects.equals(this.refilledTo, raceAnalysisResponsePitsInner.refilledTo) &&
        Objects.equals(this.pitTime, raceAnalysisResponsePitsInner.pitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, lap, reason, tyreCond, fuelLeft, refilledTo, pitTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponsePitsInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    lap: ").append(toIndentedString(lap)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    tyreCond: ").append(toIndentedString(tyreCond)).append("\n");
    sb.append("    fuelLeft: ").append(toIndentedString(fuelLeft)).append("\n");
    sb.append("    refilledTo: ").append(toIndentedString(refilledTo)).append("\n");
    sb.append("    pitTime: ").append(toIndentedString(pitTime)).append("\n");
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

