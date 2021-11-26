package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdditionalMeasurement;
import org.openapitools.model.Exception;
import org.openapitools.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the abnormal behaviour information.
 */
@ApiModel(description = "Represents the abnormal behaviour information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class AbnormalBehaviour   {
  @JsonProperty("supis")
  @Valid
  private List<String> supis = null;

  @JsonProperty("excep")
  private Exception excep;

  @JsonProperty("dnn")
  private String dnn;

  @JsonProperty("snssai")
  private Snssai snssai;

  @JsonProperty("ratio")
  private Integer ratio;

  @JsonProperty("confidence")
  private Integer confidence;

  @JsonProperty("addtMeasInfo")
  private AdditionalMeasurement addtMeasInfo;

  public AbnormalBehaviour supis(List<String> supis) {
    this.supis = supis;
    return this;
  }

  public AbnormalBehaviour addSupisItem(String supisItem) {
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

  public AbnormalBehaviour excep(Exception excep) {
    this.excep = excep;
    return this;
  }

  /**
   * Get excep
   * @return excep
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Exception getExcep() {
    return excep;
  }

  public void setExcep(Exception excep) {
    this.excep = excep;
  }

  public AbnormalBehaviour dnn(String dnn) {
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

  public AbnormalBehaviour snssai(Snssai snssai) {
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

  public AbnormalBehaviour ratio(Integer ratio) {
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

  public AbnormalBehaviour confidence(Integer confidence) {
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

  public AbnormalBehaviour addtMeasInfo(AdditionalMeasurement addtMeasInfo) {
    this.addtMeasInfo = addtMeasInfo;
    return this;
  }

  /**
   * Get addtMeasInfo
   * @return addtMeasInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalMeasurement getAddtMeasInfo() {
    return addtMeasInfo;
  }

  public void setAddtMeasInfo(AdditionalMeasurement addtMeasInfo) {
    this.addtMeasInfo = addtMeasInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbnormalBehaviour abnormalBehaviour = (AbnormalBehaviour) o;
    return Objects.equals(this.supis, abnormalBehaviour.supis) &&
        Objects.equals(this.excep, abnormalBehaviour.excep) &&
        Objects.equals(this.dnn, abnormalBehaviour.dnn) &&
        Objects.equals(this.snssai, abnormalBehaviour.snssai) &&
        Objects.equals(this.ratio, abnormalBehaviour.ratio) &&
        Objects.equals(this.confidence, abnormalBehaviour.confidence) &&
        Objects.equals(this.addtMeasInfo, abnormalBehaviour.addtMeasInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supis, excep, dnn, snssai, ratio, confidence, addtMeasInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbnormalBehaviour {\n");
    
    sb.append("    supis: ").append(toIndentedString(supis)).append("\n");
    sb.append("    excep: ").append(toIndentedString(excep)).append("\n");
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    addtMeasInfo: ").append(toIndentedString(addtMeasInfo)).append("\n");
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

