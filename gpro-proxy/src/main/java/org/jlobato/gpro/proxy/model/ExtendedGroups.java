package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class ExtendedGroups {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedGroups {\n");
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

