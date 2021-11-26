package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.IpEthFlowDescription;
import org.openapitools.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies the detailed traffic characterization.
 */
@ApiModel(description = "Identifies the detailed traffic characterization.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class TrafficCharacterization   {
  @JsonProperty("dnn")
  private String dnn;

  @JsonProperty("snssai")
  private Snssai snssai;

  @JsonProperty("appId")
  private String appId;

  @JsonProperty("fDescs")
  @Valid
  private List<IpEthFlowDescription> fDescs = null;

  @JsonProperty("ulVol")
  private Long ulVol;

  @JsonProperty("ulVolVariance")
  private Float ulVolVariance;

  @JsonProperty("dlVol")
  private Long dlVol;

  @JsonProperty("dlVolVariance")
  private Float dlVolVariance;

  public TrafficCharacterization dnn(String dnn) {
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

  public TrafficCharacterization snssai(Snssai snssai) {
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

  public TrafficCharacterization appId(String appId) {
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

  public TrafficCharacterization fDescs(List<IpEthFlowDescription> fDescs) {
    this.fDescs = fDescs;
    return this;
  }

  public TrafficCharacterization addFDescsItem(IpEthFlowDescription fDescsItem) {
    if (this.fDescs == null) {
      this.fDescs = new ArrayList<>();
    }
    this.fDescs.add(fDescsItem);
    return this;
  }

  /**
   * Get fDescs
   * @return fDescs
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1, max = 2) 
  public List<IpEthFlowDescription> getfDescs() {
    return fDescs;
  }

  public void setfDescs(List<IpEthFlowDescription> fDescs) {
    this.fDescs = fDescs;
  }

  public TrafficCharacterization ulVol(Long ulVol) {
    this.ulVol = ulVol;
    return this;
  }

  /**
   * Unsigned integer identifying a volume in units of bytes.
   * minimum: 0
   * @return ulVol
  */
  @ApiModelProperty(value = "Unsigned integer identifying a volume in units of bytes.")

@Min(0L) 
  public Long getUlVol() {
    return ulVol;
  }

  public void setUlVol(Long ulVol) {
    this.ulVol = ulVol;
  }

  public TrafficCharacterization ulVolVariance(Float ulVolVariance) {
    this.ulVolVariance = ulVolVariance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return ulVolVariance
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getUlVolVariance() {
    return ulVolVariance;
  }

  public void setUlVolVariance(Float ulVolVariance) {
    this.ulVolVariance = ulVolVariance;
  }

  public TrafficCharacterization dlVol(Long dlVol) {
    this.dlVol = dlVol;
    return this;
  }

  /**
   * Unsigned integer identifying a volume in units of bytes.
   * minimum: 0
   * @return dlVol
  */
  @ApiModelProperty(value = "Unsigned integer identifying a volume in units of bytes.")

@Min(0L) 
  public Long getDlVol() {
    return dlVol;
  }

  public void setDlVol(Long dlVol) {
    this.dlVol = dlVol;
  }

  public TrafficCharacterization dlVolVariance(Float dlVolVariance) {
    this.dlVolVariance = dlVolVariance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return dlVolVariance
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getDlVolVariance() {
    return dlVolVariance;
  }

  public void setDlVolVariance(Float dlVolVariance) {
    this.dlVolVariance = dlVolVariance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficCharacterization trafficCharacterization = (TrafficCharacterization) o;
    return Objects.equals(this.dnn, trafficCharacterization.dnn) &&
        Objects.equals(this.snssai, trafficCharacterization.snssai) &&
        Objects.equals(this.appId, trafficCharacterization.appId) &&
        Objects.equals(this.fDescs, trafficCharacterization.fDescs) &&
        Objects.equals(this.ulVol, trafficCharacterization.ulVol) &&
        Objects.equals(this.ulVolVariance, trafficCharacterization.ulVolVariance) &&
        Objects.equals(this.dlVol, trafficCharacterization.dlVol) &&
        Objects.equals(this.dlVolVariance, trafficCharacterization.dlVolVariance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnn, snssai, appId, fDescs, ulVol, ulVolVariance, dlVol, dlVolVariance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficCharacterization {\n");
    
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    fDescs: ").append(toIndentedString(fDescs)).append("\n");
    sb.append("    ulVol: ").append(toIndentedString(ulVol)).append("\n");
    sb.append("    ulVolVariance: ").append(toIndentedString(ulVolVariance)).append("\n");
    sb.append("    dlVol: ").append(toIndentedString(dlVol)).append("\n");
    sb.append("    dlVolVariance: ").append(toIndentedString(dlVolVariance)).append("\n");
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

