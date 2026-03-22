package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.History500OBRResponseManagersInnerManager;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * History500OBRResponseManagersInner
 */

@JsonTypeName("History500OBRResponse_managers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class History500OBRResponseManagersInner {

  private @Nullable String pos;

  private @Nullable String natCode;

  private @Nullable History500OBRResponseManagersInnerManager manager;

  private @Nullable String group;

  private @Nullable String groupShort;

  private @Nullable String tyres;

  private @Nullable String seasonTotalTime;

  public History500OBRResponseManagersInner pos(@Nullable String pos) {
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

  public History500OBRResponseManagersInner natCode(@Nullable String natCode) {
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

  public History500OBRResponseManagersInner manager(@Nullable History500OBRResponseManagersInnerManager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   */
  @Valid 
  @JsonProperty("manager")
  public @Nullable History500OBRResponseManagersInnerManager getManager() {
    return manager;
  }

  public void setManager(@Nullable History500OBRResponseManagersInnerManager manager) {
    this.manager = manager;
  }

  public History500OBRResponseManagersInner group(@Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  
  @JsonProperty("group")
  public @Nullable String getGroup() {
    return group;
  }

  public void setGroup(@Nullable String group) {
    this.group = group;
  }

  public History500OBRResponseManagersInner groupShort(@Nullable String groupShort) {
    this.groupShort = groupShort;
    return this;
  }

  /**
   * Get groupShort
   * @return groupShort
   */
  
  @JsonProperty("groupShort")
  public @Nullable String getGroupShort() {
    return groupShort;
  }

  public void setGroupShort(@Nullable String groupShort) {
    this.groupShort = groupShort;
  }

  public History500OBRResponseManagersInner tyres(@Nullable String tyres) {
    this.tyres = tyres;
    return this;
  }

  /**
   * Get tyres
   * @return tyres
   */
  
  @JsonProperty("tyres")
  public @Nullable String getTyres() {
    return tyres;
  }

  public void setTyres(@Nullable String tyres) {
    this.tyres = tyres;
  }

  public History500OBRResponseManagersInner seasonTotalTime(@Nullable String seasonTotalTime) {
    this.seasonTotalTime = seasonTotalTime;
    return this;
  }

  /**
   * Get seasonTotalTime
   * @return seasonTotalTime
   */
  
  @JsonProperty("seasonTotalTime")
  public @Nullable String getSeasonTotalTime() {
    return seasonTotalTime;
  }

  public void setSeasonTotalTime(@Nullable String seasonTotalTime) {
    this.seasonTotalTime = seasonTotalTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History500OBRResponseManagersInner history500OBRResponseManagersInner = (History500OBRResponseManagersInner) o;
    return Objects.equals(this.pos, history500OBRResponseManagersInner.pos) &&
        Objects.equals(this.natCode, history500OBRResponseManagersInner.natCode) &&
        Objects.equals(this.manager, history500OBRResponseManagersInner.manager) &&
        Objects.equals(this.group, history500OBRResponseManagersInner.group) &&
        Objects.equals(this.groupShort, history500OBRResponseManagersInner.groupShort) &&
        Objects.equals(this.tyres, history500OBRResponseManagersInner.tyres) &&
        Objects.equals(this.seasonTotalTime, history500OBRResponseManagersInner.seasonTotalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, natCode, manager, group, groupShort, tyres, seasonTotalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History500OBRResponseManagersInner {\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupShort: ").append(toIndentedString(groupShort)).append("\n");
    sb.append("    tyres: ").append(toIndentedString(tyres)).append("\n");
    sb.append("    seasonTotalTime: ").append(toIndentedString(seasonTotalTime)).append("\n");
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

