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
 * RaceAnalysisResponseSetupsUsedInner
 */

@JsonTypeName("RaceAnalysisResponse_setupsUsed_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseSetupsUsedInner {

  private @Nullable String session;

  private @Nullable String setFWing;

  private @Nullable String setRWing;

  private @Nullable String setEng;

  private @Nullable String setBra;

  private @Nullable String setGear;

  private @Nullable String setSusp;

  private @Nullable String setTyres;

  public RaceAnalysisResponseSetupsUsedInner session(@Nullable String session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
   */
  
  @JsonProperty("session")
  public @Nullable String getSession() {
    return session;
  }

  public void setSession(@Nullable String session) {
    this.session = session;
  }

  public RaceAnalysisResponseSetupsUsedInner setFWing(@Nullable String setFWing) {
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

  public RaceAnalysisResponseSetupsUsedInner setRWing(@Nullable String setRWing) {
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

  public RaceAnalysisResponseSetupsUsedInner setEng(@Nullable String setEng) {
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

  public RaceAnalysisResponseSetupsUsedInner setBra(@Nullable String setBra) {
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

  public RaceAnalysisResponseSetupsUsedInner setGear(@Nullable String setGear) {
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

  public RaceAnalysisResponseSetupsUsedInner setSusp(@Nullable String setSusp) {
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

  public RaceAnalysisResponseSetupsUsedInner setTyres(@Nullable String setTyres) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseSetupsUsedInner raceAnalysisResponseSetupsUsedInner = (RaceAnalysisResponseSetupsUsedInner) o;
    return Objects.equals(this.session, raceAnalysisResponseSetupsUsedInner.session) &&
        Objects.equals(this.setFWing, raceAnalysisResponseSetupsUsedInner.setFWing) &&
        Objects.equals(this.setRWing, raceAnalysisResponseSetupsUsedInner.setRWing) &&
        Objects.equals(this.setEng, raceAnalysisResponseSetupsUsedInner.setEng) &&
        Objects.equals(this.setBra, raceAnalysisResponseSetupsUsedInner.setBra) &&
        Objects.equals(this.setGear, raceAnalysisResponseSetupsUsedInner.setGear) &&
        Objects.equals(this.setSusp, raceAnalysisResponseSetupsUsedInner.setSusp) &&
        Objects.equals(this.setTyres, raceAnalysisResponseSetupsUsedInner.setTyres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(session, setFWing, setRWing, setEng, setBra, setGear, setSusp, setTyres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseSetupsUsedInner {\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEng: ").append(toIndentedString(setEng)).append("\n");
    sb.append("    setBra: ").append(toIndentedString(setBra)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
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

