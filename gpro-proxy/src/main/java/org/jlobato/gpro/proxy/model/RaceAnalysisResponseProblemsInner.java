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
 * RaceAnalysisResponseProblemsInner
 */

@JsonTypeName("RaceAnalysisResponse_problems_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseProblemsInner {

  private @Nullable Integer idx;

  private @Nullable Integer lap;

  private @Nullable String reason;

  public RaceAnalysisResponseProblemsInner idx(@Nullable Integer idx) {
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

  public RaceAnalysisResponseProblemsInner lap(@Nullable Integer lap) {
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

  public RaceAnalysisResponseProblemsInner reason(@Nullable String reason) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseProblemsInner raceAnalysisResponseProblemsInner = (RaceAnalysisResponseProblemsInner) o;
    return Objects.equals(this.idx, raceAnalysisResponseProblemsInner.idx) &&
        Objects.equals(this.lap, raceAnalysisResponseProblemsInner.lap) &&
        Objects.equals(this.reason, raceAnalysisResponseProblemsInner.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, lap, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseProblemsInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    lap: ").append(toIndentedString(lap)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

