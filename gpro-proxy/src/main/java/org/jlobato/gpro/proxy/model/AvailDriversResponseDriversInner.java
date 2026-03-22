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
 * AvailDriversResponseDriversInner
 */

@JsonTypeName("AvailDriversResponse_drivers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class AvailDriversResponseDriversInner {

  private @Nullable Integer idx;

  private @Nullable Integer driId;

  private @Nullable String name;

  private @Nullable String natCode;

  private @Nullable String retiring;

  private @Nullable String OA;

  private @Nullable String age;

  private @Nullable String salary;

  private @Nullable String signFee;

  private @Nullable Integer offers;

  private @Nullable Integer inShortlist;

  public AvailDriversResponseDriversInner idx(@Nullable Integer idx) {
    this.idx = idx;
    return this;
  }

  /**
   * Get idx
   * @return idx
   */
  
  @JsonProperty("idx")
  public @Nullable Integer getIdx() {
    return idx;
  }

  public void setIdx(@Nullable Integer idx) {
    this.idx = idx;
  }

  public AvailDriversResponseDriversInner driId(@Nullable Integer driId) {
    this.driId = driId;
    return this;
  }

  /**
   * Get driId
   * @return driId
   */
  
  @JsonProperty("driId")
  public @Nullable Integer getDriId() {
    return driId;
  }

  public void setDriId(@Nullable Integer driId) {
    this.driId = driId;
  }

  public AvailDriversResponseDriversInner name(@Nullable String name) {
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

  public AvailDriversResponseDriversInner natCode(@Nullable String natCode) {
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

  public AvailDriversResponseDriversInner retiring(@Nullable String retiring) {
    this.retiring = retiring;
    return this;
  }

  /**
   * Get retiring
   * @return retiring
   */
  
  @JsonProperty("retiring")
  public @Nullable String getRetiring() {
    return retiring;
  }

  public void setRetiring(@Nullable String retiring) {
    this.retiring = retiring;
  }

  public AvailDriversResponseDriversInner OA(@Nullable String OA) {
    this.OA = OA;
    return this;
  }

  /**
   * Get OA
   * @return OA
   */
  
  @JsonProperty("OA")
  public @Nullable String getOA() {
    return OA;
  }

  public void setOA(@Nullable String OA) {
    this.OA = OA;
  }

  public AvailDriversResponseDriversInner age(@Nullable String age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   */
  
  @JsonProperty("age")
  public @Nullable String getAge() {
    return age;
  }

  public void setAge(@Nullable String age) {
    this.age = age;
  }

  public AvailDriversResponseDriversInner salary(@Nullable String salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   */
  
  @JsonProperty("salary")
  public @Nullable String getSalary() {
    return salary;
  }

  public void setSalary(@Nullable String salary) {
    this.salary = salary;
  }

  public AvailDriversResponseDriversInner signFee(@Nullable String signFee) {
    this.signFee = signFee;
    return this;
  }

  /**
   * Get signFee
   * @return signFee
   */
  
  @JsonProperty("signFee")
  public @Nullable String getSignFee() {
    return signFee;
  }

  public void setSignFee(@Nullable String signFee) {
    this.signFee = signFee;
  }

  public AvailDriversResponseDriversInner offers(@Nullable Integer offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Get offers
   * @return offers
   */
  
  @JsonProperty("offers")
  public @Nullable Integer getOffers() {
    return offers;
  }

  public void setOffers(@Nullable Integer offers) {
    this.offers = offers;
  }

  public AvailDriversResponseDriversInner inShortlist(@Nullable Integer inShortlist) {
    this.inShortlist = inShortlist;
    return this;
  }

  /**
   * Get inShortlist
   * @return inShortlist
   */
  
  @JsonProperty("inShortlist")
  public @Nullable Integer getInShortlist() {
    return inShortlist;
  }

  public void setInShortlist(@Nullable Integer inShortlist) {
    this.inShortlist = inShortlist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailDriversResponseDriversInner availDriversResponseDriversInner = (AvailDriversResponseDriversInner) o;
    return Objects.equals(this.idx, availDriversResponseDriversInner.idx) &&
        Objects.equals(this.driId, availDriversResponseDriversInner.driId) &&
        Objects.equals(this.name, availDriversResponseDriversInner.name) &&
        Objects.equals(this.natCode, availDriversResponseDriversInner.natCode) &&
        Objects.equals(this.retiring, availDriversResponseDriversInner.retiring) &&
        Objects.equals(this.OA, availDriversResponseDriversInner.OA) &&
        Objects.equals(this.age, availDriversResponseDriversInner.age) &&
        Objects.equals(this.salary, availDriversResponseDriversInner.salary) &&
        Objects.equals(this.signFee, availDriversResponseDriversInner.signFee) &&
        Objects.equals(this.offers, availDriversResponseDriversInner.offers) &&
        Objects.equals(this.inShortlist, availDriversResponseDriversInner.inShortlist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, driId, name, natCode, retiring, OA, age, salary, signFee, offers, inShortlist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailDriversResponseDriversInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    driId: ").append(toIndentedString(driId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    retiring: ").append(toIndentedString(retiring)).append("\n");
    sb.append("    OA: ").append(toIndentedString(OA)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    signFee: ").append(toIndentedString(signFee)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    inShortlist: ").append(toIndentedString(inShortlist)).append("\n");
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

