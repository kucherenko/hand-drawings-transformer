package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MatchingDirection_anyOf
 */
public enum MatchingDirectionAnyOf {
  
  ASCENDING("ASCENDING"),
  
  DESCENDING("DESCENDING"),
  
  CROSSED("CROSSED");

  private String value;

  MatchingDirectionAnyOf(String value) {
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
  public static MatchingDirectionAnyOf fromValue(String value) {
    for (MatchingDirectionAnyOf b : MatchingDirectionAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

