package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MenuResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class MenuResponse {

  private @Nullable Integer IDM;

  private @Nullable String staticContentServer;

  private @Nullable String twemojiBaseUrl;

  private @Nullable BigDecimal credits;

  private @Nullable String email;

  private @Nullable String fName;

  private @Nullable String lName;

  private @Nullable String natCode;

  private @Nullable String group;

  private @Nullable String groupShort;

  private @Nullable String propertyClass;

  private @Nullable String accStatus;

  private @Nullable Integer accStatusId;

  private @Nullable Integer cash;

  private @Nullable Integer champs;

  private @Nullable String picPath;

  private @Nullable Integer teamId;

  private @Nullable BigDecimal teamCredits;

  private @Nullable Integer driverId;

  @Valid
  private List<Integer> friends = new ArrayList<>();

  @Valid
  private List<Integer> muted = new ArrayList<>();

  @Valid
  private List<Integer> teammates = new ArrayList<>();

  private @Nullable Integer apiRequestsRemaining;

  public MenuResponse IDM(@Nullable Integer IDM) {
    this.IDM = IDM;
    return this;
  }

  /**
   * Get IDM
   * @return IDM
   */
  
  @JsonProperty("IDM")
  public @Nullable Integer getIDM() {
    return IDM;
  }

  public void setIDM(@Nullable Integer IDM) {
    this.IDM = IDM;
  }

  public MenuResponse staticContentServer(@Nullable String staticContentServer) {
    this.staticContentServer = staticContentServer;
    return this;
  }

  /**
   * Get staticContentServer
   * @return staticContentServer
   */
  
  @JsonProperty("staticContentServer")
  public @Nullable String getStaticContentServer() {
    return staticContentServer;
  }

  public void setStaticContentServer(@Nullable String staticContentServer) {
    this.staticContentServer = staticContentServer;
  }

  public MenuResponse twemojiBaseUrl(@Nullable String twemojiBaseUrl) {
    this.twemojiBaseUrl = twemojiBaseUrl;
    return this;
  }

  /**
   * Get twemojiBaseUrl
   * @return twemojiBaseUrl
   */
  
  @JsonProperty("twemojiBaseUrl")
  public @Nullable String getTwemojiBaseUrl() {
    return twemojiBaseUrl;
  }

  public void setTwemojiBaseUrl(@Nullable String twemojiBaseUrl) {
    this.twemojiBaseUrl = twemojiBaseUrl;
  }

  public MenuResponse credits(@Nullable BigDecimal credits) {
    this.credits = credits;
    return this;
  }

  /**
   * Get credits
   * @return credits
   */
  @Valid 
  @JsonProperty("credits")
  public @Nullable BigDecimal getCredits() {
    return credits;
  }

  public void setCredits(@Nullable BigDecimal credits) {
    this.credits = credits;
  }

  public MenuResponse email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  public MenuResponse fName(@Nullable String fName) {
    this.fName = fName;
    return this;
  }

  /**
   * Get fName
   * @return fName
   */
  
  @JsonProperty("fName")
  public @Nullable String getfName() {
    return fName;
  }

  public void setfName(@Nullable String fName) {
    this.fName = fName;
  }

  public MenuResponse lName(@Nullable String lName) {
    this.lName = lName;
    return this;
  }

  /**
   * Get lName
   * @return lName
   */
  
  @JsonProperty("lName")
  public @Nullable String getlName() {
    return lName;
  }

  public void setlName(@Nullable String lName) {
    this.lName = lName;
  }

  public MenuResponse natCode(@Nullable String natCode) {
    this.natCode = natCode;
    return this;
  }

  /**
   * Get natCode
   * @return natCode
   */
  
  @JsonProperty("natCode")
  public @Nullable String getNatCode() {
    return natCode;
  }

  public void setNatCode(@Nullable String natCode) {
    this.natCode = natCode;
  }

  public MenuResponse group(@Nullable String group) {
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

  public MenuResponse groupShort(@Nullable String groupShort) {
    this.groupShort = groupShort;
    return this;
  }

  /**
   * Get groupShort
   * @return groupShort
   */
  
  @JsonProperty("groupShort")
  public @Nullable String getGroupShort() {
    return groupShort;
  }

  public void setGroupShort(@Nullable String groupShort) {
    this.groupShort = groupShort;
  }

  public MenuResponse propertyClass(@Nullable String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
   */
  
  @JsonProperty("class")
  public @Nullable String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(@Nullable String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public MenuResponse accStatus(@Nullable String accStatus) {
    this.accStatus = accStatus;
    return this;
  }

  /**
   * Get accStatus
   * @return accStatus
   */
  
  @JsonProperty("accStatus")
  public @Nullable String getAccStatus() {
    return accStatus;
  }

  public void setAccStatus(@Nullable String accStatus) {
    this.accStatus = accStatus;
  }

  public MenuResponse accStatusId(@Nullable Integer accStatusId) {
    this.accStatusId = accStatusId;
    return this;
  }

  /**
   * Get accStatusId
   * @return accStatusId
   */
  
  @JsonProperty("accStatusId")
  public @Nullable Integer getAccStatusId() {
    return accStatusId;
  }

  public void setAccStatusId(@Nullable Integer accStatusId) {
    this.accStatusId = accStatusId;
  }

  public MenuResponse cash(@Nullable Integer cash) {
    this.cash = cash;
    return this;
  }

  /**
   * Get cash
   * @return cash
   */
  
  @JsonProperty("cash")
  public @Nullable Integer getCash() {
    return cash;
  }

  public void setCash(@Nullable Integer cash) {
    this.cash = cash;
  }

  public MenuResponse champs(@Nullable Integer champs) {
    this.champs = champs;
    return this;
  }

  /**
   * Get champs
   * @return champs
   */
  
  @JsonProperty("champs")
  public @Nullable Integer getChamps() {
    return champs;
  }

  public void setChamps(@Nullable Integer champs) {
    this.champs = champs;
  }

  public MenuResponse picPath(@Nullable String picPath) {
    this.picPath = picPath;
    return this;
  }

  /**
   * Get picPath
   * @return picPath
   */
  
  @JsonProperty("picPath")
  public @Nullable String getPicPath() {
    return picPath;
  }

  public void setPicPath(@Nullable String picPath) {
    this.picPath = picPath;
  }

  public MenuResponse teamId(@Nullable Integer teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   */
  
  @JsonProperty("teamId")
  public @Nullable Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(@Nullable Integer teamId) {
    this.teamId = teamId;
  }

  public MenuResponse teamCredits(@Nullable BigDecimal teamCredits) {
    this.teamCredits = teamCredits;
    return this;
  }

  /**
   * Get teamCredits
   * @return teamCredits
   */
  @Valid 
  @JsonProperty("teamCredits")
  public @Nullable BigDecimal getTeamCredits() {
    return teamCredits;
  }

  public void setTeamCredits(@Nullable BigDecimal teamCredits) {
    this.teamCredits = teamCredits;
  }

  public MenuResponse driverId(@Nullable Integer driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * Get driverId
   * @return driverId
   */
  
  @JsonProperty("driverId")
  public @Nullable Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(@Nullable Integer driverId) {
    this.driverId = driverId;
  }

  public MenuResponse friends(List<Integer> friends) {
    this.friends = friends;
    return this;
  }

  public MenuResponse addFriendsItem(Integer friendsItem) {
    if (this.friends == null) {
      this.friends = new ArrayList<>();
    }
    this.friends.add(friendsItem);
    return this;
  }

  /**
   * Get friends
   * @return friends
   */
  
  @JsonProperty("friends")
  public List<Integer> getFriends() {
    return friends;
  }

  public void setFriends(List<Integer> friends) {
    this.friends = friends;
  }

  public MenuResponse muted(List<Integer> muted) {
    this.muted = muted;
    return this;
  }

  public MenuResponse addMutedItem(Integer mutedItem) {
    if (this.muted == null) {
      this.muted = new ArrayList<>();
    }
    this.muted.add(mutedItem);
    return this;
  }

  /**
   * Get muted
   * @return muted
   */
  
  @JsonProperty("muted")
  public List<Integer> getMuted() {
    return muted;
  }

  public void setMuted(List<Integer> muted) {
    this.muted = muted;
  }

  public MenuResponse teammates(List<Integer> teammates) {
    this.teammates = teammates;
    return this;
  }

  public MenuResponse addTeammatesItem(Integer teammatesItem) {
    if (this.teammates == null) {
      this.teammates = new ArrayList<>();
    }
    this.teammates.add(teammatesItem);
    return this;
  }

  /**
   * Get teammates
   * @return teammates
   */
  
  @JsonProperty("teammates")
  public List<Integer> getTeammates() {
    return teammates;
  }

  public void setTeammates(List<Integer> teammates) {
    this.teammates = teammates;
  }

  public MenuResponse apiRequestsRemaining(@Nullable Integer apiRequestsRemaining) {
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
    MenuResponse menuResponse = (MenuResponse) o;
    return Objects.equals(this.IDM, menuResponse.IDM) &&
        Objects.equals(this.staticContentServer, menuResponse.staticContentServer) &&
        Objects.equals(this.twemojiBaseUrl, menuResponse.twemojiBaseUrl) &&
        Objects.equals(this.credits, menuResponse.credits) &&
        Objects.equals(this.email, menuResponse.email) &&
        Objects.equals(this.fName, menuResponse.fName) &&
        Objects.equals(this.lName, menuResponse.lName) &&
        Objects.equals(this.natCode, menuResponse.natCode) &&
        Objects.equals(this.group, menuResponse.group) &&
        Objects.equals(this.groupShort, menuResponse.groupShort) &&
        Objects.equals(this.propertyClass, menuResponse.propertyClass) &&
        Objects.equals(this.accStatus, menuResponse.accStatus) &&
        Objects.equals(this.accStatusId, menuResponse.accStatusId) &&
        Objects.equals(this.cash, menuResponse.cash) &&
        Objects.equals(this.champs, menuResponse.champs) &&
        Objects.equals(this.picPath, menuResponse.picPath) &&
        Objects.equals(this.teamId, menuResponse.teamId) &&
        Objects.equals(this.teamCredits, menuResponse.teamCredits) &&
        Objects.equals(this.driverId, menuResponse.driverId) &&
        Objects.equals(this.friends, menuResponse.friends) &&
        Objects.equals(this.muted, menuResponse.muted) &&
        Objects.equals(this.teammates, menuResponse.teammates) &&
        Objects.equals(this.apiRequestsRemaining, menuResponse.apiRequestsRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IDM, staticContentServer, twemojiBaseUrl, credits, email, fName, lName, natCode, group, groupShort, propertyClass, accStatus, accStatusId, cash, champs, picPath, teamId, teamCredits, driverId, friends, muted, teammates, apiRequestsRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuResponse {\n");
    sb.append("    IDM: ").append(toIndentedString(IDM)).append("\n");
    sb.append("    staticContentServer: ").append(toIndentedString(staticContentServer)).append("\n");
    sb.append("    twemojiBaseUrl: ").append(toIndentedString(twemojiBaseUrl)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fName: ").append(toIndentedString(fName)).append("\n");
    sb.append("    lName: ").append(toIndentedString(lName)).append("\n");
    sb.append("    natCode: ").append(toIndentedString(natCode)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupShort: ").append(toIndentedString(groupShort)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    accStatus: ").append(toIndentedString(accStatus)).append("\n");
    sb.append("    accStatusId: ").append(toIndentedString(accStatusId)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    champs: ").append(toIndentedString(champs)).append("\n");
    sb.append("    picPath: ").append(toIndentedString(picPath)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamCredits: ").append(toIndentedString(teamCredits)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    teammates: ").append(toIndentedString(teammates)).append("\n");
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

