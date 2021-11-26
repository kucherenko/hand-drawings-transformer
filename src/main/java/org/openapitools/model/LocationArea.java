package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CivicAddress;
import org.openapitools.model.GeographicArea;
import org.openapitools.model.NetworkAreaInfo1;
import org.openapitools.model.UmtTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LocationArea
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class LocationArea   {
  @JsonProperty("geographicAreas")
  @Valid
  private List<GeographicArea> geographicAreas = null;

  @JsonProperty("civicAddresses")
  @Valid
  private List<CivicAddress> civicAddresses = null;

  @JsonProperty("nwAreaInfo")
  private NetworkAreaInfo1 nwAreaInfo;

  @JsonProperty("umtTime")
  private UmtTime umtTime;

  public LocationArea geographicAreas(List<GeographicArea> geographicAreas) {
    this.geographicAreas = geographicAreas;
    return this;
  }

  public LocationArea addGeographicAreasItem(GeographicArea geographicAreasItem) {
    if (this.geographicAreas == null) {
      this.geographicAreas = new ArrayList<>();
    }
    this.geographicAreas.add(geographicAreasItem);
    return this;
  }

  /**
   * Identifies a list of geographic area of the user where the UE is located.
   * @return geographicAreas
  */
  @ApiModelProperty(value = "Identifies a list of geographic area of the user where the UE is located.")

  @Valid
@Size(min = 0) 
  public List<GeographicArea> getGeographicAreas() {
    return geographicAreas;
  }

  public void setGeographicAreas(List<GeographicArea> geographicAreas) {
    this.geographicAreas = geographicAreas;
  }

  public LocationArea civicAddresses(List<CivicAddress> civicAddresses) {
    this.civicAddresses = civicAddresses;
    return this;
  }

  public LocationArea addCivicAddressesItem(CivicAddress civicAddressesItem) {
    if (this.civicAddresses == null) {
      this.civicAddresses = new ArrayList<>();
    }
    this.civicAddresses.add(civicAddressesItem);
    return this;
  }

  /**
   * Identifies a list of civic addresses of the user where the UE is located.
   * @return civicAddresses
  */
  @ApiModelProperty(value = "Identifies a list of civic addresses of the user where the UE is located.")

  @Valid
@Size(min = 0) 
  public List<CivicAddress> getCivicAddresses() {
    return civicAddresses;
  }

  public void setCivicAddresses(List<CivicAddress> civicAddresses) {
    this.civicAddresses = civicAddresses;
  }

  public LocationArea nwAreaInfo(NetworkAreaInfo1 nwAreaInfo) {
    this.nwAreaInfo = nwAreaInfo;
    return this;
  }

  /**
   * Get nwAreaInfo
   * @return nwAreaInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkAreaInfo1 getNwAreaInfo() {
    return nwAreaInfo;
  }

  public void setNwAreaInfo(NetworkAreaInfo1 nwAreaInfo) {
    this.nwAreaInfo = nwAreaInfo;
  }

  public LocationArea umtTime(UmtTime umtTime) {
    this.umtTime = umtTime;
    return this;
  }

  /**
   * Get umtTime
   * @return umtTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public UmtTime getUmtTime() {
    return umtTime;
  }

  public void setUmtTime(UmtTime umtTime) {
    this.umtTime = umtTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationArea locationArea = (LocationArea) o;
    return Objects.equals(this.geographicAreas, locationArea.geographicAreas) &&
        Objects.equals(this.civicAddresses, locationArea.civicAddresses) &&
        Objects.equals(this.nwAreaInfo, locationArea.nwAreaInfo) &&
        Objects.equals(this.umtTime, locationArea.umtTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicAreas, civicAddresses, nwAreaInfo, umtTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationArea {\n");
    
    sb.append("    geographicAreas: ").append(toIndentedString(geographicAreas)).append("\n");
    sb.append("    civicAddresses: ").append(toIndentedString(civicAddresses)).append("\n");
    sb.append("    nwAreaInfo: ").append(toIndentedString(nwAreaInfo)).append("\n");
    sb.append("    umtTime: ").append(toIndentedString(umtTime)).append("\n");
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

