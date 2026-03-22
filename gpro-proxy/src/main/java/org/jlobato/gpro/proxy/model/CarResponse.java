package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CarResponseChassisOptionsInner;
import org.jlobato.gpro.proxy.model.CarResponseChassisOptionsInnerValue;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CarResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class CarResponse {

  private @Nullable String loadingDataState;

  private @Nullable Integer carPower;

  private @Nullable Integer carHandl;

  private @Nullable Integer carAccel;

  private @Nullable Integer lvlChassis;

  private @Nullable Integer lvlBrakes;

  private @Nullable Integer lvlCooling;

  private @Nullable Integer lvlElectronics;

  private @Nullable Integer lvlEngine;

  private @Nullable Integer lvlFWing;

  private @Nullable Integer lvlRWing;

  private @Nullable Integer lvlGear;

  private @Nullable Integer lvlSidepods;

  private @Nullable Integer lvlSusp;

  private @Nullable Integer lvlUnderbody;

  private @Nullable Integer usaBrakes;

  private @Nullable Integer usaChassis;

  private @Nullable Integer usaCooling;

  private @Nullable Integer usaElectronics;

  private @Nullable Integer usaEngine;

  private @Nullable Integer usaFWing;

  private @Nullable Integer usaGear;

  private @Nullable Integer usaRWing;

  private @Nullable Integer usaSidepods;

  private @Nullable Integer usaSusp;

  private @Nullable Integer usaUnderbody;

  private @Nullable Integer canRepair;

  private @Nullable Integer canUndo;

  private @Nullable Integer endOfSeason;

  private @Nullable Integer raceInProgress;

  private @Nullable Integer updateInProgress;

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> chassisOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> engineOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> fWingOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> rWingOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> underbodyOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> sidepodsOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> coolingOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> gearOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> brakesOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> suspOptions = new ArrayList<>();

  @Valid
  private List<@Valid CarResponseChassisOptionsInner> electronicsOptions = new ArrayList<>();

  private @Nullable CarResponseChassisOptionsInnerValue selectedBrakes;

  private @Nullable CarResponseChassisOptionsInnerValue selectedChassis;

  private @Nullable CarResponseChassisOptionsInnerValue selectedCooling;

  private @Nullable CarResponseChassisOptionsInnerValue selectedElectronics;

  private @Nullable CarResponseChassisOptionsInnerValue selectedEngine;

  private @Nullable CarResponseChassisOptionsInnerValue selectedFWing;

  private @Nullable CarResponseChassisOptionsInnerValue selectedGear;

  private @Nullable CarResponseChassisOptionsInnerValue selectedRWing;

  private @Nullable CarResponseChassisOptionsInnerValue selectedSidepods;

  private @Nullable CarResponseChassisOptionsInnerValue selectedSusp;

  private @Nullable CarResponseChassisOptionsInnerValue selectedUnderbody;

  private @Nullable Integer totalCosts;

  private @Nullable Integer undoCompleted;

  private @Nullable Integer carUpdated;

  private @Nullable Integer cash;

  private @Nullable Boolean showCarUpdateAlert;

  private @Nullable Boolean showUndoAlert;

  private @Nullable Boolean showUndoAlertCredits;

  private @Nullable Boolean showUndoAlertNoCredits;

  private @Nullable BigDecimal credits;

  private @Nullable Integer races;

  private @Nullable Integer apiRequestsRemaining;

  public CarResponse loadingDataState(@Nullable String loadingDataState) {
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

  public CarResponse carPower(@Nullable Integer carPower) {
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

  public CarResponse carHandl(@Nullable Integer carHandl) {
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

  public CarResponse carAccel(@Nullable Integer carAccel) {
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

  public CarResponse lvlChassis(@Nullable Integer lvlChassis) {
    this.lvlChassis = lvlChassis;
    return this;
  }

  /**
   * Get lvlChassis
   * @return lvlChassis
   */
  
  @JsonProperty("lvlChassis")
  public @Nullable Integer getLvlChassis() {
    return lvlChassis;
  }

  public void setLvlChassis(@Nullable Integer lvlChassis) {
    this.lvlChassis = lvlChassis;
  }

  public CarResponse lvlBrakes(@Nullable Integer lvlBrakes) {
    this.lvlBrakes = lvlBrakes;
    return this;
  }

  /**
   * Get lvlBrakes
   * @return lvlBrakes
   */
  
  @JsonProperty("lvlBrakes")
  public @Nullable Integer getLvlBrakes() {
    return lvlBrakes;
  }

  public void setLvlBrakes(@Nullable Integer lvlBrakes) {
    this.lvlBrakes = lvlBrakes;
  }

  public CarResponse lvlCooling(@Nullable Integer lvlCooling) {
    this.lvlCooling = lvlCooling;
    return this;
  }

  /**
   * Get lvlCooling
   * @return lvlCooling
   */
  
  @JsonProperty("lvlCooling")
  public @Nullable Integer getLvlCooling() {
    return lvlCooling;
  }

  public void setLvlCooling(@Nullable Integer lvlCooling) {
    this.lvlCooling = lvlCooling;
  }

  public CarResponse lvlElectronics(@Nullable Integer lvlElectronics) {
    this.lvlElectronics = lvlElectronics;
    return this;
  }

  /**
   * Get lvlElectronics
   * @return lvlElectronics
   */
  
  @JsonProperty("lvlElectronics")
  public @Nullable Integer getLvlElectronics() {
    return lvlElectronics;
  }

  public void setLvlElectronics(@Nullable Integer lvlElectronics) {
    this.lvlElectronics = lvlElectronics;
  }

  public CarResponse lvlEngine(@Nullable Integer lvlEngine) {
    this.lvlEngine = lvlEngine;
    return this;
  }

  /**
   * Get lvlEngine
   * @return lvlEngine
   */
  
  @JsonProperty("lvlEngine")
  public @Nullable Integer getLvlEngine() {
    return lvlEngine;
  }

  public void setLvlEngine(@Nullable Integer lvlEngine) {
    this.lvlEngine = lvlEngine;
  }

  public CarResponse lvlFWing(@Nullable Integer lvlFWing) {
    this.lvlFWing = lvlFWing;
    return this;
  }

  /**
   * Get lvlFWing
   * @return lvlFWing
   */
  
  @JsonProperty("lvlFWing")
  public @Nullable Integer getLvlFWing() {
    return lvlFWing;
  }

  public void setLvlFWing(@Nullable Integer lvlFWing) {
    this.lvlFWing = lvlFWing;
  }

  public CarResponse lvlRWing(@Nullable Integer lvlRWing) {
    this.lvlRWing = lvlRWing;
    return this;
  }

  /**
   * Get lvlRWing
   * @return lvlRWing
   */
  
  @JsonProperty("lvlRWing")
  public @Nullable Integer getLvlRWing() {
    return lvlRWing;
  }

  public void setLvlRWing(@Nullable Integer lvlRWing) {
    this.lvlRWing = lvlRWing;
  }

  public CarResponse lvlGear(@Nullable Integer lvlGear) {
    this.lvlGear = lvlGear;
    return this;
  }

  /**
   * Get lvlGear
   * @return lvlGear
   */
  
  @JsonProperty("lvlGear")
  public @Nullable Integer getLvlGear() {
    return lvlGear;
  }

  public void setLvlGear(@Nullable Integer lvlGear) {
    this.lvlGear = lvlGear;
  }

  public CarResponse lvlSidepods(@Nullable Integer lvlSidepods) {
    this.lvlSidepods = lvlSidepods;
    return this;
  }

  /**
   * Get lvlSidepods
   * @return lvlSidepods
   */
  
  @JsonProperty("lvlSidepods")
  public @Nullable Integer getLvlSidepods() {
    return lvlSidepods;
  }

  public void setLvlSidepods(@Nullable Integer lvlSidepods) {
    this.lvlSidepods = lvlSidepods;
  }

  public CarResponse lvlSusp(@Nullable Integer lvlSusp) {
    this.lvlSusp = lvlSusp;
    return this;
  }

  /**
   * Get lvlSusp
   * @return lvlSusp
   */
  
  @JsonProperty("lvlSusp")
  public @Nullable Integer getLvlSusp() {
    return lvlSusp;
  }

  public void setLvlSusp(@Nullable Integer lvlSusp) {
    this.lvlSusp = lvlSusp;
  }

  public CarResponse lvlUnderbody(@Nullable Integer lvlUnderbody) {
    this.lvlUnderbody = lvlUnderbody;
    return this;
  }

  /**
   * Get lvlUnderbody
   * @return lvlUnderbody
   */
  
  @JsonProperty("lvlUnderbody")
  public @Nullable Integer getLvlUnderbody() {
    return lvlUnderbody;
  }

  public void setLvlUnderbody(@Nullable Integer lvlUnderbody) {
    this.lvlUnderbody = lvlUnderbody;
  }

  public CarResponse usaBrakes(@Nullable Integer usaBrakes) {
    this.usaBrakes = usaBrakes;
    return this;
  }

  /**
   * Get usaBrakes
   * @return usaBrakes
   */
  
  @JsonProperty("usaBrakes")
  public @Nullable Integer getUsaBrakes() {
    return usaBrakes;
  }

  public void setUsaBrakes(@Nullable Integer usaBrakes) {
    this.usaBrakes = usaBrakes;
  }

  public CarResponse usaChassis(@Nullable Integer usaChassis) {
    this.usaChassis = usaChassis;
    return this;
  }

  /**
   * Get usaChassis
   * @return usaChassis
   */
  
  @JsonProperty("usaChassis")
  public @Nullable Integer getUsaChassis() {
    return usaChassis;
  }

  public void setUsaChassis(@Nullable Integer usaChassis) {
    this.usaChassis = usaChassis;
  }

  public CarResponse usaCooling(@Nullable Integer usaCooling) {
    this.usaCooling = usaCooling;
    return this;
  }

  /**
   * Get usaCooling
   * @return usaCooling
   */
  
  @JsonProperty("usaCooling")
  public @Nullable Integer getUsaCooling() {
    return usaCooling;
  }

  public void setUsaCooling(@Nullable Integer usaCooling) {
    this.usaCooling = usaCooling;
  }

  public CarResponse usaElectronics(@Nullable Integer usaElectronics) {
    this.usaElectronics = usaElectronics;
    return this;
  }

  /**
   * Get usaElectronics
   * @return usaElectronics
   */
  
  @JsonProperty("usaElectronics")
  public @Nullable Integer getUsaElectronics() {
    return usaElectronics;
  }

  public void setUsaElectronics(@Nullable Integer usaElectronics) {
    this.usaElectronics = usaElectronics;
  }

  public CarResponse usaEngine(@Nullable Integer usaEngine) {
    this.usaEngine = usaEngine;
    return this;
  }

  /**
   * Get usaEngine
   * @return usaEngine
   */
  
  @JsonProperty("usaEngine")
  public @Nullable Integer getUsaEngine() {
    return usaEngine;
  }

  public void setUsaEngine(@Nullable Integer usaEngine) {
    this.usaEngine = usaEngine;
  }

  public CarResponse usaFWing(@Nullable Integer usaFWing) {
    this.usaFWing = usaFWing;
    return this;
  }

  /**
   * Get usaFWing
   * @return usaFWing
   */
  
  @JsonProperty("usaFWing")
  public @Nullable Integer getUsaFWing() {
    return usaFWing;
  }

  public void setUsaFWing(@Nullable Integer usaFWing) {
    this.usaFWing = usaFWing;
  }

  public CarResponse usaGear(@Nullable Integer usaGear) {
    this.usaGear = usaGear;
    return this;
  }

  /**
   * Get usaGear
   * @return usaGear
   */
  
  @JsonProperty("usaGear")
  public @Nullable Integer getUsaGear() {
    return usaGear;
  }

  public void setUsaGear(@Nullable Integer usaGear) {
    this.usaGear = usaGear;
  }

  public CarResponse usaRWing(@Nullable Integer usaRWing) {
    this.usaRWing = usaRWing;
    return this;
  }

  /**
   * Get usaRWing
   * @return usaRWing
   */
  
  @JsonProperty("usaRWing")
  public @Nullable Integer getUsaRWing() {
    return usaRWing;
  }

  public void setUsaRWing(@Nullable Integer usaRWing) {
    this.usaRWing = usaRWing;
  }

  public CarResponse usaSidepods(@Nullable Integer usaSidepods) {
    this.usaSidepods = usaSidepods;
    return this;
  }

  /**
   * Get usaSidepods
   * @return usaSidepods
   */
  
  @JsonProperty("usaSidepods")
  public @Nullable Integer getUsaSidepods() {
    return usaSidepods;
  }

  public void setUsaSidepods(@Nullable Integer usaSidepods) {
    this.usaSidepods = usaSidepods;
  }

  public CarResponse usaSusp(@Nullable Integer usaSusp) {
    this.usaSusp = usaSusp;
    return this;
  }

  /**
   * Get usaSusp
   * @return usaSusp
   */
  
  @JsonProperty("usaSusp")
  public @Nullable Integer getUsaSusp() {
    return usaSusp;
  }

  public void setUsaSusp(@Nullable Integer usaSusp) {
    this.usaSusp = usaSusp;
  }

  public CarResponse usaUnderbody(@Nullable Integer usaUnderbody) {
    this.usaUnderbody = usaUnderbody;
    return this;
  }

  /**
   * Get usaUnderbody
   * @return usaUnderbody
   */
  
  @JsonProperty("usaUnderbody")
  public @Nullable Integer getUsaUnderbody() {
    return usaUnderbody;
  }

  public void setUsaUnderbody(@Nullable Integer usaUnderbody) {
    this.usaUnderbody = usaUnderbody;
  }

  public CarResponse canRepair(@Nullable Integer canRepair) {
    this.canRepair = canRepair;
    return this;
  }

  /**
   * Get canRepair
   * @return canRepair
   */
  
  @JsonProperty("canRepair")
  public @Nullable Integer getCanRepair() {
    return canRepair;
  }

  public void setCanRepair(@Nullable Integer canRepair) {
    this.canRepair = canRepair;
  }

  public CarResponse canUndo(@Nullable Integer canUndo) {
    this.canUndo = canUndo;
    return this;
  }

  /**
   * Get canUndo
   * @return canUndo
   */
  
  @JsonProperty("canUndo")
  public @Nullable Integer getCanUndo() {
    return canUndo;
  }

  public void setCanUndo(@Nullable Integer canUndo) {
    this.canUndo = canUndo;
  }

  public CarResponse endOfSeason(@Nullable Integer endOfSeason) {
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

  public CarResponse raceInProgress(@Nullable Integer raceInProgress) {
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

  public CarResponse updateInProgress(@Nullable Integer updateInProgress) {
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

  public CarResponse chassisOptions(List<@Valid CarResponseChassisOptionsInner> chassisOptions) {
    this.chassisOptions = chassisOptions;
    return this;
  }

  public CarResponse addChassisOptionsItem(CarResponseChassisOptionsInner chassisOptionsItem) {
    if (this.chassisOptions == null) {
      this.chassisOptions = new ArrayList<>();
    }
    this.chassisOptions.add(chassisOptionsItem);
    return this;
  }

  /**
   * Get chassisOptions
   * @return chassisOptions
   */
  @Valid 
  @JsonProperty("chassisOptions")
  public List<@Valid CarResponseChassisOptionsInner> getChassisOptions() {
    return chassisOptions;
  }

  public void setChassisOptions(List<@Valid CarResponseChassisOptionsInner> chassisOptions) {
    this.chassisOptions = chassisOptions;
  }

  public CarResponse engineOptions(List<@Valid CarResponseChassisOptionsInner> engineOptions) {
    this.engineOptions = engineOptions;
    return this;
  }

  public CarResponse addEngineOptionsItem(CarResponseChassisOptionsInner engineOptionsItem) {
    if (this.engineOptions == null) {
      this.engineOptions = new ArrayList<>();
    }
    this.engineOptions.add(engineOptionsItem);
    return this;
  }

  /**
   * Get engineOptions
   * @return engineOptions
   */
  @Valid 
  @JsonProperty("engineOptions")
  public List<@Valid CarResponseChassisOptionsInner> getEngineOptions() {
    return engineOptions;
  }

  public void setEngineOptions(List<@Valid CarResponseChassisOptionsInner> engineOptions) {
    this.engineOptions = engineOptions;
  }

  public CarResponse fWingOptions(List<@Valid CarResponseChassisOptionsInner> fWingOptions) {
    this.fWingOptions = fWingOptions;
    return this;
  }

  public CarResponse addFWingOptionsItem(CarResponseChassisOptionsInner fWingOptionsItem) {
    if (this.fWingOptions == null) {
      this.fWingOptions = new ArrayList<>();
    }
    this.fWingOptions.add(fWingOptionsItem);
    return this;
  }

  /**
   * Get fWingOptions
   * @return fWingOptions
   */
  @Valid 
  @JsonProperty("fWingOptions")
  public List<@Valid CarResponseChassisOptionsInner> getfWingOptions() {
    return fWingOptions;
  }

  public void setfWingOptions(List<@Valid CarResponseChassisOptionsInner> fWingOptions) {
    this.fWingOptions = fWingOptions;
  }

  public CarResponse rWingOptions(List<@Valid CarResponseChassisOptionsInner> rWingOptions) {
    this.rWingOptions = rWingOptions;
    return this;
  }

  public CarResponse addRWingOptionsItem(CarResponseChassisOptionsInner rWingOptionsItem) {
    if (this.rWingOptions == null) {
      this.rWingOptions = new ArrayList<>();
    }
    this.rWingOptions.add(rWingOptionsItem);
    return this;
  }

  /**
   * Get rWingOptions
   * @return rWingOptions
   */
  @Valid 
  @JsonProperty("rWingOptions")
  public List<@Valid CarResponseChassisOptionsInner> getrWingOptions() {
    return rWingOptions;
  }

  public void setrWingOptions(List<@Valid CarResponseChassisOptionsInner> rWingOptions) {
    this.rWingOptions = rWingOptions;
  }

  public CarResponse underbodyOptions(List<@Valid CarResponseChassisOptionsInner> underbodyOptions) {
    this.underbodyOptions = underbodyOptions;
    return this;
  }

  public CarResponse addUnderbodyOptionsItem(CarResponseChassisOptionsInner underbodyOptionsItem) {
    if (this.underbodyOptions == null) {
      this.underbodyOptions = new ArrayList<>();
    }
    this.underbodyOptions.add(underbodyOptionsItem);
    return this;
  }

  /**
   * Get underbodyOptions
   * @return underbodyOptions
   */
  @Valid 
  @JsonProperty("underbodyOptions")
  public List<@Valid CarResponseChassisOptionsInner> getUnderbodyOptions() {
    return underbodyOptions;
  }

  public void setUnderbodyOptions(List<@Valid CarResponseChassisOptionsInner> underbodyOptions) {
    this.underbodyOptions = underbodyOptions;
  }

  public CarResponse sidepodsOptions(List<@Valid CarResponseChassisOptionsInner> sidepodsOptions) {
    this.sidepodsOptions = sidepodsOptions;
    return this;
  }

  public CarResponse addSidepodsOptionsItem(CarResponseChassisOptionsInner sidepodsOptionsItem) {
    if (this.sidepodsOptions == null) {
      this.sidepodsOptions = new ArrayList<>();
    }
    this.sidepodsOptions.add(sidepodsOptionsItem);
    return this;
  }

  /**
   * Get sidepodsOptions
   * @return sidepodsOptions
   */
  @Valid 
  @JsonProperty("sidepodsOptions")
  public List<@Valid CarResponseChassisOptionsInner> getSidepodsOptions() {
    return sidepodsOptions;
  }

  public void setSidepodsOptions(List<@Valid CarResponseChassisOptionsInner> sidepodsOptions) {
    this.sidepodsOptions = sidepodsOptions;
  }

  public CarResponse coolingOptions(List<@Valid CarResponseChassisOptionsInner> coolingOptions) {
    this.coolingOptions = coolingOptions;
    return this;
  }

  public CarResponse addCoolingOptionsItem(CarResponseChassisOptionsInner coolingOptionsItem) {
    if (this.coolingOptions == null) {
      this.coolingOptions = new ArrayList<>();
    }
    this.coolingOptions.add(coolingOptionsItem);
    return this;
  }

  /**
   * Get coolingOptions
   * @return coolingOptions
   */
  @Valid 
  @JsonProperty("coolingOptions")
  public List<@Valid CarResponseChassisOptionsInner> getCoolingOptions() {
    return coolingOptions;
  }

  public void setCoolingOptions(List<@Valid CarResponseChassisOptionsInner> coolingOptions) {
    this.coolingOptions = coolingOptions;
  }

  public CarResponse gearOptions(List<@Valid CarResponseChassisOptionsInner> gearOptions) {
    this.gearOptions = gearOptions;
    return this;
  }

  public CarResponse addGearOptionsItem(CarResponseChassisOptionsInner gearOptionsItem) {
    if (this.gearOptions == null) {
      this.gearOptions = new ArrayList<>();
    }
    this.gearOptions.add(gearOptionsItem);
    return this;
  }

  /**
   * Get gearOptions
   * @return gearOptions
   */
  @Valid 
  @JsonProperty("gearOptions")
  public List<@Valid CarResponseChassisOptionsInner> getGearOptions() {
    return gearOptions;
  }

  public void setGearOptions(List<@Valid CarResponseChassisOptionsInner> gearOptions) {
    this.gearOptions = gearOptions;
  }

  public CarResponse brakesOptions(List<@Valid CarResponseChassisOptionsInner> brakesOptions) {
    this.brakesOptions = brakesOptions;
    return this;
  }

  public CarResponse addBrakesOptionsItem(CarResponseChassisOptionsInner brakesOptionsItem) {
    if (this.brakesOptions == null) {
      this.brakesOptions = new ArrayList<>();
    }
    this.brakesOptions.add(brakesOptionsItem);
    return this;
  }

  /**
   * Get brakesOptions
   * @return brakesOptions
   */
  @Valid 
  @JsonProperty("brakesOptions")
  public List<@Valid CarResponseChassisOptionsInner> getBrakesOptions() {
    return brakesOptions;
  }

  public void setBrakesOptions(List<@Valid CarResponseChassisOptionsInner> brakesOptions) {
    this.brakesOptions = brakesOptions;
  }

  public CarResponse suspOptions(List<@Valid CarResponseChassisOptionsInner> suspOptions) {
    this.suspOptions = suspOptions;
    return this;
  }

  public CarResponse addSuspOptionsItem(CarResponseChassisOptionsInner suspOptionsItem) {
    if (this.suspOptions == null) {
      this.suspOptions = new ArrayList<>();
    }
    this.suspOptions.add(suspOptionsItem);
    return this;
  }

  /**
   * Get suspOptions
   * @return suspOptions
   */
  @Valid 
  @JsonProperty("suspOptions")
  public List<@Valid CarResponseChassisOptionsInner> getSuspOptions() {
    return suspOptions;
  }

  public void setSuspOptions(List<@Valid CarResponseChassisOptionsInner> suspOptions) {
    this.suspOptions = suspOptions;
  }

  public CarResponse electronicsOptions(List<@Valid CarResponseChassisOptionsInner> electronicsOptions) {
    this.electronicsOptions = electronicsOptions;
    return this;
  }

  public CarResponse addElectronicsOptionsItem(CarResponseChassisOptionsInner electronicsOptionsItem) {
    if (this.electronicsOptions == null) {
      this.electronicsOptions = new ArrayList<>();
    }
    this.electronicsOptions.add(electronicsOptionsItem);
    return this;
  }

  /**
   * Get electronicsOptions
   * @return electronicsOptions
   */
  @Valid 
  @JsonProperty("electronicsOptions")
  public List<@Valid CarResponseChassisOptionsInner> getElectronicsOptions() {
    return electronicsOptions;
  }

  public void setElectronicsOptions(List<@Valid CarResponseChassisOptionsInner> electronicsOptions) {
    this.electronicsOptions = electronicsOptions;
  }

  public CarResponse selectedBrakes(@Nullable CarResponseChassisOptionsInnerValue selectedBrakes) {
    this.selectedBrakes = selectedBrakes;
    return this;
  }

  /**
   * Get selectedBrakes
   * @return selectedBrakes
   */
  @Valid 
  @JsonProperty("selectedBrakes")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedBrakes() {
    return selectedBrakes;
  }

  public void setSelectedBrakes(@Nullable CarResponseChassisOptionsInnerValue selectedBrakes) {
    this.selectedBrakes = selectedBrakes;
  }

  public CarResponse selectedChassis(@Nullable CarResponseChassisOptionsInnerValue selectedChassis) {
    this.selectedChassis = selectedChassis;
    return this;
  }

  /**
   * Get selectedChassis
   * @return selectedChassis
   */
  @Valid 
  @JsonProperty("selectedChassis")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedChassis() {
    return selectedChassis;
  }

  public void setSelectedChassis(@Nullable CarResponseChassisOptionsInnerValue selectedChassis) {
    this.selectedChassis = selectedChassis;
  }

  public CarResponse selectedCooling(@Nullable CarResponseChassisOptionsInnerValue selectedCooling) {
    this.selectedCooling = selectedCooling;
    return this;
  }

  /**
   * Get selectedCooling
   * @return selectedCooling
   */
  @Valid 
  @JsonProperty("selectedCooling")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedCooling() {
    return selectedCooling;
  }

  public void setSelectedCooling(@Nullable CarResponseChassisOptionsInnerValue selectedCooling) {
    this.selectedCooling = selectedCooling;
  }

  public CarResponse selectedElectronics(@Nullable CarResponseChassisOptionsInnerValue selectedElectronics) {
    this.selectedElectronics = selectedElectronics;
    return this;
  }

  /**
   * Get selectedElectronics
   * @return selectedElectronics
   */
  @Valid 
  @JsonProperty("selectedElectronics")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedElectronics() {
    return selectedElectronics;
  }

  public void setSelectedElectronics(@Nullable CarResponseChassisOptionsInnerValue selectedElectronics) {
    this.selectedElectronics = selectedElectronics;
  }

  public CarResponse selectedEngine(@Nullable CarResponseChassisOptionsInnerValue selectedEngine) {
    this.selectedEngine = selectedEngine;
    return this;
  }

  /**
   * Get selectedEngine
   * @return selectedEngine
   */
  @Valid 
  @JsonProperty("selectedEngine")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedEngine() {
    return selectedEngine;
  }

  public void setSelectedEngine(@Nullable CarResponseChassisOptionsInnerValue selectedEngine) {
    this.selectedEngine = selectedEngine;
  }

  public CarResponse selectedFWing(@Nullable CarResponseChassisOptionsInnerValue selectedFWing) {
    this.selectedFWing = selectedFWing;
    return this;
  }

  /**
   * Get selectedFWing
   * @return selectedFWing
   */
  @Valid 
  @JsonProperty("selectedFWing")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedFWing() {
    return selectedFWing;
  }

  public void setSelectedFWing(@Nullable CarResponseChassisOptionsInnerValue selectedFWing) {
    this.selectedFWing = selectedFWing;
  }

  public CarResponse selectedGear(@Nullable CarResponseChassisOptionsInnerValue selectedGear) {
    this.selectedGear = selectedGear;
    return this;
  }

  /**
   * Get selectedGear
   * @return selectedGear
   */
  @Valid 
  @JsonProperty("selectedGear")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedGear() {
    return selectedGear;
  }

  public void setSelectedGear(@Nullable CarResponseChassisOptionsInnerValue selectedGear) {
    this.selectedGear = selectedGear;
  }

  public CarResponse selectedRWing(@Nullable CarResponseChassisOptionsInnerValue selectedRWing) {
    this.selectedRWing = selectedRWing;
    return this;
  }

  /**
   * Get selectedRWing
   * @return selectedRWing
   */
  @Valid 
  @JsonProperty("selectedRWing")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedRWing() {
    return selectedRWing;
  }

  public void setSelectedRWing(@Nullable CarResponseChassisOptionsInnerValue selectedRWing) {
    this.selectedRWing = selectedRWing;
  }

  public CarResponse selectedSidepods(@Nullable CarResponseChassisOptionsInnerValue selectedSidepods) {
    this.selectedSidepods = selectedSidepods;
    return this;
  }

  /**
   * Get selectedSidepods
   * @return selectedSidepods
   */
  @Valid 
  @JsonProperty("selectedSidepods")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedSidepods() {
    return selectedSidepods;
  }

  public void setSelectedSidepods(@Nullable CarResponseChassisOptionsInnerValue selectedSidepods) {
    this.selectedSidepods = selectedSidepods;
  }

  public CarResponse selectedSusp(@Nullable CarResponseChassisOptionsInnerValue selectedSusp) {
    this.selectedSusp = selectedSusp;
    return this;
  }

  /**
   * Get selectedSusp
   * @return selectedSusp
   */
  @Valid 
  @JsonProperty("selectedSusp")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedSusp() {
    return selectedSusp;
  }

  public void setSelectedSusp(@Nullable CarResponseChassisOptionsInnerValue selectedSusp) {
    this.selectedSusp = selectedSusp;
  }

  public CarResponse selectedUnderbody(@Nullable CarResponseChassisOptionsInnerValue selectedUnderbody) {
    this.selectedUnderbody = selectedUnderbody;
    return this;
  }

  /**
   * Get selectedUnderbody
   * @return selectedUnderbody
   */
  @Valid 
  @JsonProperty("selectedUnderbody")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedUnderbody() {
    return selectedUnderbody;
  }

  public void setSelectedUnderbody(@Nullable CarResponseChassisOptionsInnerValue selectedUnderbody) {
    this.selectedUnderbody = selectedUnderbody;
  }

  public CarResponse totalCosts(@Nullable Integer totalCosts) {
    this.totalCosts = totalCosts;
    return this;
  }

  /**
   * Get totalCosts
   * @return totalCosts
   */
  
  @JsonProperty("totalCosts")
  public @Nullable Integer getTotalCosts() {
    return totalCosts;
  }

  public void setTotalCosts(@Nullable Integer totalCosts) {
    this.totalCosts = totalCosts;
  }

  public CarResponse undoCompleted(@Nullable Integer undoCompleted) {
    this.undoCompleted = undoCompleted;
    return this;
  }

  /**
   * Get undoCompleted
   * @return undoCompleted
   */
  
  @JsonProperty("undoCompleted")
  public @Nullable Integer getUndoCompleted() {
    return undoCompleted;
  }

  public void setUndoCompleted(@Nullable Integer undoCompleted) {
    this.undoCompleted = undoCompleted;
  }

  public CarResponse carUpdated(@Nullable Integer carUpdated) {
    this.carUpdated = carUpdated;
    return this;
  }

  /**
   * Get carUpdated
   * @return carUpdated
   */
  
  @JsonProperty("carUpdated")
  public @Nullable Integer getCarUpdated() {
    return carUpdated;
  }

  public void setCarUpdated(@Nullable Integer carUpdated) {
    this.carUpdated = carUpdated;
  }

  public CarResponse cash(@Nullable Integer cash) {
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

  public CarResponse showCarUpdateAlert(@Nullable Boolean showCarUpdateAlert) {
    this.showCarUpdateAlert = showCarUpdateAlert;
    return this;
  }

  /**
   * Get showCarUpdateAlert
   * @return showCarUpdateAlert
   */
  
  @JsonProperty("showCarUpdateAlert")
  public @Nullable Boolean getShowCarUpdateAlert() {
    return showCarUpdateAlert;
  }

  public void setShowCarUpdateAlert(@Nullable Boolean showCarUpdateAlert) {
    this.showCarUpdateAlert = showCarUpdateAlert;
  }

  public CarResponse showUndoAlert(@Nullable Boolean showUndoAlert) {
    this.showUndoAlert = showUndoAlert;
    return this;
  }

  /**
   * Get showUndoAlert
   * @return showUndoAlert
   */
  
  @JsonProperty("showUndoAlert")
  public @Nullable Boolean getShowUndoAlert() {
    return showUndoAlert;
  }

  public void setShowUndoAlert(@Nullable Boolean showUndoAlert) {
    this.showUndoAlert = showUndoAlert;
  }

  public CarResponse showUndoAlertCredits(@Nullable Boolean showUndoAlertCredits) {
    this.showUndoAlertCredits = showUndoAlertCredits;
    return this;
  }

  /**
   * Get showUndoAlertCredits
   * @return showUndoAlertCredits
   */
  
  @JsonProperty("showUndoAlertCredits")
  public @Nullable Boolean getShowUndoAlertCredits() {
    return showUndoAlertCredits;
  }

  public void setShowUndoAlertCredits(@Nullable Boolean showUndoAlertCredits) {
    this.showUndoAlertCredits = showUndoAlertCredits;
  }

  public CarResponse showUndoAlertNoCredits(@Nullable Boolean showUndoAlertNoCredits) {
    this.showUndoAlertNoCredits = showUndoAlertNoCredits;
    return this;
  }

  /**
   * Get showUndoAlertNoCredits
   * @return showUndoAlertNoCredits
   */
  
  @JsonProperty("showUndoAlertNoCredits")
  public @Nullable Boolean getShowUndoAlertNoCredits() {
    return showUndoAlertNoCredits;
  }

  public void setShowUndoAlertNoCredits(@Nullable Boolean showUndoAlertNoCredits) {
    this.showUndoAlertNoCredits = showUndoAlertNoCredits;
  }

  public CarResponse credits(@Nullable BigDecimal credits) {
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

  public CarResponse races(@Nullable Integer races) {
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

  public CarResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    CarResponse carResponse = (CarResponse) o;
    return Objects.equals(this.loadingDataState, carResponse.loadingDataState) &&
        Objects.equals(this.carPower, carResponse.carPower) &&
        Objects.equals(this.carHandl, carResponse.carHandl) &&
        Objects.equals(this.carAccel, carResponse.carAccel) &&
        Objects.equals(this.lvlChassis, carResponse.lvlChassis) &&
        Objects.equals(this.lvlBrakes, carResponse.lvlBrakes) &&
        Objects.equals(this.lvlCooling, carResponse.lvlCooling) &&
        Objects.equals(this.lvlElectronics, carResponse.lvlElectronics) &&
        Objects.equals(this.lvlEngine, carResponse.lvlEngine) &&
        Objects.equals(this.lvlFWing, carResponse.lvlFWing) &&
        Objects.equals(this.lvlRWing, carResponse.lvlRWing) &&
        Objects.equals(this.lvlGear, carResponse.lvlGear) &&
        Objects.equals(this.lvlSidepods, carResponse.lvlSidepods) &&
        Objects.equals(this.lvlSusp, carResponse.lvlSusp) &&
        Objects.equals(this.lvlUnderbody, carResponse.lvlUnderbody) &&
        Objects.equals(this.usaBrakes, carResponse.usaBrakes) &&
        Objects.equals(this.usaChassis, carResponse.usaChassis) &&
        Objects.equals(this.usaCooling, carResponse.usaCooling) &&
        Objects.equals(this.usaElectronics, carResponse.usaElectronics) &&
        Objects.equals(this.usaEngine, carResponse.usaEngine) &&
        Objects.equals(this.usaFWing, carResponse.usaFWing) &&
        Objects.equals(this.usaGear, carResponse.usaGear) &&
        Objects.equals(this.usaRWing, carResponse.usaRWing) &&
        Objects.equals(this.usaSidepods, carResponse.usaSidepods) &&
        Objects.equals(this.usaSusp, carResponse.usaSusp) &&
        Objects.equals(this.usaUnderbody, carResponse.usaUnderbody) &&
        Objects.equals(this.canRepair, carResponse.canRepair) &&
        Objects.equals(this.canUndo, carResponse.canUndo) &&
        Objects.equals(this.endOfSeason, carResponse.endOfSeason) &&
        Objects.equals(this.raceInProgress, carResponse.raceInProgress) &&
        Objects.equals(this.updateInProgress, carResponse.updateInProgress) &&
        Objects.equals(this.chassisOptions, carResponse.chassisOptions) &&
        Objects.equals(this.engineOptions, carResponse.engineOptions) &&
        Objects.equals(this.fWingOptions, carResponse.fWingOptions) &&
        Objects.equals(this.rWingOptions, carResponse.rWingOptions) &&
        Objects.equals(this.underbodyOptions, carResponse.underbodyOptions) &&
        Objects.equals(this.sidepodsOptions, carResponse.sidepodsOptions) &&
        Objects.equals(this.coolingOptions, carResponse.coolingOptions) &&
        Objects.equals(this.gearOptions, carResponse.gearOptions) &&
        Objects.equals(this.brakesOptions, carResponse.brakesOptions) &&
        Objects.equals(this.suspOptions, carResponse.suspOptions) &&
        Objects.equals(this.electronicsOptions, carResponse.electronicsOptions) &&
        Objects.equals(this.selectedBrakes, carResponse.selectedBrakes) &&
        Objects.equals(this.selectedChassis, carResponse.selectedChassis) &&
        Objects.equals(this.selectedCooling, carResponse.selectedCooling) &&
        Objects.equals(this.selectedElectronics, carResponse.selectedElectronics) &&
        Objects.equals(this.selectedEngine, carResponse.selectedEngine) &&
        Objects.equals(this.selectedFWing, carResponse.selectedFWing) &&
        Objects.equals(this.selectedGear, carResponse.selectedGear) &&
        Objects.equals(this.selectedRWing, carResponse.selectedRWing) &&
        Objects.equals(this.selectedSidepods, carResponse.selectedSidepods) &&
        Objects.equals(this.selectedSusp, carResponse.selectedSusp) &&
        Objects.equals(this.selectedUnderbody, carResponse.selectedUnderbody) &&
        Objects.equals(this.totalCosts, carResponse.totalCosts) &&
        Objects.equals(this.undoCompleted, carResponse.undoCompleted) &&
        Objects.equals(this.carUpdated, carResponse.carUpdated) &&
        Objects.equals(this.cash, carResponse.cash) &&
        Objects.equals(this.showCarUpdateAlert, carResponse.showCarUpdateAlert) &&
        Objects.equals(this.showUndoAlert, carResponse.showUndoAlert) &&
        Objects.equals(this.showUndoAlertCredits, carResponse.showUndoAlertCredits) &&
        Objects.equals(this.showUndoAlertNoCredits, carResponse.showUndoAlertNoCredits) &&
        Objects.equals(this.credits, carResponse.credits) &&
        Objects.equals(this.races, carResponse.races) &&
        Objects.equals(this.apiRequestsRemaining, carResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, carPower, carHandl, carAccel, lvlChassis, lvlBrakes, lvlCooling, lvlElectronics, lvlEngine, lvlFWing, lvlRWing, lvlGear, lvlSidepods, lvlSusp, lvlUnderbody, usaBrakes, usaChassis, usaCooling, usaElectronics, usaEngine, usaFWing, usaGear, usaRWing, usaSidepods, usaSusp, usaUnderbody, canRepair, canUndo, endOfSeason, raceInProgress, updateInProgress, chassisOptions, engineOptions, fWingOptions, rWingOptions, underbodyOptions, sidepodsOptions, coolingOptions, gearOptions, brakesOptions, suspOptions, electronicsOptions, selectedBrakes, selectedChassis, selectedCooling, selectedElectronics, selectedEngine, selectedFWing, selectedGear, selectedRWing, selectedSidepods, selectedSusp, selectedUnderbody, totalCosts, undoCompleted, carUpdated, cash, showCarUpdateAlert, showUndoAlert, showUndoAlertCredits, showUndoAlertNoCredits, credits, races, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    carPower: ").append(toIndentedString(carPower)).append("\n");
    sb.append("    carHandl: ").append(toIndentedString(carHandl)).append("\n");
    sb.append("    carAccel: ").append(toIndentedString(carAccel)).append("\n");
    sb.append("    lvlChassis: ").append(toIndentedString(lvlChassis)).append("\n");
    sb.append("    lvlBrakes: ").append(toIndentedString(lvlBrakes)).append("\n");
    sb.append("    lvlCooling: ").append(toIndentedString(lvlCooling)).append("\n");
    sb.append("    lvlElectronics: ").append(toIndentedString(lvlElectronics)).append("\n");
    sb.append("    lvlEngine: ").append(toIndentedString(lvlEngine)).append("\n");
    sb.append("    lvlFWing: ").append(toIndentedString(lvlFWing)).append("\n");
    sb.append("    lvlRWing: ").append(toIndentedString(lvlRWing)).append("\n");
    sb.append("    lvlGear: ").append(toIndentedString(lvlGear)).append("\n");
    sb.append("    lvlSidepods: ").append(toIndentedString(lvlSidepods)).append("\n");
    sb.append("    lvlSusp: ").append(toIndentedString(lvlSusp)).append("\n");
    sb.append("    lvlUnderbody: ").append(toIndentedString(lvlUnderbody)).append("\n");
    sb.append("    usaBrakes: ").append(toIndentedString(usaBrakes)).append("\n");
    sb.append("    usaChassis: ").append(toIndentedString(usaChassis)).append("\n");
    sb.append("    usaCooling: ").append(toIndentedString(usaCooling)).append("\n");
    sb.append("    usaElectronics: ").append(toIndentedString(usaElectronics)).append("\n");
    sb.append("    usaEngine: ").append(toIndentedString(usaEngine)).append("\n");
    sb.append("    usaFWing: ").append(toIndentedString(usaFWing)).append("\n");
    sb.append("    usaGear: ").append(toIndentedString(usaGear)).append("\n");
    sb.append("    usaRWing: ").append(toIndentedString(usaRWing)).append("\n");
    sb.append("    usaSidepods: ").append(toIndentedString(usaSidepods)).append("\n");
    sb.append("    usaSusp: ").append(toIndentedString(usaSusp)).append("\n");
    sb.append("    usaUnderbody: ").append(toIndentedString(usaUnderbody)).append("\n");
    sb.append("    canRepair: ").append(toIndentedString(canRepair)).append("\n");
    sb.append("    canUndo: ").append(toIndentedString(canUndo)).append("\n");
    sb.append("    endOfSeason: ").append(toIndentedString(endOfSeason)).append("\n");
    sb.append("    raceInProgress: ").append(toIndentedString(raceInProgress)).append("\n");
    sb.append("    updateInProgress: ").append(toIndentedString(updateInProgress)).append("\n");
    sb.append("    chassisOptions: ").append(toIndentedString(chassisOptions)).append("\n");
    sb.append("    engineOptions: ").append(toIndentedString(engineOptions)).append("\n");
    sb.append("    fWingOptions: ").append(toIndentedString(fWingOptions)).append("\n");
    sb.append("    rWingOptions: ").append(toIndentedString(rWingOptions)).append("\n");
    sb.append("    underbodyOptions: ").append(toIndentedString(underbodyOptions)).append("\n");
    sb.append("    sidepodsOptions: ").append(toIndentedString(sidepodsOptions)).append("\n");
    sb.append("    coolingOptions: ").append(toIndentedString(coolingOptions)).append("\n");
    sb.append("    gearOptions: ").append(toIndentedString(gearOptions)).append("\n");
    sb.append("    brakesOptions: ").append(toIndentedString(brakesOptions)).append("\n");
    sb.append("    suspOptions: ").append(toIndentedString(suspOptions)).append("\n");
    sb.append("    electronicsOptions: ").append(toIndentedString(electronicsOptions)).append("\n");
    sb.append("    selectedBrakes: ").append(toIndentedString(selectedBrakes)).append("\n");
    sb.append("    selectedChassis: ").append(toIndentedString(selectedChassis)).append("\n");
    sb.append("    selectedCooling: ").append(toIndentedString(selectedCooling)).append("\n");
    sb.append("    selectedElectronics: ").append(toIndentedString(selectedElectronics)).append("\n");
    sb.append("    selectedEngine: ").append(toIndentedString(selectedEngine)).append("\n");
    sb.append("    selectedFWing: ").append(toIndentedString(selectedFWing)).append("\n");
    sb.append("    selectedGear: ").append(toIndentedString(selectedGear)).append("\n");
    sb.append("    selectedRWing: ").append(toIndentedString(selectedRWing)).append("\n");
    sb.append("    selectedSidepods: ").append(toIndentedString(selectedSidepods)).append("\n");
    sb.append("    selectedSusp: ").append(toIndentedString(selectedSusp)).append("\n");
    sb.append("    selectedUnderbody: ").append(toIndentedString(selectedUnderbody)).append("\n");
    sb.append("    totalCosts: ").append(toIndentedString(totalCosts)).append("\n");
    sb.append("    undoCompleted: ").append(toIndentedString(undoCompleted)).append("\n");
    sb.append("    carUpdated: ").append(toIndentedString(carUpdated)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    showCarUpdateAlert: ").append(toIndentedString(showCarUpdateAlert)).append("\n");
    sb.append("    showUndoAlert: ").append(toIndentedString(showUndoAlert)).append("\n");
    sb.append("    showUndoAlertCredits: ").append(toIndentedString(showUndoAlertCredits)).append("\n");
    sb.append("    showUndoAlertNoCredits: ").append(toIndentedString(showUndoAlertNoCredits)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
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

