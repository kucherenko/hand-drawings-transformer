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
 * EllipsoidArcAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class EllipsoidArcAllOf   {
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

  public EllipsoidArcAllOf point(GeographicalCoordinates point) {
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

  public EllipsoidArcAllOf innerRadius(Integer innerRadius) {
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

  public EllipsoidArcAllOf uncertaintyRadius(Float uncertaintyRadius) {
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

  public EllipsoidArcAllOf offsetAngle(Integer offsetAngle) {
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

  public EllipsoidArcAllOf includedAngle(Integer includedAngle) {
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

  public EllipsoidArcAllOf confidence(Integer confidence) {
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
    EllipsoidArcAllOf ellipsoidArcAllOf = (EllipsoidArcAllOf) o;
    return Objects.equals(this.point, ellipsoidArcAllOf.point) &&
        Objects.equals(this.innerRadius, ellipsoidArcAllOf.innerRadius) &&
        Objects.equals(this.uncertaintyRadius, ellipsoidArcAllOf.uncertaintyRadius) &&
        Objects.equals(this.offsetAngle, ellipsoidArcAllOf.offsetAngle) &&
        Objects.equals(this.includedAngle, ellipsoidArcAllOf.includedAngle) &&
        Objects.equals(this.confidence, ellipsoidArcAllOf.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, innerRadius, uncertaintyRadius, offsetAngle, includedAngle, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EllipsoidArcAllOf {\n");
    
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

