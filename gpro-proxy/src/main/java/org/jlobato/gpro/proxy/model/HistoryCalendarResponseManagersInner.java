package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.HistoryCalendarResponseManagersInnerWinner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoryCalendarResponseManagersInner
 */

@JsonTypeName("HistoryCalendarResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryCalendarResponseManagersInner {

  private @Nullable HistoryCalendarResponseManagersInnerWinner winner;

  private @Nullable String eventType;

  private @Nullable String pos;

  private @Nullable String trackName;

  private @Nullable String natCode;

  private @Nullable Integer isTestTrack;

  private @Nullable String dateEvent;

  private @Nullable String trackId;

  public HistoryCalendarResponseManagersInner winner(@Nullable HistoryCalendarResponseManagersInnerWinner winner) {
    this.winner = winner;
    return this;
  }

  /**
   * Get winner
   * @return winner
   */
  @Valid 
  @JsonProperty("winner")
  public @Nullable HistoryCalendarResponseManagersInnerWinner getWinner() {
    return winner;
  }

  public void setWinner(@Nullable HistoryCalendarResponseManagersInnerWinner winner) {
    this.winner = winner;
  }

  public HistoryCalendarResponseManagersInner eventType(@Nullable String eventType) {
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

  public HistoryCalendarResponseManagersInner pos(@Nullable String pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
   */
  
  @JsonProperty("pos")
  public @Nullable String getPos() {
    return pos;
  }

  public void setPos(@Nullable String pos) {
    this.pos = pos;
  }

  public HistoryCalendarResponseManagersInner trackName(@Nullable String trackName) {
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

  public HistoryCalendarResponseManagersInner natCode(@Nullable String natCode) {
    this.natCode = natCode;
    return this;
  }

  /**
   * Get natCode
   * @return natCode
   */
  
  @JsonProperty("natCode")
  public @Nullable String getNatCode() {
    return natCode;
  }

  public void setNatCode(@Nullable String natCode) {
    this.natCode = natCode;
  }

  public HistoryCalendarResponseManagersInner isTestTrack(@Nullable Integer isTestTrack) {
    this.isTestTrack = isTestTrack;
    return this;
  }

  /**
   * Get isTestTrack
   * @return isTestTrack
   */
  
  @JsonProperty("isTestTrack")
  public @Nullable Integer getIsTestTrack() {
    return isTestTrack;
  }

  public void setIsTestTrack(@Nullable Integer isTestTrack) {
    this.isTestTrack = isTestTrack;
  }

  public HistoryCalendarResponseManagersInner dateEvent(@Nullable String dateEvent) {
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

  public HistoryCalendarResponseManagersInner trackId(@Nullable String trackId) {
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
    HistoryCalendarResponseManagersInner historyCalendarResponseManagersInner = (HistoryCalendarResponseManagersInner) o;
    return Objects.equals(this.winner, historyCalendarResponseManagersInner.winner) &&
        Objects.equals(this.eventType, historyCalendarResponseManagersInner.eventType) &&
        Objects.equals(this.pos, historyCalendarResponseManagersInner.pos) &&
        Objects.equals(this.trackName, historyCalendarResponseManagersInner.trackName) &&
        Objects.equals(this.natCode, historyCalendarResponseManagersInner.natCode) &&
        Objects.equals(this.isTestTrack, historyCalendarResponseManagersInner.isTestTrack) &&
        Objects.equals(this.dateEvent, historyCalendarResponseManagersInner.dateEvent) &&
        Objects.equals(this.trackId, historyCalendarResponseManagersInner.trackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winner, eventType, pos, trackName, natCode, isTestTrack, dateEvent, trackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryCalendarResponseManagersInner {\n");
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    isTestTrack: ").append(toIndentedString(isTestTrack)).append("\n");
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

