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
 * RaceAnalysisResponseChassis
 */

@JsonTypeName("RaceAnalysisResponse_chassis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseChassis {

  private @Nullable Integer lvl;

  private @Nullable Integer startWear;

  private @Nullable Integer finishWear;

  public RaceAnalysisResponseChassis lvl(@Nullable Integer lvl) {
    this.lvl = lvl;
    return this;
  }

  /**
   * Get lvl
   * @return lvl
   */
  
  @JsonProperty("lvl")
  public @Nullable Integer getLvl() {
    return lvl;
  }

  public void setLvl(@Nullable Integer lvl) {
    this.lvl = lvl;
  }

  public RaceAnalysisResponseChassis startWear(@Nullable Integer startWear) {
    this.startWear = startWear;
    return this;
  }

  /**
   * Get startWear
   * @return startWear
   */
  
  @JsonProperty("startWear")
  public @Nullable Integer getStartWear() {
    return startWear;
  }

  public void setStartWear(@Nullable Integer startWear) {
    this.startWear = startWear;
  }

  public RaceAnalysisResponseChassis finishWear(@Nullable Integer finishWear) {
    this.finishWear = finishWear;
    return this;
  }

  /**
   * Get finishWear
   * @return finishWear
   */
  
  @JsonProperty("finishWear")
  public @Nullable Integer getFinishWear() {
    return finishWear;
  }

  public void setFinishWear(@Nullable Integer finishWear) {
    this.finishWear = finishWear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseChassis raceAnalysisResponseChassis = (RaceAnalysisResponseChassis) o;
    return Objects.equals(this.lvl, raceAnalysisResponseChassis.lvl) &&
        Objects.equals(this.startWear, raceAnalysisResponseChassis.startWear) &&
        Objects.equals(this.finishWear, raceAnalysisResponseChassis.finishWear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lvl, startWear, finishWear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseChassis {\n");
    sb.append("    lvl: ").append(toIndentedString(lvl)).append("\n");
    sb.append("    startWear: ").append(toIndentedString(startWear)).append("\n");
    sb.append("    finishWear: ").append(toIndentedString(finishWear)).append("\n");
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

