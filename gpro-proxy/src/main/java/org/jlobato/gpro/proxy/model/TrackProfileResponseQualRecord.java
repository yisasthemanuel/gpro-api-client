package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TrackProfileResponseQualRecord
 */

@JsonTypeName("TrackProfileResponse_qualRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TrackProfileResponseQualRecord {

  private @Nullable String allGroupsSR;

  private @Nullable String allGroupsDate;

  private @Nullable String allGroupsCountry;

  private @Nullable String allGroupsLapTime;

  private @Nullable String allGroupsName;

  private @Nullable String masSR;

  private @Nullable String masDate;

  private @Nullable String masCountry;

  private @Nullable String masLapTime;

  private @Nullable String masName;

  private @Nullable String proSR;

  private @Nullable String proDate;

  private @Nullable String proCountry;

  private @Nullable String proLapTime;

  private @Nullable String proName;

  private @Nullable String amaSR;

  private @Nullable String amaDate;

  private @Nullable String amaCountry;

  private @Nullable String amaLapTime;

  private @Nullable String amaName;

  private @Nullable String rooSR;

  private @Nullable String rooDate;

  private @Nullable String rooCountry;

  private @Nullable String rooLapTime;

  private @Nullable String rooName;

  public TrackProfileResponseQualRecord allGroupsSR(@Nullable String allGroupsSR) {
    this.allGroupsSR = allGroupsSR;
    return this;
  }

  /**
   * Get allGroupsSR
   * @return allGroupsSR
   */
  
  @JsonProperty("allGroupsSR")
  public @Nullable String getAllGroupsSR() {
    return allGroupsSR;
  }

  public void setAllGroupsSR(@Nullable String allGroupsSR) {
    this.allGroupsSR = allGroupsSR;
  }

  public TrackProfileResponseQualRecord allGroupsDate(@Nullable String allGroupsDate) {
    this.allGroupsDate = allGroupsDate;
    return this;
  }

  /**
   * Get allGroupsDate
   * @return allGroupsDate
   */
  
  @JsonProperty("allGroupsDate")
  public @Nullable String getAllGroupsDate() {
    return allGroupsDate;
  }

  public void setAllGroupsDate(@Nullable String allGroupsDate) {
    this.allGroupsDate = allGroupsDate;
  }

  public TrackProfileResponseQualRecord allGroupsCountry(@Nullable String allGroupsCountry) {
    this.allGroupsCountry = allGroupsCountry;
    return this;
  }

  /**
   * Get allGroupsCountry
   * @return allGroupsCountry
   */
  
  @JsonProperty("allGroupsCountry")
  public @Nullable String getAllGroupsCountry() {
    return allGroupsCountry;
  }

  public void setAllGroupsCountry(@Nullable String allGroupsCountry) {
    this.allGroupsCountry = allGroupsCountry;
  }

  public TrackProfileResponseQualRecord allGroupsLapTime(@Nullable String allGroupsLapTime) {
    this.allGroupsLapTime = allGroupsLapTime;
    return this;
  }

  /**
   * Get allGroupsLapTime
   * @return allGroupsLapTime
   */
  
  @JsonProperty("allGroupsLapTime")
  public @Nullable String getAllGroupsLapTime() {
    return allGroupsLapTime;
  }

  public void setAllGroupsLapTime(@Nullable String allGroupsLapTime) {
    this.allGroupsLapTime = allGroupsLapTime;
  }

  public TrackProfileResponseQualRecord allGroupsName(@Nullable String allGroupsName) {
    this.allGroupsName = allGroupsName;
    return this;
  }

  /**
   * Get allGroupsName
   * @return allGroupsName
   */
  
  @JsonProperty("allGroupsName")
  public @Nullable String getAllGroupsName() {
    return allGroupsName;
  }

  public void setAllGroupsName(@Nullable String allGroupsName) {
    this.allGroupsName = allGroupsName;
  }

  public TrackProfileResponseQualRecord masSR(@Nullable String masSR) {
    this.masSR = masSR;
    return this;
  }

  /**
   * Get masSR
   * @return masSR
   */
  
  @JsonProperty("masSR")
  public @Nullable String getMasSR() {
    return masSR;
  }

  public void setMasSR(@Nullable String masSR) {
    this.masSR = masSR;
  }

  public TrackProfileResponseQualRecord masDate(@Nullable String masDate) {
    this.masDate = masDate;
    return this;
  }

  /**
   * Get masDate
   * @return masDate
   */
  
  @JsonProperty("masDate")
  public @Nullable String getMasDate() {
    return masDate;
  }

  public void setMasDate(@Nullable String masDate) {
    this.masDate = masDate;
  }

  public TrackProfileResponseQualRecord masCountry(@Nullable String masCountry) {
    this.masCountry = masCountry;
    return this;
  }

  /**
   * Get masCountry
   * @return masCountry
   */
  
  @JsonProperty("masCountry")
  public @Nullable String getMasCountry() {
    return masCountry;
  }

  public void setMasCountry(@Nullable String masCountry) {
    this.masCountry = masCountry;
  }

  public TrackProfileResponseQualRecord masLapTime(@Nullable String masLapTime) {
    this.masLapTime = masLapTime;
    return this;
  }

  /**
   * Get masLapTime
   * @return masLapTime
   */
  
  @JsonProperty("masLapTime")
  public @Nullable String getMasLapTime() {
    return masLapTime;
  }

  public void setMasLapTime(@Nullable String masLapTime) {
    this.masLapTime = masLapTime;
  }

  public TrackProfileResponseQualRecord masName(@Nullable String masName) {
    this.masName = masName;
    return this;
  }

  /**
   * Get masName
   * @return masName
   */
  
  @JsonProperty("masName")
  public @Nullable String getMasName() {
    return masName;
  }

  public void setMasName(@Nullable String masName) {
    this.masName = masName;
  }

  public TrackProfileResponseQualRecord proSR(@Nullable String proSR) {
    this.proSR = proSR;
    return this;
  }

  /**
   * Get proSR
   * @return proSR
   */
  
  @JsonProperty("proSR")
  public @Nullable String getProSR() {
    return proSR;
  }

  public void setProSR(@Nullable String proSR) {
    this.proSR = proSR;
  }

  public TrackProfileResponseQualRecord proDate(@Nullable String proDate) {
    this.proDate = proDate;
    return this;
  }

  /**
   * Get proDate
   * @return proDate
   */
  
  @JsonProperty("proDate")
  public @Nullable String getProDate() {
    return proDate;
  }

  public void setProDate(@Nullable String proDate) {
    this.proDate = proDate;
  }

  public TrackProfileResponseQualRecord proCountry(@Nullable String proCountry) {
    this.proCountry = proCountry;
    return this;
  }

  /**
   * Get proCountry
   * @return proCountry
   */
  
  @JsonProperty("proCountry")
  public @Nullable String getProCountry() {
    return proCountry;
  }

  public void setProCountry(@Nullable String proCountry) {
    this.proCountry = proCountry;
  }

  public TrackProfileResponseQualRecord proLapTime(@Nullable String proLapTime) {
    this.proLapTime = proLapTime;
    return this;
  }

  /**
   * Get proLapTime
   * @return proLapTime
   */
  
  @JsonProperty("proLapTime")
  public @Nullable String getProLapTime() {
    return proLapTime;
  }

  public void setProLapTime(@Nullable String proLapTime) {
    this.proLapTime = proLapTime;
  }

  public TrackProfileResponseQualRecord proName(@Nullable String proName) {
    this.proName = proName;
    return this;
  }

  /**
   * Get proName
   * @return proName
   */
  
  @JsonProperty("proName")
  public @Nullable String getProName() {
    return proName;
  }

  public void setProName(@Nullable String proName) {
    this.proName = proName;
  }

  public TrackProfileResponseQualRecord amaSR(@Nullable String amaSR) {
    this.amaSR = amaSR;
    return this;
  }

  /**
   * Get amaSR
   * @return amaSR
   */
  
  @JsonProperty("amaSR")
  public @Nullable String getAmaSR() {
    return amaSR;
  }

  public void setAmaSR(@Nullable String amaSR) {
    this.amaSR = amaSR;
  }

  public TrackProfileResponseQualRecord amaDate(@Nullable String amaDate) {
    this.amaDate = amaDate;
    return this;
  }

  /**
   * Get amaDate
   * @return amaDate
   */
  
  @JsonProperty("amaDate")
  public @Nullable String getAmaDate() {
    return amaDate;
  }

  public void setAmaDate(@Nullable String amaDate) {
    this.amaDate = amaDate;
  }

  public TrackProfileResponseQualRecord amaCountry(@Nullable String amaCountry) {
    this.amaCountry = amaCountry;
    return this;
  }

  /**
   * Get amaCountry
   * @return amaCountry
   */
  
  @JsonProperty("amaCountry")
  public @Nullable String getAmaCountry() {
    return amaCountry;
  }

  public void setAmaCountry(@Nullable String amaCountry) {
    this.amaCountry = amaCountry;
  }

  public TrackProfileResponseQualRecord amaLapTime(@Nullable String amaLapTime) {
    this.amaLapTime = amaLapTime;
    return this;
  }

  /**
   * Get amaLapTime
   * @return amaLapTime
   */
  
  @JsonProperty("amaLapTime")
  public @Nullable String getAmaLapTime() {
    return amaLapTime;
  }

  public void setAmaLapTime(@Nullable String amaLapTime) {
    this.amaLapTime = amaLapTime;
  }

  public TrackProfileResponseQualRecord amaName(@Nullable String amaName) {
    this.amaName = amaName;
    return this;
  }

  /**
   * Get amaName
   * @return amaName
   */
  
  @JsonProperty("amaName")
  public @Nullable String getAmaName() {
    return amaName;
  }

  public void setAmaName(@Nullable String amaName) {
    this.amaName = amaName;
  }

  public TrackProfileResponseQualRecord rooSR(@Nullable String rooSR) {
    this.rooSR = rooSR;
    return this;
  }

  /**
   * Get rooSR
   * @return rooSR
   */
  
  @JsonProperty("rooSR")
  public @Nullable String getRooSR() {
    return rooSR;
  }

  public void setRooSR(@Nullable String rooSR) {
    this.rooSR = rooSR;
  }

  public TrackProfileResponseQualRecord rooDate(@Nullable String rooDate) {
    this.rooDate = rooDate;
    return this;
  }

  /**
   * Get rooDate
   * @return rooDate
   */
  
  @JsonProperty("rooDate")
  public @Nullable String getRooDate() {
    return rooDate;
  }

  public void setRooDate(@Nullable String rooDate) {
    this.rooDate = rooDate;
  }

  public TrackProfileResponseQualRecord rooCountry(@Nullable String rooCountry) {
    this.rooCountry = rooCountry;
    return this;
  }

  /**
   * Get rooCountry
   * @return rooCountry
   */
  
  @JsonProperty("rooCountry")
  public @Nullable String getRooCountry() {
    return rooCountry;
  }

  public void setRooCountry(@Nullable String rooCountry) {
    this.rooCountry = rooCountry;
  }

  public TrackProfileResponseQualRecord rooLapTime(@Nullable String rooLapTime) {
    this.rooLapTime = rooLapTime;
    return this;
  }

  /**
   * Get rooLapTime
   * @return rooLapTime
   */
  
  @JsonProperty("rooLapTime")
  public @Nullable String getRooLapTime() {
    return rooLapTime;
  }

  public void setRooLapTime(@Nullable String rooLapTime) {
    this.rooLapTime = rooLapTime;
  }

  public TrackProfileResponseQualRecord rooName(@Nullable String rooName) {
    this.rooName = rooName;
    return this;
  }

  /**
   * Get rooName
   * @return rooName
   */
  
  @JsonProperty("rooName")
  public @Nullable String getRooName() {
    return rooName;
  }

  public void setRooName(@Nullable String rooName) {
    this.rooName = rooName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackProfileResponseQualRecord trackProfileResponseQualRecord = (TrackProfileResponseQualRecord) o;
    return Objects.equals(this.allGroupsSR, trackProfileResponseQualRecord.allGroupsSR) &&
        Objects.equals(this.allGroupsDate, trackProfileResponseQualRecord.allGroupsDate) &&
        Objects.equals(this.allGroupsCountry, trackProfileResponseQualRecord.allGroupsCountry) &&
        Objects.equals(this.allGroupsLapTime, trackProfileResponseQualRecord.allGroupsLapTime) &&
        Objects.equals(this.allGroupsName, trackProfileResponseQualRecord.allGroupsName) &&
        Objects.equals(this.masSR, trackProfileResponseQualRecord.masSR) &&
        Objects.equals(this.masDate, trackProfileResponseQualRecord.masDate) &&
        Objects.equals(this.masCountry, trackProfileResponseQualRecord.masCountry) &&
        Objects.equals(this.masLapTime, trackProfileResponseQualRecord.masLapTime) &&
        Objects.equals(this.masName, trackProfileResponseQualRecord.masName) &&
        Objects.equals(this.proSR, trackProfileResponseQualRecord.proSR) &&
        Objects.equals(this.proDate, trackProfileResponseQualRecord.proDate) &&
        Objects.equals(this.proCountry, trackProfileResponseQualRecord.proCountry) &&
        Objects.equals(this.proLapTime, trackProfileResponseQualRecord.proLapTime) &&
        Objects.equals(this.proName, trackProfileResponseQualRecord.proName) &&
        Objects.equals(this.amaSR, trackProfileResponseQualRecord.amaSR) &&
        Objects.equals(this.amaDate, trackProfileResponseQualRecord.amaDate) &&
        Objects.equals(this.amaCountry, trackProfileResponseQualRecord.amaCountry) &&
        Objects.equals(this.amaLapTime, trackProfileResponseQualRecord.amaLapTime) &&
        Objects.equals(this.amaName, trackProfileResponseQualRecord.amaName) &&
        Objects.equals(this.rooSR, trackProfileResponseQualRecord.rooSR) &&
        Objects.equals(this.rooDate, trackProfileResponseQualRecord.rooDate) &&
        Objects.equals(this.rooCountry, trackProfileResponseQualRecord.rooCountry) &&
        Objects.equals(this.rooLapTime, trackProfileResponseQualRecord.rooLapTime) &&
        Objects.equals(this.rooName, trackProfileResponseQualRecord.rooName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allGroupsSR, allGroupsDate, allGroupsCountry, allGroupsLapTime, allGroupsName, masSR, masDate, masCountry, masLapTime, masName, proSR, proDate, proCountry, proLapTime, proName, amaSR, amaDate, amaCountry, amaLapTime, amaName, rooSR, rooDate, rooCountry, rooLapTime, rooName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackProfileResponseQualRecord {\n");
    sb.append("    allGroupsSR: ").append(toIndentedString(allGroupsSR)).append("\n");
    sb.append("    allGroupsDate: ").append(toIndentedString(allGroupsDate)).append("\n");
    sb.append("    allGroupsCountry: ").append(toIndentedString(allGroupsCountry)).append("\n");
    sb.append("    allGroupsLapTime: ").append(toIndentedString(allGroupsLapTime)).append("\n");
    sb.append("    allGroupsName: ").append(toIndentedString(allGroupsName)).append("\n");
    sb.append("    masSR: ").append(toIndentedString(masSR)).append("\n");
    sb.append("    masDate: ").append(toIndentedString(masDate)).append("\n");
    sb.append("    masCountry: ").append(toIndentedString(masCountry)).append("\n");
    sb.append("    masLapTime: ").append(toIndentedString(masLapTime)).append("\n");
    sb.append("    masName: ").append(toIndentedString(masName)).append("\n");
    sb.append("    proSR: ").append(toIndentedString(proSR)).append("\n");
    sb.append("    proDate: ").append(toIndentedString(proDate)).append("\n");
    sb.append("    proCountry: ").append(toIndentedString(proCountry)).append("\n");
    sb.append("    proLapTime: ").append(toIndentedString(proLapTime)).append("\n");
    sb.append("    proName: ").append(toIndentedString(proName)).append("\n");
    sb.append("    amaSR: ").append(toIndentedString(amaSR)).append("\n");
    sb.append("    amaDate: ").append(toIndentedString(amaDate)).append("\n");
    sb.append("    amaCountry: ").append(toIndentedString(amaCountry)).append("\n");
    sb.append("    amaLapTime: ").append(toIndentedString(amaLapTime)).append("\n");
    sb.append("    amaName: ").append(toIndentedString(amaName)).append("\n");
    sb.append("    rooSR: ").append(toIndentedString(rooSR)).append("\n");
    sb.append("    rooDate: ").append(toIndentedString(rooDate)).append("\n");
    sb.append("    rooCountry: ").append(toIndentedString(rooCountry)).append("\n");
    sb.append("    rooLapTime: ").append(toIndentedString(rooLapTime)).append("\n");
    sb.append("    rooName: ").append(toIndentedString(rooName)).append("\n");
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

