package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets FlowDirection_anyOf
 */
public enum FlowDirectionAnyOf {
  
  DOWNLINK("DOWNLINK"),
  
  UPLINK("UPLINK"),
  
  BIDIRECTIONAL("BIDIRECTIONAL"),
  
  UNSPECIFIED("UNSPECIFIED");

  private String value;

  FlowDirectionAnyOf(String value) {
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
  public static FlowDirectionAnyOf fromValue(String value) {
    for (FlowDirectionAnyOf b : FlowDirectionAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

