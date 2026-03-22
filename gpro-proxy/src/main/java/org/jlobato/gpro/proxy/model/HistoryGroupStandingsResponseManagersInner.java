package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.HistoryGroupStandingsResponseManagersInnerResultsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoryGroupStandingsResponseManagersInner
 */

@JsonTypeName("HistoryGroupStandingsResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryGroupStandingsResponseManagersInner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String bgColor;

  private @Nullable String manArrow;

  private @Nullable String manPosChange;

  private @Nullable String tyres;

  private @Nullable String nat;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable Integer champs;

  private @Nullable Integer cash;

  private @Nullable Integer retired;

  private @Nullable Integer wentRookie;

  private @Nullable Integer didSoftReset;

  @Valid
  private List<@Valid HistoryGroupStandingsResponseManagersInnerResultsInner> results = new ArrayList<>();

  private @Nullable String pts;

  public HistoryGroupStandingsResponseManagersInner name(@Nullable String name) {
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

  public HistoryGroupStandingsResponseManagersInner pos(@Nullable String pos) {
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

  public HistoryGroupStandingsResponseManagersInner bgColor(@Nullable String bgColor) {
    this.bgColor = bgColor;
    return this;
  }

  /**
   * Get bgColor
   * @return bgColor
   */
  
  @JsonProperty("bgColor")
  public @Nullable String getBgColor() {
    return bgColor;
  }

  public void setBgColor(@Nullable String bgColor) {
    this.bgColor = bgColor;
  }

  public HistoryGroupStandingsResponseManagersInner manArrow(@Nullable String manArrow) {
    this.manArrow = manArrow;
    return this;
  }

  /**
   * Get manArrow
   * @return manArrow
   */
  
  @JsonProperty("manArrow")
  public @Nullable String getManArrow() {
    return manArrow;
  }

  public void setManArrow(@Nullable String manArrow) {
    this.manArrow = manArrow;
  }

  public HistoryGroupStandingsResponseManagersInner manPosChange(@Nullable String manPosChange) {
    this.manPosChange = manPosChange;
    return this;
  }

  /**
   * Get manPosChange
   * @return manPosChange
   */
  
  @JsonProperty("manPosChange")
  public @Nullable String getManPosChange() {
    return manPosChange;
  }

  public void setManPosChange(@Nullable String manPosChange) {
    this.manPosChange = manPosChange;
  }

  public HistoryGroupStandingsResponseManagersInner tyres(@Nullable String tyres) {
    this.tyres = tyres;
    return this;
  }

  /**
   * Get tyres
   * @return tyres
   */
  
  @JsonProperty("tyres")
  public @Nullable String getTyres() {
    return tyres;
  }

  public void setTyres(@Nullable String tyres) {
    this.tyres = tyres;
  }

  public HistoryGroupStandingsResponseManagersInner nat(@Nullable String nat) {
    this.nat = nat;
    return this;
  }

  /**
   * Get nat
   * @return nat
   */
  
  @JsonProperty("nat")
  public @Nullable String getNat() {
    return nat;
  }

  public void setNat(@Nullable String nat) {
    this.nat = nat;
  }

  public HistoryGroupStandingsResponseManagersInner natCode(@Nullable String natCode) {
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

  public HistoryGroupStandingsResponseManagersInner IDM(@Nullable Integer IDM) {
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

  public HistoryGroupStandingsResponseManagersInner champs(@Nullable Integer champs) {
    this.champs = champs;
    return this;
  }

  /**
   * Get champs
   * @return champs
   */
  
  @JsonProperty("champs")
  public @Nullable Integer getChamps() {
    return champs;
  }

  public void setChamps(@Nullable Integer champs) {
    this.champs = champs;
  }

  public HistoryGroupStandingsResponseManagersInner cash(@Nullable Integer cash) {
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

  public HistoryGroupStandingsResponseManagersInner retired(@Nullable Integer retired) {
    this.retired = retired;
    return this;
  }

  /**
   * Get retired
   * @return retired
   */
  
  @JsonProperty("retired")
  public @Nullable Integer getRetired() {
    return retired;
  }

  public void setRetired(@Nullable Integer retired) {
    this.retired = retired;
  }

  public HistoryGroupStandingsResponseManagersInner wentRookie(@Nullable Integer wentRookie) {
    this.wentRookie = wentRookie;
    return this;
  }

  /**
   * Get wentRookie
   * @return wentRookie
   */
  
  @JsonProperty("wentRookie")
  public @Nullable Integer getWentRookie() {
    return wentRookie;
  }

  public void setWentRookie(@Nullable Integer wentRookie) {
    this.wentRookie = wentRookie;
  }

  public HistoryGroupStandingsResponseManagersInner didSoftReset(@Nullable Integer didSoftReset) {
    this.didSoftReset = didSoftReset;
    return this;
  }

  /**
   * Get didSoftReset
   * @return didSoftReset
   */
  
  @JsonProperty("didSoftReset")
  public @Nullable Integer getDidSoftReset() {
    return didSoftReset;
  }

  public void setDidSoftReset(@Nullable Integer didSoftReset) {
    this.didSoftReset = didSoftReset;
  }

  public HistoryGroupStandingsResponseManagersInner results(List<@Valid HistoryGroupStandingsResponseManagersInnerResultsInner> results) {
    this.results = results;
    return this;
  }

  public HistoryGroupStandingsResponseManagersInner addResultsItem(HistoryGroupStandingsResponseManagersInnerResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @Valid 
  @JsonProperty("results")
  public List<@Valid HistoryGroupStandingsResponseManagersInnerResultsInner> getResults() {
    return results;
  }

  public void setResults(List<@Valid HistoryGroupStandingsResponseManagersInnerResultsInner> results) {
    this.results = results;
  }

  public HistoryGroupStandingsResponseManagersInner pts(@Nullable String pts) {
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
    HistoryGroupStandingsResponseManagersInner historyGroupStandingsResponseManagersInner = (HistoryGroupStandingsResponseManagersInner) o;
    return Objects.equals(this.name, historyGroupStandingsResponseManagersInner.name) &&
        Objects.equals(this.pos, historyGroupStandingsResponseManagersInner.pos) &&
        Objects.equals(this.bgColor, historyGroupStandingsResponseManagersInner.bgColor) &&
        Objects.equals(this.manArrow, historyGroupStandingsResponseManagersInner.manArrow) &&
        Objects.equals(this.manPosChange, historyGroupStandingsResponseManagersInner.manPosChange) &&
        Objects.equals(this.tyres, historyGroupStandingsResponseManagersInner.tyres) &&
        Objects.equals(this.nat, historyGroupStandingsResponseManagersInner.nat) &&
        Objects.equals(this.natCode, historyGroupStandingsResponseManagersInner.natCode) &&
        Objects.equals(this.IDM, historyGroupStandingsResponseManagersInner.IDM) &&
        Objects.equals(this.champs, historyGroupStandingsResponseManagersInner.champs) &&
        Objects.equals(this.cash, historyGroupStandingsResponseManagersInner.cash) &&
        Objects.equals(this.retired, historyGroupStandingsResponseManagersInner.retired) &&
        Objects.equals(this.wentRookie, historyGroupStandingsResponseManagersInner.wentRookie) &&
        Objects.equals(this.didSoftReset, historyGroupStandingsResponseManagersInner.didSoftReset) &&
        Objects.equals(this.results, historyGroupStandingsResponseManagersInner.results) &&
        Objects.equals(this.pts, historyGroupStandingsResponseManagersInner.pts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, bgColor, manArrow, manPosChange, tyres, nat, natCode, IDM, champs, cash, retired, wentRookie, didSoftReset, results, pts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryGroupStandingsResponseManagersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    manArrow: ").append(toIndentedString(manArrow)).append("\n");
    sb.append("    manPosChange: ").append(toIndentedString(manPosChange)).append("\n");
    sb.append("    tyres: ").append(toIndentedString(tyres)).append("\n");
    sb.append("    nat: ").append(toIndentedString(nat)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    retired: ").append(toIndentedString(retired)).append("\n");
    sb.append("    wentRookie: ").append(toIndentedString(wentRookie)).append("\n");
    sb.append("    didSoftReset: ").append(toIndentedString(didSoftReset)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

