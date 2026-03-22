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
 * RaceSetupResponseShowWeatherPopover
 */

@JsonTypeName("RaceSetupResponse_showWeatherPopover")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceSetupResponseShowWeatherPopover {

  private @Nullable Boolean open;

  private @Nullable Object event = null;

  public RaceSetupResponseShowWeatherPopover open(@Nullable Boolean open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
   */
  
  @JsonProperty("open")
  public @Nullable Boolean getOpen() {
    return open;
  }

  public void setOpen(@Nullable Boolean open) {
    this.open = open;
  }

  public RaceSetupResponseShowWeatherPopover event(@Nullable Object event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  
  @JsonProperty("event")
  public @Nullable Object getEvent() {
    return event;
  }

  public void setEvent(@Nullable Object event) {
    this.event = event;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceSetupResponseShowWeatherPopover raceSetupResponseShowWeatherPopover = (RaceSetupResponseShowWeatherPopover) o;
    return Objects.equals(this.open, raceSetupResponseShowWeatherPopover.open) &&
        Objects.equals(this.event, raceSetupResponseShowWeatherPopover.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(open, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceSetupResponseShowWeatherPopover {\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

