package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ExceptionId_anyOf
 */
public enum ExceptionIdAnyOf {
  
  UNEXPECTED_UE_LOCATION("UNEXPECTED_UE_LOCATION"),
  
  UNEXPECTED_LONG_LIVE_FLOW("UNEXPECTED_LONG_LIVE_FLOW"),
  
  UNEXPECTED_LARGE_RATE_FLOW("UNEXPECTED_LARGE_RATE_FLOW"),
  
  UNEXPECTED_WAKEUP("UNEXPECTED_WAKEUP"),
  
  SUSPICION_OF_DDOS_ATTACK("SUSPICION_OF_DDOS_ATTACK"),
  
  WRONG_DESTINATION_ADDRESS("WRONG_DESTINATION_ADDRESS"),
  
  TOO_FREQUENT_SERVICE_ACCESS("TOO_FREQUENT_SERVICE_ACCESS"),
  
  UNEXPECTED_RADIO_LINK_FAILURES("UNEXPECTED_RADIO_LINK_FAILURES"),
  
  PING_PONG_ACROSS_CELLS("PING_PONG_ACROSS_CELLS");

  private String value;

  ExceptionIdAnyOf(String value) {
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
  public static ExceptionIdAnyOf fromValue(String value) {
    for (ExceptionIdAnyOf b : ExceptionIdAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

