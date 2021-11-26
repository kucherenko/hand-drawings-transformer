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
 * Ellipsoid with uncertainty
 */
@ApiModel(description = "Ellipsoid with uncertainty")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class UncertaintyEllipsoid   {
  @JsonProperty("semiMajor")
  private Float semiMajor;

  @JsonProperty("semiMinor")
  private Float semiMinor;

  @JsonProperty("vertical")
  private Float vertical;

  @JsonProperty("orientationMajor")
  private Integer orientationMajor;

  public UncertaintyEllipsoid semiMajor(Float semiMajor) {
    this.semiMajor = semiMajor;
    return this;
  }

  /**
   * Indicates value of uncertainty.
   * minimum: 0
   * @return semiMajor
  */
  @ApiModelProperty(required = true, value = "Indicates value of uncertainty.")
  @NotNull

@DecimalMin("0") 
  public Float getSemiMajor() {
    return semiMajor;
  }

  public void setSemiMajor(Float semiMajor) {
    this.semiMajor = semiMajor;
  }

  public UncertaintyEllipsoid semiMinor(Float semiMinor) {
    this.semiMinor = semiMinor;
    return this;
  }

  /**
   * Indicates value of uncertainty.
   * minimum: 0
   * @return semiMinor
  */
  @ApiModelProperty(required = true, value = "Indicates value of uncertainty.")
  @NotNull

@DecimalMin("0") 
  public Float getSemiMinor() {
    return semiMinor;
  }

  public void setSemiMinor(Float semiMinor) {
    this.semiMinor = semiMinor;
  }

  public UncertaintyEllipsoid vertical(Float vertical) {
    this.vertical = vertical;
    return this;
  }

  /**
   * Indicates value of uncertainty.
   * minimum: 0
   * @return vertical
  */
  @ApiModelProperty(required = true, value = "Indicates value of uncertainty.")
  @NotNull

@DecimalMin("0") 
  public Float getVertical() {
    return vertical;
  }

  public void setVertical(Float vertical) {
    this.vertical = vertical;
  }

  public UncertaintyEllipsoid orientationMajor(Integer orientationMajor) {
    this.orientationMajor = orientationMajor;
    return this;
  }

  /**
   * Indicates value of orientation angle.
   * minimum: 0
   * maximum: 180
   * @return orientationMajor
  */
  @ApiModelProperty(required = true, value = "Indicates value of orientation angle.")
  @NotNull

@Min(0) @Max(180) 
  public Integer getOrientationMajor() {
    return orientationMajor;
  }

  public void setOrientationMajor(Integer orientationMajor) {
    this.orientationMajor = orientationMajor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UncertaintyEllipsoid uncertaintyEllipsoid = (UncertaintyEllipsoid) o;
    return Objects.equals(this.semiMajor, uncertaintyEllipsoid.semiMajor) &&
        Objects.equals(this.semiMinor, uncertaintyEllipsoid.semiMinor) &&
        Objects.equals(this.vertical, uncertaintyEllipsoid.vertical) &&
        Objects.equals(this.orientationMajor, uncertaintyEllipsoid.orientationMajor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(semiMajor, semiMinor, vertical, orientationMajor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UncertaintyEllipsoid {\n");
    
    sb.append("    semiMajor: ").append(toIndentedString(semiMajor)).append("\n");
    sb.append("    semiMinor: ").append(toIndentedString(semiMinor)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    orientationMajor: ").append(toIndentedString(orientationMajor)).append("\n");
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

