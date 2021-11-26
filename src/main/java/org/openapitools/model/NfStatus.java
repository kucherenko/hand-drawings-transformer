package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the percentage of time spent on various NF states.
 */
@ApiModel(description = "Contains the percentage of time spent on various NF states.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NfStatus   {
  @JsonProperty("statusRegistered")
  private Integer statusRegistered;

  @JsonProperty("statusUnregistered")
  private Integer statusUnregistered;

  @JsonProperty("statusUndiscoverable")
  private Integer statusUndiscoverable;

  public NfStatus statusRegistered(Integer statusRegistered) {
    this.statusRegistered = statusRegistered;
    return this;
  }

  /**
   * Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.
   * minimum: 1
   * maximum: 100
   * @return statusRegistered
  */
  @ApiModelProperty(value = "Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.")

@Min(1) @Max(100) 
  public Integer getStatusRegistered() {
    return statusRegistered;
  }

  public void setStatusRegistered(Integer statusRegistered) {
    this.statusRegistered = statusRegistered;
  }

  public NfStatus statusUnregistered(Integer statusUnregistered) {
    this.statusUnregistered = statusUnregistered;
    return this;
  }

  /**
   * Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.
   * minimum: 1
   * maximum: 100
   * @return statusUnregistered
  */
  @ApiModelProperty(value = "Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.")

@Min(1) @Max(100) 
  public Integer getStatusUnregistered() {
    return statusUnregistered;
  }

  public void setStatusUnregistered(Integer statusUnregistered) {
    this.statusUnregistered = statusUnregistered;
  }

  public NfStatus statusUndiscoverable(Integer statusUndiscoverable) {
    this.statusUndiscoverable = statusUndiscoverable;
    return this;
  }

  /**
   * Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.
   * minimum: 1
   * maximum: 100
   * @return statusUndiscoverable
  */
  @ApiModelProperty(value = "Unsigned integer indicating Sampling Ratio (see clauses 4.15.1 of 3GPP TS 23.502), expressed in percent.")

@Min(1) @Max(100) 
  public Integer getStatusUndiscoverable() {
    return statusUndiscoverable;
  }

  public void setStatusUndiscoverable(Integer statusUndiscoverable) {
    this.statusUndiscoverable = statusUndiscoverable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfStatus nfStatus = (NfStatus) o;
    return Objects.equals(this.statusRegistered, nfStatus.statusRegistered) &&
        Objects.equals(this.statusUnregistered, nfStatus.statusUnregistered) &&
        Objects.equals(this.statusUndiscoverable, nfStatus.statusUndiscoverable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusRegistered, statusUnregistered, statusUndiscoverable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfStatus {\n");
    
    sb.append("    statusRegistered: ").append(toIndentedString(statusRegistered)).append("\n");
    sb.append("    statusUnregistered: ").append(toIndentedString(statusUnregistered)).append("\n");
    sb.append("    statusUndiscoverable: ").append(toIndentedString(statusUndiscoverable)).append("\n");
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

