package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets NwdafFailureCode_anyOf
 */
public enum NwdafFailureCodeAnyOf {
  
  UNAVAILABLE_DATA("UNAVAILABLE_DATA"),
  
  BOTH_STAT_PRED_NOT_ALLOWED("BOTH_STAT_PRED_NOT_ALLOWED"),
  
  UNSATISFIED_REQUESTED_ANALYTICS_TIME("UNSATISFIED_REQUESTED_ANALYTICS_TIME"),
  
  OTHER("OTHER");

  private String value;

  NwdafFailureCodeAnyOf(String value) {
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
  public static NwdafFailureCodeAnyOf fromValue(String value) {
    for (NwdafFailureCodeAnyOf b : NwdafFailureCodeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

