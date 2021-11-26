package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.NetworkAreaInfo;
import org.openapitools.model.Snssai;
import org.openapitools.model.SvcExperience;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents service experience information.
 */
@ApiModel(description = "Represents service experience information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class ServiceExperienceInfo   {
  @JsonProperty("svcExprc")
  private SvcExperience svcExprc;

  @JsonProperty("svcExprcVariance")
  private Float svcExprcVariance;

  @JsonProperty("supis")
  @Valid
  private List<String> supis = null;

  @JsonProperty("snssai")
  private Snssai snssai;

  @JsonProperty("appId")
  private String appId;

  @JsonProperty("confidence")
  private Integer confidence;

  @JsonProperty("dnn")
  private String dnn;

  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea;

  @JsonProperty("nsiId")
  private String nsiId;

  @JsonProperty("ratio")
  private Integer ratio;

  public ServiceExperienceInfo svcExprc(SvcExperience svcExprc) {
    this.svcExprc = svcExprc;
    return this;
  }

  /**
   * Get svcExprc
   * @return svcExprc
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SvcExperience getSvcExprc() {
    return svcExprc;
  }

  public void setSvcExprc(SvcExperience svcExprc) {
    this.svcExprc = svcExprc;
  }

  public ServiceExperienceInfo svcExprcVariance(Float svcExprcVariance) {
    this.svcExprcVariance = svcExprcVariance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return svcExprcVariance
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getSvcExprcVariance() {
    return svcExprcVariance;
  }

  public void setSvcExprcVariance(Float svcExprcVariance) {
    this.svcExprcVariance = svcExprcVariance;
  }

  public ServiceExperienceInfo supis(List<String> supis) {
    this.supis = supis;
    return this;
  }

  public ServiceExperienceInfo addSupisItem(String supisItem) {
    if (this.supis == null) {
      this.supis = new ArrayList<>();
    }
    this.supis.add(supisItem);
    return this;
  }

  /**
   * Get supis
   * @return supis
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getSupis() {
    return supis;
  }

  public void setSupis(List<String> supis) {
    this.supis = supis;
  }

  public ServiceExperienceInfo snssai(Snssai snssai) {
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

  public ServiceExperienceInfo appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * String providing an application identifier.
   * @return appId
  */
  @ApiModelProperty(value = "String providing an application identifier.")


  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ServiceExperienceInfo confidence(Integer confidence) {
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

  public ServiceExperienceInfo dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").
   * @return dnn
  */
  @ApiModelProperty(value = "String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").")


  public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public ServiceExperienceInfo networkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
    return this;
  }

  /**
   * Get networkArea
   * @return networkArea
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkAreaInfo getNetworkArea() {
    return networkArea;
  }

  public void setNetworkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
  }

  public ServiceExperienceInfo nsiId(String nsiId) {
    this.nsiId = nsiId;
    return this;
  }

  /**
   * Contains the Identifier of the selected Network Slice instance
   * @return nsiId
  */
  @ApiModelProperty(value = "Contains the Identifier of the selected Network Slice instance")


  public String getNsiId() {
    return nsiId;
  }

  public void setNsiId(String nsiId) {
    this.nsiId = nsiId;
  }

  public ServiceExperienceInfo ratio(Integer ratio) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceExperienceInfo serviceExperienceInfo = (ServiceExperienceInfo) o;
    return Objects.equals(this.svcExprc, serviceExperienceInfo.svcExprc) &&
        Objects.equals(this.svcExprcVariance, serviceExperienceInfo.svcExprcVariance) &&
        Objects.equals(this.supis, serviceExperienceInfo.supis) &&
        Objects.equals(this.snssai, serviceExperienceInfo.snssai) &&
        Objects.equals(this.appId, serviceExperienceInfo.appId) &&
        Objects.equals(this.confidence, serviceExperienceInfo.confidence) &&
        Objects.equals(this.dnn, serviceExperienceInfo.dnn) &&
        Objects.equals(this.networkArea, serviceExperienceInfo.networkArea) &&
        Objects.equals(this.nsiId, serviceExperienceInfo.nsiId) &&
        Objects.equals(this.ratio, serviceExperienceInfo.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(svcExprc, svcExprcVariance, supis, snssai, appId, confidence, dnn, networkArea, nsiId, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceExperienceInfo {\n");
    
    sb.append("    svcExprc: ").append(toIndentedString(svcExprc)).append("\n");
    sb.append("    svcExprcVariance: ").append(toIndentedString(svcExprcVariance)).append("\n");
    sb.append("    supis: ").append(toIndentedString(supis)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    nsiId: ").append(toIndentedString(nsiId)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

