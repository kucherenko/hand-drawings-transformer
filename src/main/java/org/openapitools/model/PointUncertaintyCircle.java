package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GADShape;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.model.PointUncertaintyCircleAllOf;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipsoid point with uncertainty circle.
 */
@ApiModel(description = "Ellipsoid point with uncertainty circle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class PointUncertaintyCircle extends GADShape  {
  @JsonProperty("point")
  private GeographicalCoordinates point;

  @JsonProperty("uncertainty")
  private Float uncertainty;

  public PointUncertaintyCircle point(GeographicalCoordinates point) {
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

  public PointUncertaintyCircle uncertainty(Float uncertainty) {
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
    PointUncertaintyCircle pointUncertaintyCircle = (PointUncertaintyCircle) o;
    return Objects.equals(this.point, pointUncertaintyCircle.point) &&
        Objects.equals(this.uncertainty, pointUncertaintyCircle.uncertainty) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, uncertainty, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointUncertaintyCircle {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

