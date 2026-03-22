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
 * AvailTDsResponseTdsInner
 */

@JsonTypeName("AvailTDsResponse_tds_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class AvailTDsResponseTdsInner {

  private @Nullable Integer idx;

  private @Nullable Integer tdId;

  private @Nullable String name;

  private @Nullable String natCode;

  private @Nullable String retiring;

  private @Nullable String OA;

  private @Nullable String age;

  private @Nullable String salary;

  private @Nullable String signFee;

  private @Nullable Integer offers;

  private @Nullable Integer inShortlist;

  public AvailTDsResponseTdsInner idx(@Nullable Integer idx) {
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

  public AvailTDsResponseTdsInner tdId(@Nullable Integer tdId) {
    this.tdId = tdId;
    return this;
  }

  /**
   * Get tdId
   * @return tdId
   */
  
  @JsonProperty("tdId")
  public @Nullable Integer getTdId() {
    return tdId;
  }

  public void setTdId(@Nullable Integer tdId) {
    this.tdId = tdId;
  }

  public AvailTDsResponseTdsInner name(@Nullable String name) {
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

  public AvailTDsResponseTdsInner natCode(@Nullable String natCode) {
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

  public AvailTDsResponseTdsInner retiring(@Nullable String retiring) {
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

  public AvailTDsResponseTdsInner OA(@Nullable String OA) {
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

  public AvailTDsResponseTdsInner age(@Nullable String age) {
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

  public AvailTDsResponseTdsInner salary(@Nullable String salary) {
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

  public AvailTDsResponseTdsInner signFee(@Nullable String signFee) {
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

  public AvailTDsResponseTdsInner offers(@Nullable Integer offers) {
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

  public AvailTDsResponseTdsInner inShortlist(@Nullable Integer inShortlist) {
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
    AvailTDsResponseTdsInner availTDsResponseTdsInner = (AvailTDsResponseTdsInner) o;
    return Objects.equals(this.idx, availTDsResponseTdsInner.idx) &&
        Objects.equals(this.tdId, availTDsResponseTdsInner.tdId) &&
        Objects.equals(this.name, availTDsResponseTdsInner.name) &&
        Objects.equals(this.natCode, availTDsResponseTdsInner.natCode) &&
        Objects.equals(this.retiring, availTDsResponseTdsInner.retiring) &&
        Objects.equals(this.OA, availTDsResponseTdsInner.OA) &&
        Objects.equals(this.age, availTDsResponseTdsInner.age) &&
        Objects.equals(this.salary, availTDsResponseTdsInner.salary) &&
        Objects.equals(this.signFee, availTDsResponseTdsInner.signFee) &&
        Objects.equals(this.offers, availTDsResponseTdsInner.offers) &&
        Objects.equals(this.inShortlist, availTDsResponseTdsInner.inShortlist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idx, tdId, name, natCode, retiring, OA, age, salary, signFee, offers, inShortlist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailTDsResponseTdsInner {\n");
    sb.append("    idx: ").append(toIndentedString(idx)).append("\n");
    sb.append("    tdId: ").append(toIndentedString(tdId)).append("\n");
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

