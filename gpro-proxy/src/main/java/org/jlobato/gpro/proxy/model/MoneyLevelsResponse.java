package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.MoneyLevelsResponseManagersInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoneyLevelsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class MoneyLevelsResponse {

  private @Nullable String loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String group;

  @Valid
  private List<@Valid MoneyLevelsResponseManagersInner> managers = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public MoneyLevelsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public MoneyLevelsResponse segmentSelected(@Nullable String segmentSelected) {
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

  public MoneyLevelsResponse group(@Nullable String group) {
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

  public MoneyLevelsResponse managers(List<@Valid MoneyLevelsResponseManagersInner> managers) {
    this.managers = managers;
    return this;
  }

  public MoneyLevelsResponse addManagersItem(MoneyLevelsResponseManagersInner managersItem) {
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
  public List<@Valid MoneyLevelsResponseManagersInner> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid MoneyLevelsResponseManagersInner> managers) {
    this.managers = managers;
  }

  public MoneyLevelsResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public MoneyLevelsResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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

  public MoneyLevelsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    MoneyLevelsResponse moneyLevelsResponse = (MoneyLevelsResponse) o;
    return Objects.equals(this.loadingDataState, moneyLevelsResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, moneyLevelsResponse.segmentSelected) &&
        Objects.equals(this.group, moneyLevelsResponse.group) &&
        Objects.equals(this.managers, moneyLevelsResponse.managers) &&
        Objects.equals(this.groups, moneyLevelsResponse.groups) &&
        Objects.equals(this.apiRequestsRemaining, moneyLevelsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, group, managers, groups, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyLevelsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

