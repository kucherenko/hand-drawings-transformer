package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.DatasetStatisticalPropertyAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - UNIFORM_DIST_DATA: Indicates the use of data samples that are uniformly distributed according to the different aspects of the requested analytics.   - NO_OUTLIERS: Indicates that the data samples shall disregard data samples that are at the extreme boundaries of the value range. 
 */
@ApiModel(description = "Possible values are   - UNIFORM_DIST_DATA: Indicates the use of data samples that are uniformly distributed according to the different aspects of the requested analytics.   - NO_OUTLIERS: Indicates that the data samples shall disregard data samples that are at the extreme boundaries of the value range. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class DatasetStatisticalProperty   {

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
    sb.append("class DatasetStatisticalProperty {\n");
    
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

