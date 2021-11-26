package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets NetworkPerfType_anyOf
 */
public enum NetworkPerfTypeAnyOf {
  
  GNB_ACTIVE_RATIO("GNB_ACTIVE_RATIO"),
  
  GNB_COMPUTING_USAGE("GNB_COMPUTING_USAGE"),
  
  GNB_MEMORY_USAGE("GNB_MEMORY_USAGE"),
  
  GNB_DISK_USAGE("GNB_DISK_USAGE"),
  
  NUM_OF_UE("NUM_OF_UE"),
  
  SESS_SUCC_RATIO("SESS_SUCC_RATIO"),
  
  HO_SUCC_RATIO("HO_SUCC_RATIO");

  private String value;

  NetworkPerfTypeAnyOf(String value) {
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
  public static NetworkPerfTypeAnyOf fromValue(String value) {
    for (NetworkPerfTypeAnyOf b : NetworkPerfTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

