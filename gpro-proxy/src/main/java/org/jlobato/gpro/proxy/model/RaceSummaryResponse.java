package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONHairBg;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFavTrack1;
import org.jlobato.gpro.proxy.model.RaceReplayResponseRacesToSelectInner;
import org.jlobato.gpro.proxy.model.RaceSummaryResponseManagersInner;
import org.jlobato.gpro.proxy.model.RaceSummaryResponseNationsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RaceSummaryResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceSummaryResponse {

  private @Nullable String loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable Integer loadingData;

  private @Nullable String group;

  private @Nullable String propertyClass;

  private @Nullable String nation;

  private @Nullable Integer team;

  private @Nullable String season;

  private @Nullable String race;

  private @Nullable String trackName;

  private @Nullable String trackId;

  @Valid
  private List<@Valid DriverProfileResponseFaceJSONHairBg> seasons = new ArrayList<>();

  @Valid
  private List<@Valid DriverProfileResponseFaceJSONHairBg> races = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  @Valid
  private List<@Valid RaceSummaryResponseNationsInner> nations = new ArrayList<>();

  @Valid
  private List<@Valid DriverProfileResponseFavTrack1> teams = new ArrayList<>();

  @Valid
  private List<@Valid RaceSummaryResponseManagersInner> managers = new ArrayList<>();

  @Valid
  private List<@Valid RaceReplayResponseRacesToSelectInner> racesToSelect = new ArrayList<>();

  private @Nullable String cutoffTime112percent;

  private @Nullable Integer apiRequestsRemaining;

  public RaceSummaryResponse loadingDataState(@Nullable String loadingDataState) {
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

  public RaceSummaryResponse segmentSelected(@Nullable String segmentSelected) {
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

  public RaceSummaryResponse loadingData(@Nullable Integer loadingData) {
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

  public RaceSummaryResponse group(@Nullable String group) {
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

  public RaceSummaryResponse propertyClass(@Nullable String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
   */
  
  @JsonProperty("class")
  public @Nullable String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(@Nullable String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public RaceSummaryResponse nation(@Nullable String nation) {
    this.nation = nation;
    return this;
  }

  /**
   * Get nation
   * @return nation
   */
  
  @JsonProperty("nation")
  public @Nullable String getNation() {
    return nation;
  }

  public void setNation(@Nullable String nation) {
    this.nation = nation;
  }

  public RaceSummaryResponse team(@Nullable Integer team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  
  @JsonProperty("team")
  public @Nullable Integer getTeam() {
    return team;
  }

  public void setTeam(@Nullable Integer team) {
    this.team = team;
  }

  public RaceSummaryResponse season(@Nullable String season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
   */
  
  @JsonProperty("season")
  public @Nullable String getSeason() {
    return season;
  }

  public void setSeason(@Nullable String season) {
    this.season = season;
  }

  public RaceSummaryResponse race(@Nullable String race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
   */
  
  @JsonProperty("race")
  public @Nullable String getRace() {
    return race;
  }

  public void setRace(@Nullable String race) {
    this.race = race;
  }

  public RaceSummaryResponse trackName(@Nullable String trackName) {
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

  public RaceSummaryResponse trackId(@Nullable String trackId) {
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

  public RaceSummaryResponse seasons(List<@Valid DriverProfileResponseFaceJSONHairBg> seasons) {
    this.seasons = seasons;
    return this;
  }

  public RaceSummaryResponse addSeasonsItem(DriverProfileResponseFaceJSONHairBg seasonsItem) {
    if (this.seasons == null) {
      this.seasons = new ArrayList<>();
    }
    this.seasons.add(seasonsItem);
    return this;
  }

  /**
   * Get seasons
   * @return seasons
   */
  @Valid 
  @JsonProperty("seasons")
  public List<@Valid DriverProfileResponseFaceJSONHairBg> getSeasons() {
    return seasons;
  }

  public void setSeasons(List<@Valid DriverProfileResponseFaceJSONHairBg> seasons) {
    this.seasons = seasons;
  }

  public RaceSummaryResponse races(List<@Valid DriverProfileResponseFaceJSONHairBg> races) {
    this.races = races;
    return this;
  }

  public RaceSummaryResponse addRacesItem(DriverProfileResponseFaceJSONHairBg racesItem) {
    if (this.races == null) {
      this.races = new ArrayList<>();
    }
    this.races.add(racesItem);
    return this;
  }

  /**
   * Get races
   * @return races
   */
  @Valid 
  @JsonProperty("races")
  public List<@Valid DriverProfileResponseFaceJSONHairBg> getRaces() {
    return races;
  }

  public void setRaces(List<@Valid DriverProfileResponseFaceJSONHairBg> races) {
    this.races = races;
  }

  public RaceSummaryResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public RaceSummaryResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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

  public RaceSummaryResponse nations(List<@Valid RaceSummaryResponseNationsInner> nations) {
    this.nations = nations;
    return this;
  }

  public RaceSummaryResponse addNationsItem(RaceSummaryResponseNationsInner nationsItem) {
    if (this.nations == null) {
      this.nations = new ArrayList<>();
    }
    this.nations.add(nationsItem);
    return this;
  }

  /**
   * Get nations
   * @return nations
   */
  @Valid 
  @JsonProperty("nations")
  public List<@Valid RaceSummaryResponseNationsInner> getNations() {
    return nations;
  }

  public void setNations(List<@Valid RaceSummaryResponseNationsInner> nations) {
    this.nations = nations;
  }

  public RaceSummaryResponse teams(List<@Valid DriverProfileResponseFavTrack1> teams) {
    this.teams = teams;
    return this;
  }

  public RaceSummaryResponse addTeamsItem(DriverProfileResponseFavTrack1 teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
   */
  @Valid 
  @JsonProperty("teams")
  public List<@Valid DriverProfileResponseFavTrack1> getTeams() {
    return teams;
  }

  public void setTeams(List<@Valid DriverProfileResponseFavTrack1> teams) {
    this.teams = teams;
  }

  public RaceSummaryResponse managers(List<@Valid RaceSummaryResponseManagersInner> managers) {
    this.managers = managers;
    return this;
  }

  public RaceSummaryResponse addManagersItem(RaceSummaryResponseManagersInner managersItem) {
    if (this.managers == null) {
      this.managers = new ArrayList<>();
    }
    this.managers.add(managersItem);
    return this;
  }

  /**
   * Get managers
   * @return managers
   */
  @Valid 
  @JsonProperty("managers")
  public List<@Valid RaceSummaryResponseManagersInner> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid RaceSummaryResponseManagersInner> managers) {
    this.managers = managers;
  }

  public RaceSummaryResponse racesToSelect(List<@Valid RaceReplayResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
    return this;
  }

  public RaceSummaryResponse addRacesToSelectItem(RaceReplayResponseRacesToSelectInner racesToSelectItem) {
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

  public RaceSummaryResponse cutoffTime112percent(@Nullable String cutoffTime112percent) {
    this.cutoffTime112percent = cutoffTime112percent;
    return this;
  }

  /**
   * Get cutoffTime112percent
   * @return cutoffTime112percent
   */
  
  @JsonProperty("cutoffTime112percent")
  public @Nullable String getCutoffTime112percent() {
    return cutoffTime112percent;
  }

  public void setCutoffTime112percent(@Nullable String cutoffTime112percent) {
    this.cutoffTime112percent = cutoffTime112percent;
  }

  public RaceSummaryResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    RaceSummaryResponse raceSummaryResponse = (RaceSummaryResponse) o;
    return Objects.equals(this.loadingDataState, raceSummaryResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, raceSummaryResponse.segmentSelected) &&
        Objects.equals(this.loadingData, raceSummaryResponse.loadingData) &&
        Objects.equals(this.group, raceSummaryResponse.group) &&
        Objects.equals(this.propertyClass, raceSummaryResponse.propertyClass) &&
        Objects.equals(this.nation, raceSummaryResponse.nation) &&
        Objects.equals(this.team, raceSummaryResponse.team) &&
        Objects.equals(this.season, raceSummaryResponse.season) &&
        Objects.equals(this.race, raceSummaryResponse.race) &&
        Objects.equals(this.trackName, raceSummaryResponse.trackName) &&
        Objects.equals(this.trackId, raceSummaryResponse.trackId) &&
        Objects.equals(this.seasons, raceSummaryResponse.seasons) &&
        Objects.equals(this.races, raceSummaryResponse.races) &&
        Objects.equals(this.groups, raceSummaryResponse.groups) &&
        Objects.equals(this.nations, raceSummaryResponse.nations) &&
        Objects.equals(this.teams, raceSummaryResponse.teams) &&
        Objects.equals(this.managers, raceSummaryResponse.managers) &&
        Objects.equals(this.racesToSelect, raceSummaryResponse.racesToSelect) &&
        Objects.equals(this.cutoffTime112percent, raceSummaryResponse.cutoffTime112percent) &&
        Objects.equals(this.apiRequestsRemaining, raceSummaryResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, loadingData, group, propertyClass, nation, team, season, race, trackName, trackId, seasons, races, groups, nations, teams, managers, racesToSelect, cutoffTime112percent, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceSummaryResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    loadingData: ").append(toIndentedString(loadingData)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    nation: ").append(toIndentedString(nation)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    nations: ").append(toIndentedString(nations)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
    sb.append("    racesToSelect: ").append(toIndentedString(racesToSelect)).append("\n");
    sb.append("    cutoffTime112percent: ").append(toIndentedString(cutoffTime112percent)).append("\n");
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

