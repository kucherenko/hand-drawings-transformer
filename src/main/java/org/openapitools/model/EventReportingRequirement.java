package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Accuracy;
import org.openapitools.model.AnalyticsMetadata;
import org.openapitools.model.AnalyticsMetadataIndication;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the type of reporting that the subscription requires.
 */
@ApiModel(description = "Represents the type of reporting that the subscription requires.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class EventReportingRequirement   {
  @JsonProperty("accuracy")
  private Accuracy accuracy;

  @JsonProperty("startTs")
  private OffsetDateTime startTs;

  @JsonProperty("endTs")
  private OffsetDateTime endTs;

  @JsonProperty("sampRatio")
  private Integer sampRatio;

  @JsonProperty("maxObjectNbr")
  private Integer maxObjectNbr;

  @JsonProperty("maxSupiNbr")
  private Integer maxSupiNbr;

  @JsonProperty("timeAnaNeeded")
  private OffsetDateTime timeAnaNeeded;

  @JsonProperty("anaMeta")
  @Valid
  private List<AnalyticsMetadata> anaMeta = null;

  @JsonProperty("anaMetaInd")
  private AnalyticsMetadataIndication anaMetaInd;

  public EventReportingRequirement accuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Get accuracy
   * @return accuracy
  */
  @ApiModelProperty(value = "")

  @Valid

  public Accuracy getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
  }

  public EventReportingRequirement startTs(OffsetDateTime startTs) {
    this.startTs = startTs;
    return this;
  }

  /**
   * Get startTs
   * @return startTs
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTs() {
    return startTs;
  }

  public void setStartTs(OffsetDateTime startTs) {
    this.startTs = startTs;
  }

  public EventReportingRequirement endTs(OffsetDateTime endTs) {
    this.endTs = endTs;
    return this;
  }

  /**
   * Get endTs
   * @return endTs
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTs() {
    return endTs;
  }

  public void setEndTs(OffsetDateTime endTs) {
    this.endTs = endTs;
  }

  public EventReportingRequirement sampRatio(Integer sampRatio) {
    this.sampRatio = sampRatio;
    return this;
  }

  /**
   * Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.
   * minimum: 1
   * maximum: 100
   * @return sampRatio
  */
  @ApiModelProperty(value = "Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.")

@Min(1) @Max(100) 
  public Integer getSampRatio() {
    return sampRatio;
  }

  public void setSampRatio(Integer sampRatio) {
    this.sampRatio = sampRatio;
  }

  public EventReportingRequirement maxObjectNbr(Integer maxObjectNbr) {
    this.maxObjectNbr = maxObjectNbr;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return maxObjectNbr
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0) 
  public Integer getMaxObjectNbr() {
    return maxObjectNbr;
  }

  public void setMaxObjectNbr(Integer maxObjectNbr) {
    this.maxObjectNbr = maxObjectNbr;
  }

  public EventReportingRequirement maxSupiNbr(Integer maxSupiNbr) {
    this.maxSupiNbr = maxSupiNbr;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return maxSupiNbr
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0) 
  public Integer getMaxSupiNbr() {
    return maxSupiNbr;
  }

  public void setMaxSupiNbr(Integer maxSupiNbr) {
    this.maxSupiNbr = maxSupiNbr;
  }

  public EventReportingRequirement timeAnaNeeded(OffsetDateTime timeAnaNeeded) {
    this.timeAnaNeeded = timeAnaNeeded;
    return this;
  }

  /**
   * Get timeAnaNeeded
   * @return timeAnaNeeded
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimeAnaNeeded() {
    return timeAnaNeeded;
  }

  public void setTimeAnaNeeded(OffsetDateTime timeAnaNeeded) {
    this.timeAnaNeeded = timeAnaNeeded;
  }

  public EventReportingRequirement anaMeta(List<AnalyticsMetadata> anaMeta) {
    this.anaMeta = anaMeta;
    return this;
  }

  public EventReportingRequirement addAnaMetaItem(AnalyticsMetadata anaMetaItem) {
    if (this.anaMeta == null) {
      this.anaMeta = new ArrayList<>();
    }
    this.anaMeta.add(anaMetaItem);
    return this;
  }

  /**
   * Get anaMeta
   * @return anaMeta
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<AnalyticsMetadata> getAnaMeta() {
    return anaMeta;
  }

  public void setAnaMeta(List<AnalyticsMetadata> anaMeta) {
    this.anaMeta = anaMeta;
  }

  public EventReportingRequirement anaMetaInd(AnalyticsMetadataIndication anaMetaInd) {
    this.anaMetaInd = anaMetaInd;
    return this;
  }

  /**
   * Get anaMetaInd
   * @return anaMetaInd
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnalyticsMetadataIndication getAnaMetaInd() {
    return anaMetaInd;
  }

  public void setAnaMetaInd(AnalyticsMetadataIndication anaMetaInd) {
    this.anaMetaInd = anaMetaInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventReportingRequirement eventReportingRequirement = (EventReportingRequirement) o;
    return Objects.equals(this.accuracy, eventReportingRequirement.accuracy) &&
        Objects.equals(this.startTs, eventReportingRequirement.startTs) &&
        Objects.equals(this.endTs, eventReportingRequirement.endTs) &&
        Objects.equals(this.sampRatio, eventReportingRequirement.sampRatio) &&
        Objects.equals(this.maxObjectNbr, eventReportingRequirement.maxObjectNbr) &&
        Objects.equals(this.maxSupiNbr, eventReportingRequirement.maxSupiNbr) &&
        Objects.equals(this.timeAnaNeeded, eventReportingRequirement.timeAnaNeeded) &&
        Objects.equals(this.anaMeta, eventReportingRequirement.anaMeta) &&
        Objects.equals(this.anaMetaInd, eventReportingRequirement.anaMetaInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, startTs, endTs, sampRatio, maxObjectNbr, maxSupiNbr, timeAnaNeeded, anaMeta, anaMetaInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventReportingRequirement {\n");
    
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    sampRatio: ").append(toIndentedString(sampRatio)).append("\n");
    sb.append("    maxObjectNbr: ").append(toIndentedString(maxObjectNbr)).append("\n");
    sb.append("    maxSupiNbr: ").append(toIndentedString(maxSupiNbr)).append("\n");
    sb.append("    timeAnaNeeded: ").append(toIndentedString(timeAnaNeeded)).append("\n");
    sb.append("    anaMeta: ").append(toIndentedString(anaMeta)).append("\n");
    sb.append("    anaMetaInd: ").append(toIndentedString(anaMetaInd)).append("\n");
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

