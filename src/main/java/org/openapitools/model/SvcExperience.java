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
 * Contains a mean opinion score with the customized range.
 */
@ApiModel(description = "Contains a mean opinion score with the customized range.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class SvcExperience   {
  @JsonProperty("mos")
  private Float mos;

  @JsonProperty("upperRange")
  private Float upperRange;

  @JsonProperty("lowerRange")
  private Float lowerRange;

  public SvcExperience mos(Float mos) {
    this.mos = mos;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return mos
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getMos() {
    return mos;
  }

  public void setMos(Float mos) {
    this.mos = mos;
  }

  public SvcExperience upperRange(Float upperRange) {
    this.upperRange = upperRange;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return upperRange
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getUpperRange() {
    return upperRange;
  }

  public void setUpperRange(Float upperRange) {
    this.upperRange = upperRange;
  }

  public SvcExperience lowerRange(Float lowerRange) {
    this.lowerRange = lowerRange;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return lowerRange
  */
  @ApiModelProperty(value = "string with format \"float\" as defined in OpenAPI.")


  public Float getLowerRange() {
    return lowerRange;
  }

  public void setLowerRange(Float lowerRange) {
    this.lowerRange = lowerRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SvcExperience svcExperience = (SvcExperience) o;
    return Objects.equals(this.mos, svcExperience.mos) &&
        Objects.equals(this.upperRange, svcExperience.upperRange) &&
        Objects.equals(this.lowerRange, svcExperience.lowerRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mos, upperRange, lowerRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvcExperience {\n");
    
    sb.append("    mos: ").append(toIndentedString(mos)).append("\n");
    sb.append("    upperRange: ").append(toIndentedString(upperRange)).append("\n");
    sb.append("    lowerRange: ").append(toIndentedString(lowerRange)).append("\n");
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

