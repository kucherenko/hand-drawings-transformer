package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.model.UncertaintyEllipse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PointAltitudeUncertaintyAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class PointAltitudeUncertaintyAllOf   {
  @JsonProperty("point")
  private GeographicalCoordinates point;

  @JsonProperty("altitude")
  private Double altitude;

  @JsonProperty("uncertaintyEllipse")
  private UncertaintyEllipse uncertaintyEllipse;

  @JsonProperty("uncertaintyAltitude")
  private Float uncertaintyAltitude;

  @JsonProperty("confidence")
  private Integer confidence;

  public PointAltitudeUncertaintyAllOf point(GeographicalCoordinates point) {
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

  public PointAltitudeUncertaintyAllOf altitude(Double altitude) {
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

  public PointAltitudeUncertaintyAllOf uncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
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

  public PointAltitudeUncertaintyAllOf uncertaintyAltitude(Float uncertaintyAltitude) {
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

  public PointAltitudeUncertaintyAllOf confidence(Integer confidence) {
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
    PointAltitudeUncertaintyAllOf pointAltitudeUncertaintyAllOf = (PointAltitudeUncertaintyAllOf) o;
    return Objects.equals(this.point, pointAltitudeUncertaintyAllOf.point) &&
        Objects.equals(this.altitude, pointAltitudeUncertaintyAllOf.altitude) &&
        Objects.equals(this.uncertaintyEllipse, pointAltitudeUncertaintyAllOf.uncertaintyEllipse) &&
        Objects.equals(this.uncertaintyAltitude, pointAltitudeUncertaintyAllOf.uncertaintyAltitude) &&
        Objects.equals(this.confidence, pointAltitudeUncertaintyAllOf.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, altitude, uncertaintyEllipse, uncertaintyAltitude, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointAltitudeUncertaintyAllOf {\n");
    
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    uncertaintyEllipse: ").append(toIndentedString(uncertaintyEllipse)).append("\n");
    sb.append("    uncertaintyAltitude: ").append(toIndentedString(uncertaintyAltitude)).append("\n");
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

