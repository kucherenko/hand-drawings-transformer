package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EllipsoidArc;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.model.Point;
import org.openapitools.model.PointAltitude;
import org.openapitools.model.PointAltitudeUncertainty;
import org.openapitools.model.PointUncertaintyCircle;
import org.openapitools.model.PointUncertaintyEllipse;
import org.openapitools.model.Polygon;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.model.UncertaintyEllipse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Geographic area specified by different shape.
 */
@ApiModel(description = "Geographic area specified by different shape.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class GeographicArea   {
  @JsonProperty("shape")
  private SupportedGADShapes shape;

  @JsonProperty("point")
  private GeographicalCoordinates point;

  @JsonProperty("uncertainty")
  private Float uncertainty;

  @JsonProperty("uncertaintyEllipse")
  private UncertaintyEllipse uncertaintyEllipse;

  @JsonProperty("confidence")
  private Integer confidence;

  @JsonProperty("pointList")
  @Valid
  private List<GeographicalCoordinates> pointList = new ArrayList<>();

  @JsonProperty("altitude")
  private Double altitude;

  @JsonProperty("uncertaintyAltitude")
  private Float uncertaintyAltitude;

  @JsonProperty("innerRadius")
  private Integer innerRadius;

  @JsonProperty("uncertaintyRadius")
  private Float uncertaintyRadius;

  @JsonProperty("offsetAngle")
  private Integer offsetAngle;

  @JsonProperty("includedAngle")
  private Integer includedAngle;

  public GeographicArea shape(SupportedGADShapes shape) {
    this.shape = shape;
    return this;
  }

  /**
   * Get shape
   * @return shape
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SupportedGADShapes getShape() {
    return shape;
  }

  public void setShape(SupportedGADShapes shape) {
    this.shape = shape;
  }

  public GeographicArea point(GeographicalCoordinates point) {
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

  public GeographicArea uncertainty(Float uncertainty) {
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

  public GeographicArea uncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
    this.uncertaintyEllipse = uncertaintyEllipse;
    return this;
  }

  /**
   * Get uncertaintyEllipse
   * @return uncertaintyEllipse
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UncertaintyEllipse getUncertaintyEllipse() {
    return uncertaintyEllipse;
  }

  public void setUncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
    this.uncertaintyEllipse = uncertaintyEllipse;
  }

  public GeographicArea confidence(Integer confidence) {
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

  public GeographicArea pointList(List<GeographicalCoordinates> pointList) {
    this.pointList = pointList;
    return this;
  }

  public GeographicArea addPointListItem(GeographicalCoordinates pointListItem) {
    this.pointList.add(pointListItem);
    return this;
  }

  /**
   * List of points.
   * @return pointList
  */
  @ApiModelProperty(required = true, value = "List of points.")
  @NotNull

  @Valid
@Size(min = 3, max = 15) 
  public List<GeographicalCoordinates> getPointList() {
    return pointList;
  }

  public void setPointList(List<GeographicalCoordinates> pointList) {
    this.pointList = pointList;
  }

  public GeographicArea altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Indicates value of altitude.
   * minimum: -32767
   * maximum: 32767
   * @return altitude
  */
  @ApiModelProperty(required = true, value = "Indicates value of altitude.")
  @NotNull

@DecimalMin("-32767") @DecimalMax("32767") 
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public GeographicArea uncertaintyAltitude(Float uncertaintyAltitude) {
    this.uncertaintyAltitude = uncertaintyAltitude;
    return this;
  }

  /**
   * Indicates value of uncertainty.
   * minimum: 0
   * @return uncertaintyAltitude
  */
  @ApiModelProperty(required = true, value = "Indicates value of uncertainty.")
  @NotNull

@DecimalMin("0") 
  public Float getUncertaintyAltitude() {
    return uncertaintyAltitude;
  }

  public void setUncertaintyAltitude(Float uncertaintyAltitude) {
    this.uncertaintyAltitude = uncertaintyAltitude;
  }

  public GeographicArea innerRadius(Integer innerRadius) {
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

  public GeographicArea uncertaintyRadius(Float uncertaintyRadius) {
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

  public GeographicArea offsetAngle(Integer offsetAngle) {
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

  public GeographicArea includedAngle(Integer includedAngle) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicArea geographicArea = (GeographicArea) o;
    return Objects.equals(this.shape, geographicArea.shape) &&
        Objects.equals(this.point, geographicArea.point) &&
        Objects.equals(this.uncertainty, geographicArea.uncertainty) &&
        Objects.equals(this.uncertaintyEllipse, geographicArea.uncertaintyEllipse) &&
        Objects.equals(this.confidence, geographicArea.confidence) &&
        Objects.equals(this.pointList, geographicArea.pointList) &&
        Objects.equals(this.altitude, geographicArea.altitude) &&
        Objects.equals(this.uncertaintyAltitude, geographicArea.uncertaintyAltitude) &&
        Objects.equals(this.innerRadius, geographicArea.innerRadius) &&
        Objects.equals(this.uncertaintyRadius, geographicArea.uncertaintyRadius) &&
        Objects.equals(this.offsetAngle, geographicArea.offsetAngle) &&
        Objects.equals(this.includedAngle, geographicArea.includedAngle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shape, point, uncertainty, uncertaintyEllipse, confidence, pointList, altitude, uncertaintyAltitude, innerRadius, uncertaintyRadius, offsetAngle, includedAngle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicArea {\n");
    
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    uncertainty: ").append(toIndentedString(uncertainty)).append("\n");
    sb.append("    uncertaintyEllipse: ").append(toIndentedString(uncertaintyEllipse)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    pointList: ").append(toIndentedString(pointList)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    uncertaintyAltitude: ").append(toIndentedString(uncertaintyAltitude)).append("\n");
    sb.append("    innerRadius: ").append(toIndentedString(innerRadius)).append("\n");
    sb.append("    uncertaintyRadius: ").append(toIndentedString(uncertaintyRadius)).append("\n");
    sb.append("    offsetAngle: ").append(toIndentedString(offsetAngle)).append("\n");
    sb.append("    includedAngle: ").append(toIndentedString(includedAngle)).append("\n");
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

