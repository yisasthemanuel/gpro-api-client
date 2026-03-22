package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseEventsInner;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.CalendarResponseNextSeasonEventsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CalendarResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class CalendarResponse {

  private @Nullable String loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String group;

  private @Nullable String nextCalendar;

  private @Nullable Integer showStaffDays;

  private @Nullable String testTrackName;

  private @Nullable String testTrackNatCode;

  private @Nullable String testTrackId;

  @Valid
  private List<@Valid CalendarResponseEventsInner> events = new ArrayList<>();

  @Valid
  private List<@Valid CalendarResponseGroupsInner> groups = new ArrayList<>();

  private @Nullable Integer nextSeasonPublished;

  private @Nullable String debug1;

  private @Nullable String debug2;

  @Valid
  private List<@Valid CalendarResponseNextSeasonEventsInner> nextSeasonEvents = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public CalendarResponse loadingDataState(@Nullable String loadingDataState) {
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

  public CalendarResponse segmentSelected(@Nullable String segmentSelected) {
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

  public CalendarResponse group(@Nullable String group) {
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

  public CalendarResponse nextCalendar(@Nullable String nextCalendar) {
    this.nextCalendar = nextCalendar;
    return this;
  }

  /**
   * Get nextCalendar
   * @return nextCalendar
   */
  
  @JsonProperty("nextCalendar")
  public @Nullable String getNextCalendar() {
    return nextCalendar;
  }

  public void setNextCalendar(@Nullable String nextCalendar) {
    this.nextCalendar = nextCalendar;
  }

  public CalendarResponse showStaffDays(@Nullable Integer showStaffDays) {
    this.showStaffDays = showStaffDays;
    return this;
  }

  /**
   * Get showStaffDays
   * @return showStaffDays
   */
  
  @JsonProperty("showStaffDays")
  public @Nullable Integer getShowStaffDays() {
    return showStaffDays;
  }

  public void setShowStaffDays(@Nullable Integer showStaffDays) {
    this.showStaffDays = showStaffDays;
  }

  public CalendarResponse testTrackName(@Nullable String testTrackName) {
    this.testTrackName = testTrackName;
    return this;
  }

  /**
   * Get testTrackName
   * @return testTrackName
   */
  
  @JsonProperty("testTrackName")
  public @Nullable String getTestTrackName() {
    return testTrackName;
  }

  public void setTestTrackName(@Nullable String testTrackName) {
    this.testTrackName = testTrackName;
  }

  public CalendarResponse testTrackNatCode(@Nullable String testTrackNatCode) {
    this.testTrackNatCode = testTrackNatCode;
    return this;
  }

  /**
   * Get testTrackNatCode
   * @return testTrackNatCode
   */
  
  @JsonProperty("testTrackNatCode")
  public @Nullable String getTestTrackNatCode() {
    return testTrackNatCode;
  }

  public void setTestTrackNatCode(@Nullable String testTrackNatCode) {
    this.testTrackNatCode = testTrackNatCode;
  }

  public CalendarResponse testTrackId(@Nullable String testTrackId) {
    this.testTrackId = testTrackId;
    return this;
  }

  /**
   * Get testTrackId
   * @return testTrackId
   */
  
  @JsonProperty("testTrackId")
  public @Nullable String getTestTrackId() {
    return testTrackId;
  }

  public void setTestTrackId(@Nullable String testTrackId) {
    this.testTrackId = testTrackId;
  }

  public CalendarResponse events(List<@Valid CalendarResponseEventsInner> events) {
    this.events = events;
    return this;
  }

  public CalendarResponse addEventsItem(CalendarResponseEventsInner eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
   */
  @Valid 
  @JsonProperty("events")
  public List<@Valid CalendarResponseEventsInner> getEvents() {
    return events;
  }

  public void setEvents(List<@Valid CalendarResponseEventsInner> events) {
    this.events = events;
  }

  public CalendarResponse groups(List<@Valid CalendarResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public CalendarResponse addGroupsItem(CalendarResponseGroupsInner groupsItem) {
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

  public CalendarResponse nextSeasonPublished(@Nullable Integer nextSeasonPublished) {
    this.nextSeasonPublished = nextSeasonPublished;
    return this;
  }

  /**
   * Get nextSeasonPublished
   * @return nextSeasonPublished
   */
  
  @JsonProperty("nextSeasonPublished")
  public @Nullable Integer getNextSeasonPublished() {
    return nextSeasonPublished;
  }

  public void setNextSeasonPublished(@Nullable Integer nextSeasonPublished) {
    this.nextSeasonPublished = nextSeasonPublished;
  }

  public CalendarResponse debug1(@Nullable String debug1) {
    this.debug1 = debug1;
    return this;
  }

  /**
   * Get debug1
   * @return debug1
   */
  
  @JsonProperty("debug1")
  public @Nullable String getDebug1() {
    return debug1;
  }

  public void setDebug1(@Nullable String debug1) {
    this.debug1 = debug1;
  }

  public CalendarResponse debug2(@Nullable String debug2) {
    this.debug2 = debug2;
    return this;
  }

  /**
   * Get debug2
   * @return debug2
   */
  
  @JsonProperty("debug2")
  public @Nullable String getDebug2() {
    return debug2;
  }

  public void setDebug2(@Nullable String debug2) {
    this.debug2 = debug2;
  }

  public CalendarResponse nextSeasonEvents(List<@Valid CalendarResponseNextSeasonEventsInner> nextSeasonEvents) {
    this.nextSeasonEvents = nextSeasonEvents;
    return this;
  }

  public CalendarResponse addNextSeasonEventsItem(CalendarResponseNextSeasonEventsInner nextSeasonEventsItem) {
    if (this.nextSeasonEvents == null) {
      this.nextSeasonEvents = new ArrayList<>();
    }
    this.nextSeasonEvents.add(nextSeasonEventsItem);
    return this;
  }

  /**
   * Get nextSeasonEvents
   * @return nextSeasonEvents
   */
  @Valid 
  @JsonProperty("nextSeasonEvents")
  public List<@Valid CalendarResponseNextSeasonEventsInner> getNextSeasonEvents() {
    return nextSeasonEvents;
  }

  public void setNextSeasonEvents(List<@Valid CalendarResponseNextSeasonEventsInner> nextSeasonEvents) {
    this.nextSeasonEvents = nextSeasonEvents;
  }

  public CalendarResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    CalendarResponse calendarResponse = (CalendarResponse) o;
    return Objects.equals(this.loadingDataState, calendarResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, calendarResponse.segmentSelected) &&
        Objects.equals(this.group, calendarResponse.group) &&
        Objects.equals(this.nextCalendar, calendarResponse.nextCalendar) &&
        Objects.equals(this.showStaffDays, calendarResponse.showStaffDays) &&
        Objects.equals(this.testTrackName, calendarResponse.testTrackName) &&
        Objects.equals(this.testTrackNatCode, calendarResponse.testTrackNatCode) &&
        Objects.equals(this.testTrackId, calendarResponse.testTrackId) &&
        Objects.equals(this.events, calendarResponse.events) &&
        Objects.equals(this.groups, calendarResponse.groups) &&
        Objects.equals(this.nextSeasonPublished, calendarResponse.nextSeasonPublished) &&
        Objects.equals(this.debug1, calendarResponse.debug1) &&
        Objects.equals(this.debug2, calendarResponse.debug2) &&
        Objects.equals(this.nextSeasonEvents, calendarResponse.nextSeasonEvents) &&
        Objects.equals(this.apiRequestsRemaining, calendarResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, group, nextCalendar, showStaffDays, testTrackName, testTrackNatCode, testTrackId, events, groups, nextSeasonPublished, debug1, debug2, nextSeasonEvents, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    nextCalendar: ").append(toIndentedString(nextCalendar)).append("\n");
    sb.append("    showStaffDays: ").append(toIndentedString(showStaffDays)).append("\n");
    sb.append("    testTrackName: ").append(toIndentedString(testTrackName)).append("\n");
    sb.append("    testTrackNatCode: ").append(toIndentedString(testTrackNatCode)).append("\n");
    sb.append("    testTrackId: ").append(toIndentedString(testTrackId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    nextSeasonPublished: ").append(toIndentedString(nextSeasonPublished)).append("\n");
    sb.append("    debug1: ").append(toIndentedString(debug1)).append("\n");
    sb.append("    debug2: ").append(toIndentedString(debug2)).append("\n");
    sb.append("    nextSeasonEvents: ").append(toIndentedString(nextSeasonEvents)).append("\n");
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

