package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jlobato.gpro.proxy.model.RaceReplayResponseReplayDataInnerManagersInnerValueInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RaceReplayResponseReplayDataInner
 */

@JsonTypeName("RaceReplayResponse_replayData_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class RaceReplayResponseReplayDataInner {

  private @Nullable Integer lapNb;

  @Valid
  private List<Map<String, List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>>> managers = new ArrayList<>();

  public RaceReplayResponseReplayDataInner lapNb(@Nullable Integer lapNb) {
    this.lapNb = lapNb;
    return this;
  }

  /**
   * Get lapNb
   * @return lapNb
   */
  
  @JsonProperty("lapNb")
  public @Nullable Integer getLapNb() {
    return lapNb;
  }

  public void setLapNb(@Nullable Integer lapNb) {
    this.lapNb = lapNb;
  }

  public RaceReplayResponseReplayDataInner managers(List<Map<String, List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>>> managers) {
    this.managers = managers;
    return this;
  }

  public RaceReplayResponseReplayDataInner addManagersItem(Map<String, List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>> managersItem) {
    if (this.managers == null) {
      this.managers = new ArrayList<>();
    }
    this.managers.add(managersItem);
    return this;
  }

  /**
   * Get managers
   * @return managers
   */
  @Valid 
  @JsonProperty("managers")
  public List<Map<String, List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>>> getManagers() {
    return managers;
  }

  public void setManagers(List<Map<String, List<RaceReplayResponseReplayDataInnerManagersInnerValueInner>>> managers) {
    this.managers = managers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RaceReplayResponseReplayDataInner raceReplayResponseReplayDataInner = (RaceReplayResponseReplayDataInner) o;
    return Objects.equals(this.lapNb, raceReplayResponseReplayDataInner.lapNb) &&
        Objects.equals(this.managers, raceReplayResponseReplayDataInner.managers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lapNb, managers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RaceReplayResponseReplayDataInner {\n");
    sb.append("    lapNb: ").append(toIndentedString(lapNb)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
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

