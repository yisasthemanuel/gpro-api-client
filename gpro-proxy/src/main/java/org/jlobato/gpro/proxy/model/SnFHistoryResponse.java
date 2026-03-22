package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataGraph;
import org.jlobato.gpro.proxy.model.SnFHistoryResponseDataInner;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponse implements GetStaffFacilitiesHist200Response {

  private @Nullable Integer loadingDataState;

  private @Nullable Integer minSeason;

  private @Nullable Integer maxSeason;

  private @Nullable Integer selSeason;

  private @Nullable SnFHistoryResponseDataGraph dataGraph;

  @Valid
  private List<@Valid SnFHistoryResponseDataInner> data = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public SnFHistoryResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public SnFHistoryResponse minSeason(@Nullable Integer minSeason) {
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

  public SnFHistoryResponse maxSeason(@Nullable Integer maxSeason) {
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

  public SnFHistoryResponse selSeason(@Nullable Integer selSeason) {
    this.selSeason = selSeason;
    return this;
  }

  /**
   * Get selSeason
   * @return selSeason
   */
  
  @JsonProperty("selSeason")
  public @Nullable Integer getSelSeason() {
    return selSeason;
  }

  public void setSelSeason(@Nullable Integer selSeason) {
    this.selSeason = selSeason;
  }

  public SnFHistoryResponse dataGraph(@Nullable SnFHistoryResponseDataGraph dataGraph) {
    this.dataGraph = dataGraph;
    return this;
  }

  /**
   * Get dataGraph
   * @return dataGraph
   */
  @Valid 
  @JsonProperty("dataGraph")
  public @Nullable SnFHistoryResponseDataGraph getDataGraph() {
    return dataGraph;
  }

  public void setDataGraph(@Nullable SnFHistoryResponseDataGraph dataGraph) {
    this.dataGraph = dataGraph;
  }

  public SnFHistoryResponse data(List<@Valid SnFHistoryResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public SnFHistoryResponse addDataItem(SnFHistoryResponseDataInner dataItem) {
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
  @Valid 
  @JsonProperty("data")
  public List<@Valid SnFHistoryResponseDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid SnFHistoryResponseDataInner> data) {
    this.data = data;
  }

  public SnFHistoryResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    SnFHistoryResponse snFHistoryResponse = (SnFHistoryResponse) o;
    return Objects.equals(this.loadingDataState, snFHistoryResponse.loadingDataState) &&
        Objects.equals(this.minSeason, snFHistoryResponse.minSeason) &&
        Objects.equals(this.maxSeason, snFHistoryResponse.maxSeason) &&
        Objects.equals(this.selSeason, snFHistoryResponse.selSeason) &&
        Objects.equals(this.dataGraph, snFHistoryResponse.dataGraph) &&
        Objects.equals(this.data, snFHistoryResponse.data) &&
        Objects.equals(this.apiRequestsRemaining, snFHistoryResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, minSeason, maxSeason, selSeason, dataGraph, data, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    minSeason: ").append(toIndentedString(minSeason)).append("\n");
    sb.append("    maxSeason: ").append(toIndentedString(maxSeason)).append("\n");
    sb.append("    selSeason: ").append(toIndentedString(selSeason)).append("\n");
    sb.append("    dataGraph: ").append(toIndentedString(dataGraph)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

