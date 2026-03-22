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
 * LastTransfersResponseDriverTransfersInner
 */

@JsonTypeName("LastTransfersResponse_driverTransfers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class LastTransfersResponseDriverTransfersInner {

  private @Nullable String idx;

  private @Nullable String name;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable String champs;

  private @Nullable String groupId;

  private @Nullable String groupIdShort;

  private @Nullable String groupOrderId;

  private @Nullable String staffId;

  private @Nullable String staffName;

  private @Nullable String staffColor;

  private @Nullable String races;

  private @Nullable String salary;

  public LastTransfersResponseDriverTransfersInner idx(@Nullable String idx) {
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  
  @JsonProperty("idx")
  public @Nullable String getIdx() {
    return idx;
  }

  public void setIdx(@Nullable String idx) {
    this.idx = idx;
  }

  public LastTransfersResponseDriverTransfersInner name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public LastTransfersResponseDriverTransfersInner natCode(@Nullable String natCode) {
    this.natCode = natCode;
    return this;
  }

  /**
   * Get natCode
   * @return natCode
   */
  
  @JsonProperty("natCode")
  public @Nullable String getNatCode() {
    return natCode;
  }

  public void setNatCode(@Nullable String natCode) {
    this.natCode = natCode;
  }

  public LastTransfersResponseDriverTransfersInner IDM(@Nullable Integer IDM) {
    this.IDM = IDM;
    return this;
  }

  /**
   * Get IDM
   * @return IDM
   */
  
  @JsonProperty("IDM")
  public @Nullable Integer getIDM() {
    return IDM;
  }

  public void setIDM(@Nullable Integer IDM) {
    this.IDM = IDM;
  }

  public LastTransfersResponseDriverTransfersInner champs(@Nullable String champs) {
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

  public LastTransfersResponseDriverTransfersInner groupId(@Nullable String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   */
  
  @JsonProperty("groupId")
  public @Nullable String getGroupId() {
    return groupId;
  }

  public void setGroupId(@Nullable String groupId) {
    this.groupId = groupId;
  }

  public LastTransfersResponseDriverTransfersInner groupIdShort(@Nullable String groupIdShort) {
    this.groupIdShort = groupIdShort;
    return this;
  }

  /**
   * Get groupIdShort
   * @return groupIdShort
   */
  
  @JsonProperty("groupIdShort")
  public @Nullable String getGroupIdShort() {
    return groupIdShort;
  }

  public void setGroupIdShort(@Nullable String groupIdShort) {
    this.groupIdShort = groupIdShort;
  }

  public LastTransfersResponseDriverTransfersInner groupOrderId(@Nullable String groupOrderId) {
    this.groupOrderId = groupOrderId;
    return this;
  }

  /**
   * Get groupOrderId
   * @return groupOrderId
   */
  
  @JsonProperty("groupOrderId")
  public @Nullable String getGroupOrderId() {
    return groupOrderId;
  }

  public void setGroupOrderId(@Nullable String groupOrderId) {
    this.groupOrderId = groupOrderId;
  }

  public LastTransfersResponseDriverTransfersInner staffId(@Nullable String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
   */
  
  @JsonProperty("staffId")
  public @Nullable String getStaffId() {
    return staffId;
  }

  public void setStaffId(@Nullable String staffId) {
    this.staffId = staffId;
  }

  public LastTransfersResponseDriverTransfersInner staffName(@Nullable String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
   */
  
  @JsonProperty("staffName")
  public @Nullable String getStaffName() {
    return staffName;
  }

  public void setStaffName(@Nullable String staffName) {
    this.staffName = staffName;
  }

  public LastTransfersResponseDriverTransfersInner staffColor(@Nullable String staffColor) {
    this.staffColor = staffColor;
    return this;
  }

  /**
   * Get staffColor
   * @return staffColor
   */
  
  @JsonProperty("staffColor")
  public @Nullable String getStaffColor() {
    return staffColor;
  }

  public void setStaffColor(@Nullable String staffColor) {
    this.staffColor = staffColor;
  }

  public LastTransfersResponseDriverTransfersInner races(@Nullable String races) {
    this.races = races;
    return this;
  }

  /**
   * Get races
   * @return races
   */
  
  @JsonProperty("races")
  public @Nullable String getRaces() {
    return races;
  }

  public void setRaces(@Nullable String races) {
    this.races = races;
  }

  public LastTransfersResponseDriverTransfersInner salary(@Nullable String salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   */
  
  @JsonProperty("salary")
  public @Nullable String getSalary() {
    return salary;
  }

  public void setSalary(@Nullable String salary) {
    this.salary = salary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastTransfersResponseDriverTransfersInner lastTransfersResponseDriverTransfersInner = (LastTransfersResponseDriverTransfersInner) o;
    return Objects.equals(this.idx, lastTransfersResponseDriverTransfersInner.idx) &&
        Objects.equals(this.name, lastTransfersResponseDriverTransfersInner.name) &&
        Objects.equals(this.natCode, lastTransfersResponseDriverTransfersInner.natCode) &&
        Objects.equals(this.IDM, lastTransfersResponseDriverTransfersInner.IDM) &&
        Objects.equals(this.champs, lastTransfersResponseDriverTransfersInner.champs) &&
        Objects.equals(this.groupId, lastTransfersResponseDriverTransfersInner.groupId) &&
        Objects.equals(this.groupIdShort, lastTransfersResponseDriverTransfersInner.groupIdShort) &&
        Objects.equals(this.groupOrderId, lastTransfersResponseDriverTransfersInner.groupOrderId) &&
        Objects.equals(this.staffId, lastTransfersResponseDriverTransfersInner.staffId) &&
        Objects.equals(this.staffName, lastTransfersResponseDriverTransfersInner.staffName) &&
        Objects.equals(this.staffColor, lastTransfersResponseDriverTransfersInner.staffColor) &&
        Objects.equals(this.races, lastTransfersResponseDriverTransfersInner.races) &&
        Objects.equals(this.salary, lastTransfersResponseDriverTransfersInner.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, name, natCode, IDM, champs, groupId, groupIdShort, groupOrderId, staffId, staffName, staffColor, races, salary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastTransfersResponseDriverTransfersInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupIdShort: ").append(toIndentedString(groupIdShort)).append("\n");
    sb.append("    groupOrderId: ").append(toIndentedString(groupOrderId)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffColor: ").append(toIndentedString(staffColor)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
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

