package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PointUncertaintyCircleAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class PointUncertaintyCircleAllOf   {
  @JsonProperty("point")
  private GeographicalCoordinates point;

  @JsonProperty("uncertainty")
  private Float uncertainty;

  public PointUncertaintyCircleAllOf point(GeographicalCoordinates point) {
    this.point = point;
    return this;
  }

  /**
   * Get point
   * @return point
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GeographicalCoordinates getPoint() {
    return point;
  }

  public void setPoint(GeographicalCoordinates point) {
    this.point = point;
  }

  public PointUncertaintyCircleAllOf uncertainty(Float uncertainty) {
    this.uncertainty = uncertainty;
    return this;
  }

  /**
   * Indicates value of uncertainty.
   * minimum: 0
   * @return uncertainty
  */
  @ApiModelProperty(required = true, value = "Indicates value of uncertainty.")
  @NotNull

@DecimalMin("0") 
  public Float getUncertainty() {
    return uncertainty;
  }

  public void setUncertainty(Float uncertainty) {
    this.uncertainty = uncertainty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointUncertaintyCircleAllOf pointUncertaintyCircleAllOf = (PointUncertaintyCircleAllOf) o;
    return Objects.equals(this.point, pointUncertaintyCircleAllOf.point) &&
        Objects.equals(this.uncertainty, pointUncertaintyCircleAllOf.uncertainty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, uncertainty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointUncertaintyCircleAllOf {\n");
    
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    uncertainty: ").append(toIndentedString(uncertainty)).append("\n");
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

