package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.PracticeResponseLapsDoneInnerDriCommentsInner;
import org.jlobato.gpro.proxy.model.PracticeResponseLapsDoneInnerSetFWing;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TestingResponseStintsDoneInner
 */

@JsonTypeName("TestingResponse_stintsDone_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TestingResponseStintsDoneInner {

  private @Nullable Integer idx;

  private @Nullable String lapsDone;

  private @Nullable String bestLapTime;

  private @Nullable String meanLapTime;

  private @Nullable String bestLapTimeColor;

  private @Nullable String meanTimeColor;

  @Valid
  private List<@Valid PracticeResponseLapsDoneInnerDriCommentsInner> driComments = new ArrayList<>();

  private @Nullable Integer driCommentsCount;

  private @Nullable PracticeResponseLapsDoneInnerSetFWing setFWing;

  private @Nullable PracticeResponseLapsDoneInnerSetFWing setRWing;

  private @Nullable PracticeResponseLapsDoneInnerSetFWing setEngine;

  private @Nullable PracticeResponseLapsDoneInnerSetFWing setBrakes;

  private @Nullable PracticeResponseLapsDoneInnerSetFWing setGear;

  private @Nullable PracticeResponseLapsDoneInnerSetFWing setSusp;

  private @Nullable String setTyres;

  private @Nullable String setFuel;

  private @Nullable String tyreCond;

  private @Nullable String fuelLeft;

  private @Nullable String stintPriority;

  public TestingResponseStintsDoneInner idx(@Nullable Integer idx) {
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  
  @JsonProperty("idx")
  public @Nullable Integer getIdx() {
    return idx;
  }

  public void setIdx(@Nullable Integer idx) {
    this.idx = idx;
  }

  public TestingResponseStintsDoneInner lapsDone(@Nullable String lapsDone) {
    this.lapsDone = lapsDone;
    return this;
  }

  /**
   * Get lapsDone
   * @return lapsDone
   */
  
  @JsonProperty("lapsDone")
  public @Nullable String getLapsDone() {
    return lapsDone;
  }

  public void setLapsDone(@Nullable String lapsDone) {
    this.lapsDone = lapsDone;
  }

  public TestingResponseStintsDoneInner bestLapTime(@Nullable String bestLapTime) {
    this.bestLapTime = bestLapTime;
    return this;
  }

  /**
   * Get bestLapTime
   * @return bestLapTime
   */
  
  @JsonProperty("bestLapTime")
  public @Nullable String getBestLapTime() {
    return bestLapTime;
  }

  public void setBestLapTime(@Nullable String bestLapTime) {
    this.bestLapTime = bestLapTime;
  }

  public TestingResponseStintsDoneInner meanLapTime(@Nullable String meanLapTime) {
    this.meanLapTime = meanLapTime;
    return this;
  }

  /**
   * Get meanLapTime
   * @return meanLapTime
   */
  
  @JsonProperty("meanLapTime")
  public @Nullable String getMeanLapTime() {
    return meanLapTime;
  }

  public void setMeanLapTime(@Nullable String meanLapTime) {
    this.meanLapTime = meanLapTime;
  }

  public TestingResponseStintsDoneInner bestLapTimeColor(@Nullable String bestLapTimeColor) {
    this.bestLapTimeColor = bestLapTimeColor;
    return this;
  }

  /**
   * Get bestLapTimeColor
   * @return bestLapTimeColor
   */
  
  @JsonProperty("bestLapTimeColor")
  public @Nullable String getBestLapTimeColor() {
    return bestLapTimeColor;
  }

  public void setBestLapTimeColor(@Nullable String bestLapTimeColor) {
    this.bestLapTimeColor = bestLapTimeColor;
  }

  public TestingResponseStintsDoneInner meanTimeColor(@Nullable String meanTimeColor) {
    this.meanTimeColor = meanTimeColor;
    return this;
  }

  /**
   * Get meanTimeColor
   * @return meanTimeColor
   */
  
  @JsonProperty("meanTimeColor")
  public @Nullable String getMeanTimeColor() {
    return meanTimeColor;
  }

  public void setMeanTimeColor(@Nullable String meanTimeColor) {
    this.meanTimeColor = meanTimeColor;
  }

  public TestingResponseStintsDoneInner driComments(List<@Valid PracticeResponseLapsDoneInnerDriCommentsInner> driComments) {
    this.driComments = driComments;
    return this;
  }

  public TestingResponseStintsDoneInner addDriCommentsItem(PracticeResponseLapsDoneInnerDriCommentsInner driCommentsItem) {
    if (this.driComments == null) {
      this.driComments = new ArrayList<>();
    }
    this.driComments.add(driCommentsItem);
    return this;
  }

  /**
   * Get driComments
   * @return driComments
   */
  @Valid 
  @JsonProperty("driComments")
  public List<@Valid PracticeResponseLapsDoneInnerDriCommentsInner> getDriComments() {
    return driComments;
  }

  public void setDriComments(List<@Valid PracticeResponseLapsDoneInnerDriCommentsInner> driComments) {
    this.driComments = driComments;
  }

  public TestingResponseStintsDoneInner driCommentsCount(@Nullable Integer driCommentsCount) {
    this.driCommentsCount = driCommentsCount;
    return this;
  }

  /**
   * Get driCommentsCount
   * @return driCommentsCount
   */
  
  @JsonProperty("driCommentsCount")
  public @Nullable Integer getDriCommentsCount() {
    return driCommentsCount;
  }

  public void setDriCommentsCount(@Nullable Integer driCommentsCount) {
    this.driCommentsCount = driCommentsCount;
  }

  public TestingResponseStintsDoneInner setFWing(@Nullable PracticeResponseLapsDoneInnerSetFWing setFWing) {
    this.setFWing = setFWing;
    return this;
  }

  /**
   * Get setFWing
   * @return setFWing
   */
  @Valid 
  @JsonProperty("setFWing")
  public @Nullable PracticeResponseLapsDoneInnerSetFWing getSetFWing() {
    return setFWing;
  }

  public void setSetFWing(@Nullable PracticeResponseLapsDoneInnerSetFWing setFWing) {
    this.setFWing = setFWing;
  }

  public TestingResponseStintsDoneInner setRWing(@Nullable PracticeResponseLapsDoneInnerSetFWing setRWing) {
    this.setRWing = setRWing;
    return this;
  }

  /**
   * Get setRWing
   * @return setRWing
   */
  @Valid 
  @JsonProperty("setRWing")
  public @Nullable PracticeResponseLapsDoneInnerSetFWing getSetRWing() {
    return setRWing;
  }

  public void setSetRWing(@Nullable PracticeResponseLapsDoneInnerSetFWing setRWing) {
    this.setRWing = setRWing;
  }

  public TestingResponseStintsDoneInner setEngine(@Nullable PracticeResponseLapsDoneInnerSetFWing setEngine) {
    this.setEngine = setEngine;
    return this;
  }

  /**
   * Get setEngine
   * @return setEngine
   */
  @Valid 
  @JsonProperty("setEngine")
  public @Nullable PracticeResponseLapsDoneInnerSetFWing getSetEngine() {
    return setEngine;
  }

  public void setSetEngine(@Nullable PracticeResponseLapsDoneInnerSetFWing setEngine) {
    this.setEngine = setEngine;
  }

  public TestingResponseStintsDoneInner setBrakes(@Nullable PracticeResponseLapsDoneInnerSetFWing setBrakes) {
    this.setBrakes = setBrakes;
    return this;
  }

  /**
   * Get setBrakes
   * @return setBrakes
   */
  @Valid 
  @JsonProperty("setBrakes")
  public @Nullable PracticeResponseLapsDoneInnerSetFWing getSetBrakes() {
    return setBrakes;
  }

  public void setSetBrakes(@Nullable PracticeResponseLapsDoneInnerSetFWing setBrakes) {
    this.setBrakes = setBrakes;
  }

  public TestingResponseStintsDoneInner setGear(@Nullable PracticeResponseLapsDoneInnerSetFWing setGear) {
    this.setGear = setGear;
    return this;
  }

  /**
   * Get setGear
   * @return setGear
   */
  @Valid 
  @JsonProperty("setGear")
  public @Nullable PracticeResponseLapsDoneInnerSetFWing getSetGear() {
    return setGear;
  }

  public void setSetGear(@Nullable PracticeResponseLapsDoneInnerSetFWing setGear) {
    this.setGear = setGear;
  }

  public TestingResponseStintsDoneInner setSusp(@Nullable PracticeResponseLapsDoneInnerSetFWing setSusp) {
    this.setSusp = setSusp;
    return this;
  }

  /**
   * Get setSusp
   * @return setSusp
   */
  @Valid 
  @JsonProperty("setSusp")
  public @Nullable PracticeResponseLapsDoneInnerSetFWing getSetSusp() {
    return setSusp;
  }

  public void setSetSusp(@Nullable PracticeResponseLapsDoneInnerSetFWing setSusp) {
    this.setSusp = setSusp;
  }

  public TestingResponseStintsDoneInner setTyres(@Nullable String setTyres) {
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

  public TestingResponseStintsDoneInner setFuel(@Nullable String setFuel) {
    this.setFuel = setFuel;
    return this;
  }

  /**
   * Get setFuel
   * @return setFuel
   */
  
  @JsonProperty("setFuel")
  public @Nullable String getSetFuel() {
    return setFuel;
  }

  public void setSetFuel(@Nullable String setFuel) {
    this.setFuel = setFuel;
  }

  public TestingResponseStintsDoneInner tyreCond(@Nullable String tyreCond) {
    this.tyreCond = tyreCond;
    return this;
  }

  /**
   * Get tyreCond
   * @return tyreCond
   */
  
  @JsonProperty("tyreCond")
  public @Nullable String getTyreCond() {
    return tyreCond;
  }

  public void setTyreCond(@Nullable String tyreCond) {
    this.tyreCond = tyreCond;
  }

  public TestingResponseStintsDoneInner fuelLeft(@Nullable String fuelLeft) {
    this.fuelLeft = fuelLeft;
    return this;
  }

  /**
   * Get fuelLeft
   * @return fuelLeft
   */
  
  @JsonProperty("fuelLeft")
  public @Nullable String getFuelLeft() {
    return fuelLeft;
  }

  public void setFuelLeft(@Nullable String fuelLeft) {
    this.fuelLeft = fuelLeft;
  }

  public TestingResponseStintsDoneInner stintPriority(@Nullable String stintPriority) {
    this.stintPriority = stintPriority;
    return this;
  }

  /**
   * Get stintPriority
   * @return stintPriority
   */
  
  @JsonProperty("stintPriority")
  public @Nullable String getStintPriority() {
    return stintPriority;
  }

  public void setStintPriority(@Nullable String stintPriority) {
    this.stintPriority = stintPriority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestingResponseStintsDoneInner testingResponseStintsDoneInner = (TestingResponseStintsDoneInner) o;
    return Objects.equals(this.idx, testingResponseStintsDoneInner.idx) &&
        Objects.equals(this.lapsDone, testingResponseStintsDoneInner.lapsDone) &&
        Objects.equals(this.bestLapTime, testingResponseStintsDoneInner.bestLapTime) &&
        Objects.equals(this.meanLapTime, testingResponseStintsDoneInner.meanLapTime) &&
        Objects.equals(this.bestLapTimeColor, testingResponseStintsDoneInner.bestLapTimeColor) &&
        Objects.equals(this.meanTimeColor, testingResponseStintsDoneInner.meanTimeColor) &&
        Objects.equals(this.driComments, testingResponseStintsDoneInner.driComments) &&
        Objects.equals(this.driCommentsCount, testingResponseStintsDoneInner.driCommentsCount) &&
        Objects.equals(this.setFWing, testingResponseStintsDoneInner.setFWing) &&
        Objects.equals(this.setRWing, testingResponseStintsDoneInner.setRWing) &&
        Objects.equals(this.setEngine, testingResponseStintsDoneInner.setEngine) &&
        Objects.equals(this.setBrakes, testingResponseStintsDoneInner.setBrakes) &&
        Objects.equals(this.setGear, testingResponseStintsDoneInner.setGear) &&
        Objects.equals(this.setSusp, testingResponseStintsDoneInner.setSusp) &&
        Objects.equals(this.setTyres, testingResponseStintsDoneInner.setTyres) &&
        Objects.equals(this.setFuel, testingResponseStintsDoneInner.setFuel) &&
        Objects.equals(this.tyreCond, testingResponseStintsDoneInner.tyreCond) &&
        Objects.equals(this.fuelLeft, testingResponseStintsDoneInner.fuelLeft) &&
        Objects.equals(this.stintPriority, testingResponseStintsDoneInner.stintPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, lapsDone, bestLapTime, meanLapTime, bestLapTimeColor, meanTimeColor, driComments, driCommentsCount, setFWing, setRWing, setEngine, setBrakes, setGear, setSusp, setTyres, setFuel, tyreCond, fuelLeft, stintPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestingResponseStintsDoneInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    lapsDone: ").append(toIndentedString(lapsDone)).append("\n");
    sb.append("    bestLapTime: ").append(toIndentedString(bestLapTime)).append("\n");
    sb.append("    meanLapTime: ").append(toIndentedString(meanLapTime)).append("\n");
    sb.append("    bestLapTimeColor: ").append(toIndentedString(bestLapTimeColor)).append("\n");
    sb.append("    meanTimeColor: ").append(toIndentedString(meanTimeColor)).append("\n");
    sb.append("    driComments: ").append(toIndentedString(driComments)).append("\n");
    sb.append("    driCommentsCount: ").append(toIndentedString(driCommentsCount)).append("\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEngine: ").append(toIndentedString(setEngine)).append("\n");
    sb.append("    setBrakes: ").append(toIndentedString(setBrakes)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
    sb.append("    setFuel: ").append(toIndentedString(setFuel)).append("\n");
    sb.append("    tyreCond: ").append(toIndentedString(tyreCond)).append("\n");
    sb.append("    fuelLeft: ").append(toIndentedString(fuelLeft)).append("\n");
    sb.append("    stintPriority: ").append(toIndentedString(stintPriority)).append("\n");
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

