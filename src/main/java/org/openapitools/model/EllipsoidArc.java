package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EllipsoidArcAllOf;
import org.openapitools.model.GADShape;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipsoid Arc.
 */
@ApiModel(description = "Ellipsoid Arc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class EllipsoidArc extends GADShape  {
  @JsonProperty("point")
  private GeographicalCoordinates point;

  @JsonProperty("innerRadius")
  private Integer innerRadius;

  @JsonProperty("uncertaintyRadius")
  private Float uncertaintyRadius;

  @JsonProperty("offsetAngle")
  private Integer offsetAngle;

  @JsonProperty("includedAngle")
  private Integer includedAngle;

  @JsonProperty("confidence")
  private Integer confidence;

  public EllipsoidArc point(GeographicalCoordinates point) {
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

  public EllipsoidArc innerRadius(Integer innerRadius) {
    this.innerRadius = innerRadius;
    return this;
  }

  /**
   * Indicates value of the inner radius.
   * minimum: 0
   * maximum: 327675
   * @return innerRadius
  */
  @ApiModelProperty(required = true, value = "Indicates value of the inner radius.")
  @NotNull

@Min(0) @Max(327675) 
  public Integer getInnerRadius() {
    return innerRadius;
  }

  public void setInnerRadius(Integer innerRadius) {
    this.innerRadius = innerRadius;
  }

  public EllipsoidArc uncertaintyRadius(Float uncertaintyRadius) {
    this.uncertaintyRadius = uncertaintyRadius;
    return this;
  }

  /**
   * Indicates value of uncertainty.
   * minimum: 0
   * @return uncertaintyRadius
  */
  @ApiModelProperty(required = true, value = "Indicates value of uncertainty.")
  @NotNull

@DecimalMin("0") 
  public Float getUncertaintyRadius() {
    return uncertaintyRadius;
  }

  public void setUncertaintyRadius(Float uncertaintyRadius) {
    this.uncertaintyRadius = uncertaintyRadius;
  }

  public EllipsoidArc offsetAngle(Integer offsetAngle) {
    this.offsetAngle = offsetAngle;
    return this;
  }

  /**
   * Indicates value of angle.
   * minimum: 0
   * maximum: 360
   * @return offsetAngle
  */
  @ApiModelProperty(required = true, value = "Indicates value of angle.")
  @NotNull

@Min(0) @Max(360) 
  public Integer getOffsetAngle() {
    return offsetAngle;
  }

  public void setOffsetAngle(Integer offsetAngle) {
    this.offsetAngle = offsetAngle;
  }

  public EllipsoidArc includedAngle(Integer includedAngle) {
    this.includedAngle = includedAngle;
    return this;
  }

  /**
   * Indicates value of angle.
   * minimum: 0
   * maximum: 360
   * @return includedAngle
  */
  @ApiModelProperty(required = true, value = "Indicates value of angle.")
  @NotNull

@Min(0) @Max(360) 
  public Integer getIncludedAngle() {
    return includedAngle;
  }

  public void setIncludedAngle(Integer includedAngle) {
    this.includedAngle = includedAngle;
  }

  public EllipsoidArc confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Indicates value of confidence.
   * minimum: 0
   * maximum: 100
   * @return confidence
  */
  @ApiModelProperty(required = true, value = "Indicates value of confidence.")
  @NotNull

@Min(0) @Max(100) 
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
    EllipsoidArc ellipsoidArc = (EllipsoidArc) o;
    return Objects.equals(this.point, ellipsoidArc.point) &&
        Objects.equals(this.innerRadius, ellipsoidArc.innerRadius) &&
        Objects.equals(this.uncertaintyRadius, ellipsoidArc.uncertaintyRadius) &&
        Objects.equals(this.offsetAngle, ellipsoidArc.offsetAngle) &&
        Objects.equals(this.includedAngle, ellipsoidArc.includedAngle) &&
        Objects.equals(this.confidence, ellipsoidArc.confidence) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, innerRadius, uncertaintyRadius, offsetAngle, includedAngle, confidence, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EllipsoidArc {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    innerRadius: ").append(toIndentedString(innerRadius)).append("\n");
    sb.append("    uncertaintyRadius: ").append(toIndentedString(uncertaintyRadius)).append("\n");
    sb.append("    offsetAngle: ").append(toIndentedString(offsetAngle)).append("\n");
    sb.append("    includedAngle: ").append(toIndentedString(includedAngle)).append("\n");
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

