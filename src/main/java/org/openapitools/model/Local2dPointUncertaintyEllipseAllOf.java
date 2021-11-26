package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LocalOrigin;
import org.openapitools.model.RelativeCartesianLocation;
import org.openapitools.model.UncertaintyEllipse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Local2dPointUncertaintyEllipseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class Local2dPointUncertaintyEllipseAllOf   {
  @JsonProperty("localOrigin")
  private LocalOrigin localOrigin;

  @JsonProperty("point")
  private RelativeCartesianLocation point;

  @JsonProperty("uncertaintyEllipse")
  private UncertaintyEllipse uncertaintyEllipse;

  @JsonProperty("confidence")
  private Integer confidence;

  public Local2dPointUncertaintyEllipseAllOf localOrigin(LocalOrigin localOrigin) {
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

  public Local2dPointUncertaintyEllipseAllOf point(RelativeCartesianLocation point) {
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

  public Local2dPointUncertaintyEllipseAllOf uncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
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

  public Local2dPointUncertaintyEllipseAllOf confidence(Integer confidence) {
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
    Local2dPointUncertaintyEllipseAllOf local2dPointUncertaintyEllipseAllOf = (Local2dPointUncertaintyEllipseAllOf) o;
    return Objects.equals(this.localOrigin, local2dPointUncertaintyEllipseAllOf.localOrigin) &&
        Objects.equals(this.point, local2dPointUncertaintyEllipseAllOf.point) &&
        Objects.equals(this.uncertaintyEllipse, local2dPointUncertaintyEllipseAllOf.uncertaintyEllipse) &&
        Objects.equals(this.confidence, local2dPointUncertaintyEllipseAllOf.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localOrigin, point, uncertaintyEllipse, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Local2dPointUncertaintyEllipseAllOf {\n");
    
    sb.append("    localOrigin: ").append(toIndentedString(localOrigin)).append("\n");
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

