package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.RaceReplayResponseRacesToSelectInner;
import org.jlobato.gpro.proxy.model.RaceReplayResponseReplayDataInner;
import org.jlobato.gpro.proxy.model.RaceReplayResponseReplayDataInnerManagersInnerValueInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RaceReplayResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceReplayResponse {

  private @Nullable String loadingDataState;

  private @Nullable Integer live;

  private @Nullable Integer loadingData;

  private @Nullable String group;

  private @Nullable Integer ignoreRefCheck;

  private @Nullable String seasonNb;

  private @Nullable String raceNb;

  @Valid
  private List<@Valid RaceReplayResponseReplayDataInner> replayData = new ArrayList<>();

  private @Nullable String gpName;

  private @Nullable String trackPath;

  @Valid
  private List<Map<String, List<Integer>>> weather = new ArrayList<>();

  @Valid
  private List<Map<String, List<List<Integer>>>> blockingData = new ArrayList<>();

  private @Nullable Integer hasAccess;

  private @Nullable Integer showBuyModal;

  private @Nullable Integer grass;

  private @Nullable Integer nbLaps;

  @Valid
  private List<List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>> trackSections = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  @Valid
  private List<@Valid RaceReplayResponseRacesToSelectInner> racesToSelect = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public RaceReplayResponse loadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
    return this;
  }

  /**
   * Get loadingDataState
   * @return loadingDataState
   */
  
  @JsonProperty("loadingDataState")
  public @Nullable String getLoadingDataState() {
    return loadingDataState;
  }

  public void setLoadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
  }

  public RaceReplayResponse live(@Nullable Integer live) {
    this.live = live;
    return this;
  }

  /**
   * Get live
   * @return live
   */
  
  @JsonProperty("live")
  public @Nullable Integer getLive() {
    return live;
  }

  public void setLive(@Nullable Integer live) {
    this.live = live;
  }

  public RaceReplayResponse loadingData(@Nullable Integer loadingData) {
    this.loadingData = loadingData;
    return this;
  }

  /**
   * Get loadingData
   * @return loadingData
   */
  
  @JsonProperty("loadingData")
  public @Nullable Integer getLoadingData() {
    return loadingData;
  }

  public void setLoadingData(@Nullable Integer loadingData) {
    this.loadingData = loadingData;
  }

  public RaceReplayResponse group(@Nullable String group) {
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

  public RaceReplayResponse ignoreRefCheck(@Nullable Integer ignoreRefCheck) {
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

  public RaceReplayResponse seasonNb(@Nullable String seasonNb) {
    this.seasonNb = seasonNb;
    return this;
  }

  /**
   * Get seasonNb
   * @return seasonNb
   */
  
  @JsonProperty("seasonNb")
  public @Nullable String getSeasonNb() {
    return seasonNb;
  }

  public void setSeasonNb(@Nullable String seasonNb) {
    this.seasonNb = seasonNb;
  }

  public RaceReplayResponse raceNb(@Nullable String raceNb) {
    this.raceNb = raceNb;
    return this;
  }

  /**
   * Get raceNb
   * @return raceNb
   */
  
  @JsonProperty("raceNb")
  public @Nullable String getRaceNb() {
    return raceNb;
  }

  public void setRaceNb(@Nullable String raceNb) {
    this.raceNb = raceNb;
  }

  public RaceReplayResponse replayData(List<@Valid RaceReplayResponseReplayDataInner> replayData) {
    this.replayData = replayData;
    return this;
  }

  public RaceReplayResponse addReplayDataItem(RaceReplayResponseReplayDataInner replayDataItem) {
    if (this.replayData == null) {
      this.replayData = new ArrayList<>();
    }
    this.replayData.add(replayDataItem);
    return this;
  }

  /**
   * Get replayData
   * @return replayData
   */
  @Valid 
  @JsonProperty("replayData")
  public List<@Valid RaceReplayResponseReplayDataInner> getReplayData() {
    return replayData;
  }

  public void setReplayData(List<@Valid RaceReplayResponseReplayDataInner> replayData) {
    this.replayData = replayData;
  }

  public RaceReplayResponse gpName(@Nullable String gpName) {
    this.gpName = gpName;
    return this;
  }

  /**
   * Get gpName
   * @return gpName
   */
  
  @JsonProperty("gpName")
  public @Nullable String getGpName() {
    return gpName;
  }

  public void setGpName(@Nullable String gpName) {
    this.gpName = gpName;
  }

  public RaceReplayResponse trackPath(@Nullable String trackPath) {
    this.trackPath = trackPath;
    return this;
  }

  /**
   * Get trackPath
   * @return trackPath
   */
  
  @JsonProperty("trackPath")
  public @Nullable String getTrackPath() {
    return trackPath;
  }

  public void setTrackPath(@Nullable String trackPath) {
    this.trackPath = trackPath;
  }

  public RaceReplayResponse weather(List<Map<String, List<Integer>>> weather) {
    this.weather = weather;
    return this;
  }

  public RaceReplayResponse addWeatherItem(Map<String, List<Integer>> weatherItem) {
    if (this.weather == null) {
      this.weather = new ArrayList<>();
    }
    this.weather.add(weatherItem);
    return this;
  }

  /**
   * Get weather
   * @return weather
   */
  @Valid 
  @JsonProperty("weather")
  public List<Map<String, List<Integer>>> getWeather() {
    return weather;
  }

  public void setWeather(List<Map<String, List<Integer>>> weather) {
    this.weather = weather;
  }

  public RaceReplayResponse blockingData(List<Map<String, List<List<Integer>>>> blockingData) {
    this.blockingData = blockingData;
    return this;
  }

  public RaceReplayResponse addBlockingDataItem(Map<String, List<List<Integer>>> blockingDataItem) {
    if (this.blockingData == null) {
      this.blockingData = new ArrayList<>();
    }
    this.blockingData.add(blockingDataItem);
    return this;
  }

  /**
   * Get blockingData
   * @return blockingData
   */
  @Valid 
  @JsonProperty("blockingData")
  public List<Map<String, List<List<Integer>>>> getBlockingData() {
    return blockingData;
  }

  public void setBlockingData(List<Map<String, List<List<Integer>>>> blockingData) {
    this.blockingData = blockingData;
  }

  public RaceReplayResponse hasAccess(@Nullable Integer hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

  /**
   * Get hasAccess
   * @return hasAccess
   */
  
  @JsonProperty("hasAccess")
  public @Nullable Integer getHasAccess() {
    return hasAccess;
  }

  public void setHasAccess(@Nullable Integer hasAccess) {
    this.hasAccess = hasAccess;
  }

  public RaceReplayResponse showBuyModal(@Nullable Integer showBuyModal) {
    this.showBuyModal = showBuyModal;
    return this;
  }

  /**
   * Get showBuyModal
   * @return showBuyModal
   */
  
  @JsonProperty("showBuyModal")
  public @Nullable Integer getShowBuyModal() {
    return showBuyModal;
  }

  public void setShowBuyModal(@Nullable Integer showBuyModal) {
    this.showBuyModal = showBuyModal;
  }

  public RaceReplayResponse grass(@Nullable Integer grass) {
    this.grass = grass;
    return this;
  }

  /**
   * Get grass
   * @return grass
   */
  
  @JsonProperty("grass")
  public @Nullable Integer getGrass() {
    return grass;
  }

  public void setGrass(@Nullable Integer grass) {
    this.grass = grass;
  }

  public RaceReplayResponse nbLaps(@Nullable Integer nbLaps) {
    this.nbLaps = nbLaps;
    return this;
  }

  /**
   * Get nbLaps
   * @return nbLaps
   */
  
  @JsonProperty("nbLaps")
  public @Nullable Integer getNbLaps() {
    return nbLaps;
  }

  public void setNbLaps(@Nullable Integer nbLaps) {
    this.nbLaps = nbLaps;
  }

  public RaceReplayResponse trackSections(List<List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>> trackSections) {
    this.trackSections = trackSections;
    return this;
  }

  public RaceReplayResponse addTrackSectionsItem(List<RaceReplayResponseReplayDataInnerManagersInnerValueInner> trackSectionsItem) {
    if (this.trackSections == null) {
      this.trackSections = new ArrayList<>();
    }
    this.trackSections.add(trackSectionsItem);
    return this;
  }

  /**
   * Get trackSections
   * @return trackSections
   */
  @Valid 
  @JsonProperty("trackSections")
  public List<List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>> getTrackSections() {
    return trackSections;
  }

  public void setTrackSections(List<List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>> trackSections) {
    this.trackSections = trackSections;
  }

  public RaceReplayResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public RaceReplayResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  @Valid 
  @JsonProperty("groups")
  public List<@Valid CalendarResponseGroupsInner> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
  }

  public RaceReplayResponse racesToSelect(List<@Valid RaceReplayResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
    return this;
  }

  public RaceReplayResponse addRacesToSelectItem(RaceReplayResponseRacesToSelectInner racesToSelectItem) {
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
  public List<@Valid RaceReplayResponseRacesToSelectInner> getRacesToSelect() {
    return racesToSelect;
  }

  public void setRacesToSelect(List<@Valid RaceReplayResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
  }

  public RaceReplayResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    RaceReplayResponse raceReplayResponse = (RaceReplayResponse) o;
    return Objects.equals(this.loadingDataState, raceReplayResponse.loadingDataState) &&
        Objects.equals(this.live, raceReplayResponse.live) &&
        Objects.equals(this.loadingData, raceReplayResponse.loadingData) &&
        Objects.equals(this.group, raceReplayResponse.group) &&
        Objects.equals(this.ignoreRefCheck, raceReplayResponse.ignoreRefCheck) &&
        Objects.equals(this.seasonNb, raceReplayResponse.seasonNb) &&
        Objects.equals(this.raceNb, raceReplayResponse.raceNb) &&
        Objects.equals(this.replayData, raceReplayResponse.replayData) &&
        Objects.equals(this.gpName, raceReplayResponse.gpName) &&
        Objects.equals(this.trackPath, raceReplayResponse.trackPath) &&
        Objects.equals(this.weather, raceReplayResponse.weather) &&
        Objects.equals(this.blockingData, raceReplayResponse.blockingData) &&
        Objects.equals(this.hasAccess, raceReplayResponse.hasAccess) &&
        Objects.equals(this.showBuyModal, raceReplayResponse.showBuyModal) &&
        Objects.equals(this.grass, raceReplayResponse.grass) &&
        Objects.equals(this.nbLaps, raceReplayResponse.nbLaps) &&
        Objects.equals(this.trackSections, raceReplayResponse.trackSections) &&
        Objects.equals(this.groups, raceReplayResponse.groups) &&
        Objects.equals(this.racesToSelect, raceReplayResponse.racesToSelect) &&
        Objects.equals(this.apiRequestsRemaining, raceReplayResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, live, loadingData, group, ignoreRefCheck, seasonNb, raceNb, replayData, gpName, trackPath, weather, blockingData, hasAccess, showBuyModal, grass, nbLaps, trackSections, groups, racesToSelect, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceReplayResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    loadingData: ").append(toIndentedString(loadingData)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    ignoreRefCheck: ").append(toIndentedString(ignoreRefCheck)).append("\n");
    sb.append("    seasonNb: ").append(toIndentedString(seasonNb)).append("\n");
    sb.append("    raceNb: ").append(toIndentedString(raceNb)).append("\n");
    sb.append("    replayData: ").append(toIndentedString(replayData)).append("\n");
    sb.append("    gpName: ").append(toIndentedString(gpName)).append("\n");
    sb.append("    trackPath: ").append(toIndentedString(trackPath)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    blockingData: ").append(toIndentedString(blockingData)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    showBuyModal: ").append(toIndentedString(showBuyModal)).append("\n");
    sb.append("    grass: ").append(toIndentedString(grass)).append("\n");
    sb.append("    nbLaps: ").append(toIndentedString(nbLaps)).append("\n");
    sb.append("    trackSections: ").append(toIndentedString(trackSections)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    racesToSelect: ").append(toIndentedString(racesToSelect)).append("\n");
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

