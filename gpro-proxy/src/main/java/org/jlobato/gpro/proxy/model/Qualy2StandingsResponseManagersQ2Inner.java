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
 * Qualy2StandingsResponseManagersQ2Inner
 */

@JsonTypeName("Qualy2StandingsResponse_managersQ2_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class Qualy2StandingsResponseManagersQ2Inner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String tyre;

  private @Nullable Integer newQualifier;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable String champs;

  private @Nullable String lapTime;

  private @Nullable Integer separator;

  private @Nullable String gap;

  public Qualy2StandingsResponseManagersQ2Inner name(@Nullable String name) {
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

  public Qualy2StandingsResponseManagersQ2Inner pos(@Nullable String pos) {
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

  public Qualy2StandingsResponseManagersQ2Inner tyre(@Nullable String tyre) {
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

  public Qualy2StandingsResponseManagersQ2Inner newQualifier(@Nullable Integer newQualifier) {
    this.newQualifier = newQualifier;
    return this;
  }

  /**
   * Get newQualifier
   * @return newQualifier
   */
  
  @JsonProperty("newQualifier")
  public @Nullable Integer getNewQualifier() {
    return newQualifier;
  }

  public void setNewQualifier(@Nullable Integer newQualifier) {
    this.newQualifier = newQualifier;
  }

  public Qualy2StandingsResponseManagersQ2Inner natCode(@Nullable String natCode) {
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

  public Qualy2StandingsResponseManagersQ2Inner IDM(@Nullable Integer IDM) {
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

  public Qualy2StandingsResponseManagersQ2Inner champs(@Nullable String champs) {
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

  public Qualy2StandingsResponseManagersQ2Inner lapTime(@Nullable String lapTime) {
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

  public Qualy2StandingsResponseManagersQ2Inner separator(@Nullable Integer separator) {
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

  public Qualy2StandingsResponseManagersQ2Inner gap(@Nullable String gap) {
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
    Qualy2StandingsResponseManagersQ2Inner qualy2StandingsResponseManagersQ2Inner = (Qualy2StandingsResponseManagersQ2Inner) o;
    return Objects.equals(this.name, qualy2StandingsResponseManagersQ2Inner.name) &&
        Objects.equals(this.pos, qualy2StandingsResponseManagersQ2Inner.pos) &&
        Objects.equals(this.tyre, qualy2StandingsResponseManagersQ2Inner.tyre) &&
        Objects.equals(this.newQualifier, qualy2StandingsResponseManagersQ2Inner.newQualifier) &&
        Objects.equals(this.natCode, qualy2StandingsResponseManagersQ2Inner.natCode) &&
        Objects.equals(this.IDM, qualy2StandingsResponseManagersQ2Inner.IDM) &&
        Objects.equals(this.champs, qualy2StandingsResponseManagersQ2Inner.champs) &&
        Objects.equals(this.lapTime, qualy2StandingsResponseManagersQ2Inner.lapTime) &&
        Objects.equals(this.separator, qualy2StandingsResponseManagersQ2Inner.separator) &&
        Objects.equals(this.gap, qualy2StandingsResponseManagersQ2Inner.gap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, tyre, newQualifier, natCode, IDM, champs, lapTime, separator, gap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qualy2StandingsResponseManagersQ2Inner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    tyre: ").append(toIndentedString(tyre)).append("\n");
    sb.append("    newQualifier: ").append(toIndentedString(newQualifier)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    lapTime: ").append(toIndentedString(lapTime)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
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

