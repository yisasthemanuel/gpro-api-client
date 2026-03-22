package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.CarResponseChassisOptionsInnerValue;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CarResponseChassisOptionsInner
 */

@JsonTypeName("CarResponse_chassisOptions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class CarResponseChassisOptionsInner {

  private @Nullable CarResponseChassisOptionsInnerValue value;

  private @Nullable String newLvl;

  private @Nullable String newWear;

  private @Nullable String disabled;

  private @Nullable String text;

  public CarResponseChassisOptionsInner value(@Nullable CarResponseChassisOptionsInnerValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Valid 
  @JsonProperty("value")
  public @Nullable CarResponseChassisOptionsInnerValue getValue() {
    return value;
  }

  public void setValue(@Nullable CarResponseChassisOptionsInnerValue value) {
    this.value = value;
  }

  public CarResponseChassisOptionsInner newLvl(@Nullable String newLvl) {
    this.newLvl = newLvl;
    return this;
  }

  /**
   * Get newLvl
   * @return newLvl
   */
  
  @JsonProperty("newLvl")
  public @Nullable String getNewLvl() {
    return newLvl;
  }

  public void setNewLvl(@Nullable String newLvl) {
    this.newLvl = newLvl;
  }

  public CarResponseChassisOptionsInner newWear(@Nullable String newWear) {
    this.newWear = newWear;
    return this;
  }

  /**
   * Get newWear
   * @return newWear
   */
  
  @JsonProperty("newWear")
  public @Nullable String getNewWear() {
    return newWear;
  }

  public void setNewWear(@Nullable String newWear) {
    this.newWear = newWear;
  }

  public CarResponseChassisOptionsInner disabled(@Nullable String disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   */
  
  @JsonProperty("disabled")
  public @Nullable String getDisabled() {
    return disabled;
  }

  public void setDisabled(@Nullable String disabled) {
    this.disabled = disabled;
  }

  public CarResponseChassisOptionsInner text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarResponseChassisOptionsInner carResponseChassisOptionsInner = (CarResponseChassisOptionsInner) o;
    return Objects.equals(this.value, carResponseChassisOptionsInner.value) &&
        Objects.equals(this.newLvl, carResponseChassisOptionsInner.newLvl) &&
        Objects.equals(this.newWear, carResponseChassisOptionsInner.newWear) &&
        Objects.equals(this.disabled, carResponseChassisOptionsInner.disabled) &&
        Objects.equals(this.text, carResponseChassisOptionsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, newLvl, newWear, disabled, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarResponseChassisOptionsInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    newLvl: ").append(toIndentedString(newLvl)).append("\n");
    sb.append("    newWear: ").append(toIndentedString(newWear)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

