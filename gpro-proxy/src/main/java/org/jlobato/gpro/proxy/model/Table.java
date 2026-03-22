package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Table
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public enum Table {
  
  STANDINGS("Standings"),
  
  MAN_RESULTS("ManResults"),
  
  CALENDAR("Calendar"),
  
  CUP_STANDINGS("CupStandings"),
  
  TEAMS_STANDINGS("TeamsStandings"),
  
  TEAM_CUP_STANDINGS("TeamCupStandings"),
  
  NATIONS_KNOCKOUT_CUP("NationsKnockoutCup"),
  
  STATS("Stats");

  private final String value;

  Table(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Table fromValue(String value) {
    for (Table b : Table.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

