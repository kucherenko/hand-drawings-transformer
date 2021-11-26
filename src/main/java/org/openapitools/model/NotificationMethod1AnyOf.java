package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets NotificationMethod_1_anyOf
 */
public enum NotificationMethod1AnyOf {
  
  PERIODIC("PERIODIC"),
  
  ONE_TIME("ONE_TIME"),
  
  ON_EVENT_DETECTION("ON_EVENT_DETECTION");

  private String value;

  NotificationMethod1AnyOf(String value) {
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
  public static NotificationMethod1AnyOf fromValue(String value) {
    for (NotificationMethod1AnyOf b : NotificationMethod1AnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

