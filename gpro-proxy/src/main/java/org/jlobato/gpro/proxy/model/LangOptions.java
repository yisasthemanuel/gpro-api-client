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
 * Gets or Sets LangOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public enum LangOptions {
  
  GB("gb"),
  
  BG("bg"),
  
  DE("de"),
  
  ES("es"),
  
  RO("ro"),
  
  IT("it"),
  
  PT("pt"),
  
  FR("fr"),
  
  PL("pl"),
  
  RU("ru"),
  
  PI("pi"),
  
  BR("br"),
  
  TR("tr"),
  
  BE("be"),
  
  FI("fi"),
  
  LT("lt"),
  
  CZ("cz"),
  
  HU("hu"),
  
  MK("mk"),
  
  NL("nl"),
  
  EE("ee"),
  
  SK("sk"),
  
  RS("rs"),
  
  AL("al"),
  
  GR("gr"),
  
  HR("hr"),
  
  MY("my"),
  
  DK("dk");

  private final String value;

  LangOptions(String value) {
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
  public static LangOptions fromValue(String value) {
    for (LangOptions b : LangOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

