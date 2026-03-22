package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LoggedOut
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class LoggedOut implements GetSponsorProfile401Response, GetTrackProfile401Response {

  private @Nullable Integer loggedOut;

  public LoggedOut loggedOut(@Nullable Integer loggedOut) {
    this.loggedOut = loggedOut;
    return this;
  }

  /**
   * Get loggedOut
   * @return loggedOut
   */
  
  @JsonProperty("loggedOut")
  public @Nullable Integer getLoggedOut() {
    return loggedOut;
  }

  public void setLoggedOut(@Nullable Integer loggedOut) {
    this.loggedOut = loggedOut;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoggedOut loggedOut = (LoggedOut) o;
    return Objects.equals(this.loggedOut, loggedOut.loggedOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loggedOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoggedOut {\n");
    sb.append("    loggedOut: ").append(toIndentedString(loggedOut)).append("\n");
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

