package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.DriverProfileResponseOffersFromInner;
import org.jlobato.gpro.proxy.model.DriverProfileResponseOwner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TDProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TDProfileResponse {

  private @Nullable String loadingDataState;

  private @Nullable String showConfirmDismiss;

  private @Nullable String tdName;

  private @Nullable Integer cash;

  private @Nullable String natCode;

  private @Nullable String natName;

  private @Nullable String face;

  private @Nullable String faceImg;

  private @Nullable Integer trophies;

  private @Nullable Integer races;

  private @Nullable Integer wins;

  private @Nullable Integer overall;

  private @Nullable Integer leadership;

  private @Nullable Integer mechanics;

  private @Nullable Integer electronics;

  private @Nullable Integer experience;

  private @Nullable Integer experienceCapped;

  private @Nullable Integer aerodynamics;

  private @Nullable Integer pitCoord;

  private @Nullable Integer motivation;

  private @Nullable Integer age;

  private @Nullable Integer retiring;

  private @Nullable Integer ptsBonus;

  private @Nullable Integer podBonus;

  private @Nullable Integer winBonus;

  private @Nullable Integer trophyBonus;

  private @Nullable String segmentSelected;

  private @Nullable Integer ownTD;

  private @Nullable Integer available;

  private @Nullable DriverProfileResponseOwner owner;

  private @Nullable String salary;

  private @Nullable String racesLeft;

  private @Nullable String errorMsg;

  private @Nullable Integer canMakeOffer;

  private @Nullable String setOfferType;

  private @Nullable Integer setSalary;

  private @Nullable Integer setSignFee;

  private @Nullable Integer setBonusWin;

  private @Nullable Integer setBonusPod;

  private @Nullable Integer setBonusPts;

  private @Nullable Integer setBonusChamp;

  private @Nullable String setRaces;

  private @Nullable Integer canOfferPrivate;

  private @Nullable Integer canOfferTrophyBonus;

  private @Nullable Integer offerCost;

  private @Nullable Integer semiOfferCost;

  private @Nullable Integer privateOfferCost;

  private @Nullable Integer offerCostToSet;

  private @Nullable Integer nextPriceIncrementIn;

  private @Nullable Integer offerPlaced;

  private @Nullable Integer inShortList;

  private @Nullable Integer totalOffers;

  @Valid
  private List<@Valid DriverProfileResponseOffersFromInner> offersFrom = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public TDProfileResponse loadingDataState(@Nullable String loadingDataState) {
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

  public TDProfileResponse showConfirmDismiss(@Nullable String showConfirmDismiss) {
    this.showConfirmDismiss = showConfirmDismiss;
    return this;
  }

  /**
   * Get showConfirmDismiss
   * @return showConfirmDismiss
   */
  
  @JsonProperty("showConfirmDismiss")
  public @Nullable String getShowConfirmDismiss() {
    return showConfirmDismiss;
  }

  public void setShowConfirmDismiss(@Nullable String showConfirmDismiss) {
    this.showConfirmDismiss = showConfirmDismiss;
  }

  public TDProfileResponse tdName(@Nullable String tdName) {
    this.tdName = tdName;
    return this;
  }

  /**
   * Get tdName
   * @return tdName
   */
  
  @JsonProperty("tdName")
  public @Nullable String getTdName() {
    return tdName;
  }

  public void setTdName(@Nullable String tdName) {
    this.tdName = tdName;
  }

  public TDProfileResponse cash(@Nullable Integer cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Get cash
   * @return cash
   */
  
  @JsonProperty("cash")
  public @Nullable Integer getCash() {
    return cash;
  }

  public void setCash(@Nullable Integer cash) {
    this.cash = cash;
  }

  public TDProfileResponse natCode(@Nullable String natCode) {
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

  public TDProfileResponse natName(@Nullable String natName) {
    this.natName = natName;
    return this;
  }

  /**
   * Get natName
   * @return natName
   */
  
  @JsonProperty("natName")
  public @Nullable String getNatName() {
    return natName;
  }

  public void setNatName(@Nullable String natName) {
    this.natName = natName;
  }

  public TDProfileResponse face(@Nullable String face) {
    this.face = face;
    return this;
  }

  /**
   * Get face
   * @return face
   */
  
  @JsonProperty("face")
  public @Nullable String getFace() {
    return face;
  }

  public void setFace(@Nullable String face) {
    this.face = face;
  }

  public TDProfileResponse faceImg(@Nullable String faceImg) {
    this.faceImg = faceImg;
    return this;
  }

  /**
   * Get faceImg
   * @return faceImg
   */
  
  @JsonProperty("faceImg")
  public @Nullable String getFaceImg() {
    return faceImg;
  }

  public void setFaceImg(@Nullable String faceImg) {
    this.faceImg = faceImg;
  }

  public TDProfileResponse trophies(@Nullable Integer trophies) {
    this.trophies = trophies;
    return this;
  }

  /**
   * Get trophies
   * @return trophies
   */
  
  @JsonProperty("trophies")
  public @Nullable Integer getTrophies() {
    return trophies;
  }

  public void setTrophies(@Nullable Integer trophies) {
    this.trophies = trophies;
  }

  public TDProfileResponse races(@Nullable Integer races) {
    this.races = races;
    return this;
  }

  /**
   * Get races
   * @return races
   */
  
  @JsonProperty("races")
  public @Nullable Integer getRaces() {
    return races;
  }

  public void setRaces(@Nullable Integer races) {
    this.races = races;
  }

  public TDProfileResponse wins(@Nullable Integer wins) {
    this.wins = wins;
    return this;
  }

  /**
   * Get wins
   * @return wins
   */
  
  @JsonProperty("wins")
  public @Nullable Integer getWins() {
    return wins;
  }

  public void setWins(@Nullable Integer wins) {
    this.wins = wins;
  }

  public TDProfileResponse overall(@Nullable Integer overall) {
    this.overall = overall;
    return this;
  }

  /**
   * Get overall
   * @return overall
   */
  
  @JsonProperty("overall")
  public @Nullable Integer getOverall() {
    return overall;
  }

  public void setOverall(@Nullable Integer overall) {
    this.overall = overall;
  }

  public TDProfileResponse leadership(@Nullable Integer leadership) {
    this.leadership = leadership;
    return this;
  }

  /**
   * Get leadership
   * @return leadership
   */
  
  @JsonProperty("leadership")
  public @Nullable Integer getLeadership() {
    return leadership;
  }

  public void setLeadership(@Nullable Integer leadership) {
    this.leadership = leadership;
  }

  public TDProfileResponse mechanics(@Nullable Integer mechanics) {
    this.mechanics = mechanics;
    return this;
  }

  /**
   * Get mechanics
   * @return mechanics
   */
  
  @JsonProperty("mechanics")
  public @Nullable Integer getMechanics() {
    return mechanics;
  }

  public void setMechanics(@Nullable Integer mechanics) {
    this.mechanics = mechanics;
  }

  public TDProfileResponse electronics(@Nullable Integer electronics) {
    this.electronics = electronics;
    return this;
  }

  /**
   * Get electronics
   * @return electronics
   */
  
  @JsonProperty("electronics")
  public @Nullable Integer getElectronics() {
    return electronics;
  }

  public void setElectronics(@Nullable Integer electronics) {
    this.electronics = electronics;
  }

  public TDProfileResponse experience(@Nullable Integer experience) {
    this.experience = experience;
    return this;
  }

  /**
   * Get experience
   * @return experience
   */
  
  @JsonProperty("experience")
  public @Nullable Integer getExperience() {
    return experience;
  }

  public void setExperience(@Nullable Integer experience) {
    this.experience = experience;
  }

  public TDProfileResponse experienceCapped(@Nullable Integer experienceCapped) {
    this.experienceCapped = experienceCapped;
    return this;
  }

  /**
   * Get experienceCapped
   * @return experienceCapped
   */
  
  @JsonProperty("experienceCapped")
  public @Nullable Integer getExperienceCapped() {
    return experienceCapped;
  }

  public void setExperienceCapped(@Nullable Integer experienceCapped) {
    this.experienceCapped = experienceCapped;
  }

  public TDProfileResponse aerodynamics(@Nullable Integer aerodynamics) {
    this.aerodynamics = aerodynamics;
    return this;
  }

  /**
   * Get aerodynamics
   * @return aerodynamics
   */
  
  @JsonProperty("aerodynamics")
  public @Nullable Integer getAerodynamics() {
    return aerodynamics;
  }

  public void setAerodynamics(@Nullable Integer aerodynamics) {
    this.aerodynamics = aerodynamics;
  }

  public TDProfileResponse pitCoord(@Nullable Integer pitCoord) {
    this.pitCoord = pitCoord;
    return this;
  }

  /**
   * Get pitCoord
   * @return pitCoord
   */
  
  @JsonProperty("pitCoord")
  public @Nullable Integer getPitCoord() {
    return pitCoord;
  }

  public void setPitCoord(@Nullable Integer pitCoord) {
    this.pitCoord = pitCoord;
  }

  public TDProfileResponse motivation(@Nullable Integer motivation) {
    this.motivation = motivation;
    return this;
  }

  /**
   * Get motivation
   * @return motivation
   */
  
  @JsonProperty("motivation")
  public @Nullable Integer getMotivation() {
    return motivation;
  }

  public void setMotivation(@Nullable Integer motivation) {
    this.motivation = motivation;
  }

  public TDProfileResponse age(@Nullable Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   */
  
  @JsonProperty("age")
  public @Nullable Integer getAge() {
    return age;
  }

  public void setAge(@Nullable Integer age) {
    this.age = age;
  }

  public TDProfileResponse retiring(@Nullable Integer retiring) {
    this.retiring = retiring;
    return this;
  }

  /**
   * Get retiring
   * @return retiring
   */
  
  @JsonProperty("retiring")
  public @Nullable Integer getRetiring() {
    return retiring;
  }

  public void setRetiring(@Nullable Integer retiring) {
    this.retiring = retiring;
  }

  public TDProfileResponse ptsBonus(@Nullable Integer ptsBonus) {
    this.ptsBonus = ptsBonus;
    return this;
  }

  /**
   * Get ptsBonus
   * @return ptsBonus
   */
  
  @JsonProperty("ptsBonus")
  public @Nullable Integer getPtsBonus() {
    return ptsBonus;
  }

  public void setPtsBonus(@Nullable Integer ptsBonus) {
    this.ptsBonus = ptsBonus;
  }

  public TDProfileResponse podBonus(@Nullable Integer podBonus) {
    this.podBonus = podBonus;
    return this;
  }

  /**
   * Get podBonus
   * @return podBonus
   */
  
  @JsonProperty("podBonus")
  public @Nullable Integer getPodBonus() {
    return podBonus;
  }

  public void setPodBonus(@Nullable Integer podBonus) {
    this.podBonus = podBonus;
  }

  public TDProfileResponse winBonus(@Nullable Integer winBonus) {
    this.winBonus = winBonus;
    return this;
  }

  /**
   * Get winBonus
   * @return winBonus
   */
  
  @JsonProperty("winBonus")
  public @Nullable Integer getWinBonus() {
    return winBonus;
  }

  public void setWinBonus(@Nullable Integer winBonus) {
    this.winBonus = winBonus;
  }

  public TDProfileResponse trophyBonus(@Nullable Integer trophyBonus) {
    this.trophyBonus = trophyBonus;
    return this;
  }

  /**
   * Get trophyBonus
   * @return trophyBonus
   */
  
  @JsonProperty("trophyBonus")
  public @Nullable Integer getTrophyBonus() {
    return trophyBonus;
  }

  public void setTrophyBonus(@Nullable Integer trophyBonus) {
    this.trophyBonus = trophyBonus;
  }

  public TDProfileResponse segmentSelected(@Nullable String segmentSelected) {
    this.segmentSelected = segmentSelected;
    return this;
  }

  /**
   * Get segmentSelected
   * @return segmentSelected
   */
  
  @JsonProperty("segmentSelected")
  public @Nullable String getSegmentSelected() {
    return segmentSelected;
  }

  public void setSegmentSelected(@Nullable String segmentSelected) {
    this.segmentSelected = segmentSelected;
  }

  public TDProfileResponse ownTD(@Nullable Integer ownTD) {
    this.ownTD = ownTD;
    return this;
  }

  /**
   * Get ownTD
   * @return ownTD
   */
  
  @JsonProperty("ownTD")
  public @Nullable Integer getOwnTD() {
    return ownTD;
  }

  public void setOwnTD(@Nullable Integer ownTD) {
    this.ownTD = ownTD;
  }

  public TDProfileResponse available(@Nullable Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
   */
  
  @JsonProperty("available")
  public @Nullable Integer getAvailable() {
    return available;
  }

  public void setAvailable(@Nullable Integer available) {
    this.available = available;
  }

  public TDProfileResponse owner(@Nullable DriverProfileResponseOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @JsonProperty("owner")
  public @Nullable DriverProfileResponseOwner getOwner() {
    return owner;
  }

  public void setOwner(@Nullable DriverProfileResponseOwner owner) {
    this.owner = owner;
  }

  public TDProfileResponse salary(@Nullable String salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   */
  
  @JsonProperty("salary")
  public @Nullable String getSalary() {
    return salary;
  }

  public void setSalary(@Nullable String salary) {
    this.salary = salary;
  }

  public TDProfileResponse racesLeft(@Nullable String racesLeft) {
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

  public TDProfileResponse errorMsg(@Nullable String errorMsg) {
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

  public TDProfileResponse canMakeOffer(@Nullable Integer canMakeOffer) {
    this.canMakeOffer = canMakeOffer;
    return this;
  }

  /**
   * Get canMakeOffer
   * @return canMakeOffer
   */
  
  @JsonProperty("canMakeOffer")
  public @Nullable Integer getCanMakeOffer() {
    return canMakeOffer;
  }

  public void setCanMakeOffer(@Nullable Integer canMakeOffer) {
    this.canMakeOffer = canMakeOffer;
  }

  public TDProfileResponse setOfferType(@Nullable String setOfferType) {
    this.setOfferType = setOfferType;
    return this;
  }

  /**
   * Get setOfferType
   * @return setOfferType
   */
  
  @JsonProperty("setOfferType")
  public @Nullable String getSetOfferType() {
    return setOfferType;
  }

  public void setSetOfferType(@Nullable String setOfferType) {
    this.setOfferType = setOfferType;
  }

  public TDProfileResponse setSalary(@Nullable Integer setSalary) {
    this.setSalary = setSalary;
    return this;
  }

  /**
   * Get setSalary
   * @return setSalary
   */
  
  @JsonProperty("setSalary")
  public @Nullable Integer getSetSalary() {
    return setSalary;
  }

  public void setSetSalary(@Nullable Integer setSalary) {
    this.setSalary = setSalary;
  }

  public TDProfileResponse setSignFee(@Nullable Integer setSignFee) {
    this.setSignFee = setSignFee;
    return this;
  }

  /**
   * Get setSignFee
   * @return setSignFee
   */
  
  @JsonProperty("setSignFee")
  public @Nullable Integer getSetSignFee() {
    return setSignFee;
  }

  public void setSetSignFee(@Nullable Integer setSignFee) {
    this.setSignFee = setSignFee;
  }

  public TDProfileResponse setBonusWin(@Nullable Integer setBonusWin) {
    this.setBonusWin = setBonusWin;
    return this;
  }

  /**
   * Get setBonusWin
   * @return setBonusWin
   */
  
  @JsonProperty("setBonusWin")
  public @Nullable Integer getSetBonusWin() {
    return setBonusWin;
  }

  public void setSetBonusWin(@Nullable Integer setBonusWin) {
    this.setBonusWin = setBonusWin;
  }

  public TDProfileResponse setBonusPod(@Nullable Integer setBonusPod) {
    this.setBonusPod = setBonusPod;
    return this;
  }

  /**
   * Get setBonusPod
   * @return setBonusPod
   */
  
  @JsonProperty("setBonusPod")
  public @Nullable Integer getSetBonusPod() {
    return setBonusPod;
  }

  public void setSetBonusPod(@Nullable Integer setBonusPod) {
    this.setBonusPod = setBonusPod;
  }

  public TDProfileResponse setBonusPts(@Nullable Integer setBonusPts) {
    this.setBonusPts = setBonusPts;
    return this;
  }

  /**
   * Get setBonusPts
   * @return setBonusPts
   */
  
  @JsonProperty("setBonusPts")
  public @Nullable Integer getSetBonusPts() {
    return setBonusPts;
  }

  public void setSetBonusPts(@Nullable Integer setBonusPts) {
    this.setBonusPts = setBonusPts;
  }

  public TDProfileResponse setBonusChamp(@Nullable Integer setBonusChamp) {
    this.setBonusChamp = setBonusChamp;
    return this;
  }

  /**
   * Get setBonusChamp
   * @return setBonusChamp
   */
  
  @JsonProperty("setBonusChamp")
  public @Nullable Integer getSetBonusChamp() {
    return setBonusChamp;
  }

  public void setSetBonusChamp(@Nullable Integer setBonusChamp) {
    this.setBonusChamp = setBonusChamp;
  }

  public TDProfileResponse setRaces(@Nullable String setRaces) {
    this.setRaces = setRaces;
    return this;
  }

  /**
   * Get setRaces
   * @return setRaces
   */
  
  @JsonProperty("setRaces")
  public @Nullable String getSetRaces() {
    return setRaces;
  }

  public void setSetRaces(@Nullable String setRaces) {
    this.setRaces = setRaces;
  }

  public TDProfileResponse canOfferPrivate(@Nullable Integer canOfferPrivate) {
    this.canOfferPrivate = canOfferPrivate;
    return this;
  }

  /**
   * Get canOfferPrivate
   * @return canOfferPrivate
   */
  
  @JsonProperty("canOfferPrivate")
  public @Nullable Integer getCanOfferPrivate() {
    return canOfferPrivate;
  }

  public void setCanOfferPrivate(@Nullable Integer canOfferPrivate) {
    this.canOfferPrivate = canOfferPrivate;
  }

  public TDProfileResponse canOfferTrophyBonus(@Nullable Integer canOfferTrophyBonus) {
    this.canOfferTrophyBonus = canOfferTrophyBonus;
    return this;
  }

  /**
   * Get canOfferTrophyBonus
   * @return canOfferTrophyBonus
   */
  
  @JsonProperty("canOfferTrophyBonus")
  public @Nullable Integer getCanOfferTrophyBonus() {
    return canOfferTrophyBonus;
  }

  public void setCanOfferTrophyBonus(@Nullable Integer canOfferTrophyBonus) {
    this.canOfferTrophyBonus = canOfferTrophyBonus;
  }

  public TDProfileResponse offerCost(@Nullable Integer offerCost) {
    this.offerCost = offerCost;
    return this;
  }

  /**
   * Get offerCost
   * @return offerCost
   */
  
  @JsonProperty("offerCost")
  public @Nullable Integer getOfferCost() {
    return offerCost;
  }

  public void setOfferCost(@Nullable Integer offerCost) {
    this.offerCost = offerCost;
  }

  public TDProfileResponse semiOfferCost(@Nullable Integer semiOfferCost) {
    this.semiOfferCost = semiOfferCost;
    return this;
  }

  /**
   * Get semiOfferCost
   * @return semiOfferCost
   */
  
  @JsonProperty("semiOfferCost")
  public @Nullable Integer getSemiOfferCost() {
    return semiOfferCost;
  }

  public void setSemiOfferCost(@Nullable Integer semiOfferCost) {
    this.semiOfferCost = semiOfferCost;
  }

  public TDProfileResponse privateOfferCost(@Nullable Integer privateOfferCost) {
    this.privateOfferCost = privateOfferCost;
    return this;
  }

  /**
   * Get privateOfferCost
   * @return privateOfferCost
   */
  
  @JsonProperty("privateOfferCost")
  public @Nullable Integer getPrivateOfferCost() {
    return privateOfferCost;
  }

  public void setPrivateOfferCost(@Nullable Integer privateOfferCost) {
    this.privateOfferCost = privateOfferCost;
  }

  public TDProfileResponse offerCostToSet(@Nullable Integer offerCostToSet) {
    this.offerCostToSet = offerCostToSet;
    return this;
  }

  /**
   * Get offerCostToSet
   * @return offerCostToSet
   */
  
  @JsonProperty("offerCostToSet")
  public @Nullable Integer getOfferCostToSet() {
    return offerCostToSet;
  }

  public void setOfferCostToSet(@Nullable Integer offerCostToSet) {
    this.offerCostToSet = offerCostToSet;
  }

  public TDProfileResponse nextPriceIncrementIn(@Nullable Integer nextPriceIncrementIn) {
    this.nextPriceIncrementIn = nextPriceIncrementIn;
    return this;
  }

  /**
   * Get nextPriceIncrementIn
   * @return nextPriceIncrementIn
   */
  
  @JsonProperty("nextPriceIncrementIn")
  public @Nullable Integer getNextPriceIncrementIn() {
    return nextPriceIncrementIn;
  }

  public void setNextPriceIncrementIn(@Nullable Integer nextPriceIncrementIn) {
    this.nextPriceIncrementIn = nextPriceIncrementIn;
  }

  public TDProfileResponse offerPlaced(@Nullable Integer offerPlaced) {
    this.offerPlaced = offerPlaced;
    return this;
  }

  /**
   * Get offerPlaced
   * @return offerPlaced
   */
  
  @JsonProperty("offerPlaced")
  public @Nullable Integer getOfferPlaced() {
    return offerPlaced;
  }

  public void setOfferPlaced(@Nullable Integer offerPlaced) {
    this.offerPlaced = offerPlaced;
  }

  public TDProfileResponse inShortList(@Nullable Integer inShortList) {
    this.inShortList = inShortList;
    return this;
  }

  /**
   * Get inShortList
   * @return inShortList
   */
  
  @JsonProperty("inShortList")
  public @Nullable Integer getInShortList() {
    return inShortList;
  }

  public void setInShortList(@Nullable Integer inShortList) {
    this.inShortList = inShortList;
  }

  public TDProfileResponse totalOffers(@Nullable Integer totalOffers) {
    this.totalOffers = totalOffers;
    return this;
  }

  /**
   * Get totalOffers
   * @return totalOffers
   */
  
  @JsonProperty("totalOffers")
  public @Nullable Integer getTotalOffers() {
    return totalOffers;
  }

  public void setTotalOffers(@Nullable Integer totalOffers) {
    this.totalOffers = totalOffers;
  }

  public TDProfileResponse offersFrom(List<@Valid DriverProfileResponseOffersFromInner> offersFrom) {
    this.offersFrom = offersFrom;
    return this;
  }

  public TDProfileResponse addOffersFromItem(DriverProfileResponseOffersFromInner offersFromItem) {
    if (this.offersFrom == null) {
      this.offersFrom = new ArrayList<>();
    }
    this.offersFrom.add(offersFromItem);
    return this;
  }

  /**
   * Get offersFrom
   * @return offersFrom
   */
  @Valid 
  @JsonProperty("offersFrom")
  public List<@Valid DriverProfileResponseOffersFromInner> getOffersFrom() {
    return offersFrom;
  }

  public void setOffersFrom(List<@Valid DriverProfileResponseOffersFromInner> offersFrom) {
    this.offersFrom = offersFrom;
  }

  public TDProfileResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    TDProfileResponse tdProfileResponse = (TDProfileResponse) o;
    return Objects.equals(this.loadingDataState, tdProfileResponse.loadingDataState) &&
        Objects.equals(this.showConfirmDismiss, tdProfileResponse.showConfirmDismiss) &&
        Objects.equals(this.tdName, tdProfileResponse.tdName) &&
        Objects.equals(this.cash, tdProfileResponse.cash) &&
        Objects.equals(this.natCode, tdProfileResponse.natCode) &&
        Objects.equals(this.natName, tdProfileResponse.natName) &&
        Objects.equals(this.face, tdProfileResponse.face) &&
        Objects.equals(this.faceImg, tdProfileResponse.faceImg) &&
        Objects.equals(this.trophies, tdProfileResponse.trophies) &&
        Objects.equals(this.races, tdProfileResponse.races) &&
        Objects.equals(this.wins, tdProfileResponse.wins) &&
        Objects.equals(this.overall, tdProfileResponse.overall) &&
        Objects.equals(this.leadership, tdProfileResponse.leadership) &&
        Objects.equals(this.mechanics, tdProfileResponse.mechanics) &&
        Objects.equals(this.electronics, tdProfileResponse.electronics) &&
        Objects.equals(this.experience, tdProfileResponse.experience) &&
        Objects.equals(this.experienceCapped, tdProfileResponse.experienceCapped) &&
        Objects.equals(this.aerodynamics, tdProfileResponse.aerodynamics) &&
        Objects.equals(this.pitCoord, tdProfileResponse.pitCoord) &&
        Objects.equals(this.motivation, tdProfileResponse.motivation) &&
        Objects.equals(this.age, tdProfileResponse.age) &&
        Objects.equals(this.retiring, tdProfileResponse.retiring) &&
        Objects.equals(this.ptsBonus, tdProfileResponse.ptsBonus) &&
        Objects.equals(this.podBonus, tdProfileResponse.podBonus) &&
        Objects.equals(this.winBonus, tdProfileResponse.winBonus) &&
        Objects.equals(this.trophyBonus, tdProfileResponse.trophyBonus) &&
        Objects.equals(this.segmentSelected, tdProfileResponse.segmentSelected) &&
        Objects.equals(this.ownTD, tdProfileResponse.ownTD) &&
        Objects.equals(this.available, tdProfileResponse.available) &&
        Objects.equals(this.owner, tdProfileResponse.owner) &&
        Objects.equals(this.salary, tdProfileResponse.salary) &&
        Objects.equals(this.racesLeft, tdProfileResponse.racesLeft) &&
        Objects.equals(this.errorMsg, tdProfileResponse.errorMsg) &&
        Objects.equals(this.canMakeOffer, tdProfileResponse.canMakeOffer) &&
        Objects.equals(this.setOfferType, tdProfileResponse.setOfferType) &&
        Objects.equals(this.setSalary, tdProfileResponse.setSalary) &&
        Objects.equals(this.setSignFee, tdProfileResponse.setSignFee) &&
        Objects.equals(this.setBonusWin, tdProfileResponse.setBonusWin) &&
        Objects.equals(this.setBonusPod, tdProfileResponse.setBonusPod) &&
        Objects.equals(this.setBonusPts, tdProfileResponse.setBonusPts) &&
        Objects.equals(this.setBonusChamp, tdProfileResponse.setBonusChamp) &&
        Objects.equals(this.setRaces, tdProfileResponse.setRaces) &&
        Objects.equals(this.canOfferPrivate, tdProfileResponse.canOfferPrivate) &&
        Objects.equals(this.canOfferTrophyBonus, tdProfileResponse.canOfferTrophyBonus) &&
        Objects.equals(this.offerCost, tdProfileResponse.offerCost) &&
        Objects.equals(this.semiOfferCost, tdProfileResponse.semiOfferCost) &&
        Objects.equals(this.privateOfferCost, tdProfileResponse.privateOfferCost) &&
        Objects.equals(this.offerCostToSet, tdProfileResponse.offerCostToSet) &&
        Objects.equals(this.nextPriceIncrementIn, tdProfileResponse.nextPriceIncrementIn) &&
        Objects.equals(this.offerPlaced, tdProfileResponse.offerPlaced) &&
        Objects.equals(this.inShortList, tdProfileResponse.inShortList) &&
        Objects.equals(this.totalOffers, tdProfileResponse.totalOffers) &&
        Objects.equals(this.offersFrom, tdProfileResponse.offersFrom) &&
        Objects.equals(this.apiRequestsRemaining, tdProfileResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, showConfirmDismiss, tdName, cash, natCode, natName, face, faceImg, trophies, races, wins, overall, leadership, mechanics, electronics, experience, experienceCapped, aerodynamics, pitCoord, motivation, age, retiring, ptsBonus, podBonus, winBonus, trophyBonus, segmentSelected, ownTD, available, owner, salary, racesLeft, errorMsg, canMakeOffer, setOfferType, setSalary, setSignFee, setBonusWin, setBonusPod, setBonusPts, setBonusChamp, setRaces, canOfferPrivate, canOfferTrophyBonus, offerCost, semiOfferCost, privateOfferCost, offerCostToSet, nextPriceIncrementIn, offerPlaced, inShortList, totalOffers, offersFrom, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TDProfileResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    showConfirmDismiss: ").append(toIndentedString(showConfirmDismiss)).append("\n");
    sb.append("    tdName: ").append(toIndentedString(tdName)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    natName: ").append(toIndentedString(natName)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    faceImg: ").append(toIndentedString(faceImg)).append("\n");
    sb.append("    trophies: ").append(toIndentedString(trophies)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    leadership: ").append(toIndentedString(leadership)).append("\n");
    sb.append("    mechanics: ").append(toIndentedString(mechanics)).append("\n");
    sb.append("    electronics: ").append(toIndentedString(electronics)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    experienceCapped: ").append(toIndentedString(experienceCapped)).append("\n");
    sb.append("    aerodynamics: ").append(toIndentedString(aerodynamics)).append("\n");
    sb.append("    pitCoord: ").append(toIndentedString(pitCoord)).append("\n");
    sb.append("    motivation: ").append(toIndentedString(motivation)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    retiring: ").append(toIndentedString(retiring)).append("\n");
    sb.append("    ptsBonus: ").append(toIndentedString(ptsBonus)).append("\n");
    sb.append("    podBonus: ").append(toIndentedString(podBonus)).append("\n");
    sb.append("    winBonus: ").append(toIndentedString(winBonus)).append("\n");
    sb.append("    trophyBonus: ").append(toIndentedString(trophyBonus)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    ownTD: ").append(toIndentedString(ownTD)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    racesLeft: ").append(toIndentedString(racesLeft)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    canMakeOffer: ").append(toIndentedString(canMakeOffer)).append("\n");
    sb.append("    setOfferType: ").append(toIndentedString(setOfferType)).append("\n");
    sb.append("    setSalary: ").append(toIndentedString(setSalary)).append("\n");
    sb.append("    setSignFee: ").append(toIndentedString(setSignFee)).append("\n");
    sb.append("    setBonusWin: ").append(toIndentedString(setBonusWin)).append("\n");
    sb.append("    setBonusPod: ").append(toIndentedString(setBonusPod)).append("\n");
    sb.append("    setBonusPts: ").append(toIndentedString(setBonusPts)).append("\n");
    sb.append("    setBonusChamp: ").append(toIndentedString(setBonusChamp)).append("\n");
    sb.append("    setRaces: ").append(toIndentedString(setRaces)).append("\n");
    sb.append("    canOfferPrivate: ").append(toIndentedString(canOfferPrivate)).append("\n");
    sb.append("    canOfferTrophyBonus: ").append(toIndentedString(canOfferTrophyBonus)).append("\n");
    sb.append("    offerCost: ").append(toIndentedString(offerCost)).append("\n");
    sb.append("    semiOfferCost: ").append(toIndentedString(semiOfferCost)).append("\n");
    sb.append("    privateOfferCost: ").append(toIndentedString(privateOfferCost)).append("\n");
    sb.append("    offerCostToSet: ").append(toIndentedString(offerCostToSet)).append("\n");
    sb.append("    nextPriceIncrementIn: ").append(toIndentedString(nextPriceIncrementIn)).append("\n");
    sb.append("    offerPlaced: ").append(toIndentedString(offerPlaced)).append("\n");
    sb.append("    inShortList: ").append(toIndentedString(inShortList)).append("\n");
    sb.append("    totalOffers: ").append(toIndentedString(totalOffers)).append("\n");
    sb.append("    offersFrom: ").append(toIndentedString(offersFrom)).append("\n");
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

