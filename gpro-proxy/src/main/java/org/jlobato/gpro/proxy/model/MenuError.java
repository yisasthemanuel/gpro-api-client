package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MenuError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class MenuError {

  private @Nullable Integer loggedOut;

  private @Nullable Integer IDM;

  public MenuError loggedOut(@Nullable Integer loggedOut) {
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

  public MenuError IDM(@Nullable Integer IDM) {
    this.IDM = IDM;
    return this;
  }

  /**
   * Get IDM
   * @return IDM
   */
  
  @JsonProperty("IDM")
  public @Nullable Integer getIDM() {
    return IDM;
  }

  public void setIDM(@Nullable Integer IDM) {
    this.IDM = IDM;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuError menuError = (MenuError) o;
    return Objects.equals(this.loggedOut, menuError.loggedOut) &&
        Objects.equals(this.IDM, menuError.IDM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loggedOut, IDM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuError {\n");
    sb.append("    loggedOut: ").append(toIndentedString(loggedOut)).append("\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
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

