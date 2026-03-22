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
 * StandingsResponseManagersInner
 */

@JsonTypeName("StandingsResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseManagersInner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String tyre;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable String manArrow;

  private @Nullable String manBgColor;

  private @Nullable Integer negative;

  private @Nullable Integer cash;

  private @Nullable Integer retires;

  private @Nullable Integer goesRookie;

  private @Nullable Integer didSoftReset;

  private @Nullable String champs;

  @Valid
  private List<@Valid HistoryGroupStandingsResponseManagersInnerResultsInner> results = new ArrayList<>();

  private @Nullable String pts;

  public StandingsResponseManagersInner name(@Nullable String name) {
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

  public StandingsResponseManagersInner pos(@Nullable String pos) {
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

  public StandingsResponseManagersInner tyre(@Nullable String tyre) {
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

  public StandingsResponseManagersInner natCode(@Nullable String natCode) {
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

  public StandingsResponseManagersInner IDM(@Nullable Integer IDM) {
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

  public StandingsResponseManagersInner manArrow(@Nullable String manArrow) {
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

  public StandingsResponseManagersInner manBgColor(@Nullable String manBgColor) {
    this.manBgColor = manBgColor;
    return this;
  }

  /**
   * Get manBgColor
   * @return manBgColor
   */
  
  @JsonProperty("manBgColor")
  public @Nullable String getManBgColor() {
    return manBgColor;
  }

  public void setManBgColor(@Nullable String manBgColor) {
    this.manBgColor = manBgColor;
  }

  public StandingsResponseManagersInner negative(@Nullable Integer negative) {
    this.negative = negative;
    return this;
  }

  /**
   * Get negative
   * @return negative
   */
  
  @JsonProperty("negative")
  public @Nullable Integer getNegative() {
    return negative;
  }

  public void setNegative(@Nullable Integer negative) {
    this.negative = negative;
  }

  public StandingsResponseManagersInner cash(@Nullable Integer cash) {
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

  public StandingsResponseManagersInner retires(@Nullable Integer retires) {
    this.retires = retires;
    return this;
  }

  /**
   * Get retires
   * @return retires
   */
  
  @JsonProperty("retires")
  public @Nullable Integer getRetires() {
    return retires;
  }

  public void setRetires(@Nullable Integer retires) {
    this.retires = retires;
  }

  public StandingsResponseManagersInner goesRookie(@Nullable Integer goesRookie) {
    this.goesRookie = goesRookie;
    return this;
  }

  /**
   * Get goesRookie
   * @return goesRookie
   */
  
  @JsonProperty("goesRookie")
  public @Nullable Integer getGoesRookie() {
    return goesRookie;
  }

  public void setGoesRookie(@Nullable Integer goesRookie) {
    this.goesRookie = goesRookie;
  }

  public StandingsResponseManagersInner didSoftReset(@Nullable Integer didSoftReset) {
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

  public StandingsResponseManagersInner champs(@Nullable String champs) {
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

  public StandingsResponseManagersInner results(List<@Valid HistoryGroupStandingsResponseManagersInnerResultsInner> results) {
    this.results = results;
    return this;
  }

  public StandingsResponseManagersInner addResultsItem(HistoryGroupStandingsResponseManagersInnerResultsInner resultsItem) {
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

  public StandingsResponseManagersInner pts(@Nullable String pts) {
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
    StandingsResponseManagersInner standingsResponseManagersInner = (StandingsResponseManagersInner) o;
    return Objects.equals(this.name, standingsResponseManagersInner.name) &&
        Objects.equals(this.pos, standingsResponseManagersInner.pos) &&
        Objects.equals(this.tyre, standingsResponseManagersInner.tyre) &&
        Objects.equals(this.natCode, standingsResponseManagersInner.natCode) &&
        Objects.equals(this.IDM, standingsResponseManagersInner.IDM) &&
        Objects.equals(this.manArrow, standingsResponseManagersInner.manArrow) &&
        Objects.equals(this.manBgColor, standingsResponseManagersInner.manBgColor) &&
        Objects.equals(this.negative, standingsResponseManagersInner.negative) &&
        Objects.equals(this.cash, standingsResponseManagersInner.cash) &&
        Objects.equals(this.retires, standingsResponseManagersInner.retires) &&
        Objects.equals(this.goesRookie, standingsResponseManagersInner.goesRookie) &&
        Objects.equals(this.didSoftReset, standingsResponseManagersInner.didSoftReset) &&
        Objects.equals(this.champs, standingsResponseManagersInner.champs) &&
        Objects.equals(this.results, standingsResponseManagersInner.results) &&
        Objects.equals(this.pts, standingsResponseManagersInner.pts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, tyre, natCode, IDM, manArrow, manBgColor, negative, cash, retires, goesRookie, didSoftReset, champs, results, pts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseManagersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    tyre: ").append(toIndentedString(tyre)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    manArrow: ").append(toIndentedString(manArrow)).append("\n");
    sb.append("    manBgColor: ").append(toIndentedString(manBgColor)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    retires: ").append(toIndentedString(retires)).append("\n");
    sb.append("    goesRookie: ").append(toIndentedString(goesRookie)).append("\n");
    sb.append("    didSoftReset: ").append(toIndentedString(didSoftReset)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
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

