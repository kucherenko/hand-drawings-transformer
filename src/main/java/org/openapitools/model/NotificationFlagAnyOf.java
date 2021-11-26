package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets NotificationFlag_anyOf
 */
public enum NotificationFlagAnyOf {
  
  ACTIVATE("ACTIVATE"),
  
  DEACTIVATE("DEACTIVATE"),
  
  RETRIEVAL("RETRIEVAL");

  private String value;

  NotificationFlagAnyOf(String value) {
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
  public static NotificationFlagAnyOf fromValue(String value) {
    for (NotificationFlagAnyOf b : NotificationFlagAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

