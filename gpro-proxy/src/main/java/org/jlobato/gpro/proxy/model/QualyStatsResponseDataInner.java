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
 * QualyStatsResponseDataInner
 */

@JsonTypeName("QualyStatsResponse_data_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class QualyStatsResponseDataInner {

  private @Nullable String classN;

  private @Nullable String group;

  private @Nullable String groupShort;

  private @Nullable Integer qualified;

  public QualyStatsResponseDataInner classN(@Nullable String classN) {
    this.classN = classN;
    return this;
  }

  /**
   * Get classN
   * @return classN
   */
  
  @JsonProperty("classN")
  public @Nullable String getClassN() {
    return classN;
  }

  public void setClassN(@Nullable String classN) {
    this.classN = classN;
  }

  public QualyStatsResponseDataInner group(@Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  
  @JsonProperty("group")
  public @Nullable String getGroup() {
    return group;
  }

  public void setGroup(@Nullable String group) {
    this.group = group;
  }

  public QualyStatsResponseDataInner groupShort(@Nullable String groupShort) {
    this.groupShort = groupShort;
    return this;
  }

  /**
   * Get groupShort
   * @return groupShort
   */
  
  @JsonProperty("groupShort")
  public @Nullable String getGroupShort() {
    return groupShort;
  }

  public void setGroupShort(@Nullable String groupShort) {
    this.groupShort = groupShort;
  }

  public QualyStatsResponseDataInner qualified(@Nullable Integer qualified) {
    this.qualified = qualified;
    return this;
  }

  /**
   * Get qualified
   * @return qualified
   */
  
  @JsonProperty("qualified")
  public @Nullable Integer getQualified() {
    return qualified;
  }

  public void setQualified(@Nullable Integer qualified) {
    this.qualified = qualified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualyStatsResponseDataInner qualyStatsResponseDataInner = (QualyStatsResponseDataInner) o;
    return Objects.equals(this.classN, qualyStatsResponseDataInner.classN) &&
        Objects.equals(this.group, qualyStatsResponseDataInner.group) &&
        Objects.equals(this.groupShort, qualyStatsResponseDataInner.groupShort) &&
        Objects.equals(this.qualified, qualyStatsResponseDataInner.qualified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classN, group, groupShort, qualified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualyStatsResponseDataInner {\n");
    sb.append("    classN: ").append(toIndentedString(classN)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupShort: ").append(toIndentedString(groupShort)).append("\n");
    sb.append("    qualified: ").append(toIndentedString(qualified)).append("\n");
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

