package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.jlobato.gpro.proxy.model.TrackProfileResponseQualRecord;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TrackProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TrackProfileResponse {

  private @Nullable String loadingDataState;

  private @Nullable Integer trackNotFoundNote;

  private @Nullable String location;

  private @Nullable String trackName;

  private @Nullable String trackImage;

  private @Nullable String date;

  private @Nullable Integer power;

  private @Nullable Integer accel;

  private @Nullable Integer handl;

  private @Nullable String raceDistance;

  private @Nullable Integer laps;

  private @Nullable String downforce;

  private @Nullable String lapDistance;

  private @Nullable String overtaking;

  private @Nullable String avgSpeed;

  private @Nullable String suspRigidity;

  private @Nullable Integer gpsHeld;

  private @Nullable String fuelConsumption;

  private @Nullable Integer nbTurns;

  private @Nullable String tyreWear;

  private @Nullable String timeInOutPits;

  private @Nullable String gripLevel;

  private @Nullable String category;

  private @Nullable TrackProfileResponseQualRecord qualRecord;

  private @Nullable TrackProfileResponseQualRecord raceRecord;

  private @Nullable TrackProfileResponseQualRecord qualRecordWet;

  private @Nullable TrackProfileResponseQualRecord raceRecordWet;

  private @Nullable String achievWin;

  private @Nullable String achievFL;

  private @Nullable String achievPole;

  private @Nullable Integer rpoints;

  private @Nullable Integer rpodiums;

  private @Nullable Integer rwins;

  private @Nullable Integer rpoles;

  private @Nullable Integer rfLs;

  private @Nullable Integer rraces;

  private @Nullable Integer apoints;

  private @Nullable Integer apodiums;

  private @Nullable Integer awins;

  private @Nullable Integer apoles;

  private @Nullable Integer afLs;

  private @Nullable Integer araces;

  private @Nullable Integer ppoints;

  private @Nullable Integer ppodiums;

  private @Nullable Integer pwins;

  private @Nullable Integer ppoles;

  private @Nullable Integer pfLs;

  private @Nullable Integer praces;

  private @Nullable Integer mpoints;

  private @Nullable Integer mpodiums;

  private @Nullable Integer mwins;

  private @Nullable Integer mpoles;

  private @Nullable Integer mfLs;

  private @Nullable Integer mraces;

  private @Nullable Integer epoints;

  private @Nullable Integer epodiums;

  private @Nullable Integer ewins;

  private @Nullable Integer epoles;

  private @Nullable Integer efLs;

  private @Nullable Integer eraces;

  private @Nullable Integer tpoints;

  private @Nullable Integer tpodiums;

  private @Nullable Integer twins;

  private @Nullable Integer tpoles;

  private @Nullable Integer tfLs;

  private @Nullable Integer traces;

  private @Nullable String trackDesc;

  private @Nullable Integer hideTrackDesc;

  private @Nullable Integer apiRequestsRemaining;

  public TrackProfileResponse loadingDataState(@Nullable String loadingDataState) {
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

  public TrackProfileResponse trackNotFoundNote(@Nullable Integer trackNotFoundNote) {
    this.trackNotFoundNote = trackNotFoundNote;
    return this;
  }

  /**
   * Get trackNotFoundNote
   * @return trackNotFoundNote
   */
  
  @JsonProperty("trackNotFoundNote")
  public @Nullable Integer getTrackNotFoundNote() {
    return trackNotFoundNote;
  }

  public void setTrackNotFoundNote(@Nullable Integer trackNotFoundNote) {
    this.trackNotFoundNote = trackNotFoundNote;
  }

  public TrackProfileResponse location(@Nullable String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  
  @JsonProperty("location")
  public @Nullable String getLocation() {
    return location;
  }

  public void setLocation(@Nullable String location) {
    this.location = location;
  }

  public TrackProfileResponse trackName(@Nullable String trackName) {
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

  public TrackProfileResponse trackImage(@Nullable String trackImage) {
    this.trackImage = trackImage;
    return this;
  }

  /**
   * Get trackImage
   * @return trackImage
   */
  
  @JsonProperty("trackImage")
  public @Nullable String getTrackImage() {
    return trackImage;
  }

  public void setTrackImage(@Nullable String trackImage) {
    this.trackImage = trackImage;
  }

  public TrackProfileResponse date(@Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  
  @JsonProperty("date")
  public @Nullable String getDate() {
    return date;
  }

  public void setDate(@Nullable String date) {
    this.date = date;
  }

  public TrackProfileResponse power(@Nullable Integer power) {
    this.power = power;
    return this;
  }

  /**
   * Get power
   * @return power
   */
  
  @JsonProperty("power")
  public @Nullable Integer getPower() {
    return power;
  }

  public void setPower(@Nullable Integer power) {
    this.power = power;
  }

  public TrackProfileResponse accel(@Nullable Integer accel) {
    this.accel = accel;
    return this;
  }

  /**
   * Get accel
   * @return accel
   */
  
  @JsonProperty("accel")
  public @Nullable Integer getAccel() {
    return accel;
  }

  public void setAccel(@Nullable Integer accel) {
    this.accel = accel;
  }

  public TrackProfileResponse handl(@Nullable Integer handl) {
    this.handl = handl;
    return this;
  }

  /**
   * Get handl
   * @return handl
   */
  
  @JsonProperty("handl")
  public @Nullable Integer getHandl() {
    return handl;
  }

  public void setHandl(@Nullable Integer handl) {
    this.handl = handl;
  }

  public TrackProfileResponse raceDistance(@Nullable String raceDistance) {
    this.raceDistance = raceDistance;
    return this;
  }

  /**
   * Get raceDistance
   * @return raceDistance
   */
  
  @JsonProperty("raceDistance")
  public @Nullable String getRaceDistance() {
    return raceDistance;
  }

  public void setRaceDistance(@Nullable String raceDistance) {
    this.raceDistance = raceDistance;
  }

  public TrackProfileResponse laps(@Nullable Integer laps) {
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

  public TrackProfileResponse downforce(@Nullable String downforce) {
    this.downforce = downforce;
    return this;
  }

  /**
   * Get downforce
   * @return downforce
   */
  
  @JsonProperty("downforce")
  public @Nullable String getDownforce() {
    return downforce;
  }

  public void setDownforce(@Nullable String downforce) {
    this.downforce = downforce;
  }

  public TrackProfileResponse lapDistance(@Nullable String lapDistance) {
    this.lapDistance = lapDistance;
    return this;
  }

  /**
   * Get lapDistance
   * @return lapDistance
   */
  
  @JsonProperty("lapDistance")
  public @Nullable String getLapDistance() {
    return lapDistance;
  }

  public void setLapDistance(@Nullable String lapDistance) {
    this.lapDistance = lapDistance;
  }

  public TrackProfileResponse overtaking(@Nullable String overtaking) {
    this.overtaking = overtaking;
    return this;
  }

  /**
   * Get overtaking
   * @return overtaking
   */
  
  @JsonProperty("overtaking")
  public @Nullable String getOvertaking() {
    return overtaking;
  }

  public void setOvertaking(@Nullable String overtaking) {
    this.overtaking = overtaking;
  }

  public TrackProfileResponse avgSpeed(@Nullable String avgSpeed) {
    this.avgSpeed = avgSpeed;
    return this;
  }

  /**
   * Get avgSpeed
   * @return avgSpeed
   */
  
  @JsonProperty("avgSpeed")
  public @Nullable String getAvgSpeed() {
    return avgSpeed;
  }

  public void setAvgSpeed(@Nullable String avgSpeed) {
    this.avgSpeed = avgSpeed;
  }

  public TrackProfileResponse suspRigidity(@Nullable String suspRigidity) {
    this.suspRigidity = suspRigidity;
    return this;
  }

  /**
   * Get suspRigidity
   * @return suspRigidity
   */
  
  @JsonProperty("suspRigidity")
  public @Nullable String getSuspRigidity() {
    return suspRigidity;
  }

  public void setSuspRigidity(@Nullable String suspRigidity) {
    this.suspRigidity = suspRigidity;
  }

  public TrackProfileResponse gpsHeld(@Nullable Integer gpsHeld) {
    this.gpsHeld = gpsHeld;
    return this;
  }

  /**
   * Get gpsHeld
   * @return gpsHeld
   */
  
  @JsonProperty("gpsHeld")
  public @Nullable Integer getGpsHeld() {
    return gpsHeld;
  }

  public void setGpsHeld(@Nullable Integer gpsHeld) {
    this.gpsHeld = gpsHeld;
  }

  public TrackProfileResponse fuelConsumption(@Nullable String fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
    return this;
  }

  /**
   * Get fuelConsumption
   * @return fuelConsumption
   */
  
  @JsonProperty("fuelConsumption")
  public @Nullable String getFuelConsumption() {
    return fuelConsumption;
  }

  public void setFuelConsumption(@Nullable String fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  public TrackProfileResponse nbTurns(@Nullable Integer nbTurns) {
    this.nbTurns = nbTurns;
    return this;
  }

  /**
   * Get nbTurns
   * @return nbTurns
   */
  
  @JsonProperty("nbTurns")
  public @Nullable Integer getNbTurns() {
    return nbTurns;
  }

  public void setNbTurns(@Nullable Integer nbTurns) {
    this.nbTurns = nbTurns;
  }

  public TrackProfileResponse tyreWear(@Nullable String tyreWear) {
    this.tyreWear = tyreWear;
    return this;
  }

  /**
   * Get tyreWear
   * @return tyreWear
   */
  
  @JsonProperty("tyreWear")
  public @Nullable String getTyreWear() {
    return tyreWear;
  }

  public void setTyreWear(@Nullable String tyreWear) {
    this.tyreWear = tyreWear;
  }

  public TrackProfileResponse timeInOutPits(@Nullable String timeInOutPits) {
    this.timeInOutPits = timeInOutPits;
    return this;
  }

  /**
   * Get timeInOutPits
   * @return timeInOutPits
   */
  
  @JsonProperty("timeInOutPits")
  public @Nullable String getTimeInOutPits() {
    return timeInOutPits;
  }

  public void setTimeInOutPits(@Nullable String timeInOutPits) {
    this.timeInOutPits = timeInOutPits;
  }

  public TrackProfileResponse gripLevel(@Nullable String gripLevel) {
    this.gripLevel = gripLevel;
    return this;
  }

  /**
   * Get gripLevel
   * @return gripLevel
   */
  
  @JsonProperty("gripLevel")
  public @Nullable String getGripLevel() {
    return gripLevel;
  }

  public void setGripLevel(@Nullable String gripLevel) {
    this.gripLevel = gripLevel;
  }

  public TrackProfileResponse category(@Nullable String category) {
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

  public TrackProfileResponse qualRecord(@Nullable TrackProfileResponseQualRecord qualRecord) {
    this.qualRecord = qualRecord;
    return this;
  }

  /**
   * Get qualRecord
   * @return qualRecord
   */
  @Valid 
  @JsonProperty("qualRecord")
  public @Nullable TrackProfileResponseQualRecord getQualRecord() {
    return qualRecord;
  }

  public void setQualRecord(@Nullable TrackProfileResponseQualRecord qualRecord) {
    this.qualRecord = qualRecord;
  }

  public TrackProfileResponse raceRecord(@Nullable TrackProfileResponseQualRecord raceRecord) {
    this.raceRecord = raceRecord;
    return this;
  }

  /**
   * Get raceRecord
   * @return raceRecord
   */
  @Valid 
  @JsonProperty("raceRecord")
  public @Nullable TrackProfileResponseQualRecord getRaceRecord() {
    return raceRecord;
  }

  public void setRaceRecord(@Nullable TrackProfileResponseQualRecord raceRecord) {
    this.raceRecord = raceRecord;
  }

  public TrackProfileResponse qualRecordWet(@Nullable TrackProfileResponseQualRecord qualRecordWet) {
    this.qualRecordWet = qualRecordWet;
    return this;
  }

  /**
   * Get qualRecordWet
   * @return qualRecordWet
   */
  @Valid 
  @JsonProperty("qualRecordWet")
  public @Nullable TrackProfileResponseQualRecord getQualRecordWet() {
    return qualRecordWet;
  }

  public void setQualRecordWet(@Nullable TrackProfileResponseQualRecord qualRecordWet) {
    this.qualRecordWet = qualRecordWet;
  }

  public TrackProfileResponse raceRecordWet(@Nullable TrackProfileResponseQualRecord raceRecordWet) {
    this.raceRecordWet = raceRecordWet;
    return this;
  }

  /**
   * Get raceRecordWet
   * @return raceRecordWet
   */
  @Valid 
  @JsonProperty("raceRecordWet")
  public @Nullable TrackProfileResponseQualRecord getRaceRecordWet() {
    return raceRecordWet;
  }

  public void setRaceRecordWet(@Nullable TrackProfileResponseQualRecord raceRecordWet) {
    this.raceRecordWet = raceRecordWet;
  }

  public TrackProfileResponse achievWin(@Nullable String achievWin) {
    this.achievWin = achievWin;
    return this;
  }

  /**
   * Get achievWin
   * @return achievWin
   */
  
  @JsonProperty("achievWin")
  public @Nullable String getAchievWin() {
    return achievWin;
  }

  public void setAchievWin(@Nullable String achievWin) {
    this.achievWin = achievWin;
  }

  public TrackProfileResponse achievFL(@Nullable String achievFL) {
    this.achievFL = achievFL;
    return this;
  }

  /**
   * Get achievFL
   * @return achievFL
   */
  
  @JsonProperty("achievFL")
  public @Nullable String getAchievFL() {
    return achievFL;
  }

  public void setAchievFL(@Nullable String achievFL) {
    this.achievFL = achievFL;
  }

  public TrackProfileResponse achievPole(@Nullable String achievPole) {
    this.achievPole = achievPole;
    return this;
  }

  /**
   * Get achievPole
   * @return achievPole
   */
  
  @JsonProperty("achievPole")
  public @Nullable String getAchievPole() {
    return achievPole;
  }

  public void setAchievPole(@Nullable String achievPole) {
    this.achievPole = achievPole;
  }

  public TrackProfileResponse rpoints(@Nullable Integer rpoints) {
    this.rpoints = rpoints;
    return this;
  }

  /**
   * Get rpoints
   * @return rpoints
   */
  
  @JsonProperty("RPoints")
  public @Nullable Integer getRpoints() {
    return rpoints;
  }

  public void setRpoints(@Nullable Integer rpoints) {
    this.rpoints = rpoints;
  }

  public TrackProfileResponse rpodiums(@Nullable Integer rpodiums) {
    this.rpodiums = rpodiums;
    return this;
  }

  /**
   * Get rpodiums
   * @return rpodiums
   */
  
  @JsonProperty("RPodiums")
  public @Nullable Integer getRpodiums() {
    return rpodiums;
  }

  public void setRpodiums(@Nullable Integer rpodiums) {
    this.rpodiums = rpodiums;
  }

  public TrackProfileResponse rwins(@Nullable Integer rwins) {
    this.rwins = rwins;
    return this;
  }

  /**
   * Get rwins
   * @return rwins
   */
  
  @JsonProperty("RWins")
  public @Nullable Integer getRwins() {
    return rwins;
  }

  public void setRwins(@Nullable Integer rwins) {
    this.rwins = rwins;
  }

  public TrackProfileResponse rpoles(@Nullable Integer rpoles) {
    this.rpoles = rpoles;
    return this;
  }

  /**
   * Get rpoles
   * @return rpoles
   */
  
  @JsonProperty("RPoles")
  public @Nullable Integer getRpoles() {
    return rpoles;
  }

  public void setRpoles(@Nullable Integer rpoles) {
    this.rpoles = rpoles;
  }

  public TrackProfileResponse rfLs(@Nullable Integer rfLs) {
    this.rfLs = rfLs;
    return this;
  }

  /**
   * Get rfLs
   * @return rfLs
   */
  
  @JsonProperty("RFLs")
  public @Nullable Integer getRfLs() {
    return rfLs;
  }

  public void setRfLs(@Nullable Integer rfLs) {
    this.rfLs = rfLs;
  }

  public TrackProfileResponse rraces(@Nullable Integer rraces) {
    this.rraces = rraces;
    return this;
  }

  /**
   * Get rraces
   * @return rraces
   */
  
  @JsonProperty("RRaces")
  public @Nullable Integer getRraces() {
    return rraces;
  }

  public void setRraces(@Nullable Integer rraces) {
    this.rraces = rraces;
  }

  public TrackProfileResponse apoints(@Nullable Integer apoints) {
    this.apoints = apoints;
    return this;
  }

  /**
   * Get apoints
   * @return apoints
   */
  
  @JsonProperty("APoints")
  public @Nullable Integer getApoints() {
    return apoints;
  }

  public void setApoints(@Nullable Integer apoints) {
    this.apoints = apoints;
  }

  public TrackProfileResponse apodiums(@Nullable Integer apodiums) {
    this.apodiums = apodiums;
    return this;
  }

  /**
   * Get apodiums
   * @return apodiums
   */
  
  @JsonProperty("APodiums")
  public @Nullable Integer getApodiums() {
    return apodiums;
  }

  public void setApodiums(@Nullable Integer apodiums) {
    this.apodiums = apodiums;
  }

  public TrackProfileResponse awins(@Nullable Integer awins) {
    this.awins = awins;
    return this;
  }

  /**
   * Get awins
   * @return awins
   */
  
  @JsonProperty("AWins")
  public @Nullable Integer getAwins() {
    return awins;
  }

  public void setAwins(@Nullable Integer awins) {
    this.awins = awins;
  }

  public TrackProfileResponse apoles(@Nullable Integer apoles) {
    this.apoles = apoles;
    return this;
  }

  /**
   * Get apoles
   * @return apoles
   */
  
  @JsonProperty("APoles")
  public @Nullable Integer getApoles() {
    return apoles;
  }

  public void setApoles(@Nullable Integer apoles) {
    this.apoles = apoles;
  }

  public TrackProfileResponse afLs(@Nullable Integer afLs) {
    this.afLs = afLs;
    return this;
  }

  /**
   * Get afLs
   * @return afLs
   */
  
  @JsonProperty("AFLs")
  public @Nullable Integer getAfLs() {
    return afLs;
  }

  public void setAfLs(@Nullable Integer afLs) {
    this.afLs = afLs;
  }

  public TrackProfileResponse araces(@Nullable Integer araces) {
    this.araces = araces;
    return this;
  }

  /**
   * Get araces
   * @return araces
   */
  
  @JsonProperty("ARaces")
  public @Nullable Integer getAraces() {
    return araces;
  }

  public void setAraces(@Nullable Integer araces) {
    this.araces = araces;
  }

  public TrackProfileResponse ppoints(@Nullable Integer ppoints) {
    this.ppoints = ppoints;
    return this;
  }

  /**
   * Get ppoints
   * @return ppoints
   */
  
  @JsonProperty("PPoints")
  public @Nullable Integer getPpoints() {
    return ppoints;
  }

  public void setPpoints(@Nullable Integer ppoints) {
    this.ppoints = ppoints;
  }

  public TrackProfileResponse ppodiums(@Nullable Integer ppodiums) {
    this.ppodiums = ppodiums;
    return this;
  }

  /**
   * Get ppodiums
   * @return ppodiums
   */
  
  @JsonProperty("PPodiums")
  public @Nullable Integer getPpodiums() {
    return ppodiums;
  }

  public void setPpodiums(@Nullable Integer ppodiums) {
    this.ppodiums = ppodiums;
  }

  public TrackProfileResponse pwins(@Nullable Integer pwins) {
    this.pwins = pwins;
    return this;
  }

  /**
   * Get pwins
   * @return pwins
   */
  
  @JsonProperty("PWins")
  public @Nullable Integer getPwins() {
    return pwins;
  }

  public void setPwins(@Nullable Integer pwins) {
    this.pwins = pwins;
  }

  public TrackProfileResponse ppoles(@Nullable Integer ppoles) {
    this.ppoles = ppoles;
    return this;
  }

  /**
   * Get ppoles
   * @return ppoles
   */
  
  @JsonProperty("PPoles")
  public @Nullable Integer getPpoles() {
    return ppoles;
  }

  public void setPpoles(@Nullable Integer ppoles) {
    this.ppoles = ppoles;
  }

  public TrackProfileResponse pfLs(@Nullable Integer pfLs) {
    this.pfLs = pfLs;
    return this;
  }

  /**
   * Get pfLs
   * @return pfLs
   */
  
  @JsonProperty("PFLs")
  public @Nullable Integer getPfLs() {
    return pfLs;
  }

  public void setPfLs(@Nullable Integer pfLs) {
    this.pfLs = pfLs;
  }

  public TrackProfileResponse praces(@Nullable Integer praces) {
    this.praces = praces;
    return this;
  }

  /**
   * Get praces
   * @return praces
   */
  
  @JsonProperty("PRaces")
  public @Nullable Integer getPraces() {
    return praces;
  }

  public void setPraces(@Nullable Integer praces) {
    this.praces = praces;
  }

  public TrackProfileResponse mpoints(@Nullable Integer mpoints) {
    this.mpoints = mpoints;
    return this;
  }

  /**
   * Get mpoints
   * @return mpoints
   */
  
  @JsonProperty("MPoints")
  public @Nullable Integer getMpoints() {
    return mpoints;
  }

  public void setMpoints(@Nullable Integer mpoints) {
    this.mpoints = mpoints;
  }

  public TrackProfileResponse mpodiums(@Nullable Integer mpodiums) {
    this.mpodiums = mpodiums;
    return this;
  }

  /**
   * Get mpodiums
   * @return mpodiums
   */
  
  @JsonProperty("MPodiums")
  public @Nullable Integer getMpodiums() {
    return mpodiums;
  }

  public void setMpodiums(@Nullable Integer mpodiums) {
    this.mpodiums = mpodiums;
  }

  public TrackProfileResponse mwins(@Nullable Integer mwins) {
    this.mwins = mwins;
    return this;
  }

  /**
   * Get mwins
   * @return mwins
   */
  
  @JsonProperty("MWins")
  public @Nullable Integer getMwins() {
    return mwins;
  }

  public void setMwins(@Nullable Integer mwins) {
    this.mwins = mwins;
  }

  public TrackProfileResponse mpoles(@Nullable Integer mpoles) {
    this.mpoles = mpoles;
    return this;
  }

  /**
   * Get mpoles
   * @return mpoles
   */
  
  @JsonProperty("MPoles")
  public @Nullable Integer getMpoles() {
    return mpoles;
  }

  public void setMpoles(@Nullable Integer mpoles) {
    this.mpoles = mpoles;
  }

  public TrackProfileResponse mfLs(@Nullable Integer mfLs) {
    this.mfLs = mfLs;
    return this;
  }

  /**
   * Get mfLs
   * @return mfLs
   */
  
  @JsonProperty("MFLs")
  public @Nullable Integer getMfLs() {
    return mfLs;
  }

  public void setMfLs(@Nullable Integer mfLs) {
    this.mfLs = mfLs;
  }

  public TrackProfileResponse mraces(@Nullable Integer mraces) {
    this.mraces = mraces;
    return this;
  }

  /**
   * Get mraces
   * @return mraces
   */
  
  @JsonProperty("MRaces")
  public @Nullable Integer getMraces() {
    return mraces;
  }

  public void setMraces(@Nullable Integer mraces) {
    this.mraces = mraces;
  }

  public TrackProfileResponse epoints(@Nullable Integer epoints) {
    this.epoints = epoints;
    return this;
  }

  /**
   * Get epoints
   * @return epoints
   */
  
  @JsonProperty("EPoints")
  public @Nullable Integer getEpoints() {
    return epoints;
  }

  public void setEpoints(@Nullable Integer epoints) {
    this.epoints = epoints;
  }

  public TrackProfileResponse epodiums(@Nullable Integer epodiums) {
    this.epodiums = epodiums;
    return this;
  }

  /**
   * Get epodiums
   * @return epodiums
   */
  
  @JsonProperty("EPodiums")
  public @Nullable Integer getEpodiums() {
    return epodiums;
  }

  public void setEpodiums(@Nullable Integer epodiums) {
    this.epodiums = epodiums;
  }

  public TrackProfileResponse ewins(@Nullable Integer ewins) {
    this.ewins = ewins;
    return this;
  }

  /**
   * Get ewins
   * @return ewins
   */
  
  @JsonProperty("EWins")
  public @Nullable Integer getEwins() {
    return ewins;
  }

  public void setEwins(@Nullable Integer ewins) {
    this.ewins = ewins;
  }

  public TrackProfileResponse epoles(@Nullable Integer epoles) {
    this.epoles = epoles;
    return this;
  }

  /**
   * Get epoles
   * @return epoles
   */
  
  @JsonProperty("EPoles")
  public @Nullable Integer getEpoles() {
    return epoles;
  }

  public void setEpoles(@Nullable Integer epoles) {
    this.epoles = epoles;
  }

  public TrackProfileResponse efLs(@Nullable Integer efLs) {
    this.efLs = efLs;
    return this;
  }

  /**
   * Get efLs
   * @return efLs
   */
  
  @JsonProperty("EFLs")
  public @Nullable Integer getEfLs() {
    return efLs;
  }

  public void setEfLs(@Nullable Integer efLs) {
    this.efLs = efLs;
  }

  public TrackProfileResponse eraces(@Nullable Integer eraces) {
    this.eraces = eraces;
    return this;
  }

  /**
   * Get eraces
   * @return eraces
   */
  
  @JsonProperty("ERaces")
  public @Nullable Integer getEraces() {
    return eraces;
  }

  public void setEraces(@Nullable Integer eraces) {
    this.eraces = eraces;
  }

  public TrackProfileResponse tpoints(@Nullable Integer tpoints) {
    this.tpoints = tpoints;
    return this;
  }

  /**
   * Get tpoints
   * @return tpoints
   */
  
  @JsonProperty("TPoints")
  public @Nullable Integer getTpoints() {
    return tpoints;
  }

  public void setTpoints(@Nullable Integer tpoints) {
    this.tpoints = tpoints;
  }

  public TrackProfileResponse tpodiums(@Nullable Integer tpodiums) {
    this.tpodiums = tpodiums;
    return this;
  }

  /**
   * Get tpodiums
   * @return tpodiums
   */
  
  @JsonProperty("TPodiums")
  public @Nullable Integer getTpodiums() {
    return tpodiums;
  }

  public void setTpodiums(@Nullable Integer tpodiums) {
    this.tpodiums = tpodiums;
  }

  public TrackProfileResponse twins(@Nullable Integer twins) {
    this.twins = twins;
    return this;
  }

  /**
   * Get twins
   * @return twins
   */
  
  @JsonProperty("TWins")
  public @Nullable Integer getTwins() {
    return twins;
  }

  public void setTwins(@Nullable Integer twins) {
    this.twins = twins;
  }

  public TrackProfileResponse tpoles(@Nullable Integer tpoles) {
    this.tpoles = tpoles;
    return this;
  }

  /**
   * Get tpoles
   * @return tpoles
   */
  
  @JsonProperty("TPoles")
  public @Nullable Integer getTpoles() {
    return tpoles;
  }

  public void setTpoles(@Nullable Integer tpoles) {
    this.tpoles = tpoles;
  }

  public TrackProfileResponse tfLs(@Nullable Integer tfLs) {
    this.tfLs = tfLs;
    return this;
  }

  /**
   * Get tfLs
   * @return tfLs
   */
  
  @JsonProperty("TFLs")
  public @Nullable Integer getTfLs() {
    return tfLs;
  }

  public void setTfLs(@Nullable Integer tfLs) {
    this.tfLs = tfLs;
  }

  public TrackProfileResponse traces(@Nullable Integer traces) {
    this.traces = traces;
    return this;
  }

  /**
   * Get traces
   * @return traces
   */
  
  @JsonProperty("TRaces")
  public @Nullable Integer getTraces() {
    return traces;
  }

  public void setTraces(@Nullable Integer traces) {
    this.traces = traces;
  }

  public TrackProfileResponse trackDesc(@Nullable String trackDesc) {
    this.trackDesc = trackDesc;
    return this;
  }

  /**
   * Get trackDesc
   * @return trackDesc
   */
  
  @JsonProperty("trackDesc")
  public @Nullable String getTrackDesc() {
    return trackDesc;
  }

  public void setTrackDesc(@Nullable String trackDesc) {
    this.trackDesc = trackDesc;
  }

  public TrackProfileResponse hideTrackDesc(@Nullable Integer hideTrackDesc) {
    this.hideTrackDesc = hideTrackDesc;
    return this;
  }

  /**
   * Get hideTrackDesc
   * @return hideTrackDesc
   */
  
  @JsonProperty("hideTrackDesc")
  public @Nullable Integer getHideTrackDesc() {
    return hideTrackDesc;
  }

  public void setHideTrackDesc(@Nullable Integer hideTrackDesc) {
    this.hideTrackDesc = hideTrackDesc;
  }

  public TrackProfileResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    TrackProfileResponse trackProfileResponse = (TrackProfileResponse) o;
    return Objects.equals(this.loadingDataState, trackProfileResponse.loadingDataState) &&
        Objects.equals(this.trackNotFoundNote, trackProfileResponse.trackNotFoundNote) &&
        Objects.equals(this.location, trackProfileResponse.location) &&
        Objects.equals(this.trackName, trackProfileResponse.trackName) &&
        Objects.equals(this.trackImage, trackProfileResponse.trackImage) &&
        Objects.equals(this.date, trackProfileResponse.date) &&
        Objects.equals(this.power, trackProfileResponse.power) &&
        Objects.equals(this.accel, trackProfileResponse.accel) &&
        Objects.equals(this.handl, trackProfileResponse.handl) &&
        Objects.equals(this.raceDistance, trackProfileResponse.raceDistance) &&
        Objects.equals(this.laps, trackProfileResponse.laps) &&
        Objects.equals(this.downforce, trackProfileResponse.downforce) &&
        Objects.equals(this.lapDistance, trackProfileResponse.lapDistance) &&
        Objects.equals(this.overtaking, trackProfileResponse.overtaking) &&
        Objects.equals(this.avgSpeed, trackProfileResponse.avgSpeed) &&
        Objects.equals(this.suspRigidity, trackProfileResponse.suspRigidity) &&
        Objects.equals(this.gpsHeld, trackProfileResponse.gpsHeld) &&
        Objects.equals(this.fuelConsumption, trackProfileResponse.fuelConsumption) &&
        Objects.equals(this.nbTurns, trackProfileResponse.nbTurns) &&
        Objects.equals(this.tyreWear, trackProfileResponse.tyreWear) &&
        Objects.equals(this.timeInOutPits, trackProfileResponse.timeInOutPits) &&
        Objects.equals(this.gripLevel, trackProfileResponse.gripLevel) &&
        Objects.equals(this.category, trackProfileResponse.category) &&
        Objects.equals(this.qualRecord, trackProfileResponse.qualRecord) &&
        Objects.equals(this.raceRecord, trackProfileResponse.raceRecord) &&
        Objects.equals(this.qualRecordWet, trackProfileResponse.qualRecordWet) &&
        Objects.equals(this.raceRecordWet, trackProfileResponse.raceRecordWet) &&
        Objects.equals(this.achievWin, trackProfileResponse.achievWin) &&
        Objects.equals(this.achievFL, trackProfileResponse.achievFL) &&
        Objects.equals(this.achievPole, trackProfileResponse.achievPole) &&
        Objects.equals(this.rpoints, trackProfileResponse.rpoints) &&
        Objects.equals(this.rpodiums, trackProfileResponse.rpodiums) &&
        Objects.equals(this.rwins, trackProfileResponse.rwins) &&
        Objects.equals(this.rpoles, trackProfileResponse.rpoles) &&
        Objects.equals(this.rfLs, trackProfileResponse.rfLs) &&
        Objects.equals(this.rraces, trackProfileResponse.rraces) &&
        Objects.equals(this.apoints, trackProfileResponse.apoints) &&
        Objects.equals(this.apodiums, trackProfileResponse.apodiums) &&
        Objects.equals(this.awins, trackProfileResponse.awins) &&
        Objects.equals(this.apoles, trackProfileResponse.apoles) &&
        Objects.equals(this.afLs, trackProfileResponse.afLs) &&
        Objects.equals(this.araces, trackProfileResponse.araces) &&
        Objects.equals(this.ppoints, trackProfileResponse.ppoints) &&
        Objects.equals(this.ppodiums, trackProfileResponse.ppodiums) &&
        Objects.equals(this.pwins, trackProfileResponse.pwins) &&
        Objects.equals(this.ppoles, trackProfileResponse.ppoles) &&
        Objects.equals(this.pfLs, trackProfileResponse.pfLs) &&
        Objects.equals(this.praces, trackProfileResponse.praces) &&
        Objects.equals(this.mpoints, trackProfileResponse.mpoints) &&
        Objects.equals(this.mpodiums, trackProfileResponse.mpodiums) &&
        Objects.equals(this.mwins, trackProfileResponse.mwins) &&
        Objects.equals(this.mpoles, trackProfileResponse.mpoles) &&
        Objects.equals(this.mfLs, trackProfileResponse.mfLs) &&
        Objects.equals(this.mraces, trackProfileResponse.mraces) &&
        Objects.equals(this.epoints, trackProfileResponse.epoints) &&
        Objects.equals(this.epodiums, trackProfileResponse.epodiums) &&
        Objects.equals(this.ewins, trackProfileResponse.ewins) &&
        Objects.equals(this.epoles, trackProfileResponse.epoles) &&
        Objects.equals(this.efLs, trackProfileResponse.efLs) &&
        Objects.equals(this.eraces, trackProfileResponse.eraces) &&
        Objects.equals(this.tpoints, trackProfileResponse.tpoints) &&
        Objects.equals(this.tpodiums, trackProfileResponse.tpodiums) &&
        Objects.equals(this.twins, trackProfileResponse.twins) &&
        Objects.equals(this.tpoles, trackProfileResponse.tpoles) &&
        Objects.equals(this.tfLs, trackProfileResponse.tfLs) &&
        Objects.equals(this.traces, trackProfileResponse.traces) &&
        Objects.equals(this.trackDesc, trackProfileResponse.trackDesc) &&
        Objects.equals(this.hideTrackDesc, trackProfileResponse.hideTrackDesc) &&
        Objects.equals(this.apiRequestsRemaining, trackProfileResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, trackNotFoundNote, location, trackName, trackImage, date, power, accel, handl, raceDistance, laps, downforce, lapDistance, overtaking, avgSpeed, suspRigidity, gpsHeld, fuelConsumption, nbTurns, tyreWear, timeInOutPits, gripLevel, category, qualRecord, raceRecord, qualRecordWet, raceRecordWet, achievWin, achievFL, achievPole, rpoints, rpodiums, rwins, rpoles, rfLs, rraces, apoints, apodiums, awins, apoles, afLs, araces, ppoints, ppodiums, pwins, ppoles, pfLs, praces, mpoints, mpodiums, mwins, mpoles, mfLs, mraces, epoints, epodiums, ewins, epoles, efLs, eraces, tpoints, tpodiums, twins, tpoles, tfLs, traces, trackDesc, hideTrackDesc, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackProfileResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    trackNotFoundNote: ").append(toIndentedString(trackNotFoundNote)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackImage: ").append(toIndentedString(trackImage)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    accel: ").append(toIndentedString(accel)).append("\n");
    sb.append("    handl: ").append(toIndentedString(handl)).append("\n");
    sb.append("    raceDistance: ").append(toIndentedString(raceDistance)).append("\n");
    sb.append("    laps: ").append(toIndentedString(laps)).append("\n");
    sb.append("    downforce: ").append(toIndentedString(downforce)).append("\n");
    sb.append("    lapDistance: ").append(toIndentedString(lapDistance)).append("\n");
    sb.append("    overtaking: ").append(toIndentedString(overtaking)).append("\n");
    sb.append("    avgSpeed: ").append(toIndentedString(avgSpeed)).append("\n");
    sb.append("    suspRigidity: ").append(toIndentedString(suspRigidity)).append("\n");
    sb.append("    gpsHeld: ").append(toIndentedString(gpsHeld)).append("\n");
    sb.append("    fuelConsumption: ").append(toIndentedString(fuelConsumption)).append("\n");
    sb.append("    nbTurns: ").append(toIndentedString(nbTurns)).append("\n");
    sb.append("    tyreWear: ").append(toIndentedString(tyreWear)).append("\n");
    sb.append("    timeInOutPits: ").append(toIndentedString(timeInOutPits)).append("\n");
    sb.append("    gripLevel: ").append(toIndentedString(gripLevel)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    qualRecord: ").append(toIndentedString(qualRecord)).append("\n");
    sb.append("    raceRecord: ").append(toIndentedString(raceRecord)).append("\n");
    sb.append("    qualRecordWet: ").append(toIndentedString(qualRecordWet)).append("\n");
    sb.append("    raceRecordWet: ").append(toIndentedString(raceRecordWet)).append("\n");
    sb.append("    achievWin: ").append(toIndentedString(achievWin)).append("\n");
    sb.append("    achievFL: ").append(toIndentedString(achievFL)).append("\n");
    sb.append("    achievPole: ").append(toIndentedString(achievPole)).append("\n");
    sb.append("    rpoints: ").append(toIndentedString(rpoints)).append("\n");
    sb.append("    rpodiums: ").append(toIndentedString(rpodiums)).append("\n");
    sb.append("    rwins: ").append(toIndentedString(rwins)).append("\n");
    sb.append("    rpoles: ").append(toIndentedString(rpoles)).append("\n");
    sb.append("    rfLs: ").append(toIndentedString(rfLs)).append("\n");
    sb.append("    rraces: ").append(toIndentedString(rraces)).append("\n");
    sb.append("    apoints: ").append(toIndentedString(apoints)).append("\n");
    sb.append("    apodiums: ").append(toIndentedString(apodiums)).append("\n");
    sb.append("    awins: ").append(toIndentedString(awins)).append("\n");
    sb.append("    apoles: ").append(toIndentedString(apoles)).append("\n");
    sb.append("    afLs: ").append(toIndentedString(afLs)).append("\n");
    sb.append("    araces: ").append(toIndentedString(araces)).append("\n");
    sb.append("    ppoints: ").append(toIndentedString(ppoints)).append("\n");
    sb.append("    ppodiums: ").append(toIndentedString(ppodiums)).append("\n");
    sb.append("    pwins: ").append(toIndentedString(pwins)).append("\n");
    sb.append("    ppoles: ").append(toIndentedString(ppoles)).append("\n");
    sb.append("    pfLs: ").append(toIndentedString(pfLs)).append("\n");
    sb.append("    praces: ").append(toIndentedString(praces)).append("\n");
    sb.append("    mpoints: ").append(toIndentedString(mpoints)).append("\n");
    sb.append("    mpodiums: ").append(toIndentedString(mpodiums)).append("\n");
    sb.append("    mwins: ").append(toIndentedString(mwins)).append("\n");
    sb.append("    mpoles: ").append(toIndentedString(mpoles)).append("\n");
    sb.append("    mfLs: ").append(toIndentedString(mfLs)).append("\n");
    sb.append("    mraces: ").append(toIndentedString(mraces)).append("\n");
    sb.append("    epoints: ").append(toIndentedString(epoints)).append("\n");
    sb.append("    epodiums: ").append(toIndentedString(epodiums)).append("\n");
    sb.append("    ewins: ").append(toIndentedString(ewins)).append("\n");
    sb.append("    epoles: ").append(toIndentedString(epoles)).append("\n");
    sb.append("    efLs: ").append(toIndentedString(efLs)).append("\n");
    sb.append("    eraces: ").append(toIndentedString(eraces)).append("\n");
    sb.append("    tpoints: ").append(toIndentedString(tpoints)).append("\n");
    sb.append("    tpodiums: ").append(toIndentedString(tpodiums)).append("\n");
    sb.append("    twins: ").append(toIndentedString(twins)).append("\n");
    sb.append("    tpoles: ").append(toIndentedString(tpoles)).append("\n");
    sb.append("    tfLs: ").append(toIndentedString(tfLs)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    trackDesc: ").append(toIndentedString(trackDesc)).append("\n");
    sb.append("    hideTrackDesc: ").append(toIndentedString(hideTrackDesc)).append("\n");
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

