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
 * TrackEOS
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TrackEOS implements GetTrackProfile401Response {

  private @Nullable Integer loadingDataState;

  private @Nullable Boolean trackNotFoundNote;

  public TrackEOS loadingDataState(@Nullable Integer loadingDataState) {
    this.loadingDataState = loadingDataState;
    return this;
  }

  /**
   * Get loadingDataState
   * @return loadingDataState
   */
  
  @JsonProperty("loadingDataState")
  public @Nullable Integer getLoadingDataState() {
    return loadingDataState;
  }

  public void setLoadingDataState(@Nullable Integer loadingDataState) {
    this.loadingDataState = loadingDataState;
  }

  public TrackEOS trackNotFoundNote(@Nullable Boolean trackNotFoundNote) {
    this.trackNotFoundNote = trackNotFoundNote;
    return this;
  }

  /**
   * Get trackNotFoundNote
   * @return trackNotFoundNote
   */
  
  @JsonProperty("trackNotFoundNote")
  public @Nullable Boolean getTrackNotFoundNote() {
    return trackNotFoundNote;
  }

  public void setTrackNotFoundNote(@Nullable Boolean trackNotFoundNote) {
    this.trackNotFoundNote = trackNotFoundNote;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackEOS trackEOS = (TrackEOS) o;
    return Objects.equals(this.loadingDataState, trackEOS.loadingDataState) &&
        Objects.equals(this.trackNotFoundNote, trackEOS.trackNotFoundNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, trackNotFoundNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackEOS {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    trackNotFoundNote: ").append(toIndentedString(trackNotFoundNote)).append("\n");
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

