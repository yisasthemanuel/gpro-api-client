package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.NegoSignSponsorProfileResponseNegLogInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NegoSignSponsorProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NegoSignSponsorProfileResponse implements GetSponsorProfile200Response {

  private @Nullable String loadingDataState;

  private @Nullable Integer sponsorId;

  private @Nullable Integer canNegotiate;

  private @Nullable Integer groupsMatch;

  private @Nullable String originGroup;

  private @Nullable Integer maxNegotiations;

  private @Nullable String name;

  private @Nullable String webSite;

  private @Nullable String logoImg;

  private @Nullable String country;

  private @Nullable String countryCode;

  private @Nullable String category;

  private @Nullable Integer finances;

  private @Nullable Integer expectations;

  private @Nullable Integer patience;

  private @Nullable Integer reputation;

  private @Nullable Integer image;

  private @Nullable Integer negotiation;

  private @Nullable String negStatus;

  private @Nullable Integer inNegotiation;

  private @Nullable Integer contractActive;

  private @Nullable Integer canAcceptContract;

  private @Nullable Integer negProgress;

  private @Nullable String carSpot;

  private @Nullable Integer amount;

  private @Nullable Integer duration;

  private @Nullable Integer conHolderDuration;

  private @Nullable String negPriority;

  private @Nullable Integer satisfaction;

  private @Nullable String showQuestion;

  @Valid
  private List<@Valid NegoSignSponsorProfileResponseNegLogInner> negLog = new ArrayList<>();

  private @Nullable String estAvgProgress;

  private @Nullable String statusUpdate;

  private @Nullable String statusUpdateColor;

  private @Nullable Integer showConfirmCancel;

  private @Nullable Integer showAnswerConf;

  private @Nullable Integer updateInProgress;

  private @Nullable Integer raceInProgress;

  private @Nullable String errorMsg;

  private @Nullable Integer apiRequestsRemaining;

  public NegoSignSponsorProfileResponse loadingDataState(@Nullable String loadingDataState) {
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

  public NegoSignSponsorProfileResponse sponsorId(@Nullable Integer sponsorId) {
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

  public NegoSignSponsorProfileResponse canNegotiate(@Nullable Integer canNegotiate) {
    this.canNegotiate = canNegotiate;
    return this;
  }

  /**
   * Get canNegotiate
   * @return canNegotiate
   */
  
  @JsonProperty("canNegotiate")
  public @Nullable Integer getCanNegotiate() {
    return canNegotiate;
  }

  public void setCanNegotiate(@Nullable Integer canNegotiate) {
    this.canNegotiate = canNegotiate;
  }

  public NegoSignSponsorProfileResponse groupsMatch(@Nullable Integer groupsMatch) {
    this.groupsMatch = groupsMatch;
    return this;
  }

  /**
   * Get groupsMatch
   * @return groupsMatch
   */
  
  @JsonProperty("groupsMatch")
  public @Nullable Integer getGroupsMatch() {
    return groupsMatch;
  }

  public void setGroupsMatch(@Nullable Integer groupsMatch) {
    this.groupsMatch = groupsMatch;
  }

  public NegoSignSponsorProfileResponse originGroup(@Nullable String originGroup) {
    this.originGroup = originGroup;
    return this;
  }

  /**
   * Get originGroup
   * @return originGroup
   */
  
  @JsonProperty("originGroup")
  public @Nullable String getOriginGroup() {
    return originGroup;
  }

  public void setOriginGroup(@Nullable String originGroup) {
    this.originGroup = originGroup;
  }

  public NegoSignSponsorProfileResponse maxNegotiations(@Nullable Integer maxNegotiations) {
    this.maxNegotiations = maxNegotiations;
    return this;
  }

  /**
   * Get maxNegotiations
   * @return maxNegotiations
   */
  
  @JsonProperty("maxNegotiations")
  public @Nullable Integer getMaxNegotiations() {
    return maxNegotiations;
  }

  public void setMaxNegotiations(@Nullable Integer maxNegotiations) {
    this.maxNegotiations = maxNegotiations;
  }

  public NegoSignSponsorProfileResponse name(@Nullable String name) {
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

  public NegoSignSponsorProfileResponse webSite(@Nullable String webSite) {
    this.webSite = webSite;
    return this;
  }

  /**
   * Get webSite
   * @return webSite
   */
  
  @JsonProperty("webSite")
  public @Nullable String getWebSite() {
    return webSite;
  }

  public void setWebSite(@Nullable String webSite) {
    this.webSite = webSite;
  }

  public NegoSignSponsorProfileResponse logoImg(@Nullable String logoImg) {
    this.logoImg = logoImg;
    return this;
  }

  /**
   * Get logoImg
   * @return logoImg
   */
  
  @JsonProperty("logoImg")
  public @Nullable String getLogoImg() {
    return logoImg;
  }

  public void setLogoImg(@Nullable String logoImg) {
    this.logoImg = logoImg;
  }

  public NegoSignSponsorProfileResponse country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public NegoSignSponsorProfileResponse countryCode(@Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   */
  
  @JsonProperty("countryCode")
  public @Nullable String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@Nullable String countryCode) {
    this.countryCode = countryCode;
  }

  public NegoSignSponsorProfileResponse category(@Nullable String category) {
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

  public NegoSignSponsorProfileResponse finances(@Nullable Integer finances) {
    this.finances = finances;
    return this;
  }

  /**
   * * Scale goes from 0 to 6, representing values 1 to 7.   * Example: 0 => 1, 3 => 4 
   * @return finances
   */
  
  @JsonProperty("finances")
  public @Nullable Integer getFinances() {
    return finances;
  }

  public void setFinances(@Nullable Integer finances) {
    this.finances = finances;
  }

  public NegoSignSponsorProfileResponse expectations(@Nullable Integer expectations) {
    this.expectations = expectations;
    return this;
  }

  /**
   * * Scale goes from 0 to 6, representing values 1 to 7.   * Example: 0 => 1, 3 => 4 
   * @return expectations
   */
  
  @JsonProperty("expectations")
  public @Nullable Integer getExpectations() {
    return expectations;
  }

  public void setExpectations(@Nullable Integer expectations) {
    this.expectations = expectations;
  }

  public NegoSignSponsorProfileResponse patience(@Nullable Integer patience) {
    this.patience = patience;
    return this;
  }

  /**
   * * Scale goes from 0 to 6, representing values 1 to 7.   * Example: 0 => 1, 3 => 4 
   * @return patience
   */
  
  @JsonProperty("patience")
  public @Nullable Integer getPatience() {
    return patience;
  }

  public void setPatience(@Nullable Integer patience) {
    this.patience = patience;
  }

  public NegoSignSponsorProfileResponse reputation(@Nullable Integer reputation) {
    this.reputation = reputation;
    return this;
  }

  /**
   * * Scale goes from 0 to 6, representing values 1 to 7.   * Example: 0 => 1, 3 => 4 
   * @return reputation
   */
  
  @JsonProperty("reputation")
  public @Nullable Integer getReputation() {
    return reputation;
  }

  public void setReputation(@Nullable Integer reputation) {
    this.reputation = reputation;
  }

  public NegoSignSponsorProfileResponse image(@Nullable Integer image) {
    this.image = image;
    return this;
  }

  /**
   * * Scale goes from 0 to 6, representing values 1 to 7.   * Example: 0 => 1, 3 => 4 
   * @return image
   */
  
  @JsonProperty("image")
  public @Nullable Integer getImage() {
    return image;
  }

  public void setImage(@Nullable Integer image) {
    this.image = image;
  }

  public NegoSignSponsorProfileResponse negotiation(@Nullable Integer negotiation) {
    this.negotiation = negotiation;
    return this;
  }

  /**
   * * Scale goes from 0 to 6, representing values 1 to 7.   * Example: 0 => 1, 3 => 4 
   * @return negotiation
   */
  
  @JsonProperty("negotiation")
  public @Nullable Integer getNegotiation() {
    return negotiation;
  }

  public void setNegotiation(@Nullable Integer negotiation) {
    this.negotiation = negotiation;
  }

  public NegoSignSponsorProfileResponse negStatus(@Nullable String negStatus) {
    this.negStatus = negStatus;
    return this;
  }

  /**
   * Get negStatus
   * @return negStatus
   */
  
  @JsonProperty("negStatus")
  public @Nullable String getNegStatus() {
    return negStatus;
  }

  public void setNegStatus(@Nullable String negStatus) {
    this.negStatus = negStatus;
  }

  public NegoSignSponsorProfileResponse inNegotiation(@Nullable Integer inNegotiation) {
    this.inNegotiation = inNegotiation;
    return this;
  }

  /**
   * Get inNegotiation
   * @return inNegotiation
   */
  
  @JsonProperty("inNegotiation")
  public @Nullable Integer getInNegotiation() {
    return inNegotiation;
  }

  public void setInNegotiation(@Nullable Integer inNegotiation) {
    this.inNegotiation = inNegotiation;
  }

  public NegoSignSponsorProfileResponse contractActive(@Nullable Integer contractActive) {
    this.contractActive = contractActive;
    return this;
  }

  /**
   * Get contractActive
   * @return contractActive
   */
  
  @JsonProperty("contractActive")
  public @Nullable Integer getContractActive() {
    return contractActive;
  }

  public void setContractActive(@Nullable Integer contractActive) {
    this.contractActive = contractActive;
  }

  public NegoSignSponsorProfileResponse canAcceptContract(@Nullable Integer canAcceptContract) {
    this.canAcceptContract = canAcceptContract;
    return this;
  }

  /**
   * Get canAcceptContract
   * @return canAcceptContract
   */
  
  @JsonProperty("canAcceptContract")
  public @Nullable Integer getCanAcceptContract() {
    return canAcceptContract;
  }

  public void setCanAcceptContract(@Nullable Integer canAcceptContract) {
    this.canAcceptContract = canAcceptContract;
  }

  public NegoSignSponsorProfileResponse negProgress(@Nullable Integer negProgress) {
    this.negProgress = negProgress;
    return this;
  }

  /**
   * Get negProgress
   * @return negProgress
   */
  
  @JsonProperty("negProgress")
  public @Nullable Integer getNegProgress() {
    return negProgress;
  }

  public void setNegProgress(@Nullable Integer negProgress) {
    this.negProgress = negProgress;
  }

  public NegoSignSponsorProfileResponse carSpot(@Nullable String carSpot) {
    this.carSpot = carSpot;
    return this;
  }

  /**
   * Get carSpot
   * @return carSpot
   */
  
  @JsonProperty("carSpot")
  public @Nullable String getCarSpot() {
    return carSpot;
  }

  public void setCarSpot(@Nullable String carSpot) {
    this.carSpot = carSpot;
  }

  public NegoSignSponsorProfileResponse amount(@Nullable Integer amount) {
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

  public NegoSignSponsorProfileResponse duration(@Nullable Integer duration) {
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

  public NegoSignSponsorProfileResponse conHolderDuration(@Nullable Integer conHolderDuration) {
    this.conHolderDuration = conHolderDuration;
    return this;
  }

  /**
   * Get conHolderDuration
   * @return conHolderDuration
   */
  
  @JsonProperty("conHolderDuration")
  public @Nullable Integer getConHolderDuration() {
    return conHolderDuration;
  }

  public void setConHolderDuration(@Nullable Integer conHolderDuration) {
    this.conHolderDuration = conHolderDuration;
  }

  public NegoSignSponsorProfileResponse negPriority(@Nullable String negPriority) {
    this.negPriority = negPriority;
    return this;
  }

  /**
   * Get negPriority
   * @return negPriority
   */
  
  @JsonProperty("negPriority")
  public @Nullable String getNegPriority() {
    return negPriority;
  }

  public void setNegPriority(@Nullable String negPriority) {
    this.negPriority = negPriority;
  }

  public NegoSignSponsorProfileResponse satisfaction(@Nullable Integer satisfaction) {
    this.satisfaction = satisfaction;
    return this;
  }

  /**
   * Get satisfaction
   * @return satisfaction
   */
  
  @JsonProperty("satisfaction")
  public @Nullable Integer getSatisfaction() {
    return satisfaction;
  }

  public void setSatisfaction(@Nullable Integer satisfaction) {
    this.satisfaction = satisfaction;
  }

  public NegoSignSponsorProfileResponse showQuestion(@Nullable String showQuestion) {
    this.showQuestion = showQuestion;
    return this;
  }

  /**
   * Get showQuestion
   * @return showQuestion
   */
  
  @JsonProperty("showQuestion")
  public @Nullable String getShowQuestion() {
    return showQuestion;
  }

  public void setShowQuestion(@Nullable String showQuestion) {
    this.showQuestion = showQuestion;
  }

  public NegoSignSponsorProfileResponse negLog(List<@Valid NegoSignSponsorProfileResponseNegLogInner> negLog) {
    this.negLog = negLog;
    return this;
  }

  public NegoSignSponsorProfileResponse addNegLogItem(NegoSignSponsorProfileResponseNegLogInner negLogItem) {
    if (this.negLog == null) {
      this.negLog = new ArrayList<>();
    }
    this.negLog.add(negLogItem);
    return this;
  }

  /**
   * Get negLog
   * @return negLog
   */
  @Valid 
  @JsonProperty("negLog")
  public List<@Valid NegoSignSponsorProfileResponseNegLogInner> getNegLog() {
    return negLog;
  }

  public void setNegLog(List<@Valid NegoSignSponsorProfileResponseNegLogInner> negLog) {
    this.negLog = negLog;
  }

  public NegoSignSponsorProfileResponse estAvgProgress(@Nullable String estAvgProgress) {
    this.estAvgProgress = estAvgProgress;
    return this;
  }

  /**
   * Get estAvgProgress
   * @return estAvgProgress
   */
  
  @JsonProperty("estAvgProgress")
  public @Nullable String getEstAvgProgress() {
    return estAvgProgress;
  }

  public void setEstAvgProgress(@Nullable String estAvgProgress) {
    this.estAvgProgress = estAvgProgress;
  }

  public NegoSignSponsorProfileResponse statusUpdate(@Nullable String statusUpdate) {
    this.statusUpdate = statusUpdate;
    return this;
  }

  /**
   * Get statusUpdate
   * @return statusUpdate
   */
  
  @JsonProperty("statusUpdate")
  public @Nullable String getStatusUpdate() {
    return statusUpdate;
  }

  public void setStatusUpdate(@Nullable String statusUpdate) {
    this.statusUpdate = statusUpdate;
  }

  public NegoSignSponsorProfileResponse statusUpdateColor(@Nullable String statusUpdateColor) {
    this.statusUpdateColor = statusUpdateColor;
    return this;
  }

  /**
   * Get statusUpdateColor
   * @return statusUpdateColor
   */
  
  @JsonProperty("statusUpdateColor")
  public @Nullable String getStatusUpdateColor() {
    return statusUpdateColor;
  }

  public void setStatusUpdateColor(@Nullable String statusUpdateColor) {
    this.statusUpdateColor = statusUpdateColor;
  }

  public NegoSignSponsorProfileResponse showConfirmCancel(@Nullable Integer showConfirmCancel) {
    this.showConfirmCancel = showConfirmCancel;
    return this;
  }

  /**
   * Get showConfirmCancel
   * @return showConfirmCancel
   */
  
  @JsonProperty("showConfirmCancel")
  public @Nullable Integer getShowConfirmCancel() {
    return showConfirmCancel;
  }

  public void setShowConfirmCancel(@Nullable Integer showConfirmCancel) {
    this.showConfirmCancel = showConfirmCancel;
  }

  public NegoSignSponsorProfileResponse showAnswerConf(@Nullable Integer showAnswerConf) {
    this.showAnswerConf = showAnswerConf;
    return this;
  }

  /**
   * Get showAnswerConf
   * @return showAnswerConf
   */
  
  @JsonProperty("showAnswerConf")
  public @Nullable Integer getShowAnswerConf() {
    return showAnswerConf;
  }

  public void setShowAnswerConf(@Nullable Integer showAnswerConf) {
    this.showAnswerConf = showAnswerConf;
  }

  public NegoSignSponsorProfileResponse updateInProgress(@Nullable Integer updateInProgress) {
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

  public NegoSignSponsorProfileResponse raceInProgress(@Nullable Integer raceInProgress) {
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

  public NegoSignSponsorProfileResponse errorMsg(@Nullable String errorMsg) {
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

  public NegoSignSponsorProfileResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    NegoSignSponsorProfileResponse negoSignSponsorProfileResponse = (NegoSignSponsorProfileResponse) o;
    return Objects.equals(this.loadingDataState, negoSignSponsorProfileResponse.loadingDataState) &&
        Objects.equals(this.sponsorId, negoSignSponsorProfileResponse.sponsorId) &&
        Objects.equals(this.canNegotiate, negoSignSponsorProfileResponse.canNegotiate) &&
        Objects.equals(this.groupsMatch, negoSignSponsorProfileResponse.groupsMatch) &&
        Objects.equals(this.originGroup, negoSignSponsorProfileResponse.originGroup) &&
        Objects.equals(this.maxNegotiations, negoSignSponsorProfileResponse.maxNegotiations) &&
        Objects.equals(this.name, negoSignSponsorProfileResponse.name) &&
        Objects.equals(this.webSite, negoSignSponsorProfileResponse.webSite) &&
        Objects.equals(this.logoImg, negoSignSponsorProfileResponse.logoImg) &&
        Objects.equals(this.country, negoSignSponsorProfileResponse.country) &&
        Objects.equals(this.countryCode, negoSignSponsorProfileResponse.countryCode) &&
        Objects.equals(this.category, negoSignSponsorProfileResponse.category) &&
        Objects.equals(this.finances, negoSignSponsorProfileResponse.finances) &&
        Objects.equals(this.expectations, negoSignSponsorProfileResponse.expectations) &&
        Objects.equals(this.patience, negoSignSponsorProfileResponse.patience) &&
        Objects.equals(this.reputation, negoSignSponsorProfileResponse.reputation) &&
        Objects.equals(this.image, negoSignSponsorProfileResponse.image) &&
        Objects.equals(this.negotiation, negoSignSponsorProfileResponse.negotiation) &&
        Objects.equals(this.negStatus, negoSignSponsorProfileResponse.negStatus) &&
        Objects.equals(this.inNegotiation, negoSignSponsorProfileResponse.inNegotiation) &&
        Objects.equals(this.contractActive, negoSignSponsorProfileResponse.contractActive) &&
        Objects.equals(this.canAcceptContract, negoSignSponsorProfileResponse.canAcceptContract) &&
        Objects.equals(this.negProgress, negoSignSponsorProfileResponse.negProgress) &&
        Objects.equals(this.carSpot, negoSignSponsorProfileResponse.carSpot) &&
        Objects.equals(this.amount, negoSignSponsorProfileResponse.amount) &&
        Objects.equals(this.duration, negoSignSponsorProfileResponse.duration) &&
        Objects.equals(this.conHolderDuration, negoSignSponsorProfileResponse.conHolderDuration) &&
        Objects.equals(this.negPriority, negoSignSponsorProfileResponse.negPriority) &&
        Objects.equals(this.satisfaction, negoSignSponsorProfileResponse.satisfaction) &&
        Objects.equals(this.showQuestion, negoSignSponsorProfileResponse.showQuestion) &&
        Objects.equals(this.negLog, negoSignSponsorProfileResponse.negLog) &&
        Objects.equals(this.estAvgProgress, negoSignSponsorProfileResponse.estAvgProgress) &&
        Objects.equals(this.statusUpdate, negoSignSponsorProfileResponse.statusUpdate) &&
        Objects.equals(this.statusUpdateColor, negoSignSponsorProfileResponse.statusUpdateColor) &&
        Objects.equals(this.showConfirmCancel, negoSignSponsorProfileResponse.showConfirmCancel) &&
        Objects.equals(this.showAnswerConf, negoSignSponsorProfileResponse.showAnswerConf) &&
        Objects.equals(this.updateInProgress, negoSignSponsorProfileResponse.updateInProgress) &&
        Objects.equals(this.raceInProgress, negoSignSponsorProfileResponse.raceInProgress) &&
        Objects.equals(this.errorMsg, negoSignSponsorProfileResponse.errorMsg) &&
        Objects.equals(this.apiRequestsRemaining, negoSignSponsorProfileResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, sponsorId, canNegotiate, groupsMatch, originGroup, maxNegotiations, name, webSite, logoImg, country, countryCode, category, finances, expectations, patience, reputation, image, negotiation, negStatus, inNegotiation, contractActive, canAcceptContract, negProgress, carSpot, amount, duration, conHolderDuration, negPriority, satisfaction, showQuestion, negLog, estAvgProgress, statusUpdate, statusUpdateColor, showConfirmCancel, showAnswerConf, updateInProgress, raceInProgress, errorMsg, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegoSignSponsorProfileResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
    sb.append("    canNegotiate: ").append(toIndentedString(canNegotiate)).append("\n");
    sb.append("    groupsMatch: ").append(toIndentedString(groupsMatch)).append("\n");
    sb.append("    originGroup: ").append(toIndentedString(originGroup)).append("\n");
    sb.append("    maxNegotiations: ").append(toIndentedString(maxNegotiations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    webSite: ").append(toIndentedString(webSite)).append("\n");
    sb.append("    logoImg: ").append(toIndentedString(logoImg)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    finances: ").append(toIndentedString(finances)).append("\n");
    sb.append("    expectations: ").append(toIndentedString(expectations)).append("\n");
    sb.append("    patience: ").append(toIndentedString(patience)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    negotiation: ").append(toIndentedString(negotiation)).append("\n");
    sb.append("    negStatus: ").append(toIndentedString(negStatus)).append("\n");
    sb.append("    inNegotiation: ").append(toIndentedString(inNegotiation)).append("\n");
    sb.append("    contractActive: ").append(toIndentedString(contractActive)).append("\n");
    sb.append("    canAcceptContract: ").append(toIndentedString(canAcceptContract)).append("\n");
    sb.append("    negProgress: ").append(toIndentedString(negProgress)).append("\n");
    sb.append("    carSpot: ").append(toIndentedString(carSpot)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    conHolderDuration: ").append(toIndentedString(conHolderDuration)).append("\n");
    sb.append("    negPriority: ").append(toIndentedString(negPriority)).append("\n");
    sb.append("    satisfaction: ").append(toIndentedString(satisfaction)).append("\n");
    sb.append("    showQuestion: ").append(toIndentedString(showQuestion)).append("\n");
    sb.append("    negLog: ").append(toIndentedString(negLog)).append("\n");
    sb.append("    estAvgProgress: ").append(toIndentedString(estAvgProgress)).append("\n");
    sb.append("    statusUpdate: ").append(toIndentedString(statusUpdate)).append("\n");
    sb.append("    statusUpdateColor: ").append(toIndentedString(statusUpdateColor)).append("\n");
    sb.append("    showConfirmCancel: ").append(toIndentedString(showConfirmCancel)).append("\n");
    sb.append("    showAnswerConf: ").append(toIndentedString(showAnswerConf)).append("\n");
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

