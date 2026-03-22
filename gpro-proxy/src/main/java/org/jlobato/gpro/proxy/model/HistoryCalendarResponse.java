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
import org.jlobato.gpro.proxy.model.HistoryCalendarResponseManagersInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoryCalendarResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryCalendarResponse implements GetHistory200Response {

  private @Nullable String loadingDataState;

  @Valid
  private List<@Valid History500OBRResponseSectionsInner> sections = new ArrayList<>();

  private @Nullable String group;

  private @Nullable Integer requestedSeason;

  private @Nullable Integer season;

  private @Nullable String title;

  private @Nullable String statsType;

  @Valid
  private List<@Valid HistoryCalendarResponseManagersInner> managers = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  public HistoryCalendarResponse loadingDataState(@Nullable String loadingDataState) {
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

  public HistoryCalendarResponse sections(List<@Valid History500OBRResponseSectionsInner> sections) {
    this.sections = sections;
    return this;
  }

  public HistoryCalendarResponse addSectionsItem(History500OBRResponseSectionsInner sectionsItem) {
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

  public HistoryCalendarResponse group(@Nullable String group) {
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

  public HistoryCalendarResponse requestedSeason(@Nullable Integer requestedSeason) {
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

  public HistoryCalendarResponse season(@Nullable Integer season) {
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

  public HistoryCalendarResponse title(@Nullable String title) {
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

  public HistoryCalendarResponse statsType(@Nullable String statsType) {
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

  public HistoryCalendarResponse managers(List<@Valid HistoryCalendarResponseManagersInner> managers) {
    this.managers = managers;
    return this;
  }

  public HistoryCalendarResponse addManagersItem(HistoryCalendarResponseManagersInner managersItem) {
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
  public List<@Valid HistoryCalendarResponseManagersInner> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid HistoryCalendarResponseManagersInner> managers) {
    this.managers = managers;
  }

  public HistoryCalendarResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public HistoryCalendarResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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
    HistoryCalendarResponse historyCalendarResponse = (HistoryCalendarResponse) o;
    return Objects.equals(this.loadingDataState, historyCalendarResponse.loadingDataState) &&
        Objects.equals(this.sections, historyCalendarResponse.sections) &&
        Objects.equals(this.group, historyCalendarResponse.group) &&
        Objects.equals(this.requestedSeason, historyCalendarResponse.requestedSeason) &&
        Objects.equals(this.season, historyCalendarResponse.season) &&
        Objects.equals(this.title, historyCalendarResponse.title) &&
        Objects.equals(this.statsType, historyCalendarResponse.statsType) &&
        Objects.equals(this.managers, historyCalendarResponse.managers) &&
        Objects.equals(this.groups, historyCalendarResponse.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, sections, group, requestedSeason, season, title, statsType, managers, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryCalendarResponse {\n");
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

