package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.jlobato.gpro.proxy.model.PracticeResponseQ1LapData;
import org.jlobato.gpro.proxy.model.PracticeResponseWeather;
import org.jlobato.gpro.proxy.model.Qualy2ResponseQ2LapData;
import org.jlobato.gpro.proxy.model.Qualy2ResponseShowComment1Popover;
import org.jlobato.gpro.proxy.model.Qualy2ResponseShowWeatherPopover;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Qualy2Response
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class Qualy2Response {

  private @Nullable Integer loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String trackName;

  private @Nullable String trackNat;

  private @Nullable Integer trackId;

  private @Nullable String trackImg;

  private @Nullable String trackPower;

  private @Nullable String trackAccel;

  private @Nullable String trackHandl;

  private @Nullable String carPower;

  private @Nullable String carHandl;

  private @Nullable String carAccel;

  private @Nullable String lvlChassis;

  private @Nullable String lvlBrakes;

  private @Nullable String lvlCooling;

  private @Nullable String lvlElectronics;

  private @Nullable String lvlEngine;

  private @Nullable String lvlFWing;

  private @Nullable String lvlRWing;

  private @Nullable String lvlGear;

  private @Nullable String lvlSidepods;

  private @Nullable String lvlSusp;

  private @Nullable String lvlUnderbody;

  private @Nullable String usaBrakes;

  private @Nullable String usaChassis;

  private @Nullable String usaCooling;

  private @Nullable String usaElectronics;

  private @Nullable String usaEngine;

  private @Nullable String usaFWing;

  private @Nullable String usaGear;

  private @Nullable String usaRWing;

  private @Nullable String usaSidepods;

  private @Nullable String usaSusp;

  private @Nullable String usaUnderbody;

  private @Nullable Integer cash;

  private @Nullable Integer setFWing;

  private @Nullable Integer setRWing;

  private @Nullable Integer setEngine;

  private @Nullable Integer setBrakes;

  private @Nullable Integer setGear;

  private @Nullable Integer setSusp;

  private @Nullable String setTyres;

  private @Nullable String setRisk;

  private @Nullable Integer setFuel;

  private @Nullable String setDryTyres;

  private @Nullable PracticeResponseWeather weather;

  private @Nullable Qualy2ResponseShowWeatherPopover showWeatherPopover;

  private @Nullable Qualy2ResponseShowComment1Popover showComment1Popover;

  private @Nullable Integer endOfSeason;

  private @Nullable Integer selectedLap;

  private @Nullable Integer raceInProgress;

  private @Nullable Integer showError;

  private @Nullable String errorMsg;

  private @Nullable Integer disableDriveButton;

  private @Nullable Integer tyresInvalid;

  private @Nullable Integer fWingInvalid;

  private @Nullable Integer rWingInvalid;

  private @Nullable Integer engInvalid;

  private @Nullable Integer braInvalid;

  private @Nullable Integer gearInvalid;

  private @Nullable Integer suspInvalid;

  private @Nullable PracticeResponseQ1LapData q1LapData;

  private @Nullable Qualy2ResponseQ2LapData q2LapData;

  private @Nullable String sgLapTime;

  private @Nullable String sgGap;

  private @Nullable String sgPos;

  private @Nullable Integer isSupporter;

  private @Nullable Integer apiRequestsRemaining;

  public Qualy2Response loadingDataState(@Nullable Integer loadingDataState) {
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

  public Qualy2Response segmentSelected(@Nullable String segmentSelected) {
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

  public Qualy2Response trackName(@Nullable String trackName) {
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

  public Qualy2Response trackNat(@Nullable String trackNat) {
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

  public Qualy2Response trackId(@Nullable Integer trackId) {
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

  public Qualy2Response trackImg(@Nullable String trackImg) {
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

  public Qualy2Response trackPower(@Nullable String trackPower) {
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

  public Qualy2Response trackAccel(@Nullable String trackAccel) {
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

  public Qualy2Response trackHandl(@Nullable String trackHandl) {
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

  public Qualy2Response carPower(@Nullable String carPower) {
    this.carPower = carPower;
    return this;
  }

  /**
   * Get carPower
   * @return carPower
   */
  
  @JsonProperty("carPower")
  public @Nullable String getCarPower() {
    return carPower;
  }

  public void setCarPower(@Nullable String carPower) {
    this.carPower = carPower;
  }

  public Qualy2Response carHandl(@Nullable String carHandl) {
    this.carHandl = carHandl;
    return this;
  }

  /**
   * Get carHandl
   * @return carHandl
   */
  
  @JsonProperty("carHandl")
  public @Nullable String getCarHandl() {
    return carHandl;
  }

  public void setCarHandl(@Nullable String carHandl) {
    this.carHandl = carHandl;
  }

  public Qualy2Response carAccel(@Nullable String carAccel) {
    this.carAccel = carAccel;
    return this;
  }

  /**
   * Get carAccel
   * @return carAccel
   */
  
  @JsonProperty("carAccel")
  public @Nullable String getCarAccel() {
    return carAccel;
  }

  public void setCarAccel(@Nullable String carAccel) {
    this.carAccel = carAccel;
  }

  public Qualy2Response lvlChassis(@Nullable String lvlChassis) {
    this.lvlChassis = lvlChassis;
    return this;
  }

  /**
   * Get lvlChassis
   * @return lvlChassis
   */
  
  @JsonProperty("lvlChassis")
  public @Nullable String getLvlChassis() {
    return lvlChassis;
  }

  public void setLvlChassis(@Nullable String lvlChassis) {
    this.lvlChassis = lvlChassis;
  }

  public Qualy2Response lvlBrakes(@Nullable String lvlBrakes) {
    this.lvlBrakes = lvlBrakes;
    return this;
  }

  /**
   * Get lvlBrakes
   * @return lvlBrakes
   */
  
  @JsonProperty("lvlBrakes")
  public @Nullable String getLvlBrakes() {
    return lvlBrakes;
  }

  public void setLvlBrakes(@Nullable String lvlBrakes) {
    this.lvlBrakes = lvlBrakes;
  }

  public Qualy2Response lvlCooling(@Nullable String lvlCooling) {
    this.lvlCooling = lvlCooling;
    return this;
  }

  /**
   * Get lvlCooling
   * @return lvlCooling
   */
  
  @JsonProperty("lvlCooling")
  public @Nullable String getLvlCooling() {
    return lvlCooling;
  }

  public void setLvlCooling(@Nullable String lvlCooling) {
    this.lvlCooling = lvlCooling;
  }

  public Qualy2Response lvlElectronics(@Nullable String lvlElectronics) {
    this.lvlElectronics = lvlElectronics;
    return this;
  }

  /**
   * Get lvlElectronics
   * @return lvlElectronics
   */
  
  @JsonProperty("lvlElectronics")
  public @Nullable String getLvlElectronics() {
    return lvlElectronics;
  }

  public void setLvlElectronics(@Nullable String lvlElectronics) {
    this.lvlElectronics = lvlElectronics;
  }

  public Qualy2Response lvlEngine(@Nullable String lvlEngine) {
    this.lvlEngine = lvlEngine;
    return this;
  }

  /**
   * Get lvlEngine
   * @return lvlEngine
   */
  
  @JsonProperty("lvlEngine")
  public @Nullable String getLvlEngine() {
    return lvlEngine;
  }

  public void setLvlEngine(@Nullable String lvlEngine) {
    this.lvlEngine = lvlEngine;
  }

  public Qualy2Response lvlFWing(@Nullable String lvlFWing) {
    this.lvlFWing = lvlFWing;
    return this;
  }

  /**
   * Get lvlFWing
   * @return lvlFWing
   */
  
  @JsonProperty("lvlFWing")
  public @Nullable String getLvlFWing() {
    return lvlFWing;
  }

  public void setLvlFWing(@Nullable String lvlFWing) {
    this.lvlFWing = lvlFWing;
  }

  public Qualy2Response lvlRWing(@Nullable String lvlRWing) {
    this.lvlRWing = lvlRWing;
    return this;
  }

  /**
   * Get lvlRWing
   * @return lvlRWing
   */
  
  @JsonProperty("lvlRWing")
  public @Nullable String getLvlRWing() {
    return lvlRWing;
  }

  public void setLvlRWing(@Nullable String lvlRWing) {
    this.lvlRWing = lvlRWing;
  }

  public Qualy2Response lvlGear(@Nullable String lvlGear) {
    this.lvlGear = lvlGear;
    return this;
  }

  /**
   * Get lvlGear
   * @return lvlGear
   */
  
  @JsonProperty("lvlGear")
  public @Nullable String getLvlGear() {
    return lvlGear;
  }

  public void setLvlGear(@Nullable String lvlGear) {
    this.lvlGear = lvlGear;
  }

  public Qualy2Response lvlSidepods(@Nullable String lvlSidepods) {
    this.lvlSidepods = lvlSidepods;
    return this;
  }

  /**
   * Get lvlSidepods
   * @return lvlSidepods
   */
  
  @JsonProperty("lvlSidepods")
  public @Nullable String getLvlSidepods() {
    return lvlSidepods;
  }

  public void setLvlSidepods(@Nullable String lvlSidepods) {
    this.lvlSidepods = lvlSidepods;
  }

  public Qualy2Response lvlSusp(@Nullable String lvlSusp) {
    this.lvlSusp = lvlSusp;
    return this;
  }

  /**
   * Get lvlSusp
   * @return lvlSusp
   */
  
  @JsonProperty("lvlSusp")
  public @Nullable String getLvlSusp() {
    return lvlSusp;
  }

  public void setLvlSusp(@Nullable String lvlSusp) {
    this.lvlSusp = lvlSusp;
  }

  public Qualy2Response lvlUnderbody(@Nullable String lvlUnderbody) {
    this.lvlUnderbody = lvlUnderbody;
    return this;
  }

  /**
   * Get lvlUnderbody
   * @return lvlUnderbody
   */
  
  @JsonProperty("lvlUnderbody")
  public @Nullable String getLvlUnderbody() {
    return lvlUnderbody;
  }

  public void setLvlUnderbody(@Nullable String lvlUnderbody) {
    this.lvlUnderbody = lvlUnderbody;
  }

  public Qualy2Response usaBrakes(@Nullable String usaBrakes) {
    this.usaBrakes = usaBrakes;
    return this;
  }

  /**
   * Get usaBrakes
   * @return usaBrakes
   */
  
  @JsonProperty("usaBrakes")
  public @Nullable String getUsaBrakes() {
    return usaBrakes;
  }

  public void setUsaBrakes(@Nullable String usaBrakes) {
    this.usaBrakes = usaBrakes;
  }

  public Qualy2Response usaChassis(@Nullable String usaChassis) {
    this.usaChassis = usaChassis;
    return this;
  }

  /**
   * Get usaChassis
   * @return usaChassis
   */
  
  @JsonProperty("usaChassis")
  public @Nullable String getUsaChassis() {
    return usaChassis;
  }

  public void setUsaChassis(@Nullable String usaChassis) {
    this.usaChassis = usaChassis;
  }

  public Qualy2Response usaCooling(@Nullable String usaCooling) {
    this.usaCooling = usaCooling;
    return this;
  }

  /**
   * Get usaCooling
   * @return usaCooling
   */
  
  @JsonProperty("usaCooling")
  public @Nullable String getUsaCooling() {
    return usaCooling;
  }

  public void setUsaCooling(@Nullable String usaCooling) {
    this.usaCooling = usaCooling;
  }

  public Qualy2Response usaElectronics(@Nullable String usaElectronics) {
    this.usaElectronics = usaElectronics;
    return this;
  }

  /**
   * Get usaElectronics
   * @return usaElectronics
   */
  
  @JsonProperty("usaElectronics")
  public @Nullable String getUsaElectronics() {
    return usaElectronics;
  }

  public void setUsaElectronics(@Nullable String usaElectronics) {
    this.usaElectronics = usaElectronics;
  }

  public Qualy2Response usaEngine(@Nullable String usaEngine) {
    this.usaEngine = usaEngine;
    return this;
  }

  /**
   * Get usaEngine
   * @return usaEngine
   */
  
  @JsonProperty("usaEngine")
  public @Nullable String getUsaEngine() {
    return usaEngine;
  }

  public void setUsaEngine(@Nullable String usaEngine) {
    this.usaEngine = usaEngine;
  }

  public Qualy2Response usaFWing(@Nullable String usaFWing) {
    this.usaFWing = usaFWing;
    return this;
  }

  /**
   * Get usaFWing
   * @return usaFWing
   */
  
  @JsonProperty("usaFWing")
  public @Nullable String getUsaFWing() {
    return usaFWing;
  }

  public void setUsaFWing(@Nullable String usaFWing) {
    this.usaFWing = usaFWing;
  }

  public Qualy2Response usaGear(@Nullable String usaGear) {
    this.usaGear = usaGear;
    return this;
  }

  /**
   * Get usaGear
   * @return usaGear
   */
  
  @JsonProperty("usaGear")
  public @Nullable String getUsaGear() {
    return usaGear;
  }

  public void setUsaGear(@Nullable String usaGear) {
    this.usaGear = usaGear;
  }

  public Qualy2Response usaRWing(@Nullable String usaRWing) {
    this.usaRWing = usaRWing;
    return this;
  }

  /**
   * Get usaRWing
   * @return usaRWing
   */
  
  @JsonProperty("usaRWing")
  public @Nullable String getUsaRWing() {
    return usaRWing;
  }

  public void setUsaRWing(@Nullable String usaRWing) {
    this.usaRWing = usaRWing;
  }

  public Qualy2Response usaSidepods(@Nullable String usaSidepods) {
    this.usaSidepods = usaSidepods;
    return this;
  }

  /**
   * Get usaSidepods
   * @return usaSidepods
   */
  
  @JsonProperty("usaSidepods")
  public @Nullable String getUsaSidepods() {
    return usaSidepods;
  }

  public void setUsaSidepods(@Nullable String usaSidepods) {
    this.usaSidepods = usaSidepods;
  }

  public Qualy2Response usaSusp(@Nullable String usaSusp) {
    this.usaSusp = usaSusp;
    return this;
  }

  /**
   * Get usaSusp
   * @return usaSusp
   */
  
  @JsonProperty("usaSusp")
  public @Nullable String getUsaSusp() {
    return usaSusp;
  }

  public void setUsaSusp(@Nullable String usaSusp) {
    this.usaSusp = usaSusp;
  }

  public Qualy2Response usaUnderbody(@Nullable String usaUnderbody) {
    this.usaUnderbody = usaUnderbody;
    return this;
  }

  /**
   * Get usaUnderbody
   * @return usaUnderbody
   */
  
  @JsonProperty("usaUnderbody")
  public @Nullable String getUsaUnderbody() {
    return usaUnderbody;
  }

  public void setUsaUnderbody(@Nullable String usaUnderbody) {
    this.usaUnderbody = usaUnderbody;
  }

  public Qualy2Response cash(@Nullable Integer cash) {
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

  public Qualy2Response setFWing(@Nullable Integer setFWing) {
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

  public Qualy2Response setRWing(@Nullable Integer setRWing) {
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

  public Qualy2Response setEngine(@Nullable Integer setEngine) {
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

  public Qualy2Response setBrakes(@Nullable Integer setBrakes) {
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

  public Qualy2Response setGear(@Nullable Integer setGear) {
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

  public Qualy2Response setSusp(@Nullable Integer setSusp) {
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

  public Qualy2Response setTyres(@Nullable String setTyres) {
    this.setTyres = setTyres;
    return this;
  }

  /**
   * Get setTyres
   * @return setTyres
   */
  
  @JsonProperty("setTyres")
  public @Nullable String getSetTyres() {
    return setTyres;
  }

  public void setSetTyres(@Nullable String setTyres) {
    this.setTyres = setTyres;
  }

  public Qualy2Response setRisk(@Nullable String setRisk) {
    this.setRisk = setRisk;
    return this;
  }

  /**
   * Get setRisk
   * @return setRisk
   */
  
  @JsonProperty("setRisk")
  public @Nullable String getSetRisk() {
    return setRisk;
  }

  public void setSetRisk(@Nullable String setRisk) {
    this.setRisk = setRisk;
  }

  public Qualy2Response setFuel(@Nullable Integer setFuel) {
    this.setFuel = setFuel;
    return this;
  }

  /**
   * Get setFuel
   * @return setFuel
   */
  
  @JsonProperty("setFuel")
  public @Nullable Integer getSetFuel() {
    return setFuel;
  }

  public void setSetFuel(@Nullable Integer setFuel) {
    this.setFuel = setFuel;
  }

  public Qualy2Response setDryTyres(@Nullable String setDryTyres) {
    this.setDryTyres = setDryTyres;
    return this;
  }

  /**
   * Get setDryTyres
   * @return setDryTyres
   */
  
  @JsonProperty("setDryTyres")
  public @Nullable String getSetDryTyres() {
    return setDryTyres;
  }

  public void setSetDryTyres(@Nullable String setDryTyres) {
    this.setDryTyres = setDryTyres;
  }

  public Qualy2Response weather(@Nullable PracticeResponseWeather weather) {
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

  public Qualy2Response showWeatherPopover(@Nullable Qualy2ResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
    return this;
  }

  /**
   * Get showWeatherPopover
   * @return showWeatherPopover
   */
  @Valid 
  @JsonProperty("showWeatherPopover")
  public @Nullable Qualy2ResponseShowWeatherPopover getShowWeatherPopover() {
    return showWeatherPopover;
  }

  public void setShowWeatherPopover(@Nullable Qualy2ResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
  }

  public Qualy2Response showComment1Popover(@Nullable Qualy2ResponseShowComment1Popover showComment1Popover) {
    this.showComment1Popover = showComment1Popover;
    return this;
  }

  /**
   * Get showComment1Popover
   * @return showComment1Popover
   */
  @Valid 
  @JsonProperty("showComment1Popover")
  public @Nullable Qualy2ResponseShowComment1Popover getShowComment1Popover() {
    return showComment1Popover;
  }

  public void setShowComment1Popover(@Nullable Qualy2ResponseShowComment1Popover showComment1Popover) {
    this.showComment1Popover = showComment1Popover;
  }

  public Qualy2Response endOfSeason(@Nullable Integer endOfSeason) {
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

  public Qualy2Response selectedLap(@Nullable Integer selectedLap) {
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

  public Qualy2Response raceInProgress(@Nullable Integer raceInProgress) {
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

  public Qualy2Response showError(@Nullable Integer showError) {
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

  public Qualy2Response errorMsg(@Nullable String errorMsg) {
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

  public Qualy2Response disableDriveButton(@Nullable Integer disableDriveButton) {
    this.disableDriveButton = disableDriveButton;
    return this;
  }

  /**
   * Get disableDriveButton
   * @return disableDriveButton
   */
  
  @JsonProperty("disableDriveButton")
  public @Nullable Integer getDisableDriveButton() {
    return disableDriveButton;
  }

  public void setDisableDriveButton(@Nullable Integer disableDriveButton) {
    this.disableDriveButton = disableDriveButton;
  }

  public Qualy2Response tyresInvalid(@Nullable Integer tyresInvalid) {
    this.tyresInvalid = tyresInvalid;
    return this;
  }

  /**
   * Get tyresInvalid
   * @return tyresInvalid
   */
  
  @JsonProperty("tyresInvalid")
  public @Nullable Integer getTyresInvalid() {
    return tyresInvalid;
  }

  public void setTyresInvalid(@Nullable Integer tyresInvalid) {
    this.tyresInvalid = tyresInvalid;
  }

  public Qualy2Response fWingInvalid(@Nullable Integer fWingInvalid) {
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

  public Qualy2Response rWingInvalid(@Nullable Integer rWingInvalid) {
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

  public Qualy2Response engInvalid(@Nullable Integer engInvalid) {
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

  public Qualy2Response braInvalid(@Nullable Integer braInvalid) {
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

  public Qualy2Response gearInvalid(@Nullable Integer gearInvalid) {
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

  public Qualy2Response suspInvalid(@Nullable Integer suspInvalid) {
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

  public Qualy2Response q1LapData(@Nullable PracticeResponseQ1LapData q1LapData) {
    this.q1LapData = q1LapData;
    return this;
  }

  /**
   * Get q1LapData
   * @return q1LapData
   */
  @Valid 
  @JsonProperty("q1LapData")
  public @Nullable PracticeResponseQ1LapData getQ1LapData() {
    return q1LapData;
  }

  public void setQ1LapData(@Nullable PracticeResponseQ1LapData q1LapData) {
    this.q1LapData = q1LapData;
  }

  public Qualy2Response q2LapData(@Nullable Qualy2ResponseQ2LapData q2LapData) {
    this.q2LapData = q2LapData;
    return this;
  }

  /**
   * Get q2LapData
   * @return q2LapData
   */
  @Valid 
  @JsonProperty("q2LapData")
  public @Nullable Qualy2ResponseQ2LapData getQ2LapData() {
    return q2LapData;
  }

  public void setQ2LapData(@Nullable Qualy2ResponseQ2LapData q2LapData) {
    this.q2LapData = q2LapData;
  }

  public Qualy2Response sgLapTime(@Nullable String sgLapTime) {
    this.sgLapTime = sgLapTime;
    return this;
  }

  /**
   * Get sgLapTime
   * @return sgLapTime
   */
  
  @JsonProperty("sgLapTime")
  public @Nullable String getSgLapTime() {
    return sgLapTime;
  }

  public void setSgLapTime(@Nullable String sgLapTime) {
    this.sgLapTime = sgLapTime;
  }

  public Qualy2Response sgGap(@Nullable String sgGap) {
    this.sgGap = sgGap;
    return this;
  }

  /**
   * Get sgGap
   * @return sgGap
   */
  
  @JsonProperty("sgGap")
  public @Nullable String getSgGap() {
    return sgGap;
  }

  public void setSgGap(@Nullable String sgGap) {
    this.sgGap = sgGap;
  }

  public Qualy2Response sgPos(@Nullable String sgPos) {
    this.sgPos = sgPos;
    return this;
  }

  /**
   * Get sgPos
   * @return sgPos
   */
  
  @JsonProperty("sgPos")
  public @Nullable String getSgPos() {
    return sgPos;
  }

  public void setSgPos(@Nullable String sgPos) {
    this.sgPos = sgPos;
  }

  public Qualy2Response isSupporter(@Nullable Integer isSupporter) {
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

  public Qualy2Response apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    Qualy2Response qualy2Response = (Qualy2Response) o;
    return Objects.equals(this.loadingDataState, qualy2Response.loadingDataState) &&
        Objects.equals(this.segmentSelected, qualy2Response.segmentSelected) &&
        Objects.equals(this.trackName, qualy2Response.trackName) &&
        Objects.equals(this.trackNat, qualy2Response.trackNat) &&
        Objects.equals(this.trackId, qualy2Response.trackId) &&
        Objects.equals(this.trackImg, qualy2Response.trackImg) &&
        Objects.equals(this.trackPower, qualy2Response.trackPower) &&
        Objects.equals(this.trackAccel, qualy2Response.trackAccel) &&
        Objects.equals(this.trackHandl, qualy2Response.trackHandl) &&
        Objects.equals(this.carPower, qualy2Response.carPower) &&
        Objects.equals(this.carHandl, qualy2Response.carHandl) &&
        Objects.equals(this.carAccel, qualy2Response.carAccel) &&
        Objects.equals(this.lvlChassis, qualy2Response.lvlChassis) &&
        Objects.equals(this.lvlBrakes, qualy2Response.lvlBrakes) &&
        Objects.equals(this.lvlCooling, qualy2Response.lvlCooling) &&
        Objects.equals(this.lvlElectronics, qualy2Response.lvlElectronics) &&
        Objects.equals(this.lvlEngine, qualy2Response.lvlEngine) &&
        Objects.equals(this.lvlFWing, qualy2Response.lvlFWing) &&
        Objects.equals(this.lvlRWing, qualy2Response.lvlRWing) &&
        Objects.equals(this.lvlGear, qualy2Response.lvlGear) &&
        Objects.equals(this.lvlSidepods, qualy2Response.lvlSidepods) &&
        Objects.equals(this.lvlSusp, qualy2Response.lvlSusp) &&
        Objects.equals(this.lvlUnderbody, qualy2Response.lvlUnderbody) &&
        Objects.equals(this.usaBrakes, qualy2Response.usaBrakes) &&
        Objects.equals(this.usaChassis, qualy2Response.usaChassis) &&
        Objects.equals(this.usaCooling, qualy2Response.usaCooling) &&
        Objects.equals(this.usaElectronics, qualy2Response.usaElectronics) &&
        Objects.equals(this.usaEngine, qualy2Response.usaEngine) &&
        Objects.equals(this.usaFWing, qualy2Response.usaFWing) &&
        Objects.equals(this.usaGear, qualy2Response.usaGear) &&
        Objects.equals(this.usaRWing, qualy2Response.usaRWing) &&
        Objects.equals(this.usaSidepods, qualy2Response.usaSidepods) &&
        Objects.equals(this.usaSusp, qualy2Response.usaSusp) &&
        Objects.equals(this.usaUnderbody, qualy2Response.usaUnderbody) &&
        Objects.equals(this.cash, qualy2Response.cash) &&
        Objects.equals(this.setFWing, qualy2Response.setFWing) &&
        Objects.equals(this.setRWing, qualy2Response.setRWing) &&
        Objects.equals(this.setEngine, qualy2Response.setEngine) &&
        Objects.equals(this.setBrakes, qualy2Response.setBrakes) &&
        Objects.equals(this.setGear, qualy2Response.setGear) &&
        Objects.equals(this.setSusp, qualy2Response.setSusp) &&
        Objects.equals(this.setTyres, qualy2Response.setTyres) &&
        Objects.equals(this.setRisk, qualy2Response.setRisk) &&
        Objects.equals(this.setFuel, qualy2Response.setFuel) &&
        Objects.equals(this.setDryTyres, qualy2Response.setDryTyres) &&
        Objects.equals(this.weather, qualy2Response.weather) &&
        Objects.equals(this.showWeatherPopover, qualy2Response.showWeatherPopover) &&
        Objects.equals(this.showComment1Popover, qualy2Response.showComment1Popover) &&
        Objects.equals(this.endOfSeason, qualy2Response.endOfSeason) &&
        Objects.equals(this.selectedLap, qualy2Response.selectedLap) &&
        Objects.equals(this.raceInProgress, qualy2Response.raceInProgress) &&
        Objects.equals(this.showError, qualy2Response.showError) &&
        Objects.equals(this.errorMsg, qualy2Response.errorMsg) &&
        Objects.equals(this.disableDriveButton, qualy2Response.disableDriveButton) &&
        Objects.equals(this.tyresInvalid, qualy2Response.tyresInvalid) &&
        Objects.equals(this.fWingInvalid, qualy2Response.fWingInvalid) &&
        Objects.equals(this.rWingInvalid, qualy2Response.rWingInvalid) &&
        Objects.equals(this.engInvalid, qualy2Response.engInvalid) &&
        Objects.equals(this.braInvalid, qualy2Response.braInvalid) &&
        Objects.equals(this.gearInvalid, qualy2Response.gearInvalid) &&
        Objects.equals(this.suspInvalid, qualy2Response.suspInvalid) &&
        Objects.equals(this.q1LapData, qualy2Response.q1LapData) &&
        Objects.equals(this.q2LapData, qualy2Response.q2LapData) &&
        Objects.equals(this.sgLapTime, qualy2Response.sgLapTime) &&
        Objects.equals(this.sgGap, qualy2Response.sgGap) &&
        Objects.equals(this.sgPos, qualy2Response.sgPos) &&
        Objects.equals(this.isSupporter, qualy2Response.isSupporter) &&
        Objects.equals(this.apiRequestsRemaining, qualy2Response.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, trackName, trackNat, trackId, trackImg, trackPower, trackAccel, trackHandl, carPower, carHandl, carAccel, lvlChassis, lvlBrakes, lvlCooling, lvlElectronics, lvlEngine, lvlFWing, lvlRWing, lvlGear, lvlSidepods, lvlSusp, lvlUnderbody, usaBrakes, usaChassis, usaCooling, usaElectronics, usaEngine, usaFWing, usaGear, usaRWing, usaSidepods, usaSusp, usaUnderbody, cash, setFWing, setRWing, setEngine, setBrakes, setGear, setSusp, setTyres, setRisk, setFuel, setDryTyres, weather, showWeatherPopover, showComment1Popover, endOfSeason, selectedLap, raceInProgress, showError, errorMsg, disableDriveButton, tyresInvalid, fWingInvalid, rWingInvalid, engInvalid, braInvalid, gearInvalid, suspInvalid, q1LapData, q2LapData, sgLapTime, sgGap, sgPos, isSupporter, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qualy2Response {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackNat: ").append(toIndentedString(trackNat)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    trackImg: ").append(toIndentedString(trackImg)).append("\n");
    sb.append("    trackPower: ").append(toIndentedString(trackPower)).append("\n");
    sb.append("    trackAccel: ").append(toIndentedString(trackAccel)).append("\n");
    sb.append("    trackHandl: ").append(toIndentedString(trackHandl)).append("\n");
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
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEngine: ").append(toIndentedString(setEngine)).append("\n");
    sb.append("    setBrakes: ").append(toIndentedString(setBrakes)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
    sb.append("    setRisk: ").append(toIndentedString(setRisk)).append("\n");
    sb.append("    setFuel: ").append(toIndentedString(setFuel)).append("\n");
    sb.append("    setDryTyres: ").append(toIndentedString(setDryTyres)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    showWeatherPopover: ").append(toIndentedString(showWeatherPopover)).append("\n");
    sb.append("    showComment1Popover: ").append(toIndentedString(showComment1Popover)).append("\n");
    sb.append("    endOfSeason: ").append(toIndentedString(endOfSeason)).append("\n");
    sb.append("    selectedLap: ").append(toIndentedString(selectedLap)).append("\n");
    sb.append("    raceInProgress: ").append(toIndentedString(raceInProgress)).append("\n");
    sb.append("    showError: ").append(toIndentedString(showError)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    disableDriveButton: ").append(toIndentedString(disableDriveButton)).append("\n");
    sb.append("    tyresInvalid: ").append(toIndentedString(tyresInvalid)).append("\n");
    sb.append("    fWingInvalid: ").append(toIndentedString(fWingInvalid)).append("\n");
    sb.append("    rWingInvalid: ").append(toIndentedString(rWingInvalid)).append("\n");
    sb.append("    engInvalid: ").append(toIndentedString(engInvalid)).append("\n");
    sb.append("    braInvalid: ").append(toIndentedString(braInvalid)).append("\n");
    sb.append("    gearInvalid: ").append(toIndentedString(gearInvalid)).append("\n");
    sb.append("    suspInvalid: ").append(toIndentedString(suspInvalid)).append("\n");
    sb.append("    q1LapData: ").append(toIndentedString(q1LapData)).append("\n");
    sb.append("    q2LapData: ").append(toIndentedString(q2LapData)).append("\n");
    sb.append("    sgLapTime: ").append(toIndentedString(sgLapTime)).append("\n");
    sb.append("    sgGap: ").append(toIndentedString(sgGap)).append("\n");
    sb.append("    sgPos: ").append(toIndentedString(sgPos)).append("\n");
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

