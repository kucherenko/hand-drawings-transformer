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
 * Represents average and variance information.
 */
@ApiModel(description = "Represents average and variance information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NumberAverage   {
  @JsonProperty("number")
  private Integer number;

  @JsonProperty("variance")
  private Float variance;

  public NumberAverage number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public NumberAverage variance(Float variance) {
    this.variance = variance;
    return this;
  }

  /**
   * string with format \"float\" as defined in OpenAPI.
   * @return variance
  */
  @ApiModelProperty(required = true, value = "string with format \"float\" as defined in OpenAPI.")
  @NotNull


  public Float getVariance() {
    return variance;
  }

  public void setVariance(Float variance) {
    this.variance = variance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberAverage numberAverage = (NumberAverage) o;
    return Objects.equals(this.number, numberAverage.number) &&
        Objects.equals(this.variance, numberAverage.variance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, variance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberAverage {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
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

