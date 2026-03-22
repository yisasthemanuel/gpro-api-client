package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NonSupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class NonSupResponse implements GetCCPsHistory200Response, GetStaffFacilitiesHist200Response {

  private @Nullable Integer loadingDataState;

  @Valid
  private List<String> data = new ArrayList<>();

  private @Nullable Integer minSeason;

  private @Nullable Integer maxSeason;

  private @Nullable String errorMsg;

  private @Nullable Integer apiRequestsRemaining;

  public NonSupResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public NonSupResponse data(List<String> data) {
    this.data = data;
    return this;
  }

  public NonSupResponse addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  
  @JsonProperty("data")
  public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }

  public NonSupResponse minSeason(@Nullable Integer minSeason) {
    this.minSeason = minSeason;
    return this;
  }

  /**
   * Get minSeason
   * @return minSeason
   */
  
  @JsonProperty("minSeason")
  public @Nullable Integer getMinSeason() {
    return minSeason;
  }

  public void setMinSeason(@Nullable Integer minSeason) {
    this.minSeason = minSeason;
  }

  public NonSupResponse maxSeason(@Nullable Integer maxSeason) {
    this.maxSeason = maxSeason;
    return this;
  }

  /**
   * Get maxSeason
   * @return maxSeason
   */
  
  @JsonProperty("maxSeason")
  public @Nullable Integer getMaxSeason() {
    return maxSeason;
  }

  public void setMaxSeason(@Nullable Integer maxSeason) {
    this.maxSeason = maxSeason;
  }

  public NonSupResponse errorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  /**
   * Get errorMsg
   * @return errorMsg
   */
  
  @JsonProperty("errorMsg")
  public @Nullable String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public NonSupResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    NonSupResponse nonSupResponse = (NonSupResponse) o;
    return Objects.equals(this.loadingDataState, nonSupResponse.loadingDataState) &&
        Objects.equals(this.data, nonSupResponse.data) &&
        Objects.equals(this.minSeason, nonSupResponse.minSeason) &&
        Objects.equals(this.maxSeason, nonSupResponse.maxSeason) &&
        Objects.equals(this.errorMsg, nonSupResponse.errorMsg) &&
        Objects.equals(this.apiRequestsRemaining, nonSupResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, data, minSeason, maxSeason, errorMsg, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonSupResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    minSeason: ").append(toIndentedString(minSeason)).append("\n");
    sb.append("    maxSeason: ").append(toIndentedString(maxSeason)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

