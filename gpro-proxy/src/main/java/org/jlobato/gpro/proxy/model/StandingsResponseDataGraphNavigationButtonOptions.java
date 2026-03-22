package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.StandingsResponseDataGraphNavigationButtonOptionsTheme;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StandingsResponseDataGraphNavigationButtonOptions
 */

@JsonTypeName("StandingsResponse_dataGraph_navigation_buttonOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class StandingsResponseDataGraphNavigationButtonOptions {

  private @Nullable String symbolStroke;

  private @Nullable String hoverSymbolStroke;

  private @Nullable StandingsResponseDataGraphNavigationButtonOptionsTheme theme;

  public StandingsResponseDataGraphNavigationButtonOptions symbolStroke(@Nullable String symbolStroke) {
    this.symbolStroke = symbolStroke;
    return this;
  }

  /**
   * Get symbolStroke
   * @return symbolStroke
   */
  
  @JsonProperty("symbolStroke")
  public @Nullable String getSymbolStroke() {
    return symbolStroke;
  }

  public void setSymbolStroke(@Nullable String symbolStroke) {
    this.symbolStroke = symbolStroke;
  }

  public StandingsResponseDataGraphNavigationButtonOptions hoverSymbolStroke(@Nullable String hoverSymbolStroke) {
    this.hoverSymbolStroke = hoverSymbolStroke;
    return this;
  }

  /**
   * Get hoverSymbolStroke
   * @return hoverSymbolStroke
   */
  
  @JsonProperty("hoverSymbolStroke")
  public @Nullable String getHoverSymbolStroke() {
    return hoverSymbolStroke;
  }

  public void setHoverSymbolStroke(@Nullable String hoverSymbolStroke) {
    this.hoverSymbolStroke = hoverSymbolStroke;
  }

  public StandingsResponseDataGraphNavigationButtonOptions theme(@Nullable StandingsResponseDataGraphNavigationButtonOptionsTheme theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
   */
  @Valid 
  @JsonProperty("theme")
  public @Nullable StandingsResponseDataGraphNavigationButtonOptionsTheme getTheme() {
    return theme;
  }

  public void setTheme(@Nullable StandingsResponseDataGraphNavigationButtonOptionsTheme theme) {
    this.theme = theme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsResponseDataGraphNavigationButtonOptions standingsResponseDataGraphNavigationButtonOptions = (StandingsResponseDataGraphNavigationButtonOptions) o;
    return Objects.equals(this.symbolStroke, standingsResponseDataGraphNavigationButtonOptions.symbolStroke) &&
        Objects.equals(this.hoverSymbolStroke, standingsResponseDataGraphNavigationButtonOptions.hoverSymbolStroke) &&
        Objects.equals(this.theme, standingsResponseDataGraphNavigationButtonOptions.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbolStroke, hoverSymbolStroke, theme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsResponseDataGraphNavigationButtonOptions {\n");
    sb.append("    symbolStroke: ").append(toIndentedString(symbolStroke)).append("\n");
    sb.append("    hoverSymbolStroke: ").append(toIndentedString(hoverSymbolStroke)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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

