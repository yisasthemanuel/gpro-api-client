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
 * PracticeResponseWeather
 */

@JsonTypeName("PracticeResponse_weather")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class PracticeResponseWeather {

  private @Nullable String q1Weather;

  private @Nullable String q1WeatherTransl;

  private @Nullable Integer q1Temp;

  private @Nullable Integer q1Hum;

  private @Nullable String q2Weather;

  private @Nullable String q2WeatherTransl;

  private @Nullable Integer q2Temp;

  private @Nullable Integer q2Hum;

  private @Nullable Integer raceQ1TempLow;

  private @Nullable Integer raceQ1TempHigh;

  private @Nullable Integer raceQ1HumLow;

  private @Nullable Integer raceQ1HumHigh;

  private @Nullable Integer raceQ1RainPLow;

  private @Nullable Integer raceQ1RainPHigh;

  private @Nullable Integer raceQ2TempLow;

  private @Nullable Integer raceQ2TempHigh;

  private @Nullable Integer raceQ2HumLow;

  private @Nullable Integer raceQ2HumHigh;

  private @Nullable Integer raceQ2RainPLow;

  private @Nullable Integer raceQ2RainPHigh;

  private @Nullable Integer raceQ3TempLow;

  private @Nullable Integer raceQ3TempHigh;

  private @Nullable Integer raceQ3HumLow;

  private @Nullable Integer raceQ3HumHigh;

  private @Nullable Integer raceQ3RainPLow;

  private @Nullable Integer raceQ3RainPHigh;

  private @Nullable Integer raceQ4TempLow;

  private @Nullable Integer raceQ4TempHigh;

  private @Nullable Integer raceQ4HumLow;

  private @Nullable Integer raceQ4HumHigh;

  private @Nullable Integer raceQ4RainPLow;

  private @Nullable Integer raceQ4RainPHigh;

  public PracticeResponseWeather q1Weather(@Nullable String q1Weather) {
    this.q1Weather = q1Weather;
    return this;
  }

  /**
   * Get q1Weather
   * @return q1Weather
   */
  
  @JsonProperty("q1Weather")
  public @Nullable String getQ1Weather() {
    return q1Weather;
  }

  public void setQ1Weather(@Nullable String q1Weather) {
    this.q1Weather = q1Weather;
  }

  public PracticeResponseWeather q1WeatherTransl(@Nullable String q1WeatherTransl) {
    this.q1WeatherTransl = q1WeatherTransl;
    return this;
  }

  /**
   * Get q1WeatherTransl
   * @return q1WeatherTransl
   */
  
  @JsonProperty("q1WeatherTransl")
  public @Nullable String getQ1WeatherTransl() {
    return q1WeatherTransl;
  }

  public void setQ1WeatherTransl(@Nullable String q1WeatherTransl) {
    this.q1WeatherTransl = q1WeatherTransl;
  }

  public PracticeResponseWeather q1Temp(@Nullable Integer q1Temp) {
    this.q1Temp = q1Temp;
    return this;
  }

  /**
   * Get q1Temp
   * @return q1Temp
   */
  
  @JsonProperty("q1Temp")
  public @Nullable Integer getQ1Temp() {
    return q1Temp;
  }

  public void setQ1Temp(@Nullable Integer q1Temp) {
    this.q1Temp = q1Temp;
  }

  public PracticeResponseWeather q1Hum(@Nullable Integer q1Hum) {
    this.q1Hum = q1Hum;
    return this;
  }

  /**
   * Get q1Hum
   * @return q1Hum
   */
  
  @JsonProperty("q1Hum")
  public @Nullable Integer getQ1Hum() {
    return q1Hum;
  }

  public void setQ1Hum(@Nullable Integer q1Hum) {
    this.q1Hum = q1Hum;
  }

  public PracticeResponseWeather q2Weather(@Nullable String q2Weather) {
    this.q2Weather = q2Weather;
    return this;
  }

  /**
   * Get q2Weather
   * @return q2Weather
   */
  
  @JsonProperty("q2Weather")
  public @Nullable String getQ2Weather() {
    return q2Weather;
  }

  public void setQ2Weather(@Nullable String q2Weather) {
    this.q2Weather = q2Weather;
  }

  public PracticeResponseWeather q2WeatherTransl(@Nullable String q2WeatherTransl) {
    this.q2WeatherTransl = q2WeatherTransl;
    return this;
  }

  /**
   * Get q2WeatherTransl
   * @return q2WeatherTransl
   */
  
  @JsonProperty("q2WeatherTransl")
  public @Nullable String getQ2WeatherTransl() {
    return q2WeatherTransl;
  }

  public void setQ2WeatherTransl(@Nullable String q2WeatherTransl) {
    this.q2WeatherTransl = q2WeatherTransl;
  }

  public PracticeResponseWeather q2Temp(@Nullable Integer q2Temp) {
    this.q2Temp = q2Temp;
    return this;
  }

  /**
   * Get q2Temp
   * @return q2Temp
   */
  
  @JsonProperty("q2Temp")
  public @Nullable Integer getQ2Temp() {
    return q2Temp;
  }

  public void setQ2Temp(@Nullable Integer q2Temp) {
    this.q2Temp = q2Temp;
  }

  public PracticeResponseWeather q2Hum(@Nullable Integer q2Hum) {
    this.q2Hum = q2Hum;
    return this;
  }

  /**
   * Get q2Hum
   * @return q2Hum
   */
  
  @JsonProperty("q2Hum")
  public @Nullable Integer getQ2Hum() {
    return q2Hum;
  }

  public void setQ2Hum(@Nullable Integer q2Hum) {
    this.q2Hum = q2Hum;
  }

  public PracticeResponseWeather raceQ1TempLow(@Nullable Integer raceQ1TempLow) {
    this.raceQ1TempLow = raceQ1TempLow;
    return this;
  }

  /**
   * Get raceQ1TempLow
   * @return raceQ1TempLow
   */
  
  @JsonProperty("raceQ1TempLow")
  public @Nullable Integer getRaceQ1TempLow() {
    return raceQ1TempLow;
  }

  public void setRaceQ1TempLow(@Nullable Integer raceQ1TempLow) {
    this.raceQ1TempLow = raceQ1TempLow;
  }

  public PracticeResponseWeather raceQ1TempHigh(@Nullable Integer raceQ1TempHigh) {
    this.raceQ1TempHigh = raceQ1TempHigh;
    return this;
  }

  /**
   * Get raceQ1TempHigh
   * @return raceQ1TempHigh
   */
  
  @JsonProperty("raceQ1TempHigh")
  public @Nullable Integer getRaceQ1TempHigh() {
    return raceQ1TempHigh;
  }

  public void setRaceQ1TempHigh(@Nullable Integer raceQ1TempHigh) {
    this.raceQ1TempHigh = raceQ1TempHigh;
  }

  public PracticeResponseWeather raceQ1HumLow(@Nullable Integer raceQ1HumLow) {
    this.raceQ1HumLow = raceQ1HumLow;
    return this;
  }

  /**
   * Get raceQ1HumLow
   * @return raceQ1HumLow
   */
  
  @JsonProperty("raceQ1HumLow")
  public @Nullable Integer getRaceQ1HumLow() {
    return raceQ1HumLow;
  }

  public void setRaceQ1HumLow(@Nullable Integer raceQ1HumLow) {
    this.raceQ1HumLow = raceQ1HumLow;
  }

  public PracticeResponseWeather raceQ1HumHigh(@Nullable Integer raceQ1HumHigh) {
    this.raceQ1HumHigh = raceQ1HumHigh;
    return this;
  }

  /**
   * Get raceQ1HumHigh
   * @return raceQ1HumHigh
   */
  
  @JsonProperty("raceQ1HumHigh")
  public @Nullable Integer getRaceQ1HumHigh() {
    return raceQ1HumHigh;
  }

  public void setRaceQ1HumHigh(@Nullable Integer raceQ1HumHigh) {
    this.raceQ1HumHigh = raceQ1HumHigh;
  }

  public PracticeResponseWeather raceQ1RainPLow(@Nullable Integer raceQ1RainPLow) {
    this.raceQ1RainPLow = raceQ1RainPLow;
    return this;
  }

  /**
   * Get raceQ1RainPLow
   * @return raceQ1RainPLow
   */
  
  @JsonProperty("raceQ1RainPLow")
  public @Nullable Integer getRaceQ1RainPLow() {
    return raceQ1RainPLow;
  }

  public void setRaceQ1RainPLow(@Nullable Integer raceQ1RainPLow) {
    this.raceQ1RainPLow = raceQ1RainPLow;
  }

  public PracticeResponseWeather raceQ1RainPHigh(@Nullable Integer raceQ1RainPHigh) {
    this.raceQ1RainPHigh = raceQ1RainPHigh;
    return this;
  }

  /**
   * Get raceQ1RainPHigh
   * @return raceQ1RainPHigh
   */
  
  @JsonProperty("raceQ1RainPHigh")
  public @Nullable Integer getRaceQ1RainPHigh() {
    return raceQ1RainPHigh;
  }

  public void setRaceQ1RainPHigh(@Nullable Integer raceQ1RainPHigh) {
    this.raceQ1RainPHigh = raceQ1RainPHigh;
  }

  public PracticeResponseWeather raceQ2TempLow(@Nullable Integer raceQ2TempLow) {
    this.raceQ2TempLow = raceQ2TempLow;
    return this;
  }

  /**
   * Get raceQ2TempLow
   * @return raceQ2TempLow
   */
  
  @JsonProperty("raceQ2TempLow")
  public @Nullable Integer getRaceQ2TempLow() {
    return raceQ2TempLow;
  }

  public void setRaceQ2TempLow(@Nullable Integer raceQ2TempLow) {
    this.raceQ2TempLow = raceQ2TempLow;
  }

  public PracticeResponseWeather raceQ2TempHigh(@Nullable Integer raceQ2TempHigh) {
    this.raceQ2TempHigh = raceQ2TempHigh;
    return this;
  }

  /**
   * Get raceQ2TempHigh
   * @return raceQ2TempHigh
   */
  
  @JsonProperty("raceQ2TempHigh")
  public @Nullable Integer getRaceQ2TempHigh() {
    return raceQ2TempHigh;
  }

  public void setRaceQ2TempHigh(@Nullable Integer raceQ2TempHigh) {
    this.raceQ2TempHigh = raceQ2TempHigh;
  }

  public PracticeResponseWeather raceQ2HumLow(@Nullable Integer raceQ2HumLow) {
    this.raceQ2HumLow = raceQ2HumLow;
    return this;
  }

  /**
   * Get raceQ2HumLow
   * @return raceQ2HumLow
   */
  
  @JsonProperty("raceQ2HumLow")
  public @Nullable Integer getRaceQ2HumLow() {
    return raceQ2HumLow;
  }

  public void setRaceQ2HumLow(@Nullable Integer raceQ2HumLow) {
    this.raceQ2HumLow = raceQ2HumLow;
  }

  public PracticeResponseWeather raceQ2HumHigh(@Nullable Integer raceQ2HumHigh) {
    this.raceQ2HumHigh = raceQ2HumHigh;
    return this;
  }

  /**
   * Get raceQ2HumHigh
   * @return raceQ2HumHigh
   */
  
  @JsonProperty("raceQ2HumHigh")
  public @Nullable Integer getRaceQ2HumHigh() {
    return raceQ2HumHigh;
  }

  public void setRaceQ2HumHigh(@Nullable Integer raceQ2HumHigh) {
    this.raceQ2HumHigh = raceQ2HumHigh;
  }

  public PracticeResponseWeather raceQ2RainPLow(@Nullable Integer raceQ2RainPLow) {
    this.raceQ2RainPLow = raceQ2RainPLow;
    return this;
  }

  /**
   * Get raceQ2RainPLow
   * @return raceQ2RainPLow
   */
  
  @JsonProperty("raceQ2RainPLow")
  public @Nullable Integer getRaceQ2RainPLow() {
    return raceQ2RainPLow;
  }

  public void setRaceQ2RainPLow(@Nullable Integer raceQ2RainPLow) {
    this.raceQ2RainPLow = raceQ2RainPLow;
  }

  public PracticeResponseWeather raceQ2RainPHigh(@Nullable Integer raceQ2RainPHigh) {
    this.raceQ2RainPHigh = raceQ2RainPHigh;
    return this;
  }

  /**
   * Get raceQ2RainPHigh
   * @return raceQ2RainPHigh
   */
  
  @JsonProperty("raceQ2RainPHigh")
  public @Nullable Integer getRaceQ2RainPHigh() {
    return raceQ2RainPHigh;
  }

  public void setRaceQ2RainPHigh(@Nullable Integer raceQ2RainPHigh) {
    this.raceQ2RainPHigh = raceQ2RainPHigh;
  }

  public PracticeResponseWeather raceQ3TempLow(@Nullable Integer raceQ3TempLow) {
    this.raceQ3TempLow = raceQ3TempLow;
    return this;
  }

  /**
   * Get raceQ3TempLow
   * @return raceQ3TempLow
   */
  
  @JsonProperty("raceQ3TempLow")
  public @Nullable Integer getRaceQ3TempLow() {
    return raceQ3TempLow;
  }

  public void setRaceQ3TempLow(@Nullable Integer raceQ3TempLow) {
    this.raceQ3TempLow = raceQ3TempLow;
  }

  public PracticeResponseWeather raceQ3TempHigh(@Nullable Integer raceQ3TempHigh) {
    this.raceQ3TempHigh = raceQ3TempHigh;
    return this;
  }

  /**
   * Get raceQ3TempHigh
   * @return raceQ3TempHigh
   */
  
  @JsonProperty("raceQ3TempHigh")
  public @Nullable Integer getRaceQ3TempHigh() {
    return raceQ3TempHigh;
  }

  public void setRaceQ3TempHigh(@Nullable Integer raceQ3TempHigh) {
    this.raceQ3TempHigh = raceQ3TempHigh;
  }

  public PracticeResponseWeather raceQ3HumLow(@Nullable Integer raceQ3HumLow) {
    this.raceQ3HumLow = raceQ3HumLow;
    return this;
  }

  /**
   * Get raceQ3HumLow
   * @return raceQ3HumLow
   */
  
  @JsonProperty("raceQ3HumLow")
  public @Nullable Integer getRaceQ3HumLow() {
    return raceQ3HumLow;
  }

  public void setRaceQ3HumLow(@Nullable Integer raceQ3HumLow) {
    this.raceQ3HumLow = raceQ3HumLow;
  }

  public PracticeResponseWeather raceQ3HumHigh(@Nullable Integer raceQ3HumHigh) {
    this.raceQ3HumHigh = raceQ3HumHigh;
    return this;
  }

  /**
   * Get raceQ3HumHigh
   * @return raceQ3HumHigh
   */
  
  @JsonProperty("raceQ3HumHigh")
  public @Nullable Integer getRaceQ3HumHigh() {
    return raceQ3HumHigh;
  }

  public void setRaceQ3HumHigh(@Nullable Integer raceQ3HumHigh) {
    this.raceQ3HumHigh = raceQ3HumHigh;
  }

  public PracticeResponseWeather raceQ3RainPLow(@Nullable Integer raceQ3RainPLow) {
    this.raceQ3RainPLow = raceQ3RainPLow;
    return this;
  }

  /**
   * Get raceQ3RainPLow
   * @return raceQ3RainPLow
   */
  
  @JsonProperty("raceQ3RainPLow")
  public @Nullable Integer getRaceQ3RainPLow() {
    return raceQ3RainPLow;
  }

  public void setRaceQ3RainPLow(@Nullable Integer raceQ3RainPLow) {
    this.raceQ3RainPLow = raceQ3RainPLow;
  }

  public PracticeResponseWeather raceQ3RainPHigh(@Nullable Integer raceQ3RainPHigh) {
    this.raceQ3RainPHigh = raceQ3RainPHigh;
    return this;
  }

  /**
   * Get raceQ3RainPHigh
   * @return raceQ3RainPHigh
   */
  
  @JsonProperty("raceQ3RainPHigh")
  public @Nullable Integer getRaceQ3RainPHigh() {
    return raceQ3RainPHigh;
  }

  public void setRaceQ3RainPHigh(@Nullable Integer raceQ3RainPHigh) {
    this.raceQ3RainPHigh = raceQ3RainPHigh;
  }

  public PracticeResponseWeather raceQ4TempLow(@Nullable Integer raceQ4TempLow) {
    this.raceQ4TempLow = raceQ4TempLow;
    return this;
  }

  /**
   * Get raceQ4TempLow
   * @return raceQ4TempLow
   */
  
  @JsonProperty("raceQ4TempLow")
  public @Nullable Integer getRaceQ4TempLow() {
    return raceQ4TempLow;
  }

  public void setRaceQ4TempLow(@Nullable Integer raceQ4TempLow) {
    this.raceQ4TempLow = raceQ4TempLow;
  }

  public PracticeResponseWeather raceQ4TempHigh(@Nullable Integer raceQ4TempHigh) {
    this.raceQ4TempHigh = raceQ4TempHigh;
    return this;
  }

  /**
   * Get raceQ4TempHigh
   * @return raceQ4TempHigh
   */
  
  @JsonProperty("raceQ4TempHigh")
  public @Nullable Integer getRaceQ4TempHigh() {
    return raceQ4TempHigh;
  }

  public void setRaceQ4TempHigh(@Nullable Integer raceQ4TempHigh) {
    this.raceQ4TempHigh = raceQ4TempHigh;
  }

  public PracticeResponseWeather raceQ4HumLow(@Nullable Integer raceQ4HumLow) {
    this.raceQ4HumLow = raceQ4HumLow;
    return this;
  }

  /**
   * Get raceQ4HumLow
   * @return raceQ4HumLow
   */
  
  @JsonProperty("raceQ4HumLow")
  public @Nullable Integer getRaceQ4HumLow() {
    return raceQ4HumLow;
  }

  public void setRaceQ4HumLow(@Nullable Integer raceQ4HumLow) {
    this.raceQ4HumLow = raceQ4HumLow;
  }

  public PracticeResponseWeather raceQ4HumHigh(@Nullable Integer raceQ4HumHigh) {
    this.raceQ4HumHigh = raceQ4HumHigh;
    return this;
  }

  /**
   * Get raceQ4HumHigh
   * @return raceQ4HumHigh
   */
  
  @JsonProperty("raceQ4HumHigh")
  public @Nullable Integer getRaceQ4HumHigh() {
    return raceQ4HumHigh;
  }

  public void setRaceQ4HumHigh(@Nullable Integer raceQ4HumHigh) {
    this.raceQ4HumHigh = raceQ4HumHigh;
  }

  public PracticeResponseWeather raceQ4RainPLow(@Nullable Integer raceQ4RainPLow) {
    this.raceQ4RainPLow = raceQ4RainPLow;
    return this;
  }

  /**
   * Get raceQ4RainPLow
   * @return raceQ4RainPLow
   */
  
  @JsonProperty("raceQ4RainPLow")
  public @Nullable Integer getRaceQ4RainPLow() {
    return raceQ4RainPLow;
  }

  public void setRaceQ4RainPLow(@Nullable Integer raceQ4RainPLow) {
    this.raceQ4RainPLow = raceQ4RainPLow;
  }

  public PracticeResponseWeather raceQ4RainPHigh(@Nullable Integer raceQ4RainPHigh) {
    this.raceQ4RainPHigh = raceQ4RainPHigh;
    return this;
  }

  /**
   * Get raceQ4RainPHigh
   * @return raceQ4RainPHigh
   */
  
  @JsonProperty("raceQ4RainPHigh")
  public @Nullable Integer getRaceQ4RainPHigh() {
    return raceQ4RainPHigh;
  }

  public void setRaceQ4RainPHigh(@Nullable Integer raceQ4RainPHigh) {
    this.raceQ4RainPHigh = raceQ4RainPHigh;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PracticeResponseWeather practiceResponseWeather = (PracticeResponseWeather) o;
    return Objects.equals(this.q1Weather, practiceResponseWeather.q1Weather) &&
        Objects.equals(this.q1WeatherTransl, practiceResponseWeather.q1WeatherTransl) &&
        Objects.equals(this.q1Temp, practiceResponseWeather.q1Temp) &&
        Objects.equals(this.q1Hum, practiceResponseWeather.q1Hum) &&
        Objects.equals(this.q2Weather, practiceResponseWeather.q2Weather) &&
        Objects.equals(this.q2WeatherTransl, practiceResponseWeather.q2WeatherTransl) &&
        Objects.equals(this.q2Temp, practiceResponseWeather.q2Temp) &&
        Objects.equals(this.q2Hum, practiceResponseWeather.q2Hum) &&
        Objects.equals(this.raceQ1TempLow, practiceResponseWeather.raceQ1TempLow) &&
        Objects.equals(this.raceQ1TempHigh, practiceResponseWeather.raceQ1TempHigh) &&
        Objects.equals(this.raceQ1HumLow, practiceResponseWeather.raceQ1HumLow) &&
        Objects.equals(this.raceQ1HumHigh, practiceResponseWeather.raceQ1HumHigh) &&
        Objects.equals(this.raceQ1RainPLow, practiceResponseWeather.raceQ1RainPLow) &&
        Objects.equals(this.raceQ1RainPHigh, practiceResponseWeather.raceQ1RainPHigh) &&
        Objects.equals(this.raceQ2TempLow, practiceResponseWeather.raceQ2TempLow) &&
        Objects.equals(this.raceQ2TempHigh, practiceResponseWeather.raceQ2TempHigh) &&
        Objects.equals(this.raceQ2HumLow, practiceResponseWeather.raceQ2HumLow) &&
        Objects.equals(this.raceQ2HumHigh, practiceResponseWeather.raceQ2HumHigh) &&
        Objects.equals(this.raceQ2RainPLow, practiceResponseWeather.raceQ2RainPLow) &&
        Objects.equals(this.raceQ2RainPHigh, practiceResponseWeather.raceQ2RainPHigh) &&
        Objects.equals(this.raceQ3TempLow, practiceResponseWeather.raceQ3TempLow) &&
        Objects.equals(this.raceQ3TempHigh, practiceResponseWeather.raceQ3TempHigh) &&
        Objects.equals(this.raceQ3HumLow, practiceResponseWeather.raceQ3HumLow) &&
        Objects.equals(this.raceQ3HumHigh, practiceResponseWeather.raceQ3HumHigh) &&
        Objects.equals(this.raceQ3RainPLow, practiceResponseWeather.raceQ3RainPLow) &&
        Objects.equals(this.raceQ3RainPHigh, practiceResponseWeather.raceQ3RainPHigh) &&
        Objects.equals(this.raceQ4TempLow, practiceResponseWeather.raceQ4TempLow) &&
        Objects.equals(this.raceQ4TempHigh, practiceResponseWeather.raceQ4TempHigh) &&
        Objects.equals(this.raceQ4HumLow, practiceResponseWeather.raceQ4HumLow) &&
        Objects.equals(this.raceQ4HumHigh, practiceResponseWeather.raceQ4HumHigh) &&
        Objects.equals(this.raceQ4RainPLow, practiceResponseWeather.raceQ4RainPLow) &&
        Objects.equals(this.raceQ4RainPHigh, practiceResponseWeather.raceQ4RainPHigh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(q1Weather, q1WeatherTransl, q1Temp, q1Hum, q2Weather, q2WeatherTransl, q2Temp, q2Hum, raceQ1TempLow, raceQ1TempHigh, raceQ1HumLow, raceQ1HumHigh, raceQ1RainPLow, raceQ1RainPHigh, raceQ2TempLow, raceQ2TempHigh, raceQ2HumLow, raceQ2HumHigh, raceQ2RainPLow, raceQ2RainPHigh, raceQ3TempLow, raceQ3TempHigh, raceQ3HumLow, raceQ3HumHigh, raceQ3RainPLow, raceQ3RainPHigh, raceQ4TempLow, raceQ4TempHigh, raceQ4HumLow, raceQ4HumHigh, raceQ4RainPLow, raceQ4RainPHigh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PracticeResponseWeather {\n");
    sb.append("    q1Weather: ").append(toIndentedString(q1Weather)).append("\n");
    sb.append("    q1WeatherTransl: ").append(toIndentedString(q1WeatherTransl)).append("\n");
    sb.append("    q1Temp: ").append(toIndentedString(q1Temp)).append("\n");
    sb.append("    q1Hum: ").append(toIndentedString(q1Hum)).append("\n");
    sb.append("    q2Weather: ").append(toIndentedString(q2Weather)).append("\n");
    sb.append("    q2WeatherTransl: ").append(toIndentedString(q2WeatherTransl)).append("\n");
    sb.append("    q2Temp: ").append(toIndentedString(q2Temp)).append("\n");
    sb.append("    q2Hum: ").append(toIndentedString(q2Hum)).append("\n");
    sb.append("    raceQ1TempLow: ").append(toIndentedString(raceQ1TempLow)).append("\n");
    sb.append("    raceQ1TempHigh: ").append(toIndentedString(raceQ1TempHigh)).append("\n");
    sb.append("    raceQ1HumLow: ").append(toIndentedString(raceQ1HumLow)).append("\n");
    sb.append("    raceQ1HumHigh: ").append(toIndentedString(raceQ1HumHigh)).append("\n");
    sb.append("    raceQ1RainPLow: ").append(toIndentedString(raceQ1RainPLow)).append("\n");
    sb.append("    raceQ1RainPHigh: ").append(toIndentedString(raceQ1RainPHigh)).append("\n");
    sb.append("    raceQ2TempLow: ").append(toIndentedString(raceQ2TempLow)).append("\n");
    sb.append("    raceQ2TempHigh: ").append(toIndentedString(raceQ2TempHigh)).append("\n");
    sb.append("    raceQ2HumLow: ").append(toIndentedString(raceQ2HumLow)).append("\n");
    sb.append("    raceQ2HumHigh: ").append(toIndentedString(raceQ2HumHigh)).append("\n");
    sb.append("    raceQ2RainPLow: ").append(toIndentedString(raceQ2RainPLow)).append("\n");
    sb.append("    raceQ2RainPHigh: ").append(toIndentedString(raceQ2RainPHigh)).append("\n");
    sb.append("    raceQ3TempLow: ").append(toIndentedString(raceQ3TempLow)).append("\n");
    sb.append("    raceQ3TempHigh: ").append(toIndentedString(raceQ3TempHigh)).append("\n");
    sb.append("    raceQ3HumLow: ").append(toIndentedString(raceQ3HumLow)).append("\n");
    sb.append("    raceQ3HumHigh: ").append(toIndentedString(raceQ3HumHigh)).append("\n");
    sb.append("    raceQ3RainPLow: ").append(toIndentedString(raceQ3RainPLow)).append("\n");
    sb.append("    raceQ3RainPHigh: ").append(toIndentedString(raceQ3RainPHigh)).append("\n");
    sb.append("    raceQ4TempLow: ").append(toIndentedString(raceQ4TempLow)).append("\n");
    sb.append("    raceQ4TempHigh: ").append(toIndentedString(raceQ4TempHigh)).append("\n");
    sb.append("    raceQ4HumLow: ").append(toIndentedString(raceQ4HumLow)).append("\n");
    sb.append("    raceQ4HumHigh: ").append(toIndentedString(raceQ4HumHigh)).append("\n");
    sb.append("    raceQ4RainPLow: ").append(toIndentedString(raceQ4RainPLow)).append("\n");
    sb.append("    raceQ4RainPHigh: ").append(toIndentedString(raceQ4RainPHigh)).append("\n");
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

