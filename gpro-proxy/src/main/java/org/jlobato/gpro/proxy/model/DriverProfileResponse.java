package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSON;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFavTrack1;
import org.jlobato.gpro.proxy.model.DriverProfileResponseOffersFromInner;
import org.jlobato.gpro.proxy.model.DriverProfileResponseOwner;
import org.jlobato.gpro.proxy.model.DriverProfileResponsePrevWorkInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DriverProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponse implements GetDriverProfile200Response {

  private @Nullable String loadingDataState;

  private @Nullable String driName;

  private @Nullable Integer isSupporter;

  private @Nullable Integer driverNotFoundNote;

  private @Nullable BigDecimal credits;

  private @Nullable Integer cash;

  private @Nullable String natCode;

  private @Nullable String natName;

  private @Nullable String face;

  private @Nullable DriverProfileResponseFaceJSON faceJSON;

  private @Nullable String faceSVG;

  private @Nullable String faceImg;

  private @Nullable Boolean driverFaceAdmin;

  private @Nullable Integer driverNotify;

  private @Nullable String gender;

  private @Nullable String humanRaces;

  private @Nullable String background;

  private @Nullable Boolean initialContract;

  private @Nullable Boolean noCrossGender;

  private @Nullable Integer trophies;

  private @Nullable Integer races;

  private @Nullable Integer wins;

  private @Nullable Integer podiums;

  private @Nullable Integer points;

  private @Nullable Integer poles;

  private @Nullable Integer fastLaps;

  private @Nullable DriverProfileResponseFavTrack1 favTrack1;

  private @Nullable DriverProfileResponseFavTrack1 favTrack2;

  private @Nullable DriverProfileResponseFavTrack1 favTrack3;

  private @Nullable Integer overall;

  private @Nullable Integer driverFaceUpdated;

  private @Nullable BigDecimal driverFaceCost;

  private @Nullable Integer energy;

  private @Nullable Integer concentration;

  private @Nullable Integer talent;

  private @Nullable Integer aggressiveness;

  private @Nullable Integer experience;

  private @Nullable Integer experienceCapped;

  private @Nullable Integer techInsight;

  private @Nullable Integer stamina;

  private @Nullable Integer charisma;

  private @Nullable Integer motivation;

  private @Nullable Integer reputation;

  private @Nullable Integer weight;

  private @Nullable Integer age;

  private @Nullable Integer retiring;

  private @Nullable Integer ptsBonus;

  private @Nullable Integer podBonus;

  private @Nullable Integer winBonus;

  private @Nullable Integer trophyBonus;

  private @Nullable String segmentSelected;

  @Valid
  private List<@Valid DriverProfileResponsePrevWorkInner> prevWork = new ArrayList<>();

  private @Nullable Integer ownDriver;

  private @Nullable Integer available;

  private @Nullable DriverProfileResponseOwner owner;

  private @Nullable String salary;

  private @Nullable String racesLeft;

  private @Nullable String errorMsg;

  private @Nullable Integer canMakeOffer;

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

  private @Nullable String setOfferType;

  private @Nullable Integer nextPriceIncrementIn;

  private @Nullable Integer offerPlaced;

  private @Nullable Integer inShortList;

  private @Nullable Integer oneRaceRenewFee;

  private @Nullable Integer twoRaceRenewFee;

  private @Nullable Integer threeRaceRenewFee;

  private @Nullable Integer fiveRaceRenewFee;

  private @Nullable Integer tenRaceRenewFee;

  private @Nullable Integer thirteenRaceRenewFee;

  private @Nullable Integer seventeenRaceRenewFee;

  private @Nullable Integer oneRaceRenewSalary;

  private @Nullable Integer twoRaceRenewSalary;

  private @Nullable Integer threeRaceRenewSalary;

  private @Nullable Integer fiveRaceRenewSalary;

  private @Nullable Integer tenRaceRenewSalary;

  private @Nullable Integer thirteenRaceRenewSalary;

  private @Nullable Integer seventeenRaceRenewSalary;

  private @Nullable String errorMsgExtend;

  private @Nullable String errorMsgExtendColor;

  private @Nullable String setContractLengthExtend;

  private @Nullable Integer totalOffers;

  @Valid
  private List<@Valid DriverProfileResponseOffersFromInner> offersFrom = new ArrayList<>();

  public DriverProfileResponse loadingDataState(@Nullable String loadingDataState) {
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

  public DriverProfileResponse driName(@Nullable String driName) {
    this.driName = driName;
    return this;
  }

  /**
   * Get driName
   * @return driName
   */
  
  @JsonProperty("driName")
  public @Nullable String getDriName() {
    return driName;
  }

  public void setDriName(@Nullable String driName) {
    this.driName = driName;
  }

  public DriverProfileResponse isSupporter(@Nullable Integer isSupporter) {
    this.isSupporter = isSupporter;
    return this;
  }

  /**
   * Get isSupporter
   * @return isSupporter
   */
  
  @JsonProperty("isSupporter")
  public @Nullable Integer getIsSupporter() {
    return isSupporter;
  }

  public void setIsSupporter(@Nullable Integer isSupporter) {
    this.isSupporter = isSupporter;
  }

  public DriverProfileResponse driverNotFoundNote(@Nullable Integer driverNotFoundNote) {
    this.driverNotFoundNote = driverNotFoundNote;
    return this;
  }

  /**
   * Get driverNotFoundNote
   * @return driverNotFoundNote
   */
  
  @JsonProperty("driverNotFoundNote")
  public @Nullable Integer getDriverNotFoundNote() {
    return driverNotFoundNote;
  }

  public void setDriverNotFoundNote(@Nullable Integer driverNotFoundNote) {
    this.driverNotFoundNote = driverNotFoundNote;
  }

  public DriverProfileResponse credits(@Nullable BigDecimal credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  @Valid 
  @JsonProperty("credits")
  public @Nullable BigDecimal getCredits() {
    return credits;
  }

  public void setCredits(@Nullable BigDecimal credits) {
    this.credits = credits;
  }

  public DriverProfileResponse cash(@Nullable Integer cash) {
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

  public DriverProfileResponse natCode(@Nullable String natCode) {
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

  public DriverProfileResponse natName(@Nullable String natName) {
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

  public DriverProfileResponse face(@Nullable String face) {
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

  public DriverProfileResponse faceJSON(@Nullable DriverProfileResponseFaceJSON faceJSON) {
    this.faceJSON = faceJSON;
    return this;
  }

  /**
   * Get faceJSON
   * @return faceJSON
   */
  @Valid 
  @JsonProperty("faceJSON")
  public @Nullable DriverProfileResponseFaceJSON getFaceJSON() {
    return faceJSON;
  }

  public void setFaceJSON(@Nullable DriverProfileResponseFaceJSON faceJSON) {
    this.faceJSON = faceJSON;
  }

  public DriverProfileResponse faceSVG(@Nullable String faceSVG) {
    this.faceSVG = faceSVG;
    return this;
  }

  /**
   * Get faceSVG
   * @return faceSVG
   */
  
  @JsonProperty("faceSVG")
  public @Nullable String getFaceSVG() {
    return faceSVG;
  }

  public void setFaceSVG(@Nullable String faceSVG) {
    this.faceSVG = faceSVG;
  }

  public DriverProfileResponse faceImg(@Nullable String faceImg) {
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

  public DriverProfileResponse driverFaceAdmin(@Nullable Boolean driverFaceAdmin) {
    this.driverFaceAdmin = driverFaceAdmin;
    return this;
  }

  /**
   * Get driverFaceAdmin
   * @return driverFaceAdmin
   */
  
  @JsonProperty("driverFaceAdmin")
  public @Nullable Boolean getDriverFaceAdmin() {
    return driverFaceAdmin;
  }

  public void setDriverFaceAdmin(@Nullable Boolean driverFaceAdmin) {
    this.driverFaceAdmin = driverFaceAdmin;
  }

  public DriverProfileResponse driverNotify(@Nullable Integer driverNotify) {
    this.driverNotify = driverNotify;
    return this;
  }

  /**
   * Get driverNotify
   * @return driverNotify
   */
  
  @JsonProperty("driverNotify")
  public @Nullable Integer getDriverNotify() {
    return driverNotify;
  }

  public void setDriverNotify(@Nullable Integer driverNotify) {
    this.driverNotify = driverNotify;
  }

  public DriverProfileResponse gender(@Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @JsonProperty("gender")
  public @Nullable String getGender() {
    return gender;
  }

  public void setGender(@Nullable String gender) {
    this.gender = gender;
  }

  public DriverProfileResponse humanRaces(@Nullable String humanRaces) {
    this.humanRaces = humanRaces;
    return this;
  }

  /**
   * Get humanRaces
   * @return humanRaces
   */
  
  @JsonProperty("humanRaces")
  public @Nullable String getHumanRaces() {
    return humanRaces;
  }

  public void setHumanRaces(@Nullable String humanRaces) {
    this.humanRaces = humanRaces;
  }

  public DriverProfileResponse background(@Nullable String background) {
    this.background = background;
    return this;
  }

  /**
   * Get background
   * @return background
   */
  
  @JsonProperty("background")
  public @Nullable String getBackground() {
    return background;
  }

  public void setBackground(@Nullable String background) {
    this.background = background;
  }

  public DriverProfileResponse initialContract(@Nullable Boolean initialContract) {
    this.initialContract = initialContract;
    return this;
  }

  /**
   * Get initialContract
   * @return initialContract
   */
  
  @JsonProperty("initialContract")
  public @Nullable Boolean getInitialContract() {
    return initialContract;
  }

  public void setInitialContract(@Nullable Boolean initialContract) {
    this.initialContract = initialContract;
  }

  public DriverProfileResponse noCrossGender(@Nullable Boolean noCrossGender) {
    this.noCrossGender = noCrossGender;
    return this;
  }

  /**
   * Get noCrossGender
   * @return noCrossGender
   */
  
  @JsonProperty("noCrossGender")
  public @Nullable Boolean getNoCrossGender() {
    return noCrossGender;
  }

  public void setNoCrossGender(@Nullable Boolean noCrossGender) {
    this.noCrossGender = noCrossGender;
  }

  public DriverProfileResponse trophies(@Nullable Integer trophies) {
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

  public DriverProfileResponse races(@Nullable Integer races) {
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

  public DriverProfileResponse wins(@Nullable Integer wins) {
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

  public DriverProfileResponse podiums(@Nullable Integer podiums) {
    this.podiums = podiums;
    return this;
  }

  /**
   * Get podiums
   * @return podiums
   */
  
  @JsonProperty("podiums")
  public @Nullable Integer getPodiums() {
    return podiums;
  }

  public void setPodiums(@Nullable Integer podiums) {
    this.podiums = podiums;
  }

  public DriverProfileResponse points(@Nullable Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @JsonProperty("points")
  public @Nullable Integer getPoints() {
    return points;
  }

  public void setPoints(@Nullable Integer points) {
    this.points = points;
  }

  public DriverProfileResponse poles(@Nullable Integer poles) {
    this.poles = poles;
    return this;
  }

  /**
   * Get poles
   * @return poles
   */
  
  @JsonProperty("poles")
  public @Nullable Integer getPoles() {
    return poles;
  }

  public void setPoles(@Nullable Integer poles) {
    this.poles = poles;
  }

  public DriverProfileResponse fastLaps(@Nullable Integer fastLaps) {
    this.fastLaps = fastLaps;
    return this;
  }

  /**
   * Get fastLaps
   * @return fastLaps
   */
  
  @JsonProperty("fastLaps")
  public @Nullable Integer getFastLaps() {
    return fastLaps;
  }

  public void setFastLaps(@Nullable Integer fastLaps) {
    this.fastLaps = fastLaps;
  }

  public DriverProfileResponse favTrack1(@Nullable DriverProfileResponseFavTrack1 favTrack1) {
    this.favTrack1 = favTrack1;
    return this;
  }

  /**
   * Get favTrack1
   * @return favTrack1
   */
  @Valid 
  @JsonProperty("favTrack1")
  public @Nullable DriverProfileResponseFavTrack1 getFavTrack1() {
    return favTrack1;
  }

  public void setFavTrack1(@Nullable DriverProfileResponseFavTrack1 favTrack1) {
    this.favTrack1 = favTrack1;
  }

  public DriverProfileResponse favTrack2(@Nullable DriverProfileResponseFavTrack1 favTrack2) {
    this.favTrack2 = favTrack2;
    return this;
  }

  /**
   * Get favTrack2
   * @return favTrack2
   */
  @Valid 
  @JsonProperty("favTrack2")
  public @Nullable DriverProfileResponseFavTrack1 getFavTrack2() {
    return favTrack2;
  }

  public void setFavTrack2(@Nullable DriverProfileResponseFavTrack1 favTrack2) {
    this.favTrack2 = favTrack2;
  }

  public DriverProfileResponse favTrack3(@Nullable DriverProfileResponseFavTrack1 favTrack3) {
    this.favTrack3 = favTrack3;
    return this;
  }

  /**
   * Get favTrack3
   * @return favTrack3
   */
  @Valid 
  @JsonProperty("favTrack3")
  public @Nullable DriverProfileResponseFavTrack1 getFavTrack3() {
    return favTrack3;
  }

  public void setFavTrack3(@Nullable DriverProfileResponseFavTrack1 favTrack3) {
    this.favTrack3 = favTrack3;
  }

  public DriverProfileResponse overall(@Nullable Integer overall) {
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

  public DriverProfileResponse driverFaceUpdated(@Nullable Integer driverFaceUpdated) {
    this.driverFaceUpdated = driverFaceUpdated;
    return this;
  }

  /**
   * Get driverFaceUpdated
   * @return driverFaceUpdated
   */
  
  @JsonProperty("driverFaceUpdated")
  public @Nullable Integer getDriverFaceUpdated() {
    return driverFaceUpdated;
  }

  public void setDriverFaceUpdated(@Nullable Integer driverFaceUpdated) {
    this.driverFaceUpdated = driverFaceUpdated;
  }

  public DriverProfileResponse driverFaceCost(@Nullable BigDecimal driverFaceCost) {
    this.driverFaceCost = driverFaceCost;
    return this;
  }

  /**
   * Get driverFaceCost
   * @return driverFaceCost
   */
  @Valid 
  @JsonProperty("driverFaceCost")
  public @Nullable BigDecimal getDriverFaceCost() {
    return driverFaceCost;
  }

  public void setDriverFaceCost(@Nullable BigDecimal driverFaceCost) {
    this.driverFaceCost = driverFaceCost;
  }

  public DriverProfileResponse energy(@Nullable Integer energy) {
    this.energy = energy;
    return this;
  }

  /**
   * Get energy
   * @return energy
   */
  
  @JsonProperty("energy")
  public @Nullable Integer getEnergy() {
    return energy;
  }

  public void setEnergy(@Nullable Integer energy) {
    this.energy = energy;
  }

  public DriverProfileResponse concentration(@Nullable Integer concentration) {
    this.concentration = concentration;
    return this;
  }

  /**
   * Get concentration
   * @return concentration
   */
  
  @JsonProperty("concentration")
  public @Nullable Integer getConcentration() {
    return concentration;
  }

  public void setConcentration(@Nullable Integer concentration) {
    this.concentration = concentration;
  }

  public DriverProfileResponse talent(@Nullable Integer talent) {
    this.talent = talent;
    return this;
  }

  /**
   * Get talent
   * @return talent
   */
  
  @JsonProperty("talent")
  public @Nullable Integer getTalent() {
    return talent;
  }

  public void setTalent(@Nullable Integer talent) {
    this.talent = talent;
  }

  public DriverProfileResponse aggressiveness(@Nullable Integer aggressiveness) {
    this.aggressiveness = aggressiveness;
    return this;
  }

  /**
   * Get aggressiveness
   * @return aggressiveness
   */
  
  @JsonProperty("aggressiveness")
  public @Nullable Integer getAggressiveness() {
    return aggressiveness;
  }

  public void setAggressiveness(@Nullable Integer aggressiveness) {
    this.aggressiveness = aggressiveness;
  }

  public DriverProfileResponse experience(@Nullable Integer experience) {
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

  public DriverProfileResponse experienceCapped(@Nullable Integer experienceCapped) {
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

  public DriverProfileResponse techInsight(@Nullable Integer techInsight) {
    this.techInsight = techInsight;
    return this;
  }

  /**
   * Get techInsight
   * @return techInsight
   */
  
  @JsonProperty("techInsight")
  public @Nullable Integer getTechInsight() {
    return techInsight;
  }

  public void setTechInsight(@Nullable Integer techInsight) {
    this.techInsight = techInsight;
  }

  public DriverProfileResponse stamina(@Nullable Integer stamina) {
    this.stamina = stamina;
    return this;
  }

  /**
   * Get stamina
   * @return stamina
   */
  
  @JsonProperty("stamina")
  public @Nullable Integer getStamina() {
    return stamina;
  }

  public void setStamina(@Nullable Integer stamina) {
    this.stamina = stamina;
  }

  public DriverProfileResponse charisma(@Nullable Integer charisma) {
    this.charisma = charisma;
    return this;
  }

  /**
   * Get charisma
   * @return charisma
   */
  
  @JsonProperty("charisma")
  public @Nullable Integer getCharisma() {
    return charisma;
  }

  public void setCharisma(@Nullable Integer charisma) {
    this.charisma = charisma;
  }

  public DriverProfileResponse motivation(@Nullable Integer motivation) {
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

  public DriverProfileResponse reputation(@Nullable Integer reputation) {
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

  public DriverProfileResponse weight(@Nullable Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  
  @JsonProperty("weight")
  public @Nullable Integer getWeight() {
    return weight;
  }

  public void setWeight(@Nullable Integer weight) {
    this.weight = weight;
  }

  public DriverProfileResponse age(@Nullable Integer age) {
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

  public DriverProfileResponse retiring(@Nullable Integer retiring) {
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

  public DriverProfileResponse ptsBonus(@Nullable Integer ptsBonus) {
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

  public DriverProfileResponse podBonus(@Nullable Integer podBonus) {
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

  public DriverProfileResponse winBonus(@Nullable Integer winBonus) {
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

  public DriverProfileResponse trophyBonus(@Nullable Integer trophyBonus) {
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

  public DriverProfileResponse segmentSelected(@Nullable String segmentSelected) {
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

  public DriverProfileResponse prevWork(List<@Valid DriverProfileResponsePrevWorkInner> prevWork) {
    this.prevWork = prevWork;
    return this;
  }

  public DriverProfileResponse addPrevWorkItem(DriverProfileResponsePrevWorkInner prevWorkItem) {
    if (this.prevWork == null) {
      this.prevWork = new ArrayList<>();
    }
    this.prevWork.add(prevWorkItem);
    return this;
  }

  /**
   * Get prevWork
   * @return prevWork
   */
  @Valid 
  @JsonProperty("prevWork")
  public List<@Valid DriverProfileResponsePrevWorkInner> getPrevWork() {
    return prevWork;
  }

  public void setPrevWork(List<@Valid DriverProfileResponsePrevWorkInner> prevWork) {
    this.prevWork = prevWork;
  }

  public DriverProfileResponse ownDriver(@Nullable Integer ownDriver) {
    this.ownDriver = ownDriver;
    return this;
  }

  /**
   * Get ownDriver
   * @return ownDriver
   */
  
  @JsonProperty("ownDriver")
  public @Nullable Integer getOwnDriver() {
    return ownDriver;
  }

  public void setOwnDriver(@Nullable Integer ownDriver) {
    this.ownDriver = ownDriver;
  }

  public DriverProfileResponse available(@Nullable Integer available) {
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

  public DriverProfileResponse owner(@Nullable DriverProfileResponseOwner owner) {
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

  public DriverProfileResponse salary(@Nullable String salary) {
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

  public DriverProfileResponse racesLeft(@Nullable String racesLeft) {
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

  public DriverProfileResponse errorMsg(@Nullable String errorMsg) {
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

  public DriverProfileResponse canMakeOffer(@Nullable Integer canMakeOffer) {
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

  public DriverProfileResponse setSalary(@Nullable Integer setSalary) {
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

  public DriverProfileResponse setSignFee(@Nullable Integer setSignFee) {
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

  public DriverProfileResponse setBonusWin(@Nullable Integer setBonusWin) {
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

  public DriverProfileResponse setBonusPod(@Nullable Integer setBonusPod) {
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

  public DriverProfileResponse setBonusPts(@Nullable Integer setBonusPts) {
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

  public DriverProfileResponse setBonusChamp(@Nullable Integer setBonusChamp) {
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

  public DriverProfileResponse setRaces(@Nullable String setRaces) {
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

  public DriverProfileResponse canOfferPrivate(@Nullable Integer canOfferPrivate) {
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

  public DriverProfileResponse canOfferTrophyBonus(@Nullable Integer canOfferTrophyBonus) {
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

  public DriverProfileResponse offerCost(@Nullable Integer offerCost) {
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

  public DriverProfileResponse semiOfferCost(@Nullable Integer semiOfferCost) {
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

  public DriverProfileResponse privateOfferCost(@Nullable Integer privateOfferCost) {
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

  public DriverProfileResponse offerCostToSet(@Nullable Integer offerCostToSet) {
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

  public DriverProfileResponse setOfferType(@Nullable String setOfferType) {
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

  public DriverProfileResponse nextPriceIncrementIn(@Nullable Integer nextPriceIncrementIn) {
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

  public DriverProfileResponse offerPlaced(@Nullable Integer offerPlaced) {
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

  public DriverProfileResponse inShortList(@Nullable Integer inShortList) {
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

  public DriverProfileResponse oneRaceRenewFee(@Nullable Integer oneRaceRenewFee) {
    this.oneRaceRenewFee = oneRaceRenewFee;
    return this;
  }

  /**
   * Get oneRaceRenewFee
   * @return oneRaceRenewFee
   */
  
  @JsonProperty("oneRaceRenewFee")
  public @Nullable Integer getOneRaceRenewFee() {
    return oneRaceRenewFee;
  }

  public void setOneRaceRenewFee(@Nullable Integer oneRaceRenewFee) {
    this.oneRaceRenewFee = oneRaceRenewFee;
  }

  public DriverProfileResponse twoRaceRenewFee(@Nullable Integer twoRaceRenewFee) {
    this.twoRaceRenewFee = twoRaceRenewFee;
    return this;
  }

  /**
   * Get twoRaceRenewFee
   * @return twoRaceRenewFee
   */
  
  @JsonProperty("twoRaceRenewFee")
  public @Nullable Integer getTwoRaceRenewFee() {
    return twoRaceRenewFee;
  }

  public void setTwoRaceRenewFee(@Nullable Integer twoRaceRenewFee) {
    this.twoRaceRenewFee = twoRaceRenewFee;
  }

  public DriverProfileResponse threeRaceRenewFee(@Nullable Integer threeRaceRenewFee) {
    this.threeRaceRenewFee = threeRaceRenewFee;
    return this;
  }

  /**
   * Get threeRaceRenewFee
   * @return threeRaceRenewFee
   */
  
  @JsonProperty("threeRaceRenewFee")
  public @Nullable Integer getThreeRaceRenewFee() {
    return threeRaceRenewFee;
  }

  public void setThreeRaceRenewFee(@Nullable Integer threeRaceRenewFee) {
    this.threeRaceRenewFee = threeRaceRenewFee;
  }

  public DriverProfileResponse fiveRaceRenewFee(@Nullable Integer fiveRaceRenewFee) {
    this.fiveRaceRenewFee = fiveRaceRenewFee;
    return this;
  }

  /**
   * Get fiveRaceRenewFee
   * @return fiveRaceRenewFee
   */
  
  @JsonProperty("fiveRaceRenewFee")
  public @Nullable Integer getFiveRaceRenewFee() {
    return fiveRaceRenewFee;
  }

  public void setFiveRaceRenewFee(@Nullable Integer fiveRaceRenewFee) {
    this.fiveRaceRenewFee = fiveRaceRenewFee;
  }

  public DriverProfileResponse tenRaceRenewFee(@Nullable Integer tenRaceRenewFee) {
    this.tenRaceRenewFee = tenRaceRenewFee;
    return this;
  }

  /**
   * Get tenRaceRenewFee
   * @return tenRaceRenewFee
   */
  
  @JsonProperty("tenRaceRenewFee")
  public @Nullable Integer getTenRaceRenewFee() {
    return tenRaceRenewFee;
  }

  public void setTenRaceRenewFee(@Nullable Integer tenRaceRenewFee) {
    this.tenRaceRenewFee = tenRaceRenewFee;
  }

  public DriverProfileResponse thirteenRaceRenewFee(@Nullable Integer thirteenRaceRenewFee) {
    this.thirteenRaceRenewFee = thirteenRaceRenewFee;
    return this;
  }

  /**
   * Get thirteenRaceRenewFee
   * @return thirteenRaceRenewFee
   */
  
  @JsonProperty("thirteenRaceRenewFee")
  public @Nullable Integer getThirteenRaceRenewFee() {
    return thirteenRaceRenewFee;
  }

  public void setThirteenRaceRenewFee(@Nullable Integer thirteenRaceRenewFee) {
    this.thirteenRaceRenewFee = thirteenRaceRenewFee;
  }

  public DriverProfileResponse seventeenRaceRenewFee(@Nullable Integer seventeenRaceRenewFee) {
    this.seventeenRaceRenewFee = seventeenRaceRenewFee;
    return this;
  }

  /**
   * Get seventeenRaceRenewFee
   * @return seventeenRaceRenewFee
   */
  
  @JsonProperty("seventeenRaceRenewFee")
  public @Nullable Integer getSeventeenRaceRenewFee() {
    return seventeenRaceRenewFee;
  }

  public void setSeventeenRaceRenewFee(@Nullable Integer seventeenRaceRenewFee) {
    this.seventeenRaceRenewFee = seventeenRaceRenewFee;
  }

  public DriverProfileResponse oneRaceRenewSalary(@Nullable Integer oneRaceRenewSalary) {
    this.oneRaceRenewSalary = oneRaceRenewSalary;
    return this;
  }

  /**
   * Get oneRaceRenewSalary
   * @return oneRaceRenewSalary
   */
  
  @JsonProperty("oneRaceRenewSalary")
  public @Nullable Integer getOneRaceRenewSalary() {
    return oneRaceRenewSalary;
  }

  public void setOneRaceRenewSalary(@Nullable Integer oneRaceRenewSalary) {
    this.oneRaceRenewSalary = oneRaceRenewSalary;
  }

  public DriverProfileResponse twoRaceRenewSalary(@Nullable Integer twoRaceRenewSalary) {
    this.twoRaceRenewSalary = twoRaceRenewSalary;
    return this;
  }

  /**
   * Get twoRaceRenewSalary
   * @return twoRaceRenewSalary
   */
  
  @JsonProperty("twoRaceRenewSalary")
  public @Nullable Integer getTwoRaceRenewSalary() {
    return twoRaceRenewSalary;
  }

  public void setTwoRaceRenewSalary(@Nullable Integer twoRaceRenewSalary) {
    this.twoRaceRenewSalary = twoRaceRenewSalary;
  }

  public DriverProfileResponse threeRaceRenewSalary(@Nullable Integer threeRaceRenewSalary) {
    this.threeRaceRenewSalary = threeRaceRenewSalary;
    return this;
  }

  /**
   * Get threeRaceRenewSalary
   * @return threeRaceRenewSalary
   */
  
  @JsonProperty("threeRaceRenewSalary")
  public @Nullable Integer getThreeRaceRenewSalary() {
    return threeRaceRenewSalary;
  }

  public void setThreeRaceRenewSalary(@Nullable Integer threeRaceRenewSalary) {
    this.threeRaceRenewSalary = threeRaceRenewSalary;
  }

  public DriverProfileResponse fiveRaceRenewSalary(@Nullable Integer fiveRaceRenewSalary) {
    this.fiveRaceRenewSalary = fiveRaceRenewSalary;
    return this;
  }

  /**
   * Get fiveRaceRenewSalary
   * @return fiveRaceRenewSalary
   */
  
  @JsonProperty("fiveRaceRenewSalary")
  public @Nullable Integer getFiveRaceRenewSalary() {
    return fiveRaceRenewSalary;
  }

  public void setFiveRaceRenewSalary(@Nullable Integer fiveRaceRenewSalary) {
    this.fiveRaceRenewSalary = fiveRaceRenewSalary;
  }

  public DriverProfileResponse tenRaceRenewSalary(@Nullable Integer tenRaceRenewSalary) {
    this.tenRaceRenewSalary = tenRaceRenewSalary;
    return this;
  }

  /**
   * Get tenRaceRenewSalary
   * @return tenRaceRenewSalary
   */
  
  @JsonProperty("tenRaceRenewSalary")
  public @Nullable Integer getTenRaceRenewSalary() {
    return tenRaceRenewSalary;
  }

  public void setTenRaceRenewSalary(@Nullable Integer tenRaceRenewSalary) {
    this.tenRaceRenewSalary = tenRaceRenewSalary;
  }

  public DriverProfileResponse thirteenRaceRenewSalary(@Nullable Integer thirteenRaceRenewSalary) {
    this.thirteenRaceRenewSalary = thirteenRaceRenewSalary;
    return this;
  }

  /**
   * Get thirteenRaceRenewSalary
   * @return thirteenRaceRenewSalary
   */
  
  @JsonProperty("thirteenRaceRenewSalary")
  public @Nullable Integer getThirteenRaceRenewSalary() {
    return thirteenRaceRenewSalary;
  }

  public void setThirteenRaceRenewSalary(@Nullable Integer thirteenRaceRenewSalary) {
    this.thirteenRaceRenewSalary = thirteenRaceRenewSalary;
  }

  public DriverProfileResponse seventeenRaceRenewSalary(@Nullable Integer seventeenRaceRenewSalary) {
    this.seventeenRaceRenewSalary = seventeenRaceRenewSalary;
    return this;
  }

  /**
   * Get seventeenRaceRenewSalary
   * @return seventeenRaceRenewSalary
   */
  
  @JsonProperty("seventeenRaceRenewSalary")
  public @Nullable Integer getSeventeenRaceRenewSalary() {
    return seventeenRaceRenewSalary;
  }

  public void setSeventeenRaceRenewSalary(@Nullable Integer seventeenRaceRenewSalary) {
    this.seventeenRaceRenewSalary = seventeenRaceRenewSalary;
  }

  public DriverProfileResponse errorMsgExtend(@Nullable String errorMsgExtend) {
    this.errorMsgExtend = errorMsgExtend;
    return this;
  }

  /**
   * Get errorMsgExtend
   * @return errorMsgExtend
   */
  
  @JsonProperty("errorMsgExtend")
  public @Nullable String getErrorMsgExtend() {
    return errorMsgExtend;
  }

  public void setErrorMsgExtend(@Nullable String errorMsgExtend) {
    this.errorMsgExtend = errorMsgExtend;
  }

  public DriverProfileResponse errorMsgExtendColor(@Nullable String errorMsgExtendColor) {
    this.errorMsgExtendColor = errorMsgExtendColor;
    return this;
  }

  /**
   * Get errorMsgExtendColor
   * @return errorMsgExtendColor
   */
  
  @JsonProperty("errorMsgExtendColor")
  public @Nullable String getErrorMsgExtendColor() {
    return errorMsgExtendColor;
  }

  public void setErrorMsgExtendColor(@Nullable String errorMsgExtendColor) {
    this.errorMsgExtendColor = errorMsgExtendColor;
  }

  public DriverProfileResponse setContractLengthExtend(@Nullable String setContractLengthExtend) {
    this.setContractLengthExtend = setContractLengthExtend;
    return this;
  }

  /**
   * Get setContractLengthExtend
   * @return setContractLengthExtend
   */
  
  @JsonProperty("setContractLengthExtend")
  public @Nullable String getSetContractLengthExtend() {
    return setContractLengthExtend;
  }

  public void setSetContractLengthExtend(@Nullable String setContractLengthExtend) {
    this.setContractLengthExtend = setContractLengthExtend;
  }

  public DriverProfileResponse totalOffers(@Nullable Integer totalOffers) {
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

  public DriverProfileResponse offersFrom(List<@Valid DriverProfileResponseOffersFromInner> offersFrom) {
    this.offersFrom = offersFrom;
    return this;
  }

  public DriverProfileResponse addOffersFromItem(DriverProfileResponseOffersFromInner offersFromItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponse driverProfileResponse = (DriverProfileResponse) o;
    return Objects.equals(this.loadingDataState, driverProfileResponse.loadingDataState) &&
        Objects.equals(this.driName, driverProfileResponse.driName) &&
        Objects.equals(this.isSupporter, driverProfileResponse.isSupporter) &&
        Objects.equals(this.driverNotFoundNote, driverProfileResponse.driverNotFoundNote) &&
        Objects.equals(this.credits, driverProfileResponse.credits) &&
        Objects.equals(this.cash, driverProfileResponse.cash) &&
        Objects.equals(this.natCode, driverProfileResponse.natCode) &&
        Objects.equals(this.natName, driverProfileResponse.natName) &&
        Objects.equals(this.face, driverProfileResponse.face) &&
        Objects.equals(this.faceJSON, driverProfileResponse.faceJSON) &&
        Objects.equals(this.faceSVG, driverProfileResponse.faceSVG) &&
        Objects.equals(this.faceImg, driverProfileResponse.faceImg) &&
        Objects.equals(this.driverFaceAdmin, driverProfileResponse.driverFaceAdmin) &&
        Objects.equals(this.driverNotify, driverProfileResponse.driverNotify) &&
        Objects.equals(this.gender, driverProfileResponse.gender) &&
        Objects.equals(this.humanRaces, driverProfileResponse.humanRaces) &&
        Objects.equals(this.background, driverProfileResponse.background) &&
        Objects.equals(this.initialContract, driverProfileResponse.initialContract) &&
        Objects.equals(this.noCrossGender, driverProfileResponse.noCrossGender) &&
        Objects.equals(this.trophies, driverProfileResponse.trophies) &&
        Objects.equals(this.races, driverProfileResponse.races) &&
        Objects.equals(this.wins, driverProfileResponse.wins) &&
        Objects.equals(this.podiums, driverProfileResponse.podiums) &&
        Objects.equals(this.points, driverProfileResponse.points) &&
        Objects.equals(this.poles, driverProfileResponse.poles) &&
        Objects.equals(this.fastLaps, driverProfileResponse.fastLaps) &&
        Objects.equals(this.favTrack1, driverProfileResponse.favTrack1) &&
        Objects.equals(this.favTrack2, driverProfileResponse.favTrack2) &&
        Objects.equals(this.favTrack3, driverProfileResponse.favTrack3) &&
        Objects.equals(this.overall, driverProfileResponse.overall) &&
        Objects.equals(this.driverFaceUpdated, driverProfileResponse.driverFaceUpdated) &&
        Objects.equals(this.driverFaceCost, driverProfileResponse.driverFaceCost) &&
        Objects.equals(this.energy, driverProfileResponse.energy) &&
        Objects.equals(this.concentration, driverProfileResponse.concentration) &&
        Objects.equals(this.talent, driverProfileResponse.talent) &&
        Objects.equals(this.aggressiveness, driverProfileResponse.aggressiveness) &&
        Objects.equals(this.experience, driverProfileResponse.experience) &&
        Objects.equals(this.experienceCapped, driverProfileResponse.experienceCapped) &&
        Objects.equals(this.techInsight, driverProfileResponse.techInsight) &&
        Objects.equals(this.stamina, driverProfileResponse.stamina) &&
        Objects.equals(this.charisma, driverProfileResponse.charisma) &&
        Objects.equals(this.motivation, driverProfileResponse.motivation) &&
        Objects.equals(this.reputation, driverProfileResponse.reputation) &&
        Objects.equals(this.weight, driverProfileResponse.weight) &&
        Objects.equals(this.age, driverProfileResponse.age) &&
        Objects.equals(this.retiring, driverProfileResponse.retiring) &&
        Objects.equals(this.ptsBonus, driverProfileResponse.ptsBonus) &&
        Objects.equals(this.podBonus, driverProfileResponse.podBonus) &&
        Objects.equals(this.winBonus, driverProfileResponse.winBonus) &&
        Objects.equals(this.trophyBonus, driverProfileResponse.trophyBonus) &&
        Objects.equals(this.segmentSelected, driverProfileResponse.segmentSelected) &&
        Objects.equals(this.prevWork, driverProfileResponse.prevWork) &&
        Objects.equals(this.ownDriver, driverProfileResponse.ownDriver) &&
        Objects.equals(this.available, driverProfileResponse.available) &&
        Objects.equals(this.owner, driverProfileResponse.owner) &&
        Objects.equals(this.salary, driverProfileResponse.salary) &&
        Objects.equals(this.racesLeft, driverProfileResponse.racesLeft) &&
        Objects.equals(this.errorMsg, driverProfileResponse.errorMsg) &&
        Objects.equals(this.canMakeOffer, driverProfileResponse.canMakeOffer) &&
        Objects.equals(this.setSalary, driverProfileResponse.setSalary) &&
        Objects.equals(this.setSignFee, driverProfileResponse.setSignFee) &&
        Objects.equals(this.setBonusWin, driverProfileResponse.setBonusWin) &&
        Objects.equals(this.setBonusPod, driverProfileResponse.setBonusPod) &&
        Objects.equals(this.setBonusPts, driverProfileResponse.setBonusPts) &&
        Objects.equals(this.setBonusChamp, driverProfileResponse.setBonusChamp) &&
        Objects.equals(this.setRaces, driverProfileResponse.setRaces) &&
        Objects.equals(this.canOfferPrivate, driverProfileResponse.canOfferPrivate) &&
        Objects.equals(this.canOfferTrophyBonus, driverProfileResponse.canOfferTrophyBonus) &&
        Objects.equals(this.offerCost, driverProfileResponse.offerCost) &&
        Objects.equals(this.semiOfferCost, driverProfileResponse.semiOfferCost) &&
        Objects.equals(this.privateOfferCost, driverProfileResponse.privateOfferCost) &&
        Objects.equals(this.offerCostToSet, driverProfileResponse.offerCostToSet) &&
        Objects.equals(this.setOfferType, driverProfileResponse.setOfferType) &&
        Objects.equals(this.nextPriceIncrementIn, driverProfileResponse.nextPriceIncrementIn) &&
        Objects.equals(this.offerPlaced, driverProfileResponse.offerPlaced) &&
        Objects.equals(this.inShortList, driverProfileResponse.inShortList) &&
        Objects.equals(this.oneRaceRenewFee, driverProfileResponse.oneRaceRenewFee) &&
        Objects.equals(this.twoRaceRenewFee, driverProfileResponse.twoRaceRenewFee) &&
        Objects.equals(this.threeRaceRenewFee, driverProfileResponse.threeRaceRenewFee) &&
        Objects.equals(this.fiveRaceRenewFee, driverProfileResponse.fiveRaceRenewFee) &&
        Objects.equals(this.tenRaceRenewFee, driverProfileResponse.tenRaceRenewFee) &&
        Objects.equals(this.thirteenRaceRenewFee, driverProfileResponse.thirteenRaceRenewFee) &&
        Objects.equals(this.seventeenRaceRenewFee, driverProfileResponse.seventeenRaceRenewFee) &&
        Objects.equals(this.oneRaceRenewSalary, driverProfileResponse.oneRaceRenewSalary) &&
        Objects.equals(this.twoRaceRenewSalary, driverProfileResponse.twoRaceRenewSalary) &&
        Objects.equals(this.threeRaceRenewSalary, driverProfileResponse.threeRaceRenewSalary) &&
        Objects.equals(this.fiveRaceRenewSalary, driverProfileResponse.fiveRaceRenewSalary) &&
        Objects.equals(this.tenRaceRenewSalary, driverProfileResponse.tenRaceRenewSalary) &&
        Objects.equals(this.thirteenRaceRenewSalary, driverProfileResponse.thirteenRaceRenewSalary) &&
        Objects.equals(this.seventeenRaceRenewSalary, driverProfileResponse.seventeenRaceRenewSalary) &&
        Objects.equals(this.errorMsgExtend, driverProfileResponse.errorMsgExtend) &&
        Objects.equals(this.errorMsgExtendColor, driverProfileResponse.errorMsgExtendColor) &&
        Objects.equals(this.setContractLengthExtend, driverProfileResponse.setContractLengthExtend) &&
        Objects.equals(this.totalOffers, driverProfileResponse.totalOffers) &&
        Objects.equals(this.offersFrom, driverProfileResponse.offersFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, driName, isSupporter, driverNotFoundNote, credits, cash, natCode, natName, face, faceJSON, faceSVG, faceImg, driverFaceAdmin, driverNotify, gender, humanRaces, background, initialContract, noCrossGender, trophies, races, wins, podiums, points, poles, fastLaps, favTrack1, favTrack2, favTrack3, overall, driverFaceUpdated, driverFaceCost, energy, concentration, talent, aggressiveness, experience, experienceCapped, techInsight, stamina, charisma, motivation, reputation, weight, age, retiring, ptsBonus, podBonus, winBonus, trophyBonus, segmentSelected, prevWork, ownDriver, available, owner, salary, racesLeft, errorMsg, canMakeOffer, setSalary, setSignFee, setBonusWin, setBonusPod, setBonusPts, setBonusChamp, setRaces, canOfferPrivate, canOfferTrophyBonus, offerCost, semiOfferCost, privateOfferCost, offerCostToSet, setOfferType, nextPriceIncrementIn, offerPlaced, inShortList, oneRaceRenewFee, twoRaceRenewFee, threeRaceRenewFee, fiveRaceRenewFee, tenRaceRenewFee, thirteenRaceRenewFee, seventeenRaceRenewFee, oneRaceRenewSalary, twoRaceRenewSalary, threeRaceRenewSalary, fiveRaceRenewSalary, tenRaceRenewSalary, thirteenRaceRenewSalary, seventeenRaceRenewSalary, errorMsgExtend, errorMsgExtendColor, setContractLengthExtend, totalOffers, offersFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    driName: ").append(toIndentedString(driName)).append("\n");
    sb.append("    isSupporter: ").append(toIndentedString(isSupporter)).append("\n");
    sb.append("    driverNotFoundNote: ").append(toIndentedString(driverNotFoundNote)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    natName: ").append(toIndentedString(natName)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    faceJSON: ").append(toIndentedString(faceJSON)).append("\n");
    sb.append("    faceSVG: ").append(toIndentedString(faceSVG)).append("\n");
    sb.append("    faceImg: ").append(toIndentedString(faceImg)).append("\n");
    sb.append("    driverFaceAdmin: ").append(toIndentedString(driverFaceAdmin)).append("\n");
    sb.append("    driverNotify: ").append(toIndentedString(driverNotify)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    humanRaces: ").append(toIndentedString(humanRaces)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    initialContract: ").append(toIndentedString(initialContract)).append("\n");
    sb.append("    noCrossGender: ").append(toIndentedString(noCrossGender)).append("\n");
    sb.append("    trophies: ").append(toIndentedString(trophies)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    podiums: ").append(toIndentedString(podiums)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    poles: ").append(toIndentedString(poles)).append("\n");
    sb.append("    fastLaps: ").append(toIndentedString(fastLaps)).append("\n");
    sb.append("    favTrack1: ").append(toIndentedString(favTrack1)).append("\n");
    sb.append("    favTrack2: ").append(toIndentedString(favTrack2)).append("\n");
    sb.append("    favTrack3: ").append(toIndentedString(favTrack3)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    driverFaceUpdated: ").append(toIndentedString(driverFaceUpdated)).append("\n");
    sb.append("    driverFaceCost: ").append(toIndentedString(driverFaceCost)).append("\n");
    sb.append("    energy: ").append(toIndentedString(energy)).append("\n");
    sb.append("    concentration: ").append(toIndentedString(concentration)).append("\n");
    sb.append("    talent: ").append(toIndentedString(talent)).append("\n");
    sb.append("    aggressiveness: ").append(toIndentedString(aggressiveness)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    experienceCapped: ").append(toIndentedString(experienceCapped)).append("\n");
    sb.append("    techInsight: ").append(toIndentedString(techInsight)).append("\n");
    sb.append("    stamina: ").append(toIndentedString(stamina)).append("\n");
    sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
    sb.append("    motivation: ").append(toIndentedString(motivation)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    retiring: ").append(toIndentedString(retiring)).append("\n");
    sb.append("    ptsBonus: ").append(toIndentedString(ptsBonus)).append("\n");
    sb.append("    podBonus: ").append(toIndentedString(podBonus)).append("\n");
    sb.append("    winBonus: ").append(toIndentedString(winBonus)).append("\n");
    sb.append("    trophyBonus: ").append(toIndentedString(trophyBonus)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    prevWork: ").append(toIndentedString(prevWork)).append("\n");
    sb.append("    ownDriver: ").append(toIndentedString(ownDriver)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    racesLeft: ").append(toIndentedString(racesLeft)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    canMakeOffer: ").append(toIndentedString(canMakeOffer)).append("\n");
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
    sb.append("    setOfferType: ").append(toIndentedString(setOfferType)).append("\n");
    sb.append("    nextPriceIncrementIn: ").append(toIndentedString(nextPriceIncrementIn)).append("\n");
    sb.append("    offerPlaced: ").append(toIndentedString(offerPlaced)).append("\n");
    sb.append("    inShortList: ").append(toIndentedString(inShortList)).append("\n");
    sb.append("    oneRaceRenewFee: ").append(toIndentedString(oneRaceRenewFee)).append("\n");
    sb.append("    twoRaceRenewFee: ").append(toIndentedString(twoRaceRenewFee)).append("\n");
    sb.append("    threeRaceRenewFee: ").append(toIndentedString(threeRaceRenewFee)).append("\n");
    sb.append("    fiveRaceRenewFee: ").append(toIndentedString(fiveRaceRenewFee)).append("\n");
    sb.append("    tenRaceRenewFee: ").append(toIndentedString(tenRaceRenewFee)).append("\n");
    sb.append("    thirteenRaceRenewFee: ").append(toIndentedString(thirteenRaceRenewFee)).append("\n");
    sb.append("    seventeenRaceRenewFee: ").append(toIndentedString(seventeenRaceRenewFee)).append("\n");
    sb.append("    oneRaceRenewSalary: ").append(toIndentedString(oneRaceRenewSalary)).append("\n");
    sb.append("    twoRaceRenewSalary: ").append(toIndentedString(twoRaceRenewSalary)).append("\n");
    sb.append("    threeRaceRenewSalary: ").append(toIndentedString(threeRaceRenewSalary)).append("\n");
    sb.append("    fiveRaceRenewSalary: ").append(toIndentedString(fiveRaceRenewSalary)).append("\n");
    sb.append("    tenRaceRenewSalary: ").append(toIndentedString(tenRaceRenewSalary)).append("\n");
    sb.append("    thirteenRaceRenewSalary: ").append(toIndentedString(thirteenRaceRenewSalary)).append("\n");
    sb.append("    seventeenRaceRenewSalary: ").append(toIndentedString(seventeenRaceRenewSalary)).append("\n");
    sb.append("    errorMsgExtend: ").append(toIndentedString(errorMsgExtend)).append("\n");
    sb.append("    errorMsgExtendColor: ").append(toIndentedString(errorMsgExtendColor)).append("\n");
    sb.append("    setContractLengthExtend: ").append(toIndentedString(setContractLengthExtend)).append("\n");
    sb.append("    totalOffers: ").append(toIndentedString(totalOffers)).append("\n");
    sb.append("    offersFrom: ").append(toIndentedString(offersFrom)).append("\n");
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

