package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Relative Cartesian Location
 */
@ApiModel(description = "Relative Cartesian Location")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class RelativeCartesianLocation   {
  @JsonProperty("x")
  private Float x;

  @JsonProperty("y")
  private Float y;

  @JsonProperty("z")
  private Float z;

  public RelativeCartesianLocation x(Float x) {
    this.x = x;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return x
  */
  @ApiModelProperty(required = true, value = "string with format \"float\" as defined in OpenAPI.")
  @NotNull


  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public RelativeCartesianLocation y(Float y) {
    this.y = y;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return y
  */
  @ApiModelProperty(required = true, value = "string with format \"float\" as defined in OpenAPI.")
  @NotNull


  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public RelativeCartesianLocation z(Float z) {
    this.z = z;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return z
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getZ() {
    return z;
  }

  public void setZ(Float z) {
    this.z = z;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeCartesianLocation relativeCartesianLocation = (RelativeCartesianLocation) o;
    return Objects.equals(this.x, relativeCartesianLocation.x) &&
        Objects.equals(this.y, relativeCartesianLocation.y) &&
        Objects.equals(this.z, relativeCartesianLocation.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeCartesianLocation {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

