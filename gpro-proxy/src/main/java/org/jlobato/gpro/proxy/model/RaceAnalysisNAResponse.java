package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.RaceAnalysisNAResponseRacesToSelectInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RaceAnalysisNAResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisNAResponse implements GetRaceAnalysis200Response {

  private @Nullable Integer loadingDataState;

  private @Nullable Integer ignoreRefCheck;

  private @Nullable String segmentSelected;

  private @Nullable String unlocked;

  private @Nullable String credits;

  private @Nullable String selSeasonNb;

  private @Nullable String selRaceNb;

  private @Nullable String group;

  private @Nullable String trackName;

  private @Nullable String trackNatCode;

  private @Nullable String trackCountry;

  private @Nullable String trackId;

  @Valid
  private List<@Valid RaceAnalysisNAResponseRacesToSelectInner> racesToSelect = new ArrayList<>();

  @Valid
  private List<Object> laps = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public RaceAnalysisNAResponse loadingDataState(@Nullable Integer loadingDataState) {
    this.loadingDataState = loadingDataState;
    return this;
  }

  /**
   * Get loadingDataState
   * @return loadingDataState
   */
  
  @JsonProperty("loadingDataState")
  public @Nullable Integer getLoadingDataState() {
    return loadingDataState;
  }

  public void setLoadingDataState(@Nullable Integer loadingDataState) {
    this.loadingDataState = loadingDataState;
  }

  public RaceAnalysisNAResponse ignoreRefCheck(@Nullable Integer ignoreRefCheck) {
    this.ignoreRefCheck = ignoreRefCheck;
    return this;
  }

  /**
   * Get ignoreRefCheck
   * @return ignoreRefCheck
   */
  
  @JsonProperty("ignoreRefCheck")
  public @Nullable Integer getIgnoreRefCheck() {
    return ignoreRefCheck;
  }

  public void setIgnoreRefCheck(@Nullable Integer ignoreRefCheck) {
    this.ignoreRefCheck = ignoreRefCheck;
  }

  public RaceAnalysisNAResponse segmentSelected(@Nullable String segmentSelected) {
    this.segmentSelected = segmentSelected;
    return this;
  }

  /**
   * Get segmentSelected
   * @return segmentSelected
   */
  
  @JsonProperty("segmentSelected")
  public @Nullable String getSegmentSelected() {
    return segmentSelected;
  }

  public void setSegmentSelected(@Nullable String segmentSelected) {
    this.segmentSelected = segmentSelected;
  }

  public RaceAnalysisNAResponse unlocked(@Nullable String unlocked) {
    this.unlocked = unlocked;
    return this;
  }

  /**
   * Get unlocked
   * @return unlocked
   */
  
  @JsonProperty("unlocked")
  public @Nullable String getUnlocked() {
    return unlocked;
  }

  public void setUnlocked(@Nullable String unlocked) {
    this.unlocked = unlocked;
  }

  public RaceAnalysisNAResponse credits(@Nullable String credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  
  @JsonProperty("credits")
  public @Nullable String getCredits() {
    return credits;
  }

  public void setCredits(@Nullable String credits) {
    this.credits = credits;
  }

  public RaceAnalysisNAResponse selSeasonNb(@Nullable String selSeasonNb) {
    this.selSeasonNb = selSeasonNb;
    return this;
  }

  /**
   * Get selSeasonNb
   * @return selSeasonNb
   */
  
  @JsonProperty("selSeasonNb")
  public @Nullable String getSelSeasonNb() {
    return selSeasonNb;
  }

  public void setSelSeasonNb(@Nullable String selSeasonNb) {
    this.selSeasonNb = selSeasonNb;
  }

  public RaceAnalysisNAResponse selRaceNb(@Nullable String selRaceNb) {
    this.selRaceNb = selRaceNb;
    return this;
  }

  /**
   * Get selRaceNb
   * @return selRaceNb
   */
  
  @JsonProperty("selRaceNb")
  public @Nullable String getSelRaceNb() {
    return selRaceNb;
  }

  public void setSelRaceNb(@Nullable String selRaceNb) {
    this.selRaceNb = selRaceNb;
  }

  public RaceAnalysisNAResponse group(@Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  
  @JsonProperty("group")
  public @Nullable String getGroup() {
    return group;
  }

  public void setGroup(@Nullable String group) {
    this.group = group;
  }

  public RaceAnalysisNAResponse trackName(@Nullable String trackName) {
    this.trackName = trackName;
    return this;
  }

  /**
   * Get trackName
   * @return trackName
   */
  
  @JsonProperty("trackName")
  public @Nullable String getTrackName() {
    return trackName;
  }

  public void setTrackName(@Nullable String trackName) {
    this.trackName = trackName;
  }

  public RaceAnalysisNAResponse trackNatCode(@Nullable String trackNatCode) {
    this.trackNatCode = trackNatCode;
    return this;
  }

  /**
   * Get trackNatCode
   * @return trackNatCode
   */
  
  @JsonProperty("trackNatCode")
  public @Nullable String getTrackNatCode() {
    return trackNatCode;
  }

  public void setTrackNatCode(@Nullable String trackNatCode) {
    this.trackNatCode = trackNatCode;
  }

  public RaceAnalysisNAResponse trackCountry(@Nullable String trackCountry) {
    this.trackCountry = trackCountry;
    return this;
  }

  /**
   * Get trackCountry
   * @return trackCountry
   */
  
  @JsonProperty("trackCountry")
  public @Nullable String getTrackCountry() {
    return trackCountry;
  }

  public void setTrackCountry(@Nullable String trackCountry) {
    this.trackCountry = trackCountry;
  }

  public RaceAnalysisNAResponse trackId(@Nullable String trackId) {
    this.trackId = trackId;
    return this;
  }

  /**
   * Get trackId
   * @return trackId
   */
  
  @JsonProperty("trackId")
  public @Nullable String getTrackId() {
    return trackId;
  }

  public void setTrackId(@Nullable String trackId) {
    this.trackId = trackId;
  }

  public RaceAnalysisNAResponse racesToSelect(List<@Valid RaceAnalysisNAResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
    return this;
  }

  public RaceAnalysisNAResponse addRacesToSelectItem(RaceAnalysisNAResponseRacesToSelectInner racesToSelectItem) {
    if (this.racesToSelect == null) {
      this.racesToSelect = new ArrayList<>();
    }
    this.racesToSelect.add(racesToSelectItem);
    return this;
  }

  /**
   * Get racesToSelect
   * @return racesToSelect
   */
  @Valid 
  @JsonProperty("racesToSelect")
  public List<@Valid RaceAnalysisNAResponseRacesToSelectInner> getRacesToSelect() {
    return racesToSelect;
  }

  public void setRacesToSelect(List<@Valid RaceAnalysisNAResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
  }

  public RaceAnalysisNAResponse laps(List<Object> laps) {
    this.laps = laps;
    return this;
  }

  public RaceAnalysisNAResponse addLapsItem(Object lapsItem) {
    if (this.laps == null) {
      this.laps = new ArrayList<>();
    }
    this.laps.add(lapsItem);
    return this;
  }

  /**
   * Get laps
   * @return laps
   */
  
  @JsonProperty("laps")
  public List<Object> getLaps() {
    return laps;
  }

  public void setLaps(List<Object> laps) {
    this.laps = laps;
  }

  public RaceAnalysisNAResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
    this.apiRequestsRemaining = apiRequestsRemaining;
    return this;
  }

  /**
   * Get apiRequestsRemaining
   * @return apiRequestsRemaining
   */
  
  @JsonProperty("apiRequestsRemaining")
  public @Nullable Integer getApiRequestsRemaining() {
    return apiRequestsRemaining;
  }

  public void setApiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
    this.apiRequestsRemaining = apiRequestsRemaining;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisNAResponse raceAnalysisNAResponse = (RaceAnalysisNAResponse) o;
    return Objects.equals(this.loadingDataState, raceAnalysisNAResponse.loadingDataState) &&
        Objects.equals(this.ignoreRefCheck, raceAnalysisNAResponse.ignoreRefCheck) &&
        Objects.equals(this.segmentSelected, raceAnalysisNAResponse.segmentSelected) &&
        Objects.equals(this.unlocked, raceAnalysisNAResponse.unlocked) &&
        Objects.equals(this.credits, raceAnalysisNAResponse.credits) &&
        Objects.equals(this.selSeasonNb, raceAnalysisNAResponse.selSeasonNb) &&
        Objects.equals(this.selRaceNb, raceAnalysisNAResponse.selRaceNb) &&
        Objects.equals(this.group, raceAnalysisNAResponse.group) &&
        Objects.equals(this.trackName, raceAnalysisNAResponse.trackName) &&
        Objects.equals(this.trackNatCode, raceAnalysisNAResponse.trackNatCode) &&
        Objects.equals(this.trackCountry, raceAnalysisNAResponse.trackCountry) &&
        Objects.equals(this.trackId, raceAnalysisNAResponse.trackId) &&
        Objects.equals(this.racesToSelect, raceAnalysisNAResponse.racesToSelect) &&
        Objects.equals(this.laps, raceAnalysisNAResponse.laps) &&
        Objects.equals(this.apiRequestsRemaining, raceAnalysisNAResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, ignoreRefCheck, segmentSelected, unlocked, credits, selSeasonNb, selRaceNb, group, trackName, trackNatCode, trackCountry, trackId, racesToSelect, laps, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisNAResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    ignoreRefCheck: ").append(toIndentedString(ignoreRefCheck)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    unlocked: ").append(toIndentedString(unlocked)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    selSeasonNb: ").append(toIndentedString(selSeasonNb)).append("\n");
    sb.append("    selRaceNb: ").append(toIndentedString(selRaceNb)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackNatCode: ").append(toIndentedString(trackNatCode)).append("\n");
    sb.append("    trackCountry: ").append(toIndentedString(trackCountry)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    racesToSelect: ").append(toIndentedString(racesToSelect)).append("\n");
    sb.append("    laps: ").append(toIndentedString(laps)).append("\n");
    sb.append("    apiRequestsRemaining: ").append(toIndentedString(apiRequestsRemaining)).append("\n");
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

