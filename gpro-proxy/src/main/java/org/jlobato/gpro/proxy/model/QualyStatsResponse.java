package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.QualyStatsResponseDataInner;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QualyStatsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class QualyStatsResponse {

  private @Nullable Integer loadingDataState;

  private @Nullable String segmentSelected;

  @Valid
  private List<@Valid QualyStatsResponseDataInner> data = new ArrayList<>();

  private @Nullable Integer qualifiedQ1Elite;

  private @Nullable Integer qualifiedQ1Master;

  private @Nullable Integer qualifiedQ1Pro;

  private @Nullable Integer qualifiedQ1Amateur;

  private @Nullable Integer qualifiedQ1Rookie;

  private @Nullable Integer qualifiedQ1Total;

  private @Nullable Integer qualifiedQ2Elite;

  private @Nullable Integer qualifiedQ2Master;

  private @Nullable Integer qualifiedQ2Pro;

  private @Nullable Integer qualifiedQ2Amateur;

  private @Nullable Integer qualifiedQ2Rookie;

  private @Nullable Integer qualifiedQ2Total;

  private @Nullable Integer totalElite;

  private @Nullable Integer totalMaster;

  private @Nullable Integer totalPro;

  private @Nullable Integer totalAmateur;

  private @Nullable Integer totalRookie;

  private @Nullable Integer totalManagers;

  private @Nullable Integer apiRequestsRemaining;

  public QualyStatsResponse loadingDataState(@Nullable Integer loadingDataState) {
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

  public QualyStatsResponse segmentSelected(@Nullable String segmentSelected) {
    this.segmentSelected = segmentSelected;
    return this;
  }

  /**
   * Get segmentSelected
   * @return segmentSelected
   */
  
  @JsonProperty("segmentSelected")
  public @Nullable String getSegmentSelected() {
    return segmentSelected;
  }

  public void setSegmentSelected(@Nullable String segmentSelected) {
    this.segmentSelected = segmentSelected;
  }

  public QualyStatsResponse data(List<@Valid QualyStatsResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public QualyStatsResponse addDataItem(QualyStatsResponseDataInner dataItem) {
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
  public List<@Valid QualyStatsResponseDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid QualyStatsResponseDataInner> data) {
    this.data = data;
  }

  public QualyStatsResponse qualifiedQ1Elite(@Nullable Integer qualifiedQ1Elite) {
    this.qualifiedQ1Elite = qualifiedQ1Elite;
    return this;
  }

  /**
   * Get qualifiedQ1Elite
   * @return qualifiedQ1Elite
   */
  
  @JsonProperty("qualifiedQ1Elite")
  public @Nullable Integer getQualifiedQ1Elite() {
    return qualifiedQ1Elite;
  }

  public void setQualifiedQ1Elite(@Nullable Integer qualifiedQ1Elite) {
    this.qualifiedQ1Elite = qualifiedQ1Elite;
  }

  public QualyStatsResponse qualifiedQ1Master(@Nullable Integer qualifiedQ1Master) {
    this.qualifiedQ1Master = qualifiedQ1Master;
    return this;
  }

  /**
   * Get qualifiedQ1Master
   * @return qualifiedQ1Master
   */
  
  @JsonProperty("qualifiedQ1Master")
  public @Nullable Integer getQualifiedQ1Master() {
    return qualifiedQ1Master;
  }

  public void setQualifiedQ1Master(@Nullable Integer qualifiedQ1Master) {
    this.qualifiedQ1Master = qualifiedQ1Master;
  }

  public QualyStatsResponse qualifiedQ1Pro(@Nullable Integer qualifiedQ1Pro) {
    this.qualifiedQ1Pro = qualifiedQ1Pro;
    return this;
  }

  /**
   * Get qualifiedQ1Pro
   * @return qualifiedQ1Pro
   */
  
  @JsonProperty("qualifiedQ1Pro")
  public @Nullable Integer getQualifiedQ1Pro() {
    return qualifiedQ1Pro;
  }

  public void setQualifiedQ1Pro(@Nullable Integer qualifiedQ1Pro) {
    this.qualifiedQ1Pro = qualifiedQ1Pro;
  }

  public QualyStatsResponse qualifiedQ1Amateur(@Nullable Integer qualifiedQ1Amateur) {
    this.qualifiedQ1Amateur = qualifiedQ1Amateur;
    return this;
  }

  /**
   * Get qualifiedQ1Amateur
   * @return qualifiedQ1Amateur
   */
  
  @JsonProperty("qualifiedQ1Amateur")
  public @Nullable Integer getQualifiedQ1Amateur() {
    return qualifiedQ1Amateur;
  }

  public void setQualifiedQ1Amateur(@Nullable Integer qualifiedQ1Amateur) {
    this.qualifiedQ1Amateur = qualifiedQ1Amateur;
  }

  public QualyStatsResponse qualifiedQ1Rookie(@Nullable Integer qualifiedQ1Rookie) {
    this.qualifiedQ1Rookie = qualifiedQ1Rookie;
    return this;
  }

  /**
   * Get qualifiedQ1Rookie
   * @return qualifiedQ1Rookie
   */
  
  @JsonProperty("qualifiedQ1Rookie")
  public @Nullable Integer getQualifiedQ1Rookie() {
    return qualifiedQ1Rookie;
  }

  public void setQualifiedQ1Rookie(@Nullable Integer qualifiedQ1Rookie) {
    this.qualifiedQ1Rookie = qualifiedQ1Rookie;
  }

  public QualyStatsResponse qualifiedQ1Total(@Nullable Integer qualifiedQ1Total) {
    this.qualifiedQ1Total = qualifiedQ1Total;
    return this;
  }

  /**
   * Get qualifiedQ1Total
   * @return qualifiedQ1Total
   */
  
  @JsonProperty("qualifiedQ1Total")
  public @Nullable Integer getQualifiedQ1Total() {
    return qualifiedQ1Total;
  }

  public void setQualifiedQ1Total(@Nullable Integer qualifiedQ1Total) {
    this.qualifiedQ1Total = qualifiedQ1Total;
  }

  public QualyStatsResponse qualifiedQ2Elite(@Nullable Integer qualifiedQ2Elite) {
    this.qualifiedQ2Elite = qualifiedQ2Elite;
    return this;
  }

  /**
   * Get qualifiedQ2Elite
   * @return qualifiedQ2Elite
   */
  
  @JsonProperty("qualifiedQ2Elite")
  public @Nullable Integer getQualifiedQ2Elite() {
    return qualifiedQ2Elite;
  }

  public void setQualifiedQ2Elite(@Nullable Integer qualifiedQ2Elite) {
    this.qualifiedQ2Elite = qualifiedQ2Elite;
  }

  public QualyStatsResponse qualifiedQ2Master(@Nullable Integer qualifiedQ2Master) {
    this.qualifiedQ2Master = qualifiedQ2Master;
    return this;
  }

  /**
   * Get qualifiedQ2Master
   * @return qualifiedQ2Master
   */
  
  @JsonProperty("qualifiedQ2Master")
  public @Nullable Integer getQualifiedQ2Master() {
    return qualifiedQ2Master;
  }

  public void setQualifiedQ2Master(@Nullable Integer qualifiedQ2Master) {
    this.qualifiedQ2Master = qualifiedQ2Master;
  }

  public QualyStatsResponse qualifiedQ2Pro(@Nullable Integer qualifiedQ2Pro) {
    this.qualifiedQ2Pro = qualifiedQ2Pro;
    return this;
  }

  /**
   * Get qualifiedQ2Pro
   * @return qualifiedQ2Pro
   */
  
  @JsonProperty("qualifiedQ2Pro")
  public @Nullable Integer getQualifiedQ2Pro() {
    return qualifiedQ2Pro;
  }

  public void setQualifiedQ2Pro(@Nullable Integer qualifiedQ2Pro) {
    this.qualifiedQ2Pro = qualifiedQ2Pro;
  }

  public QualyStatsResponse qualifiedQ2Amateur(@Nullable Integer qualifiedQ2Amateur) {
    this.qualifiedQ2Amateur = qualifiedQ2Amateur;
    return this;
  }

  /**
   * Get qualifiedQ2Amateur
   * @return qualifiedQ2Amateur
   */
  
  @JsonProperty("qualifiedQ2Amateur")
  public @Nullable Integer getQualifiedQ2Amateur() {
    return qualifiedQ2Amateur;
  }

  public void setQualifiedQ2Amateur(@Nullable Integer qualifiedQ2Amateur) {
    this.qualifiedQ2Amateur = qualifiedQ2Amateur;
  }

  public QualyStatsResponse qualifiedQ2Rookie(@Nullable Integer qualifiedQ2Rookie) {
    this.qualifiedQ2Rookie = qualifiedQ2Rookie;
    return this;
  }

  /**
   * Get qualifiedQ2Rookie
   * @return qualifiedQ2Rookie
   */
  
  @JsonProperty("qualifiedQ2Rookie")
  public @Nullable Integer getQualifiedQ2Rookie() {
    return qualifiedQ2Rookie;
  }

  public void setQualifiedQ2Rookie(@Nullable Integer qualifiedQ2Rookie) {
    this.qualifiedQ2Rookie = qualifiedQ2Rookie;
  }

  public QualyStatsResponse qualifiedQ2Total(@Nullable Integer qualifiedQ2Total) {
    this.qualifiedQ2Total = qualifiedQ2Total;
    return this;
  }

  /**
   * Get qualifiedQ2Total
   * @return qualifiedQ2Total
   */
  
  @JsonProperty("qualifiedQ2Total")
  public @Nullable Integer getQualifiedQ2Total() {
    return qualifiedQ2Total;
  }

  public void setQualifiedQ2Total(@Nullable Integer qualifiedQ2Total) {
    this.qualifiedQ2Total = qualifiedQ2Total;
  }

  public QualyStatsResponse totalElite(@Nullable Integer totalElite) {
    this.totalElite = totalElite;
    return this;
  }

  /**
   * Get totalElite
   * @return totalElite
   */
  
  @JsonProperty("totalElite")
  public @Nullable Integer getTotalElite() {
    return totalElite;
  }

  public void setTotalElite(@Nullable Integer totalElite) {
    this.totalElite = totalElite;
  }

  public QualyStatsResponse totalMaster(@Nullable Integer totalMaster) {
    this.totalMaster = totalMaster;
    return this;
  }

  /**
   * Get totalMaster
   * @return totalMaster
   */
  
  @JsonProperty("totalMaster")
  public @Nullable Integer getTotalMaster() {
    return totalMaster;
  }

  public void setTotalMaster(@Nullable Integer totalMaster) {
    this.totalMaster = totalMaster;
  }

  public QualyStatsResponse totalPro(@Nullable Integer totalPro) {
    this.totalPro = totalPro;
    return this;
  }

  /**
   * Get totalPro
   * @return totalPro
   */
  
  @JsonProperty("totalPro")
  public @Nullable Integer getTotalPro() {
    return totalPro;
  }

  public void setTotalPro(@Nullable Integer totalPro) {
    this.totalPro = totalPro;
  }

  public QualyStatsResponse totalAmateur(@Nullable Integer totalAmateur) {
    this.totalAmateur = totalAmateur;
    return this;
  }

  /**
   * Get totalAmateur
   * @return totalAmateur
   */
  
  @JsonProperty("totalAmateur")
  public @Nullable Integer getTotalAmateur() {
    return totalAmateur;
  }

  public void setTotalAmateur(@Nullable Integer totalAmateur) {
    this.totalAmateur = totalAmateur;
  }

  public QualyStatsResponse totalRookie(@Nullable Integer totalRookie) {
    this.totalRookie = totalRookie;
    return this;
  }

  /**
   * Get totalRookie
   * @return totalRookie
   */
  
  @JsonProperty("totalRookie")
  public @Nullable Integer getTotalRookie() {
    return totalRookie;
  }

  public void setTotalRookie(@Nullable Integer totalRookie) {
    this.totalRookie = totalRookie;
  }

  public QualyStatsResponse totalManagers(@Nullable Integer totalManagers) {
    this.totalManagers = totalManagers;
    return this;
  }

  /**
   * Get totalManagers
   * @return totalManagers
   */
  
  @JsonProperty("totalManagers")
  public @Nullable Integer getTotalManagers() {
    return totalManagers;
  }

  public void setTotalManagers(@Nullable Integer totalManagers) {
    this.totalManagers = totalManagers;
  }

  public QualyStatsResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    QualyStatsResponse qualyStatsResponse = (QualyStatsResponse) o;
    return Objects.equals(this.loadingDataState, qualyStatsResponse.loadingDataState) &&
        Objects.equals(this.segmentSelected, qualyStatsResponse.segmentSelected) &&
        Objects.equals(this.data, qualyStatsResponse.data) &&
        Objects.equals(this.qualifiedQ1Elite, qualyStatsResponse.qualifiedQ1Elite) &&
        Objects.equals(this.qualifiedQ1Master, qualyStatsResponse.qualifiedQ1Master) &&
        Objects.equals(this.qualifiedQ1Pro, qualyStatsResponse.qualifiedQ1Pro) &&
        Objects.equals(this.qualifiedQ1Amateur, qualyStatsResponse.qualifiedQ1Amateur) &&
        Objects.equals(this.qualifiedQ1Rookie, qualyStatsResponse.qualifiedQ1Rookie) &&
        Objects.equals(this.qualifiedQ1Total, qualyStatsResponse.qualifiedQ1Total) &&
        Objects.equals(this.qualifiedQ2Elite, qualyStatsResponse.qualifiedQ2Elite) &&
        Objects.equals(this.qualifiedQ2Master, qualyStatsResponse.qualifiedQ2Master) &&
        Objects.equals(this.qualifiedQ2Pro, qualyStatsResponse.qualifiedQ2Pro) &&
        Objects.equals(this.qualifiedQ2Amateur, qualyStatsResponse.qualifiedQ2Amateur) &&
        Objects.equals(this.qualifiedQ2Rookie, qualyStatsResponse.qualifiedQ2Rookie) &&
        Objects.equals(this.qualifiedQ2Total, qualyStatsResponse.qualifiedQ2Total) &&
        Objects.equals(this.totalElite, qualyStatsResponse.totalElite) &&
        Objects.equals(this.totalMaster, qualyStatsResponse.totalMaster) &&
        Objects.equals(this.totalPro, qualyStatsResponse.totalPro) &&
        Objects.equals(this.totalAmateur, qualyStatsResponse.totalAmateur) &&
        Objects.equals(this.totalRookie, qualyStatsResponse.totalRookie) &&
        Objects.equals(this.totalManagers, qualyStatsResponse.totalManagers) &&
        Objects.equals(this.apiRequestsRemaining, qualyStatsResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDataState, segmentSelected, data, qualifiedQ1Elite, qualifiedQ1Master, qualifiedQ1Pro, qualifiedQ1Amateur, qualifiedQ1Rookie, qualifiedQ1Total, qualifiedQ2Elite, qualifiedQ2Master, qualifiedQ2Pro, qualifiedQ2Amateur, qualifiedQ2Rookie, qualifiedQ2Total, totalElite, totalMaster, totalPro, totalAmateur, totalRookie, totalManagers, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualyStatsResponse {\n");
    sb.append("    loadingDataState: ").append(toIndentedString(loadingDataState)).append("\n");
    sb.append("    segmentSelected: ").append(toIndentedString(segmentSelected)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    qualifiedQ1Elite: ").append(toIndentedString(qualifiedQ1Elite)).append("\n");
    sb.append("    qualifiedQ1Master: ").append(toIndentedString(qualifiedQ1Master)).append("\n");
    sb.append("    qualifiedQ1Pro: ").append(toIndentedString(qualifiedQ1Pro)).append("\n");
    sb.append("    qualifiedQ1Amateur: ").append(toIndentedString(qualifiedQ1Amateur)).append("\n");
    sb.append("    qualifiedQ1Rookie: ").append(toIndentedString(qualifiedQ1Rookie)).append("\n");
    sb.append("    qualifiedQ1Total: ").append(toIndentedString(qualifiedQ1Total)).append("\n");
    sb.append("    qualifiedQ2Elite: ").append(toIndentedString(qualifiedQ2Elite)).append("\n");
    sb.append("    qualifiedQ2Master: ").append(toIndentedString(qualifiedQ2Master)).append("\n");
    sb.append("    qualifiedQ2Pro: ").append(toIndentedString(qualifiedQ2Pro)).append("\n");
    sb.append("    qualifiedQ2Amateur: ").append(toIndentedString(qualifiedQ2Amateur)).append("\n");
    sb.append("    qualifiedQ2Rookie: ").append(toIndentedString(qualifiedQ2Rookie)).append("\n");
    sb.append("    qualifiedQ2Total: ").append(toIndentedString(qualifiedQ2Total)).append("\n");
    sb.append("    totalElite: ").append(toIndentedString(totalElite)).append("\n");
    sb.append("    totalMaster: ").append(toIndentedString(totalMaster)).append("\n");
    sb.append("    totalPro: ").append(toIndentedString(totalPro)).append("\n");
    sb.append("    totalAmateur: ").append(toIndentedString(totalAmateur)).append("\n");
    sb.append("    totalRookie: ").append(toIndentedString(totalRookie)).append("\n");
    sb.append("    totalManagers: ").append(toIndentedString(totalManagers)).append("\n");
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

