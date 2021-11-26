package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GADShape;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.model.PointUncertaintyEllipseAllOf;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.model.UncertaintyEllipse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipsoid point with uncertainty ellipse.
 */
@ApiModel(description = "Ellipsoid point with uncertainty ellipse.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class PointUncertaintyEllipse extends GADShape  {
  @JsonProperty("point")
  private GeographicalCoordinates point;

  @JsonProperty("uncertaintyEllipse")
  private UncertaintyEllipse uncertaintyEllipse;

  @JsonProperty("confidence")
  private Integer confidence;

  public PointUncertaintyEllipse point(GeographicalCoordinates point) {
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

  public PointUncertaintyEllipse uncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
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

  public PointUncertaintyEllipse confidence(Integer confidence) {
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
    PointUncertaintyEllipse pointUncertaintyEllipse = (PointUncertaintyEllipse) o;
    return Objects.equals(this.point, pointUncertaintyEllipse.point) &&
        Objects.equals(this.uncertaintyEllipse, pointUncertaintyEllipse.uncertaintyEllipse) &&
        Objects.equals(this.confidence, pointUncertaintyEllipse.confidence) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, uncertaintyEllipse, confidence, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointUncertaintyEllipse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    uncertaintyEllipse: ").append(toIndentedString(uncertaintyEllipse)).append("\n");
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

