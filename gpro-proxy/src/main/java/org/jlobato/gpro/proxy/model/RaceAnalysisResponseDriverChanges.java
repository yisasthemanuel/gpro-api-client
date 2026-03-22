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
 * RaceAnalysisResponseDriverChanges
 */

@JsonTypeName("RaceAnalysisResponse_driverChanges")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseDriverChanges {

  private @Nullable String OA;

  private @Nullable String con;

  private @Nullable String tal;

  private @Nullable String agr;

  private @Nullable String exp;

  private @Nullable String tei;

  private @Nullable String sta;

  private @Nullable String cha;

  private @Nullable String mot;

  private @Nullable String rep;

  private @Nullable String wei;

  public RaceAnalysisResponseDriverChanges OA(@Nullable String OA) {
    this.OA = OA;
    return this;
  }

  /**
   * Get OA
   * @return OA
   */
  
  @JsonProperty("OA")
  public @Nullable String getOA() {
    return OA;
  }

  public void setOA(@Nullable String OA) {
    this.OA = OA;
  }

  public RaceAnalysisResponseDriverChanges con(@Nullable String con) {
    this.con = con;
    return this;
  }

  /**
   * Get con
   * @return con
   */
  
  @JsonProperty("con")
  public @Nullable String getCon() {
    return con;
  }

  public void setCon(@Nullable String con) {
    this.con = con;
  }

  public RaceAnalysisResponseDriverChanges tal(@Nullable String tal) {
    this.tal = tal;
    return this;
  }

  /**
   * Get tal
   * @return tal
   */
  
  @JsonProperty("tal")
  public @Nullable String getTal() {
    return tal;
  }

  public void setTal(@Nullable String tal) {
    this.tal = tal;
  }

  public RaceAnalysisResponseDriverChanges agr(@Nullable String agr) {
    this.agr = agr;
    return this;
  }

  /**
   * Get agr
   * @return agr
   */
  
  @JsonProperty("agr")
  public @Nullable String getAgr() {
    return agr;
  }

  public void setAgr(@Nullable String agr) {
    this.agr = agr;
  }

  public RaceAnalysisResponseDriverChanges exp(@Nullable String exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Get exp
   * @return exp
   */
  
  @JsonProperty("exp")
  public @Nullable String getExp() {
    return exp;
  }

  public void setExp(@Nullable String exp) {
    this.exp = exp;
  }

  public RaceAnalysisResponseDriverChanges tei(@Nullable String tei) {
    this.tei = tei;
    return this;
  }

  /**
   * Get tei
   * @return tei
   */
  
  @JsonProperty("tei")
  public @Nullable String getTei() {
    return tei;
  }

  public void setTei(@Nullable String tei) {
    this.tei = tei;
  }

  public RaceAnalysisResponseDriverChanges sta(@Nullable String sta) {
    this.sta = sta;
    return this;
  }

  /**
   * Get sta
   * @return sta
   */
  
  @JsonProperty("sta")
  public @Nullable String getSta() {
    return sta;
  }

  public void setSta(@Nullable String sta) {
    this.sta = sta;
  }

  public RaceAnalysisResponseDriverChanges cha(@Nullable String cha) {
    this.cha = cha;
    return this;
  }

  /**
   * Get cha
   * @return cha
   */
  
  @JsonProperty("cha")
  public @Nullable String getCha() {
    return cha;
  }

  public void setCha(@Nullable String cha) {
    this.cha = cha;
  }

  public RaceAnalysisResponseDriverChanges mot(@Nullable String mot) {
    this.mot = mot;
    return this;
  }

  /**
   * Get mot
   * @return mot
   */
  
  @JsonProperty("mot")
  public @Nullable String getMot() {
    return mot;
  }

  public void setMot(@Nullable String mot) {
    this.mot = mot;
  }

  public RaceAnalysisResponseDriverChanges rep(@Nullable String rep) {
    this.rep = rep;
    return this;
  }

  /**
   * Get rep
   * @return rep
   */
  
  @JsonProperty("rep")
  public @Nullable String getRep() {
    return rep;
  }

  public void setRep(@Nullable String rep) {
    this.rep = rep;
  }

  public RaceAnalysisResponseDriverChanges wei(@Nullable String wei) {
    this.wei = wei;
    return this;
  }

  /**
   * Get wei
   * @return wei
   */
  
  @JsonProperty("wei")
  public @Nullable String getWei() {
    return wei;
  }

  public void setWei(@Nullable String wei) {
    this.wei = wei;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseDriverChanges raceAnalysisResponseDriverChanges = (RaceAnalysisResponseDriverChanges) o;
    return Objects.equals(this.OA, raceAnalysisResponseDriverChanges.OA) &&
        Objects.equals(this.con, raceAnalysisResponseDriverChanges.con) &&
        Objects.equals(this.tal, raceAnalysisResponseDriverChanges.tal) &&
        Objects.equals(this.agr, raceAnalysisResponseDriverChanges.agr) &&
        Objects.equals(this.exp, raceAnalysisResponseDriverChanges.exp) &&
        Objects.equals(this.tei, raceAnalysisResponseDriverChanges.tei) &&
        Objects.equals(this.sta, raceAnalysisResponseDriverChanges.sta) &&
        Objects.equals(this.cha, raceAnalysisResponseDriverChanges.cha) &&
        Objects.equals(this.mot, raceAnalysisResponseDriverChanges.mot) &&
        Objects.equals(this.rep, raceAnalysisResponseDriverChanges.rep) &&
        Objects.equals(this.wei, raceAnalysisResponseDriverChanges.wei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OA, con, tal, agr, exp, tei, sta, cha, mot, rep, wei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseDriverChanges {\n");
    sb.append("    OA: ").append(toIndentedString(OA)).append("\n");
    sb.append("    con: ").append(toIndentedString(con)).append("\n");
    sb.append("    tal: ").append(toIndentedString(tal)).append("\n");
    sb.append("    agr: ").append(toIndentedString(agr)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    tei: ").append(toIndentedString(tei)).append("\n");
    sb.append("    sta: ").append(toIndentedString(sta)).append("\n");
    sb.append("    cha: ").append(toIndentedString(cha)).append("\n");
    sb.append("    mot: ").append(toIndentedString(mot)).append("\n");
    sb.append("    rep: ").append(toIndentedString(rep)).append("\n");
    sb.append("    wei: ").append(toIndentedString(wei)).append("\n");
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

