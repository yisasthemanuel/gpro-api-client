package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.AvailableSponsorsResponseSponsorsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AvailableSponsorsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class AvailableSponsorsResponse {

  private @Nullable String loadingDataState;

  private @Nullable String group;

  @Valid
  private List<@Valid AvailableSponsorsResponseSponsorsInner> sponsors = new ArrayList<>();

  private @Nullable String totalPages;

  private @Nullable String curPage;

  private @Nullable Integer apiRequestsRemaining;

  public AvailableSponsorsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public AvailableSponsorsResponse group(@Nullable String group) {
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

  public AvailableSponsorsResponse sponsors(List<@Valid AvailableSponsorsResponseSponsorsInner> sponsors) {
    this.sponsors = sponsors;
    return this;
  }

  public AvailableSponsorsResponse addSponsorsItem(AvailableSponsorsResponseSponsorsInner sponsorsItem) {
    if (this.sponsors == null) {
      this.sponsors = new ArrayList<>();
    }
    this.sponsors.add(sponsorsItem);
    return this;
  }

  /**
   * Get sponsors
   * @return sponsors
   */
  @Valid 
  @JsonProperty("sponsors")
  public List<@Valid AvailableSponsorsResponseSponsorsInner> getSponsors() {
    return sponsors;
  }

  public void setSponsors(List<@Valid AvailableSponsorsResponseSponsorsInner> sponsors) {
    this.sponsors = sponsors;
  }

  public AvailableSponsorsResponse totalPages(@Nullable String totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
   */
  
  @JsonProperty("totalPages")
  public @Nullable String getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(@Nullable String totalPages) {
    this.totalPages = totalPages;
  }

  public AvailableSponsorsResponse curPage(@Nullable String curPage) {
    this.curPage = curPage;
    return this;
  }

  /**
   * Get curPage
   * @return curPage
   */
  
  @JsonProperty("curPage")
  public @Nullable String getCurPage() {
    return curPage;
  }

  public void setCurPage(@Nullable String curPage) {
    this.curPage = curPage;
  }

  public AvailableSponsorsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    AvailableSponsorsResponse availableSponsorsResponse = (AvailableSponsorsResponse) o;
    return Objects.equals(this.loadingDataState, availableSponsorsResponse.loadingDataState) &&
        Objects.equals(this.group, availableSponsorsResponse.group) &&
        Objects.equals(this.sponsors, availableSponsorsResponse.sponsors) &&
        Objects.equals(this.totalPages, availableSponsorsResponse.totalPages) &&
        Objects.equals(this.curPage, availableSponsorsResponse.curPage) &&
        Objects.equals(this.apiRequestsRemaining, availableSponsorsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, group, sponsors, totalPages, curPage, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableSponsorsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    sponsors: ").append(toIndentedString(sponsors)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
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

