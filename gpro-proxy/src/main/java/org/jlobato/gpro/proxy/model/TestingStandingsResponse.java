package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.GroupsArrayInner;
import org.jlobato.gpro.proxy.model.TestingStandingsResponseManagersInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TestingStandingsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TestingStandingsResponse {

  private @Nullable String loadingDataState;

  private @Nullable String group;

  private @Nullable Integer curPage;

  private @Nullable Integer totPages;

  @Valid
  private List<@Valid TestingStandingsResponseManagersInner> managers = new ArrayList<>();

  @Valid
  private List<@Valid GroupsArrayInner> groups = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public TestingStandingsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public TestingStandingsResponse group(@Nullable String group) {
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

  public TestingStandingsResponse curPage(@Nullable Integer curPage) {
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

  public TestingStandingsResponse totPages(@Nullable Integer totPages) {
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

  public TestingStandingsResponse managers(List<@Valid TestingStandingsResponseManagersInner> managers) {
    this.managers = managers;
    return this;
  }

  public TestingStandingsResponse addManagersItem(TestingStandingsResponseManagersInner managersItem) {
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
  public List<@Valid TestingStandingsResponseManagersInner> getManagers() {
    return managers;
  }

  public void setManagers(List<@Valid TestingStandingsResponseManagersInner> managers) {
    this.managers = managers;
  }

  public TestingStandingsResponse groups(List<@Valid GroupsArrayInner> groups) {
    this.groups = groups;
    return this;
  }

  public TestingStandingsResponse addGroupsItem(GroupsArrayInner groupsItem) {
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

  public TestingStandingsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    TestingStandingsResponse testingStandingsResponse = (TestingStandingsResponse) o;
    return Objects.equals(this.loadingDataState, testingStandingsResponse.loadingDataState) &&
        Objects.equals(this.group, testingStandingsResponse.group) &&
        Objects.equals(this.curPage, testingStandingsResponse.curPage) &&
        Objects.equals(this.totPages, testingStandingsResponse.totPages) &&
        Objects.equals(this.managers, testingStandingsResponse.managers) &&
        Objects.equals(this.groups, testingStandingsResponse.groups) &&
        Objects.equals(this.apiRequestsRemaining, testingStandingsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, group, curPage, totPages, managers, groups, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestingStandingsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
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

