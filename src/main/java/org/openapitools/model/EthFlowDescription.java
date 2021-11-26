package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FlowDirection;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies an Ethernet flow
 */
@ApiModel(description = "Identifies an Ethernet flow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class EthFlowDescription   {
  @JsonProperty("destMacAddr")
  private String destMacAddr;

  @JsonProperty("ethType")
  private String ethType;

  @JsonProperty("fDesc")
  private String fDesc;

  @JsonProperty("fDir")
  private FlowDirection fDir;

  @JsonProperty("sourceMacAddr")
  private String sourceMacAddr;

  @JsonProperty("vlanTags")
  @Valid
  private List<String> vlanTags = null;

  @JsonProperty("srcMacAddrEnd")
  private String srcMacAddrEnd;

  @JsonProperty("destMacAddrEnd")
  private String destMacAddrEnd;

  public EthFlowDescription destMacAddr(String destMacAddr) {
    this.destMacAddr = destMacAddr;
    return this;
  }

  /**
   * String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042
   * @return destMacAddr
  */
  @ApiModelProperty(value = "String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042")

@Pattern(regexp = "^([0-9a-fA-F]{2})((-[0-9a-fA-F]{2}){5})$") 
  public String getDestMacAddr() {
    return destMacAddr;
  }

  public void setDestMacAddr(String destMacAddr) {
    this.destMacAddr = destMacAddr;
  }

  public EthFlowDescription ethType(String ethType) {
    this.ethType = ethType;
    return this;
  }

  /**
   * Get ethType
   * @return ethType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEthType() {
    return ethType;
  }

  public void setEthType(String ethType) {
    this.ethType = ethType;
  }

  public EthFlowDescription fDesc(String fDesc) {
    this.fDesc = fDesc;
    return this;
  }

  /**
   * Defines a packet filter of an IP flow.
   * @return fDesc
  */
  @ApiModelProperty(value = "Defines a packet filter of an IP flow.")


  public String getfDesc() {
    return fDesc;
  }

  public void setfDesc(String fDesc) {
    this.fDesc = fDesc;
  }

  public EthFlowDescription fDir(FlowDirection fDir) {
    this.fDir = fDir;
    return this;
  }

  /**
   * Get fDir
   * @return fDir
  */
  @ApiModelProperty(value = "")

  @Valid

  public FlowDirection getfDir() {
    return fDir;
  }

  public void setfDir(FlowDirection fDir) {
    this.fDir = fDir;
  }

  public EthFlowDescription sourceMacAddr(String sourceMacAddr) {
    this.sourceMacAddr = sourceMacAddr;
    return this;
  }

  /**
   * String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042
   * @return sourceMacAddr
  */
  @ApiModelProperty(value = "String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042")

@Pattern(regexp = "^([0-9a-fA-F]{2})((-[0-9a-fA-F]{2}){5})$") 
  public String getSourceMacAddr() {
    return sourceMacAddr;
  }

  public void setSourceMacAddr(String sourceMacAddr) {
    this.sourceMacAddr = sourceMacAddr;
  }

  public EthFlowDescription vlanTags(List<String> vlanTags) {
    this.vlanTags = vlanTags;
    return this;
  }

  public EthFlowDescription addVlanTagsItem(String vlanTagsItem) {
    if (this.vlanTags == null) {
      this.vlanTags = new ArrayList<>();
    }
    this.vlanTags.add(vlanTagsItem);
    return this;
  }

  /**
   * Get vlanTags
   * @return vlanTags
  */
  @ApiModelProperty(value = "")

@Size(min = 1, max = 2) 
  public List<String> getVlanTags() {
    return vlanTags;
  }

  public void setVlanTags(List<String> vlanTags) {
    this.vlanTags = vlanTags;
  }

  public EthFlowDescription srcMacAddrEnd(String srcMacAddrEnd) {
    this.srcMacAddrEnd = srcMacAddrEnd;
    return this;
  }

  /**
   * String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042
   * @return srcMacAddrEnd
  */
  @ApiModelProperty(value = "String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042")

@Pattern(regexp = "^([0-9a-fA-F]{2})((-[0-9a-fA-F]{2}){5})$") 
  public String getSrcMacAddrEnd() {
    return srcMacAddrEnd;
  }

  public void setSrcMacAddrEnd(String srcMacAddrEnd) {
    this.srcMacAddrEnd = srcMacAddrEnd;
  }

  public EthFlowDescription destMacAddrEnd(String destMacAddrEnd) {
    this.destMacAddrEnd = destMacAddrEnd;
    return this;
  }

  /**
   * String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042
   * @return destMacAddrEnd
  */
  @ApiModelProperty(value = "String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042")

@Pattern(regexp = "^([0-9a-fA-F]{2})((-[0-9a-fA-F]{2}){5})$") 
  public String getDestMacAddrEnd() {
    return destMacAddrEnd;
  }

  public void setDestMacAddrEnd(String destMacAddrEnd) {
    this.destMacAddrEnd = destMacAddrEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthFlowDescription ethFlowDescription = (EthFlowDescription) o;
    return Objects.equals(this.destMacAddr, ethFlowDescription.destMacAddr) &&
        Objects.equals(this.ethType, ethFlowDescription.ethType) &&
        Objects.equals(this.fDesc, ethFlowDescription.fDesc) &&
        Objects.equals(this.fDir, ethFlowDescription.fDir) &&
        Objects.equals(this.sourceMacAddr, ethFlowDescription.sourceMacAddr) &&
        Objects.equals(this.vlanTags, ethFlowDescription.vlanTags) &&
        Objects.equals(this.srcMacAddrEnd, ethFlowDescription.srcMacAddrEnd) &&
        Objects.equals(this.destMacAddrEnd, ethFlowDescription.destMacAddrEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destMacAddr, ethType, fDesc, fDir, sourceMacAddr, vlanTags, srcMacAddrEnd, destMacAddrEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthFlowDescription {\n");
    
    sb.append("    destMacAddr: ").append(toIndentedString(destMacAddr)).append("\n");
    sb.append("    ethType: ").append(toIndentedString(ethType)).append("\n");
    sb.append("    fDesc: ").append(toIndentedString(fDesc)).append("\n");
    sb.append("    fDir: ").append(toIndentedString(fDir)).append("\n");
    sb.append("    sourceMacAddr: ").append(toIndentedString(sourceMacAddr)).append("\n");
    sb.append("    vlanTags: ").append(toIndentedString(vlanTags)).append("\n");
    sb.append("    srcMacAddrEnd: ").append(toIndentedString(srcMacAddrEnd)).append("\n");
    sb.append("    destMacAddrEnd: ").append(toIndentedString(destMacAddrEnd)).append("\n");
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

