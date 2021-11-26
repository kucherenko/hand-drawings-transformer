package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ExpectedAnalyticsTypeAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - MOBILITY: Mobility related abnormal behaviour analytics is expected by the consumer.   - COMMUN: Communication related abnormal behaviour analytics is expected by the consumer.   - MOBILITY_AND_COMMUN: Both mobility and communication related abnormal behaviour analytics is expected by the consumer. 
 */
@ApiModel(description = "Possible values are   - MOBILITY: Mobility related abnormal behaviour analytics is expected by the consumer.   - COMMUN: Communication related abnormal behaviour analytics is expected by the consumer.   - MOBILITY_AND_COMMUN: Both mobility and communication related abnormal behaviour analytics is expected by the consumer. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class ExpectedAnalyticsType   {

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
    sb.append("class ExpectedAnalyticsType {\n");
    
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

