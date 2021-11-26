package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.NetworkPerfTypeAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - GNB_ACTIVE_RATIO: Indicates that the network performance requirement is gNodeB active (i.e. up and running) rate. Indicates the ratio of gNB active (i.e. up and running) number to the total number of gNB   - GNB_COMPUTING_USAGE: Indicates gNodeB computing resource usage.   - GNB_MEMORY_USAGE: Indicates gNodeB memory usage.   - GNB_DISK_USAGE: Indicates gNodeB disk usage.   - NUM_OF_UE: Indicates number of UEs.   - SESS_SUCC_RATIO: Indicates ratio of successful setup of PDU sessions to total PDU session setup attempts.   - SESS_SUCC_RATIO: Indicates Ratio of successful handovers to the total handover attempts.  
 */
@ApiModel(description = "Possible values are   - GNB_ACTIVE_RATIO: Indicates that the network performance requirement is gNodeB active (i.e. up and running) rate. Indicates the ratio of gNB active (i.e. up and running) number to the total number of gNB   - GNB_COMPUTING_USAGE: Indicates gNodeB computing resource usage.   - GNB_MEMORY_USAGE: Indicates gNodeB memory usage.   - GNB_DISK_USAGE: Indicates gNodeB disk usage.   - NUM_OF_UE: Indicates number of UEs.   - SESS_SUCC_RATIO: Indicates ratio of successful setup of PDU sessions to total PDU session setup attempts.   - SESS_SUCC_RATIO: Indicates Ratio of successful handovers to the total handover attempts.  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NetworkPerfType   {

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
    sb.append("class NetworkPerfType {\n");
    
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

