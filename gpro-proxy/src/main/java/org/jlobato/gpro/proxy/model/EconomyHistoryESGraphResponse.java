package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.jlobato.gpro.proxy.model.EconomyHistoryESGraphResponseDataGraph;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EconomyHistoryESGraphResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class EconomyHistoryESGraphResponse implements GetEconomyHistory200Response {

  private @Nullable Integer loadingDataState;

  private @Nullable Integer curPage;

  private @Nullable Integer totPages;

  private @Nullable EconomyHistoryESGraphResponseDataGraph dataGraph;

  public EconomyHistoryESGraphResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public EconomyHistoryESGraphResponse curPage(@Nullable Integer curPage) {
    this.curPage = curPage;
    return this;
  }

  /**
   * Get curPage
   * @return curPage
   */
  
  @JsonProperty("curPage")
  public @Nullable Integer getCurPage() {
    return curPage;
  }

  public void setCurPage(@Nullable Integer curPage) {
    this.curPage = curPage;
  }

  public EconomyHistoryESGraphResponse totPages(@Nullable Integer totPages) {
    this.totPages = totPages;
    return this;
  }

  /**
   * Get totPages
   * @return totPages
   */
  
  @JsonProperty("totPages")
  public @Nullable Integer getTotPages() {
    return totPages;
  }

  public void setTotPages(@Nullable Integer totPages) {
    this.totPages = totPages;
  }

  public EconomyHistoryESGraphResponse dataGraph(@Nullable EconomyHistoryESGraphResponseDataGraph dataGraph) {
    this.dataGraph = dataGraph;
    return this;
  }

  /**
   * Get dataGraph
   * @return dataGraph
   */
  @Valid 
  @JsonProperty("dataGraph")
  public @Nullable EconomyHistoryESGraphResponseDataGraph getDataGraph() {
    return dataGraph;
  }

  public void setDataGraph(@Nullable EconomyHistoryESGraphResponseDataGraph dataGraph) {
    this.dataGraph = dataGraph;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EconomyHistoryESGraphResponse economyHistoryESGraphResponse = (EconomyHistoryESGraphResponse) o;
    return Objects.equals(this.loadingDataState, economyHistoryESGraphResponse.loadingDataState) &&
        Objects.equals(this.curPage, economyHistoryESGraphResponse.curPage) &&
        Objects.equals(this.totPages, economyHistoryESGraphResponse.totPages) &&
        Objects.equals(this.dataGraph, economyHistoryESGraphResponse.dataGraph);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, curPage, totPages, dataGraph);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EconomyHistoryESGraphResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
    sb.append("    totPages: ").append(toIndentedString(totPages)).append("\n");
    sb.append("    dataGraph: ").append(toIndentedString(dataGraph)).append("\n");
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

