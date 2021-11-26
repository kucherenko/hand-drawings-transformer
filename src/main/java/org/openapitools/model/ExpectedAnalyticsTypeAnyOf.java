package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ExpectedAnalyticsType_anyOf
 */
public enum ExpectedAnalyticsTypeAnyOf {
  
  MOBILITY("MOBILITY"),
  
  COMMUN("COMMUN"),
  
  MOBILITY_AND_COMMUN("MOBILITY_AND_COMMUN");

  private String value;

  ExpectedAnalyticsTypeAnyOf(String value) {
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
  public static ExpectedAnalyticsTypeAnyOf fromValue(String value) {
    for (ExpectedAnalyticsTypeAnyOf b : ExpectedAnalyticsTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

