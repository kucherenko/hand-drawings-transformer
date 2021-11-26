package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CongestionInfo;
import org.openapitools.model.NetworkAreaInfo;
import org.openapitools.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the user data congestion information.
 */
@ApiModel(description = "Represents the user data congestion information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class UserDataCongestionInfo   {
  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea;

  @JsonProperty("congestionInfo")
  private CongestionInfo congestionInfo;

  @JsonProperty("snssai")
  private Snssai snssai;

  public UserDataCongestionInfo networkArea(NetworkAreaInfo networkArea) {
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

  public UserDataCongestionInfo congestionInfo(CongestionInfo congestionInfo) {
    this.congestionInfo = congestionInfo;
    return this;
  }

  /**
   * Get congestionInfo
   * @return congestionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CongestionInfo getCongestionInfo() {
    return congestionInfo;
  }

  public void setCongestionInfo(CongestionInfo congestionInfo) {
    this.congestionInfo = congestionInfo;
  }

  public UserDataCongestionInfo snssai(Snssai snssai) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDataCongestionInfo userDataCongestionInfo = (UserDataCongestionInfo) o;
    return Objects.equals(this.networkArea, userDataCongestionInfo.networkArea) &&
        Objects.equals(this.congestionInfo, userDataCongestionInfo.congestionInfo) &&
        Objects.equals(this.snssai, userDataCongestionInfo.snssai);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkArea, congestionInfo, snssai);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDataCongestionInfo {\n");
    
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    congestionInfo: ").append(toIndentedString(congestionInfo)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
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

