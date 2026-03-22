package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OfficeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class OfficeResponse {

  private @Nullable Integer loadingDataState;

  private @Nullable String seasonNb;

  private @Nullable String raceNb;

  private @Nullable String trackId;

  private @Nullable Integer endOfSeason;

  private @Nullable Integer activateTeamStatus;

  private @Nullable Integer accStatusId;

  private @Nullable String accStatus;

  private @Nullable String nextSeasonResetDate;

  private @Nullable Integer updateInProgress;

  private @Nullable Integer progress;

  private @Nullable String trackName;

  private @Nullable String trackNatCode;

  private @Nullable String secondsLeft;

  private @Nullable String secondsLeftQual;

  private @Nullable String donePractice;

  private @Nullable String doneQ1;

  private @Nullable String doneQ2;

  private @Nullable String doneRaceSetup;

  private @Nullable String doneDriTrain;

  private @Nullable String doneStaffTrain;

  private @Nullable String doneCarRepair;

  private @Nullable String doneFacilitiesUpdate;

  private @Nullable String doneTesting;

  private @Nullable String testingStints;

  private @Nullable Integer sponsorsAlert;

  private @Nullable Integer sponsorsNoNeg;

  private @Nullable Integer tyreSupplierId;

  private @Nullable String driName;

  private @Nullable String driOA;

  private @Nullable String driRacesLeft;

  private @Nullable String driSalary;

  private @Nullable String driEnergy;

  private @Nullable String driId;

  private @Nullable String tdName;

  private @Nullable String tdOA;

  private @Nullable String tdRacesLeft;

  private @Nullable String tdSalary;

  private @Nullable String tdId;

  private @Nullable String isCertified;

  private @Nullable String champs;

  private @Nullable String activationPixelFired;

  private @Nullable String pts;

  private @Nullable String pos;

  private @Nullable String avg;

  private @Nullable Integer newQualifiersQ1;

  private @Nullable Integer newQualifiersQ2;

  private @Nullable String qual1Pos;

  private @Nullable String qual1Diff;

  private @Nullable String qual1LapTime;

  private @Nullable String qual2Pos;

  private @Nullable String qual2Diff;

  private @Nullable String qual2LapTime;

  private @Nullable String qualSGPos;

  private @Nullable String qualSGDiff;

  private @Nullable String qualSGLapTime;

  private @Nullable Integer teamForumUnreadTopics;

  private @Nullable Integer forumUnreadCount;

  private @Nullable Integer unreadAnnouncements;

  private @Nullable Integer warnStatus;

  private @Nullable Integer accViolationStatus;

  private @Nullable String statusTxt;

  private @Nullable String emailNeedsUpdate;

  private @Nullable Integer emailConfirmed;

  private @Nullable Integer noFreeSpots;

  private @Nullable Boolean showTutorial;

  private @Nullable Integer needRefresh;

  private @Nullable Integer cash;

  private @Nullable Integer apiRequestsRemaining;

  public OfficeResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public OfficeResponse seasonNb(@Nullable String seasonNb) {
    this.seasonNb = seasonNb;
    return this;
  }

  /**
   * Get seasonNb
   * @return seasonNb
   */
  
  @JsonProperty("seasonNb")
  public @Nullable String getSeasonNb() {
    return seasonNb;
  }

  public void setSeasonNb(@Nullable String seasonNb) {
    this.seasonNb = seasonNb;
  }

  public OfficeResponse raceNb(@Nullable String raceNb) {
    this.raceNb = raceNb;
    return this;
  }

  /**
   * Get raceNb
   * @return raceNb
   */
  
  @JsonProperty("raceNb")
  public @Nullable String getRaceNb() {
    return raceNb;
  }

  public void setRaceNb(@Nullable String raceNb) {
    this.raceNb = raceNb;
  }

  public OfficeResponse trackId(@Nullable String trackId) {
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

  public OfficeResponse endOfSeason(@Nullable Integer endOfSeason) {
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

  public OfficeResponse activateTeamStatus(@Nullable Integer activateTeamStatus) {
    this.activateTeamStatus = activateTeamStatus;
    return this;
  }

  /**
   * Get activateTeamStatus
   * @return activateTeamStatus
   */
  
  @JsonProperty("activateTeamStatus")
  public @Nullable Integer getActivateTeamStatus() {
    return activateTeamStatus;
  }

  public void setActivateTeamStatus(@Nullable Integer activateTeamStatus) {
    this.activateTeamStatus = activateTeamStatus;
  }

  public OfficeResponse accStatusId(@Nullable Integer accStatusId) {
    this.accStatusId = accStatusId;
    return this;
  }

  /**
   * Get accStatusId
   * @return accStatusId
   */
  
  @JsonProperty("accStatusId")
  public @Nullable Integer getAccStatusId() {
    return accStatusId;
  }

  public void setAccStatusId(@Nullable Integer accStatusId) {
    this.accStatusId = accStatusId;
  }

  public OfficeResponse accStatus(@Nullable String accStatus) {
    this.accStatus = accStatus;
    return this;
  }

  /**
   * Get accStatus
   * @return accStatus
   */
  
  @JsonProperty("accStatus")
  public @Nullable String getAccStatus() {
    return accStatus;
  }

  public void setAccStatus(@Nullable String accStatus) {
    this.accStatus = accStatus;
  }

  public OfficeResponse nextSeasonResetDate(@Nullable String nextSeasonResetDate) {
    this.nextSeasonResetDate = nextSeasonResetDate;
    return this;
  }

  /**
   * Get nextSeasonResetDate
   * @return nextSeasonResetDate
   */
  
  @JsonProperty("nextSeasonResetDate")
  public @Nullable String getNextSeasonResetDate() {
    return nextSeasonResetDate;
  }

  public void setNextSeasonResetDate(@Nullable String nextSeasonResetDate) {
    this.nextSeasonResetDate = nextSeasonResetDate;
  }

  public OfficeResponse updateInProgress(@Nullable Integer updateInProgress) {
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

  public OfficeResponse progress(@Nullable Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   */
  
  @JsonProperty("progress")
  public @Nullable Integer getProgress() {
    return progress;
  }

  public void setProgress(@Nullable Integer progress) {
    this.progress = progress;
  }

  public OfficeResponse trackName(@Nullable String trackName) {
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

  public OfficeResponse trackNatCode(@Nullable String trackNatCode) {
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

  public OfficeResponse secondsLeft(@Nullable String secondsLeft) {
    this.secondsLeft = secondsLeft;
    return this;
  }

  /**
   * Get secondsLeft
   * @return secondsLeft
   */
  
  @JsonProperty("secondsLeft")
  public @Nullable String getSecondsLeft() {
    return secondsLeft;
  }

  public void setSecondsLeft(@Nullable String secondsLeft) {
    this.secondsLeft = secondsLeft;
  }

  public OfficeResponse secondsLeftQual(@Nullable String secondsLeftQual) {
    this.secondsLeftQual = secondsLeftQual;
    return this;
  }

  /**
   * Get secondsLeftQual
   * @return secondsLeftQual
   */
  
  @JsonProperty("secondsLeftQual")
  public @Nullable String getSecondsLeftQual() {
    return secondsLeftQual;
  }

  public void setSecondsLeftQual(@Nullable String secondsLeftQual) {
    this.secondsLeftQual = secondsLeftQual;
  }

  public OfficeResponse donePractice(@Nullable String donePractice) {
    this.donePractice = donePractice;
    return this;
  }

  /**
   * Get donePractice
   * @return donePractice
   */
  
  @JsonProperty("donePractice")
  public @Nullable String getDonePractice() {
    return donePractice;
  }

  public void setDonePractice(@Nullable String donePractice) {
    this.donePractice = donePractice;
  }

  public OfficeResponse doneQ1(@Nullable String doneQ1) {
    this.doneQ1 = doneQ1;
    return this;
  }

  /**
   * Get doneQ1
   * @return doneQ1
   */
  
  @JsonProperty("doneQ1")
  public @Nullable String getDoneQ1() {
    return doneQ1;
  }

  public void setDoneQ1(@Nullable String doneQ1) {
    this.doneQ1 = doneQ1;
  }

  public OfficeResponse doneQ2(@Nullable String doneQ2) {
    this.doneQ2 = doneQ2;
    return this;
  }

  /**
   * Get doneQ2
   * @return doneQ2
   */
  
  @JsonProperty("doneQ2")
  public @Nullable String getDoneQ2() {
    return doneQ2;
  }

  public void setDoneQ2(@Nullable String doneQ2) {
    this.doneQ2 = doneQ2;
  }

  public OfficeResponse doneRaceSetup(@Nullable String doneRaceSetup) {
    this.doneRaceSetup = doneRaceSetup;
    return this;
  }

  /**
   * Get doneRaceSetup
   * @return doneRaceSetup
   */
  
  @JsonProperty("doneRaceSetup")
  public @Nullable String getDoneRaceSetup() {
    return doneRaceSetup;
  }

  public void setDoneRaceSetup(@Nullable String doneRaceSetup) {
    this.doneRaceSetup = doneRaceSetup;
  }

  public OfficeResponse doneDriTrain(@Nullable String doneDriTrain) {
    this.doneDriTrain = doneDriTrain;
    return this;
  }

  /**
   * Get doneDriTrain
   * @return doneDriTrain
   */
  
  @JsonProperty("doneDriTrain")
  public @Nullable String getDoneDriTrain() {
    return doneDriTrain;
  }

  public void setDoneDriTrain(@Nullable String doneDriTrain) {
    this.doneDriTrain = doneDriTrain;
  }

  public OfficeResponse doneStaffTrain(@Nullable String doneStaffTrain) {
    this.doneStaffTrain = doneStaffTrain;
    return this;
  }

  /**
   * Get doneStaffTrain
   * @return doneStaffTrain
   */
  
  @JsonProperty("doneStaffTrain")
  public @Nullable String getDoneStaffTrain() {
    return doneStaffTrain;
  }

  public void setDoneStaffTrain(@Nullable String doneStaffTrain) {
    this.doneStaffTrain = doneStaffTrain;
  }

  public OfficeResponse doneCarRepair(@Nullable String doneCarRepair) {
    this.doneCarRepair = doneCarRepair;
    return this;
  }

  /**
   * Get doneCarRepair
   * @return doneCarRepair
   */
  
  @JsonProperty("doneCarRepair")
  public @Nullable String getDoneCarRepair() {
    return doneCarRepair;
  }

  public void setDoneCarRepair(@Nullable String doneCarRepair) {
    this.doneCarRepair = doneCarRepair;
  }

  public OfficeResponse doneFacilitiesUpdate(@Nullable String doneFacilitiesUpdate) {
    this.doneFacilitiesUpdate = doneFacilitiesUpdate;
    return this;
  }

  /**
   * Get doneFacilitiesUpdate
   * @return doneFacilitiesUpdate
   */
  
  @JsonProperty("doneFacilitiesUpdate")
  public @Nullable String getDoneFacilitiesUpdate() {
    return doneFacilitiesUpdate;
  }

  public void setDoneFacilitiesUpdate(@Nullable String doneFacilitiesUpdate) {
    this.doneFacilitiesUpdate = doneFacilitiesUpdate;
  }

  public OfficeResponse doneTesting(@Nullable String doneTesting) {
    this.doneTesting = doneTesting;
    return this;
  }

  /**
   * Get doneTesting
   * @return doneTesting
   */
  
  @JsonProperty("doneTesting")
  public @Nullable String getDoneTesting() {
    return doneTesting;
  }

  public void setDoneTesting(@Nullable String doneTesting) {
    this.doneTesting = doneTesting;
  }

  public OfficeResponse testingStints(@Nullable String testingStints) {
    this.testingStints = testingStints;
    return this;
  }

  /**
   * Get testingStints
   * @return testingStints
   */
  
  @JsonProperty("testingStints")
  public @Nullable String getTestingStints() {
    return testingStints;
  }

  public void setTestingStints(@Nullable String testingStints) {
    this.testingStints = testingStints;
  }

  public OfficeResponse sponsorsAlert(@Nullable Integer sponsorsAlert) {
    this.sponsorsAlert = sponsorsAlert;
    return this;
  }

  /**
   * Get sponsorsAlert
   * @return sponsorsAlert
   */
  
  @JsonProperty("sponsorsAlert")
  public @Nullable Integer getSponsorsAlert() {
    return sponsorsAlert;
  }

  public void setSponsorsAlert(@Nullable Integer sponsorsAlert) {
    this.sponsorsAlert = sponsorsAlert;
  }

  public OfficeResponse sponsorsNoNeg(@Nullable Integer sponsorsNoNeg) {
    this.sponsorsNoNeg = sponsorsNoNeg;
    return this;
  }

  /**
   * Get sponsorsNoNeg
   * @return sponsorsNoNeg
   */
  
  @JsonProperty("sponsorsNoNeg")
  public @Nullable Integer getSponsorsNoNeg() {
    return sponsorsNoNeg;
  }

  public void setSponsorsNoNeg(@Nullable Integer sponsorsNoNeg) {
    this.sponsorsNoNeg = sponsorsNoNeg;
  }

  public OfficeResponse tyreSupplierId(@Nullable Integer tyreSupplierId) {
    this.tyreSupplierId = tyreSupplierId;
    return this;
  }

  /**
   * Get tyreSupplierId
   * @return tyreSupplierId
   */
  
  @JsonProperty("tyreSupplierId")
  public @Nullable Integer getTyreSupplierId() {
    return tyreSupplierId;
  }

  public void setTyreSupplierId(@Nullable Integer tyreSupplierId) {
    this.tyreSupplierId = tyreSupplierId;
  }

  public OfficeResponse driName(@Nullable String driName) {
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

  public OfficeResponse driOA(@Nullable String driOA) {
    this.driOA = driOA;
    return this;
  }

  /**
   * Get driOA
   * @return driOA
   */
  
  @JsonProperty("driOA")
  public @Nullable String getDriOA() {
    return driOA;
  }

  public void setDriOA(@Nullable String driOA) {
    this.driOA = driOA;
  }

  public OfficeResponse driRacesLeft(@Nullable String driRacesLeft) {
    this.driRacesLeft = driRacesLeft;
    return this;
  }

  /**
   * Get driRacesLeft
   * @return driRacesLeft
   */
  
  @JsonProperty("driRacesLeft")
  public @Nullable String getDriRacesLeft() {
    return driRacesLeft;
  }

  public void setDriRacesLeft(@Nullable String driRacesLeft) {
    this.driRacesLeft = driRacesLeft;
  }

  public OfficeResponse driSalary(@Nullable String driSalary) {
    this.driSalary = driSalary;
    return this;
  }

  /**
   * Get driSalary
   * @return driSalary
   */
  
  @JsonProperty("driSalary")
  public @Nullable String getDriSalary() {
    return driSalary;
  }

  public void setDriSalary(@Nullable String driSalary) {
    this.driSalary = driSalary;
  }

  public OfficeResponse driEnergy(@Nullable String driEnergy) {
    this.driEnergy = driEnergy;
    return this;
  }

  /**
   * Get driEnergy
   * @return driEnergy
   */
  
  @JsonProperty("driEnergy")
  public @Nullable String getDriEnergy() {
    return driEnergy;
  }

  public void setDriEnergy(@Nullable String driEnergy) {
    this.driEnergy = driEnergy;
  }

  public OfficeResponse driId(@Nullable String driId) {
    this.driId = driId;
    return this;
  }

  /**
   * Get driId
   * @return driId
   */
  
  @JsonProperty("driId")
  public @Nullable String getDriId() {
    return driId;
  }

  public void setDriId(@Nullable String driId) {
    this.driId = driId;
  }

  public OfficeResponse tdName(@Nullable String tdName) {
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

  public OfficeResponse tdOA(@Nullable String tdOA) {
    this.tdOA = tdOA;
    return this;
  }

  /**
   * Get tdOA
   * @return tdOA
   */
  
  @JsonProperty("tdOA")
  public @Nullable String getTdOA() {
    return tdOA;
  }

  public void setTdOA(@Nullable String tdOA) {
    this.tdOA = tdOA;
  }

  public OfficeResponse tdRacesLeft(@Nullable String tdRacesLeft) {
    this.tdRacesLeft = tdRacesLeft;
    return this;
  }

  /**
   * Get tdRacesLeft
   * @return tdRacesLeft
   */
  
  @JsonProperty("tdRacesLeft")
  public @Nullable String getTdRacesLeft() {
    return tdRacesLeft;
  }

  public void setTdRacesLeft(@Nullable String tdRacesLeft) {
    this.tdRacesLeft = tdRacesLeft;
  }

  public OfficeResponse tdSalary(@Nullable String tdSalary) {
    this.tdSalary = tdSalary;
    return this;
  }

  /**
   * Get tdSalary
   * @return tdSalary
   */
  
  @JsonProperty("tdSalary")
  public @Nullable String getTdSalary() {
    return tdSalary;
  }

  public void setTdSalary(@Nullable String tdSalary) {
    this.tdSalary = tdSalary;
  }

  public OfficeResponse tdId(@Nullable String tdId) {
    this.tdId = tdId;
    return this;
  }

  /**
   * Get tdId
   * @return tdId
   */
  
  @JsonProperty("tdId")
  public @Nullable String getTdId() {
    return tdId;
  }

  public void setTdId(@Nullable String tdId) {
    this.tdId = tdId;
  }

  public OfficeResponse isCertified(@Nullable String isCertified) {
    this.isCertified = isCertified;
    return this;
  }

  /**
   * Get isCertified
   * @return isCertified
   */
  
  @JsonProperty("isCertified")
  public @Nullable String getIsCertified() {
    return isCertified;
  }

  public void setIsCertified(@Nullable String isCertified) {
    this.isCertified = isCertified;
  }

  public OfficeResponse champs(@Nullable String champs) {
    this.champs = champs;
    return this;
  }

  /**
   * Get champs
   * @return champs
   */
  
  @JsonProperty("champs")
  public @Nullable String getChamps() {
    return champs;
  }

  public void setChamps(@Nullable String champs) {
    this.champs = champs;
  }

  public OfficeResponse activationPixelFired(@Nullable String activationPixelFired) {
    this.activationPixelFired = activationPixelFired;
    return this;
  }

  /**
   * Get activationPixelFired
   * @return activationPixelFired
   */
  
  @JsonProperty("activationPixelFired")
  public @Nullable String getActivationPixelFired() {
    return activationPixelFired;
  }

  public void setActivationPixelFired(@Nullable String activationPixelFired) {
    this.activationPixelFired = activationPixelFired;
  }

  public OfficeResponse pts(@Nullable String pts) {
    this.pts = pts;
    return this;
  }

  /**
   * Get pts
   * @return pts
   */
  
  @JsonProperty("pts")
  public @Nullable String getPts() {
    return pts;
  }

  public void setPts(@Nullable String pts) {
    this.pts = pts;
  }

  public OfficeResponse pos(@Nullable String pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
   */
  
  @JsonProperty("pos")
  public @Nullable String getPos() {
    return pos;
  }

  public void setPos(@Nullable String pos) {
    this.pos = pos;
  }

  public OfficeResponse avg(@Nullable String avg) {
    this.avg = avg;
    return this;
  }

  /**
   * Get avg
   * @return avg
   */
  
  @JsonProperty("avg")
  public @Nullable String getAvg() {
    return avg;
  }

  public void setAvg(@Nullable String avg) {
    this.avg = avg;
  }

  public OfficeResponse newQualifiersQ1(@Nullable Integer newQualifiersQ1) {
    this.newQualifiersQ1 = newQualifiersQ1;
    return this;
  }

  /**
   * Get newQualifiersQ1
   * @return newQualifiersQ1
   */
  
  @JsonProperty("newQualifiersQ1")
  public @Nullable Integer getNewQualifiersQ1() {
    return newQualifiersQ1;
  }

  public void setNewQualifiersQ1(@Nullable Integer newQualifiersQ1) {
    this.newQualifiersQ1 = newQualifiersQ1;
  }

  public OfficeResponse newQualifiersQ2(@Nullable Integer newQualifiersQ2) {
    this.newQualifiersQ2 = newQualifiersQ2;
    return this;
  }

  /**
   * Get newQualifiersQ2
   * @return newQualifiersQ2
   */
  
  @JsonProperty("newQualifiersQ2")
  public @Nullable Integer getNewQualifiersQ2() {
    return newQualifiersQ2;
  }

  public void setNewQualifiersQ2(@Nullable Integer newQualifiersQ2) {
    this.newQualifiersQ2 = newQualifiersQ2;
  }

  public OfficeResponse qual1Pos(@Nullable String qual1Pos) {
    this.qual1Pos = qual1Pos;
    return this;
  }

  /**
   * Get qual1Pos
   * @return qual1Pos
   */
  
  @JsonProperty("qual1Pos")
  public @Nullable String getQual1Pos() {
    return qual1Pos;
  }

  public void setQual1Pos(@Nullable String qual1Pos) {
    this.qual1Pos = qual1Pos;
  }

  public OfficeResponse qual1Diff(@Nullable String qual1Diff) {
    this.qual1Diff = qual1Diff;
    return this;
  }

  /**
   * Get qual1Diff
   * @return qual1Diff
   */
  
  @JsonProperty("qual1Diff")
  public @Nullable String getQual1Diff() {
    return qual1Diff;
  }

  public void setQual1Diff(@Nullable String qual1Diff) {
    this.qual1Diff = qual1Diff;
  }

  public OfficeResponse qual1LapTime(@Nullable String qual1LapTime) {
    this.qual1LapTime = qual1LapTime;
    return this;
  }

  /**
   * Get qual1LapTime
   * @return qual1LapTime
   */
  
  @JsonProperty("qual1LapTime")
  public @Nullable String getQual1LapTime() {
    return qual1LapTime;
  }

  public void setQual1LapTime(@Nullable String qual1LapTime) {
    this.qual1LapTime = qual1LapTime;
  }

  public OfficeResponse qual2Pos(@Nullable String qual2Pos) {
    this.qual2Pos = qual2Pos;
    return this;
  }

  /**
   * Get qual2Pos
   * @return qual2Pos
   */
  
  @JsonProperty("qual2Pos")
  public @Nullable String getQual2Pos() {
    return qual2Pos;
  }

  public void setQual2Pos(@Nullable String qual2Pos) {
    this.qual2Pos = qual2Pos;
  }

  public OfficeResponse qual2Diff(@Nullable String qual2Diff) {
    this.qual2Diff = qual2Diff;
    return this;
  }

  /**
   * Get qual2Diff
   * @return qual2Diff
   */
  
  @JsonProperty("qual2Diff")
  public @Nullable String getQual2Diff() {
    return qual2Diff;
  }

  public void setQual2Diff(@Nullable String qual2Diff) {
    this.qual2Diff = qual2Diff;
  }

  public OfficeResponse qual2LapTime(@Nullable String qual2LapTime) {
    this.qual2LapTime = qual2LapTime;
    return this;
  }

  /**
   * Get qual2LapTime
   * @return qual2LapTime
   */
  
  @JsonProperty("qual2LapTime")
  public @Nullable String getQual2LapTime() {
    return qual2LapTime;
  }

  public void setQual2LapTime(@Nullable String qual2LapTime) {
    this.qual2LapTime = qual2LapTime;
  }

  public OfficeResponse qualSGPos(@Nullable String qualSGPos) {
    this.qualSGPos = qualSGPos;
    return this;
  }

  /**
   * Get qualSGPos
   * @return qualSGPos
   */
  
  @JsonProperty("qualSGPos")
  public @Nullable String getQualSGPos() {
    return qualSGPos;
  }

  public void setQualSGPos(@Nullable String qualSGPos) {
    this.qualSGPos = qualSGPos;
  }

  public OfficeResponse qualSGDiff(@Nullable String qualSGDiff) {
    this.qualSGDiff = qualSGDiff;
    return this;
  }

  /**
   * Get qualSGDiff
   * @return qualSGDiff
   */
  
  @JsonProperty("qualSGDiff")
  public @Nullable String getQualSGDiff() {
    return qualSGDiff;
  }

  public void setQualSGDiff(@Nullable String qualSGDiff) {
    this.qualSGDiff = qualSGDiff;
  }

  public OfficeResponse qualSGLapTime(@Nullable String qualSGLapTime) {
    this.qualSGLapTime = qualSGLapTime;
    return this;
  }

  /**
   * Get qualSGLapTime
   * @return qualSGLapTime
   */
  
  @JsonProperty("qualSGLapTime")
  public @Nullable String getQualSGLapTime() {
    return qualSGLapTime;
  }

  public void setQualSGLapTime(@Nullable String qualSGLapTime) {
    this.qualSGLapTime = qualSGLapTime;
  }

  public OfficeResponse teamForumUnreadTopics(@Nullable Integer teamForumUnreadTopics) {
    this.teamForumUnreadTopics = teamForumUnreadTopics;
    return this;
  }

  /**
   * Get teamForumUnreadTopics
   * @return teamForumUnreadTopics
   */
  
  @JsonProperty("teamForumUnreadTopics")
  public @Nullable Integer getTeamForumUnreadTopics() {
    return teamForumUnreadTopics;
  }

  public void setTeamForumUnreadTopics(@Nullable Integer teamForumUnreadTopics) {
    this.teamForumUnreadTopics = teamForumUnreadTopics;
  }

  public OfficeResponse forumUnreadCount(@Nullable Integer forumUnreadCount) {
    this.forumUnreadCount = forumUnreadCount;
    return this;
  }

  /**
   * Get forumUnreadCount
   * @return forumUnreadCount
   */
  
  @JsonProperty("forumUnreadCount")
  public @Nullable Integer getForumUnreadCount() {
    return forumUnreadCount;
  }

  public void setForumUnreadCount(@Nullable Integer forumUnreadCount) {
    this.forumUnreadCount = forumUnreadCount;
  }

  public OfficeResponse unreadAnnouncements(@Nullable Integer unreadAnnouncements) {
    this.unreadAnnouncements = unreadAnnouncements;
    return this;
  }

  /**
   * Get unreadAnnouncements
   * @return unreadAnnouncements
   */
  
  @JsonProperty("unreadAnnouncements")
  public @Nullable Integer getUnreadAnnouncements() {
    return unreadAnnouncements;
  }

  public void setUnreadAnnouncements(@Nullable Integer unreadAnnouncements) {
    this.unreadAnnouncements = unreadAnnouncements;
  }

  public OfficeResponse warnStatus(@Nullable Integer warnStatus) {
    this.warnStatus = warnStatus;
    return this;
  }

  /**
   * Get warnStatus
   * @return warnStatus
   */
  
  @JsonProperty("warnStatus")
  public @Nullable Integer getWarnStatus() {
    return warnStatus;
  }

  public void setWarnStatus(@Nullable Integer warnStatus) {
    this.warnStatus = warnStatus;
  }

  public OfficeResponse accViolationStatus(@Nullable Integer accViolationStatus) {
    this.accViolationStatus = accViolationStatus;
    return this;
  }

  /**
   * Get accViolationStatus
   * @return accViolationStatus
   */
  
  @JsonProperty("accViolationStatus")
  public @Nullable Integer getAccViolationStatus() {
    return accViolationStatus;
  }

  public void setAccViolationStatus(@Nullable Integer accViolationStatus) {
    this.accViolationStatus = accViolationStatus;
  }

  public OfficeResponse statusTxt(@Nullable String statusTxt) {
    this.statusTxt = statusTxt;
    return this;
  }

  /**
   * Get statusTxt
   * @return statusTxt
   */
  
  @JsonProperty("statusTxt")
  public @Nullable String getStatusTxt() {
    return statusTxt;
  }

  public void setStatusTxt(@Nullable String statusTxt) {
    this.statusTxt = statusTxt;
  }

  public OfficeResponse emailNeedsUpdate(@Nullable String emailNeedsUpdate) {
    this.emailNeedsUpdate = emailNeedsUpdate;
    return this;
  }

  /**
   * Get emailNeedsUpdate
   * @return emailNeedsUpdate
   */
  
  @JsonProperty("emailNeedsUpdate")
  public @Nullable String getEmailNeedsUpdate() {
    return emailNeedsUpdate;
  }

  public void setEmailNeedsUpdate(@Nullable String emailNeedsUpdate) {
    this.emailNeedsUpdate = emailNeedsUpdate;
  }

  public OfficeResponse emailConfirmed(@Nullable Integer emailConfirmed) {
    this.emailConfirmed = emailConfirmed;
    return this;
  }

  /**
   * Get emailConfirmed
   * @return emailConfirmed
   */
  
  @JsonProperty("emailConfirmed")
  public @Nullable Integer getEmailConfirmed() {
    return emailConfirmed;
  }

  public void setEmailConfirmed(@Nullable Integer emailConfirmed) {
    this.emailConfirmed = emailConfirmed;
  }

  public OfficeResponse noFreeSpots(@Nullable Integer noFreeSpots) {
    this.noFreeSpots = noFreeSpots;
    return this;
  }

  /**
   * Get noFreeSpots
   * @return noFreeSpots
   */
  
  @JsonProperty("noFreeSpots")
  public @Nullable Integer getNoFreeSpots() {
    return noFreeSpots;
  }

  public void setNoFreeSpots(@Nullable Integer noFreeSpots) {
    this.noFreeSpots = noFreeSpots;
  }

  public OfficeResponse showTutorial(@Nullable Boolean showTutorial) {
    this.showTutorial = showTutorial;
    return this;
  }

  /**
   * Get showTutorial
   * @return showTutorial
   */
  
  @JsonProperty("showTutorial")
  public @Nullable Boolean getShowTutorial() {
    return showTutorial;
  }

  public void setShowTutorial(@Nullable Boolean showTutorial) {
    this.showTutorial = showTutorial;
  }

  public OfficeResponse needRefresh(@Nullable Integer needRefresh) {
    this.needRefresh = needRefresh;
    return this;
  }

  /**
   * Get needRefresh
   * @return needRefresh
   */
  
  @JsonProperty("needRefresh")
  public @Nullable Integer getNeedRefresh() {
    return needRefresh;
  }

  public void setNeedRefresh(@Nullable Integer needRefresh) {
    this.needRefresh = needRefresh;
  }

  public OfficeResponse cash(@Nullable Integer cash) {
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

  public OfficeResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    OfficeResponse officeResponse = (OfficeResponse) o;
    return Objects.equals(this.loadingDataState, officeResponse.loadingDataState) &&
        Objects.equals(this.seasonNb, officeResponse.seasonNb) &&
        Objects.equals(this.raceNb, officeResponse.raceNb) &&
        Objects.equals(this.trackId, officeResponse.trackId) &&
        Objects.equals(this.endOfSeason, officeResponse.endOfSeason) &&
        Objects.equals(this.activateTeamStatus, officeResponse.activateTeamStatus) &&
        Objects.equals(this.accStatusId, officeResponse.accStatusId) &&
        Objects.equals(this.accStatus, officeResponse.accStatus) &&
        Objects.equals(this.nextSeasonResetDate, officeResponse.nextSeasonResetDate) &&
        Objects.equals(this.updateInProgress, officeResponse.updateInProgress) &&
        Objects.equals(this.progress, officeResponse.progress) &&
        Objects.equals(this.trackName, officeResponse.trackName) &&
        Objects.equals(this.trackNatCode, officeResponse.trackNatCode) &&
        Objects.equals(this.secondsLeft, officeResponse.secondsLeft) &&
        Objects.equals(this.secondsLeftQual, officeResponse.secondsLeftQual) &&
        Objects.equals(this.donePractice, officeResponse.donePractice) &&
        Objects.equals(this.doneQ1, officeResponse.doneQ1) &&
        Objects.equals(this.doneQ2, officeResponse.doneQ2) &&
        Objects.equals(this.doneRaceSetup, officeResponse.doneRaceSetup) &&
        Objects.equals(this.doneDriTrain, officeResponse.doneDriTrain) &&
        Objects.equals(this.doneStaffTrain, officeResponse.doneStaffTrain) &&
        Objects.equals(this.doneCarRepair, officeResponse.doneCarRepair) &&
        Objects.equals(this.doneFacilitiesUpdate, officeResponse.doneFacilitiesUpdate) &&
        Objects.equals(this.doneTesting, officeResponse.doneTesting) &&
        Objects.equals(this.testingStints, officeResponse.testingStints) &&
        Objects.equals(this.sponsorsAlert, officeResponse.sponsorsAlert) &&
        Objects.equals(this.sponsorsNoNeg, officeResponse.sponsorsNoNeg) &&
        Objects.equals(this.tyreSupplierId, officeResponse.tyreSupplierId) &&
        Objects.equals(this.driName, officeResponse.driName) &&
        Objects.equals(this.driOA, officeResponse.driOA) &&
        Objects.equals(this.driRacesLeft, officeResponse.driRacesLeft) &&
        Objects.equals(this.driSalary, officeResponse.driSalary) &&
        Objects.equals(this.driEnergy, officeResponse.driEnergy) &&
        Objects.equals(this.driId, officeResponse.driId) &&
        Objects.equals(this.tdName, officeResponse.tdName) &&
        Objects.equals(this.tdOA, officeResponse.tdOA) &&
        Objects.equals(this.tdRacesLeft, officeResponse.tdRacesLeft) &&
        Objects.equals(this.tdSalary, officeResponse.tdSalary) &&
        Objects.equals(this.tdId, officeResponse.tdId) &&
        Objects.equals(this.isCertified, officeResponse.isCertified) &&
        Objects.equals(this.champs, officeResponse.champs) &&
        Objects.equals(this.activationPixelFired, officeResponse.activationPixelFired) &&
        Objects.equals(this.pts, officeResponse.pts) &&
        Objects.equals(this.pos, officeResponse.pos) &&
        Objects.equals(this.avg, officeResponse.avg) &&
        Objects.equals(this.newQualifiersQ1, officeResponse.newQualifiersQ1) &&
        Objects.equals(this.newQualifiersQ2, officeResponse.newQualifiersQ2) &&
        Objects.equals(this.qual1Pos, officeResponse.qual1Pos) &&
        Objects.equals(this.qual1Diff, officeResponse.qual1Diff) &&
        Objects.equals(this.qual1LapTime, officeResponse.qual1LapTime) &&
        Objects.equals(this.qual2Pos, officeResponse.qual2Pos) &&
        Objects.equals(this.qual2Diff, officeResponse.qual2Diff) &&
        Objects.equals(this.qual2LapTime, officeResponse.qual2LapTime) &&
        Objects.equals(this.qualSGPos, officeResponse.qualSGPos) &&
        Objects.equals(this.qualSGDiff, officeResponse.qualSGDiff) &&
        Objects.equals(this.qualSGLapTime, officeResponse.qualSGLapTime) &&
        Objects.equals(this.teamForumUnreadTopics, officeResponse.teamForumUnreadTopics) &&
        Objects.equals(this.forumUnreadCount, officeResponse.forumUnreadCount) &&
        Objects.equals(this.unreadAnnouncements, officeResponse.unreadAnnouncements) &&
        Objects.equals(this.warnStatus, officeResponse.warnStatus) &&
        Objects.equals(this.accViolationStatus, officeResponse.accViolationStatus) &&
        Objects.equals(this.statusTxt, officeResponse.statusTxt) &&
        Objects.equals(this.emailNeedsUpdate, officeResponse.emailNeedsUpdate) &&
        Objects.equals(this.emailConfirmed, officeResponse.emailConfirmed) &&
        Objects.equals(this.noFreeSpots, officeResponse.noFreeSpots) &&
        Objects.equals(this.showTutorial, officeResponse.showTutorial) &&
        Objects.equals(this.needRefresh, officeResponse.needRefresh) &&
        Objects.equals(this.cash, officeResponse.cash) &&
        Objects.equals(this.apiRequestsRemaining, officeResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, seasonNb, raceNb, trackId, endOfSeason, activateTeamStatus, accStatusId, accStatus, nextSeasonResetDate, updateInProgress, progress, trackName, trackNatCode, secondsLeft, secondsLeftQual, donePractice, doneQ1, doneQ2, doneRaceSetup, doneDriTrain, doneStaffTrain, doneCarRepair, doneFacilitiesUpdate, doneTesting, testingStints, sponsorsAlert, sponsorsNoNeg, tyreSupplierId, driName, driOA, driRacesLeft, driSalary, driEnergy, driId, tdName, tdOA, tdRacesLeft, tdSalary, tdId, isCertified, champs, activationPixelFired, pts, pos, avg, newQualifiersQ1, newQualifiersQ2, qual1Pos, qual1Diff, qual1LapTime, qual2Pos, qual2Diff, qual2LapTime, qualSGPos, qualSGDiff, qualSGLapTime, teamForumUnreadTopics, forumUnreadCount, unreadAnnouncements, warnStatus, accViolationStatus, statusTxt, emailNeedsUpdate, emailConfirmed, noFreeSpots, showTutorial, needRefresh, cash, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    seasonNb: ").append(toIndentedString(seasonNb)).append("\n");
    sb.append("    raceNb: ").append(toIndentedString(raceNb)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    endOfSeason: ").append(toIndentedString(endOfSeason)).append("\n");
    sb.append("    activateTeamStatus: ").append(toIndentedString(activateTeamStatus)).append("\n");
    sb.append("    accStatusId: ").append(toIndentedString(accStatusId)).append("\n");
    sb.append("    accStatus: ").append(toIndentedString(accStatus)).append("\n");
    sb.append("    nextSeasonResetDate: ").append(toIndentedString(nextSeasonResetDate)).append("\n");
    sb.append("    updateInProgress: ").append(toIndentedString(updateInProgress)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackNatCode: ").append(toIndentedString(trackNatCode)).append("\n");
    sb.append("    secondsLeft: ").append(toIndentedString(secondsLeft)).append("\n");
    sb.append("    secondsLeftQual: ").append(toIndentedString(secondsLeftQual)).append("\n");
    sb.append("    donePractice: ").append(toIndentedString(donePractice)).append("\n");
    sb.append("    doneQ1: ").append(toIndentedString(doneQ1)).append("\n");
    sb.append("    doneQ2: ").append(toIndentedString(doneQ2)).append("\n");
    sb.append("    doneRaceSetup: ").append(toIndentedString(doneRaceSetup)).append("\n");
    sb.append("    doneDriTrain: ").append(toIndentedString(doneDriTrain)).append("\n");
    sb.append("    doneStaffTrain: ").append(toIndentedString(doneStaffTrain)).append("\n");
    sb.append("    doneCarRepair: ").append(toIndentedString(doneCarRepair)).append("\n");
    sb.append("    doneFacilitiesUpdate: ").append(toIndentedString(doneFacilitiesUpdate)).append("\n");
    sb.append("    doneTesting: ").append(toIndentedString(doneTesting)).append("\n");
    sb.append("    testingStints: ").append(toIndentedString(testingStints)).append("\n");
    sb.append("    sponsorsAlert: ").append(toIndentedString(sponsorsAlert)).append("\n");
    sb.append("    sponsorsNoNeg: ").append(toIndentedString(sponsorsNoNeg)).append("\n");
    sb.append("    tyreSupplierId: ").append(toIndentedString(tyreSupplierId)).append("\n");
    sb.append("    driName: ").append(toIndentedString(driName)).append("\n");
    sb.append("    driOA: ").append(toIndentedString(driOA)).append("\n");
    sb.append("    driRacesLeft: ").append(toIndentedString(driRacesLeft)).append("\n");
    sb.append("    driSalary: ").append(toIndentedString(driSalary)).append("\n");
    sb.append("    driEnergy: ").append(toIndentedString(driEnergy)).append("\n");
    sb.append("    driId: ").append(toIndentedString(driId)).append("\n");
    sb.append("    tdName: ").append(toIndentedString(tdName)).append("\n");
    sb.append("    tdOA: ").append(toIndentedString(tdOA)).append("\n");
    sb.append("    tdRacesLeft: ").append(toIndentedString(tdRacesLeft)).append("\n");
    sb.append("    tdSalary: ").append(toIndentedString(tdSalary)).append("\n");
    sb.append("    tdId: ").append(toIndentedString(tdId)).append("\n");
    sb.append("    isCertified: ").append(toIndentedString(isCertified)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    activationPixelFired: ").append(toIndentedString(activationPixelFired)).append("\n");
    sb.append("    pts: ").append(toIndentedString(pts)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    newQualifiersQ1: ").append(toIndentedString(newQualifiersQ1)).append("\n");
    sb.append("    newQualifiersQ2: ").append(toIndentedString(newQualifiersQ2)).append("\n");
    sb.append("    qual1Pos: ").append(toIndentedString(qual1Pos)).append("\n");
    sb.append("    qual1Diff: ").append(toIndentedString(qual1Diff)).append("\n");
    sb.append("    qual1LapTime: ").append(toIndentedString(qual1LapTime)).append("\n");
    sb.append("    qual2Pos: ").append(toIndentedString(qual2Pos)).append("\n");
    sb.append("    qual2Diff: ").append(toIndentedString(qual2Diff)).append("\n");
    sb.append("    qual2LapTime: ").append(toIndentedString(qual2LapTime)).append("\n");
    sb.append("    qualSGPos: ").append(toIndentedString(qualSGPos)).append("\n");
    sb.append("    qualSGDiff: ").append(toIndentedString(qualSGDiff)).append("\n");
    sb.append("    qualSGLapTime: ").append(toIndentedString(qualSGLapTime)).append("\n");
    sb.append("    teamForumUnreadTopics: ").append(toIndentedString(teamForumUnreadTopics)).append("\n");
    sb.append("    forumUnreadCount: ").append(toIndentedString(forumUnreadCount)).append("\n");
    sb.append("    unreadAnnouncements: ").append(toIndentedString(unreadAnnouncements)).append("\n");
    sb.append("    warnStatus: ").append(toIndentedString(warnStatus)).append("\n");
    sb.append("    accViolationStatus: ").append(toIndentedString(accViolationStatus)).append("\n");
    sb.append("    statusTxt: ").append(toIndentedString(statusTxt)).append("\n");
    sb.append("    emailNeedsUpdate: ").append(toIndentedString(emailNeedsUpdate)).append("\n");
    sb.append("    emailConfirmed: ").append(toIndentedString(emailConfirmed)).append("\n");
    sb.append("    noFreeSpots: ").append(toIndentedString(noFreeSpots)).append("\n");
    sb.append("    showTutorial: ").append(toIndentedString(showTutorial)).append("\n");
    sb.append("    needRefresh: ").append(toIndentedString(needRefresh)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
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

