package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.QualyResultsResponseQ1DataInner;
import org.jlobato.gpro.proxy.model.RaceReplayResponseRacesToSelectInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QualyResultsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class QualyResultsResponse {

  private @Nullable String loadingDataState;

  private @Nullable String group;

  private @Nullable String trackName;

  private @Nullable String trackId;

  private @Nullable String season;

  private @Nullable String race;

  @Valid
  private List<@Valid QualyResultsResponseQ1DataInner> q1Data = new ArrayList<>();

  @Valid
  private List<@Valid QualyResultsResponseQ1DataInner> q2Data = new ArrayList<>();

  @Valid
  private List<@Valid QualyResultsResponseQ1DataInner> sgData = new ArrayList<>();

  @Valid
  private List<@Valid RaceReplayResponseRacesToSelectInner> racesToSelect = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public QualyResultsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public QualyResultsResponse group(@Nullable String group) {
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

  public QualyResultsResponse trackName(@Nullable String trackName) {
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

  public QualyResultsResponse trackId(@Nullable String trackId) {
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

  public QualyResultsResponse season(@Nullable String season) {
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

  public QualyResultsResponse race(@Nullable String race) {
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

  public QualyResultsResponse q1Data(List<@Valid QualyResultsResponseQ1DataInner> q1Data) {
    this.q1Data = q1Data;
    return this;
  }

  public QualyResultsResponse addQ1DataItem(QualyResultsResponseQ1DataInner q1DataItem) {
    if (this.q1Data == null) {
      this.q1Data = new ArrayList<>();
    }
    this.q1Data.add(q1DataItem);
    return this;
  }

  /**
   * Get q1Data
   * @return q1Data
   */
  @Valid 
  @JsonProperty("q1Data")
  public List<@Valid QualyResultsResponseQ1DataInner> getQ1Data() {
    return q1Data;
  }

  public void setQ1Data(List<@Valid QualyResultsResponseQ1DataInner> q1Data) {
    this.q1Data = q1Data;
  }

  public QualyResultsResponse q2Data(List<@Valid QualyResultsResponseQ1DataInner> q2Data) {
    this.q2Data = q2Data;
    return this;
  }

  public QualyResultsResponse addQ2DataItem(QualyResultsResponseQ1DataInner q2DataItem) {
    if (this.q2Data == null) {
      this.q2Data = new ArrayList<>();
    }
    this.q2Data.add(q2DataItem);
    return this;
  }

  /**
   * Get q2Data
   * @return q2Data
   */
  @Valid 
  @JsonProperty("q2Data")
  public List<@Valid QualyResultsResponseQ1DataInner> getQ2Data() {
    return q2Data;
  }

  public void setQ2Data(List<@Valid QualyResultsResponseQ1DataInner> q2Data) {
    this.q2Data = q2Data;
  }

  public QualyResultsResponse sgData(List<@Valid QualyResultsResponseQ1DataInner> sgData) {
    this.sgData = sgData;
    return this;
  }

  public QualyResultsResponse addSgDataItem(QualyResultsResponseQ1DataInner sgDataItem) {
    if (this.sgData == null) {
      this.sgData = new ArrayList<>();
    }
    this.sgData.add(sgDataItem);
    return this;
  }

  /**
   * Get sgData
   * @return sgData
   */
  @Valid 
  @JsonProperty("sgData")
  public List<@Valid QualyResultsResponseQ1DataInner> getSgData() {
    return sgData;
  }

  public void setSgData(List<@Valid QualyResultsResponseQ1DataInner> sgData) {
    this.sgData = sgData;
  }

  public QualyResultsResponse racesToSelect(List<@Valid RaceReplayResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
    return this;
  }

  public QualyResultsResponse addRacesToSelectItem(RaceReplayResponseRacesToSelectInner racesToSelectItem) {
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

  public QualyResultsResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public QualyResultsResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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

  public QualyResultsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    QualyResultsResponse qualyResultsResponse = (QualyResultsResponse) o;
    return Objects.equals(this.loadingDataState, qualyResultsResponse.loadingDataState) &&
        Objects.equals(this.group, qualyResultsResponse.group) &&
        Objects.equals(this.trackName, qualyResultsResponse.trackName) &&
        Objects.equals(this.trackId, qualyResultsResponse.trackId) &&
        Objects.equals(this.season, qualyResultsResponse.season) &&
        Objects.equals(this.race, qualyResultsResponse.race) &&
        Objects.equals(this.q1Data, qualyResultsResponse.q1Data) &&
        Objects.equals(this.q2Data, qualyResultsResponse.q2Data) &&
        Objects.equals(this.sgData, qualyResultsResponse.sgData) &&
        Objects.equals(this.racesToSelect, qualyResultsResponse.racesToSelect) &&
        Objects.equals(this.groups, qualyResultsResponse.groups) &&
        Objects.equals(this.apiRequestsRemaining, qualyResultsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, group, trackName, trackId, season, race, q1Data, q2Data, sgData, racesToSelect, groups, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualyResultsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    q1Data: ").append(toIndentedString(q1Data)).append("\n");
    sb.append("    q2Data: ").append(toIndentedString(q2Data)).append("\n");
    sb.append("    sgData: ").append(toIndentedString(sgData)).append("\n");
    sb.append("    racesToSelect: ").append(toIndentedString(racesToSelect)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

