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
 * RaceAnalysisResponseLapsInnerEventsInner
 */

@JsonTypeName("RaceAnalysisResponse_laps_inner_events_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseLapsInnerEventsInner {

  private @Nullable String event;

  private @Nullable String eventColor;

  public RaceAnalysisResponseLapsInnerEventsInner event(@Nullable String event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  
  @JsonProperty("event")
  public @Nullable String getEvent() {
    return event;
  }

  public void setEvent(@Nullable String event) {
    this.event = event;
  }

  public RaceAnalysisResponseLapsInnerEventsInner eventColor(@Nullable String eventColor) {
    this.eventColor = eventColor;
    return this;
  }

  /**
   * Get eventColor
   * @return eventColor
   */
  
  @JsonProperty("eventColor")
  public @Nullable String getEventColor() {
    return eventColor;
  }

  public void setEventColor(@Nullable String eventColor) {
    this.eventColor = eventColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseLapsInnerEventsInner raceAnalysisResponseLapsInnerEventsInner = (RaceAnalysisResponseLapsInnerEventsInner) o;
    return Objects.equals(this.event, raceAnalysisResponseLapsInnerEventsInner.event) &&
        Objects.equals(this.eventColor, raceAnalysisResponseLapsInnerEventsInner.eventColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseLapsInnerEventsInner {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventColor: ").append(toIndentedString(eventColor)).append("\n");
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

