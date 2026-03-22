package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.PracticeResponseWeather;
import org.jlobato.gpro.proxy.model.RaceSetupResponseQ1LapData;
import org.jlobato.gpro.proxy.model.RaceSetupResponseShowWeatherPopover;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RaceSetupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceSetupResponse {

  private @Nullable Integer loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String trackName;

  private @Nullable Integer trackId;

  private @Nullable String trackImg;

  private @Nullable String trackNat;

  private @Nullable String trackPower;

  private @Nullable String trackAccel;

  private @Nullable String trackHandl;

  private @Nullable Integer laps;

  @Valid
  private List<Integer> lapsSelect = new ArrayList<>();

  private @Nullable Integer setFWing;

  private @Nullable Integer setRWing;

  private @Nullable Integer setEngine;

  private @Nullable Integer setBrakes;

  private @Nullable Integer setGear;

  private @Nullable Integer setSusp;

  private @Nullable Integer startFuel;

  private @Nullable Integer fuelStop1;

  private @Nullable Integer fuelStop2;

  private @Nullable Integer fuelStop3;

  private @Nullable Integer fuelStop4;

  private @Nullable Integer fuelStop5;

  private @Nullable String startTyres;

  private @Nullable String dryTyres;

  private @Nullable String dryTyreChoice;

  private @Nullable String wetTyres;

  private @Nullable Integer waitPitStartRain;

  private @Nullable Integer waitPitStopRain;

  private @Nullable Integer driEnergy;

  private @Nullable Integer riskOvertake;

  private @Nullable Integer riskBlock;

  private @Nullable Integer riskClearDry;

  private @Nullable Integer riskClearWet;

  private @Nullable Integer riskTechProb;

  private @Nullable String startRisk;

  private @Nullable Integer boostLap1;

  private @Nullable Integer boostLap2;

  private @Nullable Integer boostLap3;

  private @Nullable String teamMateToLet;

  @Valid
  private List<Object> teamMatesInGroup = new ArrayList<>();

  private @Nullable String pitOnTechProb;

  private @Nullable Integer pitOnTechProbLapsRemain;

  private @Nullable String dontRefuelTechPit;

  private @Nullable PracticeResponseWeather weather;

  private @Nullable RaceSetupResponseShowWeatherPopover showWeatherPopover;

  private @Nullable Integer endOfSeason;

  private @Nullable Integer raceInProgress;

  private @Nullable Integer settingsConfirmed;

  private @Nullable Integer showError;

  private @Nullable String errorMsg;

  private @Nullable Integer disableConfirmButton;

  private @Nullable Integer startTyresInvalid;

  private @Nullable Integer wetTyresInvalid;

  private @Nullable Integer dryTyresInvalid;

  private @Nullable Integer fWingInvalid;

  private @Nullable Integer rWingInvalid;

  private @Nullable Integer engInvalid;

  private @Nullable Integer braInvalid;

  private @Nullable Integer gearInvalid;

  private @Nullable Integer suspInvalid;

  private @Nullable Integer fuelStartInvalid;

  private @Nullable Integer fuelStop1Invalid;

  private @Nullable Integer fuelStop2Invalid;

  private @Nullable Integer fuelStop3Invalid;

  private @Nullable Integer fuelStop4Invalid;

  private @Nullable Integer fuelStop5Invalid;

  private @Nullable Integer riskClearInvalid;

  private @Nullable Integer riskProbInvalid;

  private @Nullable Integer riskBlockInvalid;

  private @Nullable Integer riskOverInvalid;

  private @Nullable Integer riskWetInvalid;

  private @Nullable Integer pitOnTechProbLapsInvalid;

  private @Nullable Integer lapsWaitRainStartInvalid;

  private @Nullable Integer lapsWaitRainStopInvalid;

  private @Nullable Integer boostLap1Invalid;

  private @Nullable Integer boostLap2Invalid;

  private @Nullable Integer boostLap3Invalid;

  private @Nullable RaceSetupResponseQ1LapData q1LapData;

  private @Nullable RaceSetupResponseQ1LapData q2LapData;

  private @Nullable Integer isSupporter;

  private @Nullable Integer apiRequestsRemaining;

  public RaceSetupResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public RaceSetupResponse segmentSelected(@Nullable String segmentSelected) {
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

  public RaceSetupResponse trackName(@Nullable String trackName) {
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

  public RaceSetupResponse trackId(@Nullable Integer trackId) {
    this.trackId = trackId;
    return this;
  }

  /**
   * Get trackId
   * @return trackId
   */
  
  @JsonProperty("trackId")
  public @Nullable Integer getTrackId() {
    return trackId;
  }

  public void setTrackId(@Nullable Integer trackId) {
    this.trackId = trackId;
  }

  public RaceSetupResponse trackImg(@Nullable String trackImg) {
    this.trackImg = trackImg;
    return this;
  }

  /**
   * Get trackImg
   * @return trackImg
   */
  
  @JsonProperty("trackImg")
  public @Nullable String getTrackImg() {
    return trackImg;
  }

  public void setTrackImg(@Nullable String trackImg) {
    this.trackImg = trackImg;
  }

  public RaceSetupResponse trackNat(@Nullable String trackNat) {
    this.trackNat = trackNat;
    return this;
  }

  /**
   * Get trackNat
   * @return trackNat
   */
  
  @JsonProperty("trackNat")
  public @Nullable String getTrackNat() {
    return trackNat;
  }

  public void setTrackNat(@Nullable String trackNat) {
    this.trackNat = trackNat;
  }

  public RaceSetupResponse trackPower(@Nullable String trackPower) {
    this.trackPower = trackPower;
    return this;
  }

  /**
   * Get trackPower
   * @return trackPower
   */
  
  @JsonProperty("trackPower")
  public @Nullable String getTrackPower() {
    return trackPower;
  }

  public void setTrackPower(@Nullable String trackPower) {
    this.trackPower = trackPower;
  }

  public RaceSetupResponse trackAccel(@Nullable String trackAccel) {
    this.trackAccel = trackAccel;
    return this;
  }

  /**
   * Get trackAccel
   * @return trackAccel
   */
  
  @JsonProperty("trackAccel")
  public @Nullable String getTrackAccel() {
    return trackAccel;
  }

  public void setTrackAccel(@Nullable String trackAccel) {
    this.trackAccel = trackAccel;
  }

  public RaceSetupResponse trackHandl(@Nullable String trackHandl) {
    this.trackHandl = trackHandl;
    return this;
  }

  /**
   * Get trackHandl
   * @return trackHandl
   */
  
  @JsonProperty("trackHandl")
  public @Nullable String getTrackHandl() {
    return trackHandl;
  }

  public void setTrackHandl(@Nullable String trackHandl) {
    this.trackHandl = trackHandl;
  }

  public RaceSetupResponse laps(@Nullable Integer laps) {
    this.laps = laps;
    return this;
  }

  /**
   * Get laps
   * @return laps
   */
  
  @JsonProperty("laps")
  public @Nullable Integer getLaps() {
    return laps;
  }

  public void setLaps(@Nullable Integer laps) {
    this.laps = laps;
  }

  public RaceSetupResponse lapsSelect(List<Integer> lapsSelect) {
    this.lapsSelect = lapsSelect;
    return this;
  }

  public RaceSetupResponse addLapsSelectItem(Integer lapsSelectItem) {
    if (this.lapsSelect == null) {
      this.lapsSelect = new ArrayList<>();
    }
    this.lapsSelect.add(lapsSelectItem);
    return this;
  }

  /**
   * Get lapsSelect
   * @return lapsSelect
   */
  
  @JsonProperty("lapsSelect")
  public List<Integer> getLapsSelect() {
    return lapsSelect;
  }

  public void setLapsSelect(List<Integer> lapsSelect) {
    this.lapsSelect = lapsSelect;
  }

  public RaceSetupResponse setFWing(@Nullable Integer setFWing) {
    this.setFWing = setFWing;
    return this;
  }

  /**
   * Get setFWing
   * @return setFWing
   */
  
  @JsonProperty("setFWing")
  public @Nullable Integer getSetFWing() {
    return setFWing;
  }

  public void setSetFWing(@Nullable Integer setFWing) {
    this.setFWing = setFWing;
  }

  public RaceSetupResponse setRWing(@Nullable Integer setRWing) {
    this.setRWing = setRWing;
    return this;
  }

  /**
   * Get setRWing
   * @return setRWing
   */
  
  @JsonProperty("setRWing")
  public @Nullable Integer getSetRWing() {
    return setRWing;
  }

  public void setSetRWing(@Nullable Integer setRWing) {
    this.setRWing = setRWing;
  }

  public RaceSetupResponse setEngine(@Nullable Integer setEngine) {
    this.setEngine = setEngine;
    return this;
  }

  /**
   * Get setEngine
   * @return setEngine
   */
  
  @JsonProperty("setEngine")
  public @Nullable Integer getSetEngine() {
    return setEngine;
  }

  public void setSetEngine(@Nullable Integer setEngine) {
    this.setEngine = setEngine;
  }

  public RaceSetupResponse setBrakes(@Nullable Integer setBrakes) {
    this.setBrakes = setBrakes;
    return this;
  }

  /**
   * Get setBrakes
   * @return setBrakes
   */
  
  @JsonProperty("setBrakes")
  public @Nullable Integer getSetBrakes() {
    return setBrakes;
  }

  public void setSetBrakes(@Nullable Integer setBrakes) {
    this.setBrakes = setBrakes;
  }

  public RaceSetupResponse setGear(@Nullable Integer setGear) {
    this.setGear = setGear;
    return this;
  }

  /**
   * Get setGear
   * @return setGear
   */
  
  @JsonProperty("setGear")
  public @Nullable Integer getSetGear() {
    return setGear;
  }

  public void setSetGear(@Nullable Integer setGear) {
    this.setGear = setGear;
  }

  public RaceSetupResponse setSusp(@Nullable Integer setSusp) {
    this.setSusp = setSusp;
    return this;
  }

  /**
   * Get setSusp
   * @return setSusp
   */
  
  @JsonProperty("setSusp")
  public @Nullable Integer getSetSusp() {
    return setSusp;
  }

  public void setSetSusp(@Nullable Integer setSusp) {
    this.setSusp = setSusp;
  }

  public RaceSetupResponse startFuel(@Nullable Integer startFuel) {
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

  public RaceSetupResponse fuelStop1(@Nullable Integer fuelStop1) {
    this.fuelStop1 = fuelStop1;
    return this;
  }

  /**
   * Get fuelStop1
   * @return fuelStop1
   */
  
  @JsonProperty("fuelStop1")
  public @Nullable Integer getFuelStop1() {
    return fuelStop1;
  }

  public void setFuelStop1(@Nullable Integer fuelStop1) {
    this.fuelStop1 = fuelStop1;
  }

  public RaceSetupResponse fuelStop2(@Nullable Integer fuelStop2) {
    this.fuelStop2 = fuelStop2;
    return this;
  }

  /**
   * Get fuelStop2
   * @return fuelStop2
   */
  
  @JsonProperty("fuelStop2")
  public @Nullable Integer getFuelStop2() {
    return fuelStop2;
  }

  public void setFuelStop2(@Nullable Integer fuelStop2) {
    this.fuelStop2 = fuelStop2;
  }

  public RaceSetupResponse fuelStop3(@Nullable Integer fuelStop3) {
    this.fuelStop3 = fuelStop3;
    return this;
  }

  /**
   * Get fuelStop3
   * @return fuelStop3
   */
  
  @JsonProperty("fuelStop3")
  public @Nullable Integer getFuelStop3() {
    return fuelStop3;
  }

  public void setFuelStop3(@Nullable Integer fuelStop3) {
    this.fuelStop3 = fuelStop3;
  }

  public RaceSetupResponse fuelStop4(@Nullable Integer fuelStop4) {
    this.fuelStop4 = fuelStop4;
    return this;
  }

  /**
   * Get fuelStop4
   * @return fuelStop4
   */
  
  @JsonProperty("fuelStop4")
  public @Nullable Integer getFuelStop4() {
    return fuelStop4;
  }

  public void setFuelStop4(@Nullable Integer fuelStop4) {
    this.fuelStop4 = fuelStop4;
  }

  public RaceSetupResponse fuelStop5(@Nullable Integer fuelStop5) {
    this.fuelStop5 = fuelStop5;
    return this;
  }

  /**
   * Get fuelStop5
   * @return fuelStop5
   */
  
  @JsonProperty("fuelStop5")
  public @Nullable Integer getFuelStop5() {
    return fuelStop5;
  }

  public void setFuelStop5(@Nullable Integer fuelStop5) {
    this.fuelStop5 = fuelStop5;
  }

  public RaceSetupResponse startTyres(@Nullable String startTyres) {
    this.startTyres = startTyres;
    return this;
  }

  /**
   * Get startTyres
   * @return startTyres
   */
  
  @JsonProperty("startTyres")
  public @Nullable String getStartTyres() {
    return startTyres;
  }

  public void setStartTyres(@Nullable String startTyres) {
    this.startTyres = startTyres;
  }

  public RaceSetupResponse dryTyres(@Nullable String dryTyres) {
    this.dryTyres = dryTyres;
    return this;
  }

  /**
   * Get dryTyres
   * @return dryTyres
   */
  
  @JsonProperty("dryTyres")
  public @Nullable String getDryTyres() {
    return dryTyres;
  }

  public void setDryTyres(@Nullable String dryTyres) {
    this.dryTyres = dryTyres;
  }

  public RaceSetupResponse dryTyreChoice(@Nullable String dryTyreChoice) {
    this.dryTyreChoice = dryTyreChoice;
    return this;
  }

  /**
   * Get dryTyreChoice
   * @return dryTyreChoice
   */
  
  @JsonProperty("dryTyreChoice")
  public @Nullable String getDryTyreChoice() {
    return dryTyreChoice;
  }

  public void setDryTyreChoice(@Nullable String dryTyreChoice) {
    this.dryTyreChoice = dryTyreChoice;
  }

  public RaceSetupResponse wetTyres(@Nullable String wetTyres) {
    this.wetTyres = wetTyres;
    return this;
  }

  /**
   * Get wetTyres
   * @return wetTyres
   */
  
  @JsonProperty("wetTyres")
  public @Nullable String getWetTyres() {
    return wetTyres;
  }

  public void setWetTyres(@Nullable String wetTyres) {
    this.wetTyres = wetTyres;
  }

  public RaceSetupResponse waitPitStartRain(@Nullable Integer waitPitStartRain) {
    this.waitPitStartRain = waitPitStartRain;
    return this;
  }

  /**
   * Get waitPitStartRain
   * @return waitPitStartRain
   */
  
  @JsonProperty("waitPitStartRain")
  public @Nullable Integer getWaitPitStartRain() {
    return waitPitStartRain;
  }

  public void setWaitPitStartRain(@Nullable Integer waitPitStartRain) {
    this.waitPitStartRain = waitPitStartRain;
  }

  public RaceSetupResponse waitPitStopRain(@Nullable Integer waitPitStopRain) {
    this.waitPitStopRain = waitPitStopRain;
    return this;
  }

  /**
   * Get waitPitStopRain
   * @return waitPitStopRain
   */
  
  @JsonProperty("waitPitStopRain")
  public @Nullable Integer getWaitPitStopRain() {
    return waitPitStopRain;
  }

  public void setWaitPitStopRain(@Nullable Integer waitPitStopRain) {
    this.waitPitStopRain = waitPitStopRain;
  }

  public RaceSetupResponse driEnergy(@Nullable Integer driEnergy) {
    this.driEnergy = driEnergy;
    return this;
  }

  /**
   * Get driEnergy
   * @return driEnergy
   */
  
  @JsonProperty("driEnergy")
  public @Nullable Integer getDriEnergy() {
    return driEnergy;
  }

  public void setDriEnergy(@Nullable Integer driEnergy) {
    this.driEnergy = driEnergy;
  }

  public RaceSetupResponse riskOvertake(@Nullable Integer riskOvertake) {
    this.riskOvertake = riskOvertake;
    return this;
  }

  /**
   * Get riskOvertake
   * @return riskOvertake
   */
  
  @JsonProperty("riskOvertake")
  public @Nullable Integer getRiskOvertake() {
    return riskOvertake;
  }

  public void setRiskOvertake(@Nullable Integer riskOvertake) {
    this.riskOvertake = riskOvertake;
  }

  public RaceSetupResponse riskBlock(@Nullable Integer riskBlock) {
    this.riskBlock = riskBlock;
    return this;
  }

  /**
   * Get riskBlock
   * @return riskBlock
   */
  
  @JsonProperty("riskBlock")
  public @Nullable Integer getRiskBlock() {
    return riskBlock;
  }

  public void setRiskBlock(@Nullable Integer riskBlock) {
    this.riskBlock = riskBlock;
  }

  public RaceSetupResponse riskClearDry(@Nullable Integer riskClearDry) {
    this.riskClearDry = riskClearDry;
    return this;
  }

  /**
   * Get riskClearDry
   * @return riskClearDry
   */
  
  @JsonProperty("riskClearDry")
  public @Nullable Integer getRiskClearDry() {
    return riskClearDry;
  }

  public void setRiskClearDry(@Nullable Integer riskClearDry) {
    this.riskClearDry = riskClearDry;
  }

  public RaceSetupResponse riskClearWet(@Nullable Integer riskClearWet) {
    this.riskClearWet = riskClearWet;
    return this;
  }

  /**
   * Get riskClearWet
   * @return riskClearWet
   */
  
  @JsonProperty("riskClearWet")
  public @Nullable Integer getRiskClearWet() {
    return riskClearWet;
  }

  public void setRiskClearWet(@Nullable Integer riskClearWet) {
    this.riskClearWet = riskClearWet;
  }

  public RaceSetupResponse riskTechProb(@Nullable Integer riskTechProb) {
    this.riskTechProb = riskTechProb;
    return this;
  }

  /**
   * Get riskTechProb
   * @return riskTechProb
   */
  
  @JsonProperty("riskTechProb")
  public @Nullable Integer getRiskTechProb() {
    return riskTechProb;
  }

  public void setRiskTechProb(@Nullable Integer riskTechProb) {
    this.riskTechProb = riskTechProb;
  }

  public RaceSetupResponse startRisk(@Nullable String startRisk) {
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

  public RaceSetupResponse boostLap1(@Nullable Integer boostLap1) {
    this.boostLap1 = boostLap1;
    return this;
  }

  /**
   * Get boostLap1
   * @return boostLap1
   */
  
  @JsonProperty("boostLap1")
  public @Nullable Integer getBoostLap1() {
    return boostLap1;
  }

  public void setBoostLap1(@Nullable Integer boostLap1) {
    this.boostLap1 = boostLap1;
  }

  public RaceSetupResponse boostLap2(@Nullable Integer boostLap2) {
    this.boostLap2 = boostLap2;
    return this;
  }

  /**
   * Get boostLap2
   * @return boostLap2
   */
  
  @JsonProperty("boostLap2")
  public @Nullable Integer getBoostLap2() {
    return boostLap2;
  }

  public void setBoostLap2(@Nullable Integer boostLap2) {
    this.boostLap2 = boostLap2;
  }

  public RaceSetupResponse boostLap3(@Nullable Integer boostLap3) {
    this.boostLap3 = boostLap3;
    return this;
  }

  /**
   * Get boostLap3
   * @return boostLap3
   */
  
  @JsonProperty("boostLap3")
  public @Nullable Integer getBoostLap3() {
    return boostLap3;
  }

  public void setBoostLap3(@Nullable Integer boostLap3) {
    this.boostLap3 = boostLap3;
  }

  public RaceSetupResponse teamMateToLet(@Nullable String teamMateToLet) {
    this.teamMateToLet = teamMateToLet;
    return this;
  }

  /**
   * Get teamMateToLet
   * @return teamMateToLet
   */
  
  @JsonProperty("teamMateToLet")
  public @Nullable String getTeamMateToLet() {
    return teamMateToLet;
  }

  public void setTeamMateToLet(@Nullable String teamMateToLet) {
    this.teamMateToLet = teamMateToLet;
  }

  public RaceSetupResponse teamMatesInGroup(List<Object> teamMatesInGroup) {
    this.teamMatesInGroup = teamMatesInGroup;
    return this;
  }

  public RaceSetupResponse addTeamMatesInGroupItem(Object teamMatesInGroupItem) {
    if (this.teamMatesInGroup == null) {
      this.teamMatesInGroup = new ArrayList<>();
    }
    this.teamMatesInGroup.add(teamMatesInGroupItem);
    return this;
  }

  /**
   * Get teamMatesInGroup
   * @return teamMatesInGroup
   */
  
  @JsonProperty("teamMatesInGroup")
  public List<Object> getTeamMatesInGroup() {
    return teamMatesInGroup;
  }

  public void setTeamMatesInGroup(List<Object> teamMatesInGroup) {
    this.teamMatesInGroup = teamMatesInGroup;
  }

  public RaceSetupResponse pitOnTechProb(@Nullable String pitOnTechProb) {
    this.pitOnTechProb = pitOnTechProb;
    return this;
  }

  /**
   * Get pitOnTechProb
   * @return pitOnTechProb
   */
  
  @JsonProperty("pitOnTechProb")
  public @Nullable String getPitOnTechProb() {
    return pitOnTechProb;
  }

  public void setPitOnTechProb(@Nullable String pitOnTechProb) {
    this.pitOnTechProb = pitOnTechProb;
  }

  public RaceSetupResponse pitOnTechProbLapsRemain(@Nullable Integer pitOnTechProbLapsRemain) {
    this.pitOnTechProbLapsRemain = pitOnTechProbLapsRemain;
    return this;
  }

  /**
   * Get pitOnTechProbLapsRemain
   * @return pitOnTechProbLapsRemain
   */
  
  @JsonProperty("pitOnTechProbLapsRemain")
  public @Nullable Integer getPitOnTechProbLapsRemain() {
    return pitOnTechProbLapsRemain;
  }

  public void setPitOnTechProbLapsRemain(@Nullable Integer pitOnTechProbLapsRemain) {
    this.pitOnTechProbLapsRemain = pitOnTechProbLapsRemain;
  }

  public RaceSetupResponse dontRefuelTechPit(@Nullable String dontRefuelTechPit) {
    this.dontRefuelTechPit = dontRefuelTechPit;
    return this;
  }

  /**
   * Get dontRefuelTechPit
   * @return dontRefuelTechPit
   */
  
  @JsonProperty("dontRefuelTechPit")
  public @Nullable String getDontRefuelTechPit() {
    return dontRefuelTechPit;
  }

  public void setDontRefuelTechPit(@Nullable String dontRefuelTechPit) {
    this.dontRefuelTechPit = dontRefuelTechPit;
  }

  public RaceSetupResponse weather(@Nullable PracticeResponseWeather weather) {
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

  public RaceSetupResponse showWeatherPopover(@Nullable RaceSetupResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
    return this;
  }

  /**
   * Get showWeatherPopover
   * @return showWeatherPopover
   */
  @Valid 
  @JsonProperty("showWeatherPopover")
  public @Nullable RaceSetupResponseShowWeatherPopover getShowWeatherPopover() {
    return showWeatherPopover;
  }

  public void setShowWeatherPopover(@Nullable RaceSetupResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
  }

  public RaceSetupResponse endOfSeason(@Nullable Integer endOfSeason) {
    this.endOfSeason = endOfSeason;
    return this;
  }

  /**
   * Get endOfSeason
   * @return endOfSeason
   */
  
  @JsonProperty("endOfSeason")
  public @Nullable Integer getEndOfSeason() {
    return endOfSeason;
  }

  public void setEndOfSeason(@Nullable Integer endOfSeason) {
    this.endOfSeason = endOfSeason;
  }

  public RaceSetupResponse raceInProgress(@Nullable Integer raceInProgress) {
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

  public RaceSetupResponse settingsConfirmed(@Nullable Integer settingsConfirmed) {
    this.settingsConfirmed = settingsConfirmed;
    return this;
  }

  /**
   * Get settingsConfirmed
   * @return settingsConfirmed
   */
  
  @JsonProperty("settingsConfirmed")
  public @Nullable Integer getSettingsConfirmed() {
    return settingsConfirmed;
  }

  public void setSettingsConfirmed(@Nullable Integer settingsConfirmed) {
    this.settingsConfirmed = settingsConfirmed;
  }

  public RaceSetupResponse showError(@Nullable Integer showError) {
    this.showError = showError;
    return this;
  }

  /**
   * Get showError
   * @return showError
   */
  
  @JsonProperty("showError")
  public @Nullable Integer getShowError() {
    return showError;
  }

  public void setShowError(@Nullable Integer showError) {
    this.showError = showError;
  }

  public RaceSetupResponse errorMsg(@Nullable String errorMsg) {
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

  public RaceSetupResponse disableConfirmButton(@Nullable Integer disableConfirmButton) {
    this.disableConfirmButton = disableConfirmButton;
    return this;
  }

  /**
   * Get disableConfirmButton
   * @return disableConfirmButton
   */
  
  @JsonProperty("disableConfirmButton")
  public @Nullable Integer getDisableConfirmButton() {
    return disableConfirmButton;
  }

  public void setDisableConfirmButton(@Nullable Integer disableConfirmButton) {
    this.disableConfirmButton = disableConfirmButton;
  }

  public RaceSetupResponse startTyresInvalid(@Nullable Integer startTyresInvalid) {
    this.startTyresInvalid = startTyresInvalid;
    return this;
  }

  /**
   * Get startTyresInvalid
   * @return startTyresInvalid
   */
  
  @JsonProperty("startTyresInvalid")
  public @Nullable Integer getStartTyresInvalid() {
    return startTyresInvalid;
  }

  public void setStartTyresInvalid(@Nullable Integer startTyresInvalid) {
    this.startTyresInvalid = startTyresInvalid;
  }

  public RaceSetupResponse wetTyresInvalid(@Nullable Integer wetTyresInvalid) {
    this.wetTyresInvalid = wetTyresInvalid;
    return this;
  }

  /**
   * Get wetTyresInvalid
   * @return wetTyresInvalid
   */
  
  @JsonProperty("wetTyresInvalid")
  public @Nullable Integer getWetTyresInvalid() {
    return wetTyresInvalid;
  }

  public void setWetTyresInvalid(@Nullable Integer wetTyresInvalid) {
    this.wetTyresInvalid = wetTyresInvalid;
  }

  public RaceSetupResponse dryTyresInvalid(@Nullable Integer dryTyresInvalid) {
    this.dryTyresInvalid = dryTyresInvalid;
    return this;
  }

  /**
   * Get dryTyresInvalid
   * @return dryTyresInvalid
   */
  
  @JsonProperty("dryTyresInvalid")
  public @Nullable Integer getDryTyresInvalid() {
    return dryTyresInvalid;
  }

  public void setDryTyresInvalid(@Nullable Integer dryTyresInvalid) {
    this.dryTyresInvalid = dryTyresInvalid;
  }

  public RaceSetupResponse fWingInvalid(@Nullable Integer fWingInvalid) {
    this.fWingInvalid = fWingInvalid;
    return this;
  }

  /**
   * Get fWingInvalid
   * @return fWingInvalid
   */
  
  @JsonProperty("fWingInvalid")
  public @Nullable Integer getfWingInvalid() {
    return fWingInvalid;
  }

  public void setfWingInvalid(@Nullable Integer fWingInvalid) {
    this.fWingInvalid = fWingInvalid;
  }

  public RaceSetupResponse rWingInvalid(@Nullable Integer rWingInvalid) {
    this.rWingInvalid = rWingInvalid;
    return this;
  }

  /**
   * Get rWingInvalid
   * @return rWingInvalid
   */
  
  @JsonProperty("rWingInvalid")
  public @Nullable Integer getrWingInvalid() {
    return rWingInvalid;
  }

  public void setrWingInvalid(@Nullable Integer rWingInvalid) {
    this.rWingInvalid = rWingInvalid;
  }

  public RaceSetupResponse engInvalid(@Nullable Integer engInvalid) {
    this.engInvalid = engInvalid;
    return this;
  }

  /**
   * Get engInvalid
   * @return engInvalid
   */
  
  @JsonProperty("engInvalid")
  public @Nullable Integer getEngInvalid() {
    return engInvalid;
  }

  public void setEngInvalid(@Nullable Integer engInvalid) {
    this.engInvalid = engInvalid;
  }

  public RaceSetupResponse braInvalid(@Nullable Integer braInvalid) {
    this.braInvalid = braInvalid;
    return this;
  }

  /**
   * Get braInvalid
   * @return braInvalid
   */
  
  @JsonProperty("braInvalid")
  public @Nullable Integer getBraInvalid() {
    return braInvalid;
  }

  public void setBraInvalid(@Nullable Integer braInvalid) {
    this.braInvalid = braInvalid;
  }

  public RaceSetupResponse gearInvalid(@Nullable Integer gearInvalid) {
    this.gearInvalid = gearInvalid;
    return this;
  }

  /**
   * Get gearInvalid
   * @return gearInvalid
   */
  
  @JsonProperty("gearInvalid")
  public @Nullable Integer getGearInvalid() {
    return gearInvalid;
  }

  public void setGearInvalid(@Nullable Integer gearInvalid) {
    this.gearInvalid = gearInvalid;
  }

  public RaceSetupResponse suspInvalid(@Nullable Integer suspInvalid) {
    this.suspInvalid = suspInvalid;
    return this;
  }

  /**
   * Get suspInvalid
   * @return suspInvalid
   */
  
  @JsonProperty("suspInvalid")
  public @Nullable Integer getSuspInvalid() {
    return suspInvalid;
  }

  public void setSuspInvalid(@Nullable Integer suspInvalid) {
    this.suspInvalid = suspInvalid;
  }

  public RaceSetupResponse fuelStartInvalid(@Nullable Integer fuelStartInvalid) {
    this.fuelStartInvalid = fuelStartInvalid;
    return this;
  }

  /**
   * Get fuelStartInvalid
   * @return fuelStartInvalid
   */
  
  @JsonProperty("FuelStartInvalid")
  public @Nullable Integer getFuelStartInvalid() {
    return fuelStartInvalid;
  }

  public void setFuelStartInvalid(@Nullable Integer fuelStartInvalid) {
    this.fuelStartInvalid = fuelStartInvalid;
  }

  public RaceSetupResponse fuelStop1Invalid(@Nullable Integer fuelStop1Invalid) {
    this.fuelStop1Invalid = fuelStop1Invalid;
    return this;
  }

  /**
   * Get fuelStop1Invalid
   * @return fuelStop1Invalid
   */
  
  @JsonProperty("FuelStop1Invalid")
  public @Nullable Integer getFuelStop1Invalid() {
    return fuelStop1Invalid;
  }

  public void setFuelStop1Invalid(@Nullable Integer fuelStop1Invalid) {
    this.fuelStop1Invalid = fuelStop1Invalid;
  }

  public RaceSetupResponse fuelStop2Invalid(@Nullable Integer fuelStop2Invalid) {
    this.fuelStop2Invalid = fuelStop2Invalid;
    return this;
  }

  /**
   * Get fuelStop2Invalid
   * @return fuelStop2Invalid
   */
  
  @JsonProperty("FuelStop2Invalid")
  public @Nullable Integer getFuelStop2Invalid() {
    return fuelStop2Invalid;
  }

  public void setFuelStop2Invalid(@Nullable Integer fuelStop2Invalid) {
    this.fuelStop2Invalid = fuelStop2Invalid;
  }

  public RaceSetupResponse fuelStop3Invalid(@Nullable Integer fuelStop3Invalid) {
    this.fuelStop3Invalid = fuelStop3Invalid;
    return this;
  }

  /**
   * Get fuelStop3Invalid
   * @return fuelStop3Invalid
   */
  
  @JsonProperty("FuelStop3Invalid")
  public @Nullable Integer getFuelStop3Invalid() {
    return fuelStop3Invalid;
  }

  public void setFuelStop3Invalid(@Nullable Integer fuelStop3Invalid) {
    this.fuelStop3Invalid = fuelStop3Invalid;
  }

  public RaceSetupResponse fuelStop4Invalid(@Nullable Integer fuelStop4Invalid) {
    this.fuelStop4Invalid = fuelStop4Invalid;
    return this;
  }

  /**
   * Get fuelStop4Invalid
   * @return fuelStop4Invalid
   */
  
  @JsonProperty("FuelStop4Invalid")
  public @Nullable Integer getFuelStop4Invalid() {
    return fuelStop4Invalid;
  }

  public void setFuelStop4Invalid(@Nullable Integer fuelStop4Invalid) {
    this.fuelStop4Invalid = fuelStop4Invalid;
  }

  public RaceSetupResponse fuelStop5Invalid(@Nullable Integer fuelStop5Invalid) {
    this.fuelStop5Invalid = fuelStop5Invalid;
    return this;
  }

  /**
   * Get fuelStop5Invalid
   * @return fuelStop5Invalid
   */
  
  @JsonProperty("FuelStop5Invalid")
  public @Nullable Integer getFuelStop5Invalid() {
    return fuelStop5Invalid;
  }

  public void setFuelStop5Invalid(@Nullable Integer fuelStop5Invalid) {
    this.fuelStop5Invalid = fuelStop5Invalid;
  }

  public RaceSetupResponse riskClearInvalid(@Nullable Integer riskClearInvalid) {
    this.riskClearInvalid = riskClearInvalid;
    return this;
  }

  /**
   * Get riskClearInvalid
   * @return riskClearInvalid
   */
  
  @JsonProperty("riskClearInvalid")
  public @Nullable Integer getRiskClearInvalid() {
    return riskClearInvalid;
  }

  public void setRiskClearInvalid(@Nullable Integer riskClearInvalid) {
    this.riskClearInvalid = riskClearInvalid;
  }

  public RaceSetupResponse riskProbInvalid(@Nullable Integer riskProbInvalid) {
    this.riskProbInvalid = riskProbInvalid;
    return this;
  }

  /**
   * Get riskProbInvalid
   * @return riskProbInvalid
   */
  
  @JsonProperty("riskProbInvalid")
  public @Nullable Integer getRiskProbInvalid() {
    return riskProbInvalid;
  }

  public void setRiskProbInvalid(@Nullable Integer riskProbInvalid) {
    this.riskProbInvalid = riskProbInvalid;
  }

  public RaceSetupResponse riskBlockInvalid(@Nullable Integer riskBlockInvalid) {
    this.riskBlockInvalid = riskBlockInvalid;
    return this;
  }

  /**
   * Get riskBlockInvalid
   * @return riskBlockInvalid
   */
  
  @JsonProperty("riskBlockInvalid")
  public @Nullable Integer getRiskBlockInvalid() {
    return riskBlockInvalid;
  }

  public void setRiskBlockInvalid(@Nullable Integer riskBlockInvalid) {
    this.riskBlockInvalid = riskBlockInvalid;
  }

  public RaceSetupResponse riskOverInvalid(@Nullable Integer riskOverInvalid) {
    this.riskOverInvalid = riskOverInvalid;
    return this;
  }

  /**
   * Get riskOverInvalid
   * @return riskOverInvalid
   */
  
  @JsonProperty("riskOverInvalid")
  public @Nullable Integer getRiskOverInvalid() {
    return riskOverInvalid;
  }

  public void setRiskOverInvalid(@Nullable Integer riskOverInvalid) {
    this.riskOverInvalid = riskOverInvalid;
  }

  public RaceSetupResponse riskWetInvalid(@Nullable Integer riskWetInvalid) {
    this.riskWetInvalid = riskWetInvalid;
    return this;
  }

  /**
   * Get riskWetInvalid
   * @return riskWetInvalid
   */
  
  @JsonProperty("riskWetInvalid")
  public @Nullable Integer getRiskWetInvalid() {
    return riskWetInvalid;
  }

  public void setRiskWetInvalid(@Nullable Integer riskWetInvalid) {
    this.riskWetInvalid = riskWetInvalid;
  }

  public RaceSetupResponse pitOnTechProbLapsInvalid(@Nullable Integer pitOnTechProbLapsInvalid) {
    this.pitOnTechProbLapsInvalid = pitOnTechProbLapsInvalid;
    return this;
  }

  /**
   * Get pitOnTechProbLapsInvalid
   * @return pitOnTechProbLapsInvalid
   */
  
  @JsonProperty("pitOnTechProbLapsInvalid")
  public @Nullable Integer getPitOnTechProbLapsInvalid() {
    return pitOnTechProbLapsInvalid;
  }

  public void setPitOnTechProbLapsInvalid(@Nullable Integer pitOnTechProbLapsInvalid) {
    this.pitOnTechProbLapsInvalid = pitOnTechProbLapsInvalid;
  }

  public RaceSetupResponse lapsWaitRainStartInvalid(@Nullable Integer lapsWaitRainStartInvalid) {
    this.lapsWaitRainStartInvalid = lapsWaitRainStartInvalid;
    return this;
  }

  /**
   * Get lapsWaitRainStartInvalid
   * @return lapsWaitRainStartInvalid
   */
  
  @JsonProperty("lapsWaitRainStartInvalid")
  public @Nullable Integer getLapsWaitRainStartInvalid() {
    return lapsWaitRainStartInvalid;
  }

  public void setLapsWaitRainStartInvalid(@Nullable Integer lapsWaitRainStartInvalid) {
    this.lapsWaitRainStartInvalid = lapsWaitRainStartInvalid;
  }

  public RaceSetupResponse lapsWaitRainStopInvalid(@Nullable Integer lapsWaitRainStopInvalid) {
    this.lapsWaitRainStopInvalid = lapsWaitRainStopInvalid;
    return this;
  }

  /**
   * Get lapsWaitRainStopInvalid
   * @return lapsWaitRainStopInvalid
   */
  
  @JsonProperty("lapsWaitRainStopInvalid")
  public @Nullable Integer getLapsWaitRainStopInvalid() {
    return lapsWaitRainStopInvalid;
  }

  public void setLapsWaitRainStopInvalid(@Nullable Integer lapsWaitRainStopInvalid) {
    this.lapsWaitRainStopInvalid = lapsWaitRainStopInvalid;
  }

  public RaceSetupResponse boostLap1Invalid(@Nullable Integer boostLap1Invalid) {
    this.boostLap1Invalid = boostLap1Invalid;
    return this;
  }

  /**
   * Get boostLap1Invalid
   * @return boostLap1Invalid
   */
  
  @JsonProperty("BoostLap1Invalid")
  public @Nullable Integer getBoostLap1Invalid() {
    return boostLap1Invalid;
  }

  public void setBoostLap1Invalid(@Nullable Integer boostLap1Invalid) {
    this.boostLap1Invalid = boostLap1Invalid;
  }

  public RaceSetupResponse boostLap2Invalid(@Nullable Integer boostLap2Invalid) {
    this.boostLap2Invalid = boostLap2Invalid;
    return this;
  }

  /**
   * Get boostLap2Invalid
   * @return boostLap2Invalid
   */
  
  @JsonProperty("BoostLap2Invalid")
  public @Nullable Integer getBoostLap2Invalid() {
    return boostLap2Invalid;
  }

  public void setBoostLap2Invalid(@Nullable Integer boostLap2Invalid) {
    this.boostLap2Invalid = boostLap2Invalid;
  }

  public RaceSetupResponse boostLap3Invalid(@Nullable Integer boostLap3Invalid) {
    this.boostLap3Invalid = boostLap3Invalid;
    return this;
  }

  /**
   * Get boostLap3Invalid
   * @return boostLap3Invalid
   */
  
  @JsonProperty("BoostLap3Invalid")
  public @Nullable Integer getBoostLap3Invalid() {
    return boostLap3Invalid;
  }

  public void setBoostLap3Invalid(@Nullable Integer boostLap3Invalid) {
    this.boostLap3Invalid = boostLap3Invalid;
  }

  public RaceSetupResponse q1LapData(@Nullable RaceSetupResponseQ1LapData q1LapData) {
    this.q1LapData = q1LapData;
    return this;
  }

  /**
   * Get q1LapData
   * @return q1LapData
   */
  @Valid 
  @JsonProperty("q1LapData")
  public @Nullable RaceSetupResponseQ1LapData getQ1LapData() {
    return q1LapData;
  }

  public void setQ1LapData(@Nullable RaceSetupResponseQ1LapData q1LapData) {
    this.q1LapData = q1LapData;
  }

  public RaceSetupResponse q2LapData(@Nullable RaceSetupResponseQ1LapData q2LapData) {
    this.q2LapData = q2LapData;
    return this;
  }

  /**
   * Get q2LapData
   * @return q2LapData
   */
  @Valid 
  @JsonProperty("q2LapData")
  public @Nullable RaceSetupResponseQ1LapData getQ2LapData() {
    return q2LapData;
  }

  public void setQ2LapData(@Nullable RaceSetupResponseQ1LapData q2LapData) {
    this.q2LapData = q2LapData;
  }

  public RaceSetupResponse isSupporter(@Nullable Integer isSupporter) {
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

  public RaceSetupResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    RaceSetupResponse raceSetupResponse = (RaceSetupResponse) o;
    return Objects.equals(this.loadingDataState, raceSetupResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, raceSetupResponse.segmentSelected) &&
        Objects.equals(this.trackName, raceSetupResponse.trackName) &&
        Objects.equals(this.trackId, raceSetupResponse.trackId) &&
        Objects.equals(this.trackImg, raceSetupResponse.trackImg) &&
        Objects.equals(this.trackNat, raceSetupResponse.trackNat) &&
        Objects.equals(this.trackPower, raceSetupResponse.trackPower) &&
        Objects.equals(this.trackAccel, raceSetupResponse.trackAccel) &&
        Objects.equals(this.trackHandl, raceSetupResponse.trackHandl) &&
        Objects.equals(this.laps, raceSetupResponse.laps) &&
        Objects.equals(this.lapsSelect, raceSetupResponse.lapsSelect) &&
        Objects.equals(this.setFWing, raceSetupResponse.setFWing) &&
        Objects.equals(this.setRWing, raceSetupResponse.setRWing) &&
        Objects.equals(this.setEngine, raceSetupResponse.setEngine) &&
        Objects.equals(this.setBrakes, raceSetupResponse.setBrakes) &&
        Objects.equals(this.setGear, raceSetupResponse.setGear) &&
        Objects.equals(this.setSusp, raceSetupResponse.setSusp) &&
        Objects.equals(this.startFuel, raceSetupResponse.startFuel) &&
        Objects.equals(this.fuelStop1, raceSetupResponse.fuelStop1) &&
        Objects.equals(this.fuelStop2, raceSetupResponse.fuelStop2) &&
        Objects.equals(this.fuelStop3, raceSetupResponse.fuelStop3) &&
        Objects.equals(this.fuelStop4, raceSetupResponse.fuelStop4) &&
        Objects.equals(this.fuelStop5, raceSetupResponse.fuelStop5) &&
        Objects.equals(this.startTyres, raceSetupResponse.startTyres) &&
        Objects.equals(this.dryTyres, raceSetupResponse.dryTyres) &&
        Objects.equals(this.dryTyreChoice, raceSetupResponse.dryTyreChoice) &&
        Objects.equals(this.wetTyres, raceSetupResponse.wetTyres) &&
        Objects.equals(this.waitPitStartRain, raceSetupResponse.waitPitStartRain) &&
        Objects.equals(this.waitPitStopRain, raceSetupResponse.waitPitStopRain) &&
        Objects.equals(this.driEnergy, raceSetupResponse.driEnergy) &&
        Objects.equals(this.riskOvertake, raceSetupResponse.riskOvertake) &&
        Objects.equals(this.riskBlock, raceSetupResponse.riskBlock) &&
        Objects.equals(this.riskClearDry, raceSetupResponse.riskClearDry) &&
        Objects.equals(this.riskClearWet, raceSetupResponse.riskClearWet) &&
        Objects.equals(this.riskTechProb, raceSetupResponse.riskTechProb) &&
        Objects.equals(this.startRisk, raceSetupResponse.startRisk) &&
        Objects.equals(this.boostLap1, raceSetupResponse.boostLap1) &&
        Objects.equals(this.boostLap2, raceSetupResponse.boostLap2) &&
        Objects.equals(this.boostLap3, raceSetupResponse.boostLap3) &&
        Objects.equals(this.teamMateToLet, raceSetupResponse.teamMateToLet) &&
        Objects.equals(this.teamMatesInGroup, raceSetupResponse.teamMatesInGroup) &&
        Objects.equals(this.pitOnTechProb, raceSetupResponse.pitOnTechProb) &&
        Objects.equals(this.pitOnTechProbLapsRemain, raceSetupResponse.pitOnTechProbLapsRemain) &&
        Objects.equals(this.dontRefuelTechPit, raceSetupResponse.dontRefuelTechPit) &&
        Objects.equals(this.weather, raceSetupResponse.weather) &&
        Objects.equals(this.showWeatherPopover, raceSetupResponse.showWeatherPopover) &&
        Objects.equals(this.endOfSeason, raceSetupResponse.endOfSeason) &&
        Objects.equals(this.raceInProgress, raceSetupResponse.raceInProgress) &&
        Objects.equals(this.settingsConfirmed, raceSetupResponse.settingsConfirmed) &&
        Objects.equals(this.showError, raceSetupResponse.showError) &&
        Objects.equals(this.errorMsg, raceSetupResponse.errorMsg) &&
        Objects.equals(this.disableConfirmButton, raceSetupResponse.disableConfirmButton) &&
        Objects.equals(this.startTyresInvalid, raceSetupResponse.startTyresInvalid) &&
        Objects.equals(this.wetTyresInvalid, raceSetupResponse.wetTyresInvalid) &&
        Objects.equals(this.dryTyresInvalid, raceSetupResponse.dryTyresInvalid) &&
        Objects.equals(this.fWingInvalid, raceSetupResponse.fWingInvalid) &&
        Objects.equals(this.rWingInvalid, raceSetupResponse.rWingInvalid) &&
        Objects.equals(this.engInvalid, raceSetupResponse.engInvalid) &&
        Objects.equals(this.braInvalid, raceSetupResponse.braInvalid) &&
        Objects.equals(this.gearInvalid, raceSetupResponse.gearInvalid) &&
        Objects.equals(this.suspInvalid, raceSetupResponse.suspInvalid) &&
        Objects.equals(this.fuelStartInvalid, raceSetupResponse.fuelStartInvalid) &&
        Objects.equals(this.fuelStop1Invalid, raceSetupResponse.fuelStop1Invalid) &&
        Objects.equals(this.fuelStop2Invalid, raceSetupResponse.fuelStop2Invalid) &&
        Objects.equals(this.fuelStop3Invalid, raceSetupResponse.fuelStop3Invalid) &&
        Objects.equals(this.fuelStop4Invalid, raceSetupResponse.fuelStop4Invalid) &&
        Objects.equals(this.fuelStop5Invalid, raceSetupResponse.fuelStop5Invalid) &&
        Objects.equals(this.riskClearInvalid, raceSetupResponse.riskClearInvalid) &&
        Objects.equals(this.riskProbInvalid, raceSetupResponse.riskProbInvalid) &&
        Objects.equals(this.riskBlockInvalid, raceSetupResponse.riskBlockInvalid) &&
        Objects.equals(this.riskOverInvalid, raceSetupResponse.riskOverInvalid) &&
        Objects.equals(this.riskWetInvalid, raceSetupResponse.riskWetInvalid) &&
        Objects.equals(this.pitOnTechProbLapsInvalid, raceSetupResponse.pitOnTechProbLapsInvalid) &&
        Objects.equals(this.lapsWaitRainStartInvalid, raceSetupResponse.lapsWaitRainStartInvalid) &&
        Objects.equals(this.lapsWaitRainStopInvalid, raceSetupResponse.lapsWaitRainStopInvalid) &&
        Objects.equals(this.boostLap1Invalid, raceSetupResponse.boostLap1Invalid) &&
        Objects.equals(this.boostLap2Invalid, raceSetupResponse.boostLap2Invalid) &&
        Objects.equals(this.boostLap3Invalid, raceSetupResponse.boostLap3Invalid) &&
        Objects.equals(this.q1LapData, raceSetupResponse.q1LapData) &&
        Objects.equals(this.q2LapData, raceSetupResponse.q2LapData) &&
        Objects.equals(this.isSupporter, raceSetupResponse.isSupporter) &&
        Objects.equals(this.apiRequestsRemaining, raceSetupResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, trackName, trackId, trackImg, trackNat, trackPower, trackAccel, trackHandl, laps, lapsSelect, setFWing, setRWing, setEngine, setBrakes, setGear, setSusp, startFuel, fuelStop1, fuelStop2, fuelStop3, fuelStop4, fuelStop5, startTyres, dryTyres, dryTyreChoice, wetTyres, waitPitStartRain, waitPitStopRain, driEnergy, riskOvertake, riskBlock, riskClearDry, riskClearWet, riskTechProb, startRisk, boostLap1, boostLap2, boostLap3, teamMateToLet, teamMatesInGroup, pitOnTechProb, pitOnTechProbLapsRemain, dontRefuelTechPit, weather, showWeatherPopover, endOfSeason, raceInProgress, settingsConfirmed, showError, errorMsg, disableConfirmButton, startTyresInvalid, wetTyresInvalid, dryTyresInvalid, fWingInvalid, rWingInvalid, engInvalid, braInvalid, gearInvalid, suspInvalid, fuelStartInvalid, fuelStop1Invalid, fuelStop2Invalid, fuelStop3Invalid, fuelStop4Invalid, fuelStop5Invalid, riskClearInvalid, riskProbInvalid, riskBlockInvalid, riskOverInvalid, riskWetInvalid, pitOnTechProbLapsInvalid, lapsWaitRainStartInvalid, lapsWaitRainStopInvalid, boostLap1Invalid, boostLap2Invalid, boostLap3Invalid, q1LapData, q2LapData, isSupporter, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceSetupResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    trackImg: ").append(toIndentedString(trackImg)).append("\n");
    sb.append("    trackNat: ").append(toIndentedString(trackNat)).append("\n");
    sb.append("    trackPower: ").append(toIndentedString(trackPower)).append("\n");
    sb.append("    trackAccel: ").append(toIndentedString(trackAccel)).append("\n");
    sb.append("    trackHandl: ").append(toIndentedString(trackHandl)).append("\n");
    sb.append("    laps: ").append(toIndentedString(laps)).append("\n");
    sb.append("    lapsSelect: ").append(toIndentedString(lapsSelect)).append("\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEngine: ").append(toIndentedString(setEngine)).append("\n");
    sb.append("    setBrakes: ").append(toIndentedString(setBrakes)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    startFuel: ").append(toIndentedString(startFuel)).append("\n");
    sb.append("    fuelStop1: ").append(toIndentedString(fuelStop1)).append("\n");
    sb.append("    fuelStop2: ").append(toIndentedString(fuelStop2)).append("\n");
    sb.append("    fuelStop3: ").append(toIndentedString(fuelStop3)).append("\n");
    sb.append("    fuelStop4: ").append(toIndentedString(fuelStop4)).append("\n");
    sb.append("    fuelStop5: ").append(toIndentedString(fuelStop5)).append("\n");
    sb.append("    startTyres: ").append(toIndentedString(startTyres)).append("\n");
    sb.append("    dryTyres: ").append(toIndentedString(dryTyres)).append("\n");
    sb.append("    dryTyreChoice: ").append(toIndentedString(dryTyreChoice)).append("\n");
    sb.append("    wetTyres: ").append(toIndentedString(wetTyres)).append("\n");
    sb.append("    waitPitStartRain: ").append(toIndentedString(waitPitStartRain)).append("\n");
    sb.append("    waitPitStopRain: ").append(toIndentedString(waitPitStopRain)).append("\n");
    sb.append("    driEnergy: ").append(toIndentedString(driEnergy)).append("\n");
    sb.append("    riskOvertake: ").append(toIndentedString(riskOvertake)).append("\n");
    sb.append("    riskBlock: ").append(toIndentedString(riskBlock)).append("\n");
    sb.append("    riskClearDry: ").append(toIndentedString(riskClearDry)).append("\n");
    sb.append("    riskClearWet: ").append(toIndentedString(riskClearWet)).append("\n");
    sb.append("    riskTechProb: ").append(toIndentedString(riskTechProb)).append("\n");
    sb.append("    startRisk: ").append(toIndentedString(startRisk)).append("\n");
    sb.append("    boostLap1: ").append(toIndentedString(boostLap1)).append("\n");
    sb.append("    boostLap2: ").append(toIndentedString(boostLap2)).append("\n");
    sb.append("    boostLap3: ").append(toIndentedString(boostLap3)).append("\n");
    sb.append("    teamMateToLet: ").append(toIndentedString(teamMateToLet)).append("\n");
    sb.append("    teamMatesInGroup: ").append(toIndentedString(teamMatesInGroup)).append("\n");
    sb.append("    pitOnTechProb: ").append(toIndentedString(pitOnTechProb)).append("\n");
    sb.append("    pitOnTechProbLapsRemain: ").append(toIndentedString(pitOnTechProbLapsRemain)).append("\n");
    sb.append("    dontRefuelTechPit: ").append(toIndentedString(dontRefuelTechPit)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    showWeatherPopover: ").append(toIndentedString(showWeatherPopover)).append("\n");
    sb.append("    endOfSeason: ").append(toIndentedString(endOfSeason)).append("\n");
    sb.append("    raceInProgress: ").append(toIndentedString(raceInProgress)).append("\n");
    sb.append("    settingsConfirmed: ").append(toIndentedString(settingsConfirmed)).append("\n");
    sb.append("    showError: ").append(toIndentedString(showError)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    disableConfirmButton: ").append(toIndentedString(disableConfirmButton)).append("\n");
    sb.append("    startTyresInvalid: ").append(toIndentedString(startTyresInvalid)).append("\n");
    sb.append("    wetTyresInvalid: ").append(toIndentedString(wetTyresInvalid)).append("\n");
    sb.append("    dryTyresInvalid: ").append(toIndentedString(dryTyresInvalid)).append("\n");
    sb.append("    fWingInvalid: ").append(toIndentedString(fWingInvalid)).append("\n");
    sb.append("    rWingInvalid: ").append(toIndentedString(rWingInvalid)).append("\n");
    sb.append("    engInvalid: ").append(toIndentedString(engInvalid)).append("\n");
    sb.append("    braInvalid: ").append(toIndentedString(braInvalid)).append("\n");
    sb.append("    gearInvalid: ").append(toIndentedString(gearInvalid)).append("\n");
    sb.append("    suspInvalid: ").append(toIndentedString(suspInvalid)).append("\n");
    sb.append("    fuelStartInvalid: ").append(toIndentedString(fuelStartInvalid)).append("\n");
    sb.append("    fuelStop1Invalid: ").append(toIndentedString(fuelStop1Invalid)).append("\n");
    sb.append("    fuelStop2Invalid: ").append(toIndentedString(fuelStop2Invalid)).append("\n");
    sb.append("    fuelStop3Invalid: ").append(toIndentedString(fuelStop3Invalid)).append("\n");
    sb.append("    fuelStop4Invalid: ").append(toIndentedString(fuelStop4Invalid)).append("\n");
    sb.append("    fuelStop5Invalid: ").append(toIndentedString(fuelStop5Invalid)).append("\n");
    sb.append("    riskClearInvalid: ").append(toIndentedString(riskClearInvalid)).append("\n");
    sb.append("    riskProbInvalid: ").append(toIndentedString(riskProbInvalid)).append("\n");
    sb.append("    riskBlockInvalid: ").append(toIndentedString(riskBlockInvalid)).append("\n");
    sb.append("    riskOverInvalid: ").append(toIndentedString(riskOverInvalid)).append("\n");
    sb.append("    riskWetInvalid: ").append(toIndentedString(riskWetInvalid)).append("\n");
    sb.append("    pitOnTechProbLapsInvalid: ").append(toIndentedString(pitOnTechProbLapsInvalid)).append("\n");
    sb.append("    lapsWaitRainStartInvalid: ").append(toIndentedString(lapsWaitRainStartInvalid)).append("\n");
    sb.append("    lapsWaitRainStopInvalid: ").append(toIndentedString(lapsWaitRainStopInvalid)).append("\n");
    sb.append("    boostLap1Invalid: ").append(toIndentedString(boostLap1Invalid)).append("\n");
    sb.append("    boostLap2Invalid: ").append(toIndentedString(boostLap2Invalid)).append("\n");
    sb.append("    boostLap3Invalid: ").append(toIndentedString(boostLap3Invalid)).append("\n");
    sb.append("    q1LapData: ").append(toIndentedString(q1LapData)).append("\n");
    sb.append("    q2LapData: ").append(toIndentedString(q2LapData)).append("\n");
    sb.append("    isSupporter: ").append(toIndentedString(isSupporter)).append("\n");
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

