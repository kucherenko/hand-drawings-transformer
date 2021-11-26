package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DatasetStatisticalProperty_anyOf
 */
public enum DatasetStatisticalPropertyAnyOf {
  
  UNIFORM_DIST_DATA("UNIFORM_DIST_DATA"),
  
  NO_OUTLIERS("NO_OUTLIERS");

  private String value;

  DatasetStatisticalPropertyAnyOf(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DatasetStatisticalPropertyAnyOf fromValue(String value) {
    for (DatasetStatisticalPropertyAnyOf b : DatasetStatisticalPropertyAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

