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
 * RaceAnalysisNAResponseRacesToSelectInner
 */

@JsonTypeName("RaceAnalysisNAResponse_racesToSelect_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisNAResponseRacesToSelectInner {

  private @Nullable String value;

  private @Nullable Integer season;

  private @Nullable Integer race;

  private @Nullable String trackName;

  private @Nullable String natCode;

  private @Nullable String group;

  public RaceAnalysisNAResponseRacesToSelectInner value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  public void setValue(@Nullable String value) {
    this.value = value;
  }

  public RaceAnalysisNAResponseRacesToSelectInner season(@Nullable Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
   */
  
  @JsonProperty("season")
  public @Nullable Integer getSeason() {
    return season;
  }

  public void setSeason(@Nullable Integer season) {
    this.season = season;
  }

  public RaceAnalysisNAResponseRacesToSelectInner race(@Nullable Integer race) {
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

  public RaceAnalysisNAResponseRacesToSelectInner trackName(@Nullable String trackName) {
    this.trackName = trackName;
    return this;
  }

  /**
   * Get trackName
   * @return trackName
   */
  
  @JsonProperty("trackName")
  public @Nullable String getTrackName() {
    return trackName;
  }

  public void setTrackName(@Nullable String trackName) {
    this.trackName = trackName;
  }

  public RaceAnalysisNAResponseRacesToSelectInner natCode(@Nullable String natCode) {
    this.natCode = natCode;
    return this;
  }

  /**
   * Get natCode
   * @return natCode
   */
  
  @JsonProperty("natCode")
  public @Nullable String getNatCode() {
    return natCode;
  }

  public void setNatCode(@Nullable String natCode) {
    this.natCode = natCode;
  }

  public RaceAnalysisNAResponseRacesToSelectInner group(@Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  
  @JsonProperty("group")
  public @Nullable String getGroup() {
    return group;
  }

  public void setGroup(@Nullable String group) {
    this.group = group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisNAResponseRacesToSelectInner raceAnalysisNAResponseRacesToSelectInner = (RaceAnalysisNAResponseRacesToSelectInner) o;
    return Objects.equals(this.value, raceAnalysisNAResponseRacesToSelectInner.value) &&
        Objects.equals(this.season, raceAnalysisNAResponseRacesToSelectInner.season) &&
        Objects.equals(this.race, raceAnalysisNAResponseRacesToSelectInner.race) &&
        Objects.equals(this.trackName, raceAnalysisNAResponseRacesToSelectInner.trackName) &&
        Objects.equals(this.natCode, raceAnalysisNAResponseRacesToSelectInner.natCode) &&
        Objects.equals(this.group, raceAnalysisNAResponseRacesToSelectInner.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, season, race, trackName, natCode, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisNAResponseRacesToSelectInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

