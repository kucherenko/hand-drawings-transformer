package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NetworkAreaInfo;
import org.openapitools.model.NumberAverage;
import org.openapitools.model.Snssai;
import org.openapitools.model.TimeWindow;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the network slice and optionally the associated network slice instance and the load level information.
 */
@ApiModel(description = "Represents the network slice and optionally the associated network slice instance and the load level information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NsiLoadLevelInfo   {
  @JsonProperty("loadLevelInformation")
//  0 to 100?
  //
  private Integer loadLevelInformation;

  @JsonProperty("snssai")
  private Snssai snssai;

  @JsonProperty("nsiId")
  private String nsiId;

  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea;

  @JsonProperty("timePeriod")
  private TimeWindow timePeriod;

  @JsonProperty("numOfUes")
//  number of users in the area
  private NumberAverage numOfUes;

  @JsonProperty("numOfPduSess")
//  potentially, more than number of users, due to multiple "connections" from 1 device
  private NumberAverage numOfPduSess;

  @JsonProperty("confidence")
  private Integer confidence;

  public NsiLoadLevelInfo loadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
    return this;
  }

  /**
   * Load level information of the network slice and the optionally associated network slice instance.
   * @return loadLevelInformation
  */
  @ApiModelProperty(required = true, value = "Load level information of the network slice and the optionally associated network slice instance.")
  @NotNull


  public Integer getLoadLevelInformation() {
    return loadLevelInformation;
  }

  public void setLoadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
  }

  public NsiLoadLevelInfo snssai(Snssai snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }

  public NsiLoadLevelInfo nsiId(String nsiId) {
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

  public NsiLoadLevelInfo networkArea(NetworkAreaInfo networkArea) {
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

  public NsiLoadLevelInfo timePeriod(TimeWindow timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * Get timePeriod
   * @return timePeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeWindow getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(TimeWindow timePeriod) {
    this.timePeriod = timePeriod;
  }

  public NsiLoadLevelInfo numOfUes(NumberAverage numOfUes) {
    this.numOfUes = numOfUes;
    return this;
  }

  /**
   * Get numOfUes
   * @return numOfUes
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberAverage getNumOfUes() {
    return numOfUes;
  }

  public void setNumOfUes(NumberAverage numOfUes) {
    this.numOfUes = numOfUes;
  }

  public NsiLoadLevelInfo numOfPduSess(NumberAverage numOfPduSess) {
    this.numOfPduSess = numOfPduSess;
    return this;
  }

  /**
   * Get numOfPduSess
   * @return numOfPduSess
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberAverage getNumOfPduSess() {
    return numOfPduSess;
  }

  public void setNumOfPduSess(NumberAverage numOfPduSess) {
    this.numOfPduSess = numOfPduSess;
  }

  public NsiLoadLevelInfo confidence(Integer confidence) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsiLoadLevelInfo nsiLoadLevelInfo = (NsiLoadLevelInfo) o;
    return Objects.equals(this.loadLevelInformation, nsiLoadLevelInfo.loadLevelInformation) &&
        Objects.equals(this.snssai, nsiLoadLevelInfo.snssai) &&
        Objects.equals(this.nsiId, nsiLoadLevelInfo.nsiId) &&
        Objects.equals(this.networkArea, nsiLoadLevelInfo.networkArea) &&
        Objects.equals(this.timePeriod, nsiLoadLevelInfo.timePeriod) &&
        Objects.equals(this.numOfUes, nsiLoadLevelInfo.numOfUes) &&
        Objects.equals(this.numOfPduSess, nsiLoadLevelInfo.numOfPduSess) &&
        Objects.equals(this.confidence, nsiLoadLevelInfo.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadLevelInformation, snssai, nsiId, networkArea, timePeriod, numOfUes, numOfPduSess, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsiLoadLevelInfo {\n");
    
    sb.append("    loadLevelInformation: ").append(toIndentedString(loadLevelInformation)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    nsiId: ").append(toIndentedString(nsiId)).append("\n");
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    numOfUes: ").append(toIndentedString(numOfUes)).append("\n");
    sb.append("    numOfPduSess: ").append(toIndentedString(numOfPduSess)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

