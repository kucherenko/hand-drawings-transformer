package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ExceptionId;
import org.openapitools.model.ExceptionTrend;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the Exception information.
 */
@ApiModel(description = "Represents the Exception information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class Exception   {
  @JsonProperty("excepId")
  private ExceptionId excepId;

  @JsonProperty("excepLevel")
  private Integer excepLevel;

  @JsonProperty("excepTrend")
  private ExceptionTrend excepTrend;

  public Exception excepId(ExceptionId excepId) {
    this.excepId = excepId;
    return this;
  }

  /**
   * Get excepId
   * @return excepId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ExceptionId getExcepId() {
    return excepId;
  }

  public void setExcepId(ExceptionId excepId) {
    this.excepId = excepId;
  }

  public Exception excepLevel(Integer excepLevel) {
    this.excepLevel = excepLevel;
    return this;
  }

  /**
   * Get excepLevel
   * @return excepLevel
  */
  @ApiModelProperty(value = "")


  public Integer getExcepLevel() {
    return excepLevel;
  }

  public void setExcepLevel(Integer excepLevel) {
    this.excepLevel = excepLevel;
  }

  public Exception excepTrend(ExceptionTrend excepTrend) {
    this.excepTrend = excepTrend;
    return this;
  }

  /**
   * Get excepTrend
   * @return excepTrend
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExceptionTrend getExcepTrend() {
    return excepTrend;
  }

  public void setExcepTrend(ExceptionTrend excepTrend) {
    this.excepTrend = excepTrend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exception exception = (Exception) o;
    return Objects.equals(this.excepId, exception.excepId) &&
        Objects.equals(this.excepLevel, exception.excepLevel) &&
        Objects.equals(this.excepTrend, exception.excepTrend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excepId, excepLevel, excepTrend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exception {\n");
    
    sb.append("    excepId: ").append(toIndentedString(excepId)).append("\n");
    sb.append("    excepLevel: ").append(toIndentedString(excepLevel)).append("\n");
    sb.append("    excepTrend: ").append(toIndentedString(excepTrend)).append("\n");
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

