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
 * HistoryGroupCupResponseCupDataInner
 */

@JsonTypeName("HistoryGroupCupResponse_cupData_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryGroupCupResponseCupDataInner {

  private @Nullable String item;

  public HistoryGroupCupResponseCupDataInner item(@Nullable String item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   */
  
  @JsonProperty("item")
  public @Nullable String getItem() {
    return item;
  }

  public void setItem(@Nullable String item) {
    this.item = item;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryGroupCupResponseCupDataInner historyGroupCupResponseCupDataInner = (HistoryGroupCupResponseCupDataInner) o;
    return Objects.equals(this.item, historyGroupCupResponseCupDataInner.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryGroupCupResponseCupDataInner {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

