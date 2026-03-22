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
 * RaceAnalysisResponseRacesToSelectInner
 */

@JsonTypeName("RaceAnalysisResponse_racesToSelect_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseRacesToSelectInner {

  private @Nullable String value;

  private @Nullable Integer season;

  private @Nullable Integer race;

  private @Nullable String trackName;

  private @Nullable String natCode;

  private @Nullable Integer unlocked;

  private @Nullable String group;

  public RaceAnalysisResponseRacesToSelectInner value(@Nullable String value) {
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

  public RaceAnalysisResponseRacesToSelectInner season(@Nullable Integer season) {
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

  public RaceAnalysisResponseRacesToSelectInner race(@Nullable Integer race) {
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

  public RaceAnalysisResponseRacesToSelectInner trackName(@Nullable String trackName) {
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

  public RaceAnalysisResponseRacesToSelectInner natCode(@Nullable String natCode) {
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

  public RaceAnalysisResponseRacesToSelectInner unlocked(@Nullable Integer unlocked) {
    this.unlocked = unlocked;
    return this;
  }

  /**
   * Get unlocked
   * @return unlocked
   */
  
  @JsonProperty("unlocked")
  public @Nullable Integer getUnlocked() {
    return unlocked;
  }

  public void setUnlocked(@Nullable Integer unlocked) {
    this.unlocked = unlocked;
  }

  public RaceAnalysisResponseRacesToSelectInner group(@Nullable String group) {
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
    RaceAnalysisResponseRacesToSelectInner raceAnalysisResponseRacesToSelectInner = (RaceAnalysisResponseRacesToSelectInner) o;
    return Objects.equals(this.value, raceAnalysisResponseRacesToSelectInner.value) &&
        Objects.equals(this.season, raceAnalysisResponseRacesToSelectInner.season) &&
        Objects.equals(this.race, raceAnalysisResponseRacesToSelectInner.race) &&
        Objects.equals(this.trackName, raceAnalysisResponseRacesToSelectInner.trackName) &&
        Objects.equals(this.natCode, raceAnalysisResponseRacesToSelectInner.natCode) &&
        Objects.equals(this.unlocked, raceAnalysisResponseRacesToSelectInner.unlocked) &&
        Objects.equals(this.group, raceAnalysisResponseRacesToSelectInner.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, season, race, trackName, natCode, unlocked, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseRacesToSelectInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    unlocked: ").append(toIndentedString(unlocked)).append("\n");
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

