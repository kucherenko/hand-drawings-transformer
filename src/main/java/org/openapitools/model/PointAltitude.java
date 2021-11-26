package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GADShape;
import org.openapitools.model.GeographicalCoordinates;
import org.openapitools.model.PointAltitudeAllOf;
import org.openapitools.model.SupportedGADShapes;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipsoid point with altitude.
 */
@ApiModel(description = "Ellipsoid point with altitude.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class PointAltitude extends GADShape  {
  @JsonProperty("point")
  private GeographicalCoordinates point;

  @JsonProperty("altitude")
  private Double altitude;

  public PointAltitude point(GeographicalCoordinates point) {
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

  public PointAltitude altitude(Double altitude) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointAltitude pointAltitude = (PointAltitude) o;
    return Objects.equals(this.point, pointAltitude.point) &&
        Objects.equals(this.altitude, pointAltitude.altitude) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, altitude, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointAltitude {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
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

