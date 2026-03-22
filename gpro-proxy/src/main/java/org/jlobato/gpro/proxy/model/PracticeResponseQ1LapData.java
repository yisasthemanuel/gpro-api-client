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
 * PracticeResponseQ1LapData
 */

@JsonTypeName("PracticeResponse_q1LapData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class PracticeResponseQ1LapData {

  private @Nullable String lapTime;

  private @Nullable String setFWing;

  private @Nullable String setRWing;

  private @Nullable String setEng;

  private @Nullable String setBra;

  private @Nullable String setGear;

  private @Nullable String setSusp;

  private @Nullable String setTyres;

  private @Nullable String setRisk;

  private @Nullable String q1Pos;

  private @Nullable String q1Gap;

  public PracticeResponseQ1LapData lapTime(@Nullable String lapTime) {
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

  public PracticeResponseQ1LapData setFWing(@Nullable String setFWing) {
    this.setFWing = setFWing;
    return this;
  }

  /**
   * Get setFWing
   * @return setFWing
   */
  
  @JsonProperty("setFWing")
  public @Nullable String getSetFWing() {
    return setFWing;
  }

  public void setSetFWing(@Nullable String setFWing) {
    this.setFWing = setFWing;
  }

  public PracticeResponseQ1LapData setRWing(@Nullable String setRWing) {
    this.setRWing = setRWing;
    return this;
  }

  /**
   * Get setRWing
   * @return setRWing
   */
  
  @JsonProperty("setRWing")
  public @Nullable String getSetRWing() {
    return setRWing;
  }

  public void setSetRWing(@Nullable String setRWing) {
    this.setRWing = setRWing;
  }

  public PracticeResponseQ1LapData setEng(@Nullable String setEng) {
    this.setEng = setEng;
    return this;
  }

  /**
   * Get setEng
   * @return setEng
   */
  
  @JsonProperty("setEng")
  public @Nullable String getSetEng() {
    return setEng;
  }

  public void setSetEng(@Nullable String setEng) {
    this.setEng = setEng;
  }

  public PracticeResponseQ1LapData setBra(@Nullable String setBra) {
    this.setBra = setBra;
    return this;
  }

  /**
   * Get setBra
   * @return setBra
   */
  
  @JsonProperty("setBra")
  public @Nullable String getSetBra() {
    return setBra;
  }

  public void setSetBra(@Nullable String setBra) {
    this.setBra = setBra;
  }

  public PracticeResponseQ1LapData setGear(@Nullable String setGear) {
    this.setGear = setGear;
    return this;
  }

  /**
   * Get setGear
   * @return setGear
   */
  
  @JsonProperty("setGear")
  public @Nullable String getSetGear() {
    return setGear;
  }

  public void setSetGear(@Nullable String setGear) {
    this.setGear = setGear;
  }

  public PracticeResponseQ1LapData setSusp(@Nullable String setSusp) {
    this.setSusp = setSusp;
    return this;
  }

  /**
   * Get setSusp
   * @return setSusp
   */
  
  @JsonProperty("setSusp")
  public @Nullable String getSetSusp() {
    return setSusp;
  }

  public void setSetSusp(@Nullable String setSusp) {
    this.setSusp = setSusp;
  }

  public PracticeResponseQ1LapData setTyres(@Nullable String setTyres) {
    this.setTyres = setTyres;
    return this;
  }

  /**
   * Get setTyres
   * @return setTyres
   */
  
  @JsonProperty("setTyres")
  public @Nullable String getSetTyres() {
    return setTyres;
  }

  public void setSetTyres(@Nullable String setTyres) {
    this.setTyres = setTyres;
  }

  public PracticeResponseQ1LapData setRisk(@Nullable String setRisk) {
    this.setRisk = setRisk;
    return this;
  }

  /**
   * Get setRisk
   * @return setRisk
   */
  
  @JsonProperty("setRisk")
  public @Nullable String getSetRisk() {
    return setRisk;
  }

  public void setSetRisk(@Nullable String setRisk) {
    this.setRisk = setRisk;
  }

  public PracticeResponseQ1LapData q1Pos(@Nullable String q1Pos) {
    this.q1Pos = q1Pos;
    return this;
  }

  /**
   * Get q1Pos
   * @return q1Pos
   */
  
  @JsonProperty("q1Pos")
  public @Nullable String getQ1Pos() {
    return q1Pos;
  }

  public void setQ1Pos(@Nullable String q1Pos) {
    this.q1Pos = q1Pos;
  }

  public PracticeResponseQ1LapData q1Gap(@Nullable String q1Gap) {
    this.q1Gap = q1Gap;
    return this;
  }

  /**
   * Get q1Gap
   * @return q1Gap
   */
  
  @JsonProperty("q1Gap")
  public @Nullable String getQ1Gap() {
    return q1Gap;
  }

  public void setQ1Gap(@Nullable String q1Gap) {
    this.q1Gap = q1Gap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PracticeResponseQ1LapData practiceResponseQ1LapData = (PracticeResponseQ1LapData) o;
    return Objects.equals(this.lapTime, practiceResponseQ1LapData.lapTime) &&
        Objects.equals(this.setFWing, practiceResponseQ1LapData.setFWing) &&
        Objects.equals(this.setRWing, practiceResponseQ1LapData.setRWing) &&
        Objects.equals(this.setEng, practiceResponseQ1LapData.setEng) &&
        Objects.equals(this.setBra, practiceResponseQ1LapData.setBra) &&
        Objects.equals(this.setGear, practiceResponseQ1LapData.setGear) &&
        Objects.equals(this.setSusp, practiceResponseQ1LapData.setSusp) &&
        Objects.equals(this.setTyres, practiceResponseQ1LapData.setTyres) &&
        Objects.equals(this.setRisk, practiceResponseQ1LapData.setRisk) &&
        Objects.equals(this.q1Pos, practiceResponseQ1LapData.q1Pos) &&
        Objects.equals(this.q1Gap, practiceResponseQ1LapData.q1Gap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lapTime, setFWing, setRWing, setEng, setBra, setGear, setSusp, setTyres, setRisk, q1Pos, q1Gap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PracticeResponseQ1LapData {\n");
    sb.append("    lapTime: ").append(toIndentedString(lapTime)).append("\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEng: ").append(toIndentedString(setEng)).append("\n");
    sb.append("    setBra: ").append(toIndentedString(setBra)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
    sb.append("    setRisk: ").append(toIndentedString(setRisk)).append("\n");
    sb.append("    q1Pos: ").append(toIndentedString(q1Pos)).append("\n");
    sb.append("    q1Gap: ").append(toIndentedString(q1Gap)).append("\n");
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

