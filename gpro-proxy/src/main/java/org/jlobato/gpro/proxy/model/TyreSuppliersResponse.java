package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.TyreSuppliersResponseClickedSupplier;
import org.jlobato.gpro.proxy.model.TyreSuppliersResponseSeasonsInner;
import org.jlobato.gpro.proxy.model.TyreSuppliersResponseShowSignConfirm;
import org.jlobato.gpro.proxy.model.TyreSuppliersResponseSuppliersInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TyreSuppliersResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class TyreSuppliersResponse {

  private @Nullable Integer loadingDataState;

  private @Nullable Integer curSupplierId;

  private @Nullable Integer canSignContract;

  private @Nullable Integer seasonNb;

  private @Nullable Integer selectedSeason;

  private @Nullable TyreSuppliersResponseClickedSupplier clickedSupplier;

  private @Nullable TyreSuppliersResponseShowSignConfirm showSignConfirm;

  @Valid
  private List<@Valid TyreSuppliersResponseSeasonsInner> seasons = new ArrayList<>();

  @Valid
  private List<@Valid TyreSuppliersResponseSuppliersInner> suppliers = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public TyreSuppliersResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public TyreSuppliersResponse curSupplierId(@Nullable Integer curSupplierId) {
    this.curSupplierId = curSupplierId;
    return this;
  }

  /**
   * Get curSupplierId
   * @return curSupplierId
   */
  
  @JsonProperty("curSupplierId")
  public @Nullable Integer getCurSupplierId() {
    return curSupplierId;
  }

  public void setCurSupplierId(@Nullable Integer curSupplierId) {
    this.curSupplierId = curSupplierId;
  }

  public TyreSuppliersResponse canSignContract(@Nullable Integer canSignContract) {
    this.canSignContract = canSignContract;
    return this;
  }

  /**
   * Get canSignContract
   * @return canSignContract
   */
  
  @JsonProperty("canSignContract")
  public @Nullable Integer getCanSignContract() {
    return canSignContract;
  }

  public void setCanSignContract(@Nullable Integer canSignContract) {
    this.canSignContract = canSignContract;
  }

  public TyreSuppliersResponse seasonNb(@Nullable Integer seasonNb) {
    this.seasonNb = seasonNb;
    return this;
  }

  /**
   * Get seasonNb
   * @return seasonNb
   */
  
  @JsonProperty("seasonNb")
  public @Nullable Integer getSeasonNb() {
    return seasonNb;
  }

  public void setSeasonNb(@Nullable Integer seasonNb) {
    this.seasonNb = seasonNb;
  }

  public TyreSuppliersResponse selectedSeason(@Nullable Integer selectedSeason) {
    this.selectedSeason = selectedSeason;
    return this;
  }

  /**
   * Get selectedSeason
   * @return selectedSeason
   */
  
  @JsonProperty("selectedSeason")
  public @Nullable Integer getSelectedSeason() {
    return selectedSeason;
  }

  public void setSelectedSeason(@Nullable Integer selectedSeason) {
    this.selectedSeason = selectedSeason;
  }

  public TyreSuppliersResponse clickedSupplier(@Nullable TyreSuppliersResponseClickedSupplier clickedSupplier) {
    this.clickedSupplier = clickedSupplier;
    return this;
  }

  /**
   * Get clickedSupplier
   * @return clickedSupplier
   */
  @Valid 
  @JsonProperty("clickedSupplier")
  public @Nullable TyreSuppliersResponseClickedSupplier getClickedSupplier() {
    return clickedSupplier;
  }

  public void setClickedSupplier(@Nullable TyreSuppliersResponseClickedSupplier clickedSupplier) {
    this.clickedSupplier = clickedSupplier;
  }

  public TyreSuppliersResponse showSignConfirm(@Nullable TyreSuppliersResponseShowSignConfirm showSignConfirm) {
    this.showSignConfirm = showSignConfirm;
    return this;
  }

  /**
   * Get showSignConfirm
   * @return showSignConfirm
   */
  @Valid 
  @JsonProperty("showSignConfirm")
  public @Nullable TyreSuppliersResponseShowSignConfirm getShowSignConfirm() {
    return showSignConfirm;
  }

  public void setShowSignConfirm(@Nullable TyreSuppliersResponseShowSignConfirm showSignConfirm) {
    this.showSignConfirm = showSignConfirm;
  }

  public TyreSuppliersResponse seasons(List<@Valid TyreSuppliersResponseSeasonsInner> seasons) {
    this.seasons = seasons;
    return this;
  }

  public TyreSuppliersResponse addSeasonsItem(TyreSuppliersResponseSeasonsInner seasonsItem) {
    if (this.seasons == null) {
      this.seasons = new ArrayList<>();
    }
    this.seasons.add(seasonsItem);
    return this;
  }

  /**
   * Get seasons
   * @return seasons
   */
  @Valid 
  @JsonProperty("seasons")
  public List<@Valid TyreSuppliersResponseSeasonsInner> getSeasons() {
    return seasons;
  }

  public void setSeasons(List<@Valid TyreSuppliersResponseSeasonsInner> seasons) {
    this.seasons = seasons;
  }

  public TyreSuppliersResponse suppliers(List<@Valid TyreSuppliersResponseSuppliersInner> suppliers) {
    this.suppliers = suppliers;
    return this;
  }

  public TyreSuppliersResponse addSuppliersItem(TyreSuppliersResponseSuppliersInner suppliersItem) {
    if (this.suppliers == null) {
      this.suppliers = new ArrayList<>();
    }
    this.suppliers.add(suppliersItem);
    return this;
  }

  /**
   * Get suppliers
   * @return suppliers
   */
  @Valid 
  @JsonProperty("suppliers")
  public List<@Valid TyreSuppliersResponseSuppliersInner> getSuppliers() {
    return suppliers;
  }

  public void setSuppliers(List<@Valid TyreSuppliersResponseSuppliersInner> suppliers) {
    this.suppliers = suppliers;
  }

  public TyreSuppliersResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    TyreSuppliersResponse tyreSuppliersResponse = (TyreSuppliersResponse) o;
    return Objects.equals(this.loadingDataState, tyreSuppliersResponse.loadingDataState) &&
        Objects.equals(this.curSupplierId, tyreSuppliersResponse.curSupplierId) &&
        Objects.equals(this.canSignContract, tyreSuppliersResponse.canSignContract) &&
        Objects.equals(this.seasonNb, tyreSuppliersResponse.seasonNb) &&
        Objects.equals(this.selectedSeason, tyreSuppliersResponse.selectedSeason) &&
        Objects.equals(this.clickedSupplier, tyreSuppliersResponse.clickedSupplier) &&
        Objects.equals(this.showSignConfirm, tyreSuppliersResponse.showSignConfirm) &&
        Objects.equals(this.seasons, tyreSuppliersResponse.seasons) &&
        Objects.equals(this.suppliers, tyreSuppliersResponse.suppliers) &&
        Objects.equals(this.apiRequestsRemaining, tyreSuppliersResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, curSupplierId, canSignContract, seasonNb, selectedSeason, clickedSupplier, showSignConfirm, seasons, suppliers, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TyreSuppliersResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    curSupplierId: ").append(toIndentedString(curSupplierId)).append("\n");
    sb.append("    canSignContract: ").append(toIndentedString(canSignContract)).append("\n");
    sb.append("    seasonNb: ").append(toIndentedString(seasonNb)).append("\n");
    sb.append("    selectedSeason: ").append(toIndentedString(selectedSeason)).append("\n");
    sb.append("    clickedSupplier: ").append(toIndentedString(clickedSupplier)).append("\n");
    sb.append("    showSignConfirm: ").append(toIndentedString(showSignConfirm)).append("\n");
    sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
    sb.append("    suppliers: ").append(toIndentedString(suppliers)).append("\n");
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

