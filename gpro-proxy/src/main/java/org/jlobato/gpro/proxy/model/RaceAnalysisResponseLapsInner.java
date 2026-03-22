package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseLapsInnerEventsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RaceAnalysisResponseLapsInner
 */

@JsonTypeName("RaceAnalysisResponse_laps_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseLapsInner {

  private @Nullable Integer idx;

  private @Nullable String lapTime;

  private @Nullable String lapColor;

  private @Nullable Integer boostLap;

  private @Nullable Integer pos;

  private @Nullable String tyres;

  private @Nullable String tyreColor;

  private @Nullable String weather;

  private @Nullable Integer temp;

  private @Nullable Integer hum;

  @Valid
  private List<@Valid RaceAnalysisResponseLapsInnerEventsInner> events = new ArrayList<>();

  private @Nullable Integer eventsCount;

  public RaceAnalysisResponseLapsInner idx(@Nullable Integer idx) {
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  
  @JsonProperty("idx")
  public @Nullable Integer getIdx() {
    return idx;
  }

  public void setIdx(@Nullable Integer idx) {
    this.idx = idx;
  }

  public RaceAnalysisResponseLapsInner lapTime(@Nullable String lapTime) {
    this.lapTime = lapTime;
    return this;
  }

  /**
   * Get lapTime
   * @return lapTime
   */
  
  @JsonProperty("lapTime")
  public @Nullable String getLapTime() {
    return lapTime;
  }

  public void setLapTime(@Nullable String lapTime) {
    this.lapTime = lapTime;
  }

  public RaceAnalysisResponseLapsInner lapColor(@Nullable String lapColor) {
    this.lapColor = lapColor;
    return this;
  }

  /**
   * Get lapColor
   * @return lapColor
   */
  
  @JsonProperty("lapColor")
  public @Nullable String getLapColor() {
    return lapColor;
  }

  public void setLapColor(@Nullable String lapColor) {
    this.lapColor = lapColor;
  }

  public RaceAnalysisResponseLapsInner boostLap(@Nullable Integer boostLap) {
    this.boostLap = boostLap;
    return this;
  }

  /**
   * Get boostLap
   * @return boostLap
   */
  
  @JsonProperty("boostLap")
  public @Nullable Integer getBoostLap() {
    return boostLap;
  }

  public void setBoostLap(@Nullable Integer boostLap) {
    this.boostLap = boostLap;
  }

  public RaceAnalysisResponseLapsInner pos(@Nullable Integer pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
   */
  
  @JsonProperty("pos")
  public @Nullable Integer getPos() {
    return pos;
  }

  public void setPos(@Nullable Integer pos) {
    this.pos = pos;
  }

  public RaceAnalysisResponseLapsInner tyres(@Nullable String tyres) {
    this.tyres = tyres;
    return this;
  }

  /**
   * Get tyres
   * @return tyres
   */
  
  @JsonProperty("tyres")
  public @Nullable String getTyres() {
    return tyres;
  }

  public void setTyres(@Nullable String tyres) {
    this.tyres = tyres;
  }

  public RaceAnalysisResponseLapsInner tyreColor(@Nullable String tyreColor) {
    this.tyreColor = tyreColor;
    return this;
  }

  /**
   * Get tyreColor
   * @return tyreColor
   */
  
  @JsonProperty("tyreColor")
  public @Nullable String getTyreColor() {
    return tyreColor;
  }

  public void setTyreColor(@Nullable String tyreColor) {
    this.tyreColor = tyreColor;
  }

  public RaceAnalysisResponseLapsInner weather(@Nullable String weather) {
    this.weather = weather;
    return this;
  }

  /**
   * Get weather
   * @return weather
   */
  
  @JsonProperty("weather")
  public @Nullable String getWeather() {
    return weather;
  }

  public void setWeather(@Nullable String weather) {
    this.weather = weather;
  }

  public RaceAnalysisResponseLapsInner temp(@Nullable Integer temp) {
    this.temp = temp;
    return this;
  }

  /**
   * Get temp
   * @return temp
   */
  
  @JsonProperty("temp")
  public @Nullable Integer getTemp() {
    return temp;
  }

  public void setTemp(@Nullable Integer temp) {
    this.temp = temp;
  }

  public RaceAnalysisResponseLapsInner hum(@Nullable Integer hum) {
    this.hum = hum;
    return this;
  }

  /**
   * Get hum
   * @return hum
   */
  
  @JsonProperty("hum")
  public @Nullable Integer getHum() {
    return hum;
  }

  public void setHum(@Nullable Integer hum) {
    this.hum = hum;
  }

  public RaceAnalysisResponseLapsInner events(List<@Valid RaceAnalysisResponseLapsInnerEventsInner> events) {
    this.events = events;
    return this;
  }

  public RaceAnalysisResponseLapsInner addEventsItem(RaceAnalysisResponseLapsInnerEventsInner eventsItem) {
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
  public List<@Valid RaceAnalysisResponseLapsInnerEventsInner> getEvents() {
    return events;
  }

  public void setEvents(List<@Valid RaceAnalysisResponseLapsInnerEventsInner> events) {
    this.events = events;
  }

  public RaceAnalysisResponseLapsInner eventsCount(@Nullable Integer eventsCount) {
    this.eventsCount = eventsCount;
    return this;
  }

  /**
   * Get eventsCount
   * @return eventsCount
   */
  
  @JsonProperty("eventsCount")
  public @Nullable Integer getEventsCount() {
    return eventsCount;
  }

  public void setEventsCount(@Nullable Integer eventsCount) {
    this.eventsCount = eventsCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseLapsInner raceAnalysisResponseLapsInner = (RaceAnalysisResponseLapsInner) o;
    return Objects.equals(this.idx, raceAnalysisResponseLapsInner.idx) &&
        Objects.equals(this.lapTime, raceAnalysisResponseLapsInner.lapTime) &&
        Objects.equals(this.lapColor, raceAnalysisResponseLapsInner.lapColor) &&
        Objects.equals(this.boostLap, raceAnalysisResponseLapsInner.boostLap) &&
        Objects.equals(this.pos, raceAnalysisResponseLapsInner.pos) &&
        Objects.equals(this.tyres, raceAnalysisResponseLapsInner.tyres) &&
        Objects.equals(this.tyreColor, raceAnalysisResponseLapsInner.tyreColor) &&
        Objects.equals(this.weather, raceAnalysisResponseLapsInner.weather) &&
        Objects.equals(this.temp, raceAnalysisResponseLapsInner.temp) &&
        Objects.equals(this.hum, raceAnalysisResponseLapsInner.hum) &&
        Objects.equals(this.events, raceAnalysisResponseLapsInner.events) &&
        Objects.equals(this.eventsCount, raceAnalysisResponseLapsInner.eventsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, lapTime, lapColor, boostLap, pos, tyres, tyreColor, weather, temp, hum, events, eventsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseLapsInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    lapTime: ").append(toIndentedString(lapTime)).append("\n");
    sb.append("    lapColor: ").append(toIndentedString(lapColor)).append("\n");
    sb.append("    boostLap: ").append(toIndentedString(boostLap)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    tyres: ").append(toIndentedString(tyres)).append("\n");
    sb.append("    tyreColor: ").append(toIndentedString(tyreColor)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    hum: ").append(toIndentedString(hum)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
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

