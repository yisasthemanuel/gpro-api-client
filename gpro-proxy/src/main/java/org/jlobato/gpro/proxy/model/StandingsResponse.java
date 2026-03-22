package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraph;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphPts;
import org.jlobato.gpro.proxy.model.StandingsResponseManagersInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponse {

  private @Nullable String loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String group;

  @Valid
  private List<@Valid StandingsResponseManagersInner> managers = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  private @Nullable StandingsResponseDataGraph dataGraph;

  private @Nullable StandingsResponseDataGraphPts dataGraphPts;

  private @Nullable Integer apiRequestsRemaining;

  public StandingsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public StandingsResponse segmentSelected(@Nullable String segmentSelected) {
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

  public StandingsResponse group(@Nullable String group) {
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

  public StandingsResponse managers(List<@Valid StandingsResponseManagersInner> managers) {
    this.managers = managers;
    return this;
  }

  public StandingsResponse addManagersItem(StandingsResponseManagersInner managersItem) {
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
  public List<@Valid StandingsResponseManagersInner> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid StandingsResponseManagersInner> managers) {
    this.managers = managers;
  }

  public StandingsResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public StandingsResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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

  public StandingsResponse dataGraph(@Nullable StandingsResponseDataGraph dataGraph) {
    this.dataGraph = dataGraph;
    return this;
  }

  /**
   * Get dataGraph
   * @return dataGraph
   */
  @Valid 
  @JsonProperty("dataGraph")
  public @Nullable StandingsResponseDataGraph getDataGraph() {
    return dataGraph;
  }

  public void setDataGraph(@Nullable StandingsResponseDataGraph dataGraph) {
    this.dataGraph = dataGraph;
  }

  public StandingsResponse dataGraphPts(@Nullable StandingsResponseDataGraphPts dataGraphPts) {
    this.dataGraphPts = dataGraphPts;
    return this;
  }

  /**
   * Get dataGraphPts
   * @return dataGraphPts
   */
  @Valid 
  @JsonProperty("dataGraphPts")
  public @Nullable StandingsResponseDataGraphPts getDataGraphPts() {
    return dataGraphPts;
  }

  public void setDataGraphPts(@Nullable StandingsResponseDataGraphPts dataGraphPts) {
    this.dataGraphPts = dataGraphPts;
  }

  public StandingsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    StandingsResponse standingsResponse = (StandingsResponse) o;
    return Objects.equals(this.loadingDataState, standingsResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, standingsResponse.segmentSelected) &&
        Objects.equals(this.group, standingsResponse.group) &&
        Objects.equals(this.managers, standingsResponse.managers) &&
        Objects.equals(this.groups, standingsResponse.groups) &&
        Objects.equals(this.dataGraph, standingsResponse.dataGraph) &&
        Objects.equals(this.dataGraphPts, standingsResponse.dataGraphPts) &&
        Objects.equals(this.apiRequestsRemaining, standingsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, group, managers, groups, dataGraph, dataGraphPts, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    dataGraph: ").append(toIndentedString(dataGraph)).append("\n");
    sb.append("    dataGraphPts: ").append(toIndentedString(dataGraphPts)).append("\n");
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

