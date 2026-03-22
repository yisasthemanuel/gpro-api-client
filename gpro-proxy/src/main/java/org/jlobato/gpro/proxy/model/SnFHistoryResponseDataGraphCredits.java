package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphCreditsPosition;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraphSubtitleStyle;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponseDataGraphCredits
 */

@JsonTypeName("SnFHistoryResponse_dataGraph_credits")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataGraphCredits {

  private @Nullable String text;

  private @Nullable SnFHistoryResponseDataGraphSubtitleStyle style;

  private @Nullable String href;

  private @Nullable SnFHistoryResponseDataGraphCreditsPosition position;

  public SnFHistoryResponseDataGraphCredits text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public SnFHistoryResponseDataGraphCredits style(@Nullable SnFHistoryResponseDataGraphSubtitleStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @Valid 
  @JsonProperty("style")
  public @Nullable SnFHistoryResponseDataGraphSubtitleStyle getStyle() {
    return style;
  }

  public void setStyle(@Nullable SnFHistoryResponseDataGraphSubtitleStyle style) {
    this.style = style;
  }

  public SnFHistoryResponseDataGraphCredits href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
   */
  
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public SnFHistoryResponseDataGraphCredits position(@Nullable SnFHistoryResponseDataGraphCreditsPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   */
  @Valid 
  @JsonProperty("position")
  public @Nullable SnFHistoryResponseDataGraphCreditsPosition getPosition() {
    return position;
  }

  public void setPosition(@Nullable SnFHistoryResponseDataGraphCreditsPosition position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataGraphCredits snFHistoryResponseDataGraphCredits = (SnFHistoryResponseDataGraphCredits) o;
    return Objects.equals(this.text, snFHistoryResponseDataGraphCredits.text) &&
        Objects.equals(this.style, snFHistoryResponseDataGraphCredits.style) &&
        Objects.equals(this.href, snFHistoryResponseDataGraphCredits.href) &&
        Objects.equals(this.position, snFHistoryResponseDataGraphCredits.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, style, href, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataGraphCredits {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

