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
 * Represents bandwidth requirements.
 */
@ApiModel(description = "Represents bandwidth requirements.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class BwRequirement   {
  @JsonProperty("appId")
  private String appId;

  @JsonProperty("marBwDl")
  private String marBwDl;

  @JsonProperty("marBwUl")
  private String marBwUl;

  @JsonProperty("mirBwDl")
  private String mirBwDl;

  @JsonProperty("mirBwUl")
  private String mirBwUl;

  public BwRequirement appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * String providing an application identifier.
   * @return appId
  */
  @ApiModelProperty(required = true, value = "String providing an application identifier.")
  @NotNull


  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public BwRequirement marBwDl(String marBwDl) {
    this.marBwDl = marBwDl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return marBwDl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMarBwDl() {
    return marBwDl;
  }

  public void setMarBwDl(String marBwDl) {
    this.marBwDl = marBwDl;
  }

  public BwRequirement marBwUl(String marBwUl) {
    this.marBwUl = marBwUl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return marBwUl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMarBwUl() {
    return marBwUl;
  }

  public void setMarBwUl(String marBwUl) {
    this.marBwUl = marBwUl;
  }

  public BwRequirement mirBwDl(String mirBwDl) {
    this.mirBwDl = mirBwDl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return mirBwDl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMirBwDl() {
    return mirBwDl;
  }

  public void setMirBwDl(String mirBwDl) {
    this.mirBwDl = mirBwDl;
  }

  public BwRequirement mirBwUl(String mirBwUl) {
    this.mirBwUl = mirBwUl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return mirBwUl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp = "^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMirBwUl() {
    return mirBwUl;
  }

  public void setMirBwUl(String mirBwUl) {
    this.mirBwUl = mirBwUl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BwRequirement bwRequirement = (BwRequirement) o;
    return Objects.equals(this.appId, bwRequirement.appId) &&
        Objects.equals(this.marBwDl, bwRequirement.marBwDl) &&
        Objects.equals(this.marBwUl, bwRequirement.marBwUl) &&
        Objects.equals(this.mirBwDl, bwRequirement.mirBwDl) &&
        Objects.equals(this.mirBwUl, bwRequirement.mirBwUl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, marBwDl, marBwUl, mirBwDl, mirBwUl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BwRequirement {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    marBwDl: ").append(toIndentedString(marBwDl)).append("\n");
    sb.append("    marBwUl: ").append(toIndentedString(marBwUl)).append("\n");
    sb.append("    mirBwDl: ").append(toIndentedString(mirBwDl)).append("\n");
    sb.append("    mirBwUl: ").append(toIndentedString(mirBwUl)).append("\n");
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

