package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FlowInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Top application that contributes the most to the traffic.
 */
@ApiModel(description = "Top application that contributes the most to the traffic.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class TopApplication   {
  @JsonProperty("appId")
  private String appId;

  @JsonProperty("ipTrafficFilter")
  private FlowInfo ipTrafficFilter;

  @JsonProperty("ratio")
  private Integer ratio;

  public TopApplication appId(String appId) {
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

  public TopApplication ipTrafficFilter(FlowInfo ipTrafficFilter) {
    this.ipTrafficFilter = ipTrafficFilter;
    return this;
  }

  /**
   * Get ipTrafficFilter
   * @return ipTrafficFilter
  */
  @ApiModelProperty(value = "")

  @Valid

  public FlowInfo getIpTrafficFilter() {
    return ipTrafficFilter;
  }

  public void setIpTrafficFilter(FlowInfo ipTrafficFilter) {
    this.ipTrafficFilter = ipTrafficFilter;
  }

  public TopApplication ratio(Integer ratio) {
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
    TopApplication topApplication = (TopApplication) o;
    return Objects.equals(this.appId, topApplication.appId) &&
        Objects.equals(this.ipTrafficFilter, topApplication.ipTrafficFilter) &&
        Objects.equals(this.ratio, topApplication.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, ipTrafficFilter, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopApplication {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    ipTrafficFilter: ").append(toIndentedString(ipTrafficFilter)).append("\n");
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

