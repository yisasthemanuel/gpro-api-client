package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.CalendarResponseEventsInnerWinner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CalendarResponseEventsInner
 */

@JsonTypeName("CalendarResponse_events_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class CalendarResponseEventsInner {

  private @Nullable CalendarResponseEventsInnerWinner winner;

  private @Nullable String eventType;

  private @Nullable String idx;

  private @Nullable String trackName;

  private @Nullable String trackNatCode;

  private @Nullable String dateEvent;

  private @Nullable String trackId;

  public CalendarResponseEventsInner winner(@Nullable CalendarResponseEventsInnerWinner winner) {
    this.winner = winner;
    return this;
  }

  /**
   * Get winner
   * @return winner
   */
  @Valid 
  @JsonProperty("winner")
  public @Nullable CalendarResponseEventsInnerWinner getWinner() {
    return winner;
  }

  public void setWinner(@Nullable CalendarResponseEventsInnerWinner winner) {
    this.winner = winner;
  }

  public CalendarResponseEventsInner eventType(@Nullable String eventType) {
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

  public CalendarResponseEventsInner idx(@Nullable String idx) {
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

  public CalendarResponseEventsInner trackName(@Nullable String trackName) {
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

  public CalendarResponseEventsInner trackNatCode(@Nullable String trackNatCode) {
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

  public CalendarResponseEventsInner dateEvent(@Nullable String dateEvent) {
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

  public CalendarResponseEventsInner trackId(@Nullable String trackId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarResponseEventsInner calendarResponseEventsInner = (CalendarResponseEventsInner) o;
    return Objects.equals(this.winner, calendarResponseEventsInner.winner) &&
        Objects.equals(this.eventType, calendarResponseEventsInner.eventType) &&
        Objects.equals(this.idx, calendarResponseEventsInner.idx) &&
        Objects.equals(this.trackName, calendarResponseEventsInner.trackName) &&
        Objects.equals(this.trackNatCode, calendarResponseEventsInner.trackNatCode) &&
        Objects.equals(this.dateEvent, calendarResponseEventsInner.dateEvent) &&
        Objects.equals(this.trackId, calendarResponseEventsInner.trackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winner, eventType, idx, trackName, trackNatCode, dateEvent, trackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarResponseEventsInner {\n");
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackNatCode: ").append(toIndentedString(trackNatCode)).append("\n");
    sb.append("    dateEvent: ").append(toIndentedString(dateEvent)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
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

