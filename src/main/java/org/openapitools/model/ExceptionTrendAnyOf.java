package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ExceptionTrend_anyOf
 */
public enum ExceptionTrendAnyOf {
  
  UP("UP"),
  
  DOWN("DOWN"),
  
  UNKNOW("UNKNOW"),
  
  STABLE("STABLE");

  private String value;

  ExceptionTrendAnyOf(String value) {
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
  public static ExceptionTrendAnyOf fromValue(String value) {
    for (ExceptionTrendAnyOf b : ExceptionTrendAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

