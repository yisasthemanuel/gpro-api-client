package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.NegOverviewResponseCarSpotsInner;
import org.jlobato.gpro.proxy.model.NegOverviewResponseCommsInner;
import org.jlobato.gpro.proxy.model.NegOverviewResponseOngNegsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NegOverviewResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NegOverviewResponse {

  private @Nullable String loadingDataState;

  @Valid
  private List<@Valid NegOverviewResponseCarSpotsInner> carSpots = new ArrayList<>();

  private @Nullable Integer carSpotsTaken;

  @Valid
  private List<@Valid NegOverviewResponseOngNegsInner> ongNegs = new ArrayList<>();

  @Valid
  private List<@Valid NegOverviewResponseCommsInner> comms = new ArrayList<>();

  private @Nullable Integer negPrioUpdated;

  private @Nullable Integer updateInProgress;

  private @Nullable Integer raceInProgress;

  private @Nullable String errorMsg;

  private @Nullable Integer apiRequestsRemaining;

  public NegOverviewResponse loadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
    return this;
  }

  /**
   * Get loadingDataState
   * @return loadingDataState
   */
  
  @JsonProperty("loadingDataState")
  public @Nullable String getLoadingDataState() {
    return loadingDataState;
  }

  public void setLoadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
  }

  public NegOverviewResponse carSpots(List<@Valid NegOverviewResponseCarSpotsInner> carSpots) {
    this.carSpots = carSpots;
    return this;
  }

  public NegOverviewResponse addCarSpotsItem(NegOverviewResponseCarSpotsInner carSpotsItem) {
    if (this.carSpots == null) {
      this.carSpots = new ArrayList<>();
    }
    this.carSpots.add(carSpotsItem);
    return this;
  }

  /**
   * Get carSpots
   * @return carSpots
   */
  @Valid 
  @JsonProperty("carSpots")
  public List<@Valid NegOverviewResponseCarSpotsInner> getCarSpots() {
    return carSpots;
  }

  public void setCarSpots(List<@Valid NegOverviewResponseCarSpotsInner> carSpots) {
    this.carSpots = carSpots;
  }

  public NegOverviewResponse carSpotsTaken(@Nullable Integer carSpotsTaken) {
    this.carSpotsTaken = carSpotsTaken;
    return this;
  }

  /**
   * Get carSpotsTaken
   * @return carSpotsTaken
   */
  
  @JsonProperty("carSpotsTaken")
  public @Nullable Integer getCarSpotsTaken() {
    return carSpotsTaken;
  }

  public void setCarSpotsTaken(@Nullable Integer carSpotsTaken) {
    this.carSpotsTaken = carSpotsTaken;
  }

  public NegOverviewResponse ongNegs(List<@Valid NegOverviewResponseOngNegsInner> ongNegs) {
    this.ongNegs = ongNegs;
    return this;
  }

  public NegOverviewResponse addOngNegsItem(NegOverviewResponseOngNegsInner ongNegsItem) {
    if (this.ongNegs == null) {
      this.ongNegs = new ArrayList<>();
    }
    this.ongNegs.add(ongNegsItem);
    return this;
  }

  /**
   * Get ongNegs
   * @return ongNegs
   */
  @Valid 
  @JsonProperty("ongNegs")
  public List<@Valid NegOverviewResponseOngNegsInner> getOngNegs() {
    return ongNegs;
  }

  public void setOngNegs(List<@Valid NegOverviewResponseOngNegsInner> ongNegs) {
    this.ongNegs = ongNegs;
  }

  public NegOverviewResponse comms(List<@Valid NegOverviewResponseCommsInner> comms) {
    this.comms = comms;
    return this;
  }

  public NegOverviewResponse addCommsItem(NegOverviewResponseCommsInner commsItem) {
    if (this.comms == null) {
      this.comms = new ArrayList<>();
    }
    this.comms.add(commsItem);
    return this;
  }

  /**
   * Get comms
   * @return comms
   */
  @Valid 
  @JsonProperty("comms")
  public List<@Valid NegOverviewResponseCommsInner> getComms() {
    return comms;
  }

  public void setComms(List<@Valid NegOverviewResponseCommsInner> comms) {
    this.comms = comms;
  }

  public NegOverviewResponse negPrioUpdated(@Nullable Integer negPrioUpdated) {
    this.negPrioUpdated = negPrioUpdated;
    return this;
  }

  /**
   * Get negPrioUpdated
   * @return negPrioUpdated
   */
  
  @JsonProperty("negPrioUpdated")
  public @Nullable Integer getNegPrioUpdated() {
    return negPrioUpdated;
  }

  public void setNegPrioUpdated(@Nullable Integer negPrioUpdated) {
    this.negPrioUpdated = negPrioUpdated;
  }

  public NegOverviewResponse updateInProgress(@Nullable Integer updateInProgress) {
    this.updateInProgress = updateInProgress;
    return this;
  }

  /**
   * Get updateInProgress
   * @return updateInProgress
   */
  
  @JsonProperty("updateInProgress")
  public @Nullable Integer getUpdateInProgress() {
    return updateInProgress;
  }

  public void setUpdateInProgress(@Nullable Integer updateInProgress) {
    this.updateInProgress = updateInProgress;
  }

  public NegOverviewResponse raceInProgress(@Nullable Integer raceInProgress) {
    this.raceInProgress = raceInProgress;
    return this;
  }

  /**
   * Get raceInProgress
   * @return raceInProgress
   */
  
  @JsonProperty("raceInProgress")
  public @Nullable Integer getRaceInProgress() {
    return raceInProgress;
  }

  public void setRaceInProgress(@Nullable Integer raceInProgress) {
    this.raceInProgress = raceInProgress;
  }

  public NegOverviewResponse errorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  /**
   * Get errorMsg
   * @return errorMsg
   */
  
  @JsonProperty("errorMsg")
  public @Nullable String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public NegOverviewResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
    this.apiRequestsRemaining = apiRequestsRemaining;
    return this;
  }

  /**
   * Get apiRequestsRemaining
   * @return apiRequestsRemaining
   */
  
  @JsonProperty("apiRequestsRemaining")
  public @Nullable Integer getApiRequestsRemaining() {
    return apiRequestsRemaining;
  }

  public void setApiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
    this.apiRequestsRemaining = apiRequestsRemaining;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegOverviewResponse negOverviewResponse = (NegOverviewResponse) o;
    return Objects.equals(this.loadingDataState, negOverviewResponse.loadingDataState) &&
        Objects.equals(this.carSpots, negOverviewResponse.carSpots) &&
        Objects.equals(this.carSpotsTaken, negOverviewResponse.carSpotsTaken) &&
        Objects.equals(this.ongNegs, negOverviewResponse.ongNegs) &&
        Objects.equals(this.comms, negOverviewResponse.comms) &&
        Objects.equals(this.negPrioUpdated, negOverviewResponse.negPrioUpdated) &&
        Objects.equals(this.updateInProgress, negOverviewResponse.updateInProgress) &&
        Objects.equals(this.raceInProgress, negOverviewResponse.raceInProgress) &&
        Objects.equals(this.errorMsg, negOverviewResponse.errorMsg) &&
        Objects.equals(this.apiRequestsRemaining, negOverviewResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, carSpots, carSpotsTaken, ongNegs, comms, negPrioUpdated, updateInProgress, raceInProgress, errorMsg, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegOverviewResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    carSpots: ").append(toIndentedString(carSpots)).append("\n");
    sb.append("    carSpotsTaken: ").append(toIndentedString(carSpotsTaken)).append("\n");
    sb.append("    ongNegs: ").append(toIndentedString(ongNegs)).append("\n");
    sb.append("    comms: ").append(toIndentedString(comms)).append("\n");
    sb.append("    negPrioUpdated: ").append(toIndentedString(negPrioUpdated)).append("\n");
    sb.append("    updateInProgress: ").append(toIndentedString(updateInProgress)).append("\n");
    sb.append("    raceInProgress: ").append(toIndentedString(raceInProgress)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    apiRequestsRemaining: ").append(toIndentedString(apiRequestsRemaining)).append("\n");
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

