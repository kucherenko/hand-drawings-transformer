package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PartitioningCriteria_anyOf
 */
public enum PartitioningCriteriaAnyOf {
  
  TAC("TAC"),
  
  SUBPLMN("SUBPLMN"),
  
  GEOAREA("GEOAREA"),
  
  SNSSAI("SNSSAI"),
  
  DNN("DNN");

  private String value;

  PartitioningCriteriaAnyOf(String value) {
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
  public static PartitioningCriteriaAnyOf fromValue(String value) {
    for (PartitioningCriteriaAnyOf b : PartitioningCriteriaAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

