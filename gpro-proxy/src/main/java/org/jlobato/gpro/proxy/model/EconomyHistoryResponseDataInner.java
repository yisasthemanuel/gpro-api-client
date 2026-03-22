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
 * EconomyHistoryResponseDataInner
 */

@JsonTypeName("EconomyHistoryResponse_data_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryResponseDataInner {

  private @Nullable String type;

  private @Nullable String desc;

  private @Nullable String datetime;

  private @Nullable Integer balanceBefore;

  private @Nullable Integer amount;

  private @Nullable Integer balanceAfter;

  public EconomyHistoryResponseDataInner type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public EconomyHistoryResponseDataInner desc(@Nullable String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
   */
  
  @JsonProperty("desc")
  public @Nullable String getDesc() {
    return desc;
  }

  public void setDesc(@Nullable String desc) {
    this.desc = desc;
  }

  public EconomyHistoryResponseDataInner datetime(@Nullable String datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Get datetime
   * @return datetime
   */
  
  @JsonProperty("datetime")
  public @Nullable String getDatetime() {
    return datetime;
  }

  public void setDatetime(@Nullable String datetime) {
    this.datetime = datetime;
  }

  public EconomyHistoryResponseDataInner balanceBefore(@Nullable Integer balanceBefore) {
    this.balanceBefore = balanceBefore;
    return this;
  }

  /**
   * Get balanceBefore
   * @return balanceBefore
   */
  
  @JsonProperty("balanceBefore")
  public @Nullable Integer getBalanceBefore() {
    return balanceBefore;
  }

  public void setBalanceBefore(@Nullable Integer balanceBefore) {
    this.balanceBefore = balanceBefore;
  }

  public EconomyHistoryResponseDataInner amount(@Nullable Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  
  @JsonProperty("amount")
  public @Nullable Integer getAmount() {
    return amount;
  }

  public void setAmount(@Nullable Integer amount) {
    this.amount = amount;
  }

  public EconomyHistoryResponseDataInner balanceAfter(@Nullable Integer balanceAfter) {
    this.balanceAfter = balanceAfter;
    return this;
  }

  /**
   * Get balanceAfter
   * @return balanceAfter
   */
  
  @JsonProperty("balanceAfter")
  public @Nullable Integer getBalanceAfter() {
    return balanceAfter;
  }

  public void setBalanceAfter(@Nullable Integer balanceAfter) {
    this.balanceAfter = balanceAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryResponseDataInner economyHistoryResponseDataInner = (EconomyHistoryResponseDataInner) o;
    return Objects.equals(this.type, economyHistoryResponseDataInner.type) &&
        Objects.equals(this.desc, economyHistoryResponseDataInner.desc) &&
        Objects.equals(this.datetime, economyHistoryResponseDataInner.datetime) &&
        Objects.equals(this.balanceBefore, economyHistoryResponseDataInner.balanceBefore) &&
        Objects.equals(this.amount, economyHistoryResponseDataInner.amount) &&
        Objects.equals(this.balanceAfter, economyHistoryResponseDataInner.balanceAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, desc, datetime, balanceBefore, amount, balanceAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryResponseDataInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    balanceBefore: ").append(toIndentedString(balanceBefore)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceAfter: ").append(toIndentedString(balanceAfter)).append("\n");
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

