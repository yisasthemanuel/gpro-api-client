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
 * Gets or Sets SortTD
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public enum SortTD {
  
  OVERALL("Overall"),
  
  LEADERSHIP("Leadership"),
  
  MECHANICS("Mechanics"),
  
  ELECTRONICS("Electronics"),
  
  AERODYNAMICS("Aerodynamics"),
  
  EXP("Exp"),
  
  PIT_STOP("PitStop"),
  
  MOTIVATION("Motivation"),
  
  AGE("Age"),
  
  SALARY("Salary"),
  
  SIGN_FEE("SignFee");

  private final String value;

  SortTD(String value) {
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
  public static SortTD fromValue(String value) {
    for (SortTD b : SortTD.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

