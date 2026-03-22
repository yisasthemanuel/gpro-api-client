package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CalendarResponseNextSeasonEventsInner
 */

@JsonTypeName("CalendarResponse_nextSeasonEvents_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class CalendarResponseNextSeasonEventsInner {

  private @Nullable String eventType;

  private @Nullable String idx;

  private @Nullable String trackName;

  private @Nullable String trackNatCode;

  private @Nullable String dateEvent;

  private @Nullable String trackId;

  private @Nullable Integer isCurrentRace;

  private @Nullable Integer isFavTrack;

  public CalendarResponseNextSeasonEventsInner eventType(@Nullable String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   */
  
  @JsonProperty("eventType")
  public @Nullable String getEventType() {
    return eventType;
  }

  public void setEventType(@Nullable String eventType) {
    this.eventType = eventType;
  }

  public CalendarResponseNextSeasonEventsInner idx(@Nullable String idx) {
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  
  @JsonProperty("idx")
  public @Nullable String getIdx() {
    return idx;
  }

  public void setIdx(@Nullable String idx) {
    this.idx = idx;
  }

  public CalendarResponseNextSeasonEventsInner trackName(@Nullable String trackName) {
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

  public CalendarResponseNextSeasonEventsInner trackNatCode(@Nullable String trackNatCode) {
    this.trackNatCode = trackNatCode;
    return this;
  }

  /**
   * Get trackNatCode
   * @return trackNatCode
   */
  
  @JsonProperty("trackNatCode")
  public @Nullable String getTrackNatCode() {
    return trackNatCode;
  }

  public void setTrackNatCode(@Nullable String trackNatCode) {
    this.trackNatCode = trackNatCode;
  }

  public CalendarResponseNextSeasonEventsInner dateEvent(@Nullable String dateEvent) {
    this.dateEvent = dateEvent;
    return this;
  }

  /**
   * Get dateEvent
   * @return dateEvent
   */
  
  @JsonProperty("dateEvent")
  public @Nullable String getDateEvent() {
    return dateEvent;
  }

  public void setDateEvent(@Nullable String dateEvent) {
    this.dateEvent = dateEvent;
  }

  public CalendarResponseNextSeasonEventsInner trackId(@Nullable String trackId) {
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

  public CalendarResponseNextSeasonEventsInner isCurrentRace(@Nullable Integer isCurrentRace) {
    this.isCurrentRace = isCurrentRace;
    return this;
  }

  /**
   * Get isCurrentRace
   * @return isCurrentRace
   */
  
  @JsonProperty("isCurrentRace")
  public @Nullable Integer getIsCurrentRace() {
    return isCurrentRace;
  }

  public void setIsCurrentRace(@Nullable Integer isCurrentRace) {
    this.isCurrentRace = isCurrentRace;
  }

  public CalendarResponseNextSeasonEventsInner isFavTrack(@Nullable Integer isFavTrack) {
    this.isFavTrack = isFavTrack;
    return this;
  }

  /**
   * Get isFavTrack
   * @return isFavTrack
   */
  
  @JsonProperty("isFavTrack")
  public @Nullable Integer getIsFavTrack() {
    return isFavTrack;
  }

  public void setIsFavTrack(@Nullable Integer isFavTrack) {
    this.isFavTrack = isFavTrack;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarResponseNextSeasonEventsInner calendarResponseNextSeasonEventsInner = (CalendarResponseNextSeasonEventsInner) o;
    return Objects.equals(this.eventType, calendarResponseNextSeasonEventsInner.eventType) &&
        Objects.equals(this.idx, calendarResponseNextSeasonEventsInner.idx) &&
        Objects.equals(this.trackName, calendarResponseNextSeasonEventsInner.trackName) &&
        Objects.equals(this.trackNatCode, calendarResponseNextSeasonEventsInner.trackNatCode) &&
        Objects.equals(this.dateEvent, calendarResponseNextSeasonEventsInner.dateEvent) &&
        Objects.equals(this.trackId, calendarResponseNextSeasonEventsInner.trackId) &&
        Objects.equals(this.isCurrentRace, calendarResponseNextSeasonEventsInner.isCurrentRace) &&
        Objects.equals(this.isFavTrack, calendarResponseNextSeasonEventsInner.isFavTrack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, idx, trackName, trackNatCode, dateEvent, trackId, isCurrentRace, isFavTrack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarResponseNextSeasonEventsInner {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackNatCode: ").append(toIndentedString(trackNatCode)).append("\n");
    sb.append("    dateEvent: ").append(toIndentedString(dateEvent)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    isCurrentRace: ").append(toIndentedString(isCurrentRace)).append("\n");
    sb.append("    isFavTrack: ").append(toIndentedString(isFavTrack)).append("\n");
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

