package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.AvailDriversResponseConRangesInner;
import org.jlobato.gpro.proxy.model.AvailDriversResponseOA;
import org.jlobato.gpro.proxy.model.AvailTDsResponseTdsInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AvailTDsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class AvailTDsResponse {

  private @Nullable String loadingDataState;

  @Valid
  private List<@Valid AvailTDsResponseTdsInner> tds = new ArrayList<>();

  private @Nullable AvailDriversResponseOA OA;

  private @Nullable String filter1;

  private @Nullable String filter2;

  private @Nullable String filter3;

  private @Nullable String filter1Range;

  private @Nullable String filter2Range;

  private @Nullable String filter3Range;

  private @Nullable String sortParam;

  @Valid
  private List<String> ranges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> leaRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> mecRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> eleRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> expRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> aerRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> pitRanges = new ArrayList<>();

  @Valid
  private List<@Valid AvailDriversResponseConRangesInner> motRanges = new ArrayList<>();

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

  public AvailTDsResponse loadingDataState(@Nullable String loadingDataState) {
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

  public AvailTDsResponse tds(List<@Valid AvailTDsResponseTdsInner> tds) {
    this.tds = tds;
    return this;
  }

  public AvailTDsResponse addTdsItem(AvailTDsResponseTdsInner tdsItem) {
    if (this.tds == null) {
      this.tds = new ArrayList<>();
    }
    this.tds.add(tdsItem);
    return this;
  }

  /**
   * Get tds
   * @return tds
   */
  @Valid 
  @JsonProperty("tds")
  public List<@Valid AvailTDsResponseTdsInner> getTds() {
    return tds;
  }

  public void setTds(List<@Valid AvailTDsResponseTdsInner> tds) {
    this.tds = tds;
  }

  public AvailTDsResponse OA(@Nullable AvailDriversResponseOA OA) {
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

  public AvailTDsResponse filter1(@Nullable String filter1) {
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

  public AvailTDsResponse filter2(@Nullable String filter2) {
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

  public AvailTDsResponse filter3(@Nullable String filter3) {
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

  public AvailTDsResponse filter1Range(@Nullable String filter1Range) {
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

  public AvailTDsResponse filter2Range(@Nullable String filter2Range) {
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

  public AvailTDsResponse filter3Range(@Nullable String filter3Range) {
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

  public AvailTDsResponse sortParam(@Nullable String sortParam) {
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

  public AvailTDsResponse ranges(List<String> ranges) {
    this.ranges = ranges;
    return this;
  }

  public AvailTDsResponse addRangesItem(String rangesItem) {
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

  public AvailTDsResponse leaRanges(List<@Valid AvailDriversResponseConRangesInner> leaRanges) {
    this.leaRanges = leaRanges;
    return this;
  }

  public AvailTDsResponse addLeaRangesItem(AvailDriversResponseConRangesInner leaRangesItem) {
    if (this.leaRanges == null) {
      this.leaRanges = new ArrayList<>();
    }
    this.leaRanges.add(leaRangesItem);
    return this;
  }

  /**
   * Get leaRanges
   * @return leaRanges
   */
  @Valid 
  @JsonProperty("leaRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getLeaRanges() {
    return leaRanges;
  }

  public void setLeaRanges(List<@Valid AvailDriversResponseConRangesInner> leaRanges) {
    this.leaRanges = leaRanges;
  }

  public AvailTDsResponse mecRanges(List<@Valid AvailDriversResponseConRangesInner> mecRanges) {
    this.mecRanges = mecRanges;
    return this;
  }

  public AvailTDsResponse addMecRangesItem(AvailDriversResponseConRangesInner mecRangesItem) {
    if (this.mecRanges == null) {
      this.mecRanges = new ArrayList<>();
    }
    this.mecRanges.add(mecRangesItem);
    return this;
  }

  /**
   * Get mecRanges
   * @return mecRanges
   */
  @Valid 
  @JsonProperty("mecRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getMecRanges() {
    return mecRanges;
  }

  public void setMecRanges(List<@Valid AvailDriversResponseConRangesInner> mecRanges) {
    this.mecRanges = mecRanges;
  }

  public AvailTDsResponse eleRanges(List<@Valid AvailDriversResponseConRangesInner> eleRanges) {
    this.eleRanges = eleRanges;
    return this;
  }

  public AvailTDsResponse addEleRangesItem(AvailDriversResponseConRangesInner eleRangesItem) {
    if (this.eleRanges == null) {
      this.eleRanges = new ArrayList<>();
    }
    this.eleRanges.add(eleRangesItem);
    return this;
  }

  /**
   * Get eleRanges
   * @return eleRanges
   */
  @Valid 
  @JsonProperty("eleRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getEleRanges() {
    return eleRanges;
  }

  public void setEleRanges(List<@Valid AvailDriversResponseConRangesInner> eleRanges) {
    this.eleRanges = eleRanges;
  }

  public AvailTDsResponse expRanges(List<@Valid AvailDriversResponseConRangesInner> expRanges) {
    this.expRanges = expRanges;
    return this;
  }

  public AvailTDsResponse addExpRangesItem(AvailDriversResponseConRangesInner expRangesItem) {
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

  public AvailTDsResponse aerRanges(List<@Valid AvailDriversResponseConRangesInner> aerRanges) {
    this.aerRanges = aerRanges;
    return this;
  }

  public AvailTDsResponse addAerRangesItem(AvailDriversResponseConRangesInner aerRangesItem) {
    if (this.aerRanges == null) {
      this.aerRanges = new ArrayList<>();
    }
    this.aerRanges.add(aerRangesItem);
    return this;
  }

  /**
   * Get aerRanges
   * @return aerRanges
   */
  @Valid 
  @JsonProperty("aerRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getAerRanges() {
    return aerRanges;
  }

  public void setAerRanges(List<@Valid AvailDriversResponseConRangesInner> aerRanges) {
    this.aerRanges = aerRanges;
  }

  public AvailTDsResponse pitRanges(List<@Valid AvailDriversResponseConRangesInner> pitRanges) {
    this.pitRanges = pitRanges;
    return this;
  }

  public AvailTDsResponse addPitRangesItem(AvailDriversResponseConRangesInner pitRangesItem) {
    if (this.pitRanges == null) {
      this.pitRanges = new ArrayList<>();
    }
    this.pitRanges.add(pitRangesItem);
    return this;
  }

  /**
   * Get pitRanges
   * @return pitRanges
   */
  @Valid 
  @JsonProperty("pitRanges")
  public List<@Valid AvailDriversResponseConRangesInner> getPitRanges() {
    return pitRanges;
  }

  public void setPitRanges(List<@Valid AvailDriversResponseConRangesInner> pitRanges) {
    this.pitRanges = pitRanges;
  }

  public AvailTDsResponse motRanges(List<@Valid AvailDriversResponseConRangesInner> motRanges) {
    this.motRanges = motRanges;
    return this;
  }

  public AvailTDsResponse addMotRangesItem(AvailDriversResponseConRangesInner motRangesItem) {
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

  public AvailTDsResponse ageRanges(List<@Valid AvailDriversResponseConRangesInner> ageRanges) {
    this.ageRanges = ageRanges;
    return this;
  }

  public AvailTDsResponse addAgeRangesItem(AvailDriversResponseConRangesInner ageRangesItem) {
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

  public AvailTDsResponse minsalRanges(List<@Valid AvailDriversResponseConRangesInner> minsalRanges) {
    this.minsalRanges = minsalRanges;
    return this;
  }

  public AvailTDsResponse addMinsalRangesItem(AvailDriversResponseConRangesInner minsalRangesItem) {
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

  public AvailTDsResponse offRanges(List<@Valid AvailDriversResponseConRangesInner> offRanges) {
    this.offRanges = offRanges;
    return this;
  }

  public AvailTDsResponse addOffRangesItem(AvailDriversResponseConRangesInner offRangesItem) {
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

  public AvailTDsResponse showAlertSL(@Nullable Boolean showAlertSL) {
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

  public AvailTDsResponse pageCount(@Nullable Integer pageCount) {
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

  public AvailTDsResponse pageSize(@Nullable String pageSize) {
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

  public AvailTDsResponse pageIndex(@Nullable Integer pageIndex) {
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

  public AvailTDsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    AvailTDsResponse availTDsResponse = (AvailTDsResponse) o;
    return Objects.equals(this.loadingDataState, availTDsResponse.loadingDataState) &&
        Objects.equals(this.tds, availTDsResponse.tds) &&
        Objects.equals(this.OA, availTDsResponse.OA) &&
        Objects.equals(this.filter1, availTDsResponse.filter1) &&
        Objects.equals(this.filter2, availTDsResponse.filter2) &&
        Objects.equals(this.filter3, availTDsResponse.filter3) &&
        Objects.equals(this.filter1Range, availTDsResponse.filter1Range) &&
        Objects.equals(this.filter2Range, availTDsResponse.filter2Range) &&
        Objects.equals(this.filter3Range, availTDsResponse.filter3Range) &&
        Objects.equals(this.sortParam, availTDsResponse.sortParam) &&
        Objects.equals(this.ranges, availTDsResponse.ranges) &&
        Objects.equals(this.leaRanges, availTDsResponse.leaRanges) &&
        Objects.equals(this.mecRanges, availTDsResponse.mecRanges) &&
        Objects.equals(this.eleRanges, availTDsResponse.eleRanges) &&
        Objects.equals(this.expRanges, availTDsResponse.expRanges) &&
        Objects.equals(this.aerRanges, availTDsResponse.aerRanges) &&
        Objects.equals(this.pitRanges, availTDsResponse.pitRanges) &&
        Objects.equals(this.motRanges, availTDsResponse.motRanges) &&
        Objects.equals(this.ageRanges, availTDsResponse.ageRanges) &&
        Objects.equals(this.minsalRanges, availTDsResponse.minsalRanges) &&
        Objects.equals(this.offRanges, availTDsResponse.offRanges) &&
        Objects.equals(this.showAlertSL, availTDsResponse.showAlertSL) &&
        Objects.equals(this.pageCount, availTDsResponse.pageCount) &&
        Objects.equals(this.pageSize, availTDsResponse.pageSize) &&
        Objects.equals(this.pageIndex, availTDsResponse.pageIndex) &&
        Objects.equals(this.apiRequestsRemaining, availTDsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, tds, OA, filter1, filter2, filter3, filter1Range, filter2Range, filter3Range, sortParam, ranges, leaRanges, mecRanges, eleRanges, expRanges, aerRanges, pitRanges, motRanges, ageRanges, minsalRanges, offRanges, showAlertSL, pageCount, pageSize, pageIndex, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailTDsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    tds: ").append(toIndentedString(tds)).append("\n");
    sb.append("    OA: ").append(toIndentedString(OA)).append("\n");
    sb.append("    filter1: ").append(toIndentedString(filter1)).append("\n");
    sb.append("    filter2: ").append(toIndentedString(filter2)).append("\n");
    sb.append("    filter3: ").append(toIndentedString(filter3)).append("\n");
    sb.append("    filter1Range: ").append(toIndentedString(filter1Range)).append("\n");
    sb.append("    filter2Range: ").append(toIndentedString(filter2Range)).append("\n");
    sb.append("    filter3Range: ").append(toIndentedString(filter3Range)).append("\n");
    sb.append("    sortParam: ").append(toIndentedString(sortParam)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    leaRanges: ").append(toIndentedString(leaRanges)).append("\n");
    sb.append("    mecRanges: ").append(toIndentedString(mecRanges)).append("\n");
    sb.append("    eleRanges: ").append(toIndentedString(eleRanges)).append("\n");
    sb.append("    expRanges: ").append(toIndentedString(expRanges)).append("\n");
    sb.append("    aerRanges: ").append(toIndentedString(aerRanges)).append("\n");
    sb.append("    pitRanges: ").append(toIndentedString(pitRanges)).append("\n");
    sb.append("    motRanges: ").append(toIndentedString(motRanges)).append("\n");
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

