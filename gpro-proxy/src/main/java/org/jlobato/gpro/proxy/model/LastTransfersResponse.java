package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.LastTransfersResponseDriverTransfersInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LastTransfersResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class LastTransfersResponse {

  private @Nullable String loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String group;

  private @Nullable String noDecisionsYet;

  private @Nullable String prevDecisionDT;

  @Valid
  private List<@Valid LastTransfersResponseDriverTransfersInner> driverTransfers = new ArrayList<>();

  @Valid
  private List<@Valid LastTransfersResponseDriverTransfersInner> tdTransfers = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public LastTransfersResponse loadingDataState(@Nullable String loadingDataState) {
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

  public LastTransfersResponse segmentSelected(@Nullable String segmentSelected) {
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

  public LastTransfersResponse group(@Nullable String group) {
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

  public LastTransfersResponse noDecisionsYet(@Nullable String noDecisionsYet) {
    this.noDecisionsYet = noDecisionsYet;
    return this;
  }

  /**
   * Get noDecisionsYet
   * @return noDecisionsYet
   */
  
  @JsonProperty("noDecisionsYet")
  public @Nullable String getNoDecisionsYet() {
    return noDecisionsYet;
  }

  public void setNoDecisionsYet(@Nullable String noDecisionsYet) {
    this.noDecisionsYet = noDecisionsYet;
  }

  public LastTransfersResponse prevDecisionDT(@Nullable String prevDecisionDT) {
    this.prevDecisionDT = prevDecisionDT;
    return this;
  }

  /**
   * Get prevDecisionDT
   * @return prevDecisionDT
   */
  
  @JsonProperty("prevDecisionDT")
  public @Nullable String getPrevDecisionDT() {
    return prevDecisionDT;
  }

  public void setPrevDecisionDT(@Nullable String prevDecisionDT) {
    this.prevDecisionDT = prevDecisionDT;
  }

  public LastTransfersResponse driverTransfers(List<@Valid LastTransfersResponseDriverTransfersInner> driverTransfers) {
    this.driverTransfers = driverTransfers;
    return this;
  }

  public LastTransfersResponse addDriverTransfersItem(LastTransfersResponseDriverTransfersInner driverTransfersItem) {
    if (this.driverTransfers == null) {
      this.driverTransfers = new ArrayList<>();
    }
    this.driverTransfers.add(driverTransfersItem);
    return this;
  }

  /**
   * Get driverTransfers
   * @return driverTransfers
   */
  @Valid 
  @JsonProperty("driverTransfers")
  public List<@Valid LastTransfersResponseDriverTransfersInner> getDriverTransfers() {
    return driverTransfers;
  }

  public void setDriverTransfers(List<@Valid LastTransfersResponseDriverTransfersInner> driverTransfers) {
    this.driverTransfers = driverTransfers;
  }

  public LastTransfersResponse tdTransfers(List<@Valid LastTransfersResponseDriverTransfersInner> tdTransfers) {
    this.tdTransfers = tdTransfers;
    return this;
  }

  public LastTransfersResponse addTdTransfersItem(LastTransfersResponseDriverTransfersInner tdTransfersItem) {
    if (this.tdTransfers == null) {
      this.tdTransfers = new ArrayList<>();
    }
    this.tdTransfers.add(tdTransfersItem);
    return this;
  }

  /**
   * Get tdTransfers
   * @return tdTransfers
   */
  @Valid 
  @JsonProperty("tdTransfers")
  public List<@Valid LastTransfersResponseDriverTransfersInner> getTdTransfers() {
    return tdTransfers;
  }

  public void setTdTransfers(List<@Valid LastTransfersResponseDriverTransfersInner> tdTransfers) {
    this.tdTransfers = tdTransfers;
  }

  public LastTransfersResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public LastTransfersResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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

  public LastTransfersResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    LastTransfersResponse lastTransfersResponse = (LastTransfersResponse) o;
    return Objects.equals(this.loadingDataState, lastTransfersResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, lastTransfersResponse.segmentSelected) &&
        Objects.equals(this.group, lastTransfersResponse.group) &&
        Objects.equals(this.noDecisionsYet, lastTransfersResponse.noDecisionsYet) &&
        Objects.equals(this.prevDecisionDT, lastTransfersResponse.prevDecisionDT) &&
        Objects.equals(this.driverTransfers, lastTransfersResponse.driverTransfers) &&
        Objects.equals(this.tdTransfers, lastTransfersResponse.tdTransfers) &&
        Objects.equals(this.groups, lastTransfersResponse.groups) &&
        Objects.equals(this.apiRequestsRemaining, lastTransfersResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, group, noDecisionsYet, prevDecisionDT, driverTransfers, tdTransfers, groups, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastTransfersResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    noDecisionsYet: ").append(toIndentedString(noDecisionsYet)).append("\n");
    sb.append("    prevDecisionDT: ").append(toIndentedString(prevDecisionDT)).append("\n");
    sb.append("    driverTransfers: ").append(toIndentedString(driverTransfers)).append("\n");
    sb.append("    tdTransfers: ").append(toIndentedString(tdTransfers)).append("\n");
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

