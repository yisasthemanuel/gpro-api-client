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
 * History500OBRResponseManagersInnerManager
 */

@JsonTypeName("History500OBRResponse_managers_inner_manager")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class History500OBRResponseManagersInnerManager {

  private @Nullable String fName;

  private @Nullable String lName;

  private @Nullable Integer idm;

  private @Nullable Integer champs;

  private @Nullable String color;

  public History500OBRResponseManagersInnerManager fName(@Nullable String fName) {
    this.fName = fName;
    return this;
  }

  /**
   * Get fName
   * @return fName
   */
  
  @JsonProperty("fName")
  public @Nullable String getfName() {
    return fName;
  }

  public void setfName(@Nullable String fName) {
    this.fName = fName;
  }

  public History500OBRResponseManagersInnerManager lName(@Nullable String lName) {
    this.lName = lName;
    return this;
  }

  /**
   * Get lName
   * @return lName
   */
  
  @JsonProperty("lName")
  public @Nullable String getlName() {
    return lName;
  }

  public void setlName(@Nullable String lName) {
    this.lName = lName;
  }

  public History500OBRResponseManagersInnerManager idm(@Nullable Integer idm) {
    this.idm = idm;
    return this;
  }

  /**
   * Get idm
   * @return idm
   */
  
  @JsonProperty("idm")
  public @Nullable Integer getIdm() {
    return idm;
  }

  public void setIdm(@Nullable Integer idm) {
    this.idm = idm;
  }

  public History500OBRResponseManagersInnerManager champs(@Nullable Integer champs) {
    this.champs = champs;
    return this;
  }

  /**
   * Get champs
   * @return champs
   */
  
  @JsonProperty("champs")
  public @Nullable Integer getChamps() {
    return champs;
  }

  public void setChamps(@Nullable Integer champs) {
    this.champs = champs;
  }

  public History500OBRResponseManagersInnerManager color(@Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  
  @JsonProperty("color")
  public @Nullable String getColor() {
    return color;
  }

  public void setColor(@Nullable String color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History500OBRResponseManagersInnerManager history500OBRResponseManagersInnerManager = (History500OBRResponseManagersInnerManager) o;
    return Objects.equals(this.fName, history500OBRResponseManagersInnerManager.fName) &&
        Objects.equals(this.lName, history500OBRResponseManagersInnerManager.lName) &&
        Objects.equals(this.idm, history500OBRResponseManagersInnerManager.idm) &&
        Objects.equals(this.champs, history500OBRResponseManagersInnerManager.champs) &&
        Objects.equals(this.color, history500OBRResponseManagersInnerManager.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fName, lName, idm, champs, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History500OBRResponseManagersInnerManager {\n");
    sb.append("    fName: ").append(toIndentedString(fName)).append("\n");
    sb.append("    lName: ").append(toIndentedString(lName)).append("\n");
    sb.append("    idm: ").append(toIndentedString(idm)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

