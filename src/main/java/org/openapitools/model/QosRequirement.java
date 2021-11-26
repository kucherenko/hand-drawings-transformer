package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.QosResourceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the QoS requirements.
 */
@ApiModel(description = "Represents the QoS requirements.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class QosRequirement   {
  @JsonProperty("5qi")
  private Integer _5qi;

  @JsonProperty("gfbrUl")
  private String gfbrUl;

  @JsonProperty("gfbrDl")
  private String gfbrDl;

  @JsonProperty("resType")
  private QosResourceType resType;

  @JsonProperty("pdb")
  private Integer pdb;

  @JsonProperty("per")
  private String per;

  public QosRequirement _5qi(Integer _5qi) {
    this._5qi = _5qi;
    return this;
  }

  /**
   * Unsigned integer representing a 5G QoS Identifier (see clause 5.7.2.1 of 3GPP TS 23.501, within the range 0 to 255
   * minimum: 0
   * maximum: 255
   * @return _5qi
  */
  @ApiModelProperty(value = "Unsigned integer representing a 5G QoS Identifier (see clause 5.7.2.1 of 3GPP TS 23.501, within the range 0 to 255")

@Min(0) @Max(255) 
  public Integer get5qi() {
    return _5qi;
  }

  public void set5qi(Integer _5qi) {
    this._5qi = _5qi;
  }

  public QosRequirement gfbrUl(String gfbrUl) {
    this.gfbrUl = gfbrUl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return gfbrUl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getGfbrUl() {
    return gfbrUl;
  }

  public void setGfbrUl(String gfbrUl) {
    this.gfbrUl = gfbrUl;
  }

  public QosRequirement gfbrDl(String gfbrDl) {
    this.gfbrDl = gfbrDl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return gfbrDl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getGfbrDl() {
    return gfbrDl;
  }

  public void setGfbrDl(String gfbrDl) {
    this.gfbrDl = gfbrDl;
  }

  public QosRequirement resType(QosResourceType resType) {
    this.resType = resType;
    return this;
  }

  /**
   * Get resType
   * @return resType
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosResourceType getResType() {
    return resType;
  }

  public void setResType(QosResourceType resType) {
    this.resType = resType;
  }

  public QosRequirement pdb(Integer pdb) {
    this.pdb = pdb;
    return this;
  }

  /**
   * Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501), expressed in milliseconds.
   * minimum: 1
   * @return pdb
  */
  @ApiModelProperty(value = "Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501), expressed in milliseconds.")

@Min(1) 
  public Integer getPdb() {
    return pdb;
  }

  public void setPdb(Integer pdb) {
    this.pdb = pdb;
  }

  public QosRequirement per(String per) {
    this.per = per;
    return this;
  }

  /**
   * String representing Packet Error Rate (see clause 5.7.3.5 and 5.7.4 of 3GPP TS 23.501, expressed as a \"scalar x 10-k\" where the scalar and the exponent k are each encoded as one decimal digit
   * @return per
  */
  @ApiModelProperty(value = "String representing Packet Error Rate (see clause 5.7.3.5 and 5.7.4 of 3GPP TS 23.501, expressed as a \"scalar x 10-k\" where the scalar and the exponent k are each encoded as one decimal digit")

@Pattern(regexp = "^([0-9]E-[0-9])$") 
  public String getPer() {
    return per;
  }

  public void setPer(String per) {
    this.per = per;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosRequirement qosRequirement = (QosRequirement) o;
    return Objects.equals(this._5qi, qosRequirement._5qi) &&
        Objects.equals(this.gfbrUl, qosRequirement.gfbrUl) &&
        Objects.equals(this.gfbrDl, qosRequirement.gfbrDl) &&
        Objects.equals(this.resType, qosRequirement.resType) &&
        Objects.equals(this.pdb, qosRequirement.pdb) &&
        Objects.equals(this.per, qosRequirement.per);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5qi, gfbrUl, gfbrDl, resType, pdb, per);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosRequirement {\n");
    
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    gfbrUl: ").append(toIndentedString(gfbrUl)).append("\n");
    sb.append("    gfbrDl: ").append(toIndentedString(gfbrDl)).append("\n");
    sb.append("    resType: ").append(toIndentedString(resType)).append("\n");
    sb.append("    pdb: ").append(toIndentedString(pdb)).append("\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
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

