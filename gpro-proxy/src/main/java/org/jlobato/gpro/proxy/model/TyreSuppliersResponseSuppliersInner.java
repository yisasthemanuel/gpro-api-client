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
 * TyreSuppliersResponseSuppliersInner
 */

@JsonTypeName("TyreSuppliersResponse_suppliers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TyreSuppliersResponseSuppliersInner {

  private @Nullable Integer id;

  private @Nullable String name;

  private @Nullable String logo;

  private @Nullable Integer cost;

  private @Nullable Integer peakTemperature;

  private @Nullable Integer dryPerformance;

  private @Nullable Integer rainPerformance;

  private @Nullable Integer durability;

  private @Nullable Integer warmupDistance;

  public TyreSuppliersResponseSuppliersInner id(@Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("id")
  public @Nullable Integer getId() {
    return id;
  }

  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  public TyreSuppliersResponseSuppliersInner name(@Nullable String name) {
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

  public TyreSuppliersResponseSuppliersInner logo(@Nullable String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  
  @JsonProperty("logo")
  public @Nullable String getLogo() {
    return logo;
  }

  public void setLogo(@Nullable String logo) {
    this.logo = logo;
  }

  public TyreSuppliersResponseSuppliersInner cost(@Nullable Integer cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
   */
  
  @JsonProperty("cost")
  public @Nullable Integer getCost() {
    return cost;
  }

  public void setCost(@Nullable Integer cost) {
    this.cost = cost;
  }

  public TyreSuppliersResponseSuppliersInner peakTemperature(@Nullable Integer peakTemperature) {
    this.peakTemperature = peakTemperature;
    return this;
  }

  /**
   * Get peakTemperature
   * @return peakTemperature
   */
  
  @JsonProperty("peakTemperature")
  public @Nullable Integer getPeakTemperature() {
    return peakTemperature;
  }

  public void setPeakTemperature(@Nullable Integer peakTemperature) {
    this.peakTemperature = peakTemperature;
  }

  public TyreSuppliersResponseSuppliersInner dryPerformance(@Nullable Integer dryPerformance) {
    this.dryPerformance = dryPerformance;
    return this;
  }

  /**
   * Get dryPerformance
   * @return dryPerformance
   */
  
  @JsonProperty("dryPerformance")
  public @Nullable Integer getDryPerformance() {
    return dryPerformance;
  }

  public void setDryPerformance(@Nullable Integer dryPerformance) {
    this.dryPerformance = dryPerformance;
  }

  public TyreSuppliersResponseSuppliersInner rainPerformance(@Nullable Integer rainPerformance) {
    this.rainPerformance = rainPerformance;
    return this;
  }

  /**
   * Get rainPerformance
   * @return rainPerformance
   */
  
  @JsonProperty("rainPerformance")
  public @Nullable Integer getRainPerformance() {
    return rainPerformance;
  }

  public void setRainPerformance(@Nullable Integer rainPerformance) {
    this.rainPerformance = rainPerformance;
  }

  public TyreSuppliersResponseSuppliersInner durability(@Nullable Integer durability) {
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

  public TyreSuppliersResponseSuppliersInner warmupDistance(@Nullable Integer warmupDistance) {
    this.warmupDistance = warmupDistance;
    return this;
  }

  /**
   * Get warmupDistance
   * @return warmupDistance
   */
  
  @JsonProperty("warmupDistance")
  public @Nullable Integer getWarmupDistance() {
    return warmupDistance;
  }

  public void setWarmupDistance(@Nullable Integer warmupDistance) {
    this.warmupDistance = warmupDistance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TyreSuppliersResponseSuppliersInner tyreSuppliersResponseSuppliersInner = (TyreSuppliersResponseSuppliersInner) o;
    return Objects.equals(this.id, tyreSuppliersResponseSuppliersInner.id) &&
        Objects.equals(this.name, tyreSuppliersResponseSuppliersInner.name) &&
        Objects.equals(this.logo, tyreSuppliersResponseSuppliersInner.logo) &&
        Objects.equals(this.cost, tyreSuppliersResponseSuppliersInner.cost) &&
        Objects.equals(this.peakTemperature, tyreSuppliersResponseSuppliersInner.peakTemperature) &&
        Objects.equals(this.dryPerformance, tyreSuppliersResponseSuppliersInner.dryPerformance) &&
        Objects.equals(this.rainPerformance, tyreSuppliersResponseSuppliersInner.rainPerformance) &&
        Objects.equals(this.durability, tyreSuppliersResponseSuppliersInner.durability) &&
        Objects.equals(this.warmupDistance, tyreSuppliersResponseSuppliersInner.warmupDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, logo, cost, peakTemperature, dryPerformance, rainPerformance, durability, warmupDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TyreSuppliersResponseSuppliersInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    peakTemperature: ").append(toIndentedString(peakTemperature)).append("\n");
    sb.append("    dryPerformance: ").append(toIndentedString(dryPerformance)).append("\n");
    sb.append("    rainPerformance: ").append(toIndentedString(rainPerformance)).append("\n");
    sb.append("    durability: ").append(toIndentedString(durability)).append("\n");
    sb.append("    warmupDistance: ").append(toIndentedString(warmupDistance)).append("\n");
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

