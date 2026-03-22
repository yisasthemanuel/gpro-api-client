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
 * Qualy2ResponseQ2LapData
 */

@JsonTypeName("Qualy2Response_q2LapData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class Qualy2ResponseQ2LapData {

  private @Nullable String lapTime;

  private @Nullable String setFWing;

  private @Nullable String setRWing;

  private @Nullable String setEng;

  private @Nullable String setBra;

  private @Nullable String setGear;

  private @Nullable String setSusp;

  private @Nullable String setTyres;

  private @Nullable String setRisk;

  private @Nullable Integer setFuel;

  private @Nullable String q2Pos;

  private @Nullable String q2Gap;

  public Qualy2ResponseQ2LapData lapTime(@Nullable String lapTime) {
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

  public Qualy2ResponseQ2LapData setFWing(@Nullable String setFWing) {
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

  public Qualy2ResponseQ2LapData setRWing(@Nullable String setRWing) {
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

  public Qualy2ResponseQ2LapData setEng(@Nullable String setEng) {
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

  public Qualy2ResponseQ2LapData setBra(@Nullable String setBra) {
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

  public Qualy2ResponseQ2LapData setGear(@Nullable String setGear) {
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

  public Qualy2ResponseQ2LapData setSusp(@Nullable String setSusp) {
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

  public Qualy2ResponseQ2LapData setTyres(@Nullable String setTyres) {
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

  public Qualy2ResponseQ2LapData setRisk(@Nullable String setRisk) {
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

  public Qualy2ResponseQ2LapData setFuel(@Nullable Integer setFuel) {
    this.setFuel = setFuel;
    return this;
  }

  /**
   * Get setFuel
   * @return setFuel
   */
  
  @JsonProperty("setFuel")
  public @Nullable Integer getSetFuel() {
    return setFuel;
  }

  public void setSetFuel(@Nullable Integer setFuel) {
    this.setFuel = setFuel;
  }

  public Qualy2ResponseQ2LapData q2Pos(@Nullable String q2Pos) {
    this.q2Pos = q2Pos;
    return this;
  }

  /**
   * Get q2Pos
   * @return q2Pos
   */
  
  @JsonProperty("q2Pos")
  public @Nullable String getQ2Pos() {
    return q2Pos;
  }

  public void setQ2Pos(@Nullable String q2Pos) {
    this.q2Pos = q2Pos;
  }

  public Qualy2ResponseQ2LapData q2Gap(@Nullable String q2Gap) {
    this.q2Gap = q2Gap;
    return this;
  }

  /**
   * Get q2Gap
   * @return q2Gap
   */
  
  @JsonProperty("q2Gap")
  public @Nullable String getQ2Gap() {
    return q2Gap;
  }

  public void setQ2Gap(@Nullable String q2Gap) {
    this.q2Gap = q2Gap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qualy2ResponseQ2LapData qualy2ResponseQ2LapData = (Qualy2ResponseQ2LapData) o;
    return Objects.equals(this.lapTime, qualy2ResponseQ2LapData.lapTime) &&
        Objects.equals(this.setFWing, qualy2ResponseQ2LapData.setFWing) &&
        Objects.equals(this.setRWing, qualy2ResponseQ2LapData.setRWing) &&
        Objects.equals(this.setEng, qualy2ResponseQ2LapData.setEng) &&
        Objects.equals(this.setBra, qualy2ResponseQ2LapData.setBra) &&
        Objects.equals(this.setGear, qualy2ResponseQ2LapData.setGear) &&
        Objects.equals(this.setSusp, qualy2ResponseQ2LapData.setSusp) &&
        Objects.equals(this.setTyres, qualy2ResponseQ2LapData.setTyres) &&
        Objects.equals(this.setRisk, qualy2ResponseQ2LapData.setRisk) &&
        Objects.equals(this.setFuel, qualy2ResponseQ2LapData.setFuel) &&
        Objects.equals(this.q2Pos, qualy2ResponseQ2LapData.q2Pos) &&
        Objects.equals(this.q2Gap, qualy2ResponseQ2LapData.q2Gap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lapTime, setFWing, setRWing, setEng, setBra, setGear, setSusp, setTyres, setRisk, setFuel, q2Pos, q2Gap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qualy2ResponseQ2LapData {\n");
    sb.append("    lapTime: ").append(toIndentedString(lapTime)).append("\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEng: ").append(toIndentedString(setEng)).append("\n");
    sb.append("    setBra: ").append(toIndentedString(setBra)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
    sb.append("    setRisk: ").append(toIndentedString(setRisk)).append("\n");
    sb.append("    setFuel: ").append(toIndentedString(setFuel)).append("\n");
    sb.append("    q2Pos: ").append(toIndentedString(q2Pos)).append("\n");
    sb.append("    q2Gap: ").append(toIndentedString(q2Gap)).append("\n");
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

