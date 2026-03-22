package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.PracticeResponseShowComment1Popover;
import org.jlobato.gpro.proxy.model.PracticeResponseShowWeatherPopover;
import org.jlobato.gpro.proxy.model.TestingResponseStintsDoneInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TestingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TestingResponse {

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

  private @Nullable Integer cash;

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

  private @Nullable Integer setFWing;

  private @Nullable Integer setRWing;

  private @Nullable Integer setEngine;

  private @Nullable Integer setBrakes;

  private @Nullable Integer setGear;

  private @Nullable Integer setSusp;

  private @Nullable String setTyres;

  private @Nullable Integer setFuel;

  private @Nullable String setPriority;

  private @Nullable Integer setStintLaps;

  private @Nullable String weather;

  private @Nullable Integer temp;

  private @Nullable Integer hum;

  private @Nullable PracticeResponseShowWeatherPopover showWeatherPopover;

  @Valid
  private List<@Valid TestingResponseStintsDoneInner> stintsDone = new ArrayList<>();

  private @Nullable Integer lapsLeft;

  private @Nullable Integer stintsLeft;

  private @Nullable String testPPoints;

  private @Nullable String testHPoints;

  private @Nullable String testAPoints;

  private @Nullable String rdPPoints;

  private @Nullable String rdHPoints;

  private @Nullable String rdAPoints;

  private @Nullable String engPPoints;

  private @Nullable String engHPoints;

  private @Nullable String engAPoints;

  private @Nullable String tcarPower;

  private @Nullable String tcarHandl;

  private @Nullable String tcarAccel;

  private @Nullable PracticeResponseShowComment1Popover showComment1Popover;

  private @Nullable Integer endOfSeason;

  private @Nullable Integer selectedStint;

  private @Nullable Integer raceInProgress;

  private @Nullable Integer showError;

  private @Nullable String errorMsg;

  private @Nullable Integer disableDriveButton;

  private @Nullable Integer fuelInvalid;

  private @Nullable Integer priorityInvalid;

  private @Nullable Integer stintLengthInvalid;

  private @Nullable Integer tyresInvalid;

  private @Nullable Integer fWingInvalid;

  private @Nullable Integer rWingInvalid;

  private @Nullable Integer engInvalid;

  private @Nullable Integer braInvalid;

  private @Nullable Integer gearInvalid;

  private @Nullable Integer suspInvalid;

  private @Nullable Integer isSupporter;

  private @Nullable Integer apiRequestsRemaining;

  public TestingResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public TestingResponse segmentSelected(@Nullable String segmentSelected) {
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

  public TestingResponse trackName(@Nullable String trackName) {
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

  public TestingResponse trackNat(@Nullable String trackNat) {
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

  public TestingResponse trackId(@Nullable Integer trackId) {
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

  public TestingResponse trackImg(@Nullable String trackImg) {
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

  public TestingResponse trackPower(@Nullable String trackPower) {
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

  public TestingResponse trackAccel(@Nullable String trackAccel) {
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

  public TestingResponse trackHandl(@Nullable String trackHandl) {
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

  public TestingResponse carPower(@Nullable String carPower) {
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

  public TestingResponse carHandl(@Nullable String carHandl) {
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

  public TestingResponse carAccel(@Nullable String carAccel) {
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

  public TestingResponse cash(@Nullable Integer cash) {
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

  public TestingResponse lvlChassis(@Nullable String lvlChassis) {
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

  public TestingResponse lvlBrakes(@Nullable String lvlBrakes) {
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

  public TestingResponse lvlCooling(@Nullable String lvlCooling) {
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

  public TestingResponse lvlElectronics(@Nullable String lvlElectronics) {
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

  public TestingResponse lvlEngine(@Nullable String lvlEngine) {
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

  public TestingResponse lvlFWing(@Nullable String lvlFWing) {
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

  public TestingResponse lvlRWing(@Nullable String lvlRWing) {
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

  public TestingResponse lvlGear(@Nullable String lvlGear) {
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

  public TestingResponse lvlSidepods(@Nullable String lvlSidepods) {
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

  public TestingResponse lvlSusp(@Nullable String lvlSusp) {
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

  public TestingResponse lvlUnderbody(@Nullable String lvlUnderbody) {
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

  public TestingResponse usaBrakes(@Nullable String usaBrakes) {
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

  public TestingResponse usaChassis(@Nullable String usaChassis) {
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

  public TestingResponse usaCooling(@Nullable String usaCooling) {
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

  public TestingResponse usaElectronics(@Nullable String usaElectronics) {
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

  public TestingResponse usaEngine(@Nullable String usaEngine) {
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

  public TestingResponse usaFWing(@Nullable String usaFWing) {
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

  public TestingResponse usaGear(@Nullable String usaGear) {
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

  public TestingResponse usaRWing(@Nullable String usaRWing) {
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

  public TestingResponse usaSidepods(@Nullable String usaSidepods) {
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

  public TestingResponse usaSusp(@Nullable String usaSusp) {
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

  public TestingResponse usaUnderbody(@Nullable String usaUnderbody) {
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

  public TestingResponse setFWing(@Nullable Integer setFWing) {
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

  public TestingResponse setRWing(@Nullable Integer setRWing) {
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

  public TestingResponse setEngine(@Nullable Integer setEngine) {
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

  public TestingResponse setBrakes(@Nullable Integer setBrakes) {
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

  public TestingResponse setGear(@Nullable Integer setGear) {
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

  public TestingResponse setSusp(@Nullable Integer setSusp) {
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

  public TestingResponse setTyres(@Nullable String setTyres) {
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

  public TestingResponse setFuel(@Nullable Integer setFuel) {
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

  public TestingResponse setPriority(@Nullable String setPriority) {
    this.setPriority = setPriority;
    return this;
  }

  /**
   * Get setPriority
   * @return setPriority
   */
  
  @JsonProperty("setPriority")
  public @Nullable String getSetPriority() {
    return setPriority;
  }

  public void setSetPriority(@Nullable String setPriority) {
    this.setPriority = setPriority;
  }

  public TestingResponse setStintLaps(@Nullable Integer setStintLaps) {
    this.setStintLaps = setStintLaps;
    return this;
  }

  /**
   * Get setStintLaps
   * @return setStintLaps
   */
  
  @JsonProperty("setStintLaps")
  public @Nullable Integer getSetStintLaps() {
    return setStintLaps;
  }

  public void setSetStintLaps(@Nullable Integer setStintLaps) {
    this.setStintLaps = setStintLaps;
  }

  public TestingResponse weather(@Nullable String weather) {
    this.weather = weather;
    return this;
  }

  /**
   * Get weather
   * @return weather
   */
  
  @JsonProperty("weather")
  public @Nullable String getWeather() {
    return weather;
  }

  public void setWeather(@Nullable String weather) {
    this.weather = weather;
  }

  public TestingResponse temp(@Nullable Integer temp) {
    this.temp = temp;
    return this;
  }

  /**
   * Get temp
   * @return temp
   */
  
  @JsonProperty("temp")
  public @Nullable Integer getTemp() {
    return temp;
  }

  public void setTemp(@Nullable Integer temp) {
    this.temp = temp;
  }

  public TestingResponse hum(@Nullable Integer hum) {
    this.hum = hum;
    return this;
  }

  /**
   * Get hum
   * @return hum
   */
  
  @JsonProperty("hum")
  public @Nullable Integer getHum() {
    return hum;
  }

  public void setHum(@Nullable Integer hum) {
    this.hum = hum;
  }

  public TestingResponse showWeatherPopover(@Nullable PracticeResponseShowWeatherPopover showWeatherPopover) {
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

  public TestingResponse stintsDone(List<@Valid TestingResponseStintsDoneInner> stintsDone) {
    this.stintsDone = stintsDone;
    return this;
  }

  public TestingResponse addStintsDoneItem(TestingResponseStintsDoneInner stintsDoneItem) {
    if (this.stintsDone == null) {
      this.stintsDone = new ArrayList<>();
    }
    this.stintsDone.add(stintsDoneItem);
    return this;
  }

  /**
   * Get stintsDone
   * @return stintsDone
   */
  @Valid 
  @JsonProperty("stintsDone")
  public List<@Valid TestingResponseStintsDoneInner> getStintsDone() {
    return stintsDone;
  }

  public void setStintsDone(List<@Valid TestingResponseStintsDoneInner> stintsDone) {
    this.stintsDone = stintsDone;
  }

  public TestingResponse lapsLeft(@Nullable Integer lapsLeft) {
    this.lapsLeft = lapsLeft;
    return this;
  }

  /**
   * Get lapsLeft
   * @return lapsLeft
   */
  
  @JsonProperty("lapsLeft")
  public @Nullable Integer getLapsLeft() {
    return lapsLeft;
  }

  public void setLapsLeft(@Nullable Integer lapsLeft) {
    this.lapsLeft = lapsLeft;
  }

  public TestingResponse stintsLeft(@Nullable Integer stintsLeft) {
    this.stintsLeft = stintsLeft;
    return this;
  }

  /**
   * Get stintsLeft
   * @return stintsLeft
   */
  
  @JsonProperty("stintsLeft")
  public @Nullable Integer getStintsLeft() {
    return stintsLeft;
  }

  public void setStintsLeft(@Nullable Integer stintsLeft) {
    this.stintsLeft = stintsLeft;
  }

  public TestingResponse testPPoints(@Nullable String testPPoints) {
    this.testPPoints = testPPoints;
    return this;
  }

  /**
   * Get testPPoints
   * @return testPPoints
   */
  
  @JsonProperty("TestPPoints")
  public @Nullable String getTestPPoints() {
    return testPPoints;
  }

  public void setTestPPoints(@Nullable String testPPoints) {
    this.testPPoints = testPPoints;
  }

  public TestingResponse testHPoints(@Nullable String testHPoints) {
    this.testHPoints = testHPoints;
    return this;
  }

  /**
   * Get testHPoints
   * @return testHPoints
   */
  
  @JsonProperty("TestHPoints")
  public @Nullable String getTestHPoints() {
    return testHPoints;
  }

  public void setTestHPoints(@Nullable String testHPoints) {
    this.testHPoints = testHPoints;
  }

  public TestingResponse testAPoints(@Nullable String testAPoints) {
    this.testAPoints = testAPoints;
    return this;
  }

  /**
   * Get testAPoints
   * @return testAPoints
   */
  
  @JsonProperty("TestAPoints")
  public @Nullable String getTestAPoints() {
    return testAPoints;
  }

  public void setTestAPoints(@Nullable String testAPoints) {
    this.testAPoints = testAPoints;
  }

  public TestingResponse rdPPoints(@Nullable String rdPPoints) {
    this.rdPPoints = rdPPoints;
    return this;
  }

  /**
   * Get rdPPoints
   * @return rdPPoints
   */
  
  @JsonProperty("RDPPoints")
  public @Nullable String getRdPPoints() {
    return rdPPoints;
  }

  public void setRdPPoints(@Nullable String rdPPoints) {
    this.rdPPoints = rdPPoints;
  }

  public TestingResponse rdHPoints(@Nullable String rdHPoints) {
    this.rdHPoints = rdHPoints;
    return this;
  }

  /**
   * Get rdHPoints
   * @return rdHPoints
   */
  
  @JsonProperty("RDHPoints")
  public @Nullable String getRdHPoints() {
    return rdHPoints;
  }

  public void setRdHPoints(@Nullable String rdHPoints) {
    this.rdHPoints = rdHPoints;
  }

  public TestingResponse rdAPoints(@Nullable String rdAPoints) {
    this.rdAPoints = rdAPoints;
    return this;
  }

  /**
   * Get rdAPoints
   * @return rdAPoints
   */
  
  @JsonProperty("RDAPoints")
  public @Nullable String getRdAPoints() {
    return rdAPoints;
  }

  public void setRdAPoints(@Nullable String rdAPoints) {
    this.rdAPoints = rdAPoints;
  }

  public TestingResponse engPPoints(@Nullable String engPPoints) {
    this.engPPoints = engPPoints;
    return this;
  }

  /**
   * Get engPPoints
   * @return engPPoints
   */
  
  @JsonProperty("EngPPoints")
  public @Nullable String getEngPPoints() {
    return engPPoints;
  }

  public void setEngPPoints(@Nullable String engPPoints) {
    this.engPPoints = engPPoints;
  }

  public TestingResponse engHPoints(@Nullable String engHPoints) {
    this.engHPoints = engHPoints;
    return this;
  }

  /**
   * Get engHPoints
   * @return engHPoints
   */
  
  @JsonProperty("EngHPoints")
  public @Nullable String getEngHPoints() {
    return engHPoints;
  }

  public void setEngHPoints(@Nullable String engHPoints) {
    this.engHPoints = engHPoints;
  }

  public TestingResponse engAPoints(@Nullable String engAPoints) {
    this.engAPoints = engAPoints;
    return this;
  }

  /**
   * Get engAPoints
   * @return engAPoints
   */
  
  @JsonProperty("EngAPoints")
  public @Nullable String getEngAPoints() {
    return engAPoints;
  }

  public void setEngAPoints(@Nullable String engAPoints) {
    this.engAPoints = engAPoints;
  }

  public TestingResponse tcarPower(@Nullable String tcarPower) {
    this.tcarPower = tcarPower;
    return this;
  }

  /**
   * Get tcarPower
   * @return tcarPower
   */
  
  @JsonProperty("TcarPower")
  public @Nullable String getTcarPower() {
    return tcarPower;
  }

  public void setTcarPower(@Nullable String tcarPower) {
    this.tcarPower = tcarPower;
  }

  public TestingResponse tcarHandl(@Nullable String tcarHandl) {
    this.tcarHandl = tcarHandl;
    return this;
  }

  /**
   * Get tcarHandl
   * @return tcarHandl
   */
  
  @JsonProperty("TcarHandl")
  public @Nullable String getTcarHandl() {
    return tcarHandl;
  }

  public void setTcarHandl(@Nullable String tcarHandl) {
    this.tcarHandl = tcarHandl;
  }

  public TestingResponse tcarAccel(@Nullable String tcarAccel) {
    this.tcarAccel = tcarAccel;
    return this;
  }

  /**
   * Get tcarAccel
   * @return tcarAccel
   */
  
  @JsonProperty("TcarAccel")
  public @Nullable String getTcarAccel() {
    return tcarAccel;
  }

  public void setTcarAccel(@Nullable String tcarAccel) {
    this.tcarAccel = tcarAccel;
  }

  public TestingResponse showComment1Popover(@Nullable PracticeResponseShowComment1Popover showComment1Popover) {
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

  public TestingResponse endOfSeason(@Nullable Integer endOfSeason) {
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

  public TestingResponse selectedStint(@Nullable Integer selectedStint) {
    this.selectedStint = selectedStint;
    return this;
  }

  /**
   * Get selectedStint
   * @return selectedStint
   */
  
  @JsonProperty("selectedStint")
  public @Nullable Integer getSelectedStint() {
    return selectedStint;
  }

  public void setSelectedStint(@Nullable Integer selectedStint) {
    this.selectedStint = selectedStint;
  }

  public TestingResponse raceInProgress(@Nullable Integer raceInProgress) {
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

  public TestingResponse showError(@Nullable Integer showError) {
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

  public TestingResponse errorMsg(@Nullable String errorMsg) {
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

  public TestingResponse disableDriveButton(@Nullable Integer disableDriveButton) {
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

  public TestingResponse fuelInvalid(@Nullable Integer fuelInvalid) {
    this.fuelInvalid = fuelInvalid;
    return this;
  }

  /**
   * Get fuelInvalid
   * @return fuelInvalid
   */
  
  @JsonProperty("fuelInvalid")
  public @Nullable Integer getFuelInvalid() {
    return fuelInvalid;
  }

  public void setFuelInvalid(@Nullable Integer fuelInvalid) {
    this.fuelInvalid = fuelInvalid;
  }

  public TestingResponse priorityInvalid(@Nullable Integer priorityInvalid) {
    this.priorityInvalid = priorityInvalid;
    return this;
  }

  /**
   * Get priorityInvalid
   * @return priorityInvalid
   */
  
  @JsonProperty("priorityInvalid")
  public @Nullable Integer getPriorityInvalid() {
    return priorityInvalid;
  }

  public void setPriorityInvalid(@Nullable Integer priorityInvalid) {
    this.priorityInvalid = priorityInvalid;
  }

  public TestingResponse stintLengthInvalid(@Nullable Integer stintLengthInvalid) {
    this.stintLengthInvalid = stintLengthInvalid;
    return this;
  }

  /**
   * Get stintLengthInvalid
   * @return stintLengthInvalid
   */
  
  @JsonProperty("stintLengthInvalid")
  public @Nullable Integer getStintLengthInvalid() {
    return stintLengthInvalid;
  }

  public void setStintLengthInvalid(@Nullable Integer stintLengthInvalid) {
    this.stintLengthInvalid = stintLengthInvalid;
  }

  public TestingResponse tyresInvalid(@Nullable Integer tyresInvalid) {
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

  public TestingResponse fWingInvalid(@Nullable Integer fWingInvalid) {
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

  public TestingResponse rWingInvalid(@Nullable Integer rWingInvalid) {
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

  public TestingResponse engInvalid(@Nullable Integer engInvalid) {
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

  public TestingResponse braInvalid(@Nullable Integer braInvalid) {
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

  public TestingResponse gearInvalid(@Nullable Integer gearInvalid) {
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

  public TestingResponse suspInvalid(@Nullable Integer suspInvalid) {
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

  public TestingResponse isSupporter(@Nullable Integer isSupporter) {
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

  public TestingResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    TestingResponse testingResponse = (TestingResponse) o;
    return Objects.equals(this.loadingDataState, testingResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, testingResponse.segmentSelected) &&
        Objects.equals(this.trackName, testingResponse.trackName) &&
        Objects.equals(this.trackNat, testingResponse.trackNat) &&
        Objects.equals(this.trackId, testingResponse.trackId) &&
        Objects.equals(this.trackImg, testingResponse.trackImg) &&
        Objects.equals(this.trackPower, testingResponse.trackPower) &&
        Objects.equals(this.trackAccel, testingResponse.trackAccel) &&
        Objects.equals(this.trackHandl, testingResponse.trackHandl) &&
        Objects.equals(this.carPower, testingResponse.carPower) &&
        Objects.equals(this.carHandl, testingResponse.carHandl) &&
        Objects.equals(this.carAccel, testingResponse.carAccel) &&
        Objects.equals(this.cash, testingResponse.cash) &&
        Objects.equals(this.lvlChassis, testingResponse.lvlChassis) &&
        Objects.equals(this.lvlBrakes, testingResponse.lvlBrakes) &&
        Objects.equals(this.lvlCooling, testingResponse.lvlCooling) &&
        Objects.equals(this.lvlElectronics, testingResponse.lvlElectronics) &&
        Objects.equals(this.lvlEngine, testingResponse.lvlEngine) &&
        Objects.equals(this.lvlFWing, testingResponse.lvlFWing) &&
        Objects.equals(this.lvlRWing, testingResponse.lvlRWing) &&
        Objects.equals(this.lvlGear, testingResponse.lvlGear) &&
        Objects.equals(this.lvlSidepods, testingResponse.lvlSidepods) &&
        Objects.equals(this.lvlSusp, testingResponse.lvlSusp) &&
        Objects.equals(this.lvlUnderbody, testingResponse.lvlUnderbody) &&
        Objects.equals(this.usaBrakes, testingResponse.usaBrakes) &&
        Objects.equals(this.usaChassis, testingResponse.usaChassis) &&
        Objects.equals(this.usaCooling, testingResponse.usaCooling) &&
        Objects.equals(this.usaElectronics, testingResponse.usaElectronics) &&
        Objects.equals(this.usaEngine, testingResponse.usaEngine) &&
        Objects.equals(this.usaFWing, testingResponse.usaFWing) &&
        Objects.equals(this.usaGear, testingResponse.usaGear) &&
        Objects.equals(this.usaRWing, testingResponse.usaRWing) &&
        Objects.equals(this.usaSidepods, testingResponse.usaSidepods) &&
        Objects.equals(this.usaSusp, testingResponse.usaSusp) &&
        Objects.equals(this.usaUnderbody, testingResponse.usaUnderbody) &&
        Objects.equals(this.setFWing, testingResponse.setFWing) &&
        Objects.equals(this.setRWing, testingResponse.setRWing) &&
        Objects.equals(this.setEngine, testingResponse.setEngine) &&
        Objects.equals(this.setBrakes, testingResponse.setBrakes) &&
        Objects.equals(this.setGear, testingResponse.setGear) &&
        Objects.equals(this.setSusp, testingResponse.setSusp) &&
        Objects.equals(this.setTyres, testingResponse.setTyres) &&
        Objects.equals(this.setFuel, testingResponse.setFuel) &&
        Objects.equals(this.setPriority, testingResponse.setPriority) &&
        Objects.equals(this.setStintLaps, testingResponse.setStintLaps) &&
        Objects.equals(this.weather, testingResponse.weather) &&
        Objects.equals(this.temp, testingResponse.temp) &&
        Objects.equals(this.hum, testingResponse.hum) &&
        Objects.equals(this.showWeatherPopover, testingResponse.showWeatherPopover) &&
        Objects.equals(this.stintsDone, testingResponse.stintsDone) &&
        Objects.equals(this.lapsLeft, testingResponse.lapsLeft) &&
        Objects.equals(this.stintsLeft, testingResponse.stintsLeft) &&
        Objects.equals(this.testPPoints, testingResponse.testPPoints) &&
        Objects.equals(this.testHPoints, testingResponse.testHPoints) &&
        Objects.equals(this.testAPoints, testingResponse.testAPoints) &&
        Objects.equals(this.rdPPoints, testingResponse.rdPPoints) &&
        Objects.equals(this.rdHPoints, testingResponse.rdHPoints) &&
        Objects.equals(this.rdAPoints, testingResponse.rdAPoints) &&
        Objects.equals(this.engPPoints, testingResponse.engPPoints) &&
        Objects.equals(this.engHPoints, testingResponse.engHPoints) &&
        Objects.equals(this.engAPoints, testingResponse.engAPoints) &&
        Objects.equals(this.tcarPower, testingResponse.tcarPower) &&
        Objects.equals(this.tcarHandl, testingResponse.tcarHandl) &&
        Objects.equals(this.tcarAccel, testingResponse.tcarAccel) &&
        Objects.equals(this.showComment1Popover, testingResponse.showComment1Popover) &&
        Objects.equals(this.endOfSeason, testingResponse.endOfSeason) &&
        Objects.equals(this.selectedStint, testingResponse.selectedStint) &&
        Objects.equals(this.raceInProgress, testingResponse.raceInProgress) &&
        Objects.equals(this.showError, testingResponse.showError) &&
        Objects.equals(this.errorMsg, testingResponse.errorMsg) &&
        Objects.equals(this.disableDriveButton, testingResponse.disableDriveButton) &&
        Objects.equals(this.fuelInvalid, testingResponse.fuelInvalid) &&
        Objects.equals(this.priorityInvalid, testingResponse.priorityInvalid) &&
        Objects.equals(this.stintLengthInvalid, testingResponse.stintLengthInvalid) &&
        Objects.equals(this.tyresInvalid, testingResponse.tyresInvalid) &&
        Objects.equals(this.fWingInvalid, testingResponse.fWingInvalid) &&
        Objects.equals(this.rWingInvalid, testingResponse.rWingInvalid) &&
        Objects.equals(this.engInvalid, testingResponse.engInvalid) &&
        Objects.equals(this.braInvalid, testingResponse.braInvalid) &&
        Objects.equals(this.gearInvalid, testingResponse.gearInvalid) &&
        Objects.equals(this.suspInvalid, testingResponse.suspInvalid) &&
        Objects.equals(this.isSupporter, testingResponse.isSupporter) &&
        Objects.equals(this.apiRequestsRemaining, testingResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, trackName, trackNat, trackId, trackImg, trackPower, trackAccel, trackHandl, carPower, carHandl, carAccel, cash, lvlChassis, lvlBrakes, lvlCooling, lvlElectronics, lvlEngine, lvlFWing, lvlRWing, lvlGear, lvlSidepods, lvlSusp, lvlUnderbody, usaBrakes, usaChassis, usaCooling, usaElectronics, usaEngine, usaFWing, usaGear, usaRWing, usaSidepods, usaSusp, usaUnderbody, setFWing, setRWing, setEngine, setBrakes, setGear, setSusp, setTyres, setFuel, setPriority, setStintLaps, weather, temp, hum, showWeatherPopover, stintsDone, lapsLeft, stintsLeft, testPPoints, testHPoints, testAPoints, rdPPoints, rdHPoints, rdAPoints, engPPoints, engHPoints, engAPoints, tcarPower, tcarHandl, tcarAccel, showComment1Popover, endOfSeason, selectedStint, raceInProgress, showError, errorMsg, disableDriveButton, fuelInvalid, priorityInvalid, stintLengthInvalid, tyresInvalid, fWingInvalid, rWingInvalid, engInvalid, braInvalid, gearInvalid, suspInvalid, isSupporter, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestingResponse {\n");
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
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
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
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEngine: ").append(toIndentedString(setEngine)).append("\n");
    sb.append("    setBrakes: ").append(toIndentedString(setBrakes)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
    sb.append("    setFuel: ").append(toIndentedString(setFuel)).append("\n");
    sb.append("    setPriority: ").append(toIndentedString(setPriority)).append("\n");
    sb.append("    setStintLaps: ").append(toIndentedString(setStintLaps)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    hum: ").append(toIndentedString(hum)).append("\n");
    sb.append("    showWeatherPopover: ").append(toIndentedString(showWeatherPopover)).append("\n");
    sb.append("    stintsDone: ").append(toIndentedString(stintsDone)).append("\n");
    sb.append("    lapsLeft: ").append(toIndentedString(lapsLeft)).append("\n");
    sb.append("    stintsLeft: ").append(toIndentedString(stintsLeft)).append("\n");
    sb.append("    testPPoints: ").append(toIndentedString(testPPoints)).append("\n");
    sb.append("    testHPoints: ").append(toIndentedString(testHPoints)).append("\n");
    sb.append("    testAPoints: ").append(toIndentedString(testAPoints)).append("\n");
    sb.append("    rdPPoints: ").append(toIndentedString(rdPPoints)).append("\n");
    sb.append("    rdHPoints: ").append(toIndentedString(rdHPoints)).append("\n");
    sb.append("    rdAPoints: ").append(toIndentedString(rdAPoints)).append("\n");
    sb.append("    engPPoints: ").append(toIndentedString(engPPoints)).append("\n");
    sb.append("    engHPoints: ").append(toIndentedString(engHPoints)).append("\n");
    sb.append("    engAPoints: ").append(toIndentedString(engAPoints)).append("\n");
    sb.append("    tcarPower: ").append(toIndentedString(tcarPower)).append("\n");
    sb.append("    tcarHandl: ").append(toIndentedString(tcarHandl)).append("\n");
    sb.append("    tcarAccel: ").append(toIndentedString(tcarAccel)).append("\n");
    sb.append("    showComment1Popover: ").append(toIndentedString(showComment1Popover)).append("\n");
    sb.append("    endOfSeason: ").append(toIndentedString(endOfSeason)).append("\n");
    sb.append("    selectedStint: ").append(toIndentedString(selectedStint)).append("\n");
    sb.append("    raceInProgress: ").append(toIndentedString(raceInProgress)).append("\n");
    sb.append("    showError: ").append(toIndentedString(showError)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    disableDriveButton: ").append(toIndentedString(disableDriveButton)).append("\n");
    sb.append("    fuelInvalid: ").append(toIndentedString(fuelInvalid)).append("\n");
    sb.append("    priorityInvalid: ").append(toIndentedString(priorityInvalid)).append("\n");
    sb.append("    stintLengthInvalid: ").append(toIndentedString(stintLengthInvalid)).append("\n");
    sb.append("    tyresInvalid: ").append(toIndentedString(tyresInvalid)).append("\n");
    sb.append("    fWingInvalid: ").append(toIndentedString(fWingInvalid)).append("\n");
    sb.append("    rWingInvalid: ").append(toIndentedString(rWingInvalid)).append("\n");
    sb.append("    engInvalid: ").append(toIndentedString(engInvalid)).append("\n");
    sb.append("    braInvalid: ").append(toIndentedString(braInvalid)).append("\n");
    sb.append("    gearInvalid: ").append(toIndentedString(gearInvalid)).append("\n");
    sb.append("    suspInvalid: ").append(toIndentedString(suspInvalid)).append("\n");
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

