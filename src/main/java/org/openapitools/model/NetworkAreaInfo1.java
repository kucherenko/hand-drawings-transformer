package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Ecgi;
import org.openapitools.model.GlobalRanNodeId;
import org.openapitools.model.Ncgi;
import org.openapitools.model.Tai;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a network area information in which the NF service consumer requests the number of UEs.
 */
@ApiModel(description = "Describes a network area information in which the NF service consumer requests the number of UEs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NetworkAreaInfo1   {
  @JsonProperty("ecgis")
  @Valid
  private List<Ecgi> ecgis = null;

  @JsonProperty("ncgis")
  @Valid
  private List<Ncgi> ncgis = null;

  @JsonProperty("gRanNodeIds")
  @Valid
  private List<GlobalRanNodeId> gRanNodeIds = null;

  @JsonProperty("tais")
  @Valid
  private List<Tai> tais = null;

  public NetworkAreaInfo1 ecgis(List<Ecgi> ecgis) {
    this.ecgis = ecgis;
    return this;
  }

  public NetworkAreaInfo1 addEcgisItem(Ecgi ecgisItem) {
    if (this.ecgis == null) {
      this.ecgis = new ArrayList<>();
    }
    this.ecgis.add(ecgisItem);
    return this;
  }

  /**
   * Contains a list of E-UTRA cell identities.
   * @return ecgis
  */
  @ApiModelProperty(value = "Contains a list of E-UTRA cell identities.")

  @Valid
@Size(min = 1) 
  public List<Ecgi> getEcgis() {
    return ecgis;
  }

  public void setEcgis(List<Ecgi> ecgis) {
    this.ecgis = ecgis;
  }

  public NetworkAreaInfo1 ncgis(List<Ncgi> ncgis) {
    this.ncgis = ncgis;
    return this;
  }

  public NetworkAreaInfo1 addNcgisItem(Ncgi ncgisItem) {
    if (this.ncgis == null) {
      this.ncgis = new ArrayList<>();
    }
    this.ncgis.add(ncgisItem);
    return this;
  }

  /**
   * Contains a list of NR cell identities.
   * @return ncgis
  */
  @ApiModelProperty(value = "Contains a list of NR cell identities.")

  @Valid
@Size(min = 1) 
  public List<Ncgi> getNcgis() {
    return ncgis;
  }

  public void setNcgis(List<Ncgi> ncgis) {
    this.ncgis = ncgis;
  }

  public NetworkAreaInfo1 gRanNodeIds(List<GlobalRanNodeId> gRanNodeIds) {
    this.gRanNodeIds = gRanNodeIds;
    return this;
  }

  public NetworkAreaInfo1 addGRanNodeIdsItem(GlobalRanNodeId gRanNodeIdsItem) {
    if (this.gRanNodeIds == null) {
      this.gRanNodeIds = new ArrayList<>();
    }
    this.gRanNodeIds.add(gRanNodeIdsItem);
    return this;
  }

  /**
   * Contains a list of NG RAN nodes.
   * @return gRanNodeIds
  */
  @ApiModelProperty(value = "Contains a list of NG RAN nodes.")

  @Valid
@Size(min = 1) 
  public List<GlobalRanNodeId> getgRanNodeIds() {
    return gRanNodeIds;
  }

  public void setgRanNodeIds(List<GlobalRanNodeId> gRanNodeIds) {
    this.gRanNodeIds = gRanNodeIds;
  }

  public NetworkAreaInfo1 tais(List<Tai> tais) {
    this.tais = tais;
    return this;
  }

  public NetworkAreaInfo1 addTaisItem(Tai taisItem) {
    if (this.tais == null) {
      this.tais = new ArrayList<>();
    }
    this.tais.add(taisItem);
    return this;
  }

  /**
   * Contains a list of tracking area identities.
   * @return tais
  */
  @ApiModelProperty(value = "Contains a list of tracking area identities.")

  @Valid
@Size(min = 1) 
  public List<Tai> getTais() {
    return tais;
  }

  public void setTais(List<Tai> tais) {
    this.tais = tais;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkAreaInfo1 networkAreaInfo1 = (NetworkAreaInfo1) o;
    return Objects.equals(this.ecgis, networkAreaInfo1.ecgis) &&
        Objects.equals(this.ncgis, networkAreaInfo1.ncgis) &&
        Objects.equals(this.gRanNodeIds, networkAreaInfo1.gRanNodeIds) &&
        Objects.equals(this.tais, networkAreaInfo1.tais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecgis, ncgis, gRanNodeIds, tais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAreaInfo1 {\n");
    
    sb.append("    ecgis: ").append(toIndentedString(ecgis)).append("\n");
    sb.append("    ncgis: ").append(toIndentedString(ncgis)).append("\n");
    sb.append("    gRanNodeIds: ").append(toIndentedString(gRanNodeIds)).append("\n");
    sb.append("    tais: ").append(toIndentedString(tais)).append("\n");
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

