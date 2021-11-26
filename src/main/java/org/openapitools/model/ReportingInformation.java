package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.NotificationFlag;
import org.openapitools.model.NotificationMethod1;
import org.openapitools.model.PartitioningCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the type of reporting that the subscription requires.
 */
@ApiModel(description = "Represents the type of reporting that the subscription requires.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class ReportingInformation   {
  @JsonProperty("immRep")
  private Boolean immRep;

  @JsonProperty("notifMethod")
  private NotificationMethod1 notifMethod;

  @JsonProperty("maxReportNbr")
  private Integer maxReportNbr;

  @JsonProperty("monDur")
  private OffsetDateTime monDur;

  @JsonProperty("repPeriod")
  private Integer repPeriod;

  @JsonProperty("sampRatio")
  private Integer sampRatio;

  @JsonProperty("partitionCriteria")
  @Valid
  private List<PartitioningCriteria> partitionCriteria = null;

  @JsonProperty("grpRepTime")
  private Integer grpRepTime;

  @JsonProperty("notifFlag")
  private NotificationFlag notifFlag;

  public ReportingInformation immRep(Boolean immRep) {
    this.immRep = immRep;
    return this;
  }

  /**
   * Get immRep
   * @return immRep
  */
  @ApiModelProperty(value = "")


  public Boolean getImmRep() {
    return immRep;
  }

  public void setImmRep(Boolean immRep) {
    this.immRep = immRep;
  }

  public ReportingInformation notifMethod(NotificationMethod1 notifMethod) {
    this.notifMethod = notifMethod;
    return this;
  }

  /**
   * Get notifMethod
   * @return notifMethod
  */
  @ApiModelProperty(value = "")

  @Valid

  public NotificationMethod1 getNotifMethod() {
    return notifMethod;
  }

  public void setNotifMethod(NotificationMethod1 notifMethod) {
    this.notifMethod = notifMethod;
  }

  public ReportingInformation maxReportNbr(Integer maxReportNbr) {
    this.maxReportNbr = maxReportNbr;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return maxReportNbr
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0) 
  public Integer getMaxReportNbr() {
    return maxReportNbr;
  }

  public void setMaxReportNbr(Integer maxReportNbr) {
    this.maxReportNbr = maxReportNbr;
  }

  public ReportingInformation monDur(OffsetDateTime monDur) {
    this.monDur = monDur;
    return this;
  }

  /**
   * Get monDur
   * @return monDur
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getMonDur() {
    return monDur;
  }

  public void setMonDur(OffsetDateTime monDur) {
    this.monDur = monDur;
  }

  public ReportingInformation repPeriod(Integer repPeriod) {
    this.repPeriod = repPeriod;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return repPeriod
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getRepPeriod() {
    return repPeriod;
  }

  public void setRepPeriod(Integer repPeriod) {
    this.repPeriod = repPeriod;
  }

  public ReportingInformation sampRatio(Integer sampRatio) {
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

  public ReportingInformation partitionCriteria(List<PartitioningCriteria> partitionCriteria) {
    this.partitionCriteria = partitionCriteria;
    return this;
  }

  public ReportingInformation addPartitionCriteriaItem(PartitioningCriteria partitionCriteriaItem) {
    if (this.partitionCriteria == null) {
      this.partitionCriteria = new ArrayList<>();
    }
    this.partitionCriteria.add(partitionCriteriaItem);
    return this;
  }

  /**
   * Criteria for partitioning the UEs before applying the sampling ratio.
   * @return partitionCriteria
  */
  @ApiModelProperty(value = "Criteria for partitioning the UEs before applying the sampling ratio.")

  @Valid
@Size(min = 1) 
  public List<PartitioningCriteria> getPartitionCriteria() {
    return partitionCriteria;
  }

  public void setPartitionCriteria(List<PartitioningCriteria> partitionCriteria) {
    this.partitionCriteria = partitionCriteria;
  }

  public ReportingInformation grpRepTime(Integer grpRepTime) {
    this.grpRepTime = grpRepTime;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return grpRepTime
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getGrpRepTime() {
    return grpRepTime;
  }

  public void setGrpRepTime(Integer grpRepTime) {
    this.grpRepTime = grpRepTime;
  }

  public ReportingInformation notifFlag(NotificationFlag notifFlag) {
    this.notifFlag = notifFlag;
    return this;
  }

  /**
   * Get notifFlag
   * @return notifFlag
  */
  @ApiModelProperty(value = "")

  @Valid

  public NotificationFlag getNotifFlag() {
    return notifFlag;
  }

  public void setNotifFlag(NotificationFlag notifFlag) {
    this.notifFlag = notifFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingInformation reportingInformation = (ReportingInformation) o;
    return Objects.equals(this.immRep, reportingInformation.immRep) &&
        Objects.equals(this.notifMethod, reportingInformation.notifMethod) &&
        Objects.equals(this.maxReportNbr, reportingInformation.maxReportNbr) &&
        Objects.equals(this.monDur, reportingInformation.monDur) &&
        Objects.equals(this.repPeriod, reportingInformation.repPeriod) &&
        Objects.equals(this.sampRatio, reportingInformation.sampRatio) &&
        Objects.equals(this.partitionCriteria, reportingInformation.partitionCriteria) &&
        Objects.equals(this.grpRepTime, reportingInformation.grpRepTime) &&
        Objects.equals(this.notifFlag, reportingInformation.notifFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(immRep, notifMethod, maxReportNbr, monDur, repPeriod, sampRatio, partitionCriteria, grpRepTime, notifFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingInformation {\n");
    
    sb.append("    immRep: ").append(toIndentedString(immRep)).append("\n");
    sb.append("    notifMethod: ").append(toIndentedString(notifMethod)).append("\n");
    sb.append("    maxReportNbr: ").append(toIndentedString(maxReportNbr)).append("\n");
    sb.append("    monDur: ").append(toIndentedString(monDur)).append("\n");
    sb.append("    repPeriod: ").append(toIndentedString(repPeriod)).append("\n");
    sb.append("    sampRatio: ").append(toIndentedString(sampRatio)).append("\n");
    sb.append("    partitionCriteria: ").append(toIndentedString(partitionCriteria)).append("\n");
    sb.append("    grpRepTime: ").append(toIndentedString(grpRepTime)).append("\n");
    sb.append("    notifFlag: ").append(toIndentedString(notifFlag)).append("\n");
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

