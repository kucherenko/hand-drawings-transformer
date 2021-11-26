package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.model.NFType;
import org.openapitools.model.NfStatus;
import org.openapitools.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents load level information of a given NF instance.
 */
@ApiModel(description = "Represents load level information of a given NF instance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NfLoadLevelInformation   {
  @JsonProperty("nfType")
  private NFType nfType;

  @JsonProperty("nfInstanceId")
  private UUID nfInstanceId;

  @JsonProperty("nfSetId")
  private String nfSetId;

  @JsonProperty("nfStatus")
  private NfStatus nfStatus;

  @JsonProperty("nfCpuUsage")
  private Integer nfCpuUsage;

  @JsonProperty("nfMemoryUsage")
  private Integer nfMemoryUsage;

  @JsonProperty("nfStorageUsage")
  private Integer nfStorageUsage;

  @JsonProperty("nfLoadLevelAverage")
  private Integer nfLoadLevelAverage;

  @JsonProperty("nfLoadLevelpeak")
  private Integer nfLoadLevelpeak;

  @JsonProperty("snssai")
  private Snssai snssai;

  @JsonProperty("confidence")
  private Integer confidence;

  public NfLoadLevelInformation nfType(NFType nfType) {
    this.nfType = nfType;
    return this;
  }

  /**
   * Get nfType
   * @return nfType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NFType getNfType() {
    return nfType;
  }

  public void setNfType(NFType nfType) {
    this.nfType = nfType;
  }

  public NfLoadLevelInformation nfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return nfInstanceId
  */
  @ApiModelProperty(required = true, value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")
  @NotNull

  @Valid

  public UUID getNfInstanceId() {
    return nfInstanceId;
  }

  public void setNfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
  }

  public NfLoadLevelInformation nfSetId(String nfSetId) {
    this.nfSetId = nfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return nfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getNfSetId() {
    return nfSetId;
  }

  public void setNfSetId(String nfSetId) {
    this.nfSetId = nfSetId;
  }

  public NfLoadLevelInformation nfStatus(NfStatus nfStatus) {
    this.nfStatus = nfStatus;
    return this;
  }

  /**
   * Get nfStatus
   * @return nfStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public NfStatus getNfStatus() {
    return nfStatus;
  }

  public void setNfStatus(NfStatus nfStatus) {
    this.nfStatus = nfStatus;
  }

  public NfLoadLevelInformation nfCpuUsage(Integer nfCpuUsage) {
    this.nfCpuUsage = nfCpuUsage;
    return this;
  }

  /**
   * Get nfCpuUsage
   * @return nfCpuUsage
  */
  @ApiModelProperty(value = "")


  public Integer getNfCpuUsage() {
    return nfCpuUsage;
  }

  public void setNfCpuUsage(Integer nfCpuUsage) {
    this.nfCpuUsage = nfCpuUsage;
  }

  public NfLoadLevelInformation nfMemoryUsage(Integer nfMemoryUsage) {
    this.nfMemoryUsage = nfMemoryUsage;
    return this;
  }

  /**
   * Get nfMemoryUsage
   * @return nfMemoryUsage
  */
  @ApiModelProperty(value = "")


  public Integer getNfMemoryUsage() {
    return nfMemoryUsage;
  }

  public void setNfMemoryUsage(Integer nfMemoryUsage) {
    this.nfMemoryUsage = nfMemoryUsage;
  }

  public NfLoadLevelInformation nfStorageUsage(Integer nfStorageUsage) {
    this.nfStorageUsage = nfStorageUsage;
    return this;
  }

  /**
   * Get nfStorageUsage
   * @return nfStorageUsage
  */
  @ApiModelProperty(value = "")


  public Integer getNfStorageUsage() {
    return nfStorageUsage;
  }

  public void setNfStorageUsage(Integer nfStorageUsage) {
    this.nfStorageUsage = nfStorageUsage;
  }

  public NfLoadLevelInformation nfLoadLevelAverage(Integer nfLoadLevelAverage) {
    this.nfLoadLevelAverage = nfLoadLevelAverage;
    return this;
  }

  /**
   * Get nfLoadLevelAverage
   * @return nfLoadLevelAverage
  */
  @ApiModelProperty(value = "")


  public Integer getNfLoadLevelAverage() {
    return nfLoadLevelAverage;
  }

  public void setNfLoadLevelAverage(Integer nfLoadLevelAverage) {
    this.nfLoadLevelAverage = nfLoadLevelAverage;
  }

  public NfLoadLevelInformation nfLoadLevelpeak(Integer nfLoadLevelpeak) {
    this.nfLoadLevelpeak = nfLoadLevelpeak;
    return this;
  }

  /**
   * Get nfLoadLevelpeak
   * @return nfLoadLevelpeak
  */
  @ApiModelProperty(value = "")


  public Integer getNfLoadLevelpeak() {
    return nfLoadLevelpeak;
  }

  public void setNfLoadLevelpeak(Integer nfLoadLevelpeak) {
    this.nfLoadLevelpeak = nfLoadLevelpeak;
  }

  public NfLoadLevelInformation snssai(Snssai snssai) {
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

  public NfLoadLevelInformation confidence(Integer confidence) {
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
    NfLoadLevelInformation nfLoadLevelInformation = (NfLoadLevelInformation) o;
    return Objects.equals(this.nfType, nfLoadLevelInformation.nfType) &&
        Objects.equals(this.nfInstanceId, nfLoadLevelInformation.nfInstanceId) &&
        Objects.equals(this.nfSetId, nfLoadLevelInformation.nfSetId) &&
        Objects.equals(this.nfStatus, nfLoadLevelInformation.nfStatus) &&
        Objects.equals(this.nfCpuUsage, nfLoadLevelInformation.nfCpuUsage) &&
        Objects.equals(this.nfMemoryUsage, nfLoadLevelInformation.nfMemoryUsage) &&
        Objects.equals(this.nfStorageUsage, nfLoadLevelInformation.nfStorageUsage) &&
        Objects.equals(this.nfLoadLevelAverage, nfLoadLevelInformation.nfLoadLevelAverage) &&
        Objects.equals(this.nfLoadLevelpeak, nfLoadLevelInformation.nfLoadLevelpeak) &&
        Objects.equals(this.snssai, nfLoadLevelInformation.snssai) &&
        Objects.equals(this.confidence, nfLoadLevelInformation.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfType, nfInstanceId, nfSetId, nfStatus, nfCpuUsage, nfMemoryUsage, nfStorageUsage, nfLoadLevelAverage, nfLoadLevelpeak, snssai, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfLoadLevelInformation {\n");
    
    sb.append("    nfType: ").append(toIndentedString(nfType)).append("\n");
    sb.append("    nfInstanceId: ").append(toIndentedString(nfInstanceId)).append("\n");
    sb.append("    nfSetId: ").append(toIndentedString(nfSetId)).append("\n");
    sb.append("    nfStatus: ").append(toIndentedString(nfStatus)).append("\n");
    sb.append("    nfCpuUsage: ").append(toIndentedString(nfCpuUsage)).append("\n");
    sb.append("    nfMemoryUsage: ").append(toIndentedString(nfMemoryUsage)).append("\n");
    sb.append("    nfStorageUsage: ").append(toIndentedString(nfStorageUsage)).append("\n");
    sb.append("    nfLoadLevelAverage: ").append(toIndentedString(nfLoadLevelAverage)).append("\n");
    sb.append("    nfLoadLevelpeak: ").append(toIndentedString(nfLoadLevelpeak)).append("\n");
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

