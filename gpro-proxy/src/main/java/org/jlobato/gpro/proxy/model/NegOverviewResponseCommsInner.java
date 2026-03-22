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
 * NegOverviewResponseCommsInner
 */

@JsonTypeName("NegOverviewResponse_comms_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NegOverviewResponseCommsInner {

  private @Nullable String msg;

  private @Nullable String dt;

  private @Nullable Integer season;

  private @Nullable Integer race;

  public NegOverviewResponseCommsInner msg(@Nullable String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
   */
  
  @JsonProperty("msg")
  public @Nullable String getMsg() {
    return msg;
  }

  public void setMsg(@Nullable String msg) {
    this.msg = msg;
  }

  public NegOverviewResponseCommsInner dt(@Nullable String dt) {
    this.dt = dt;
    return this;
  }

  /**
   * Get dt
   * @return dt
   */
  
  @JsonProperty("dt")
  public @Nullable String getDt() {
    return dt;
  }

  public void setDt(@Nullable String dt) {
    this.dt = dt;
  }

  public NegOverviewResponseCommsInner season(@Nullable Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
   */
  
  @JsonProperty("season")
  public @Nullable Integer getSeason() {
    return season;
  }

  public void setSeason(@Nullable Integer season) {
    this.season = season;
  }

  public NegOverviewResponseCommsInner race(@Nullable Integer race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
   */
  
  @JsonProperty("race")
  public @Nullable Integer getRace() {
    return race;
  }

  public void setRace(@Nullable Integer race) {
    this.race = race;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegOverviewResponseCommsInner negOverviewResponseCommsInner = (NegOverviewResponseCommsInner) o;
    return Objects.equals(this.msg, negOverviewResponseCommsInner.msg) &&
        Objects.equals(this.dt, negOverviewResponseCommsInner.dt) &&
        Objects.equals(this.season, negOverviewResponseCommsInner.season) &&
        Objects.equals(this.race, negOverviewResponseCommsInner.race);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, dt, season, race);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegOverviewResponseCommsInner {\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    dt: ").append(toIndentedString(dt)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
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

