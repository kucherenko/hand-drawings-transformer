package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets CongestionType_anyOf
 */
public enum CongestionTypeAnyOf {
  
  USER_PLANE("USER_PLANE"),
  
  CONTROL_PLANE("CONTROL_PLANE"),
  
  USER_AND_CONTROL_PLANE("USER_AND_CONTROL_PLANE");

  private String value;

  CongestionTypeAnyOf(String value) {
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
  public static CongestionTypeAnyOf fromValue(String value) {
    for (CongestionTypeAnyOf b : CongestionTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

