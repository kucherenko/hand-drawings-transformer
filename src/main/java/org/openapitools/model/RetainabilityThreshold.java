package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a QoS flow retainability threshold.
 */
@ApiModel(description = "Represents a QoS flow retainability threshold.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class RetainabilityThreshold   {
  @JsonProperty("relFlowNum")
  private Integer relFlowNum;

  @JsonProperty("relTimeUnit")
  private TimeUnit relTimeUnit;

  @JsonProperty("relFlowRatio")
  private Integer relFlowRatio;

  public RetainabilityThreshold relFlowNum(Integer relFlowNum) {
    this.relFlowNum = relFlowNum;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return relFlowNum
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0) 
  public Integer getRelFlowNum() {
    return relFlowNum;
  }

  public void setRelFlowNum(Integer relFlowNum) {
    this.relFlowNum = relFlowNum;
  }

  public RetainabilityThreshold relTimeUnit(TimeUnit relTimeUnit) {
    this.relTimeUnit = relTimeUnit;
    return this;
  }

  /**
   * Get relTimeUnit
   * @return relTimeUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeUnit getRelTimeUnit() {
    return relTimeUnit;
  }

  public void setRelTimeUnit(TimeUnit relTimeUnit) {
    this.relTimeUnit = relTimeUnit;
  }

  public RetainabilityThreshold relFlowRatio(Integer relFlowRatio) {
    this.relFlowRatio = relFlowRatio;
    return this;
  }

  /**
   * Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.
   * minimum: 1
   * maximum: 100
   * @return relFlowRatio
  */
  @ApiModelProperty(value = "Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.")

@Min(1) @Max(100) 
  public Integer getRelFlowRatio() {
    return relFlowRatio;
  }

  public void setRelFlowRatio(Integer relFlowRatio) {
    this.relFlowRatio = relFlowRatio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetainabilityThreshold retainabilityThreshold = (RetainabilityThreshold) o;
    return Objects.equals(this.relFlowNum, retainabilityThreshold.relFlowNum) &&
        Objects.equals(this.relTimeUnit, retainabilityThreshold.relTimeUnit) &&
        Objects.equals(this.relFlowRatio, retainabilityThreshold.relFlowRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relFlowNum, relTimeUnit, relFlowRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetainabilityThreshold {\n");
    
    sb.append("    relFlowNum: ").append(toIndentedString(relFlowNum)).append("\n");
    sb.append("    relTimeUnit: ").append(toIndentedString(relTimeUnit)).append("\n");
    sb.append("    relFlowRatio: ").append(toIndentedString(relFlowRatio)).append("\n");
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

