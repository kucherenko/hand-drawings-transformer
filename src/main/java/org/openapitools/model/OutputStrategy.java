package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OutputStrategyAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - BINARY: Indicates that the analytics shall only be reported when the requested level of accuracy is reached within a cycle of periodic notification.   - GRADIENT: Indicates that the analytics shall be reported according with the periodicity irrespective of whether the requested level of accuracy has been reached or not. 
 */
@ApiModel(description = "Possible values are   - BINARY: Indicates that the analytics shall only be reported when the requested level of accuracy is reached within a cycle of periodic notification.   - GRADIENT: Indicates that the analytics shall be reported according with the periodicity irrespective of whether the requested level of accuracy has been reached or not. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class OutputStrategy   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputStrategy {\n");
    
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

