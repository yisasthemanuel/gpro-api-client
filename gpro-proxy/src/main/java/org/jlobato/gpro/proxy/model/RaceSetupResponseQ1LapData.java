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
 * RaceSetupResponseQ1LapData
 */

@JsonTypeName("RaceSetupResponse_q1LapData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceSetupResponseQ1LapData {

  private @Nullable Integer setFWing;

  private @Nullable Integer setRWing;

  private @Nullable Integer setEng;

  private @Nullable Integer setBra;

  private @Nullable Integer setGear;

  private @Nullable Integer setSusp;

  public RaceSetupResponseQ1LapData setFWing(@Nullable Integer setFWing) {
    this.setFWing = setFWing;
    return this;
  }

  /**
   * Get setFWing
   * @return setFWing
   */
  
  @JsonProperty("setFWing")
  public @Nullable Integer getSetFWing() {
    return setFWing;
  }

  public void setSetFWing(@Nullable Integer setFWing) {
    this.setFWing = setFWing;
  }

  public RaceSetupResponseQ1LapData setRWing(@Nullable Integer setRWing) {
    this.setRWing = setRWing;
    return this;
  }

  /**
   * Get setRWing
   * @return setRWing
   */
  
  @JsonProperty("setRWing")
  public @Nullable Integer getSetRWing() {
    return setRWing;
  }

  public void setSetRWing(@Nullable Integer setRWing) {
    this.setRWing = setRWing;
  }

  public RaceSetupResponseQ1LapData setEng(@Nullable Integer setEng) {
    this.setEng = setEng;
    return this;
  }

  /**
   * Get setEng
   * @return setEng
   */
  
  @JsonProperty("setEng")
  public @Nullable Integer getSetEng() {
    return setEng;
  }

  public void setSetEng(@Nullable Integer setEng) {
    this.setEng = setEng;
  }

  public RaceSetupResponseQ1LapData setBra(@Nullable Integer setBra) {
    this.setBra = setBra;
    return this;
  }

  /**
   * Get setBra
   * @return setBra
   */
  
  @JsonProperty("setBra")
  public @Nullable Integer getSetBra() {
    return setBra;
  }

  public void setSetBra(@Nullable Integer setBra) {
    this.setBra = setBra;
  }

  public RaceSetupResponseQ1LapData setGear(@Nullable Integer setGear) {
    this.setGear = setGear;
    return this;
  }

  /**
   * Get setGear
   * @return setGear
   */
  
  @JsonProperty("setGear")
  public @Nullable Integer getSetGear() {
    return setGear;
  }

  public void setSetGear(@Nullable Integer setGear) {
    this.setGear = setGear;
  }

  public RaceSetupResponseQ1LapData setSusp(@Nullable Integer setSusp) {
    this.setSusp = setSusp;
    return this;
  }

  /**
   * Get setSusp
   * @return setSusp
   */
  
  @JsonProperty("setSusp")
  public @Nullable Integer getSetSusp() {
    return setSusp;
  }

  public void setSetSusp(@Nullable Integer setSusp) {
    this.setSusp = setSusp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceSetupResponseQ1LapData raceSetupResponseQ1LapData = (RaceSetupResponseQ1LapData) o;
    return Objects.equals(this.setFWing, raceSetupResponseQ1LapData.setFWing) &&
        Objects.equals(this.setRWing, raceSetupResponseQ1LapData.setRWing) &&
        Objects.equals(this.setEng, raceSetupResponseQ1LapData.setEng) &&
        Objects.equals(this.setBra, raceSetupResponseQ1LapData.setBra) &&
        Objects.equals(this.setGear, raceSetupResponseQ1LapData.setGear) &&
        Objects.equals(this.setSusp, raceSetupResponseQ1LapData.setSusp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setFWing, setRWing, setEng, setBra, setGear, setSusp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceSetupResponseQ1LapData {\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEng: ").append(toIndentedString(setEng)).append("\n");
    sb.append("    setBra: ").append(toIndentedString(setBra)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
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

