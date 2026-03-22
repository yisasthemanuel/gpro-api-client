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
 * MoneyLevelsResponseManagersInner
 */

@JsonTypeName("MoneyLevelsResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class MoneyLevelsResponseManagersInner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String tyre;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable Integer cash;

  private @Nullable Integer carLevelRank;

  private @Nullable Integer carLevel;

  private @Nullable String carType;

  private @Nullable String champs;

  private @Nullable String pts;

  public MoneyLevelsResponseManagersInner name(@Nullable String name) {
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

  public MoneyLevelsResponseManagersInner pos(@Nullable String pos) {
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

  public MoneyLevelsResponseManagersInner tyre(@Nullable String tyre) {
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

  public MoneyLevelsResponseManagersInner natCode(@Nullable String natCode) {
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

  public MoneyLevelsResponseManagersInner IDM(@Nullable Integer IDM) {
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

  public MoneyLevelsResponseManagersInner cash(@Nullable Integer cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Get cash
   * @return cash
   */
  
  @JsonProperty("cash")
  public @Nullable Integer getCash() {
    return cash;
  }

  public void setCash(@Nullable Integer cash) {
    this.cash = cash;
  }

  public MoneyLevelsResponseManagersInner carLevelRank(@Nullable Integer carLevelRank) {
    this.carLevelRank = carLevelRank;
    return this;
  }

  /**
   * Get carLevelRank
   * @return carLevelRank
   */
  
  @JsonProperty("carLevelRank")
  public @Nullable Integer getCarLevelRank() {
    return carLevelRank;
  }

  public void setCarLevelRank(@Nullable Integer carLevelRank) {
    this.carLevelRank = carLevelRank;
  }

  public MoneyLevelsResponseManagersInner carLevel(@Nullable Integer carLevel) {
    this.carLevel = carLevel;
    return this;
  }

  /**
   * Get carLevel
   * @return carLevel
   */
  
  @JsonProperty("carLevel")
  public @Nullable Integer getCarLevel() {
    return carLevel;
  }

  public void setCarLevel(@Nullable Integer carLevel) {
    this.carLevel = carLevel;
  }

  public MoneyLevelsResponseManagersInner carType(@Nullable String carType) {
    this.carType = carType;
    return this;
  }

  /**
   * Get carType
   * @return carType
   */
  
  @JsonProperty("carType")
  public @Nullable String getCarType() {
    return carType;
  }

  public void setCarType(@Nullable String carType) {
    this.carType = carType;
  }

  public MoneyLevelsResponseManagersInner champs(@Nullable String champs) {
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

  public MoneyLevelsResponseManagersInner pts(@Nullable String pts) {
    this.pts = pts;
    return this;
  }

  /**
   * Get pts
   * @return pts
   */
  
  @JsonProperty("pts")
  public @Nullable String getPts() {
    return pts;
  }

  public void setPts(@Nullable String pts) {
    this.pts = pts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyLevelsResponseManagersInner moneyLevelsResponseManagersInner = (MoneyLevelsResponseManagersInner) o;
    return Objects.equals(this.name, moneyLevelsResponseManagersInner.name) &&
        Objects.equals(this.pos, moneyLevelsResponseManagersInner.pos) &&
        Objects.equals(this.tyre, moneyLevelsResponseManagersInner.tyre) &&
        Objects.equals(this.natCode, moneyLevelsResponseManagersInner.natCode) &&
        Objects.equals(this.IDM, moneyLevelsResponseManagersInner.IDM) &&
        Objects.equals(this.cash, moneyLevelsResponseManagersInner.cash) &&
        Objects.equals(this.carLevelRank, moneyLevelsResponseManagersInner.carLevelRank) &&
        Objects.equals(this.carLevel, moneyLevelsResponseManagersInner.carLevel) &&
        Objects.equals(this.carType, moneyLevelsResponseManagersInner.carType) &&
        Objects.equals(this.champs, moneyLevelsResponseManagersInner.champs) &&
        Objects.equals(this.pts, moneyLevelsResponseManagersInner.pts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, tyre, natCode, IDM, cash, carLevelRank, carLevel, carType, champs, pts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyLevelsResponseManagersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    tyre: ").append(toIndentedString(tyre)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    carLevelRank: ").append(toIndentedString(carLevelRank)).append("\n");
    sb.append("    carLevel: ").append(toIndentedString(carLevel)).append("\n");
    sb.append("    carType: ").append(toIndentedString(carType)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    pts: ").append(toIndentedString(pts)).append("\n");
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

