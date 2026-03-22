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
 * PracticeResponseLapsDoneInner
 */

@JsonTypeName("PracticeResponse_lapsDone_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class PracticeResponseLapsDoneInner {

  private @Nullable Integer idx;

  private @Nullable String lapTime;

  private @Nullable String netTime;

  private @Nullable String misTime;

  private @Nullable String lapTimeColor;

  private @Nullable String netTimeColor;

  private @Nullable String mistakeColor;

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

  public PracticeResponseLapsDoneInner idx(@Nullable Integer idx) {
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

  public PracticeResponseLapsDoneInner lapTime(@Nullable String lapTime) {
    this.lapTime = lapTime;
    return this;
  }

  /**
   * Get lapTime
   * @return lapTime
   */
  
  @JsonProperty("lapTime")
  public @Nullable String getLapTime() {
    return lapTime;
  }

  public void setLapTime(@Nullable String lapTime) {
    this.lapTime = lapTime;
  }

  public PracticeResponseLapsDoneInner netTime(@Nullable String netTime) {
    this.netTime = netTime;
    return this;
  }

  /**
   * Get netTime
   * @return netTime
   */
  
  @JsonProperty("netTime")
  public @Nullable String getNetTime() {
    return netTime;
  }

  public void setNetTime(@Nullable String netTime) {
    this.netTime = netTime;
  }

  public PracticeResponseLapsDoneInner misTime(@Nullable String misTime) {
    this.misTime = misTime;
    return this;
  }

  /**
   * Get misTime
   * @return misTime
   */
  
  @JsonProperty("misTime")
  public @Nullable String getMisTime() {
    return misTime;
  }

  public void setMisTime(@Nullable String misTime) {
    this.misTime = misTime;
  }

  public PracticeResponseLapsDoneInner lapTimeColor(@Nullable String lapTimeColor) {
    this.lapTimeColor = lapTimeColor;
    return this;
  }

  /**
   * Get lapTimeColor
   * @return lapTimeColor
   */
  
  @JsonProperty("lapTimeColor")
  public @Nullable String getLapTimeColor() {
    return lapTimeColor;
  }

  public void setLapTimeColor(@Nullable String lapTimeColor) {
    this.lapTimeColor = lapTimeColor;
  }

  public PracticeResponseLapsDoneInner netTimeColor(@Nullable String netTimeColor) {
    this.netTimeColor = netTimeColor;
    return this;
  }

  /**
   * Get netTimeColor
   * @return netTimeColor
   */
  
  @JsonProperty("netTimeColor")
  public @Nullable String getNetTimeColor() {
    return netTimeColor;
  }

  public void setNetTimeColor(@Nullable String netTimeColor) {
    this.netTimeColor = netTimeColor;
  }

  public PracticeResponseLapsDoneInner mistakeColor(@Nullable String mistakeColor) {
    this.mistakeColor = mistakeColor;
    return this;
  }

  /**
   * Get mistakeColor
   * @return mistakeColor
   */
  
  @JsonProperty("mistakeColor")
  public @Nullable String getMistakeColor() {
    return mistakeColor;
  }

  public void setMistakeColor(@Nullable String mistakeColor) {
    this.mistakeColor = mistakeColor;
  }

  public PracticeResponseLapsDoneInner driComments(List<@Valid PracticeResponseLapsDoneInnerDriCommentsInner> driComments) {
    this.driComments = driComments;
    return this;
  }

  public PracticeResponseLapsDoneInner addDriCommentsItem(PracticeResponseLapsDoneInnerDriCommentsInner driCommentsItem) {
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

  public PracticeResponseLapsDoneInner driCommentsCount(@Nullable Integer driCommentsCount) {
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

  public PracticeResponseLapsDoneInner setFWing(@Nullable PracticeResponseLapsDoneInnerSetFWing setFWing) {
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

  public PracticeResponseLapsDoneInner setRWing(@Nullable PracticeResponseLapsDoneInnerSetFWing setRWing) {
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

  public PracticeResponseLapsDoneInner setEngine(@Nullable PracticeResponseLapsDoneInnerSetFWing setEngine) {
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

  public PracticeResponseLapsDoneInner setBrakes(@Nullable PracticeResponseLapsDoneInnerSetFWing setBrakes) {
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

  public PracticeResponseLapsDoneInner setGear(@Nullable PracticeResponseLapsDoneInnerSetFWing setGear) {
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

  public PracticeResponseLapsDoneInner setSusp(@Nullable PracticeResponseLapsDoneInnerSetFWing setSusp) {
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

  public PracticeResponseLapsDoneInner setTyres(@Nullable String setTyres) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PracticeResponseLapsDoneInner practiceResponseLapsDoneInner = (PracticeResponseLapsDoneInner) o;
    return Objects.equals(this.idx, practiceResponseLapsDoneInner.idx) &&
        Objects.equals(this.lapTime, practiceResponseLapsDoneInner.lapTime) &&
        Objects.equals(this.netTime, practiceResponseLapsDoneInner.netTime) &&
        Objects.equals(this.misTime, practiceResponseLapsDoneInner.misTime) &&
        Objects.equals(this.lapTimeColor, practiceResponseLapsDoneInner.lapTimeColor) &&
        Objects.equals(this.netTimeColor, practiceResponseLapsDoneInner.netTimeColor) &&
        Objects.equals(this.mistakeColor, practiceResponseLapsDoneInner.mistakeColor) &&
        Objects.equals(this.driComments, practiceResponseLapsDoneInner.driComments) &&
        Objects.equals(this.driCommentsCount, practiceResponseLapsDoneInner.driCommentsCount) &&
        Objects.equals(this.setFWing, practiceResponseLapsDoneInner.setFWing) &&
        Objects.equals(this.setRWing, practiceResponseLapsDoneInner.setRWing) &&
        Objects.equals(this.setEngine, practiceResponseLapsDoneInner.setEngine) &&
        Objects.equals(this.setBrakes, practiceResponseLapsDoneInner.setBrakes) &&
        Objects.equals(this.setGear, practiceResponseLapsDoneInner.setGear) &&
        Objects.equals(this.setSusp, practiceResponseLapsDoneInner.setSusp) &&
        Objects.equals(this.setTyres, practiceResponseLapsDoneInner.setTyres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, lapTime, netTime, misTime, lapTimeColor, netTimeColor, mistakeColor, driComments, driCommentsCount, setFWing, setRWing, setEngine, setBrakes, setGear, setSusp, setTyres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PracticeResponseLapsDoneInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    lapTime: ").append(toIndentedString(lapTime)).append("\n");
    sb.append("    netTime: ").append(toIndentedString(netTime)).append("\n");
    sb.append("    misTime: ").append(toIndentedString(misTime)).append("\n");
    sb.append("    lapTimeColor: ").append(toIndentedString(lapTimeColor)).append("\n");
    sb.append("    netTimeColor: ").append(toIndentedString(netTimeColor)).append("\n");
    sb.append("    mistakeColor: ").append(toIndentedString(mistakeColor)).append("\n");
    sb.append("    driComments: ").append(toIndentedString(driComments)).append("\n");
    sb.append("    driCommentsCount: ").append(toIndentedString(driCommentsCount)).append("\n");
    sb.append("    setFWing: ").append(toIndentedString(setFWing)).append("\n");
    sb.append("    setRWing: ").append(toIndentedString(setRWing)).append("\n");
    sb.append("    setEngine: ").append(toIndentedString(setEngine)).append("\n");
    sb.append("    setBrakes: ").append(toIndentedString(setBrakes)).append("\n");
    sb.append("    setGear: ").append(toIndentedString(setGear)).append("\n");
    sb.append("    setSusp: ").append(toIndentedString(setSusp)).append("\n");
    sb.append("    setTyres: ").append(toIndentedString(setTyres)).append("\n");
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

