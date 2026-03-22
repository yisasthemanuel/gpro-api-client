package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONBody;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONEar;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONEye;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONEyebrow;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONHair;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONHairBg;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONHead;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONMouth;
import org.jlobato.gpro.proxy.model.DriverProfileResponseFaceJSONNose;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DriverProfileResponseFaceJSON
 */

@JsonTypeName("DriverProfileResponse_faceJSON")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DriverProfileResponseFaceJSON {

  private @Nullable BigDecimal fatness;

  @Valid
  private List<String> teamColors = new ArrayList<>();

  private @Nullable DriverProfileResponseFaceJSONHairBg hairBg;

  private @Nullable DriverProfileResponseFaceJSONBody body;

  private @Nullable DriverProfileResponseFaceJSONHairBg jersey;

  private @Nullable DriverProfileResponseFaceJSONEar ear;

  private @Nullable DriverProfileResponseFaceJSONHead head;

  private @Nullable DriverProfileResponseFaceJSONHairBg eyeLine;

  private @Nullable DriverProfileResponseFaceJSONEar smileLine;

  private @Nullable DriverProfileResponseFaceJSONHairBg miscLine;

  private @Nullable DriverProfileResponseFaceJSONHairBg facialHair;

  private @Nullable DriverProfileResponseFaceJSONEye eye;

  private @Nullable DriverProfileResponseFaceJSONEyebrow eyebrow;

  private @Nullable DriverProfileResponseFaceJSONHair hair;

  private @Nullable DriverProfileResponseFaceJSONMouth mouth;

  private @Nullable DriverProfileResponseFaceJSONNose nose;

  private @Nullable DriverProfileResponseFaceJSONHairBg glasses;

  private @Nullable DriverProfileResponseFaceJSONHairBg accessories;

  private @Nullable DriverProfileResponseFaceJSONHairBg blemish;

  private @Nullable DriverProfileResponseFaceJSONHairBg earring;

  public DriverProfileResponseFaceJSON fatness(@Nullable BigDecimal fatness) {
    this.fatness = fatness;
    return this;
  }

  /**
   * Get fatness
   * @return fatness
   */
  @Valid 
  @JsonProperty("fatness")
  public @Nullable BigDecimal getFatness() {
    return fatness;
  }

  public void setFatness(@Nullable BigDecimal fatness) {
    this.fatness = fatness;
  }

  public DriverProfileResponseFaceJSON teamColors(List<String> teamColors) {
    this.teamColors = teamColors;
    return this;
  }

  public DriverProfileResponseFaceJSON addTeamColorsItem(String teamColorsItem) {
    if (this.teamColors == null) {
      this.teamColors = new ArrayList<>();
    }
    this.teamColors.add(teamColorsItem);
    return this;
  }

  /**
   * Get teamColors
   * @return teamColors
   */
  
  @JsonProperty("teamColors")
  public List<String> getTeamColors() {
    return teamColors;
  }

  public void setTeamColors(List<String> teamColors) {
    this.teamColors = teamColors;
  }

  public DriverProfileResponseFaceJSON hairBg(@Nullable DriverProfileResponseFaceJSONHairBg hairBg) {
    this.hairBg = hairBg;
    return this;
  }

  /**
   * Get hairBg
   * @return hairBg
   */
  @Valid 
  @JsonProperty("hairBg")
  public @Nullable DriverProfileResponseFaceJSONHairBg getHairBg() {
    return hairBg;
  }

  public void setHairBg(@Nullable DriverProfileResponseFaceJSONHairBg hairBg) {
    this.hairBg = hairBg;
  }

  public DriverProfileResponseFaceJSON body(@Nullable DriverProfileResponseFaceJSONBody body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  @Valid 
  @JsonProperty("body")
  public @Nullable DriverProfileResponseFaceJSONBody getBody() {
    return body;
  }

  public void setBody(@Nullable DriverProfileResponseFaceJSONBody body) {
    this.body = body;
  }

  public DriverProfileResponseFaceJSON jersey(@Nullable DriverProfileResponseFaceJSONHairBg jersey) {
    this.jersey = jersey;
    return this;
  }

  /**
   * Get jersey
   * @return jersey
   */
  @Valid 
  @JsonProperty("jersey")
  public @Nullable DriverProfileResponseFaceJSONHairBg getJersey() {
    return jersey;
  }

  public void setJersey(@Nullable DriverProfileResponseFaceJSONHairBg jersey) {
    this.jersey = jersey;
  }

  public DriverProfileResponseFaceJSON ear(@Nullable DriverProfileResponseFaceJSONEar ear) {
    this.ear = ear;
    return this;
  }

  /**
   * Get ear
   * @return ear
   */
  @Valid 
  @JsonProperty("ear")
  public @Nullable DriverProfileResponseFaceJSONEar getEar() {
    return ear;
  }

  public void setEar(@Nullable DriverProfileResponseFaceJSONEar ear) {
    this.ear = ear;
  }

  public DriverProfileResponseFaceJSON head(@Nullable DriverProfileResponseFaceJSONHead head) {
    this.head = head;
    return this;
  }

  /**
   * Get head
   * @return head
   */
  @Valid 
  @JsonProperty("head")
  public @Nullable DriverProfileResponseFaceJSONHead getHead() {
    return head;
  }

  public void setHead(@Nullable DriverProfileResponseFaceJSONHead head) {
    this.head = head;
  }

  public DriverProfileResponseFaceJSON eyeLine(@Nullable DriverProfileResponseFaceJSONHairBg eyeLine) {
    this.eyeLine = eyeLine;
    return this;
  }

  /**
   * Get eyeLine
   * @return eyeLine
   */
  @Valid 
  @JsonProperty("eyeLine")
  public @Nullable DriverProfileResponseFaceJSONHairBg getEyeLine() {
    return eyeLine;
  }

  public void setEyeLine(@Nullable DriverProfileResponseFaceJSONHairBg eyeLine) {
    this.eyeLine = eyeLine;
  }

  public DriverProfileResponseFaceJSON smileLine(@Nullable DriverProfileResponseFaceJSONEar smileLine) {
    this.smileLine = smileLine;
    return this;
  }

  /**
   * Get smileLine
   * @return smileLine
   */
  @Valid 
  @JsonProperty("smileLine")
  public @Nullable DriverProfileResponseFaceJSONEar getSmileLine() {
    return smileLine;
  }

  public void setSmileLine(@Nullable DriverProfileResponseFaceJSONEar smileLine) {
    this.smileLine = smileLine;
  }

  public DriverProfileResponseFaceJSON miscLine(@Nullable DriverProfileResponseFaceJSONHairBg miscLine) {
    this.miscLine = miscLine;
    return this;
  }

  /**
   * Get miscLine
   * @return miscLine
   */
  @Valid 
  @JsonProperty("miscLine")
  public @Nullable DriverProfileResponseFaceJSONHairBg getMiscLine() {
    return miscLine;
  }

  public void setMiscLine(@Nullable DriverProfileResponseFaceJSONHairBg miscLine) {
    this.miscLine = miscLine;
  }

  public DriverProfileResponseFaceJSON facialHair(@Nullable DriverProfileResponseFaceJSONHairBg facialHair) {
    this.facialHair = facialHair;
    return this;
  }

  /**
   * Get facialHair
   * @return facialHair
   */
  @Valid 
  @JsonProperty("facialHair")
  public @Nullable DriverProfileResponseFaceJSONHairBg getFacialHair() {
    return facialHair;
  }

  public void setFacialHair(@Nullable DriverProfileResponseFaceJSONHairBg facialHair) {
    this.facialHair = facialHair;
  }

  public DriverProfileResponseFaceJSON eye(@Nullable DriverProfileResponseFaceJSONEye eye) {
    this.eye = eye;
    return this;
  }

  /**
   * Get eye
   * @return eye
   */
  @Valid 
  @JsonProperty("eye")
  public @Nullable DriverProfileResponseFaceJSONEye getEye() {
    return eye;
  }

  public void setEye(@Nullable DriverProfileResponseFaceJSONEye eye) {
    this.eye = eye;
  }

  public DriverProfileResponseFaceJSON eyebrow(@Nullable DriverProfileResponseFaceJSONEyebrow eyebrow) {
    this.eyebrow = eyebrow;
    return this;
  }

  /**
   * Get eyebrow
   * @return eyebrow
   */
  @Valid 
  @JsonProperty("eyebrow")
  public @Nullable DriverProfileResponseFaceJSONEyebrow getEyebrow() {
    return eyebrow;
  }

  public void setEyebrow(@Nullable DriverProfileResponseFaceJSONEyebrow eyebrow) {
    this.eyebrow = eyebrow;
  }

  public DriverProfileResponseFaceJSON hair(@Nullable DriverProfileResponseFaceJSONHair hair) {
    this.hair = hair;
    return this;
  }

  /**
   * Get hair
   * @return hair
   */
  @Valid 
  @JsonProperty("hair")
  public @Nullable DriverProfileResponseFaceJSONHair getHair() {
    return hair;
  }

  public void setHair(@Nullable DriverProfileResponseFaceJSONHair hair) {
    this.hair = hair;
  }

  public DriverProfileResponseFaceJSON mouth(@Nullable DriverProfileResponseFaceJSONMouth mouth) {
    this.mouth = mouth;
    return this;
  }

  /**
   * Get mouth
   * @return mouth
   */
  @Valid 
  @JsonProperty("mouth")
  public @Nullable DriverProfileResponseFaceJSONMouth getMouth() {
    return mouth;
  }

  public void setMouth(@Nullable DriverProfileResponseFaceJSONMouth mouth) {
    this.mouth = mouth;
  }

  public DriverProfileResponseFaceJSON nose(@Nullable DriverProfileResponseFaceJSONNose nose) {
    this.nose = nose;
    return this;
  }

  /**
   * Get nose
   * @return nose
   */
  @Valid 
  @JsonProperty("nose")
  public @Nullable DriverProfileResponseFaceJSONNose getNose() {
    return nose;
  }

  public void setNose(@Nullable DriverProfileResponseFaceJSONNose nose) {
    this.nose = nose;
  }

  public DriverProfileResponseFaceJSON glasses(@Nullable DriverProfileResponseFaceJSONHairBg glasses) {
    this.glasses = glasses;
    return this;
  }

  /**
   * Get glasses
   * @return glasses
   */
  @Valid 
  @JsonProperty("glasses")
  public @Nullable DriverProfileResponseFaceJSONHairBg getGlasses() {
    return glasses;
  }

  public void setGlasses(@Nullable DriverProfileResponseFaceJSONHairBg glasses) {
    this.glasses = glasses;
  }

  public DriverProfileResponseFaceJSON accessories(@Nullable DriverProfileResponseFaceJSONHairBg accessories) {
    this.accessories = accessories;
    return this;
  }

  /**
   * Get accessories
   * @return accessories
   */
  @Valid 
  @JsonProperty("accessories")
  public @Nullable DriverProfileResponseFaceJSONHairBg getAccessories() {
    return accessories;
  }

  public void setAccessories(@Nullable DriverProfileResponseFaceJSONHairBg accessories) {
    this.accessories = accessories;
  }

  public DriverProfileResponseFaceJSON blemish(@Nullable DriverProfileResponseFaceJSONHairBg blemish) {
    this.blemish = blemish;
    return this;
  }

  /**
   * Get blemish
   * @return blemish
   */
  @Valid 
  @JsonProperty("blemish")
  public @Nullable DriverProfileResponseFaceJSONHairBg getBlemish() {
    return blemish;
  }

  public void setBlemish(@Nullable DriverProfileResponseFaceJSONHairBg blemish) {
    this.blemish = blemish;
  }

  public DriverProfileResponseFaceJSON earring(@Nullable DriverProfileResponseFaceJSONHairBg earring) {
    this.earring = earring;
    return this;
  }

  /**
   * Get earring
   * @return earring
   */
  @Valid 
  @JsonProperty("earring")
  public @Nullable DriverProfileResponseFaceJSONHairBg getEarring() {
    return earring;
  }

  public void setEarring(@Nullable DriverProfileResponseFaceJSONHairBg earring) {
    this.earring = earring;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverProfileResponseFaceJSON driverProfileResponseFaceJSON = (DriverProfileResponseFaceJSON) o;
    return Objects.equals(this.fatness, driverProfileResponseFaceJSON.fatness) &&
        Objects.equals(this.teamColors, driverProfileResponseFaceJSON.teamColors) &&
        Objects.equals(this.hairBg, driverProfileResponseFaceJSON.hairBg) &&
        Objects.equals(this.body, driverProfileResponseFaceJSON.body) &&
        Objects.equals(this.jersey, driverProfileResponseFaceJSON.jersey) &&
        Objects.equals(this.ear, driverProfileResponseFaceJSON.ear) &&
        Objects.equals(this.head, driverProfileResponseFaceJSON.head) &&
        Objects.equals(this.eyeLine, driverProfileResponseFaceJSON.eyeLine) &&
        Objects.equals(this.smileLine, driverProfileResponseFaceJSON.smileLine) &&
        Objects.equals(this.miscLine, driverProfileResponseFaceJSON.miscLine) &&
        Objects.equals(this.facialHair, driverProfileResponseFaceJSON.facialHair) &&
        Objects.equals(this.eye, driverProfileResponseFaceJSON.eye) &&
        Objects.equals(this.eyebrow, driverProfileResponseFaceJSON.eyebrow) &&
        Objects.equals(this.hair, driverProfileResponseFaceJSON.hair) &&
        Objects.equals(this.mouth, driverProfileResponseFaceJSON.mouth) &&
        Objects.equals(this.nose, driverProfileResponseFaceJSON.nose) &&
        Objects.equals(this.glasses, driverProfileResponseFaceJSON.glasses) &&
        Objects.equals(this.accessories, driverProfileResponseFaceJSON.accessories) &&
        Objects.equals(this.blemish, driverProfileResponseFaceJSON.blemish) &&
        Objects.equals(this.earring, driverProfileResponseFaceJSON.earring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fatness, teamColors, hairBg, body, jersey, ear, head, eyeLine, smileLine, miscLine, facialHair, eye, eyebrow, hair, mouth, nose, glasses, accessories, blemish, earring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverProfileResponseFaceJSON {\n");
    sb.append("    fatness: ").append(toIndentedString(fatness)).append("\n");
    sb.append("    teamColors: ").append(toIndentedString(teamColors)).append("\n");
    sb.append("    hairBg: ").append(toIndentedString(hairBg)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    jersey: ").append(toIndentedString(jersey)).append("\n");
    sb.append("    ear: ").append(toIndentedString(ear)).append("\n");
    sb.append("    head: ").append(toIndentedString(head)).append("\n");
    sb.append("    eyeLine: ").append(toIndentedString(eyeLine)).append("\n");
    sb.append("    smileLine: ").append(toIndentedString(smileLine)).append("\n");
    sb.append("    miscLine: ").append(toIndentedString(miscLine)).append("\n");
    sb.append("    facialHair: ").append(toIndentedString(facialHair)).append("\n");
    sb.append("    eye: ").append(toIndentedString(eye)).append("\n");
    sb.append("    eyebrow: ").append(toIndentedString(eyebrow)).append("\n");
    sb.append("    hair: ").append(toIndentedString(hair)).append("\n");
    sb.append("    mouth: ").append(toIndentedString(mouth)).append("\n");
    sb.append("    nose: ").append(toIndentedString(nose)).append("\n");
    sb.append("    glasses: ").append(toIndentedString(glasses)).append("\n");
    sb.append("    accessories: ").append(toIndentedString(accessories)).append("\n");
    sb.append("    blemish: ").append(toIndentedString(blemish)).append("\n");
    sb.append("    earring: ").append(toIndentedString(earring)).append("\n");
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

