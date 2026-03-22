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
 * Gets or Sets SortDriver
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public enum SortDriver {
  
  OVERALL("Overall"),
  
  CON("Con"),
  
  TAL("Tal"),
  
  AGGRESIVEN("Aggresiven"),
  
  EXP("Exp"),
  
  TECH_INSIGHT("TechInsight"),
  
  STAMINA("Stamina"),
  
  CHARISMA("Charisma"),
  
  MOTIVATION("Motivation"),
  
  REPUTATION("Reputation"),
  
  WEIGHT("Weight"),
  
  AGE("Age"),
  
  SAL("Sal"),
  
  SIGN_FEE("SignFee");

  private final String value;

  SortDriver(String value) {
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
  public static SortDriver fromValue(String value) {
    for (SortDriver b : SortDriver.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

