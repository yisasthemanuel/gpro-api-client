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
 * TestingStandingsResponseManagersInner
 */

@JsonTypeName("TestingStandingsResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TestingStandingsResponseManagersInner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String tyre;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable Integer champs;

  private @Nullable String lapTime;

  private @Nullable Integer separator;

  private @Nullable Integer laps;

  private @Nullable String gap;

  public TestingStandingsResponseManagersInner name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TestingStandingsResponseManagersInner pos(@Nullable String pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
   */
  
  @JsonProperty("pos")
  public @Nullable String getPos() {
    return pos;
  }

  public void setPos(@Nullable String pos) {
    this.pos = pos;
  }

  public TestingStandingsResponseManagersInner tyre(@Nullable String tyre) {
    this.tyre = tyre;
    return this;
  }

  /**
   * Get tyre
   * @return tyre
   */
  
  @JsonProperty("tyre")
  public @Nullable String getTyre() {
    return tyre;
  }

  public void setTyre(@Nullable String tyre) {
    this.tyre = tyre;
  }

  public TestingStandingsResponseManagersInner natCode(@Nullable String natCode) {
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

  public TestingStandingsResponseManagersInner IDM(@Nullable Integer IDM) {
    this.IDM = IDM;
    return this;
  }

  /**
   * Get IDM
   * @return IDM
   */
  
  @JsonProperty("IDM")
  public @Nullable Integer getIDM() {
    return IDM;
  }

  public void setIDM(@Nullable Integer IDM) {
    this.IDM = IDM;
  }

  public TestingStandingsResponseManagersInner champs(@Nullable Integer champs) {
    this.champs = champs;
    return this;
  }

  /**
   * Get champs
   * @return champs
   */
  
  @JsonProperty("champs")
  public @Nullable Integer getChamps() {
    return champs;
  }

  public void setChamps(@Nullable Integer champs) {
    this.champs = champs;
  }

  public TestingStandingsResponseManagersInner lapTime(@Nullable String lapTime) {
    this.lapTime = lapTime;
    return this;
  }

  /**
   * Get lapTime
   * @return lapTime
   */
  
  @JsonProperty("lapTime")
  public @Nullable String getLapTime() {
    return lapTime;
  }

  public void setLapTime(@Nullable String lapTime) {
    this.lapTime = lapTime;
  }

  public TestingStandingsResponseManagersInner separator(@Nullable Integer separator) {
    this.separator = separator;
    return this;
  }

  /**
   * Get separator
   * @return separator
   */
  
  @JsonProperty("separator")
  public @Nullable Integer getSeparator() {
    return separator;
  }

  public void setSeparator(@Nullable Integer separator) {
    this.separator = separator;
  }

  public TestingStandingsResponseManagersInner laps(@Nullable Integer laps) {
    this.laps = laps;
    return this;
  }

  /**
   * Get laps
   * @return laps
   */
  
  @JsonProperty("laps")
  public @Nullable Integer getLaps() {
    return laps;
  }

  public void setLaps(@Nullable Integer laps) {
    this.laps = laps;
  }

  public TestingStandingsResponseManagersInner gap(@Nullable String gap) {
    this.gap = gap;
    return this;
  }

  /**
   * Get gap
   * @return gap
   */
  
  @JsonProperty("gap")
  public @Nullable String getGap() {
    return gap;
  }

  public void setGap(@Nullable String gap) {
    this.gap = gap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestingStandingsResponseManagersInner testingStandingsResponseManagersInner = (TestingStandingsResponseManagersInner) o;
    return Objects.equals(this.name, testingStandingsResponseManagersInner.name) &&
        Objects.equals(this.pos, testingStandingsResponseManagersInner.pos) &&
        Objects.equals(this.tyre, testingStandingsResponseManagersInner.tyre) &&
        Objects.equals(this.natCode, testingStandingsResponseManagersInner.natCode) &&
        Objects.equals(this.IDM, testingStandingsResponseManagersInner.IDM) &&
        Objects.equals(this.champs, testingStandingsResponseManagersInner.champs) &&
        Objects.equals(this.lapTime, testingStandingsResponseManagersInner.lapTime) &&
        Objects.equals(this.separator, testingStandingsResponseManagersInner.separator) &&
        Objects.equals(this.laps, testingStandingsResponseManagersInner.laps) &&
        Objects.equals(this.gap, testingStandingsResponseManagersInner.gap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, tyre, natCode, IDM, champs, lapTime, separator, laps, gap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestingStandingsResponseManagersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    tyre: ").append(toIndentedString(tyre)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    lapTime: ").append(toIndentedString(lapTime)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    laps: ").append(toIndentedString(laps)).append("\n");
    sb.append("    gap: ").append(toIndentedString(gap)).append("\n");
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

