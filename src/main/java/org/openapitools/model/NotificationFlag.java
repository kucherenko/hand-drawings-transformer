package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.NotificationFlagAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - ACTIVATE: The event notification is activated. - DEACTIVATE: The event notification is deactivated and shall be muted. The available event(s) shall be stored. - RETRIEVAL: The event notification shall be sent to the NF service consumer(s), after that, is muted again. 
 */
@ApiModel(description = "Possible values are - ACTIVATE: The event notification is activated. - DEACTIVATE: The event notification is deactivated and shall be muted. The available event(s) shall be stored. - RETRIEVAL: The event notification shall be sent to the NF service consumer(s), after that, is muted again. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NotificationFlag   {

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
    sb.append("class NotificationFlag {\n");
    
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

