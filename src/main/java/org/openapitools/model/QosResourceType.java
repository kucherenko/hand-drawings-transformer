package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.QosResourceTypeAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The enumeration QosResourceType indicates whether a QoS Flow is non-GBR, delay critical GBR, or non-delay critical GBR (see clauses 5.7.3.4 and 5.7.3.5 of 3GPP TS 23.501). It shall comply with the provisions defined in table 5.5.3.6-1.
 */
@ApiModel(description = "The enumeration QosResourceType indicates whether a QoS Flow is non-GBR, delay critical GBR, or non-delay critical GBR (see clauses 5.7.3.4 and 5.7.3.5 of 3GPP TS 23.501). It shall comply with the provisions defined in table 5.5.3.6-1.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class QosResourceType   {

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
    sb.append("class QosResourceType {\n");
    
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

