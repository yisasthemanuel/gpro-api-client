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
 * NegOverviewResponseCarSpotsInner
 */

@JsonTypeName("NegOverviewResponse_carSpots_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NegOverviewResponseCarSpotsInner {

  private @Nullable String name;

  private @Nullable Integer sponsorId;

  private @Nullable String carSpotName;

  private @Nullable String amount;

  private @Nullable Integer contractStatus;

  private @Nullable String racesLeft;

  private @Nullable String satisfaction;

  public NegOverviewResponseCarSpotsInner name(@Nullable String name) {
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

  public NegOverviewResponseCarSpotsInner sponsorId(@Nullable Integer sponsorId) {
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

  public NegOverviewResponseCarSpotsInner carSpotName(@Nullable String carSpotName) {
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

  public NegOverviewResponseCarSpotsInner amount(@Nullable String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  
  @JsonProperty("amount")
  public @Nullable String getAmount() {
    return amount;
  }

  public void setAmount(@Nullable String amount) {
    this.amount = amount;
  }

  public NegOverviewResponseCarSpotsInner contractStatus(@Nullable Integer contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * Get contractStatus
   * @return contractStatus
   */
  
  @JsonProperty("contractStatus")
  public @Nullable Integer getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(@Nullable Integer contractStatus) {
    this.contractStatus = contractStatus;
  }

  public NegOverviewResponseCarSpotsInner racesLeft(@Nullable String racesLeft) {
    this.racesLeft = racesLeft;
    return this;
  }

  /**
   * Get racesLeft
   * @return racesLeft
   */
  
  @JsonProperty("racesLeft")
  public @Nullable String getRacesLeft() {
    return racesLeft;
  }

  public void setRacesLeft(@Nullable String racesLeft) {
    this.racesLeft = racesLeft;
  }

  public NegOverviewResponseCarSpotsInner satisfaction(@Nullable String satisfaction) {
    this.satisfaction = satisfaction;
    return this;
  }

  /**
   * Get satisfaction
   * @return satisfaction
   */
  
  @JsonProperty("satisfaction")
  public @Nullable String getSatisfaction() {
    return satisfaction;
  }

  public void setSatisfaction(@Nullable String satisfaction) {
    this.satisfaction = satisfaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegOverviewResponseCarSpotsInner negOverviewResponseCarSpotsInner = (NegOverviewResponseCarSpotsInner) o;
    return Objects.equals(this.name, negOverviewResponseCarSpotsInner.name) &&
        Objects.equals(this.sponsorId, negOverviewResponseCarSpotsInner.sponsorId) &&
        Objects.equals(this.carSpotName, negOverviewResponseCarSpotsInner.carSpotName) &&
        Objects.equals(this.amount, negOverviewResponseCarSpotsInner.amount) &&
        Objects.equals(this.contractStatus, negOverviewResponseCarSpotsInner.contractStatus) &&
        Objects.equals(this.racesLeft, negOverviewResponseCarSpotsInner.racesLeft) &&
        Objects.equals(this.satisfaction, negOverviewResponseCarSpotsInner.satisfaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sponsorId, carSpotName, amount, contractStatus, racesLeft, satisfaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegOverviewResponseCarSpotsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
    sb.append("    carSpotName: ").append(toIndentedString(carSpotName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    racesLeft: ").append(toIndentedString(racesLeft)).append("\n");
    sb.append("    satisfaction: ").append(toIndentedString(satisfaction)).append("\n");
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

