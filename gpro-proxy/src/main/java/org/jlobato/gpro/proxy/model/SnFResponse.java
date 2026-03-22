package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CarResponseChassisOptionsInnerValue;
import org.jlobato.gpro.proxy.model.SnFResponseAvailTrainingsInner;
import org.jlobato.gpro.proxy.model.SnFResponseWindtunnelOptionsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFResponse {

  private @Nullable String loadingDataState;

  private @Nullable Integer cash;

  private @Nullable Integer overall;

  private @Nullable Integer concentration;

  private @Nullable Integer experience;

  private @Nullable Integer technical;

  private @Nullable Integer stressHandling;

  private @Nullable Integer motivation;

  private @Nullable Integer efficiency;

  private @Nullable Integer salary;

  private @Nullable Integer maxTrainLevel;

  @Valid
  private List<@Valid SnFResponseAvailTrainingsInner> availTrainings = new ArrayList<>();

  private @Nullable Integer canTrain;

  private @Nullable Integer trainingLevelTooLow;

  private @Nullable Integer trainCompleted;

  private @Nullable Integer lvlWindtunnel;

  private @Nullable Integer lvlPitstop;

  private @Nullable Integer lvlRDWorkshop;

  private @Nullable Integer lvlRDDesign;

  private @Nullable Integer lvlEngineering;

  private @Nullable Integer lvlLab;

  private @Nullable Integer lvlCommercial;

  @Valid
  private List<@Valid SnFResponseWindtunnelOptionsInner> windtunnelOptions = new ArrayList<>();

  @Valid
  private List<@Valid SnFResponseWindtunnelOptionsInner> pitstopOptions = new ArrayList<>();

  @Valid
  private List<@Valid SnFResponseWindtunnelOptionsInner> rdWorkshopOptions = new ArrayList<>();

  @Valid
  private List<@Valid SnFResponseWindtunnelOptionsInner> rdDesignOptions = new ArrayList<>();

  @Valid
  private List<@Valid SnFResponseWindtunnelOptionsInner> engineeringOptions = new ArrayList<>();

  @Valid
  private List<@Valid SnFResponseWindtunnelOptionsInner> labOptions = new ArrayList<>();

  @Valid
  private List<@Valid SnFResponseWindtunnelOptionsInner> commercialOptions = new ArrayList<>();

  private @Nullable CarResponseChassisOptionsInnerValue selectedWindtunnel;

  private @Nullable CarResponseChassisOptionsInnerValue selectedPitstop;

  private @Nullable CarResponseChassisOptionsInnerValue selectedRDWorkshop;

  private @Nullable CarResponseChassisOptionsInnerValue selectedRDDesign;

  private @Nullable CarResponseChassisOptionsInnerValue selectedEngineering;

  private @Nullable CarResponseChassisOptionsInnerValue selectedLab;

  private @Nullable CarResponseChassisOptionsInnerValue selectedCommercial;

  private @Nullable Integer totalCosts;

  private @Nullable Integer maintenanceCost;

  private @Nullable Integer canUpdate;

  private @Nullable Integer facilitiesUpdated;

  private @Nullable Integer canUndo;

  private @Nullable Integer updateInProgress;

  private @Nullable Integer raceInProgress;

  private @Nullable Integer endOfSeason;

  private @Nullable Integer undoCompleted;

  private @Nullable Integer showUpdateAlert;

  private @Nullable Integer showUndoAlert;

  private @Nullable Integer showUndoAlertCredits;

  private @Nullable Integer showUndoAlertNoCredits;

  private @Nullable Integer credits;

  private @Nullable Integer races;

  private @Nullable String errorMsg;

  private @Nullable String setType;

  private @Nullable Integer apiRequestsRemaining;

  public SnFResponse loadingDataState(@Nullable String loadingDataState) {
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

  public SnFResponse cash(@Nullable Integer cash) {
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

  public SnFResponse overall(@Nullable Integer overall) {
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

  public SnFResponse concentration(@Nullable Integer concentration) {
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

  public SnFResponse experience(@Nullable Integer experience) {
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

  public SnFResponse technical(@Nullable Integer technical) {
    this.technical = technical;
    return this;
  }

  /**
   * Get technical
   * @return technical
   */
  
  @JsonProperty("technical")
  public @Nullable Integer getTechnical() {
    return technical;
  }

  public void setTechnical(@Nullable Integer technical) {
    this.technical = technical;
  }

  public SnFResponse stressHandling(@Nullable Integer stressHandling) {
    this.stressHandling = stressHandling;
    return this;
  }

  /**
   * Get stressHandling
   * @return stressHandling
   */
  
  @JsonProperty("stressHandling")
  public @Nullable Integer getStressHandling() {
    return stressHandling;
  }

  public void setStressHandling(@Nullable Integer stressHandling) {
    this.stressHandling = stressHandling;
  }

  public SnFResponse motivation(@Nullable Integer motivation) {
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

  public SnFResponse efficiency(@Nullable Integer efficiency) {
    this.efficiency = efficiency;
    return this;
  }

  /**
   * Get efficiency
   * @return efficiency
   */
  
  @JsonProperty("efficiency")
  public @Nullable Integer getEfficiency() {
    return efficiency;
  }

  public void setEfficiency(@Nullable Integer efficiency) {
    this.efficiency = efficiency;
  }

  public SnFResponse salary(@Nullable Integer salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   */
  
  @JsonProperty("salary")
  public @Nullable Integer getSalary() {
    return salary;
  }

  public void setSalary(@Nullable Integer salary) {
    this.salary = salary;
  }

  public SnFResponse maxTrainLevel(@Nullable Integer maxTrainLevel) {
    this.maxTrainLevel = maxTrainLevel;
    return this;
  }

  /**
   * Get maxTrainLevel
   * @return maxTrainLevel
   */
  
  @JsonProperty("maxTrainLevel")
  public @Nullable Integer getMaxTrainLevel() {
    return maxTrainLevel;
  }

  public void setMaxTrainLevel(@Nullable Integer maxTrainLevel) {
    this.maxTrainLevel = maxTrainLevel;
  }

  public SnFResponse availTrainings(List<@Valid SnFResponseAvailTrainingsInner> availTrainings) {
    this.availTrainings = availTrainings;
    return this;
  }

  public SnFResponse addAvailTrainingsItem(SnFResponseAvailTrainingsInner availTrainingsItem) {
    if (this.availTrainings == null) {
      this.availTrainings = new ArrayList<>();
    }
    this.availTrainings.add(availTrainingsItem);
    return this;
  }

  /**
   * Get availTrainings
   * @return availTrainings
   */
  @Valid 
  @JsonProperty("availTrainings")
  public List<@Valid SnFResponseAvailTrainingsInner> getAvailTrainings() {
    return availTrainings;
  }

  public void setAvailTrainings(List<@Valid SnFResponseAvailTrainingsInner> availTrainings) {
    this.availTrainings = availTrainings;
  }

  public SnFResponse canTrain(@Nullable Integer canTrain) {
    this.canTrain = canTrain;
    return this;
  }

  /**
   * Get canTrain
   * @return canTrain
   */
  
  @JsonProperty("canTrain")
  public @Nullable Integer getCanTrain() {
    return canTrain;
  }

  public void setCanTrain(@Nullable Integer canTrain) {
    this.canTrain = canTrain;
  }

  public SnFResponse trainingLevelTooLow(@Nullable Integer trainingLevelTooLow) {
    this.trainingLevelTooLow = trainingLevelTooLow;
    return this;
  }

  /**
   * Get trainingLevelTooLow
   * @return trainingLevelTooLow
   */
  
  @JsonProperty("trainingLevelTooLow")
  public @Nullable Integer getTrainingLevelTooLow() {
    return trainingLevelTooLow;
  }

  public void setTrainingLevelTooLow(@Nullable Integer trainingLevelTooLow) {
    this.trainingLevelTooLow = trainingLevelTooLow;
  }

  public SnFResponse trainCompleted(@Nullable Integer trainCompleted) {
    this.trainCompleted = trainCompleted;
    return this;
  }

  /**
   * Get trainCompleted
   * @return trainCompleted
   */
  
  @JsonProperty("trainCompleted")
  public @Nullable Integer getTrainCompleted() {
    return trainCompleted;
  }

  public void setTrainCompleted(@Nullable Integer trainCompleted) {
    this.trainCompleted = trainCompleted;
  }

  public SnFResponse lvlWindtunnel(@Nullable Integer lvlWindtunnel) {
    this.lvlWindtunnel = lvlWindtunnel;
    return this;
  }

  /**
   * Get lvlWindtunnel
   * @return lvlWindtunnel
   */
  
  @JsonProperty("lvlWindtunnel")
  public @Nullable Integer getLvlWindtunnel() {
    return lvlWindtunnel;
  }

  public void setLvlWindtunnel(@Nullable Integer lvlWindtunnel) {
    this.lvlWindtunnel = lvlWindtunnel;
  }

  public SnFResponse lvlPitstop(@Nullable Integer lvlPitstop) {
    this.lvlPitstop = lvlPitstop;
    return this;
  }

  /**
   * Get lvlPitstop
   * @return lvlPitstop
   */
  
  @JsonProperty("lvlPitstop")
  public @Nullable Integer getLvlPitstop() {
    return lvlPitstop;
  }

  public void setLvlPitstop(@Nullable Integer lvlPitstop) {
    this.lvlPitstop = lvlPitstop;
  }

  public SnFResponse lvlRDWorkshop(@Nullable Integer lvlRDWorkshop) {
    this.lvlRDWorkshop = lvlRDWorkshop;
    return this;
  }

  /**
   * Get lvlRDWorkshop
   * @return lvlRDWorkshop
   */
  
  @JsonProperty("lvlRDWorkshop")
  public @Nullable Integer getLvlRDWorkshop() {
    return lvlRDWorkshop;
  }

  public void setLvlRDWorkshop(@Nullable Integer lvlRDWorkshop) {
    this.lvlRDWorkshop = lvlRDWorkshop;
  }

  public SnFResponse lvlRDDesign(@Nullable Integer lvlRDDesign) {
    this.lvlRDDesign = lvlRDDesign;
    return this;
  }

  /**
   * Get lvlRDDesign
   * @return lvlRDDesign
   */
  
  @JsonProperty("lvlRDDesign")
  public @Nullable Integer getLvlRDDesign() {
    return lvlRDDesign;
  }

  public void setLvlRDDesign(@Nullable Integer lvlRDDesign) {
    this.lvlRDDesign = lvlRDDesign;
  }

  public SnFResponse lvlEngineering(@Nullable Integer lvlEngineering) {
    this.lvlEngineering = lvlEngineering;
    return this;
  }

  /**
   * Get lvlEngineering
   * @return lvlEngineering
   */
  
  @JsonProperty("lvlEngineering")
  public @Nullable Integer getLvlEngineering() {
    return lvlEngineering;
  }

  public void setLvlEngineering(@Nullable Integer lvlEngineering) {
    this.lvlEngineering = lvlEngineering;
  }

  public SnFResponse lvlLab(@Nullable Integer lvlLab) {
    this.lvlLab = lvlLab;
    return this;
  }

  /**
   * Get lvlLab
   * @return lvlLab
   */
  
  @JsonProperty("lvlLab")
  public @Nullable Integer getLvlLab() {
    return lvlLab;
  }

  public void setLvlLab(@Nullable Integer lvlLab) {
    this.lvlLab = lvlLab;
  }

  public SnFResponse lvlCommercial(@Nullable Integer lvlCommercial) {
    this.lvlCommercial = lvlCommercial;
    return this;
  }

  /**
   * Get lvlCommercial
   * @return lvlCommercial
   */
  
  @JsonProperty("lvlCommercial")
  public @Nullable Integer getLvlCommercial() {
    return lvlCommercial;
  }

  public void setLvlCommercial(@Nullable Integer lvlCommercial) {
    this.lvlCommercial = lvlCommercial;
  }

  public SnFResponse windtunnelOptions(List<@Valid SnFResponseWindtunnelOptionsInner> windtunnelOptions) {
    this.windtunnelOptions = windtunnelOptions;
    return this;
  }

  public SnFResponse addWindtunnelOptionsItem(SnFResponseWindtunnelOptionsInner windtunnelOptionsItem) {
    if (this.windtunnelOptions == null) {
      this.windtunnelOptions = new ArrayList<>();
    }
    this.windtunnelOptions.add(windtunnelOptionsItem);
    return this;
  }

  /**
   * Get windtunnelOptions
   * @return windtunnelOptions
   */
  @Valid 
  @JsonProperty("windtunnelOptions")
  public List<@Valid SnFResponseWindtunnelOptionsInner> getWindtunnelOptions() {
    return windtunnelOptions;
  }

  public void setWindtunnelOptions(List<@Valid SnFResponseWindtunnelOptionsInner> windtunnelOptions) {
    this.windtunnelOptions = windtunnelOptions;
  }

  public SnFResponse pitstopOptions(List<@Valid SnFResponseWindtunnelOptionsInner> pitstopOptions) {
    this.pitstopOptions = pitstopOptions;
    return this;
  }

  public SnFResponse addPitstopOptionsItem(SnFResponseWindtunnelOptionsInner pitstopOptionsItem) {
    if (this.pitstopOptions == null) {
      this.pitstopOptions = new ArrayList<>();
    }
    this.pitstopOptions.add(pitstopOptionsItem);
    return this;
  }

  /**
   * Get pitstopOptions
   * @return pitstopOptions
   */
  @Valid 
  @JsonProperty("pitstopOptions")
  public List<@Valid SnFResponseWindtunnelOptionsInner> getPitstopOptions() {
    return pitstopOptions;
  }

  public void setPitstopOptions(List<@Valid SnFResponseWindtunnelOptionsInner> pitstopOptions) {
    this.pitstopOptions = pitstopOptions;
  }

  public SnFResponse rdWorkshopOptions(List<@Valid SnFResponseWindtunnelOptionsInner> rdWorkshopOptions) {
    this.rdWorkshopOptions = rdWorkshopOptions;
    return this;
  }

  public SnFResponse addRdWorkshopOptionsItem(SnFResponseWindtunnelOptionsInner rdWorkshopOptionsItem) {
    if (this.rdWorkshopOptions == null) {
      this.rdWorkshopOptions = new ArrayList<>();
    }
    this.rdWorkshopOptions.add(rdWorkshopOptionsItem);
    return this;
  }

  /**
   * Get rdWorkshopOptions
   * @return rdWorkshopOptions
   */
  @Valid 
  @JsonProperty("RDWorkshopOptions")
  public List<@Valid SnFResponseWindtunnelOptionsInner> getRdWorkshopOptions() {
    return rdWorkshopOptions;
  }

  public void setRdWorkshopOptions(List<@Valid SnFResponseWindtunnelOptionsInner> rdWorkshopOptions) {
    this.rdWorkshopOptions = rdWorkshopOptions;
  }

  public SnFResponse rdDesignOptions(List<@Valid SnFResponseWindtunnelOptionsInner> rdDesignOptions) {
    this.rdDesignOptions = rdDesignOptions;
    return this;
  }

  public SnFResponse addRdDesignOptionsItem(SnFResponseWindtunnelOptionsInner rdDesignOptionsItem) {
    if (this.rdDesignOptions == null) {
      this.rdDesignOptions = new ArrayList<>();
    }
    this.rdDesignOptions.add(rdDesignOptionsItem);
    return this;
  }

  /**
   * Get rdDesignOptions
   * @return rdDesignOptions
   */
  @Valid 
  @JsonProperty("RDDesignOptions")
  public List<@Valid SnFResponseWindtunnelOptionsInner> getRdDesignOptions() {
    return rdDesignOptions;
  }

  public void setRdDesignOptions(List<@Valid SnFResponseWindtunnelOptionsInner> rdDesignOptions) {
    this.rdDesignOptions = rdDesignOptions;
  }

  public SnFResponse engineeringOptions(List<@Valid SnFResponseWindtunnelOptionsInner> engineeringOptions) {
    this.engineeringOptions = engineeringOptions;
    return this;
  }

  public SnFResponse addEngineeringOptionsItem(SnFResponseWindtunnelOptionsInner engineeringOptionsItem) {
    if (this.engineeringOptions == null) {
      this.engineeringOptions = new ArrayList<>();
    }
    this.engineeringOptions.add(engineeringOptionsItem);
    return this;
  }

  /**
   * Get engineeringOptions
   * @return engineeringOptions
   */
  @Valid 
  @JsonProperty("engineeringOptions")
  public List<@Valid SnFResponseWindtunnelOptionsInner> getEngineeringOptions() {
    return engineeringOptions;
  }

  public void setEngineeringOptions(List<@Valid SnFResponseWindtunnelOptionsInner> engineeringOptions) {
    this.engineeringOptions = engineeringOptions;
  }

  public SnFResponse labOptions(List<@Valid SnFResponseWindtunnelOptionsInner> labOptions) {
    this.labOptions = labOptions;
    return this;
  }

  public SnFResponse addLabOptionsItem(SnFResponseWindtunnelOptionsInner labOptionsItem) {
    if (this.labOptions == null) {
      this.labOptions = new ArrayList<>();
    }
    this.labOptions.add(labOptionsItem);
    return this;
  }

  /**
   * Get labOptions
   * @return labOptions
   */
  @Valid 
  @JsonProperty("labOptions")
  public List<@Valid SnFResponseWindtunnelOptionsInner> getLabOptions() {
    return labOptions;
  }

  public void setLabOptions(List<@Valid SnFResponseWindtunnelOptionsInner> labOptions) {
    this.labOptions = labOptions;
  }

  public SnFResponse commercialOptions(List<@Valid SnFResponseWindtunnelOptionsInner> commercialOptions) {
    this.commercialOptions = commercialOptions;
    return this;
  }

  public SnFResponse addCommercialOptionsItem(SnFResponseWindtunnelOptionsInner commercialOptionsItem) {
    if (this.commercialOptions == null) {
      this.commercialOptions = new ArrayList<>();
    }
    this.commercialOptions.add(commercialOptionsItem);
    return this;
  }

  /**
   * Get commercialOptions
   * @return commercialOptions
   */
  @Valid 
  @JsonProperty("commercialOptions")
  public List<@Valid SnFResponseWindtunnelOptionsInner> getCommercialOptions() {
    return commercialOptions;
  }

  public void setCommercialOptions(List<@Valid SnFResponseWindtunnelOptionsInner> commercialOptions) {
    this.commercialOptions = commercialOptions;
  }

  public SnFResponse selectedWindtunnel(@Nullable CarResponseChassisOptionsInnerValue selectedWindtunnel) {
    this.selectedWindtunnel = selectedWindtunnel;
    return this;
  }

  /**
   * Get selectedWindtunnel
   * @return selectedWindtunnel
   */
  @Valid 
  @JsonProperty("selectedWindtunnel")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedWindtunnel() {
    return selectedWindtunnel;
  }

  public void setSelectedWindtunnel(@Nullable CarResponseChassisOptionsInnerValue selectedWindtunnel) {
    this.selectedWindtunnel = selectedWindtunnel;
  }

  public SnFResponse selectedPitstop(@Nullable CarResponseChassisOptionsInnerValue selectedPitstop) {
    this.selectedPitstop = selectedPitstop;
    return this;
  }

  /**
   * Get selectedPitstop
   * @return selectedPitstop
   */
  @Valid 
  @JsonProperty("selectedPitstop")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedPitstop() {
    return selectedPitstop;
  }

  public void setSelectedPitstop(@Nullable CarResponseChassisOptionsInnerValue selectedPitstop) {
    this.selectedPitstop = selectedPitstop;
  }

  public SnFResponse selectedRDWorkshop(@Nullable CarResponseChassisOptionsInnerValue selectedRDWorkshop) {
    this.selectedRDWorkshop = selectedRDWorkshop;
    return this;
  }

  /**
   * Get selectedRDWorkshop
   * @return selectedRDWorkshop
   */
  @Valid 
  @JsonProperty("selectedRDWorkshop")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedRDWorkshop() {
    return selectedRDWorkshop;
  }

  public void setSelectedRDWorkshop(@Nullable CarResponseChassisOptionsInnerValue selectedRDWorkshop) {
    this.selectedRDWorkshop = selectedRDWorkshop;
  }

  public SnFResponse selectedRDDesign(@Nullable CarResponseChassisOptionsInnerValue selectedRDDesign) {
    this.selectedRDDesign = selectedRDDesign;
    return this;
  }

  /**
   * Get selectedRDDesign
   * @return selectedRDDesign
   */
  @Valid 
  @JsonProperty("selectedRDDesign")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedRDDesign() {
    return selectedRDDesign;
  }

  public void setSelectedRDDesign(@Nullable CarResponseChassisOptionsInnerValue selectedRDDesign) {
    this.selectedRDDesign = selectedRDDesign;
  }

  public SnFResponse selectedEngineering(@Nullable CarResponseChassisOptionsInnerValue selectedEngineering) {
    this.selectedEngineering = selectedEngineering;
    return this;
  }

  /**
   * Get selectedEngineering
   * @return selectedEngineering
   */
  @Valid 
  @JsonProperty("selectedEngineering")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedEngineering() {
    return selectedEngineering;
  }

  public void setSelectedEngineering(@Nullable CarResponseChassisOptionsInnerValue selectedEngineering) {
    this.selectedEngineering = selectedEngineering;
  }

  public SnFResponse selectedLab(@Nullable CarResponseChassisOptionsInnerValue selectedLab) {
    this.selectedLab = selectedLab;
    return this;
  }

  /**
   * Get selectedLab
   * @return selectedLab
   */
  @Valid 
  @JsonProperty("selectedLab")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedLab() {
    return selectedLab;
  }

  public void setSelectedLab(@Nullable CarResponseChassisOptionsInnerValue selectedLab) {
    this.selectedLab = selectedLab;
  }

  public SnFResponse selectedCommercial(@Nullable CarResponseChassisOptionsInnerValue selectedCommercial) {
    this.selectedCommercial = selectedCommercial;
    return this;
  }

  /**
   * Get selectedCommercial
   * @return selectedCommercial
   */
  @Valid 
  @JsonProperty("selectedCommercial")
  public @Nullable CarResponseChassisOptionsInnerValue getSelectedCommercial() {
    return selectedCommercial;
  }

  public void setSelectedCommercial(@Nullable CarResponseChassisOptionsInnerValue selectedCommercial) {
    this.selectedCommercial = selectedCommercial;
  }

  public SnFResponse totalCosts(@Nullable Integer totalCosts) {
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

  public SnFResponse maintenanceCost(@Nullable Integer maintenanceCost) {
    this.maintenanceCost = maintenanceCost;
    return this;
  }

  /**
   * Get maintenanceCost
   * @return maintenanceCost
   */
  
  @JsonProperty("maintenanceCost")
  public @Nullable Integer getMaintenanceCost() {
    return maintenanceCost;
  }

  public void setMaintenanceCost(@Nullable Integer maintenanceCost) {
    this.maintenanceCost = maintenanceCost;
  }

  public SnFResponse canUpdate(@Nullable Integer canUpdate) {
    this.canUpdate = canUpdate;
    return this;
  }

  /**
   * Get canUpdate
   * @return canUpdate
   */
  
  @JsonProperty("canUpdate")
  public @Nullable Integer getCanUpdate() {
    return canUpdate;
  }

  public void setCanUpdate(@Nullable Integer canUpdate) {
    this.canUpdate = canUpdate;
  }

  public SnFResponse facilitiesUpdated(@Nullable Integer facilitiesUpdated) {
    this.facilitiesUpdated = facilitiesUpdated;
    return this;
  }

  /**
   * Get facilitiesUpdated
   * @return facilitiesUpdated
   */
  
  @JsonProperty("facilitiesUpdated")
  public @Nullable Integer getFacilitiesUpdated() {
    return facilitiesUpdated;
  }

  public void setFacilitiesUpdated(@Nullable Integer facilitiesUpdated) {
    this.facilitiesUpdated = facilitiesUpdated;
  }

  public SnFResponse canUndo(@Nullable Integer canUndo) {
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

  public SnFResponse updateInProgress(@Nullable Integer updateInProgress) {
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

  public SnFResponse raceInProgress(@Nullable Integer raceInProgress) {
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

  public SnFResponse endOfSeason(@Nullable Integer endOfSeason) {
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

  public SnFResponse undoCompleted(@Nullable Integer undoCompleted) {
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

  public SnFResponse showUpdateAlert(@Nullable Integer showUpdateAlert) {
    this.showUpdateAlert = showUpdateAlert;
    return this;
  }

  /**
   * Get showUpdateAlert
   * @return showUpdateAlert
   */
  
  @JsonProperty("showUpdateAlert")
  public @Nullable Integer getShowUpdateAlert() {
    return showUpdateAlert;
  }

  public void setShowUpdateAlert(@Nullable Integer showUpdateAlert) {
    this.showUpdateAlert = showUpdateAlert;
  }

  public SnFResponse showUndoAlert(@Nullable Integer showUndoAlert) {
    this.showUndoAlert = showUndoAlert;
    return this;
  }

  /**
   * Get showUndoAlert
   * @return showUndoAlert
   */
  
  @JsonProperty("showUndoAlert")
  public @Nullable Integer getShowUndoAlert() {
    return showUndoAlert;
  }

  public void setShowUndoAlert(@Nullable Integer showUndoAlert) {
    this.showUndoAlert = showUndoAlert;
  }

  public SnFResponse showUndoAlertCredits(@Nullable Integer showUndoAlertCredits) {
    this.showUndoAlertCredits = showUndoAlertCredits;
    return this;
  }

  /**
   * Get showUndoAlertCredits
   * @return showUndoAlertCredits
   */
  
  @JsonProperty("showUndoAlertCredits")
  public @Nullable Integer getShowUndoAlertCredits() {
    return showUndoAlertCredits;
  }

  public void setShowUndoAlertCredits(@Nullable Integer showUndoAlertCredits) {
    this.showUndoAlertCredits = showUndoAlertCredits;
  }

  public SnFResponse showUndoAlertNoCredits(@Nullable Integer showUndoAlertNoCredits) {
    this.showUndoAlertNoCredits = showUndoAlertNoCredits;
    return this;
  }

  /**
   * Get showUndoAlertNoCredits
   * @return showUndoAlertNoCredits
   */
  
  @JsonProperty("showUndoAlertNoCredits")
  public @Nullable Integer getShowUndoAlertNoCredits() {
    return showUndoAlertNoCredits;
  }

  public void setShowUndoAlertNoCredits(@Nullable Integer showUndoAlertNoCredits) {
    this.showUndoAlertNoCredits = showUndoAlertNoCredits;
  }

  public SnFResponse credits(@Nullable Integer credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  
  @JsonProperty("credits")
  public @Nullable Integer getCredits() {
    return credits;
  }

  public void setCredits(@Nullable Integer credits) {
    this.credits = credits;
  }

  public SnFResponse races(@Nullable Integer races) {
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

  public SnFResponse errorMsg(@Nullable String errorMsg) {
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

  public SnFResponse setType(@Nullable String setType) {
    this.setType = setType;
    return this;
  }

  /**
   * Get setType
   * @return setType
   */
  
  @JsonProperty("setType")
  public @Nullable String getSetType() {
    return setType;
  }

  public void setSetType(@Nullable String setType) {
    this.setType = setType;
  }

  public SnFResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    SnFResponse snFResponse = (SnFResponse) o;
    return Objects.equals(this.loadingDataState, snFResponse.loadingDataState) &&
        Objects.equals(this.cash, snFResponse.cash) &&
        Objects.equals(this.overall, snFResponse.overall) &&
        Objects.equals(this.concentration, snFResponse.concentration) &&
        Objects.equals(this.experience, snFResponse.experience) &&
        Objects.equals(this.technical, snFResponse.technical) &&
        Objects.equals(this.stressHandling, snFResponse.stressHandling) &&
        Objects.equals(this.motivation, snFResponse.motivation) &&
        Objects.equals(this.efficiency, snFResponse.efficiency) &&
        Objects.equals(this.salary, snFResponse.salary) &&
        Objects.equals(this.maxTrainLevel, snFResponse.maxTrainLevel) &&
        Objects.equals(this.availTrainings, snFResponse.availTrainings) &&
        Objects.equals(this.canTrain, snFResponse.canTrain) &&
        Objects.equals(this.trainingLevelTooLow, snFResponse.trainingLevelTooLow) &&
        Objects.equals(this.trainCompleted, snFResponse.trainCompleted) &&
        Objects.equals(this.lvlWindtunnel, snFResponse.lvlWindtunnel) &&
        Objects.equals(this.lvlPitstop, snFResponse.lvlPitstop) &&
        Objects.equals(this.lvlRDWorkshop, snFResponse.lvlRDWorkshop) &&
        Objects.equals(this.lvlRDDesign, snFResponse.lvlRDDesign) &&
        Objects.equals(this.lvlEngineering, snFResponse.lvlEngineering) &&
        Objects.equals(this.lvlLab, snFResponse.lvlLab) &&
        Objects.equals(this.lvlCommercial, snFResponse.lvlCommercial) &&
        Objects.equals(this.windtunnelOptions, snFResponse.windtunnelOptions) &&
        Objects.equals(this.pitstopOptions, snFResponse.pitstopOptions) &&
        Objects.equals(this.rdWorkshopOptions, snFResponse.rdWorkshopOptions) &&
        Objects.equals(this.rdDesignOptions, snFResponse.rdDesignOptions) &&
        Objects.equals(this.engineeringOptions, snFResponse.engineeringOptions) &&
        Objects.equals(this.labOptions, snFResponse.labOptions) &&
        Objects.equals(this.commercialOptions, snFResponse.commercialOptions) &&
        Objects.equals(this.selectedWindtunnel, snFResponse.selectedWindtunnel) &&
        Objects.equals(this.selectedPitstop, snFResponse.selectedPitstop) &&
        Objects.equals(this.selectedRDWorkshop, snFResponse.selectedRDWorkshop) &&
        Objects.equals(this.selectedRDDesign, snFResponse.selectedRDDesign) &&
        Objects.equals(this.selectedEngineering, snFResponse.selectedEngineering) &&
        Objects.equals(this.selectedLab, snFResponse.selectedLab) &&
        Objects.equals(this.selectedCommercial, snFResponse.selectedCommercial) &&
        Objects.equals(this.totalCosts, snFResponse.totalCosts) &&
        Objects.equals(this.maintenanceCost, snFResponse.maintenanceCost) &&
        Objects.equals(this.canUpdate, snFResponse.canUpdate) &&
        Objects.equals(this.facilitiesUpdated, snFResponse.facilitiesUpdated) &&
        Objects.equals(this.canUndo, snFResponse.canUndo) &&
        Objects.equals(this.updateInProgress, snFResponse.updateInProgress) &&
        Objects.equals(this.raceInProgress, snFResponse.raceInProgress) &&
        Objects.equals(this.endOfSeason, snFResponse.endOfSeason) &&
        Objects.equals(this.undoCompleted, snFResponse.undoCompleted) &&
        Objects.equals(this.showUpdateAlert, snFResponse.showUpdateAlert) &&
        Objects.equals(this.showUndoAlert, snFResponse.showUndoAlert) &&
        Objects.equals(this.showUndoAlertCredits, snFResponse.showUndoAlertCredits) &&
        Objects.equals(this.showUndoAlertNoCredits, snFResponse.showUndoAlertNoCredits) &&
        Objects.equals(this.credits, snFResponse.credits) &&
        Objects.equals(this.races, snFResponse.races) &&
        Objects.equals(this.errorMsg, snFResponse.errorMsg) &&
        Objects.equals(this.setType, snFResponse.setType) &&
        Objects.equals(this.apiRequestsRemaining, snFResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, cash, overall, concentration, experience, technical, stressHandling, motivation, efficiency, salary, maxTrainLevel, availTrainings, canTrain, trainingLevelTooLow, trainCompleted, lvlWindtunnel, lvlPitstop, lvlRDWorkshop, lvlRDDesign, lvlEngineering, lvlLab, lvlCommercial, windtunnelOptions, pitstopOptions, rdWorkshopOptions, rdDesignOptions, engineeringOptions, labOptions, commercialOptions, selectedWindtunnel, selectedPitstop, selectedRDWorkshop, selectedRDDesign, selectedEngineering, selectedLab, selectedCommercial, totalCosts, maintenanceCost, canUpdate, facilitiesUpdated, canUndo, updateInProgress, raceInProgress, endOfSeason, undoCompleted, showUpdateAlert, showUndoAlert, showUndoAlertCredits, showUndoAlertNoCredits, credits, races, errorMsg, setType, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    concentration: ").append(toIndentedString(concentration)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    technical: ").append(toIndentedString(technical)).append("\n");
    sb.append("    stressHandling: ").append(toIndentedString(stressHandling)).append("\n");
    sb.append("    motivation: ").append(toIndentedString(motivation)).append("\n");
    sb.append("    efficiency: ").append(toIndentedString(efficiency)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    maxTrainLevel: ").append(toIndentedString(maxTrainLevel)).append("\n");
    sb.append("    availTrainings: ").append(toIndentedString(availTrainings)).append("\n");
    sb.append("    canTrain: ").append(toIndentedString(canTrain)).append("\n");
    sb.append("    trainingLevelTooLow: ").append(toIndentedString(trainingLevelTooLow)).append("\n");
    sb.append("    trainCompleted: ").append(toIndentedString(trainCompleted)).append("\n");
    sb.append("    lvlWindtunnel: ").append(toIndentedString(lvlWindtunnel)).append("\n");
    sb.append("    lvlPitstop: ").append(toIndentedString(lvlPitstop)).append("\n");
    sb.append("    lvlRDWorkshop: ").append(toIndentedString(lvlRDWorkshop)).append("\n");
    sb.append("    lvlRDDesign: ").append(toIndentedString(lvlRDDesign)).append("\n");
    sb.append("    lvlEngineering: ").append(toIndentedString(lvlEngineering)).append("\n");
    sb.append("    lvlLab: ").append(toIndentedString(lvlLab)).append("\n");
    sb.append("    lvlCommercial: ").append(toIndentedString(lvlCommercial)).append("\n");
    sb.append("    windtunnelOptions: ").append(toIndentedString(windtunnelOptions)).append("\n");
    sb.append("    pitstopOptions: ").append(toIndentedString(pitstopOptions)).append("\n");
    sb.append("    rdWorkshopOptions: ").append(toIndentedString(rdWorkshopOptions)).append("\n");
    sb.append("    rdDesignOptions: ").append(toIndentedString(rdDesignOptions)).append("\n");
    sb.append("    engineeringOptions: ").append(toIndentedString(engineeringOptions)).append("\n");
    sb.append("    labOptions: ").append(toIndentedString(labOptions)).append("\n");
    sb.append("    commercialOptions: ").append(toIndentedString(commercialOptions)).append("\n");
    sb.append("    selectedWindtunnel: ").append(toIndentedString(selectedWindtunnel)).append("\n");
    sb.append("    selectedPitstop: ").append(toIndentedString(selectedPitstop)).append("\n");
    sb.append("    selectedRDWorkshop: ").append(toIndentedString(selectedRDWorkshop)).append("\n");
    sb.append("    selectedRDDesign: ").append(toIndentedString(selectedRDDesign)).append("\n");
    sb.append("    selectedEngineering: ").append(toIndentedString(selectedEngineering)).append("\n");
    sb.append("    selectedLab: ").append(toIndentedString(selectedLab)).append("\n");
    sb.append("    selectedCommercial: ").append(toIndentedString(selectedCommercial)).append("\n");
    sb.append("    totalCosts: ").append(toIndentedString(totalCosts)).append("\n");
    sb.append("    maintenanceCost: ").append(toIndentedString(maintenanceCost)).append("\n");
    sb.append("    canUpdate: ").append(toIndentedString(canUpdate)).append("\n");
    sb.append("    facilitiesUpdated: ").append(toIndentedString(facilitiesUpdated)).append("\n");
    sb.append("    canUndo: ").append(toIndentedString(canUndo)).append("\n");
    sb.append("    updateInProgress: ").append(toIndentedString(updateInProgress)).append("\n");
    sb.append("    raceInProgress: ").append(toIndentedString(raceInProgress)).append("\n");
    sb.append("    endOfSeason: ").append(toIndentedString(endOfSeason)).append("\n");
    sb.append("    undoCompleted: ").append(toIndentedString(undoCompleted)).append("\n");
    sb.append("    showUpdateAlert: ").append(toIndentedString(showUpdateAlert)).append("\n");
    sb.append("    showUndoAlert: ").append(toIndentedString(showUndoAlert)).append("\n");
    sb.append("    showUndoAlertCredits: ").append(toIndentedString(showUndoAlertCredits)).append("\n");
    sb.append("    showUndoAlertNoCredits: ").append(toIndentedString(showUndoAlertNoCredits)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    setType: ").append(toIndentedString(setType)).append("\n");
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

