package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.GroupsArrayInner;
import org.jlobato.gpro.proxy.model.StartingGridResponseManagersSGInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StartingGridResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StartingGridResponse implements GetQualyStandings200Response {

  private @Nullable String loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String group;

  private @Nullable Integer curPage;

  private @Nullable Integer totPages;

  @Valid
  private List<@Valid StartingGridResponseManagersSGInner> managersSG = new ArrayList<>();

  @Valid
  private List<@Valid GroupsArrayInner> groups = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public StartingGridResponse loadingDataState(@Nullable String loadingDataState) {
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

  public StartingGridResponse segmentSelected(@Nullable String segmentSelected) {
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

  public StartingGridResponse group(@Nullable String group) {
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

  public StartingGridResponse curPage(@Nullable Integer curPage) {
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

  public StartingGridResponse totPages(@Nullable Integer totPages) {
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

  public StartingGridResponse managersSG(List<@Valid StartingGridResponseManagersSGInner> managersSG) {
    this.managersSG = managersSG;
    return this;
  }

  public StartingGridResponse addManagersSGItem(StartingGridResponseManagersSGInner managersSGItem) {
    if (this.managersSG == null) {
      this.managersSG = new ArrayList<>();
    }
    this.managersSG.add(managersSGItem);
    return this;
  }

  /**
   * Get managersSG
   * @return managersSG
   */
  @Valid 
  @JsonProperty("managersSG")
  public List<@Valid StartingGridResponseManagersSGInner> getManagersSG() {
    return managersSG;
  }

  public void setManagersSG(List<@Valid StartingGridResponseManagersSGInner> managersSG) {
    this.managersSG = managersSG;
  }

  public StartingGridResponse groups(List<@Valid GroupsArrayInner> groups) {
    this.groups = groups;
    return this;
  }

  public StartingGridResponse addGroupsItem(GroupsArrayInner groupsItem) {
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

  public StartingGridResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    StartingGridResponse startingGridResponse = (StartingGridResponse) o;
    return Objects.equals(this.loadingDataState, startingGridResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, startingGridResponse.segmentSelected) &&
        Objects.equals(this.group, startingGridResponse.group) &&
        Objects.equals(this.curPage, startingGridResponse.curPage) &&
        Objects.equals(this.totPages, startingGridResponse.totPages) &&
        Objects.equals(this.managersSG, startingGridResponse.managersSG) &&
        Objects.equals(this.groups, startingGridResponse.groups) &&
        Objects.equals(this.apiRequestsRemaining, startingGridResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, group, curPage, totPages, managersSG, groups, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartingGridResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
    sb.append("    totPages: ").append(toIndentedString(totPages)).append("\n");
    sb.append("    managersSG: ").append(toIndentedString(managersSG)).append("\n");
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

