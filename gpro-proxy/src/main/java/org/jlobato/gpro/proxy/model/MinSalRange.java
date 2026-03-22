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
 * <u>Key</u><br> `'': Any`<br> `'0': '1-0.5M'`<br> `'1': '0.5M-1M'`<br> `'2': '1M-1.5M'`<br> `'3': '1.5M-2M'`<br> `'4': '2M-2.5M'`<br> `'5': '2.5M-3M'`<br> `'6': '3M-3.5M'`<br> `'7': '3.5M-4M'`<br> `'8': '4M-4.5M'`<br> `'9': '4.5M-5M'`<br> `'10': '5M-5.5M'`<br> `'11': '5.5M-6M'`<br> `'12': '6M+'`<br> 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public enum MinSalRange {
  
  EMPTY(""),
  
  _0("0"),
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _8("8"),
  
  _9("9"),
  
  _10("10"),
  
  _11("11"),
  
  _12("12");

  private final String value;

  MinSalRange(String value) {
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
  public static MinSalRange fromValue(String value) {
    for (MinSalRange b : MinSalRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

