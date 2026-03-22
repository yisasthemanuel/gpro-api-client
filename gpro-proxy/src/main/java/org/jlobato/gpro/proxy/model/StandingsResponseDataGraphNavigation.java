package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphNavigationButtonOptions;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphNavigation
 */

@JsonTypeName("StandingsResponse_dataGraph_navigation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphNavigation {

  private @Nullable StandingsResponseDataGraphNavigationButtonOptions buttonOptions;

  public StandingsResponseDataGraphNavigation buttonOptions(@Nullable StandingsResponseDataGraphNavigationButtonOptions buttonOptions) {
    this.buttonOptions = buttonOptions;
    return this;
  }

  /**
   * Get buttonOptions
   * @return buttonOptions
   */
  @Valid 
  @JsonProperty("buttonOptions")
  public @Nullable StandingsResponseDataGraphNavigationButtonOptions getButtonOptions() {
    return buttonOptions;
  }

  public void setButtonOptions(@Nullable StandingsResponseDataGraphNavigationButtonOptions buttonOptions) {
    this.buttonOptions = buttonOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphNavigation standingsResponseDataGraphNavigation = (StandingsResponseDataGraphNavigation) o;
    return Objects.equals(this.buttonOptions, standingsResponseDataGraphNavigation.buttonOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphNavigation {\n");
    sb.append("    buttonOptions: ").append(toIndentedString(buttonOptions)).append("\n");
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

