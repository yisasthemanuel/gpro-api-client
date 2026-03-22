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
 * NegoSignSponsorProfileResponseNegLogInner
 */

@JsonTypeName("NegoSignSponsorProfileResponse_negLog_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NegoSignSponsorProfileResponseNegLogInner {

  private @Nullable String date;

  private @Nullable String season;

  private @Nullable String race;

  private @Nullable String text;

  public NegoSignSponsorProfileResponseNegLogInner date(@Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  
  @JsonProperty("date")
  public @Nullable String getDate() {
    return date;
  }

  public void setDate(@Nullable String date) {
    this.date = date;
  }

  public NegoSignSponsorProfileResponseNegLogInner season(@Nullable String season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
   */
  
  @JsonProperty("season")
  public @Nullable String getSeason() {
    return season;
  }

  public void setSeason(@Nullable String season) {
    this.season = season;
  }

  public NegoSignSponsorProfileResponseNegLogInner race(@Nullable String race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
   */
  
  @JsonProperty("race")
  public @Nullable String getRace() {
    return race;
  }

  public void setRace(@Nullable String race) {
    this.race = race;
  }

  public NegoSignSponsorProfileResponseNegLogInner text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegoSignSponsorProfileResponseNegLogInner negoSignSponsorProfileResponseNegLogInner = (NegoSignSponsorProfileResponseNegLogInner) o;
    return Objects.equals(this.date, negoSignSponsorProfileResponseNegLogInner.date) &&
        Objects.equals(this.season, negoSignSponsorProfileResponseNegLogInner.season) &&
        Objects.equals(this.race, negoSignSponsorProfileResponseNegLogInner.race) &&
        Objects.equals(this.text, negoSignSponsorProfileResponseNegLogInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, season, race, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegoSignSponsorProfileResponseNegLogInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

