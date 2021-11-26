package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ExceptionIdAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - UNEXPECTED_UE_LOCATION: Unexpected UE location   - UNEXPECTED_LONG_LIVE_FLOW: Unexpected long-live rate flows   - UNEXPECTED_LARGE_RATE_FLOW: Unexpected large rate flows   - UNEXPECTED_WAKEUP: Unexpected wakeup   - SUSPICION_OF_DDOS_ATTACK: Suspicion of DDoS attack   - WRONG_DESTINATION_ADDRESS: Wrong destination address   - TOO_FREQUENT_SERVICE_ACCESS: Too frequent Service Access   - UNEXPECTED_RADIO_LINK_FAILURES: Unexpected radio link failures   - PING_PONG_ACROSS_CELLS: Ping-ponging across neighbouring cells 
 */
@ApiModel(description = "Possible values are   - UNEXPECTED_UE_LOCATION: Unexpected UE location   - UNEXPECTED_LONG_LIVE_FLOW: Unexpected long-live rate flows   - UNEXPECTED_LARGE_RATE_FLOW: Unexpected large rate flows   - UNEXPECTED_WAKEUP: Unexpected wakeup   - SUSPICION_OF_DDOS_ATTACK: Suspicion of DDoS attack   - WRONG_DESTINATION_ADDRESS: Wrong destination address   - TOO_FREQUENT_SERVICE_ACCESS: Too frequent Service Access   - UNEXPECTED_RADIO_LINK_FAILURES: Unexpected radio link failures   - PING_PONG_ACROSS_CELLS: Ping-ponging across neighbouring cells ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class ExceptionId   {

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
    sb.append("class ExceptionId {\n");
    
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

