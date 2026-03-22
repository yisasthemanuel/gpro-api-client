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
 * NegOverviewResponseOngNegsInner
 */

@JsonTypeName("NegOverviewResponse_ongNegs_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NegOverviewResponseOngNegsInner {

  private @Nullable String name;

  private @Nullable Integer sponsorId;

  private @Nullable String carSpotName;

  private @Nullable Integer amount;

  private @Nullable Integer duration;

  private @Nullable String textColor;

  private @Nullable String progress;

  private @Nullable String priority;

  private @Nullable String contested;

  private @Nullable String avgProgress;

  private @Nullable Integer attention;

  public NegOverviewResponseOngNegsInner name(@Nullable String name) {
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

  public NegOverviewResponseOngNegsInner sponsorId(@Nullable Integer sponsorId) {
    this.sponsorId = sponsorId;
    return this;
  }

  /**
   * Get sponsorId
   * @return sponsorId
   */
  
  @JsonProperty("sponsorId")
  public @Nullable Integer getSponsorId() {
    return sponsorId;
  }

  public void setSponsorId(@Nullable Integer sponsorId) {
    this.sponsorId = sponsorId;
  }

  public NegOverviewResponseOngNegsInner carSpotName(@Nullable String carSpotName) {
    this.carSpotName = carSpotName;
    return this;
  }

  /**
   * Get carSpotName
   * @return carSpotName
   */
  
  @JsonProperty("carSpotName")
  public @Nullable String getCarSpotName() {
    return carSpotName;
  }

  public void setCarSpotName(@Nullable String carSpotName) {
    this.carSpotName = carSpotName;
  }

  public NegOverviewResponseOngNegsInner amount(@Nullable Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  
  @JsonProperty("amount")
  public @Nullable Integer getAmount() {
    return amount;
  }

  public void setAmount(@Nullable Integer amount) {
    this.amount = amount;
  }

  public NegOverviewResponseOngNegsInner duration(@Nullable Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  
  @JsonProperty("duration")
  public @Nullable Integer getDuration() {
    return duration;
  }

  public void setDuration(@Nullable Integer duration) {
    this.duration = duration;
  }

  public NegOverviewResponseOngNegsInner textColor(@Nullable String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * Get textColor
   * @return textColor
   */
  
  @JsonProperty("textColor")
  public @Nullable String getTextColor() {
    return textColor;
  }

  public void setTextColor(@Nullable String textColor) {
    this.textColor = textColor;
  }

  public NegOverviewResponseOngNegsInner progress(@Nullable String progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  
  @JsonProperty("progress")
  public @Nullable String getProgress() {
    return progress;
  }

  public void setProgress(@Nullable String progress) {
    this.progress = progress;
  }

  public NegOverviewResponseOngNegsInner priority(@Nullable String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  
  @JsonProperty("priority")
  public @Nullable String getPriority() {
    return priority;
  }

  public void setPriority(@Nullable String priority) {
    this.priority = priority;
  }

  public NegOverviewResponseOngNegsInner contested(@Nullable String contested) {
    this.contested = contested;
    return this;
  }

  /**
   * Get contested
   * @return contested
   */
  
  @JsonProperty("contested")
  public @Nullable String getContested() {
    return contested;
  }

  public void setContested(@Nullable String contested) {
    this.contested = contested;
  }

  public NegOverviewResponseOngNegsInner avgProgress(@Nullable String avgProgress) {
    this.avgProgress = avgProgress;
    return this;
  }

  /**
   * Get avgProgress
   * @return avgProgress
   */
  
  @JsonProperty("avgProgress")
  public @Nullable String getAvgProgress() {
    return avgProgress;
  }

  public void setAvgProgress(@Nullable String avgProgress) {
    this.avgProgress = avgProgress;
  }

  public NegOverviewResponseOngNegsInner attention(@Nullable Integer attention) {
    this.attention = attention;
    return this;
  }

  /**
   * Get attention
   * @return attention
   */
  
  @JsonProperty("attention")
  public @Nullable Integer getAttention() {
    return attention;
  }

  public void setAttention(@Nullable Integer attention) {
    this.attention = attention;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegOverviewResponseOngNegsInner negOverviewResponseOngNegsInner = (NegOverviewResponseOngNegsInner) o;
    return Objects.equals(this.name, negOverviewResponseOngNegsInner.name) &&
        Objects.equals(this.sponsorId, negOverviewResponseOngNegsInner.sponsorId) &&
        Objects.equals(this.carSpotName, negOverviewResponseOngNegsInner.carSpotName) &&
        Objects.equals(this.amount, negOverviewResponseOngNegsInner.amount) &&
        Objects.equals(this.duration, negOverviewResponseOngNegsInner.duration) &&
        Objects.equals(this.textColor, negOverviewResponseOngNegsInner.textColor) &&
        Objects.equals(this.progress, negOverviewResponseOngNegsInner.progress) &&
        Objects.equals(this.priority, negOverviewResponseOngNegsInner.priority) &&
        Objects.equals(this.contested, negOverviewResponseOngNegsInner.contested) &&
        Objects.equals(this.avgProgress, negOverviewResponseOngNegsInner.avgProgress) &&
        Objects.equals(this.attention, negOverviewResponseOngNegsInner.attention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sponsorId, carSpotName, amount, duration, textColor, progress, priority, contested, avgProgress, attention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegOverviewResponseOngNegsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
    sb.append("    carSpotName: ").append(toIndentedString(carSpotName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    contested: ").append(toIndentedString(contested)).append("\n");
    sb.append("    avgProgress: ").append(toIndentedString(avgProgress)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
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

