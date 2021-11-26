package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Common base type for GAD shapes.
 */
@ApiModel(description = "Common base type for GAD shapes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "shape", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = EllipsoidArc.class, name = "ELLIPSOID_ARC"),
  @JsonSubTypes.Type(value = Local2dPointUncertaintyEllipse.class, name = "LOCAL_2D_POINT_UNCERTAINTY_ELLIPSE"),
  @JsonSubTypes.Type(value = Local3dPointUncertaintyEllipsoid.class, name = "LOCAL_3D_POINT_UNCERTAINTY_ELLIPSOID"),
  @JsonSubTypes.Type(value = Point.class, name = "POINT"),
  @JsonSubTypes.Type(value = PointAltitude.class, name = "POINT_ALTITUDE"),
  @JsonSubTypes.Type(value = PointAltitudeUncertainty.class, name = "POINT_ALTITUDE_UNCERTAINTY"),
  @JsonSubTypes.Type(value = PointUncertaintyCircle.class, name = "POINT_UNCERTAINTY_CIRCLE"),
  @JsonSubTypes.Type(value = PointUncertaintyEllipse.class, name = "POINT_UNCERTAINTY_ELLIPSE"),
  @JsonSubTypes.Type(value = Polygon.class, name = "POLYGON"),
})

public class GADShape   {
  @JsonProperty("shape")
  private SupportedGADShapes shape;

  public GADShape shape(SupportedGADShapes shape) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GADShape gaDShape = (GADShape) o;
    return Objects.equals(this.shape, gaDShape.shape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shape);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GADShape {\n");
    
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
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

