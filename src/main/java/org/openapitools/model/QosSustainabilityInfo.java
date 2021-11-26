package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.NetworkAreaInfo;
import org.openapitools.model.RetainabilityThreshold;
import org.openapitools.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the QoS Sustainability information.
 */
@ApiModel(description = "Represents the QoS Sustainability information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class QosSustainabilityInfo   {
  @JsonProperty("areaInfo")
  private NetworkAreaInfo areaInfo;

  @JsonProperty("startTs")
  private OffsetDateTime startTs;

  @JsonProperty("endTs")
  private OffsetDateTime endTs;

  @JsonProperty("qosFlowRetThd")
  private RetainabilityThreshold qosFlowRetThd;

  @JsonProperty("ranUeThrouThd")
  private String ranUeThrouThd;

  @JsonProperty("snssai")
  private Snssai snssai;

  @JsonProperty("confidence")
  private Integer confidence;

  public QosSustainabilityInfo areaInfo(NetworkAreaInfo areaInfo) {
    this.areaInfo = areaInfo;
    return this;
  }

  /**
   * Get areaInfo
   * @return areaInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkAreaInfo getAreaInfo() {
    return areaInfo;
  }

  public void setAreaInfo(NetworkAreaInfo areaInfo) {
    this.areaInfo = areaInfo;
  }

  public QosSustainabilityInfo startTs(OffsetDateTime startTs) {
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

  public QosSustainabilityInfo endTs(OffsetDateTime endTs) {
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

  public QosSustainabilityInfo qosFlowRetThd(RetainabilityThreshold qosFlowRetThd) {
    this.qosFlowRetThd = qosFlowRetThd;
    return this;
  }

  /**
   * Get qosFlowRetThd
   * @return qosFlowRetThd
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetainabilityThreshold getQosFlowRetThd() {
    return qosFlowRetThd;
  }

  public void setQosFlowRetThd(RetainabilityThreshold qosFlowRetThd) {
    this.qosFlowRetThd = qosFlowRetThd;
  }

  public QosSustainabilityInfo ranUeThrouThd(String ranUeThrouThd) {
    this.ranUeThrouThd = ranUeThrouThd;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return ranUeThrouThd
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getRanUeThrouThd() {
    return ranUeThrouThd;
  }

  public void setRanUeThrouThd(String ranUeThrouThd) {
    this.ranUeThrouThd = ranUeThrouThd;
  }

  public QosSustainabilityInfo snssai(Snssai snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  */
  @ApiModelProperty(value = "")

  @Valid

  public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }

  public QosSustainabilityInfo confidence(Integer confidence) {
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
    QosSustainabilityInfo qosSustainabilityInfo = (QosSustainabilityInfo) o;
    return Objects.equals(this.areaInfo, qosSustainabilityInfo.areaInfo) &&
        Objects.equals(this.startTs, qosSustainabilityInfo.startTs) &&
        Objects.equals(this.endTs, qosSustainabilityInfo.endTs) &&
        Objects.equals(this.qosFlowRetThd, qosSustainabilityInfo.qosFlowRetThd) &&
        Objects.equals(this.ranUeThrouThd, qosSustainabilityInfo.ranUeThrouThd) &&
        Objects.equals(this.snssai, qosSustainabilityInfo.snssai) &&
        Objects.equals(this.confidence, qosSustainabilityInfo.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaInfo, startTs, endTs, qosFlowRetThd, ranUeThrouThd, snssai, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosSustainabilityInfo {\n");
    
    sb.append("    areaInfo: ").append(toIndentedString(areaInfo)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    qosFlowRetThd: ").append(toIndentedString(qosFlowRetThd)).append("\n");
    sb.append("    ranUeThrouThd: ").append(toIndentedString(ranUeThrouThd)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
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

