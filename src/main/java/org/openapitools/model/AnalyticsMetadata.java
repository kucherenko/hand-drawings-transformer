package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.AnalyticsMetadataAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - NUM_OF_SAMPLES: Number of data samples used for the generation of the output analytics.   - DATA_WINDOW: Data time window of the data samples.   - DATA_STAT_PROPS: Dataset statistical properties of the data used to generate the analytics.   - STRATEGY: Output strategy used for the reporting of the analytics.   - ACCURACY: Level of accuracy reached for the analytics. 
 */
@ApiModel(description = "Possible values are   - NUM_OF_SAMPLES: Number of data samples used for the generation of the output analytics.   - DATA_WINDOW: Data time window of the data samples.   - DATA_STAT_PROPS: Dataset statistical properties of the data used to generate the analytics.   - STRATEGY: Output strategy used for the reporting of the analytics.   - ACCURACY: Level of accuracy reached for the analytics. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class AnalyticsMetadata   {

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
    sb.append("class AnalyticsMetadata {\n");
    
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

