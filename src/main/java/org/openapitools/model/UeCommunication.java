package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.ScheduledCommunicationTime;
import org.openapitools.model.TrafficCharacterization;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents UE communication information.
 */
@ApiModel(description = "Represents UE communication information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class UeCommunication   {
  @JsonProperty("commDur")
  private Integer commDur;

  @JsonProperty("commDurVariance")
  private Float commDurVariance;

  @JsonProperty("perioTime")
  private Integer perioTime;

  @JsonProperty("perioTimeVariance")
  private Float perioTimeVariance;

  @JsonProperty("ts")
  private OffsetDateTime ts;

  @JsonProperty("tsVariance")
  private Float tsVariance;

  @JsonProperty("recurringTime")
  private ScheduledCommunicationTime recurringTime;

  @JsonProperty("trafChar")
  private TrafficCharacterization trafChar;

  @JsonProperty("ratio")
  private Integer ratio;

  @JsonProperty("confidence")
  private Integer confidence;

  public UeCommunication commDur(Integer commDur) {
    this.commDur = commDur;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return commDur
  */
  @ApiModelProperty(required = true, value = "indicating a time in seconds.")
  @NotNull


  public Integer getCommDur() {
    return commDur;
  }

  public void setCommDur(Integer commDur) {
    this.commDur = commDur;
  }

  public UeCommunication commDurVariance(Float commDurVariance) {
    this.commDurVariance = commDurVariance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return commDurVariance
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getCommDurVariance() {
    return commDurVariance;
  }

  public void setCommDurVariance(Float commDurVariance) {
    this.commDurVariance = commDurVariance;
  }

  public UeCommunication perioTime(Integer perioTime) {
    this.perioTime = perioTime;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return perioTime
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getPerioTime() {
    return perioTime;
  }

  public void setPerioTime(Integer perioTime) {
    this.perioTime = perioTime;
  }

  public UeCommunication perioTimeVariance(Float perioTimeVariance) {
    this.perioTimeVariance = perioTimeVariance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return perioTimeVariance
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getPerioTimeVariance() {
    return perioTimeVariance;
  }

  public void setPerioTimeVariance(Float perioTimeVariance) {
    this.perioTimeVariance = perioTimeVariance;
  }

  public UeCommunication ts(OffsetDateTime ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Get ts
   * @return ts
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTs() {
    return ts;
  }

  public void setTs(OffsetDateTime ts) {
    this.ts = ts;
  }

  public UeCommunication tsVariance(Float tsVariance) {
    this.tsVariance = tsVariance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return tsVariance
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getTsVariance() {
    return tsVariance;
  }

  public void setTsVariance(Float tsVariance) {
    this.tsVariance = tsVariance;
  }

  public UeCommunication recurringTime(ScheduledCommunicationTime recurringTime) {
    this.recurringTime = recurringTime;
    return this;
  }

  /**
   * Get recurringTime
   * @return recurringTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public ScheduledCommunicationTime getRecurringTime() {
    return recurringTime;
  }

  public void setRecurringTime(ScheduledCommunicationTime recurringTime) {
    this.recurringTime = recurringTime;
  }

  public UeCommunication trafChar(TrafficCharacterization trafChar) {
    this.trafChar = trafChar;
    return this;
  }

  /**
   * Get trafChar
   * @return trafChar
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TrafficCharacterization getTrafChar() {
    return trafChar;
  }

  public void setTrafChar(TrafficCharacterization trafChar) {
    this.trafChar = trafChar;
  }

  public UeCommunication ratio(Integer ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.
   * minimum: 1
   * maximum: 100
   * @return ratio
  */
  @ApiModelProperty(value = "Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.")

@Min(1) @Max(100) 
  public Integer getRatio() {
    return ratio;
  }

  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  public UeCommunication confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return confidence
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0) 
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UeCommunication ueCommunication = (UeCommunication) o;
    return Objects.equals(this.commDur, ueCommunication.commDur) &&
        Objects.equals(this.commDurVariance, ueCommunication.commDurVariance) &&
        Objects.equals(this.perioTime, ueCommunication.perioTime) &&
        Objects.equals(this.perioTimeVariance, ueCommunication.perioTimeVariance) &&
        Objects.equals(this.ts, ueCommunication.ts) &&
        Objects.equals(this.tsVariance, ueCommunication.tsVariance) &&
        Objects.equals(this.recurringTime, ueCommunication.recurringTime) &&
        Objects.equals(this.trafChar, ueCommunication.trafChar) &&
        Objects.equals(this.ratio, ueCommunication.ratio) &&
        Objects.equals(this.confidence, ueCommunication.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commDur, commDurVariance, perioTime, perioTimeVariance, ts, tsVariance, recurringTime, trafChar, ratio, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UeCommunication {\n");
    
    sb.append("    commDur: ").append(toIndentedString(commDur)).append("\n");
    sb.append("    commDurVariance: ").append(toIndentedString(commDurVariance)).append("\n");
    sb.append("    perioTime: ").append(toIndentedString(perioTime)).append("\n");
    sb.append("    perioTimeVariance: ").append(toIndentedString(perioTimeVariance)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    tsVariance: ").append(toIndentedString(tsVariance)).append("\n");
    sb.append("    recurringTime: ").append(toIndentedString(recurringTime)).append("\n");
    sb.append("    trafChar: ").append(toIndentedString(trafChar)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

