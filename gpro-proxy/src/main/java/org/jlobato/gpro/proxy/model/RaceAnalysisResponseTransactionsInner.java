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
 * RaceAnalysisResponseTransactionsInner
 */

@JsonTypeName("RaceAnalysisResponse_transactions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseTransactionsInner {

  private @Nullable String desc;

  private @Nullable Integer amount;

  public RaceAnalysisResponseTransactionsInner desc(@Nullable String desc) {
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

  public RaceAnalysisResponseTransactionsInner amount(@Nullable Integer amount) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseTransactionsInner raceAnalysisResponseTransactionsInner = (RaceAnalysisResponseTransactionsInner) o;
    return Objects.equals(this.desc, raceAnalysisResponseTransactionsInner.desc) &&
        Objects.equals(this.amount, raceAnalysisResponseTransactionsInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseTransactionsInner {\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

