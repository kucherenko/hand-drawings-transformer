package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.PartitioningCriteriaAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - \&quot;TAC\&quot;: Type Allocation Code - \&quot;SUBPLMN\&quot;: Subscriber PLMN ID - \&quot;GEOAREA\&quot;: Geographical area, i.e. list(s) of TAI(s) - \&quot;SNSSAI\&quot;: S-NSSAI - \&quot;DNN\&quot;: DNN 
 */
@ApiModel(description = "Possible values are - \"TAC\": Type Allocation Code - \"SUBPLMN\": Subscriber PLMN ID - \"GEOAREA\": Geographical area, i.e. list(s) of TAI(s) - \"SNSSAI\": S-NSSAI - \"DNN\": DNN ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class PartitioningCriteria   {

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
    sb.append("class PartitioningCriteria {\n");
    
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

