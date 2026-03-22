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
 * AvailableSponsorsResponseSponsorsInner
 */

@JsonTypeName("AvailableSponsorsResponse_sponsors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class AvailableSponsorsResponseSponsorsInner {

  private @Nullable String name;

  private @Nullable String idx;

  private @Nullable String sponsorId;

  private @Nullable String natCode;

  private @Nullable Integer finances;

  private @Nullable Integer expectations;

  private @Nullable Integer patience;

  private @Nullable Integer reputation;

  private @Nullable Integer image;

  private @Nullable Integer negotiation;

  private @Nullable Integer estAvgProgress;

  private @Nullable String progressColor;

  public AvailableSponsorsResponseSponsorsInner name(@Nullable String name) {
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

  public AvailableSponsorsResponseSponsorsInner idx(@Nullable String idx) {
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

  public AvailableSponsorsResponseSponsorsInner sponsorId(@Nullable String sponsorId) {
    this.sponsorId = sponsorId;
    return this;
  }

  /**
   * Get sponsorId
   * @return sponsorId
   */
  
  @JsonProperty("sponsorId")
  public @Nullable String getSponsorId() {
    return sponsorId;
  }

  public void setSponsorId(@Nullable String sponsorId) {
    this.sponsorId = sponsorId;
  }

  public AvailableSponsorsResponseSponsorsInner natCode(@Nullable String natCode) {
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

  public AvailableSponsorsResponseSponsorsInner finances(@Nullable Integer finances) {
    this.finances = finances;
    return this;
  }

  /**
   * Get finances
   * @return finances
   */
  
  @JsonProperty("finances")
  public @Nullable Integer getFinances() {
    return finances;
  }

  public void setFinances(@Nullable Integer finances) {
    this.finances = finances;
  }

  public AvailableSponsorsResponseSponsorsInner expectations(@Nullable Integer expectations) {
    this.expectations = expectations;
    return this;
  }

  /**
   * Get expectations
   * @return expectations
   */
  
  @JsonProperty("expectations")
  public @Nullable Integer getExpectations() {
    return expectations;
  }

  public void setExpectations(@Nullable Integer expectations) {
    this.expectations = expectations;
  }

  public AvailableSponsorsResponseSponsorsInner patience(@Nullable Integer patience) {
    this.patience = patience;
    return this;
  }

  /**
   * Get patience
   * @return patience
   */
  
  @JsonProperty("patience")
  public @Nullable Integer getPatience() {
    return patience;
  }

  public void setPatience(@Nullable Integer patience) {
    this.patience = patience;
  }

  public AvailableSponsorsResponseSponsorsInner reputation(@Nullable Integer reputation) {
    this.reputation = reputation;
    return this;
  }

  /**
   * Get reputation
   * @return reputation
   */
  
  @JsonProperty("reputation")
  public @Nullable Integer getReputation() {
    return reputation;
  }

  public void setReputation(@Nullable Integer reputation) {
    this.reputation = reputation;
  }

  public AvailableSponsorsResponseSponsorsInner image(@Nullable Integer image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  
  @JsonProperty("image")
  public @Nullable Integer getImage() {
    return image;
  }

  public void setImage(@Nullable Integer image) {
    this.image = image;
  }

  public AvailableSponsorsResponseSponsorsInner negotiation(@Nullable Integer negotiation) {
    this.negotiation = negotiation;
    return this;
  }

  /**
   * Get negotiation
   * @return negotiation
   */
  
  @JsonProperty("negotiation")
  public @Nullable Integer getNegotiation() {
    return negotiation;
  }

  public void setNegotiation(@Nullable Integer negotiation) {
    this.negotiation = negotiation;
  }

  public AvailableSponsorsResponseSponsorsInner estAvgProgress(@Nullable Integer estAvgProgress) {
    this.estAvgProgress = estAvgProgress;
    return this;
  }

  /**
   * Get estAvgProgress
   * @return estAvgProgress
   */
  
  @JsonProperty("estAvgProgress")
  public @Nullable Integer getEstAvgProgress() {
    return estAvgProgress;
  }

  public void setEstAvgProgress(@Nullable Integer estAvgProgress) {
    this.estAvgProgress = estAvgProgress;
  }

  public AvailableSponsorsResponseSponsorsInner progressColor(@Nullable String progressColor) {
    this.progressColor = progressColor;
    return this;
  }

  /**
   * Get progressColor
   * @return progressColor
   */
  
  @JsonProperty("progressColor")
  public @Nullable String getProgressColor() {
    return progressColor;
  }

  public void setProgressColor(@Nullable String progressColor) {
    this.progressColor = progressColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableSponsorsResponseSponsorsInner availableSponsorsResponseSponsorsInner = (AvailableSponsorsResponseSponsorsInner) o;
    return Objects.equals(this.name, availableSponsorsResponseSponsorsInner.name) &&
        Objects.equals(this.idx, availableSponsorsResponseSponsorsInner.idx) &&
        Objects.equals(this.sponsorId, availableSponsorsResponseSponsorsInner.sponsorId) &&
        Objects.equals(this.natCode, availableSponsorsResponseSponsorsInner.natCode) &&
        Objects.equals(this.finances, availableSponsorsResponseSponsorsInner.finances) &&
        Objects.equals(this.expectations, availableSponsorsResponseSponsorsInner.expectations) &&
        Objects.equals(this.patience, availableSponsorsResponseSponsorsInner.patience) &&
        Objects.equals(this.reputation, availableSponsorsResponseSponsorsInner.reputation) &&
        Objects.equals(this.image, availableSponsorsResponseSponsorsInner.image) &&
        Objects.equals(this.negotiation, availableSponsorsResponseSponsorsInner.negotiation) &&
        Objects.equals(this.estAvgProgress, availableSponsorsResponseSponsorsInner.estAvgProgress) &&
        Objects.equals(this.progressColor, availableSponsorsResponseSponsorsInner.progressColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, idx, sponsorId, natCode, finances, expectations, patience, reputation, image, negotiation, estAvgProgress, progressColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableSponsorsResponseSponsorsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    finances: ").append(toIndentedString(finances)).append("\n");
    sb.append("    expectations: ").append(toIndentedString(expectations)).append("\n");
    sb.append("    patience: ").append(toIndentedString(patience)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    negotiation: ").append(toIndentedString(negotiation)).append("\n");
    sb.append("    estAvgProgress: ").append(toIndentedString(estAvgProgress)).append("\n");
    sb.append("    progressColor: ").append(toIndentedString(progressColor)).append("\n");
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

