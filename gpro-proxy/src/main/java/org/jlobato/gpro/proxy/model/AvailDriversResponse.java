package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.AvailDriversResponseConRangesInner;
import org.jlobato.gpro.proxy.model.AvailDriversResponseDriversInner;
import org.jlobato.gpro.proxy.model.AvailDriversResponseOA;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AvailDriversResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class AvailDriversResponse {

  private @Nullable String loadingDataState;

  @Valid
  private List<@Valid AvailDriversResponseDriversInner> drivers = new ArrayList<>();

  private @Nullable AvailDriversResponseOA OA;

  private @Nullable String filter1;

  private @Nullable String filter2;

  private @Nullable String filter3;

  private @Nullable String filter1Range;

  private @Nullable String filter2Range;

  private @Nullable String filter3Range;

  private @Nullable String sortParam;

  private @Nullable String sortParam2;

  private @Nullable String sortParam3;

  @Valid
  private List<String> ranges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> conRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> talRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> agrRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> expRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> teiRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> staRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> chaRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> motRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> repRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> weiRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> ageRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> minsalRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> offRanges = new ArrayList<>();

  private @Nullable Boolean showAlertSL;

  private @Nullable Integer pageCount;

  private @Nullable String pageSize;

  private @Nullable Integer pageIndex;

  private @Nullable Integer apiRequestsRemaining;

  public AvailDriversResponse loadingDataState(@Nullable String loadingDataState) {
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

  public AvailDriversResponse drivers(List<@Valid AvailDriversResponseDriversInner> drivers) {
    this.drivers = drivers;
    return this;
  }

  public AvailDriversResponse addDriversItem(AvailDriversResponseDriversInner driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<>();
    }
    this.drivers.add(driversItem);
    return this;
  }

  /**
   * Get drivers
   * @return drivers
   */
  @Valid 
  @JsonProperty("drivers")
  public List<@Valid AvailDriversResponseDriversInner> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<@Valid AvailDriversResponseDriversInner> drivers) {
    this.drivers = drivers;
  }

  public AvailDriversResponse OA(@Nullable AvailDriversResponseOA OA) {
    this.OA = OA;
    return this;
  }

  /**
   * Get OA
   * @return OA
   */
  @Valid 
  @JsonProperty("OA")
  public @Nullable AvailDriversResponseOA getOA() {
    return OA;
  }

  public void setOA(@Nullable AvailDriversResponseOA OA) {
    this.OA = OA;
  }

  public AvailDriversResponse filter1(@Nullable String filter1) {
    this.filter1 = filter1;
    return this;
  }

  /**
   * Get filter1
   * @return filter1
   */
  
  @JsonProperty("filter1")
  public @Nullable String getFilter1() {
    return filter1;
  }

  public void setFilter1(@Nullable String filter1) {
    this.filter1 = filter1;
  }

  public AvailDriversResponse filter2(@Nullable String filter2) {
    this.filter2 = filter2;
    return this;
  }

  /**
   * Get filter2
   * @return filter2
   */
  
  @JsonProperty("filter2")
  public @Nullable String getFilter2() {
    return filter2;
  }

  public void setFilter2(@Nullable String filter2) {
    this.filter2 = filter2;
  }

  public AvailDriversResponse filter3(@Nullable String filter3) {
    this.filter3 = filter3;
    return this;
  }

  /**
   * Get filter3
   * @return filter3
   */
  
  @JsonProperty("filter3")
  public @Nullable String getFilter3() {
    return filter3;
  }

  public void setFilter3(@Nullable String filter3) {
    this.filter3 = filter3;
  }

  public AvailDriversResponse filter1Range(@Nullable String filter1Range) {
    this.filter1Range = filter1Range;
    return this;
  }

  /**
   * Get filter1Range
   * @return filter1Range
   */
  
  @JsonProperty("filter1Range")
  public @Nullable String getFilter1Range() {
    return filter1Range;
  }

  public void setFilter1Range(@Nullable String filter1Range) {
    this.filter1Range = filter1Range;
  }

  public AvailDriversResponse filter2Range(@Nullable String filter2Range) {
    this.filter2Range = filter2Range;
    return this;
  }

  /**
   * Get filter2Range
   * @return filter2Range
   */
  
  @JsonProperty("filter2Range")
  public @Nullable String getFilter2Range() {
    return filter2Range;
  }

  public void setFilter2Range(@Nullable String filter2Range) {
    this.filter2Range = filter2Range;
  }

  public AvailDriversResponse filter3Range(@Nullable String filter3Range) {
    this.filter3Range = filter3Range;
    return this;
  }

  /**
   * Get filter3Range
   * @return filter3Range
   */
  
  @JsonProperty("filter3Range")
  public @Nullable String getFilter3Range() {
    return filter3Range;
  }

  public void setFilter3Range(@Nullable String filter3Range) {
    this.filter3Range = filter3Range;
  }

  public AvailDriversResponse sortParam(@Nullable String sortParam) {
    this.sortParam = sortParam;
    return this;
  }

  /**
   * Get sortParam
   * @return sortParam
   */
  
  @JsonProperty("sortParam")
  public @Nullable String getSortParam() {
    return sortParam;
  }

  public void setSortParam(@Nullable String sortParam) {
    this.sortParam = sortParam;
  }

  public AvailDriversResponse sortParam2(@Nullable String sortParam2) {
    this.sortParam2 = sortParam2;
    return this;
  }

  /**
   * Get sortParam2
   * @return sortParam2
   */
  
  @JsonProperty("sortParam2")
  public @Nullable String getSortParam2() {
    return sortParam2;
  }

  public void setSortParam2(@Nullable String sortParam2) {
    this.sortParam2 = sortParam2;
  }

  public AvailDriversResponse sortParam3(@Nullable String sortParam3) {
    this.sortParam3 = sortParam3;
    return this;
  }

  /**
   * Get sortParam3
   * @return sortParam3
   */
  
  @JsonProperty("sortParam3")
  public @Nullable String getSortParam3() {
    return sortParam3;
  }

  public void setSortParam3(@Nullable String sortParam3) {
    this.sortParam3 = sortParam3;
  }

  public AvailDriversResponse ranges(List<String> ranges) {
    this.ranges = ranges;
    return this;
  }

  public AvailDriversResponse addRangesItem(String rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

  /**
   * Get ranges
   * @return ranges
   */
  
  @JsonProperty("Ranges")
  public List<String> getRanges() {
    return ranges;
  }

  public void setRanges(List<String> ranges) {
    this.ranges = ranges;
  }

  public AvailDriversResponse conRanges(List<@Valid AvailDriversResponseConRangesInner> conRanges) {
    this.conRanges = conRanges;
    return this;
  }

  public AvailDriversResponse addConRangesItem(AvailDriversResponseConRangesInner conRangesItem) {
    if (this.conRanges == null) {
      this.conRanges = new ArrayList<>();
    }
    this.conRanges.add(conRangesItem);
    return this;
  }

  /**
   * Get conRanges
   * @return conRanges
   */
  @Valid 
  @JsonProperty("conRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getConRanges() {
    return conRanges;
  }

  public void setConRanges(List<@Valid AvailDriversResponseConRangesInner> conRanges) {
    this.conRanges = conRanges;
  }

  public AvailDriversResponse talRanges(List<@Valid AvailDriversResponseConRangesInner> talRanges) {
    this.talRanges = talRanges;
    return this;
  }

  public AvailDriversResponse addTalRangesItem(AvailDriversResponseConRangesInner talRangesItem) {
    if (this.talRanges == null) {
      this.talRanges = new ArrayList<>();
    }
    this.talRanges.add(talRangesItem);
    return this;
  }

  /**
   * Get talRanges
   * @return talRanges
   */
  @Valid 
  @JsonProperty("talRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getTalRanges() {
    return talRanges;
  }

  public void setTalRanges(List<@Valid AvailDriversResponseConRangesInner> talRanges) {
    this.talRanges = talRanges;
  }

  public AvailDriversResponse agrRanges(List<@Valid AvailDriversResponseConRangesInner> agrRanges) {
    this.agrRanges = agrRanges;
    return this;
  }

  public AvailDriversResponse addAgrRangesItem(AvailDriversResponseConRangesInner agrRangesItem) {
    if (this.agrRanges == null) {
      this.agrRanges = new ArrayList<>();
    }
    this.agrRanges.add(agrRangesItem);
    return this;
  }

  /**
   * Get agrRanges
   * @return agrRanges
   */
  @Valid 
  @JsonProperty("agrRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getAgrRanges() {
    return agrRanges;
  }

  public void setAgrRanges(List<@Valid AvailDriversResponseConRangesInner> agrRanges) {
    this.agrRanges = agrRanges;
  }

  public AvailDriversResponse expRanges(List<@Valid AvailDriversResponseConRangesInner> expRanges) {
    this.expRanges = expRanges;
    return this;
  }

  public AvailDriversResponse addExpRangesItem(AvailDriversResponseConRangesInner expRangesItem) {
    if (this.expRanges == null) {
      this.expRanges = new ArrayList<>();
    }
    this.expRanges.add(expRangesItem);
    return this;
  }

  /**
   * Get expRanges
   * @return expRanges
   */
  @Valid 
  @JsonProperty("expRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getExpRanges() {
    return expRanges;
  }

  public void setExpRanges(List<@Valid AvailDriversResponseConRangesInner> expRanges) {
    this.expRanges = expRanges;
  }

  public AvailDriversResponse teiRanges(List<@Valid AvailDriversResponseConRangesInner> teiRanges) {
    this.teiRanges = teiRanges;
    return this;
  }

  public AvailDriversResponse addTeiRangesItem(AvailDriversResponseConRangesInner teiRangesItem) {
    if (this.teiRanges == null) {
      this.teiRanges = new ArrayList<>();
    }
    this.teiRanges.add(teiRangesItem);
    return this;
  }

  /**
   * Get teiRanges
   * @return teiRanges
   */
  @Valid 
  @JsonProperty("teiRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getTeiRanges() {
    return teiRanges;
  }

  public void setTeiRanges(List<@Valid AvailDriversResponseConRangesInner> teiRanges) {
    this.teiRanges = teiRanges;
  }

  public AvailDriversResponse staRanges(List<@Valid AvailDriversResponseConRangesInner> staRanges) {
    this.staRanges = staRanges;
    return this;
  }

  public AvailDriversResponse addStaRangesItem(AvailDriversResponseConRangesInner staRangesItem) {
    if (this.staRanges == null) {
      this.staRanges = new ArrayList<>();
    }
    this.staRanges.add(staRangesItem);
    return this;
  }

  /**
   * Get staRanges
   * @return staRanges
   */
  @Valid 
  @JsonProperty("staRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getStaRanges() {
    return staRanges;
  }

  public void setStaRanges(List<@Valid AvailDriversResponseConRangesInner> staRanges) {
    this.staRanges = staRanges;
  }

  public AvailDriversResponse chaRanges(List<@Valid AvailDriversResponseConRangesInner> chaRanges) {
    this.chaRanges = chaRanges;
    return this;
  }

  public AvailDriversResponse addChaRangesItem(AvailDriversResponseConRangesInner chaRangesItem) {
    if (this.chaRanges == null) {
      this.chaRanges = new ArrayList<>();
    }
    this.chaRanges.add(chaRangesItem);
    return this;
  }

  /**
   * Get chaRanges
   * @return chaRanges
   */
  @Valid 
  @JsonProperty("chaRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getChaRanges() {
    return chaRanges;
  }

  public void setChaRanges(List<@Valid AvailDriversResponseConRangesInner> chaRanges) {
    this.chaRanges = chaRanges;
  }

  public AvailDriversResponse motRanges(List<@Valid AvailDriversResponseConRangesInner> motRanges) {
    this.motRanges = motRanges;
    return this;
  }

  public AvailDriversResponse addMotRangesItem(AvailDriversResponseConRangesInner motRangesItem) {
    if (this.motRanges == null) {
      this.motRanges = new ArrayList<>();
    }
    this.motRanges.add(motRangesItem);
    return this;
  }

  /**
   * Get motRanges
   * @return motRanges
   */
  @Valid 
  @JsonProperty("motRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getMotRanges() {
    return motRanges;
  }

  public void setMotRanges(List<@Valid AvailDriversResponseConRangesInner> motRanges) {
    this.motRanges = motRanges;
  }

  public AvailDriversResponse repRanges(List<@Valid AvailDriversResponseConRangesInner> repRanges) {
    this.repRanges = repRanges;
    return this;
  }

  public AvailDriversResponse addRepRangesItem(AvailDriversResponseConRangesInner repRangesItem) {
    if (this.repRanges == null) {
      this.repRanges = new ArrayList<>();
    }
    this.repRanges.add(repRangesItem);
    return this;
  }

  /**
   * Get repRanges
   * @return repRanges
   */
  @Valid 
  @JsonProperty("repRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getRepRanges() {
    return repRanges;
  }

  public void setRepRanges(List<@Valid AvailDriversResponseConRangesInner> repRanges) {
    this.repRanges = repRanges;
  }

  public AvailDriversResponse weiRanges(List<@Valid AvailDriversResponseConRangesInner> weiRanges) {
    this.weiRanges = weiRanges;
    return this;
  }

  public AvailDriversResponse addWeiRangesItem(AvailDriversResponseConRangesInner weiRangesItem) {
    if (this.weiRanges == null) {
      this.weiRanges = new ArrayList<>();
    }
    this.weiRanges.add(weiRangesItem);
    return this;
  }

  /**
   * Get weiRanges
   * @return weiRanges
   */
  @Valid 
  @JsonProperty("weiRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getWeiRanges() {
    return weiRanges;
  }

  public void setWeiRanges(List<@Valid AvailDriversResponseConRangesInner> weiRanges) {
    this.weiRanges = weiRanges;
  }

  public AvailDriversResponse ageRanges(List<@Valid AvailDriversResponseConRangesInner> ageRanges) {
    this.ageRanges = ageRanges;
    return this;
  }

  public AvailDriversResponse addAgeRangesItem(AvailDriversResponseConRangesInner ageRangesItem) {
    if (this.ageRanges == null) {
      this.ageRanges = new ArrayList<>();
    }
    this.ageRanges.add(ageRangesItem);
    return this;
  }

  /**
   * Get ageRanges
   * @return ageRanges
   */
  @Valid 
  @JsonProperty("ageRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getAgeRanges() {
    return ageRanges;
  }

  public void setAgeRanges(List<@Valid AvailDriversResponseConRangesInner> ageRanges) {
    this.ageRanges = ageRanges;
  }

  public AvailDriversResponse minsalRanges(List<@Valid AvailDriversResponseConRangesInner> minsalRanges) {
    this.minsalRanges = minsalRanges;
    return this;
  }

  public AvailDriversResponse addMinsalRangesItem(AvailDriversResponseConRangesInner minsalRangesItem) {
    if (this.minsalRanges == null) {
      this.minsalRanges = new ArrayList<>();
    }
    this.minsalRanges.add(minsalRangesItem);
    return this;
  }

  /**
   * Get minsalRanges
   * @return minsalRanges
   */
  @Valid 
  @JsonProperty("minsalRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getMinsalRanges() {
    return minsalRanges;
  }

  public void setMinsalRanges(List<@Valid AvailDriversResponseConRangesInner> minsalRanges) {
    this.minsalRanges = minsalRanges;
  }

  public AvailDriversResponse offRanges(List<@Valid AvailDriversResponseConRangesInner> offRanges) {
    this.offRanges = offRanges;
    return this;
  }

  public AvailDriversResponse addOffRangesItem(AvailDriversResponseConRangesInner offRangesItem) {
    if (this.offRanges == null) {
      this.offRanges = new ArrayList<>();
    }
    this.offRanges.add(offRangesItem);
    return this;
  }

  /**
   * Get offRanges
   * @return offRanges
   */
  @Valid 
  @JsonProperty("offRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getOffRanges() {
    return offRanges;
  }

  public void setOffRanges(List<@Valid AvailDriversResponseConRangesInner> offRanges) {
    this.offRanges = offRanges;
  }

  public AvailDriversResponse showAlertSL(@Nullable Boolean showAlertSL) {
    this.showAlertSL = showAlertSL;
    return this;
  }

  /**
   * Get showAlertSL
   * @return showAlertSL
   */
  
  @JsonProperty("showAlertSL")
  public @Nullable Boolean getShowAlertSL() {
    return showAlertSL;
  }

  public void setShowAlertSL(@Nullable Boolean showAlertSL) {
    this.showAlertSL = showAlertSL;
  }

  public AvailDriversResponse pageCount(@Nullable Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * Get pageCount
   * @return pageCount
   */
  
  @JsonProperty("pageCount")
  public @Nullable Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(@Nullable Integer pageCount) {
    this.pageCount = pageCount;
  }

  public AvailDriversResponse pageSize(@Nullable String pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  
  @JsonProperty("pageSize")
  public @Nullable String getPageSize() {
    return pageSize;
  }

  public void setPageSize(@Nullable String pageSize) {
    this.pageSize = pageSize;
  }

  public AvailDriversResponse pageIndex(@Nullable Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  /**
   * Get pageIndex
   * @return pageIndex
   */
  
  @JsonProperty("pageIndex")
  public @Nullable Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(@Nullable Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public AvailDriversResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    AvailDriversResponse availDriversResponse = (AvailDriversResponse) o;
    return Objects.equals(this.loadingDataState, availDriversResponse.loadingDataState) &&
        Objects.equals(this.drivers, availDriversResponse.drivers) &&
        Objects.equals(this.OA, availDriversResponse.OA) &&
        Objects.equals(this.filter1, availDriversResponse.filter1) &&
        Objects.equals(this.filter2, availDriversResponse.filter2) &&
        Objects.equals(this.filter3, availDriversResponse.filter3) &&
        Objects.equals(this.filter1Range, availDriversResponse.filter1Range) &&
        Objects.equals(this.filter2Range, availDriversResponse.filter2Range) &&
        Objects.equals(this.filter3Range, availDriversResponse.filter3Range) &&
        Objects.equals(this.sortParam, availDriversResponse.sortParam) &&
        Objects.equals(this.sortParam2, availDriversResponse.sortParam2) &&
        Objects.equals(this.sortParam3, availDriversResponse.sortParam3) &&
        Objects.equals(this.ranges, availDriversResponse.ranges) &&
        Objects.equals(this.conRanges, availDriversResponse.conRanges) &&
        Objects.equals(this.talRanges, availDriversResponse.talRanges) &&
        Objects.equals(this.agrRanges, availDriversResponse.agrRanges) &&
        Objects.equals(this.expRanges, availDriversResponse.expRanges) &&
        Objects.equals(this.teiRanges, availDriversResponse.teiRanges) &&
        Objects.equals(this.staRanges, availDriversResponse.staRanges) &&
        Objects.equals(this.chaRanges, availDriversResponse.chaRanges) &&
        Objects.equals(this.motRanges, availDriversResponse.motRanges) &&
        Objects.equals(this.repRanges, availDriversResponse.repRanges) &&
        Objects.equals(this.weiRanges, availDriversResponse.weiRanges) &&
        Objects.equals(this.ageRanges, availDriversResponse.ageRanges) &&
        Objects.equals(this.minsalRanges, availDriversResponse.minsalRanges) &&
        Objects.equals(this.offRanges, availDriversResponse.offRanges) &&
        Objects.equals(this.showAlertSL, availDriversResponse.showAlertSL) &&
        Objects.equals(this.pageCount, availDriversResponse.pageCount) &&
        Objects.equals(this.pageSize, availDriversResponse.pageSize) &&
        Objects.equals(this.pageIndex, availDriversResponse.pageIndex) &&
        Objects.equals(this.apiRequestsRemaining, availDriversResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, drivers, OA, filter1, filter2, filter3, filter1Range, filter2Range, filter3Range, sortParam, sortParam2, sortParam3, ranges, conRanges, talRanges, agrRanges, expRanges, teiRanges, staRanges, chaRanges, motRanges, repRanges, weiRanges, ageRanges, minsalRanges, offRanges, showAlertSL, pageCount, pageSize, pageIndex, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailDriversResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    OA: ").append(toIndentedString(OA)).append("\n");
    sb.append("    filter1: ").append(toIndentedString(filter1)).append("\n");
    sb.append("    filter2: ").append(toIndentedString(filter2)).append("\n");
    sb.append("    filter3: ").append(toIndentedString(filter3)).append("\n");
    sb.append("    filter1Range: ").append(toIndentedString(filter1Range)).append("\n");
    sb.append("    filter2Range: ").append(toIndentedString(filter2Range)).append("\n");
    sb.append("    filter3Range: ").append(toIndentedString(filter3Range)).append("\n");
    sb.append("    sortParam: ").append(toIndentedString(sortParam)).append("\n");
    sb.append("    sortParam2: ").append(toIndentedString(sortParam2)).append("\n");
    sb.append("    sortParam3: ").append(toIndentedString(sortParam3)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    conRanges: ").append(toIndentedString(conRanges)).append("\n");
    sb.append("    talRanges: ").append(toIndentedString(talRanges)).append("\n");
    sb.append("    agrRanges: ").append(toIndentedString(agrRanges)).append("\n");
    sb.append("    expRanges: ").append(toIndentedString(expRanges)).append("\n");
    sb.append("    teiRanges: ").append(toIndentedString(teiRanges)).append("\n");
    sb.append("    staRanges: ").append(toIndentedString(staRanges)).append("\n");
    sb.append("    chaRanges: ").append(toIndentedString(chaRanges)).append("\n");
    sb.append("    motRanges: ").append(toIndentedString(motRanges)).append("\n");
    sb.append("    repRanges: ").append(toIndentedString(repRanges)).append("\n");
    sb.append("    weiRanges: ").append(toIndentedString(weiRanges)).append("\n");
    sb.append("    ageRanges: ").append(toIndentedString(ageRanges)).append("\n");
    sb.append("    minsalRanges: ").append(toIndentedString(minsalRanges)).append("\n");
    sb.append("    offRanges: ").append(toIndentedString(offRanges)).append("\n");
    sb.append("    showAlertSL: ").append(toIndentedString(showAlertSL)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
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

