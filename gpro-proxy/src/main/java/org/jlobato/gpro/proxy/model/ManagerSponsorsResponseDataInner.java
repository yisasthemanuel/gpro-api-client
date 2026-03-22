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
 * ManagerSponsorsResponseDataInner
 */

@JsonTypeName("ManagerSponsorsResponse_data_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class ManagerSponsorsResponseDataInner {

  private @Nullable Integer idx;

  private @Nullable String manName;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable Integer champs;

  private @Nullable String sponsorName;

  private @Nullable String sponsorGroup;

  private @Nullable String sponsorGroupShort;

  private @Nullable Integer sponsorId;

  private @Nullable Integer duration;

  private @Nullable Integer finances;

  private @Nullable Integer expectations;

  private @Nullable Integer patience;

  private @Nullable Integer reputation;

  private @Nullable Integer image;

  private @Nullable Integer negotiation;

  public ManagerSponsorsResponseDataInner idx(@Nullable Integer idx) {
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

  public ManagerSponsorsResponseDataInner manName(@Nullable String manName) {
    this.manName = manName;
    return this;
  }

  /**
   * Get manName
   * @return manName
   */
  
  @JsonProperty("manName")
  public @Nullable String getManName() {
    return manName;
  }

  public void setManName(@Nullable String manName) {
    this.manName = manName;
  }

  public ManagerSponsorsResponseDataInner natCode(@Nullable String natCode) {
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

  public ManagerSponsorsResponseDataInner IDM(@Nullable Integer IDM) {
    this.IDM = IDM;
    return this;
  }

  /**
   * Get IDM
   * @return IDM
   */
  
  @JsonProperty("IDM")
  public @Nullable Integer getIDM() {
    return IDM;
  }

  public void setIDM(@Nullable Integer IDM) {
    this.IDM = IDM;
  }

  public ManagerSponsorsResponseDataInner champs(@Nullable Integer champs) {
    this.champs = champs;
    return this;
  }

  /**
   * Get champs
   * @return champs
   */
  
  @JsonProperty("champs")
  public @Nullable Integer getChamps() {
    return champs;
  }

  public void setChamps(@Nullable Integer champs) {
    this.champs = champs;
  }

  public ManagerSponsorsResponseDataInner sponsorName(@Nullable String sponsorName) {
    this.sponsorName = sponsorName;
    return this;
  }

  /**
   * Get sponsorName
   * @return sponsorName
   */
  
  @JsonProperty("sponsorName")
  public @Nullable String getSponsorName() {
    return sponsorName;
  }

  public void setSponsorName(@Nullable String sponsorName) {
    this.sponsorName = sponsorName;
  }

  public ManagerSponsorsResponseDataInner sponsorGroup(@Nullable String sponsorGroup) {
    this.sponsorGroup = sponsorGroup;
    return this;
  }

  /**
   * Get sponsorGroup
   * @return sponsorGroup
   */
  
  @JsonProperty("sponsorGroup")
  public @Nullable String getSponsorGroup() {
    return sponsorGroup;
  }

  public void setSponsorGroup(@Nullable String sponsorGroup) {
    this.sponsorGroup = sponsorGroup;
  }

  public ManagerSponsorsResponseDataInner sponsorGroupShort(@Nullable String sponsorGroupShort) {
    this.sponsorGroupShort = sponsorGroupShort;
    return this;
  }

  /**
   * Get sponsorGroupShort
   * @return sponsorGroupShort
   */
  
  @JsonProperty("sponsorGroupShort")
  public @Nullable String getSponsorGroupShort() {
    return sponsorGroupShort;
  }

  public void setSponsorGroupShort(@Nullable String sponsorGroupShort) {
    this.sponsorGroupShort = sponsorGroupShort;
  }

  public ManagerSponsorsResponseDataInner sponsorId(@Nullable Integer sponsorId) {
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

  public ManagerSponsorsResponseDataInner duration(@Nullable Integer duration) {
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

  public ManagerSponsorsResponseDataInner finances(@Nullable Integer finances) {
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

  public ManagerSponsorsResponseDataInner expectations(@Nullable Integer expectations) {
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

  public ManagerSponsorsResponseDataInner patience(@Nullable Integer patience) {
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

  public ManagerSponsorsResponseDataInner reputation(@Nullable Integer reputation) {
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

  public ManagerSponsorsResponseDataInner image(@Nullable Integer image) {
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

  public ManagerSponsorsResponseDataInner negotiation(@Nullable Integer negotiation) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerSponsorsResponseDataInner managerSponsorsResponseDataInner = (ManagerSponsorsResponseDataInner) o;
    return Objects.equals(this.idx, managerSponsorsResponseDataInner.idx) &&
        Objects.equals(this.manName, managerSponsorsResponseDataInner.manName) &&
        Objects.equals(this.natCode, managerSponsorsResponseDataInner.natCode) &&
        Objects.equals(this.IDM, managerSponsorsResponseDataInner.IDM) &&
        Objects.equals(this.champs, managerSponsorsResponseDataInner.champs) &&
        Objects.equals(this.sponsorName, managerSponsorsResponseDataInner.sponsorName) &&
        Objects.equals(this.sponsorGroup, managerSponsorsResponseDataInner.sponsorGroup) &&
        Objects.equals(this.sponsorGroupShort, managerSponsorsResponseDataInner.sponsorGroupShort) &&
        Objects.equals(this.sponsorId, managerSponsorsResponseDataInner.sponsorId) &&
        Objects.equals(this.duration, managerSponsorsResponseDataInner.duration) &&
        Objects.equals(this.finances, managerSponsorsResponseDataInner.finances) &&
        Objects.equals(this.expectations, managerSponsorsResponseDataInner.expectations) &&
        Objects.equals(this.patience, managerSponsorsResponseDataInner.patience) &&
        Objects.equals(this.reputation, managerSponsorsResponseDataInner.reputation) &&
        Objects.equals(this.image, managerSponsorsResponseDataInner.image) &&
        Objects.equals(this.negotiation, managerSponsorsResponseDataInner.negotiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, manName, natCode, IDM, champs, sponsorName, sponsorGroup, sponsorGroupShort, sponsorId, duration, finances, expectations, patience, reputation, image, negotiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerSponsorsResponseDataInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    manName: ").append(toIndentedString(manName)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    sponsorName: ").append(toIndentedString(sponsorName)).append("\n");
    sb.append("    sponsorGroup: ").append(toIndentedString(sponsorGroup)).append("\n");
    sb.append("    sponsorGroupShort: ").append(toIndentedString(sponsorGroupShort)).append("\n");
    sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    finances: ").append(toIndentedString(finances)).append("\n");
    sb.append("    expectations: ").append(toIndentedString(expectations)).append("\n");
    sb.append("    patience: ").append(toIndentedString(patience)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    negotiation: ").append(toIndentedString(negotiation)).append("\n");
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

