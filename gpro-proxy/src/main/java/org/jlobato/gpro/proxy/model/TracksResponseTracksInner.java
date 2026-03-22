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
 * TracksResponseTracksInner
 */

@JsonTypeName("TracksResponse_tracks_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TracksResponseTracksInner {

  private @Nullable Integer id;

  private @Nullable String name;

  private @Nullable String natCode;

  private @Nullable String kms;

  private @Nullable Integer laps;

  private @Nullable String lapDistance;

  private @Nullable Integer power;

  private @Nullable Integer handl;

  private @Nullable Integer accel;

  private @Nullable String category;

  private @Nullable Integer gpsHeld;

  public TracksResponseTracksInner id(@Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("id")
  public @Nullable Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  public TracksResponseTracksInner name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TracksResponseTracksInner natCode(@Nullable String natCode) {
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

  public TracksResponseTracksInner kms(@Nullable String kms) {
    this.kms = kms;
    return this;
  }

  /**
   * Get kms
   * @return kms
   */
  
  @JsonProperty("kms")
  public @Nullable String getKms() {
    return kms;
  }

  public void setKms(@Nullable String kms) {
    this.kms = kms;
  }

  public TracksResponseTracksInner laps(@Nullable Integer laps) {
    this.laps = laps;
    return this;
  }

  /**
   * Get laps
   * @return laps
   */
  
  @JsonProperty("laps")
  public @Nullable Integer getLaps() {
    return laps;
  }

  public void setLaps(@Nullable Integer laps) {
    this.laps = laps;
  }

  public TracksResponseTracksInner lapDistance(@Nullable String lapDistance) {
    this.lapDistance = lapDistance;
    return this;
  }

  /**
   * Get lapDistance
   * @return lapDistance
   */
  
  @JsonProperty("lapDistance")
  public @Nullable String getLapDistance() {
    return lapDistance;
  }

  public void setLapDistance(@Nullable String lapDistance) {
    this.lapDistance = lapDistance;
  }

  public TracksResponseTracksInner power(@Nullable Integer power) {
    this.power = power;
    return this;
  }

  /**
   * Get power
   * @return power
   */
  
  @JsonProperty("power")
  public @Nullable Integer getPower() {
    return power;
  }

  public void setPower(@Nullable Integer power) {
    this.power = power;
  }

  public TracksResponseTracksInner handl(@Nullable Integer handl) {
    this.handl = handl;
    return this;
  }

  /**
   * Get handl
   * @return handl
   */
  
  @JsonProperty("handl")
  public @Nullable Integer getHandl() {
    return handl;
  }

  public void setHandl(@Nullable Integer handl) {
    this.handl = handl;
  }

  public TracksResponseTracksInner accel(@Nullable Integer accel) {
    this.accel = accel;
    return this;
  }

  /**
   * Get accel
   * @return accel
   */
  
  @JsonProperty("accel")
  public @Nullable Integer getAccel() {
    return accel;
  }

  public void setAccel(@Nullable Integer accel) {
    this.accel = accel;
  }

  public TracksResponseTracksInner category(@Nullable String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  
  @JsonProperty("category")
  public @Nullable String getCategory() {
    return category;
  }

  public void setCategory(@Nullable String category) {
    this.category = category;
  }

  public TracksResponseTracksInner gpsHeld(@Nullable Integer gpsHeld) {
    this.gpsHeld = gpsHeld;
    return this;
  }

  /**
   * Get gpsHeld
   * @return gpsHeld
   */
  
  @JsonProperty("gpsHeld")
  public @Nullable Integer getGpsHeld() {
    return gpsHeld;
  }

  public void setGpsHeld(@Nullable Integer gpsHeld) {
    this.gpsHeld = gpsHeld;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TracksResponseTracksInner tracksResponseTracksInner = (TracksResponseTracksInner) o;
    return Objects.equals(this.id, tracksResponseTracksInner.id) &&
        Objects.equals(this.name, tracksResponseTracksInner.name) &&
        Objects.equals(this.natCode, tracksResponseTracksInner.natCode) &&
        Objects.equals(this.kms, tracksResponseTracksInner.kms) &&
        Objects.equals(this.laps, tracksResponseTracksInner.laps) &&
        Objects.equals(this.lapDistance, tracksResponseTracksInner.lapDistance) &&
        Objects.equals(this.power, tracksResponseTracksInner.power) &&
        Objects.equals(this.handl, tracksResponseTracksInner.handl) &&
        Objects.equals(this.accel, tracksResponseTracksInner.accel) &&
        Objects.equals(this.category, tracksResponseTracksInner.category) &&
        Objects.equals(this.gpsHeld, tracksResponseTracksInner.gpsHeld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, natCode, kms, laps, lapDistance, power, handl, accel, category, gpsHeld);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TracksResponseTracksInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
    sb.append("    laps: ").append(toIndentedString(laps)).append("\n");
    sb.append("    lapDistance: ").append(toIndentedString(lapDistance)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    handl: ").append(toIndentedString(handl)).append("\n");
    sb.append("    accel: ").append(toIndentedString(accel)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    gpsHeld: ").append(toIndentedString(gpsHeld)).append("\n");
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

