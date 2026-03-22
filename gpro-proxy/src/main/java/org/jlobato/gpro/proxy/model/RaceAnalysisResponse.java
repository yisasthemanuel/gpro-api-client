package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.PracticeResponseLapsDoneInner;
import org.jlobato.gpro.proxy.model.PracticeResponseWeather;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseChassis;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseDriver;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseDriverChanges;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseLapsInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponsePitsInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseProblemsInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseQ1Energy;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseRacesToSelectInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseSetupsUsedInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseShowWeatherPopover;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseTransactionsInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseTyreSupplier;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RaceAnalysisResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponse implements GetRaceAnalysis200Response {

  private @Nullable Integer loadingDataState;

  private @Nullable Integer ignoreRefCheck;

  private @Nullable String segmentSelected;

  private @Nullable String unlocked;

  private @Nullable String selSeasonNb;

  private @Nullable String selRaceNb;

  private @Nullable String group;

  private @Nullable String trackName;

  private @Nullable Integer isSupporter;

  private @Nullable String trackNatCode;

  private @Nullable String trackCountry;

  private @Nullable String trackId;

  @Valid
  private List<@Valid RaceAnalysisResponseRacesToSelectInner> racesToSelect = new ArrayList<>();

  @Valid
  private List<@Valid PracticeResponseLapsDoneInner> practiceLaps = new ArrayList<>();

  private @Nullable String q1Time;

  private @Nullable String q1Pos;

  private @Nullable Integer selectedLap;

  private @Nullable String q2Time;

  private @Nullable String q2Pos;

  @Valid
  private List<@Valid RaceAnalysisResponseSetupsUsedInner> setupsUsed = new ArrayList<>();

  private @Nullable String q1Risk;

  private @Nullable String q2Risk;

  private @Nullable String startRisk;

  private @Nullable String overtakeRisk;

  private @Nullable String defendRisk;

  private @Nullable String clearDryRisk;

  private @Nullable String clearWetRisk;

  private @Nullable String problemRisk;

  private @Nullable RaceAnalysisResponseDriver driver;

  private @Nullable RaceAnalysisResponseDriverChanges driverChanges;

  private @Nullable RaceAnalysisResponseQ1Energy q1Energy;

  private @Nullable RaceAnalysisResponseQ1Energy q2Energy;

  private @Nullable RaceAnalysisResponseQ1Energy raceEnergy;

  private @Nullable Integer carPower;

  private @Nullable Integer carHandl;

  private @Nullable Integer carAccel;

  private @Nullable RaceAnalysisResponseTyreSupplier tyreSupplier;

  private @Nullable PracticeResponseWeather weather;

  private @Nullable RaceAnalysisResponseShowWeatherPopover showWeatherPopover;

  private @Nullable Integer startFuel;

  private @Nullable Integer finishTyres;

  private @Nullable Integer finishFuel;

  private @Nullable String otAttempts;

  private @Nullable String overtakes;

  private @Nullable String otAttemptsOnYou;

  private @Nullable String overtakesOnYou;

  private @Nullable String graphCode;

  @Valid
  private List<@Valid RaceAnalysisResponseTransactionsInner> transactions = new ArrayList<>();

  private @Nullable Integer total;

  private @Nullable Integer currentBalance;

  private @Nullable RaceAnalysisResponseChassis chassis;

  private @Nullable RaceAnalysisResponseChassis engine;

  private @Nullable RaceAnalysisResponseChassis fwing;

  private @Nullable RaceAnalysisResponseChassis rwing;

  private @Nullable RaceAnalysisResponseChassis underbody;

  private @Nullable RaceAnalysisResponseChassis sidepods;

  private @Nullable RaceAnalysisResponseChassis cooling;

  private @Nullable RaceAnalysisResponseChassis gear;

  private @Nullable RaceAnalysisResponseChassis brakes;

  private @Nullable RaceAnalysisResponseChassis susp;

  private @Nullable RaceAnalysisResponseChassis electronics;

  @Valid
  private List<@Valid RaceAnalysisResponseLapsInner> laps = new ArrayList<>();

  @Valid
  private List<@Valid RaceAnalysisResponsePitsInner> pits = new ArrayList<>();

  @Valid
  private List<@Valid RaceAnalysisResponseProblemsInner> problems = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public RaceAnalysisResponse loadingDataState(@Nullable Integer loadingDataState) {
    this.loadingDataState = loadingDataState;
    return this;
  }

  /**
   * Get loadingDataState
   * @return loadingDataState
   */
  
  @JsonProperty("loadingDataState")
  public @Nullable Integer getLoadingDataState() {
    return loadingDataState;
  }

  public void setLoadingDataState(@Nullable Integer loadingDataState) {
    this.loadingDataState = loadingDataState;
  }

  public RaceAnalysisResponse ignoreRefCheck(@Nullable Integer ignoreRefCheck) {
    this.ignoreRefCheck = ignoreRefCheck;
    return this;
  }

  /**
   * Get ignoreRefCheck
   * @return ignoreRefCheck
   */
  
  @JsonProperty("ignoreRefCheck")
  public @Nullable Integer getIgnoreRefCheck() {
    return ignoreRefCheck;
  }

  public void setIgnoreRefCheck(@Nullable Integer ignoreRefCheck) {
    this.ignoreRefCheck = ignoreRefCheck;
  }

  public RaceAnalysisResponse segmentSelected(@Nullable String segmentSelected) {
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

  public RaceAnalysisResponse unlocked(@Nullable String unlocked) {
    this.unlocked = unlocked;
    return this;
  }

  /**
   * Get unlocked
   * @return unlocked
   */
  
  @JsonProperty("unlocked")
  public @Nullable String getUnlocked() {
    return unlocked;
  }

  public void setUnlocked(@Nullable String unlocked) {
    this.unlocked = unlocked;
  }

  public RaceAnalysisResponse selSeasonNb(@Nullable String selSeasonNb) {
    this.selSeasonNb = selSeasonNb;
    return this;
  }

  /**
   * Get selSeasonNb
   * @return selSeasonNb
   */
  
  @JsonProperty("selSeasonNb")
  public @Nullable String getSelSeasonNb() {
    return selSeasonNb;
  }

  public void setSelSeasonNb(@Nullable String selSeasonNb) {
    this.selSeasonNb = selSeasonNb;
  }

  public RaceAnalysisResponse selRaceNb(@Nullable String selRaceNb) {
    this.selRaceNb = selRaceNb;
    return this;
  }

  /**
   * Get selRaceNb
   * @return selRaceNb
   */
  
  @JsonProperty("selRaceNb")
  public @Nullable String getSelRaceNb() {
    return selRaceNb;
  }

  public void setSelRaceNb(@Nullable String selRaceNb) {
    this.selRaceNb = selRaceNb;
  }

  public RaceAnalysisResponse group(@Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  
  @JsonProperty("group")
  public @Nullable String getGroup() {
    return group;
  }

  public void setGroup(@Nullable String group) {
    this.group = group;
  }

  public RaceAnalysisResponse trackName(@Nullable String trackName) {
    this.trackName = trackName;
    return this;
  }

  /**
   * Get trackName
   * @return trackName
   */
  
  @JsonProperty("trackName")
  public @Nullable String getTrackName() {
    return trackName;
  }

  public void setTrackName(@Nullable String trackName) {
    this.trackName = trackName;
  }

  public RaceAnalysisResponse isSupporter(@Nullable Integer isSupporter) {
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

  public RaceAnalysisResponse trackNatCode(@Nullable String trackNatCode) {
    this.trackNatCode = trackNatCode;
    return this;
  }

  /**
   * Get trackNatCode
   * @return trackNatCode
   */
  
  @JsonProperty("trackNatCode")
  public @Nullable String getTrackNatCode() {
    return trackNatCode;
  }

  public void setTrackNatCode(@Nullable String trackNatCode) {
    this.trackNatCode = trackNatCode;
  }

  public RaceAnalysisResponse trackCountry(@Nullable String trackCountry) {
    this.trackCountry = trackCountry;
    return this;
  }

  /**
   * Get trackCountry
   * @return trackCountry
   */
  
  @JsonProperty("trackCountry")
  public @Nullable String getTrackCountry() {
    return trackCountry;
  }

  public void setTrackCountry(@Nullable String trackCountry) {
    this.trackCountry = trackCountry;
  }

  public RaceAnalysisResponse trackId(@Nullable String trackId) {
    this.trackId = trackId;
    return this;
  }

  /**
   * Get trackId
   * @return trackId
   */
  
  @JsonProperty("trackId")
  public @Nullable String getTrackId() {
    return trackId;
  }

  public void setTrackId(@Nullable String trackId) {
    this.trackId = trackId;
  }

  public RaceAnalysisResponse racesToSelect(List<@Valid RaceAnalysisResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
    return this;
  }

  public RaceAnalysisResponse addRacesToSelectItem(RaceAnalysisResponseRacesToSelectInner racesToSelectItem) {
    if (this.racesToSelect == null) {
      this.racesToSelect = new ArrayList<>();
    }
    this.racesToSelect.add(racesToSelectItem);
    return this;
  }

  /**
   * Get racesToSelect
   * @return racesToSelect
   */
  @Valid 
  @JsonProperty("racesToSelect")
  public List<@Valid RaceAnalysisResponseRacesToSelectInner> getRacesToSelect() {
    return racesToSelect;
  }

  public void setRacesToSelect(List<@Valid RaceAnalysisResponseRacesToSelectInner> racesToSelect) {
    this.racesToSelect = racesToSelect;
  }

  public RaceAnalysisResponse practiceLaps(List<@Valid PracticeResponseLapsDoneInner> practiceLaps) {
    this.practiceLaps = practiceLaps;
    return this;
  }

  public RaceAnalysisResponse addPracticeLapsItem(PracticeResponseLapsDoneInner practiceLapsItem) {
    if (this.practiceLaps == null) {
      this.practiceLaps = new ArrayList<>();
    }
    this.practiceLaps.add(practiceLapsItem);
    return this;
  }

  /**
   * Get practiceLaps
   * @return practiceLaps
   */
  @Valid 
  @JsonProperty("practiceLaps")
  public List<@Valid PracticeResponseLapsDoneInner> getPracticeLaps() {
    return practiceLaps;
  }

  public void setPracticeLaps(List<@Valid PracticeResponseLapsDoneInner> practiceLaps) {
    this.practiceLaps = practiceLaps;
  }

  public RaceAnalysisResponse q1Time(@Nullable String q1Time) {
    this.q1Time = q1Time;
    return this;
  }

  /**
   * Get q1Time
   * @return q1Time
   */
  
  @JsonProperty("q1Time")
  public @Nullable String getQ1Time() {
    return q1Time;
  }

  public void setQ1Time(@Nullable String q1Time) {
    this.q1Time = q1Time;
  }

  public RaceAnalysisResponse q1Pos(@Nullable String q1Pos) {
    this.q1Pos = q1Pos;
    return this;
  }

  /**
   * Get q1Pos
   * @return q1Pos
   */
  
  @JsonProperty("q1Pos")
  public @Nullable String getQ1Pos() {
    return q1Pos;
  }

  public void setQ1Pos(@Nullable String q1Pos) {
    this.q1Pos = q1Pos;
  }

  public RaceAnalysisResponse selectedLap(@Nullable Integer selectedLap) {
    this.selectedLap = selectedLap;
    return this;
  }

  /**
   * Get selectedLap
   * @return selectedLap
   */
  
  @JsonProperty("selectedLap")
  public @Nullable Integer getSelectedLap() {
    return selectedLap;
  }

  public void setSelectedLap(@Nullable Integer selectedLap) {
    this.selectedLap = selectedLap;
  }

  public RaceAnalysisResponse q2Time(@Nullable String q2Time) {
    this.q2Time = q2Time;
    return this;
  }

  /**
   * Get q2Time
   * @return q2Time
   */
  
  @JsonProperty("q2Time")
  public @Nullable String getQ2Time() {
    return q2Time;
  }

  public void setQ2Time(@Nullable String q2Time) {
    this.q2Time = q2Time;
  }

  public RaceAnalysisResponse q2Pos(@Nullable String q2Pos) {
    this.q2Pos = q2Pos;
    return this;
  }

  /**
   * Get q2Pos
   * @return q2Pos
   */
  
  @JsonProperty("q2Pos")
  public @Nullable String getQ2Pos() {
    return q2Pos;
  }

  public void setQ2Pos(@Nullable String q2Pos) {
    this.q2Pos = q2Pos;
  }

  public RaceAnalysisResponse setupsUsed(List<@Valid RaceAnalysisResponseSetupsUsedInner> setupsUsed) {
    this.setupsUsed = setupsUsed;
    return this;
  }

  public RaceAnalysisResponse addSetupsUsedItem(RaceAnalysisResponseSetupsUsedInner setupsUsedItem) {
    if (this.setupsUsed == null) {
      this.setupsUsed = new ArrayList<>();
    }
    this.setupsUsed.add(setupsUsedItem);
    return this;
  }

  /**
   * Get setupsUsed
   * @return setupsUsed
   */
  @Valid 
  @JsonProperty("setupsUsed")
  public List<@Valid RaceAnalysisResponseSetupsUsedInner> getSetupsUsed() {
    return setupsUsed;
  }

  public void setSetupsUsed(List<@Valid RaceAnalysisResponseSetupsUsedInner> setupsUsed) {
    this.setupsUsed = setupsUsed;
  }

  public RaceAnalysisResponse q1Risk(@Nullable String q1Risk) {
    this.q1Risk = q1Risk;
    return this;
  }

  /**
   * Get q1Risk
   * @return q1Risk
   */
  
  @JsonProperty("q1Risk")
  public @Nullable String getQ1Risk() {
    return q1Risk;
  }

  public void setQ1Risk(@Nullable String q1Risk) {
    this.q1Risk = q1Risk;
  }

  public RaceAnalysisResponse q2Risk(@Nullable String q2Risk) {
    this.q2Risk = q2Risk;
    return this;
  }

  /**
   * Get q2Risk
   * @return q2Risk
   */
  
  @JsonProperty("q2Risk")
  public @Nullable String getQ2Risk() {
    return q2Risk;
  }

  public void setQ2Risk(@Nullable String q2Risk) {
    this.q2Risk = q2Risk;
  }

  public RaceAnalysisResponse startRisk(@Nullable String startRisk) {
    this.startRisk = startRisk;
    return this;
  }

  /**
   * Get startRisk
   * @return startRisk
   */
  
  @JsonProperty("startRisk")
  public @Nullable String getStartRisk() {
    return startRisk;
  }

  public void setStartRisk(@Nullable String startRisk) {
    this.startRisk = startRisk;
  }

  public RaceAnalysisResponse overtakeRisk(@Nullable String overtakeRisk) {
    this.overtakeRisk = overtakeRisk;
    return this;
  }

  /**
   * Get overtakeRisk
   * @return overtakeRisk
   */
  
  @JsonProperty("overtakeRisk")
  public @Nullable String getOvertakeRisk() {
    return overtakeRisk;
  }

  public void setOvertakeRisk(@Nullable String overtakeRisk) {
    this.overtakeRisk = overtakeRisk;
  }

  public RaceAnalysisResponse defendRisk(@Nullable String defendRisk) {
    this.defendRisk = defendRisk;
    return this;
  }

  /**
   * Get defendRisk
   * @return defendRisk
   */
  
  @JsonProperty("defendRisk")
  public @Nullable String getDefendRisk() {
    return defendRisk;
  }

  public void setDefendRisk(@Nullable String defendRisk) {
    this.defendRisk = defendRisk;
  }

  public RaceAnalysisResponse clearDryRisk(@Nullable String clearDryRisk) {
    this.clearDryRisk = clearDryRisk;
    return this;
  }

  /**
   * Get clearDryRisk
   * @return clearDryRisk
   */
  
  @JsonProperty("clearDryRisk")
  public @Nullable String getClearDryRisk() {
    return clearDryRisk;
  }

  public void setClearDryRisk(@Nullable String clearDryRisk) {
    this.clearDryRisk = clearDryRisk;
  }

  public RaceAnalysisResponse clearWetRisk(@Nullable String clearWetRisk) {
    this.clearWetRisk = clearWetRisk;
    return this;
  }

  /**
   * Get clearWetRisk
   * @return clearWetRisk
   */
  
  @JsonProperty("clearWetRisk")
  public @Nullable String getClearWetRisk() {
    return clearWetRisk;
  }

  public void setClearWetRisk(@Nullable String clearWetRisk) {
    this.clearWetRisk = clearWetRisk;
  }

  public RaceAnalysisResponse problemRisk(@Nullable String problemRisk) {
    this.problemRisk = problemRisk;
    return this;
  }

  /**
   * Get problemRisk
   * @return problemRisk
   */
  
  @JsonProperty("problemRisk")
  public @Nullable String getProblemRisk() {
    return problemRisk;
  }

  public void setProblemRisk(@Nullable String problemRisk) {
    this.problemRisk = problemRisk;
  }

  public RaceAnalysisResponse driver(@Nullable RaceAnalysisResponseDriver driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
   */
  @Valid 
  @JsonProperty("driver")
  public @Nullable RaceAnalysisResponseDriver getDriver() {
    return driver;
  }

  public void setDriver(@Nullable RaceAnalysisResponseDriver driver) {
    this.driver = driver;
  }

  public RaceAnalysisResponse driverChanges(@Nullable RaceAnalysisResponseDriverChanges driverChanges) {
    this.driverChanges = driverChanges;
    return this;
  }

  /**
   * Get driverChanges
   * @return driverChanges
   */
  @Valid 
  @JsonProperty("driverChanges")
  public @Nullable RaceAnalysisResponseDriverChanges getDriverChanges() {
    return driverChanges;
  }

  public void setDriverChanges(@Nullable RaceAnalysisResponseDriverChanges driverChanges) {
    this.driverChanges = driverChanges;
  }

  public RaceAnalysisResponse q1Energy(@Nullable RaceAnalysisResponseQ1Energy q1Energy) {
    this.q1Energy = q1Energy;
    return this;
  }

  /**
   * Get q1Energy
   * @return q1Energy
   */
  @Valid 
  @JsonProperty("q1Energy")
  public @Nullable RaceAnalysisResponseQ1Energy getQ1Energy() {
    return q1Energy;
  }

  public void setQ1Energy(@Nullable RaceAnalysisResponseQ1Energy q1Energy) {
    this.q1Energy = q1Energy;
  }

  public RaceAnalysisResponse q2Energy(@Nullable RaceAnalysisResponseQ1Energy q2Energy) {
    this.q2Energy = q2Energy;
    return this;
  }

  /**
   * Get q2Energy
   * @return q2Energy
   */
  @Valid 
  @JsonProperty("q2Energy")
  public @Nullable RaceAnalysisResponseQ1Energy getQ2Energy() {
    return q2Energy;
  }

  public void setQ2Energy(@Nullable RaceAnalysisResponseQ1Energy q2Energy) {
    this.q2Energy = q2Energy;
  }

  public RaceAnalysisResponse raceEnergy(@Nullable RaceAnalysisResponseQ1Energy raceEnergy) {
    this.raceEnergy = raceEnergy;
    return this;
  }

  /**
   * Get raceEnergy
   * @return raceEnergy
   */
  @Valid 
  @JsonProperty("raceEnergy")
  public @Nullable RaceAnalysisResponseQ1Energy getRaceEnergy() {
    return raceEnergy;
  }

  public void setRaceEnergy(@Nullable RaceAnalysisResponseQ1Energy raceEnergy) {
    this.raceEnergy = raceEnergy;
  }

  public RaceAnalysisResponse carPower(@Nullable Integer carPower) {
    this.carPower = carPower;
    return this;
  }

  /**
   * Get carPower
   * @return carPower
   */
  
  @JsonProperty("carPower")
  public @Nullable Integer getCarPower() {
    return carPower;
  }

  public void setCarPower(@Nullable Integer carPower) {
    this.carPower = carPower;
  }

  public RaceAnalysisResponse carHandl(@Nullable Integer carHandl) {
    this.carHandl = carHandl;
    return this;
  }

  /**
   * Get carHandl
   * @return carHandl
   */
  
  @JsonProperty("carHandl")
  public @Nullable Integer getCarHandl() {
    return carHandl;
  }

  public void setCarHandl(@Nullable Integer carHandl) {
    this.carHandl = carHandl;
  }

  public RaceAnalysisResponse carAccel(@Nullable Integer carAccel) {
    this.carAccel = carAccel;
    return this;
  }

  /**
   * Get carAccel
   * @return carAccel
   */
  
  @JsonProperty("carAccel")
  public @Nullable Integer getCarAccel() {
    return carAccel;
  }

  public void setCarAccel(@Nullable Integer carAccel) {
    this.carAccel = carAccel;
  }

  public RaceAnalysisResponse tyreSupplier(@Nullable RaceAnalysisResponseTyreSupplier tyreSupplier) {
    this.tyreSupplier = tyreSupplier;
    return this;
  }

  /**
   * Get tyreSupplier
   * @return tyreSupplier
   */
  @Valid 
  @JsonProperty("tyreSupplier")
  public @Nullable RaceAnalysisResponseTyreSupplier getTyreSupplier() {
    return tyreSupplier;
  }

  public void setTyreSupplier(@Nullable RaceAnalysisResponseTyreSupplier tyreSupplier) {
    this.tyreSupplier = tyreSupplier;
  }

  public RaceAnalysisResponse weather(@Nullable PracticeResponseWeather weather) {
    this.weather = weather;
    return this;
  }

  /**
   * Get weather
   * @return weather
   */
  @Valid 
  @JsonProperty("weather")
  public @Nullable PracticeResponseWeather getWeather() {
    return weather;
  }

  public void setWeather(@Nullable PracticeResponseWeather weather) {
    this.weather = weather;
  }

  public RaceAnalysisResponse showWeatherPopover(@Nullable RaceAnalysisResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
    return this;
  }

  /**
   * Get showWeatherPopover
   * @return showWeatherPopover
   */
  @Valid 
  @JsonProperty("showWeatherPopover")
  public @Nullable RaceAnalysisResponseShowWeatherPopover getShowWeatherPopover() {
    return showWeatherPopover;
  }

  public void setShowWeatherPopover(@Nullable RaceAnalysisResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
  }

  public RaceAnalysisResponse startFuel(@Nullable Integer startFuel) {
    this.startFuel = startFuel;
    return this;
  }

  /**
   * Get startFuel
   * @return startFuel
   */
  
  @JsonProperty("startFuel")
  public @Nullable Integer getStartFuel() {
    return startFuel;
  }

  public void setStartFuel(@Nullable Integer startFuel) {
    this.startFuel = startFuel;
  }

  public RaceAnalysisResponse finishTyres(@Nullable Integer finishTyres) {
    this.finishTyres = finishTyres;
    return this;
  }

  /**
   * Get finishTyres
   * @return finishTyres
   */
  
  @JsonProperty("finishTyres")
  public @Nullable Integer getFinishTyres() {
    return finishTyres;
  }

  public void setFinishTyres(@Nullable Integer finishTyres) {
    this.finishTyres = finishTyres;
  }

  public RaceAnalysisResponse finishFuel(@Nullable Integer finishFuel) {
    this.finishFuel = finishFuel;
    return this;
  }

  /**
   * Get finishFuel
   * @return finishFuel
   */
  
  @JsonProperty("finishFuel")
  public @Nullable Integer getFinishFuel() {
    return finishFuel;
  }

  public void setFinishFuel(@Nullable Integer finishFuel) {
    this.finishFuel = finishFuel;
  }

  public RaceAnalysisResponse otAttempts(@Nullable String otAttempts) {
    this.otAttempts = otAttempts;
    return this;
  }

  /**
   * Get otAttempts
   * @return otAttempts
   */
  
  @JsonProperty("otAttempts")
  public @Nullable String getOtAttempts() {
    return otAttempts;
  }

  public void setOtAttempts(@Nullable String otAttempts) {
    this.otAttempts = otAttempts;
  }

  public RaceAnalysisResponse overtakes(@Nullable String overtakes) {
    this.overtakes = overtakes;
    return this;
  }

  /**
   * Get overtakes
   * @return overtakes
   */
  
  @JsonProperty("overtakes")
  public @Nullable String getOvertakes() {
    return overtakes;
  }

  public void setOvertakes(@Nullable String overtakes) {
    this.overtakes = overtakes;
  }

  public RaceAnalysisResponse otAttemptsOnYou(@Nullable String otAttemptsOnYou) {
    this.otAttemptsOnYou = otAttemptsOnYou;
    return this;
  }

  /**
   * Get otAttemptsOnYou
   * @return otAttemptsOnYou
   */
  
  @JsonProperty("otAttemptsOnYou")
  public @Nullable String getOtAttemptsOnYou() {
    return otAttemptsOnYou;
  }

  public void setOtAttemptsOnYou(@Nullable String otAttemptsOnYou) {
    this.otAttemptsOnYou = otAttemptsOnYou;
  }

  public RaceAnalysisResponse overtakesOnYou(@Nullable String overtakesOnYou) {
    this.overtakesOnYou = overtakesOnYou;
    return this;
  }

  /**
   * Get overtakesOnYou
   * @return overtakesOnYou
   */
  
  @JsonProperty("overtakesOnYou")
  public @Nullable String getOvertakesOnYou() {
    return overtakesOnYou;
  }

  public void setOvertakesOnYou(@Nullable String overtakesOnYou) {
    this.overtakesOnYou = overtakesOnYou;
  }

  public RaceAnalysisResponse graphCode(@Nullable String graphCode) {
    this.graphCode = graphCode;
    return this;
  }

  /**
   * Get graphCode
   * @return graphCode
   */
  
  @JsonProperty("graphCode")
  public @Nullable String getGraphCode() {
    return graphCode;
  }

  public void setGraphCode(@Nullable String graphCode) {
    this.graphCode = graphCode;
  }

  public RaceAnalysisResponse transactions(List<@Valid RaceAnalysisResponseTransactionsInner> transactions) {
    this.transactions = transactions;
    return this;
  }

  public RaceAnalysisResponse addTransactionsItem(RaceAnalysisResponseTransactionsInner transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
   */
  @Valid 
  @JsonProperty("transactions")
  public List<@Valid RaceAnalysisResponseTransactionsInner> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<@Valid RaceAnalysisResponseTransactionsInner> transactions) {
    this.transactions = transactions;
  }

  public RaceAnalysisResponse total(@Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  
  @JsonProperty("total")
  public @Nullable Integer getTotal() {
    return total;
  }

  public void setTotal(@Nullable Integer total) {
    this.total = total;
  }

  public RaceAnalysisResponse currentBalance(@Nullable Integer currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Get currentBalance
   * @return currentBalance
   */
  
  @JsonProperty("currentBalance")
  public @Nullable Integer getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(@Nullable Integer currentBalance) {
    this.currentBalance = currentBalance;
  }

  public RaceAnalysisResponse chassis(@Nullable RaceAnalysisResponseChassis chassis) {
    this.chassis = chassis;
    return this;
  }

  /**
   * Get chassis
   * @return chassis
   */
  @Valid 
  @JsonProperty("chassis")
  public @Nullable RaceAnalysisResponseChassis getChassis() {
    return chassis;
  }

  public void setChassis(@Nullable RaceAnalysisResponseChassis chassis) {
    this.chassis = chassis;
  }

  public RaceAnalysisResponse engine(@Nullable RaceAnalysisResponseChassis engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   */
  @Valid 
  @JsonProperty("engine")
  public @Nullable RaceAnalysisResponseChassis getEngine() {
    return engine;
  }

  public void setEngine(@Nullable RaceAnalysisResponseChassis engine) {
    this.engine = engine;
  }

  public RaceAnalysisResponse fwing(@Nullable RaceAnalysisResponseChassis fwing) {
    this.fwing = fwing;
    return this;
  }

  /**
   * Get fwing
   * @return fwing
   */
  @Valid 
  @JsonProperty("FWing")
  public @Nullable RaceAnalysisResponseChassis getFwing() {
    return fwing;
  }

  public void setFwing(@Nullable RaceAnalysisResponseChassis fwing) {
    this.fwing = fwing;
  }

  public RaceAnalysisResponse rwing(@Nullable RaceAnalysisResponseChassis rwing) {
    this.rwing = rwing;
    return this;
  }

  /**
   * Get rwing
   * @return rwing
   */
  @Valid 
  @JsonProperty("RWing")
  public @Nullable RaceAnalysisResponseChassis getRwing() {
    return rwing;
  }

  public void setRwing(@Nullable RaceAnalysisResponseChassis rwing) {
    this.rwing = rwing;
  }

  public RaceAnalysisResponse underbody(@Nullable RaceAnalysisResponseChassis underbody) {
    this.underbody = underbody;
    return this;
  }

  /**
   * Get underbody
   * @return underbody
   */
  @Valid 
  @JsonProperty("underbody")
  public @Nullable RaceAnalysisResponseChassis getUnderbody() {
    return underbody;
  }

  public void setUnderbody(@Nullable RaceAnalysisResponseChassis underbody) {
    this.underbody = underbody;
  }

  public RaceAnalysisResponse sidepods(@Nullable RaceAnalysisResponseChassis sidepods) {
    this.sidepods = sidepods;
    return this;
  }

  /**
   * Get sidepods
   * @return sidepods
   */
  @Valid 
  @JsonProperty("sidepods")
  public @Nullable RaceAnalysisResponseChassis getSidepods() {
    return sidepods;
  }

  public void setSidepods(@Nullable RaceAnalysisResponseChassis sidepods) {
    this.sidepods = sidepods;
  }

  public RaceAnalysisResponse cooling(@Nullable RaceAnalysisResponseChassis cooling) {
    this.cooling = cooling;
    return this;
  }

  /**
   * Get cooling
   * @return cooling
   */
  @Valid 
  @JsonProperty("cooling")
  public @Nullable RaceAnalysisResponseChassis getCooling() {
    return cooling;
  }

  public void setCooling(@Nullable RaceAnalysisResponseChassis cooling) {
    this.cooling = cooling;
  }

  public RaceAnalysisResponse gear(@Nullable RaceAnalysisResponseChassis gear) {
    this.gear = gear;
    return this;
  }

  /**
   * Get gear
   * @return gear
   */
  @Valid 
  @JsonProperty("gear")
  public @Nullable RaceAnalysisResponseChassis getGear() {
    return gear;
  }

  public void setGear(@Nullable RaceAnalysisResponseChassis gear) {
    this.gear = gear;
  }

  public RaceAnalysisResponse brakes(@Nullable RaceAnalysisResponseChassis brakes) {
    this.brakes = brakes;
    return this;
  }

  /**
   * Get brakes
   * @return brakes
   */
  @Valid 
  @JsonProperty("brakes")
  public @Nullable RaceAnalysisResponseChassis getBrakes() {
    return brakes;
  }

  public void setBrakes(@Nullable RaceAnalysisResponseChassis brakes) {
    this.brakes = brakes;
  }

  public RaceAnalysisResponse susp(@Nullable RaceAnalysisResponseChassis susp) {
    this.susp = susp;
    return this;
  }

  /**
   * Get susp
   * @return susp
   */
  @Valid 
  @JsonProperty("susp")
  public @Nullable RaceAnalysisResponseChassis getSusp() {
    return susp;
  }

  public void setSusp(@Nullable RaceAnalysisResponseChassis susp) {
    this.susp = susp;
  }

  public RaceAnalysisResponse electronics(@Nullable RaceAnalysisResponseChassis electronics) {
    this.electronics = electronics;
    return this;
  }

  /**
   * Get electronics
   * @return electronics
   */
  @Valid 
  @JsonProperty("electronics")
  public @Nullable RaceAnalysisResponseChassis getElectronics() {
    return electronics;
  }

  public void setElectronics(@Nullable RaceAnalysisResponseChassis electronics) {
    this.electronics = electronics;
  }

  public RaceAnalysisResponse laps(List<@Valid RaceAnalysisResponseLapsInner> laps) {
    this.laps = laps;
    return this;
  }

  public RaceAnalysisResponse addLapsItem(RaceAnalysisResponseLapsInner lapsItem) {
    if (this.laps == null) {
      this.laps = new ArrayList<>();
    }
    this.laps.add(lapsItem);
    return this;
  }

  /**
   * Get laps
   * @return laps
   */
  @Valid 
  @JsonProperty("laps")
  public List<@Valid RaceAnalysisResponseLapsInner> getLaps() {
    return laps;
  }

  public void setLaps(List<@Valid RaceAnalysisResponseLapsInner> laps) {
    this.laps = laps;
  }

  public RaceAnalysisResponse pits(List<@Valid RaceAnalysisResponsePitsInner> pits) {
    this.pits = pits;
    return this;
  }

  public RaceAnalysisResponse addPitsItem(RaceAnalysisResponsePitsInner pitsItem) {
    if (this.pits == null) {
      this.pits = new ArrayList<>();
    }
    this.pits.add(pitsItem);
    return this;
  }

  /**
   * Get pits
   * @return pits
   */
  @Valid 
  @JsonProperty("pits")
  public List<@Valid RaceAnalysisResponsePitsInner> getPits() {
    return pits;
  }

  public void setPits(List<@Valid RaceAnalysisResponsePitsInner> pits) {
    this.pits = pits;
  }

  public RaceAnalysisResponse problems(List<@Valid RaceAnalysisResponseProblemsInner> problems) {
    this.problems = problems;
    return this;
  }

  public RaceAnalysisResponse addProblemsItem(RaceAnalysisResponseProblemsInner problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

  /**
   * Get problems
   * @return problems
   */
  @Valid 
  @JsonProperty("problems")
  public List<@Valid RaceAnalysisResponseProblemsInner> getProblems() {
    return problems;
  }

  public void setProblems(List<@Valid RaceAnalysisResponseProblemsInner> problems) {
    this.problems = problems;
  }

  public RaceAnalysisResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    RaceAnalysisResponse raceAnalysisResponse = (RaceAnalysisResponse) o;
    return Objects.equals(this.loadingDataState, raceAnalysisResponse.loadingDataState) &&
        Objects.equals(this.ignoreRefCheck, raceAnalysisResponse.ignoreRefCheck) &&
        Objects.equals(this.segmentSelected, raceAnalysisResponse.segmentSelected) &&
        Objects.equals(this.unlocked, raceAnalysisResponse.unlocked) &&
        Objects.equals(this.selSeasonNb, raceAnalysisResponse.selSeasonNb) &&
        Objects.equals(this.selRaceNb, raceAnalysisResponse.selRaceNb) &&
        Objects.equals(this.group, raceAnalysisResponse.group) &&
        Objects.equals(this.trackName, raceAnalysisResponse.trackName) &&
        Objects.equals(this.isSupporter, raceAnalysisResponse.isSupporter) &&
        Objects.equals(this.trackNatCode, raceAnalysisResponse.trackNatCode) &&
        Objects.equals(this.trackCountry, raceAnalysisResponse.trackCountry) &&
        Objects.equals(this.trackId, raceAnalysisResponse.trackId) &&
        Objects.equals(this.racesToSelect, raceAnalysisResponse.racesToSelect) &&
        Objects.equals(this.practiceLaps, raceAnalysisResponse.practiceLaps) &&
        Objects.equals(this.q1Time, raceAnalysisResponse.q1Time) &&
        Objects.equals(this.q1Pos, raceAnalysisResponse.q1Pos) &&
        Objects.equals(this.selectedLap, raceAnalysisResponse.selectedLap) &&
        Objects.equals(this.q2Time, raceAnalysisResponse.q2Time) &&
        Objects.equals(this.q2Pos, raceAnalysisResponse.q2Pos) &&
        Objects.equals(this.setupsUsed, raceAnalysisResponse.setupsUsed) &&
        Objects.equals(this.q1Risk, raceAnalysisResponse.q1Risk) &&
        Objects.equals(this.q2Risk, raceAnalysisResponse.q2Risk) &&
        Objects.equals(this.startRisk, raceAnalysisResponse.startRisk) &&
        Objects.equals(this.overtakeRisk, raceAnalysisResponse.overtakeRisk) &&
        Objects.equals(this.defendRisk, raceAnalysisResponse.defendRisk) &&
        Objects.equals(this.clearDryRisk, raceAnalysisResponse.clearDryRisk) &&
        Objects.equals(this.clearWetRisk, raceAnalysisResponse.clearWetRisk) &&
        Objects.equals(this.problemRisk, raceAnalysisResponse.problemRisk) &&
        Objects.equals(this.driver, raceAnalysisResponse.driver) &&
        Objects.equals(this.driverChanges, raceAnalysisResponse.driverChanges) &&
        Objects.equals(this.q1Energy, raceAnalysisResponse.q1Energy) &&
        Objects.equals(this.q2Energy, raceAnalysisResponse.q2Energy) &&
        Objects.equals(this.raceEnergy, raceAnalysisResponse.raceEnergy) &&
        Objects.equals(this.carPower, raceAnalysisResponse.carPower) &&
        Objects.equals(this.carHandl, raceAnalysisResponse.carHandl) &&
        Objects.equals(this.carAccel, raceAnalysisResponse.carAccel) &&
        Objects.equals(this.tyreSupplier, raceAnalysisResponse.tyreSupplier) &&
        Objects.equals(this.weather, raceAnalysisResponse.weather) &&
        Objects.equals(this.showWeatherPopover, raceAnalysisResponse.showWeatherPopover) &&
        Objects.equals(this.startFuel, raceAnalysisResponse.startFuel) &&
        Objects.equals(this.finishTyres, raceAnalysisResponse.finishTyres) &&
        Objects.equals(this.finishFuel, raceAnalysisResponse.finishFuel) &&
        Objects.equals(this.otAttempts, raceAnalysisResponse.otAttempts) &&
        Objects.equals(this.overtakes, raceAnalysisResponse.overtakes) &&
        Objects.equals(this.otAttemptsOnYou, raceAnalysisResponse.otAttemptsOnYou) &&
        Objects.equals(this.overtakesOnYou, raceAnalysisResponse.overtakesOnYou) &&
        Objects.equals(this.graphCode, raceAnalysisResponse.graphCode) &&
        Objects.equals(this.transactions, raceAnalysisResponse.transactions) &&
        Objects.equals(this.total, raceAnalysisResponse.total) &&
        Objects.equals(this.currentBalance, raceAnalysisResponse.currentBalance) &&
        Objects.equals(this.chassis, raceAnalysisResponse.chassis) &&
        Objects.equals(this.engine, raceAnalysisResponse.engine) &&
        Objects.equals(this.fwing, raceAnalysisResponse.fwing) &&
        Objects.equals(this.rwing, raceAnalysisResponse.rwing) &&
        Objects.equals(this.underbody, raceAnalysisResponse.underbody) &&
        Objects.equals(this.sidepods, raceAnalysisResponse.sidepods) &&
        Objects.equals(this.cooling, raceAnalysisResponse.cooling) &&
        Objects.equals(this.gear, raceAnalysisResponse.gear) &&
        Objects.equals(this.brakes, raceAnalysisResponse.brakes) &&
        Objects.equals(this.susp, raceAnalysisResponse.susp) &&
        Objects.equals(this.electronics, raceAnalysisResponse.electronics) &&
        Objects.equals(this.laps, raceAnalysisResponse.laps) &&
        Objects.equals(this.pits, raceAnalysisResponse.pits) &&
        Objects.equals(this.problems, raceAnalysisResponse.problems) &&
        Objects.equals(this.apiRequestsRemaining, raceAnalysisResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, ignoreRefCheck, segmentSelected, unlocked, selSeasonNb, selRaceNb, group, trackName, isSupporter, trackNatCode, trackCountry, trackId, racesToSelect, practiceLaps, q1Time, q1Pos, selectedLap, q2Time, q2Pos, setupsUsed, q1Risk, q2Risk, startRisk, overtakeRisk, defendRisk, clearDryRisk, clearWetRisk, problemRisk, driver, driverChanges, q1Energy, q2Energy, raceEnergy, carPower, carHandl, carAccel, tyreSupplier, weather, showWeatherPopover, startFuel, finishTyres, finishFuel, otAttempts, overtakes, otAttemptsOnYou, overtakesOnYou, graphCode, transactions, total, currentBalance, chassis, engine, fwing, rwing, underbody, sidepods, cooling, gear, brakes, susp, electronics, laps, pits, problems, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    ignoreRefCheck: ").append(toIndentedString(ignoreRefCheck)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    unlocked: ").append(toIndentedString(unlocked)).append("\n");
    sb.append("    selSeasonNb: ").append(toIndentedString(selSeasonNb)).append("\n");
    sb.append("    selRaceNb: ").append(toIndentedString(selRaceNb)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    isSupporter: ").append(toIndentedString(isSupporter)).append("\n");
    sb.append("    trackNatCode: ").append(toIndentedString(trackNatCode)).append("\n");
    sb.append("    trackCountry: ").append(toIndentedString(trackCountry)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    racesToSelect: ").append(toIndentedString(racesToSelect)).append("\n");
    sb.append("    practiceLaps: ").append(toIndentedString(practiceLaps)).append("\n");
    sb.append("    q1Time: ").append(toIndentedString(q1Time)).append("\n");
    sb.append("    q1Pos: ").append(toIndentedString(q1Pos)).append("\n");
    sb.append("    selectedLap: ").append(toIndentedString(selectedLap)).append("\n");
    sb.append("    q2Time: ").append(toIndentedString(q2Time)).append("\n");
    sb.append("    q2Pos: ").append(toIndentedString(q2Pos)).append("\n");
    sb.append("    setupsUsed: ").append(toIndentedString(setupsUsed)).append("\n");
    sb.append("    q1Risk: ").append(toIndentedString(q1Risk)).append("\n");
    sb.append("    q2Risk: ").append(toIndentedString(q2Risk)).append("\n");
    sb.append("    startRisk: ").append(toIndentedString(startRisk)).append("\n");
    sb.append("    overtakeRisk: ").append(toIndentedString(overtakeRisk)).append("\n");
    sb.append("    defendRisk: ").append(toIndentedString(defendRisk)).append("\n");
    sb.append("    clearDryRisk: ").append(toIndentedString(clearDryRisk)).append("\n");
    sb.append("    clearWetRisk: ").append(toIndentedString(clearWetRisk)).append("\n");
    sb.append("    problemRisk: ").append(toIndentedString(problemRisk)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverChanges: ").append(toIndentedString(driverChanges)).append("\n");
    sb.append("    q1Energy: ").append(toIndentedString(q1Energy)).append("\n");
    sb.append("    q2Energy: ").append(toIndentedString(q2Energy)).append("\n");
    sb.append("    raceEnergy: ").append(toIndentedString(raceEnergy)).append("\n");
    sb.append("    carPower: ").append(toIndentedString(carPower)).append("\n");
    sb.append("    carHandl: ").append(toIndentedString(carHandl)).append("\n");
    sb.append("    carAccel: ").append(toIndentedString(carAccel)).append("\n");
    sb.append("    tyreSupplier: ").append(toIndentedString(tyreSupplier)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    showWeatherPopover: ").append(toIndentedString(showWeatherPopover)).append("\n");
    sb.append("    startFuel: ").append(toIndentedString(startFuel)).append("\n");
    sb.append("    finishTyres: ").append(toIndentedString(finishTyres)).append("\n");
    sb.append("    finishFuel: ").append(toIndentedString(finishFuel)).append("\n");
    sb.append("    otAttempts: ").append(toIndentedString(otAttempts)).append("\n");
    sb.append("    overtakes: ").append(toIndentedString(overtakes)).append("\n");
    sb.append("    otAttemptsOnYou: ").append(toIndentedString(otAttemptsOnYou)).append("\n");
    sb.append("    overtakesOnYou: ").append(toIndentedString(overtakesOnYou)).append("\n");
    sb.append("    graphCode: ").append(toIndentedString(graphCode)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    fwing: ").append(toIndentedString(fwing)).append("\n");
    sb.append("    rwing: ").append(toIndentedString(rwing)).append("\n");
    sb.append("    underbody: ").append(toIndentedString(underbody)).append("\n");
    sb.append("    sidepods: ").append(toIndentedString(sidepods)).append("\n");
    sb.append("    cooling: ").append(toIndentedString(cooling)).append("\n");
    sb.append("    gear: ").append(toIndentedString(gear)).append("\n");
    sb.append("    brakes: ").append(toIndentedString(brakes)).append("\n");
    sb.append("    susp: ").append(toIndentedString(susp)).append("\n");
    sb.append("    electronics: ").append(toIndentedString(electronics)).append("\n");
    sb.append("    laps: ").append(toIndentedString(laps)).append("\n");
    sb.append("    pits: ").append(toIndentedString(pits)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
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

