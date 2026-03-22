package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.PracticeResponseLapsDoneInner;
import org.jlobato.gpro.proxy.model.PracticeResponseQ1LapData;
import org.jlobato.gpro.proxy.model.PracticeResponseShowComment1Popover;
import org.jlobato.gpro.proxy.model.PracticeResponseShowWeatherPopover;
import org.jlobato.gpro.proxy.model.PracticeResponseWeather;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PracticeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class PracticeResponse {

  private @Nullable Integer loadingDataState;

  private @Nullable String segmentSelected;

  private @Nullable String trackName;

  private @Nullable Integer trackId;

  private @Nullable String trackImg;

  private @Nullable String trackNat;

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

  private @Nullable Integer cash;

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

  private @Nullable Integer setFWing;

  private @Nullable Integer setRWing;

  private @Nullable Integer setEngine;

  private @Nullable Integer setBrakes;

  private @Nullable Integer setGear;

  private @Nullable Integer setSusp;

  private @Nullable String setRisk;

  private @Nullable String setDryTyres;

  private @Nullable PracticeResponseWeather weather;

  private @Nullable PracticeResponseShowWeatherPopover showWeatherPopover;

  @Valid
  private List<@Valid PracticeResponseLapsDoneInner> lapsDone = new ArrayList<>();

  private @Nullable PracticeResponseShowComment1Popover showComment1Popover;

  private @Nullable Integer endOfSeason;

  private @Nullable Integer selectedLap;

  private @Nullable Integer bestNetLapIdx;

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

  private @Nullable Integer isSupporter;

  private @Nullable String setTyres;

  private @Nullable Integer apiRequestsRemaining;

  public PracticeResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public PracticeResponse segmentSelected(@Nullable String segmentSelected) {
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

  public PracticeResponse trackName(@Nullable String trackName) {
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

  public PracticeResponse trackId(@Nullable Integer trackId) {
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

  public PracticeResponse trackImg(@Nullable String trackImg) {
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

  public PracticeResponse trackNat(@Nullable String trackNat) {
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

  public PracticeResponse trackPower(@Nullable String trackPower) {
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

  public PracticeResponse trackAccel(@Nullable String trackAccel) {
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

  public PracticeResponse trackHandl(@Nullable String trackHandl) {
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

  public PracticeResponse carPower(@Nullable String carPower) {
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

  public PracticeResponse carHandl(@Nullable String carHandl) {
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

  public PracticeResponse carAccel(@Nullable String carAccel) {
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

  public PracticeResponse lvlChassis(@Nullable String lvlChassis) {
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

  public PracticeResponse lvlBrakes(@Nullable String lvlBrakes) {
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

  public PracticeResponse lvlCooling(@Nullable String lvlCooling) {
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

  public PracticeResponse lvlElectronics(@Nullable String lvlElectronics) {
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

  public PracticeResponse lvlEngine(@Nullable String lvlEngine) {
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

  public PracticeResponse lvlFWing(@Nullable String lvlFWing) {
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

  public PracticeResponse lvlRWing(@Nullable String lvlRWing) {
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

  public PracticeResponse lvlGear(@Nullable String lvlGear) {
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

  public PracticeResponse lvlSidepods(@Nullable String lvlSidepods) {
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

  public PracticeResponse lvlSusp(@Nullable String lvlSusp) {
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

  public PracticeResponse lvlUnderbody(@Nullable String lvlUnderbody) {
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

  public PracticeResponse cash(@Nullable Integer cash) {
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

  public PracticeResponse usaBrakes(@Nullable String usaBrakes) {
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

  public PracticeResponse usaChassis(@Nullable String usaChassis) {
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

  public PracticeResponse usaCooling(@Nullable String usaCooling) {
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

  public PracticeResponse usaElectronics(@Nullable String usaElectronics) {
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

  public PracticeResponse usaEngine(@Nullable String usaEngine) {
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

  public PracticeResponse usaFWing(@Nullable String usaFWing) {
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

  public PracticeResponse usaGear(@Nullable String usaGear) {
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

  public PracticeResponse usaRWing(@Nullable String usaRWing) {
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

  public PracticeResponse usaSidepods(@Nullable String usaSidepods) {
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

  public PracticeResponse usaSusp(@Nullable String usaSusp) {
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

  public PracticeResponse usaUnderbody(@Nullable String usaUnderbody) {
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

  public PracticeResponse setFWing(@Nullable Integer setFWing) {
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

  public PracticeResponse setRWing(@Nullable Integer setRWing) {
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

  public PracticeResponse setEngine(@Nullable Integer setEngine) {
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

  public PracticeResponse setBrakes(@Nullable Integer setBrakes) {
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

  public PracticeResponse setGear(@Nullable Integer setGear) {
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

  public PracticeResponse setSusp(@Nullable Integer setSusp) {
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

  public PracticeResponse setRisk(@Nullable String setRisk) {
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

  public PracticeResponse setDryTyres(@Nullable String setDryTyres) {
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

  public PracticeResponse weather(@Nullable PracticeResponseWeather weather) {
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

  public PracticeResponse showWeatherPopover(@Nullable PracticeResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
    return this;
  }

  /**
   * Get showWeatherPopover
   * @return showWeatherPopover
   */
  @Valid 
  @JsonProperty("showWeatherPopover")
  public @Nullable PracticeResponseShowWeatherPopover getShowWeatherPopover() {
    return showWeatherPopover;
  }

  public void setShowWeatherPopover(@Nullable PracticeResponseShowWeatherPopover showWeatherPopover) {
    this.showWeatherPopover = showWeatherPopover;
  }

  public PracticeResponse lapsDone(List<@Valid PracticeResponseLapsDoneInner> lapsDone) {
    this.lapsDone = lapsDone;
    return this;
  }

  public PracticeResponse addLapsDoneItem(PracticeResponseLapsDoneInner lapsDoneItem) {
    if (this.lapsDone == null) {
      this.lapsDone = new ArrayList<>();
    }
    this.lapsDone.add(lapsDoneItem);
    return this;
  }

  /**
   * Get lapsDone
   * @return lapsDone
   */
  @Valid 
  @JsonProperty("lapsDone")
  public List<@Valid PracticeResponseLapsDoneInner> getLapsDone() {
    return lapsDone;
  }

  public void setLapsDone(List<@Valid PracticeResponseLapsDoneInner> lapsDone) {
    this.lapsDone = lapsDone;
  }

  public PracticeResponse showComment1Popover(@Nullable PracticeResponseShowComment1Popover showComment1Popover) {
    this.showComment1Popover = showComment1Popover;
    return this;
  }

  /**
   * Get showComment1Popover
   * @return showComment1Popover
   */
  @Valid 
  @JsonProperty("showComment1Popover")
  public @Nullable PracticeResponseShowComment1Popover getShowComment1Popover() {
    return showComment1Popover;
  }

  public void setShowComment1Popover(@Nullable PracticeResponseShowComment1Popover showComment1Popover) {
    this.showComment1Popover = showComment1Popover;
  }

  public PracticeResponse endOfSeason(@Nullable Integer endOfSeason) {
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

  public PracticeResponse selectedLap(@Nullable Integer selectedLap) {
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

  public PracticeResponse bestNetLapIdx(@Nullable Integer bestNetLapIdx) {
    this.bestNetLapIdx = bestNetLapIdx;
    return this;
  }

  /**
   * Get bestNetLapIdx
   * @return bestNetLapIdx
   */
  
  @JsonProperty("bestNetLapIdx")
  public @Nullable Integer getBestNetLapIdx() {
    return bestNetLapIdx;
  }

  public void setBestNetLapIdx(@Nullable Integer bestNetLapIdx) {
    this.bestNetLapIdx = bestNetLapIdx;
  }

  public PracticeResponse raceInProgress(@Nullable Integer raceInProgress) {
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

  public PracticeResponse showError(@Nullable Integer showError) {
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

  public PracticeResponse errorMsg(@Nullable String errorMsg) {
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

  public PracticeResponse disableDriveButton(@Nullable Integer disableDriveButton) {
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

  public PracticeResponse tyresInvalid(@Nullable Integer tyresInvalid) {
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

  public PracticeResponse fWingInvalid(@Nullable Integer fWingInvalid) {
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

  public PracticeResponse rWingInvalid(@Nullable Integer rWingInvalid) {
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

  public PracticeResponse engInvalid(@Nullable Integer engInvalid) {
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

  public PracticeResponse braInvalid(@Nullable Integer braInvalid) {
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

  public PracticeResponse gearInvalid(@Nullable Integer gearInvalid) {
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

  public PracticeResponse suspInvalid(@Nullable Integer suspInvalid) {
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

  public PracticeResponse q1LapData(@Nullable PracticeResponseQ1LapData q1LapData) {
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

  public PracticeResponse isSupporter(@Nullable Integer isSupporter) {
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

  public PracticeResponse setTyres(@Nullable String setTyres) {
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

  public PracticeResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    PracticeResponse practiceResponse = (PracticeResponse) o;
    return Objects.equals(this.loadingDataState, practiceResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, practiceResponse.segmentSelected) &&
        Objects.equals(this.trackName, practiceResponse.trackName) &&
        Objects.equals(this.trackId, practiceResponse.trackId) &&
        Objects.equals(this.trackImg, practiceResponse.trackImg) &&
        Objects.equals(this.trackNat, practiceResponse.trackNat) &&
        Objects.equals(this.trackPower, practiceResponse.trackPower) &&
        Objects.equals(this.trackAccel, practiceResponse.trackAccel) &&
        Objects.equals(this.trackHandl, practiceResponse.trackHandl) &&
        Objects.equals(this.carPower, practiceResponse.carPower) &&
        Objects.equals(this.carHandl, practiceResponse.carHandl) &&
        Objects.equals(this.carAccel, practiceResponse.carAccel) &&
        Objects.equals(this.lvlChassis, practiceResponse.lvlChassis) &&
        Objects.equals(this.lvlBrakes, practiceResponse.lvlBrakes) &&
        Objects.equals(this.lvlCooling, practiceResponse.lvlCooling) &&
        Objects.equals(this.lvlElectronics, practiceResponse.lvlElectronics) &&
        Objects.equals(this.lvlEngine, practiceResponse.lvlEngine) &&
        Objects.equals(this.lvlFWing, practiceResponse.lvlFWing) &&
        Objects.equals(this.lvlRWing, practiceResponse.lvlRWing) &&
        Objects.equals(this.lvlGear, practiceResponse.lvlGear) &&
        Objects.equals(this.lvlSidepods, practiceResponse.lvlSidepods) &&
        Objects.equals(this.lvlSusp, practiceResponse.lvlSusp) &&
        Objects.equals(this.lvlUnderbody, practiceResponse.lvlUnderbody) &&
        Objects.equals(this.cash, practiceResponse.cash) &&
        Objects.equals(this.usaBrakes, practiceResponse.usaBrakes) &&
        Objects.equals(this.usaChassis, practiceResponse.usaChassis) &&
        Objects.equals(this.usaCooling, practiceResponse.usaCooling) &&
        Objects.equals(this.usaElectronics, practiceResponse.usaElectronics) &&
        Objects.equals(this.usaEngine, practiceResponse.usaEngine) &&
        Objects.equals(this.usaFWing, practiceResponse.usaFWing) &&
        Objects.equals(this.usaGear, practiceResponse.usaGear) &&
        Objects.equals(this.usaRWing, practiceResponse.usaRWing) &&
        Objects.equals(this.usaSidepods, practiceResponse.usaSidepods) &&
        Objects.equals(this.usaSusp, practiceResponse.usaSusp) &&
        Objects.equals(this.usaUnderbody, practiceResponse.usaUnderbody) &&
        Objects.equals(this.setFWing, practiceResponse.setFWing) &&
        Objects.equals(this.setRWing, practiceResponse.setRWing) &&
        Objects.equals(this.setEngine, practiceResponse.setEngine) &&
        Objects.equals(this.setBrakes, practiceResponse.setBrakes) &&
        Objects.equals(this.setGear, practiceResponse.setGear) &&
        Objects.equals(this.setSusp, practiceResponse.setSusp) &&
        Objects.equals(this.setRisk, practiceResponse.setRisk) &&
        Objects.equals(this.setDryTyres, practiceResponse.setDryTyres) &&
        Objects.equals(this.weather, practiceResponse.weather) &&
        Objects.equals(this.showWeatherPopover, practiceResponse.showWeatherPopover) &&
        Objects.equals(this.lapsDone, practiceResponse.lapsDone) &&
        Objects.equals(this.showComment1Popover, practiceResponse.showComment1Popover) &&
        Objects.equals(this.endOfSeason, practiceResponse.endOfSeason) &&
        Objects.equals(this.selectedLap, practiceResponse.selectedLap) &&
        Objects.equals(this.bestNetLapIdx, practiceResponse.bestNetLapIdx) &&
        Objects.equals(this.raceInProgress, practiceResponse.raceInProgress) &&
        Objects.equals(this.showError, practiceResponse.showError) &&
        Objects.equals(this.errorMsg, practiceResponse.errorMsg) &&
        Objects.equals(this.disableDriveButton, practiceResponse.disableDriveButton) &&
        Objects.equals(this.tyresInvalid, practiceResponse.tyresInvalid) &&
        Objects.equals(this.fWingInvalid, practiceResponse.fWingInvalid) &&
        Objects.equals(this.rWingInvalid, practiceResponse.rWingInvalid) &&
        Objects.equals(this.engInvalid, practiceResponse.engInvalid) &&
        Objects.equals(this.braInvalid, practiceResponse.braInvalid) &&
        Objects.equals(this.gearInvalid, practiceResponse.gearInvalid) &&
        Objects.equals(this.suspInvalid, practiceResponse.suspInvalid) &&
        Objects.equals(this.q1LapData, practiceResponse.q1LapData) &&
        Objects.equals(this.isSupporter, practiceResponse.isSupporter) &&
        Objects.equals(this.setTyres, practiceResponse.setTyres) &&
        Objects.equals(this.apiRequestsRemaining, practiceResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, trackName, trackId, trackImg, trackNat, trackPower, trackAccel, trackHandl, carPower, carHandl, carAccel, lvlChassis, lvlBrakes, lvlCooling, lvlElectronics, lvlEngine, lvlFWing, lvlRWing, lvlGear, lvlSidepods, lvlSusp, lvlUnderbody, cash, usaBrakes, usaChassis, usaCooling, usaElectronics, usaEngine, usaFWing, usaGear, usaRWing, usaSidepods, usaSusp, usaUnderbody, setFWing, setRWing, setEngine, setBrakes, setGear, setSusp, setRisk, setDryTyres, weather, showWeatherPopover, lapsDone, showComment1Popover, endOfSeason, selectedLap, bestNetLapIdx, raceInProgress, showError, errorMsg, disableDriveButton, tyresInvalid, fWingInvalid, rWingInvalid, engInvalid, braInvalid, gearInvalid, suspInvalid, q1LapData, isSupporter, setTyres, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PracticeResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    trackName: ").append(toIndentedString(trackName)).append("\n");
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    trackImg: ").append(toIndentedString(trackImg)).append("\n");
    sb.append("    trackNat: ").append(toIndentedString(trackNat)).append("\n");
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
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
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
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEngine: ").append(toIndentedString(setEngine)).append("\n");
    sb.append("    setBrakes: ").append(toIndentedString(setBrakes)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setRisk: ").append(toIndentedString(setRisk)).append("\n");
    sb.append("    setDryTyres: ").append(toIndentedString(setDryTyres)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    showWeatherPopover: ").append(toIndentedString(showWeatherPopover)).append("\n");
    sb.append("    lapsDone: ").append(toIndentedString(lapsDone)).append("\n");
    sb.append("    showComment1Popover: ").append(toIndentedString(showComment1Popover)).append("\n");
    sb.append("    endOfSeason: ").append(toIndentedString(endOfSeason)).append("\n");
    sb.append("    selectedLap: ").append(toIndentedString(selectedLap)).append("\n");
    sb.append("    bestNetLapIdx: ").append(toIndentedString(bestNetLapIdx)).append("\n");
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
    sb.append("    isSupporter: ").append(toIndentedString(isSupporter)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
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

