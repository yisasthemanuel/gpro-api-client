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
 * RaceAnalysisResponseQ1Energy
 */

@JsonTypeName("RaceAnalysisResponse_q1Energy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceAnalysisResponseQ1Energy {

  private @Nullable Integer from;

  private @Nullable Integer to;

  public RaceAnalysisResponseQ1Energy from(@Nullable Integer from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   */
  
  @JsonProperty("from")
  public @Nullable Integer getFrom() {
    return from;
  }

  public void setFrom(@Nullable Integer from) {
    this.from = from;
  }

  public RaceAnalysisResponseQ1Energy to(@Nullable Integer to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
   */
  
  @JsonProperty("to")
  public @Nullable Integer getTo() {
    return to;
  }

  public void setTo(@Nullable Integer to) {
    this.to = to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceAnalysisResponseQ1Energy raceAnalysisResponseQ1Energy = (RaceAnalysisResponseQ1Energy) o;
    return Objects.equals(this.from, raceAnalysisResponseQ1Energy.from) &&
        Objects.equals(this.to, raceAnalysisResponseQ1Energy.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceAnalysisResponseQ1Energy {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

