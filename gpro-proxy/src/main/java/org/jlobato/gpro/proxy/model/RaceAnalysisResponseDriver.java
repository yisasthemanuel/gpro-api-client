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
 * RaceAnalysisResponseDriver
 */

@JsonTypeName("RaceAnalysisResponse_driver")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseDriver {

  private @Nullable String name;

  private @Nullable Integer id;

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

  public RaceAnalysisResponseDriver name(@Nullable String name) {
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

  public RaceAnalysisResponseDriver id(@Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("id")
  public @Nullable Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  public RaceAnalysisResponseDriver OA(@Nullable String OA) {
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

  public RaceAnalysisResponseDriver con(@Nullable String con) {
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

  public RaceAnalysisResponseDriver tal(@Nullable String tal) {
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

  public RaceAnalysisResponseDriver agr(@Nullable String agr) {
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

  public RaceAnalysisResponseDriver exp(@Nullable String exp) {
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

  public RaceAnalysisResponseDriver tei(@Nullable String tei) {
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

  public RaceAnalysisResponseDriver sta(@Nullable String sta) {
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

  public RaceAnalysisResponseDriver cha(@Nullable String cha) {
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

  public RaceAnalysisResponseDriver mot(@Nullable String mot) {
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

  public RaceAnalysisResponseDriver rep(@Nullable String rep) {
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

  public RaceAnalysisResponseDriver wei(@Nullable String wei) {
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
    RaceAnalysisResponseDriver raceAnalysisResponseDriver = (RaceAnalysisResponseDriver) o;
    return Objects.equals(this.name, raceAnalysisResponseDriver.name) &&
        Objects.equals(this.id, raceAnalysisResponseDriver.id) &&
        Objects.equals(this.OA, raceAnalysisResponseDriver.OA) &&
        Objects.equals(this.con, raceAnalysisResponseDriver.con) &&
        Objects.equals(this.tal, raceAnalysisResponseDriver.tal) &&
        Objects.equals(this.agr, raceAnalysisResponseDriver.agr) &&
        Objects.equals(this.exp, raceAnalysisResponseDriver.exp) &&
        Objects.equals(this.tei, raceAnalysisResponseDriver.tei) &&
        Objects.equals(this.sta, raceAnalysisResponseDriver.sta) &&
        Objects.equals(this.cha, raceAnalysisResponseDriver.cha) &&
        Objects.equals(this.mot, raceAnalysisResponseDriver.mot) &&
        Objects.equals(this.rep, raceAnalysisResponseDriver.rep) &&
        Objects.equals(this.wei, raceAnalysisResponseDriver.wei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, OA, con, tal, agr, exp, tei, sta, cha, mot, rep, wei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseDriver {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

