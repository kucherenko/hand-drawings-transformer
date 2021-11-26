package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.LocationInfo;
import org.openapitools.model.ScheduledCommunicationTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents UE mobility information.
 */
@ApiModel(description = "Represents UE mobility information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class UeMobility   {
  @JsonProperty("ts")
  private OffsetDateTime ts;

  @JsonProperty("recurringTime")
  private ScheduledCommunicationTime recurringTime;

  @JsonProperty("duration")
  private Integer duration;

  @JsonProperty("durationVariance")
  private Float durationVariance;

  @JsonProperty("locInfos")
  @Valid
  private List<LocationInfo> locInfos = new ArrayList<>();

  public UeMobility ts(OffsetDateTime ts) {
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

  public UeMobility recurringTime(ScheduledCommunicationTime recurringTime) {
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

  public UeMobility duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return duration
  */
  @ApiModelProperty(required = true, value = "indicating a time in seconds.")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public UeMobility durationVariance(Float durationVariance) {
    this.durationVariance = durationVariance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return durationVariance
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getDurationVariance() {
    return durationVariance;
  }

  public void setDurationVariance(Float durationVariance) {
    this.durationVariance = durationVariance;
  }

  public UeMobility locInfos(List<LocationInfo> locInfos) {
    this.locInfos = locInfos;
    return this;
  }

  public UeMobility addLocInfosItem(LocationInfo locInfosItem) {
    this.locInfos.add(locInfosItem);
    return this;
  }

  /**
   * Get locInfos
   * @return locInfos
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<LocationInfo> getLocInfos() {
    return locInfos;
  }

  public void setLocInfos(List<LocationInfo> locInfos) {
    this.locInfos = locInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UeMobility ueMobility = (UeMobility) o;
    return Objects.equals(this.ts, ueMobility.ts) &&
        Objects.equals(this.recurringTime, ueMobility.recurringTime) &&
        Objects.equals(this.duration, ueMobility.duration) &&
        Objects.equals(this.durationVariance, ueMobility.durationVariance) &&
        Objects.equals(this.locInfos, ueMobility.locInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, recurringTime, duration, durationVariance, locInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UeMobility {\n");
    
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    recurringTime: ").append(toIndentedString(recurringTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationVariance: ").append(toIndentedString(durationVariance)).append("\n");
    sb.append("    locInfos: ").append(toIndentedString(locInfos)).append("\n");
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
