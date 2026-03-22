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
 * HistoryGroupStandingsResponseManagersInnerResultsInner
 */

@JsonTypeName("HistoryGroupStandingsResponse_managers_inner_results_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class HistoryGroupStandingsResponseManagersInnerResultsInner {

  private @Nullable String pos;

  private @Nullable String pts;

  private @Nullable String grid;

  public HistoryGroupStandingsResponseManagersInnerResultsInner pos(@Nullable String pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
   */
  
  @JsonProperty("pos")
  public @Nullable String getPos() {
    return pos;
  }

  public void setPos(@Nullable String pos) {
    this.pos = pos;
  }

  public HistoryGroupStandingsResponseManagersInnerResultsInner pts(@Nullable String pts) {
    this.pts = pts;
    return this;
  }

  /**
   * Get pts
   * @return pts
   */
  
  @JsonProperty("pts")
  public @Nullable String getPts() {
    return pts;
  }

  public void setPts(@Nullable String pts) {
    this.pts = pts;
  }

  public HistoryGroupStandingsResponseManagersInnerResultsInner grid(@Nullable String grid) {
    this.grid = grid;
    return this;
  }

  /**
   * Get grid
   * @return grid
   */
  
  @JsonProperty("grid")
  public @Nullable String getGrid() {
    return grid;
  }

  public void setGrid(@Nullable String grid) {
    this.grid = grid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryGroupStandingsResponseManagersInnerResultsInner historyGroupStandingsResponseManagersInnerResultsInner = (HistoryGroupStandingsResponseManagersInnerResultsInner) o;
    return Objects.equals(this.pos, historyGroupStandingsResponseManagersInnerResultsInner.pos) &&
        Objects.equals(this.pts, historyGroupStandingsResponseManagersInnerResultsInner.pts) &&
        Objects.equals(this.grid, historyGroupStandingsResponseManagersInnerResultsInner.grid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, pts, grid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryGroupStandingsResponseManagersInnerResultsInner {\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    pts: ").append(toIndentedString(pts)).append("\n");
    sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
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

