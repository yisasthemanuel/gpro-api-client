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
 * RaceAnalysisResponseTyreSupplier
 */

@JsonTypeName("RaceAnalysisResponse_tyreSupplier")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseTyreSupplier {

  private @Nullable String name;

  private @Nullable Integer peakTemp;

  private @Nullable Integer dryPerf;

  private @Nullable Integer wetPerf;

  private @Nullable Integer durability;

  private @Nullable Integer warmup;

  public RaceAnalysisResponseTyreSupplier name(@Nullable String name) {
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

  public RaceAnalysisResponseTyreSupplier peakTemp(@Nullable Integer peakTemp) {
    this.peakTemp = peakTemp;
    return this;
  }

  /**
   * Get peakTemp
   * @return peakTemp
   */
  
  @JsonProperty("peakTemp")
  public @Nullable Integer getPeakTemp() {
    return peakTemp;
  }

  public void setPeakTemp(@Nullable Integer peakTemp) {
    this.peakTemp = peakTemp;
  }

  public RaceAnalysisResponseTyreSupplier dryPerf(@Nullable Integer dryPerf) {
    this.dryPerf = dryPerf;
    return this;
  }

  /**
   * Get dryPerf
   * @return dryPerf
   */
  
  @JsonProperty("dryPerf")
  public @Nullable Integer getDryPerf() {
    return dryPerf;
  }

  public void setDryPerf(@Nullable Integer dryPerf) {
    this.dryPerf = dryPerf;
  }

  public RaceAnalysisResponseTyreSupplier wetPerf(@Nullable Integer wetPerf) {
    this.wetPerf = wetPerf;
    return this;
  }

  /**
   * Get wetPerf
   * @return wetPerf
   */
  
  @JsonProperty("wetPerf")
  public @Nullable Integer getWetPerf() {
    return wetPerf;
  }

  public void setWetPerf(@Nullable Integer wetPerf) {
    this.wetPerf = wetPerf;
  }

  public RaceAnalysisResponseTyreSupplier durability(@Nullable Integer durability) {
    this.durability = durability;
    return this;
  }

  /**
   * Get durability
   * @return durability
   */
  
  @JsonProperty("durability")
  public @Nullable Integer getDurability() {
    return durability;
  }

  public void setDurability(@Nullable Integer durability) {
    this.durability = durability;
  }

  public RaceAnalysisResponseTyreSupplier warmup(@Nullable Integer warmup) {
    this.warmup = warmup;
    return this;
  }

  /**
   * Get warmup
   * @return warmup
   */
  
  @JsonProperty("warmup")
  public @Nullable Integer getWarmup() {
    return warmup;
  }

  public void setWarmup(@Nullable Integer warmup) {
    this.warmup = warmup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseTyreSupplier raceAnalysisResponseTyreSupplier = (RaceAnalysisResponseTyreSupplier) o;
    return Objects.equals(this.name, raceAnalysisResponseTyreSupplier.name) &&
        Objects.equals(this.peakTemp, raceAnalysisResponseTyreSupplier.peakTemp) &&
        Objects.equals(this.dryPerf, raceAnalysisResponseTyreSupplier.dryPerf) &&
        Objects.equals(this.wetPerf, raceAnalysisResponseTyreSupplier.wetPerf) &&
        Objects.equals(this.durability, raceAnalysisResponseTyreSupplier.durability) &&
        Objects.equals(this.warmup, raceAnalysisResponseTyreSupplier.warmup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, peakTemp, dryPerf, wetPerf, durability, warmup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseTyreSupplier {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    peakTemp: ").append(toIndentedString(peakTemp)).append("\n");
    sb.append("    dryPerf: ").append(toIndentedString(dryPerf)).append("\n");
    sb.append("    wetPerf: ").append(toIndentedString(wetPerf)).append("\n");
    sb.append("    durability: ").append(toIndentedString(durability)).append("\n");
    sb.append("    warmup: ").append(toIndentedString(warmup)).append("\n");
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

