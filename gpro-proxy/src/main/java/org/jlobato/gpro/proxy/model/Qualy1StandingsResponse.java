package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.GroupsArrayInner;
import org.jlobato.gpro.proxy.model.Qualy1StandingsResponseManagersInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Qualy1StandingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class Qualy1StandingsResponse implements GetQualyStandings200Response {

  private @Nullable String loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String group;

  private @Nullable Integer curPage;

  private @Nullable Integer totPages;

  @Valid
  private List<@Valid Qualy1StandingsResponseManagersInner> managers = new ArrayList<>();

  @Valid
  private List<@Valid GroupsArrayInner> groups = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public Qualy1StandingsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public Qualy1StandingsResponse segmentSelected(@Nullable String segmentSelected) {
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

  public Qualy1StandingsResponse group(@Nullable String group) {
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

  public Qualy1StandingsResponse curPage(@Nullable Integer curPage) {
    this.curPage = curPage;
    return this;
  }

  /**
   * Get curPage
   * @return curPage
   */
  
  @JsonProperty("curPage")
  public @Nullable Integer getCurPage() {
    return curPage;
  }

  public void setCurPage(@Nullable Integer curPage) {
    this.curPage = curPage;
  }

  public Qualy1StandingsResponse totPages(@Nullable Integer totPages) {
    this.totPages = totPages;
    return this;
  }

  /**
   * Get totPages
   * @return totPages
   */
  
  @JsonProperty("totPages")
  public @Nullable Integer getTotPages() {
    return totPages;
  }

  public void setTotPages(@Nullable Integer totPages) {
    this.totPages = totPages;
  }

  public Qualy1StandingsResponse managers(List<@Valid Qualy1StandingsResponseManagersInner> managers) {
    this.managers = managers;
    return this;
  }

  public Qualy1StandingsResponse addManagersItem(Qualy1StandingsResponseManagersInner managersItem) {
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
  public List<@Valid Qualy1StandingsResponseManagersInner> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid Qualy1StandingsResponseManagersInner> managers) {
    this.managers = managers;
  }

  public Qualy1StandingsResponse groups(List<@Valid GroupsArrayInner> groups) {
    this.groups = groups;
    return this;
  }

  public Qualy1StandingsResponse addGroupsItem(GroupsArrayInner groupsItem) {
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
  public List<@Valid GroupsArrayInner> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid GroupsArrayInner> groups) {
    this.groups = groups;
  }

  public Qualy1StandingsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    Qualy1StandingsResponse qualy1StandingsResponse = (Qualy1StandingsResponse) o;
    return Objects.equals(this.loadingDataState, qualy1StandingsResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, qualy1StandingsResponse.segmentSelected) &&
        Objects.equals(this.group, qualy1StandingsResponse.group) &&
        Objects.equals(this.curPage, qualy1StandingsResponse.curPage) &&
        Objects.equals(this.totPages, qualy1StandingsResponse.totPages) &&
        Objects.equals(this.managers, qualy1StandingsResponse.managers) &&
        Objects.equals(this.groups, qualy1StandingsResponse.groups) &&
        Objects.equals(this.apiRequestsRemaining, qualy1StandingsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, group, curPage, totPages, managers, groups, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qualy1StandingsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
    sb.append("    totPages: ").append(toIndentedString(totPages)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
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

