package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GADShape;
import org.openapitools.model.Local3dPointUncertaintyEllipsoidAllOf;
import org.openapitools.model.LocalOrigin;
import org.openapitools.model.RelativeCartesianLocation;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.model.UncertaintyEllipsoid;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Local 3D point with uncertainty ellipsoid
 */
@ApiModel(description = "Local 3D point with uncertainty ellipsoid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class Local3dPointUncertaintyEllipsoid extends GADShape  {
  @JsonProperty("localOrigin")
  private LocalOrigin localOrigin;

  @JsonProperty("point")
  private RelativeCartesianLocation point;

  @JsonProperty("uncertaintyEllipsoid")
  private UncertaintyEllipsoid uncertaintyEllipsoid;

  @JsonProperty("confidence")
  private Integer confidence;

  public Local3dPointUncertaintyEllipsoid localOrigin(LocalOrigin localOrigin) {
    this.localOrigin = localOrigin;
    return this;
  }

  /**
   * Get localOrigin
   * @return localOrigin
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalOrigin getLocalOrigin() {
    return localOrigin;
  }

  public void setLocalOrigin(LocalOrigin localOrigin) {
    this.localOrigin = localOrigin;
  }

  public Local3dPointUncertaintyEllipsoid point(RelativeCartesianLocation point) {
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

  public RelativeCartesianLocation getPoint() {
    return point;
  }

  public void setPoint(RelativeCartesianLocation point) {
    this.point = point;
  }

  public Local3dPointUncertaintyEllipsoid uncertaintyEllipsoid(UncertaintyEllipsoid uncertaintyEllipsoid) {
    this.uncertaintyEllipsoid = uncertaintyEllipsoid;
    return this;
  }

  /**
   * Get uncertaintyEllipsoid
   * @return uncertaintyEllipsoid
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UncertaintyEllipsoid getUncertaintyEllipsoid() {
    return uncertaintyEllipsoid;
  }

  public void setUncertaintyEllipsoid(UncertaintyEllipsoid uncertaintyEllipsoid) {
    this.uncertaintyEllipsoid = uncertaintyEllipsoid;
  }

  public Local3dPointUncertaintyEllipsoid confidence(Integer confidence) {
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
    Local3dPointUncertaintyEllipsoid local3dPointUncertaintyEllipsoid = (Local3dPointUncertaintyEllipsoid) o;
    return Objects.equals(this.localOrigin, local3dPointUncertaintyEllipsoid.localOrigin) &&
        Objects.equals(this.point, local3dPointUncertaintyEllipsoid.point) &&
        Objects.equals(this.uncertaintyEllipsoid, local3dPointUncertaintyEllipsoid.uncertaintyEllipsoid) &&
        Objects.equals(this.confidence, local3dPointUncertaintyEllipsoid.confidence) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localOrigin, point, uncertaintyEllipsoid, confidence, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Local3dPointUncertaintyEllipsoid {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    localOrigin: ").append(toIndentedString(localOrigin)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    uncertaintyEllipsoid: ").append(toIndentedString(uncertaintyEllipsoid)).append("\n");
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

