package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.History500OBRResponseSectionsInner;
import org.jlobato.gpro.proxy.model.HistoryGroupStandingsResponseManagersInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoryTeamStandingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryTeamStandingsResponse implements GetHistory200Response {

  private @Nullable String loadingDataState;

  @Valid
  private List<@Valid History500OBRResponseSectionsInner> sections = new ArrayList<>();

  private @Nullable String group;

  private @Nullable Integer requestedSeason;

  private @Nullable Integer season;

  private @Nullable String title;

  private @Nullable String statsType;

  @Valid
  private List<@Valid HistoryGroupStandingsResponseManagersInner> managers = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  public HistoryTeamStandingsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public HistoryTeamStandingsResponse sections(List<@Valid History500OBRResponseSectionsInner> sections) {
    this.sections = sections;
    return this;
  }

  public HistoryTeamStandingsResponse addSectionsItem(History500OBRResponseSectionsInner sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Get sections
   * @return sections
   */
  @Valid 
  @JsonProperty("sections")
  public List<@Valid History500OBRResponseSectionsInner> getSections() {
    return sections;
  }

  public void setSections(List<@Valid History500OBRResponseSectionsInner> sections) {
    this.sections = sections;
  }

  public HistoryTeamStandingsResponse group(@Nullable String group) {
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

  public HistoryTeamStandingsResponse requestedSeason(@Nullable Integer requestedSeason) {
    this.requestedSeason = requestedSeason;
    return this;
  }

  /**
   * Get requestedSeason
   * @return requestedSeason
   */
  
  @JsonProperty("requestedSeason")
  public @Nullable Integer getRequestedSeason() {
    return requestedSeason;
  }

  public void setRequestedSeason(@Nullable Integer requestedSeason) {
    this.requestedSeason = requestedSeason;
  }

  public HistoryTeamStandingsResponse season(@Nullable Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
   */
  
  @JsonProperty("season")
  public @Nullable Integer getSeason() {
    return season;
  }

  public void setSeason(@Nullable Integer season) {
    this.season = season;
  }

  public HistoryTeamStandingsResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public HistoryTeamStandingsResponse statsType(@Nullable String statsType) {
    this.statsType = statsType;
    return this;
  }

  /**
   * Get statsType
   * @return statsType
   */
  
  @JsonProperty("statsType")
  public @Nullable String getStatsType() {
    return statsType;
  }

  public void setStatsType(@Nullable String statsType) {
    this.statsType = statsType;
  }

  public HistoryTeamStandingsResponse managers(List<@Valid HistoryGroupStandingsResponseManagersInner> managers) {
    this.managers = managers;
    return this;
  }

  public HistoryTeamStandingsResponse addManagersItem(HistoryGroupStandingsResponseManagersInner managersItem) {
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
  public List<@Valid HistoryGroupStandingsResponseManagersInner> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid HistoryGroupStandingsResponseManagersInner> managers) {
    this.managers = managers;
  }

  public HistoryTeamStandingsResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public HistoryTeamStandingsResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryTeamStandingsResponse historyTeamStandingsResponse = (HistoryTeamStandingsResponse) o;
    return Objects.equals(this.loadingDataState, historyTeamStandingsResponse.loadingDataState) &&
        Objects.equals(this.sections, historyTeamStandingsResponse.sections) &&
        Objects.equals(this.group, historyTeamStandingsResponse.group) &&
        Objects.equals(this.requestedSeason, historyTeamStandingsResponse.requestedSeason) &&
        Objects.equals(this.season, historyTeamStandingsResponse.season) &&
        Objects.equals(this.title, historyTeamStandingsResponse.title) &&
        Objects.equals(this.statsType, historyTeamStandingsResponse.statsType) &&
        Objects.equals(this.managers, historyTeamStandingsResponse.managers) &&
        Objects.equals(this.groups, historyTeamStandingsResponse.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, sections, group, requestedSeason, season, title, statsType, managers, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryTeamStandingsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    requestedSeason: ").append(toIndentedString(requestedSeason)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    statsType: ").append(toIndentedString(statsType)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

