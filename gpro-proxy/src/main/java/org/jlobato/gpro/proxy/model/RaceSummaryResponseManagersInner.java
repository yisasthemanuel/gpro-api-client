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
 * RaceSummaryResponseManagersInner
 */

@JsonTypeName("RaceSummaryResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceSummaryResponseManagersInner {

  private @Nullable String name;

  private @Nullable String idx;

  private @Nullable String pos;

  private @Nullable Integer progress;

  private @Nullable String tyre;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable String raceTime;

  private @Nullable String lapsCompleted;

  private @Nullable String pitStops;

  private @Nullable String bestLapTime;

  private @Nullable Integer bestLapTimeRaw;

  private @Nullable String bestLapColor;

  private @Nullable String avgSpeed;

  private @Nullable String bestPitTime;

  private @Nullable String bestPitColor;

  private @Nullable String champs;

  private @Nullable Integer classified;

  private @Nullable Integer firstNotClassified;

  public RaceSummaryResponseManagersInner name(@Nullable String name) {
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

  public RaceSummaryResponseManagersInner idx(@Nullable String idx) {
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  
  @JsonProperty("idx")
  public @Nullable String getIdx() {
    return idx;
  }

  public void setIdx(@Nullable String idx) {
    this.idx = idx;
  }

  public RaceSummaryResponseManagersInner pos(@Nullable String pos) {
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

  public RaceSummaryResponseManagersInner progress(@Nullable Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  
  @JsonProperty("progress")
  public @Nullable Integer getProgress() {
    return progress;
  }

  public void setProgress(@Nullable Integer progress) {
    this.progress = progress;
  }

  public RaceSummaryResponseManagersInner tyre(@Nullable String tyre) {
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

  public RaceSummaryResponseManagersInner natCode(@Nullable String natCode) {
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

  public RaceSummaryResponseManagersInner IDM(@Nullable Integer IDM) {
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

  public RaceSummaryResponseManagersInner raceTime(@Nullable String raceTime) {
    this.raceTime = raceTime;
    return this;
  }

  /**
   * Get raceTime
   * @return raceTime
   */
  
  @JsonProperty("raceTime")
  public @Nullable String getRaceTime() {
    return raceTime;
  }

  public void setRaceTime(@Nullable String raceTime) {
    this.raceTime = raceTime;
  }

  public RaceSummaryResponseManagersInner lapsCompleted(@Nullable String lapsCompleted) {
    this.lapsCompleted = lapsCompleted;
    return this;
  }

  /**
   * Get lapsCompleted
   * @return lapsCompleted
   */
  
  @JsonProperty("lapsCompleted")
  public @Nullable String getLapsCompleted() {
    return lapsCompleted;
  }

  public void setLapsCompleted(@Nullable String lapsCompleted) {
    this.lapsCompleted = lapsCompleted;
  }

  public RaceSummaryResponseManagersInner pitStops(@Nullable String pitStops) {
    this.pitStops = pitStops;
    return this;
  }

  /**
   * Get pitStops
   * @return pitStops
   */
  
  @JsonProperty("pitStops")
  public @Nullable String getPitStops() {
    return pitStops;
  }

  public void setPitStops(@Nullable String pitStops) {
    this.pitStops = pitStops;
  }

  public RaceSummaryResponseManagersInner bestLapTime(@Nullable String bestLapTime) {
    this.bestLapTime = bestLapTime;
    return this;
  }

  /**
   * Get bestLapTime
   * @return bestLapTime
   */
  
  @JsonProperty("bestLapTime")
  public @Nullable String getBestLapTime() {
    return bestLapTime;
  }

  public void setBestLapTime(@Nullable String bestLapTime) {
    this.bestLapTime = bestLapTime;
  }

  public RaceSummaryResponseManagersInner bestLapTimeRaw(@Nullable Integer bestLapTimeRaw) {
    this.bestLapTimeRaw = bestLapTimeRaw;
    return this;
  }

  /**
   * Get bestLapTimeRaw
   * @return bestLapTimeRaw
   */
  
  @JsonProperty("bestLapTimeRaw")
  public @Nullable Integer getBestLapTimeRaw() {
    return bestLapTimeRaw;
  }

  public void setBestLapTimeRaw(@Nullable Integer bestLapTimeRaw) {
    this.bestLapTimeRaw = bestLapTimeRaw;
  }

  public RaceSummaryResponseManagersInner bestLapColor(@Nullable String bestLapColor) {
    this.bestLapColor = bestLapColor;
    return this;
  }

  /**
   * Get bestLapColor
   * @return bestLapColor
   */
  
  @JsonProperty("bestLapColor")
  public @Nullable String getBestLapColor() {
    return bestLapColor;
  }

  public void setBestLapColor(@Nullable String bestLapColor) {
    this.bestLapColor = bestLapColor;
  }

  public RaceSummaryResponseManagersInner avgSpeed(@Nullable String avgSpeed) {
    this.avgSpeed = avgSpeed;
    return this;
  }

  /**
   * Get avgSpeed
   * @return avgSpeed
   */
  
  @JsonProperty("avgSpeed")
  public @Nullable String getAvgSpeed() {
    return avgSpeed;
  }

  public void setAvgSpeed(@Nullable String avgSpeed) {
    this.avgSpeed = avgSpeed;
  }

  public RaceSummaryResponseManagersInner bestPitTime(@Nullable String bestPitTime) {
    this.bestPitTime = bestPitTime;
    return this;
  }

  /**
   * Get bestPitTime
   * @return bestPitTime
   */
  
  @JsonProperty("bestPitTime")
  public @Nullable String getBestPitTime() {
    return bestPitTime;
  }

  public void setBestPitTime(@Nullable String bestPitTime) {
    this.bestPitTime = bestPitTime;
  }

  public RaceSummaryResponseManagersInner bestPitColor(@Nullable String bestPitColor) {
    this.bestPitColor = bestPitColor;
    return this;
  }

  /**
   * Get bestPitColor
   * @return bestPitColor
   */
  
  @JsonProperty("bestPitColor")
  public @Nullable String getBestPitColor() {
    return bestPitColor;
  }

  public void setBestPitColor(@Nullable String bestPitColor) {
    this.bestPitColor = bestPitColor;
  }

  public RaceSummaryResponseManagersInner champs(@Nullable String champs) {
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

  public RaceSummaryResponseManagersInner classified(@Nullable Integer classified) {
    this.classified = classified;
    return this;
  }

  /**
   * Get classified
   * @return classified
   */
  
  @JsonProperty("classified")
  public @Nullable Integer getClassified() {
    return classified;
  }

  public void setClassified(@Nullable Integer classified) {
    this.classified = classified;
  }

  public RaceSummaryResponseManagersInner firstNotClassified(@Nullable Integer firstNotClassified) {
    this.firstNotClassified = firstNotClassified;
    return this;
  }

  /**
   * Get firstNotClassified
   * @return firstNotClassified
   */
  
  @JsonProperty("firstNotClassified")
  public @Nullable Integer getFirstNotClassified() {
    return firstNotClassified;
  }

  public void setFirstNotClassified(@Nullable Integer firstNotClassified) {
    this.firstNotClassified = firstNotClassified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceSummaryResponseManagersInner raceSummaryResponseManagersInner = (RaceSummaryResponseManagersInner) o;
    return Objects.equals(this.name, raceSummaryResponseManagersInner.name) &&
        Objects.equals(this.idx, raceSummaryResponseManagersInner.idx) &&
        Objects.equals(this.pos, raceSummaryResponseManagersInner.pos) &&
        Objects.equals(this.progress, raceSummaryResponseManagersInner.progress) &&
        Objects.equals(this.tyre, raceSummaryResponseManagersInner.tyre) &&
        Objects.equals(this.natCode, raceSummaryResponseManagersInner.natCode) &&
        Objects.equals(this.IDM, raceSummaryResponseManagersInner.IDM) &&
        Objects.equals(this.raceTime, raceSummaryResponseManagersInner.raceTime) &&
        Objects.equals(this.lapsCompleted, raceSummaryResponseManagersInner.lapsCompleted) &&
        Objects.equals(this.pitStops, raceSummaryResponseManagersInner.pitStops) &&
        Objects.equals(this.bestLapTime, raceSummaryResponseManagersInner.bestLapTime) &&
        Objects.equals(this.bestLapTimeRaw, raceSummaryResponseManagersInner.bestLapTimeRaw) &&
        Objects.equals(this.bestLapColor, raceSummaryResponseManagersInner.bestLapColor) &&
        Objects.equals(this.avgSpeed, raceSummaryResponseManagersInner.avgSpeed) &&
        Objects.equals(this.bestPitTime, raceSummaryResponseManagersInner.bestPitTime) &&
        Objects.equals(this.bestPitColor, raceSummaryResponseManagersInner.bestPitColor) &&
        Objects.equals(this.champs, raceSummaryResponseManagersInner.champs) &&
        Objects.equals(this.classified, raceSummaryResponseManagersInner.classified) &&
        Objects.equals(this.firstNotClassified, raceSummaryResponseManagersInner.firstNotClassified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, idx, pos, progress, tyre, natCode, IDM, raceTime, lapsCompleted, pitStops, bestLapTime, bestLapTimeRaw, bestLapColor, avgSpeed, bestPitTime, bestPitColor, champs, classified, firstNotClassified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceSummaryResponseManagersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    tyre: ").append(toIndentedString(tyre)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    raceTime: ").append(toIndentedString(raceTime)).append("\n");
    sb.append("    lapsCompleted: ").append(toIndentedString(lapsCompleted)).append("\n");
    sb.append("    pitStops: ").append(toIndentedString(pitStops)).append("\n");
    sb.append("    bestLapTime: ").append(toIndentedString(bestLapTime)).append("\n");
    sb.append("    bestLapTimeRaw: ").append(toIndentedString(bestLapTimeRaw)).append("\n");
    sb.append("    bestLapColor: ").append(toIndentedString(bestLapColor)).append("\n");
    sb.append("    avgSpeed: ").append(toIndentedString(avgSpeed)).append("\n");
    sb.append("    bestPitTime: ").append(toIndentedString(bestPitTime)).append("\n");
    sb.append("    bestPitColor: ").append(toIndentedString(bestPitColor)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    classified: ").append(toIndentedString(classified)).append("\n");
    sb.append("    firstNotClassified: ").append(toIndentedString(firstNotClassified)).append("\n");
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

