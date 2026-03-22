package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SnFHistoryResponseDataInner
 */

@JsonTypeName("SnFHistoryResponse_data_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SnFHistoryResponseDataInner {

  private @Nullable Integer race;

  private @Nullable Integer oa;

  private @Nullable Integer oaChange;

  private @Nullable Integer exp;

  private @Nullable Integer expChange;

  private @Nullable Integer mot;

  private @Nullable Integer motChange;

  private @Nullable Integer tech;

  private @Nullable Integer techChange;

  private @Nullable Integer stress;

  private @Nullable Integer stressChange;

  private @Nullable Integer conc;

  private @Nullable Integer concChange;

  private @Nullable Integer eff;

  private @Nullable Integer effChange;

  private @Nullable Integer wind;

  private @Nullable Integer windChange;

  private @Nullable Integer pit;

  private @Nullable Integer pitChange;

  private @Nullable Integer rdWorkshop;

  private @Nullable Integer rdWorkshopChange;

  private @Nullable Integer design;

  private @Nullable Integer designChange;

  private @Nullable Integer engWorkshop;

  private @Nullable Integer engWorkshopChange;

  private @Nullable Integer lab;

  private @Nullable Integer labChange;

  private @Nullable Integer commercial;

  private @Nullable Integer commercialChange;

  public SnFHistoryResponseDataInner race(@Nullable Integer race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
   */
  
  @JsonProperty("race")
  public @Nullable Integer getRace() {
    return race;
  }

  public void setRace(@Nullable Integer race) {
    this.race = race;
  }

  public SnFHistoryResponseDataInner oa(@Nullable Integer oa) {
    this.oa = oa;
    return this;
  }

  /**
   * Get oa
   * @return oa
   */
  
  @JsonProperty("oa")
  public @Nullable Integer getOa() {
    return oa;
  }

  public void setOa(@Nullable Integer oa) {
    this.oa = oa;
  }

  public SnFHistoryResponseDataInner oaChange(@Nullable Integer oaChange) {
    this.oaChange = oaChange;
    return this;
  }

  /**
   * Get oaChange
   * @return oaChange
   */
  
  @JsonProperty("oaChange")
  public @Nullable Integer getOaChange() {
    return oaChange;
  }

  public void setOaChange(@Nullable Integer oaChange) {
    this.oaChange = oaChange;
  }

  public SnFHistoryResponseDataInner exp(@Nullable Integer exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Get exp
   * @return exp
   */
  
  @JsonProperty("exp")
  public @Nullable Integer getExp() {
    return exp;
  }

  public void setExp(@Nullable Integer exp) {
    this.exp = exp;
  }

  public SnFHistoryResponseDataInner expChange(@Nullable Integer expChange) {
    this.expChange = expChange;
    return this;
  }

  /**
   * Get expChange
   * @return expChange
   */
  
  @JsonProperty("expChange")
  public @Nullable Integer getExpChange() {
    return expChange;
  }

  public void setExpChange(@Nullable Integer expChange) {
    this.expChange = expChange;
  }

  public SnFHistoryResponseDataInner mot(@Nullable Integer mot) {
    this.mot = mot;
    return this;
  }

  /**
   * Get mot
   * @return mot
   */
  
  @JsonProperty("mot")
  public @Nullable Integer getMot() {
    return mot;
  }

  public void setMot(@Nullable Integer mot) {
    this.mot = mot;
  }

  public SnFHistoryResponseDataInner motChange(@Nullable Integer motChange) {
    this.motChange = motChange;
    return this;
  }

  /**
   * Get motChange
   * @return motChange
   */
  
  @JsonProperty("motChange")
  public @Nullable Integer getMotChange() {
    return motChange;
  }

  public void setMotChange(@Nullable Integer motChange) {
    this.motChange = motChange;
  }

  public SnFHistoryResponseDataInner tech(@Nullable Integer tech) {
    this.tech = tech;
    return this;
  }

  /**
   * Get tech
   * @return tech
   */
  
  @JsonProperty("tech")
  public @Nullable Integer getTech() {
    return tech;
  }

  public void setTech(@Nullable Integer tech) {
    this.tech = tech;
  }

  public SnFHistoryResponseDataInner techChange(@Nullable Integer techChange) {
    this.techChange = techChange;
    return this;
  }

  /**
   * Get techChange
   * @return techChange
   */
  
  @JsonProperty("techChange")
  public @Nullable Integer getTechChange() {
    return techChange;
  }

  public void setTechChange(@Nullable Integer techChange) {
    this.techChange = techChange;
  }

  public SnFHistoryResponseDataInner stress(@Nullable Integer stress) {
    this.stress = stress;
    return this;
  }

  /**
   * Get stress
   * @return stress
   */
  
  @JsonProperty("stress")
  public @Nullable Integer getStress() {
    return stress;
  }

  public void setStress(@Nullable Integer stress) {
    this.stress = stress;
  }

  public SnFHistoryResponseDataInner stressChange(@Nullable Integer stressChange) {
    this.stressChange = stressChange;
    return this;
  }

  /**
   * Get stressChange
   * @return stressChange
   */
  
  @JsonProperty("stressChange")
  public @Nullable Integer getStressChange() {
    return stressChange;
  }

  public void setStressChange(@Nullable Integer stressChange) {
    this.stressChange = stressChange;
  }

  public SnFHistoryResponseDataInner conc(@Nullable Integer conc) {
    this.conc = conc;
    return this;
  }

  /**
   * Get conc
   * @return conc
   */
  
  @JsonProperty("conc")
  public @Nullable Integer getConc() {
    return conc;
  }

  public void setConc(@Nullable Integer conc) {
    this.conc = conc;
  }

  public SnFHistoryResponseDataInner concChange(@Nullable Integer concChange) {
    this.concChange = concChange;
    return this;
  }

  /**
   * Get concChange
   * @return concChange
   */
  
  @JsonProperty("concChange")
  public @Nullable Integer getConcChange() {
    return concChange;
  }

  public void setConcChange(@Nullable Integer concChange) {
    this.concChange = concChange;
  }

  public SnFHistoryResponseDataInner eff(@Nullable Integer eff) {
    this.eff = eff;
    return this;
  }

  /**
   * Get eff
   * @return eff
   */
  
  @JsonProperty("eff")
  public @Nullable Integer getEff() {
    return eff;
  }

  public void setEff(@Nullable Integer eff) {
    this.eff = eff;
  }

  public SnFHistoryResponseDataInner effChange(@Nullable Integer effChange) {
    this.effChange = effChange;
    return this;
  }

  /**
   * Get effChange
   * @return effChange
   */
  
  @JsonProperty("effChange")
  public @Nullable Integer getEffChange() {
    return effChange;
  }

  public void setEffChange(@Nullable Integer effChange) {
    this.effChange = effChange;
  }

  public SnFHistoryResponseDataInner wind(@Nullable Integer wind) {
    this.wind = wind;
    return this;
  }

  /**
   * Get wind
   * @return wind
   */
  
  @JsonProperty("wind")
  public @Nullable Integer getWind() {
    return wind;
  }

  public void setWind(@Nullable Integer wind) {
    this.wind = wind;
  }

  public SnFHistoryResponseDataInner windChange(@Nullable Integer windChange) {
    this.windChange = windChange;
    return this;
  }

  /**
   * Get windChange
   * @return windChange
   */
  
  @JsonProperty("windChange")
  public @Nullable Integer getWindChange() {
    return windChange;
  }

  public void setWindChange(@Nullable Integer windChange) {
    this.windChange = windChange;
  }

  public SnFHistoryResponseDataInner pit(@Nullable Integer pit) {
    this.pit = pit;
    return this;
  }

  /**
   * Get pit
   * @return pit
   */
  
  @JsonProperty("pit")
  public @Nullable Integer getPit() {
    return pit;
  }

  public void setPit(@Nullable Integer pit) {
    this.pit = pit;
  }

  public SnFHistoryResponseDataInner pitChange(@Nullable Integer pitChange) {
    this.pitChange = pitChange;
    return this;
  }

  /**
   * Get pitChange
   * @return pitChange
   */
  
  @JsonProperty("pitChange")
  public @Nullable Integer getPitChange() {
    return pitChange;
  }

  public void setPitChange(@Nullable Integer pitChange) {
    this.pitChange = pitChange;
  }

  public SnFHistoryResponseDataInner rdWorkshop(@Nullable Integer rdWorkshop) {
    this.rdWorkshop = rdWorkshop;
    return this;
  }

  /**
   * Get rdWorkshop
   * @return rdWorkshop
   */
  
  @JsonProperty("rdWorkshop")
  public @Nullable Integer getRdWorkshop() {
    return rdWorkshop;
  }

  public void setRdWorkshop(@Nullable Integer rdWorkshop) {
    this.rdWorkshop = rdWorkshop;
  }

  public SnFHistoryResponseDataInner rdWorkshopChange(@Nullable Integer rdWorkshopChange) {
    this.rdWorkshopChange = rdWorkshopChange;
    return this;
  }

  /**
   * Get rdWorkshopChange
   * @return rdWorkshopChange
   */
  
  @JsonProperty("rdWorkshopChange")
  public @Nullable Integer getRdWorkshopChange() {
    return rdWorkshopChange;
  }

  public void setRdWorkshopChange(@Nullable Integer rdWorkshopChange) {
    this.rdWorkshopChange = rdWorkshopChange;
  }

  public SnFHistoryResponseDataInner design(@Nullable Integer design) {
    this.design = design;
    return this;
  }

  /**
   * Get design
   * @return design
   */
  
  @JsonProperty("design")
  public @Nullable Integer getDesign() {
    return design;
  }

  public void setDesign(@Nullable Integer design) {
    this.design = design;
  }

  public SnFHistoryResponseDataInner designChange(@Nullable Integer designChange) {
    this.designChange = designChange;
    return this;
  }

  /**
   * Get designChange
   * @return designChange
   */
  
  @JsonProperty("designChange")
  public @Nullable Integer getDesignChange() {
    return designChange;
  }

  public void setDesignChange(@Nullable Integer designChange) {
    this.designChange = designChange;
  }

  public SnFHistoryResponseDataInner engWorkshop(@Nullable Integer engWorkshop) {
    this.engWorkshop = engWorkshop;
    return this;
  }

  /**
   * Get engWorkshop
   * @return engWorkshop
   */
  
  @JsonProperty("engWorkshop")
  public @Nullable Integer getEngWorkshop() {
    return engWorkshop;
  }

  public void setEngWorkshop(@Nullable Integer engWorkshop) {
    this.engWorkshop = engWorkshop;
  }

  public SnFHistoryResponseDataInner engWorkshopChange(@Nullable Integer engWorkshopChange) {
    this.engWorkshopChange = engWorkshopChange;
    return this;
  }

  /**
   * Get engWorkshopChange
   * @return engWorkshopChange
   */
  
  @JsonProperty("engWorkshopChange")
  public @Nullable Integer getEngWorkshopChange() {
    return engWorkshopChange;
  }

  public void setEngWorkshopChange(@Nullable Integer engWorkshopChange) {
    this.engWorkshopChange = engWorkshopChange;
  }

  public SnFHistoryResponseDataInner lab(@Nullable Integer lab) {
    this.lab = lab;
    return this;
  }

  /**
   * Get lab
   * @return lab
   */
  
  @JsonProperty("lab")
  public @Nullable Integer getLab() {
    return lab;
  }

  public void setLab(@Nullable Integer lab) {
    this.lab = lab;
  }

  public SnFHistoryResponseDataInner labChange(@Nullable Integer labChange) {
    this.labChange = labChange;
    return this;
  }

  /**
   * Get labChange
   * @return labChange
   */
  
  @JsonProperty("labChange")
  public @Nullable Integer getLabChange() {
    return labChange;
  }

  public void setLabChange(@Nullable Integer labChange) {
    this.labChange = labChange;
  }

  public SnFHistoryResponseDataInner commercial(@Nullable Integer commercial) {
    this.commercial = commercial;
    return this;
  }

  /**
   * Get commercial
   * @return commercial
   */
  
  @JsonProperty("commercial")
  public @Nullable Integer getCommercial() {
    return commercial;
  }

  public void setCommercial(@Nullable Integer commercial) {
    this.commercial = commercial;
  }

  public SnFHistoryResponseDataInner commercialChange(@Nullable Integer commercialChange) {
    this.commercialChange = commercialChange;
    return this;
  }

  /**
   * Get commercialChange
   * @return commercialChange
   */
  
  @JsonProperty("commercialChange")
  public @Nullable Integer getCommercialChange() {
    return commercialChange;
  }

  public void setCommercialChange(@Nullable Integer commercialChange) {
    this.commercialChange = commercialChange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnFHistoryResponseDataInner snFHistoryResponseDataInner = (SnFHistoryResponseDataInner) o;
    return Objects.equals(this.race, snFHistoryResponseDataInner.race) &&
        Objects.equals(this.oa, snFHistoryResponseDataInner.oa) &&
        Objects.equals(this.oaChange, snFHistoryResponseDataInner.oaChange) &&
        Objects.equals(this.exp, snFHistoryResponseDataInner.exp) &&
        Objects.equals(this.expChange, snFHistoryResponseDataInner.expChange) &&
        Objects.equals(this.mot, snFHistoryResponseDataInner.mot) &&
        Objects.equals(this.motChange, snFHistoryResponseDataInner.motChange) &&
        Objects.equals(this.tech, snFHistoryResponseDataInner.tech) &&
        Objects.equals(this.techChange, snFHistoryResponseDataInner.techChange) &&
        Objects.equals(this.stress, snFHistoryResponseDataInner.stress) &&
        Objects.equals(this.stressChange, snFHistoryResponseDataInner.stressChange) &&
        Objects.equals(this.conc, snFHistoryResponseDataInner.conc) &&
        Objects.equals(this.concChange, snFHistoryResponseDataInner.concChange) &&
        Objects.equals(this.eff, snFHistoryResponseDataInner.eff) &&
        Objects.equals(this.effChange, snFHistoryResponseDataInner.effChange) &&
        Objects.equals(this.wind, snFHistoryResponseDataInner.wind) &&
        Objects.equals(this.windChange, snFHistoryResponseDataInner.windChange) &&
        Objects.equals(this.pit, snFHistoryResponseDataInner.pit) &&
        Objects.equals(this.pitChange, snFHistoryResponseDataInner.pitChange) &&
        Objects.equals(this.rdWorkshop, snFHistoryResponseDataInner.rdWorkshop) &&
        Objects.equals(this.rdWorkshopChange, snFHistoryResponseDataInner.rdWorkshopChange) &&
        Objects.equals(this.design, snFHistoryResponseDataInner.design) &&
        Objects.equals(this.designChange, snFHistoryResponseDataInner.designChange) &&
        Objects.equals(this.engWorkshop, snFHistoryResponseDataInner.engWorkshop) &&
        Objects.equals(this.engWorkshopChange, snFHistoryResponseDataInner.engWorkshopChange) &&
        Objects.equals(this.lab, snFHistoryResponseDataInner.lab) &&
        Objects.equals(this.labChange, snFHistoryResponseDataInner.labChange) &&
        Objects.equals(this.commercial, snFHistoryResponseDataInner.commercial) &&
        Objects.equals(this.commercialChange, snFHistoryResponseDataInner.commercialChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(race, oa, oaChange, exp, expChange, mot, motChange, tech, techChange, stress, stressChange, conc, concChange, eff, effChange, wind, windChange, pit, pitChange, rdWorkshop, rdWorkshopChange, design, designChange, engWorkshop, engWorkshopChange, lab, labChange, commercial, commercialChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnFHistoryResponseDataInner {\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    oa: ").append(toIndentedString(oa)).append("\n");
    sb.append("    oaChange: ").append(toIndentedString(oaChange)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    expChange: ").append(toIndentedString(expChange)).append("\n");
    sb.append("    mot: ").append(toIndentedString(mot)).append("\n");
    sb.append("    motChange: ").append(toIndentedString(motChange)).append("\n");
    sb.append("    tech: ").append(toIndentedString(tech)).append("\n");
    sb.append("    techChange: ").append(toIndentedString(techChange)).append("\n");
    sb.append("    stress: ").append(toIndentedString(stress)).append("\n");
    sb.append("    stressChange: ").append(toIndentedString(stressChange)).append("\n");
    sb.append("    conc: ").append(toIndentedString(conc)).append("\n");
    sb.append("    concChange: ").append(toIndentedString(concChange)).append("\n");
    sb.append("    eff: ").append(toIndentedString(eff)).append("\n");
    sb.append("    effChange: ").append(toIndentedString(effChange)).append("\n");
    sb.append("    wind: ").append(toIndentedString(wind)).append("\n");
    sb.append("    windChange: ").append(toIndentedString(windChange)).append("\n");
    sb.append("    pit: ").append(toIndentedString(pit)).append("\n");
    sb.append("    pitChange: ").append(toIndentedString(pitChange)).append("\n");
    sb.append("    rdWorkshop: ").append(toIndentedString(rdWorkshop)).append("\n");
    sb.append("    rdWorkshopChange: ").append(toIndentedString(rdWorkshopChange)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    designChange: ").append(toIndentedString(designChange)).append("\n");
    sb.append("    engWorkshop: ").append(toIndentedString(engWorkshop)).append("\n");
    sb.append("    engWorkshopChange: ").append(toIndentedString(engWorkshopChange)).append("\n");
    sb.append("    lab: ").append(toIndentedString(lab)).append("\n");
    sb.append("    labChange: ").append(toIndentedString(labChange)).append("\n");
    sb.append("    commercial: ").append(toIndentedString(commercial)).append("\n");
    sb.append("    commercialChange: ").append(toIndentedString(commercialChange)).append("\n");
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

