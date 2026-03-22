package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.TracksResponseTracksInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TracksResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TracksResponse {

  private @Nullable String loadingDataState;

  private @Nullable Integer nextSeasonPublished;

  @Valid
  private List<@Valid TracksResponseTracksInner> tracks = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public TracksResponse loadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
    return this;
  }

  /**
   * Get loadingDataState
   * @return loadingDataState
   */
  
  @JsonProperty("loadingDataState")
  public @Nullable String getLoadingDataState() {
    return loadingDataState;
  }

  public void setLoadingDataState(@Nullable String loadingDataState) {
    this.loadingDataState = loadingDataState;
  }

  public TracksResponse nextSeasonPublished(@Nullable Integer nextSeasonPublished) {
    this.nextSeasonPublished = nextSeasonPublished;
    return this;
  }

  /**
   * Get nextSeasonPublished
   * @return nextSeasonPublished
   */
  
  @JsonProperty("nextSeasonPublished")
  public @Nullable Integer getNextSeasonPublished() {
    return nextSeasonPublished;
  }

  public void setNextSeasonPublished(@Nullable Integer nextSeasonPublished) {
    this.nextSeasonPublished = nextSeasonPublished;
  }

  public TracksResponse tracks(List<@Valid TracksResponseTracksInner> tracks) {
    this.tracks = tracks;
    return this;
  }

  public TracksResponse addTracksItem(TracksResponseTracksInner tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

  /**
   * Get tracks
   * @return tracks
   */
  @Valid 
  @JsonProperty("tracks")
  public List<@Valid TracksResponseTracksInner> getTracks() {
    return tracks;
  }

  public void setTracks(List<@Valid TracksResponseTracksInner> tracks) {
    this.tracks = tracks;
  }

  public TracksResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
    this.apiRequestsRemaining = apiRequestsRemaining;
    return this;
  }

  /**
   * Get apiRequestsRemaining
   * @return apiRequestsRemaining
   */
  
  @JsonProperty("apiRequestsRemaining")
  public @Nullable Integer getApiRequestsRemaining() {
    return apiRequestsRemaining;
  }

  public void setApiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
    this.apiRequestsRemaining = apiRequestsRemaining;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TracksResponse tracksResponse = (TracksResponse) o;
    return Objects.equals(this.loadingDataState, tracksResponse.loadingDataState) &&
        Objects.equals(this.nextSeasonPublished, tracksResponse.nextSeasonPublished) &&
        Objects.equals(this.tracks, tracksResponse.tracks) &&
        Objects.equals(this.apiRequestsRemaining, tracksResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, nextSeasonPublished, tracks, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TracksResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    nextSeasonPublished: ").append(toIndentedString(nextSeasonPublished)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    apiRequestsRemaining: ").append(toIndentedString(apiRequestsRemaining)).append("\n");
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

