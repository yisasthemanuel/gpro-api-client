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
 * HistoryManResultsResponseManagersInner
 */

@JsonTypeName("HistoryManResultsResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryManResultsResponseManagersInner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String manArrow;

  private @Nullable String manPosChange;

  private @Nullable String tyres;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable Integer points;

  private @Nullable String avg;

  private @Nullable Integer wins;

  private @Nullable Integer podiums;

  private @Nullable Integer races;

  private @Nullable Integer poles;

  private @Nullable Integer fls;

  private @Nullable Integer testLaps;

  private @Nullable String champs;

  public HistoryManResultsResponseManagersInner name(@Nullable String name) {
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

  public HistoryManResultsResponseManagersInner pos(@Nullable String pos) {
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

  public HistoryManResultsResponseManagersInner manArrow(@Nullable String manArrow) {
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

  public HistoryManResultsResponseManagersInner manPosChange(@Nullable String manPosChange) {
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

  public HistoryManResultsResponseManagersInner tyres(@Nullable String tyres) {
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

  public HistoryManResultsResponseManagersInner natCode(@Nullable String natCode) {
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

  public HistoryManResultsResponseManagersInner IDM(@Nullable Integer IDM) {
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

  public HistoryManResultsResponseManagersInner points(@Nullable Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @JsonProperty("points")
  public @Nullable Integer getPoints() {
    return points;
  }

  public void setPoints(@Nullable Integer points) {
    this.points = points;
  }

  public HistoryManResultsResponseManagersInner avg(@Nullable String avg) {
    this.avg = avg;
    return this;
  }

  /**
   * Get avg
   * @return avg
   */
  
  @JsonProperty("avg")
  public @Nullable String getAvg() {
    return avg;
  }

  public void setAvg(@Nullable String avg) {
    this.avg = avg;
  }

  public HistoryManResultsResponseManagersInner wins(@Nullable Integer wins) {
    this.wins = wins;
    return this;
  }

  /**
   * Get wins
   * @return wins
   */
  
  @JsonProperty("wins")
  public @Nullable Integer getWins() {
    return wins;
  }

  public void setWins(@Nullable Integer wins) {
    this.wins = wins;
  }

  public HistoryManResultsResponseManagersInner podiums(@Nullable Integer podiums) {
    this.podiums = podiums;
    return this;
  }

  /**
   * Get podiums
   * @return podiums
   */
  
  @JsonProperty("podiums")
  public @Nullable Integer getPodiums() {
    return podiums;
  }

  public void setPodiums(@Nullable Integer podiums) {
    this.podiums = podiums;
  }

  public HistoryManResultsResponseManagersInner races(@Nullable Integer races) {
    this.races = races;
    return this;
  }

  /**
   * Get races
   * @return races
   */
  
  @JsonProperty("races")
  public @Nullable Integer getRaces() {
    return races;
  }

  public void setRaces(@Nullable Integer races) {
    this.races = races;
  }

  public HistoryManResultsResponseManagersInner poles(@Nullable Integer poles) {
    this.poles = poles;
    return this;
  }

  /**
   * Get poles
   * @return poles
   */
  
  @JsonProperty("poles")
  public @Nullable Integer getPoles() {
    return poles;
  }

  public void setPoles(@Nullable Integer poles) {
    this.poles = poles;
  }

  public HistoryManResultsResponseManagersInner fls(@Nullable Integer fls) {
    this.fls = fls;
    return this;
  }

  /**
   * Get fls
   * @return fls
   */
  
  @JsonProperty("FLs")
  public @Nullable Integer getFls() {
    return fls;
  }

  public void setFls(@Nullable Integer fls) {
    this.fls = fls;
  }

  public HistoryManResultsResponseManagersInner testLaps(@Nullable Integer testLaps) {
    this.testLaps = testLaps;
    return this;
  }

  /**
   * Get testLaps
   * @return testLaps
   */
  
  @JsonProperty("testLaps")
  public @Nullable Integer getTestLaps() {
    return testLaps;
  }

  public void setTestLaps(@Nullable Integer testLaps) {
    this.testLaps = testLaps;
  }

  public HistoryManResultsResponseManagersInner champs(@Nullable String champs) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryManResultsResponseManagersInner historyManResultsResponseManagersInner = (HistoryManResultsResponseManagersInner) o;
    return Objects.equals(this.name, historyManResultsResponseManagersInner.name) &&
        Objects.equals(this.pos, historyManResultsResponseManagersInner.pos) &&
        Objects.equals(this.manArrow, historyManResultsResponseManagersInner.manArrow) &&
        Objects.equals(this.manPosChange, historyManResultsResponseManagersInner.manPosChange) &&
        Objects.equals(this.tyres, historyManResultsResponseManagersInner.tyres) &&
        Objects.equals(this.natCode, historyManResultsResponseManagersInner.natCode) &&
        Objects.equals(this.IDM, historyManResultsResponseManagersInner.IDM) &&
        Objects.equals(this.points, historyManResultsResponseManagersInner.points) &&
        Objects.equals(this.avg, historyManResultsResponseManagersInner.avg) &&
        Objects.equals(this.wins, historyManResultsResponseManagersInner.wins) &&
        Objects.equals(this.podiums, historyManResultsResponseManagersInner.podiums) &&
        Objects.equals(this.races, historyManResultsResponseManagersInner.races) &&
        Objects.equals(this.poles, historyManResultsResponseManagersInner.poles) &&
        Objects.equals(this.fls, historyManResultsResponseManagersInner.fls) &&
        Objects.equals(this.testLaps, historyManResultsResponseManagersInner.testLaps) &&
        Objects.equals(this.champs, historyManResultsResponseManagersInner.champs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, manArrow, manPosChange, tyres, natCode, IDM, points, avg, wins, podiums, races, poles, fls, testLaps, champs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryManResultsResponseManagersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    manArrow: ").append(toIndentedString(manArrow)).append("\n");
    sb.append("    manPosChange: ").append(toIndentedString(manPosChange)).append("\n");
    sb.append("    tyres: ").append(toIndentedString(tyres)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    podiums: ").append(toIndentedString(podiums)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    poles: ").append(toIndentedString(poles)).append("\n");
    sb.append("    fls: ").append(toIndentedString(fls)).append("\n");
    sb.append("    testLaps: ").append(toIndentedString(testLaps)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
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

