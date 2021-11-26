package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AnalyticsMetadata_anyOf
 */
public enum AnalyticsMetadataAnyOf {
  
  NUM_OF_SAMPLES("NUM_OF_SAMPLES"),
  
  DATA_WINDOW("DATA_WINDOW"),
  
  DATA_STAT_PROPS("DATA_STAT_PROPS"),
  
  STRATEGY("STRATEGY"),
  
  ACCURACY("ACCURACY");

  private String value;

  AnalyticsMetadataAnyOf(String value) {
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
  public static AnalyticsMetadataAnyOf fromValue(String value) {
    for (AnalyticsMetadataAnyOf b : AnalyticsMetadataAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

