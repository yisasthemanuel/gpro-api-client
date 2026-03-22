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
 * ViewStaffResponseManagersInner
 */

@JsonTypeName("ViewStaffResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class ViewStaffResponseManagersInner {

  private @Nullable String name;

  private @Nullable String pos;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable Integer driId;

  private @Nullable String driName;

  private @Nullable String driRetires;

  private @Nullable String driOA;

  private @Nullable String driSal;

  private @Nullable String driRaces;

  private @Nullable Integer favTrackNextRace;

  private @Nullable Integer tdId;

  private @Nullable String tdName;

  private @Nullable String tdRetires;

  private @Nullable String tdOA;

  private @Nullable String tdSal;

  private @Nullable String tdRaces;

  private @Nullable String champs;

  private @Nullable String staffOA;

  public ViewStaffResponseManagersInner name(@Nullable String name) {
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

  public ViewStaffResponseManagersInner pos(@Nullable String pos) {
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

  public ViewStaffResponseManagersInner natCode(@Nullable String natCode) {
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

  public ViewStaffResponseManagersInner IDM(@Nullable Integer IDM) {
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

  public ViewStaffResponseManagersInner driId(@Nullable Integer driId) {
    this.driId = driId;
    return this;
  }

  /**
   * Get driId
   * @return driId
   */
  
  @JsonProperty("driId")
  public @Nullable Integer getDriId() {
    return driId;
  }

  public void setDriId(@Nullable Integer driId) {
    this.driId = driId;
  }

  public ViewStaffResponseManagersInner driName(@Nullable String driName) {
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

  public ViewStaffResponseManagersInner driRetires(@Nullable String driRetires) {
    this.driRetires = driRetires;
    return this;
  }

  /**
   * Get driRetires
   * @return driRetires
   */
  
  @JsonProperty("driRetires")
  public @Nullable String getDriRetires() {
    return driRetires;
  }

  public void setDriRetires(@Nullable String driRetires) {
    this.driRetires = driRetires;
  }

  public ViewStaffResponseManagersInner driOA(@Nullable String driOA) {
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

  public ViewStaffResponseManagersInner driSal(@Nullable String driSal) {
    this.driSal = driSal;
    return this;
  }

  /**
   * Get driSal
   * @return driSal
   */
  
  @JsonProperty("driSal")
  public @Nullable String getDriSal() {
    return driSal;
  }

  public void setDriSal(@Nullable String driSal) {
    this.driSal = driSal;
  }

  public ViewStaffResponseManagersInner driRaces(@Nullable String driRaces) {
    this.driRaces = driRaces;
    return this;
  }

  /**
   * Get driRaces
   * @return driRaces
   */
  
  @JsonProperty("driRaces")
  public @Nullable String getDriRaces() {
    return driRaces;
  }

  public void setDriRaces(@Nullable String driRaces) {
    this.driRaces = driRaces;
  }

  public ViewStaffResponseManagersInner favTrackNextRace(@Nullable Integer favTrackNextRace) {
    this.favTrackNextRace = favTrackNextRace;
    return this;
  }

  /**
   * Get favTrackNextRace
   * @return favTrackNextRace
   */
  
  @JsonProperty("favTrackNextRace")
  public @Nullable Integer getFavTrackNextRace() {
    return favTrackNextRace;
  }

  public void setFavTrackNextRace(@Nullable Integer favTrackNextRace) {
    this.favTrackNextRace = favTrackNextRace;
  }

  public ViewStaffResponseManagersInner tdId(@Nullable Integer tdId) {
    this.tdId = tdId;
    return this;
  }

  /**
   * Get tdId
   * @return tdId
   */
  
  @JsonProperty("tdId")
  public @Nullable Integer getTdId() {
    return tdId;
  }

  public void setTdId(@Nullable Integer tdId) {
    this.tdId = tdId;
  }

  public ViewStaffResponseManagersInner tdName(@Nullable String tdName) {
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

  public ViewStaffResponseManagersInner tdRetires(@Nullable String tdRetires) {
    this.tdRetires = tdRetires;
    return this;
  }

  /**
   * Get tdRetires
   * @return tdRetires
   */
  
  @JsonProperty("tdRetires")
  public @Nullable String getTdRetires() {
    return tdRetires;
  }

  public void setTdRetires(@Nullable String tdRetires) {
    this.tdRetires = tdRetires;
  }

  public ViewStaffResponseManagersInner tdOA(@Nullable String tdOA) {
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

  public ViewStaffResponseManagersInner tdSal(@Nullable String tdSal) {
    this.tdSal = tdSal;
    return this;
  }

  /**
   * Get tdSal
   * @return tdSal
   */
  
  @JsonProperty("tdSal")
  public @Nullable String getTdSal() {
    return tdSal;
  }

  public void setTdSal(@Nullable String tdSal) {
    this.tdSal = tdSal;
  }

  public ViewStaffResponseManagersInner tdRaces(@Nullable String tdRaces) {
    this.tdRaces = tdRaces;
    return this;
  }

  /**
   * Get tdRaces
   * @return tdRaces
   */
  
  @JsonProperty("tdRaces")
  public @Nullable String getTdRaces() {
    return tdRaces;
  }

  public void setTdRaces(@Nullable String tdRaces) {
    this.tdRaces = tdRaces;
  }

  public ViewStaffResponseManagersInner champs(@Nullable String champs) {
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

  public ViewStaffResponseManagersInner staffOA(@Nullable String staffOA) {
    this.staffOA = staffOA;
    return this;
  }

  /**
   * Get staffOA
   * @return staffOA
   */
  
  @JsonProperty("staffOA")
  public @Nullable String getStaffOA() {
    return staffOA;
  }

  public void setStaffOA(@Nullable String staffOA) {
    this.staffOA = staffOA;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewStaffResponseManagersInner viewStaffResponseManagersInner = (ViewStaffResponseManagersInner) o;
    return Objects.equals(this.name, viewStaffResponseManagersInner.name) &&
        Objects.equals(this.pos, viewStaffResponseManagersInner.pos) &&
        Objects.equals(this.natCode, viewStaffResponseManagersInner.natCode) &&
        Objects.equals(this.IDM, viewStaffResponseManagersInner.IDM) &&
        Objects.equals(this.driId, viewStaffResponseManagersInner.driId) &&
        Objects.equals(this.driName, viewStaffResponseManagersInner.driName) &&
        Objects.equals(this.driRetires, viewStaffResponseManagersInner.driRetires) &&
        Objects.equals(this.driOA, viewStaffResponseManagersInner.driOA) &&
        Objects.equals(this.driSal, viewStaffResponseManagersInner.driSal) &&
        Objects.equals(this.driRaces, viewStaffResponseManagersInner.driRaces) &&
        Objects.equals(this.favTrackNextRace, viewStaffResponseManagersInner.favTrackNextRace) &&
        Objects.equals(this.tdId, viewStaffResponseManagersInner.tdId) &&
        Objects.equals(this.tdName, viewStaffResponseManagersInner.tdName) &&
        Objects.equals(this.tdRetires, viewStaffResponseManagersInner.tdRetires) &&
        Objects.equals(this.tdOA, viewStaffResponseManagersInner.tdOA) &&
        Objects.equals(this.tdSal, viewStaffResponseManagersInner.tdSal) &&
        Objects.equals(this.tdRaces, viewStaffResponseManagersInner.tdRaces) &&
        Objects.equals(this.champs, viewStaffResponseManagersInner.champs) &&
        Objects.equals(this.staffOA, viewStaffResponseManagersInner.staffOA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pos, natCode, IDM, driId, driName, driRetires, driOA, driSal, driRaces, favTrackNextRace, tdId, tdName, tdRetires, tdOA, tdSal, tdRaces, champs, staffOA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewStaffResponseManagersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    driId: ").append(toIndentedString(driId)).append("\n");
    sb.append("    driName: ").append(toIndentedString(driName)).append("\n");
    sb.append("    driRetires: ").append(toIndentedString(driRetires)).append("\n");
    sb.append("    driOA: ").append(toIndentedString(driOA)).append("\n");
    sb.append("    driSal: ").append(toIndentedString(driSal)).append("\n");
    sb.append("    driRaces: ").append(toIndentedString(driRaces)).append("\n");
    sb.append("    favTrackNextRace: ").append(toIndentedString(favTrackNextRace)).append("\n");
    sb.append("    tdId: ").append(toIndentedString(tdId)).append("\n");
    sb.append("    tdName: ").append(toIndentedString(tdName)).append("\n");
    sb.append("    tdRetires: ").append(toIndentedString(tdRetires)).append("\n");
    sb.append("    tdOA: ").append(toIndentedString(tdOA)).append("\n");
    sb.append("    tdSal: ").append(toIndentedString(tdSal)).append("\n");
    sb.append("    tdRaces: ").append(toIndentedString(tdRaces)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    staffOA: ").append(toIndentedString(staffOA)).append("\n");
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

