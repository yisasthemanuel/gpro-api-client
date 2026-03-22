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
 * HistoryCalendarResponseManagersInnerWinner
 */

@JsonTypeName("HistoryCalendarResponse_managers_inner_winner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryCalendarResponseManagersInnerWinner {

  private @Nullable String name;

  private @Nullable String natCode;

  private @Nullable Integer IDM;

  private @Nullable String champs;

  public HistoryCalendarResponseManagersInnerWinner name(@Nullable String name) {
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

  public HistoryCalendarResponseManagersInnerWinner natCode(@Nullable String natCode) {
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

  public HistoryCalendarResponseManagersInnerWinner IDM(@Nullable Integer IDM) {
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

  public HistoryCalendarResponseManagersInnerWinner champs(@Nullable String champs) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryCalendarResponseManagersInnerWinner historyCalendarResponseManagersInnerWinner = (HistoryCalendarResponseManagersInnerWinner) o;
    return Objects.equals(this.name, historyCalendarResponseManagersInnerWinner.name) &&
        Objects.equals(this.natCode, historyCalendarResponseManagersInnerWinner.natCode) &&
        Objects.equals(this.IDM, historyCalendarResponseManagersInnerWinner.IDM) &&
        Objects.equals(this.champs, historyCalendarResponseManagersInnerWinner.champs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, natCode, IDM, champs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryCalendarResponseManagersInnerWinner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
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

