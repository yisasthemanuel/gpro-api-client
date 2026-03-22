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
 * StartingGridResponseManagersSGInner
 */

@JsonTypeName("StartingGridResponse_managersSG_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StartingGridResponseManagersSGInner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String tyre;

  private @Nullable String teamName;

  private @Nullable Integer teamId;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable Integer newQualifier;

  private @Nullable String champs;

  private @Nullable String lapTime;

  private @Nullable String liveryId;

  private @Nullable String liveryOldDisplayStyle;

  private @Nullable String topLayer;

  private @Nullable String picPath;

  private @Nullable String points;

  private @Nullable Integer separator;

  private @Nullable String gap;

  public StartingGridResponseManagersSGInner name(@Nullable String name) {
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

  public StartingGridResponseManagersSGInner pos(@Nullable String pos) {
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

  public StartingGridResponseManagersSGInner tyre(@Nullable String tyre) {
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

  public StartingGridResponseManagersSGInner teamName(@Nullable String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
   */
  
  @JsonProperty("teamName")
  public @Nullable String getTeamName() {
    return teamName;
  }

  public void setTeamName(@Nullable String teamName) {
    this.teamName = teamName;
  }

  public StartingGridResponseManagersSGInner teamId(@Nullable Integer teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   */
  
  @JsonProperty("teamId")
  public @Nullable Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(@Nullable Integer teamId) {
    this.teamId = teamId;
  }

  public StartingGridResponseManagersSGInner natCode(@Nullable String natCode) {
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

  public StartingGridResponseManagersSGInner IDM(@Nullable Integer IDM) {
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

  public StartingGridResponseManagersSGInner newQualifier(@Nullable Integer newQualifier) {
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

  public StartingGridResponseManagersSGInner champs(@Nullable String champs) {
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

  public StartingGridResponseManagersSGInner lapTime(@Nullable String lapTime) {
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

  public StartingGridResponseManagersSGInner liveryId(@Nullable String liveryId) {
    this.liveryId = liveryId;
    return this;
  }

  /**
   * Get liveryId
   * @return liveryId
   */
  
  @JsonProperty("liveryId")
  public @Nullable String getLiveryId() {
    return liveryId;
  }

  public void setLiveryId(@Nullable String liveryId) {
    this.liveryId = liveryId;
  }

  public StartingGridResponseManagersSGInner liveryOldDisplayStyle(@Nullable String liveryOldDisplayStyle) {
    this.liveryOldDisplayStyle = liveryOldDisplayStyle;
    return this;
  }

  /**
   * Get liveryOldDisplayStyle
   * @return liveryOldDisplayStyle
   */
  
  @JsonProperty("liveryOldDisplayStyle")
  public @Nullable String getLiveryOldDisplayStyle() {
    return liveryOldDisplayStyle;
  }

  public void setLiveryOldDisplayStyle(@Nullable String liveryOldDisplayStyle) {
    this.liveryOldDisplayStyle = liveryOldDisplayStyle;
  }

  public StartingGridResponseManagersSGInner topLayer(@Nullable String topLayer) {
    this.topLayer = topLayer;
    return this;
  }

  /**
   * Get topLayer
   * @return topLayer
   */
  
  @JsonProperty("topLayer")
  public @Nullable String getTopLayer() {
    return topLayer;
  }

  public void setTopLayer(@Nullable String topLayer) {
    this.topLayer = topLayer;
  }

  public StartingGridResponseManagersSGInner picPath(@Nullable String picPath) {
    this.picPath = picPath;
    return this;
  }

  /**
   * Get picPath
   * @return picPath
   */
  
  @JsonProperty("picPath")
  public @Nullable String getPicPath() {
    return picPath;
  }

  public void setPicPath(@Nullable String picPath) {
    this.picPath = picPath;
  }

  public StartingGridResponseManagersSGInner points(@Nullable String points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @JsonProperty("points")
  public @Nullable String getPoints() {
    return points;
  }

  public void setPoints(@Nullable String points) {
    this.points = points;
  }

  public StartingGridResponseManagersSGInner separator(@Nullable Integer separator) {
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

  public StartingGridResponseManagersSGInner gap(@Nullable String gap) {
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
    StartingGridResponseManagersSGInner startingGridResponseManagersSGInner = (StartingGridResponseManagersSGInner) o;
    return Objects.equals(this.name, startingGridResponseManagersSGInner.name) &&
        Objects.equals(this.pos, startingGridResponseManagersSGInner.pos) &&
        Objects.equals(this.tyre, startingGridResponseManagersSGInner.tyre) &&
        Objects.equals(this.teamName, startingGridResponseManagersSGInner.teamName) &&
        Objects.equals(this.teamId, startingGridResponseManagersSGInner.teamId) &&
        Objects.equals(this.natCode, startingGridResponseManagersSGInner.natCode) &&
        Objects.equals(this.IDM, startingGridResponseManagersSGInner.IDM) &&
        Objects.equals(this.newQualifier, startingGridResponseManagersSGInner.newQualifier) &&
        Objects.equals(this.champs, startingGridResponseManagersSGInner.champs) &&
        Objects.equals(this.lapTime, startingGridResponseManagersSGInner.lapTime) &&
        Objects.equals(this.liveryId, startingGridResponseManagersSGInner.liveryId) &&
        Objects.equals(this.liveryOldDisplayStyle, startingGridResponseManagersSGInner.liveryOldDisplayStyle) &&
        Objects.equals(this.topLayer, startingGridResponseManagersSGInner.topLayer) &&
        Objects.equals(this.picPath, startingGridResponseManagersSGInner.picPath) &&
        Objects.equals(this.points, startingGridResponseManagersSGInner.points) &&
        Objects.equals(this.separator, startingGridResponseManagersSGInner.separator) &&
        Objects.equals(this.gap, startingGridResponseManagersSGInner.gap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, tyre, teamName, teamId, natCode, IDM, newQualifier, champs, lapTime, liveryId, liveryOldDisplayStyle, topLayer, picPath, points, separator, gap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartingGridResponseManagersSGInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    tyre: ").append(toIndentedString(tyre)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    newQualifier: ").append(toIndentedString(newQualifier)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    lapTime: ").append(toIndentedString(lapTime)).append("\n");
    sb.append("    liveryId: ").append(toIndentedString(liveryId)).append("\n");
    sb.append("    liveryOldDisplayStyle: ").append(toIndentedString(liveryOldDisplayStyle)).append("\n");
    sb.append("    topLayer: ").append(toIndentedString(topLayer)).append("\n");
    sb.append("    picPath: ").append(toIndentedString(picPath)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

