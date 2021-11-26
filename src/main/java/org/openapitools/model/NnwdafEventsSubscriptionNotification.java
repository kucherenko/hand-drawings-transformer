package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EventNotification;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents an Individual NWDAF Event Subscription Notification resource.
 */
@ApiModel(description = "Represents an Individual NWDAF Event Subscription Notification resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NnwdafEventsSubscriptionNotification   {
  @JsonProperty("eventNotifications")
  @Valid
  private List<EventNotification> eventNotifications = new ArrayList<>();

  @JsonProperty("subscriptionId")
  private String subscriptionId;

  public NnwdafEventsSubscriptionNotification eventNotifications(List<EventNotification> eventNotifications) {
    this.eventNotifications = eventNotifications;
    return this;
  }

  public NnwdafEventsSubscriptionNotification addEventNotificationsItem(EventNotification eventNotificationsItem) {
    this.eventNotifications.add(eventNotificationsItem);
    return this;
  }

  /**
   * Notifications about Individual Events
   * @return eventNotifications
  */
  @ApiModelProperty(required = true, value = "Notifications about Individual Events")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<EventNotification> getEventNotifications() {
    return eventNotifications;
  }

  public void setEventNotifications(List<EventNotification> eventNotifications) {
    this.eventNotifications = eventNotifications;
  }

  public NnwdafEventsSubscriptionNotification subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * String identifying a subscription to the Nnwdaf_EventsSubscription Service
   * @return subscriptionId
  */
  @ApiModelProperty(required = true, value = "String identifying a subscription to the Nnwdaf_EventsSubscription Service")
  @NotNull


  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NnwdafEventsSubscriptionNotification nnwdafEventsSubscriptionNotification = (NnwdafEventsSubscriptionNotification) o;
    return Objects.equals(this.eventNotifications, nnwdafEventsSubscriptionNotification.eventNotifications) &&
        Objects.equals(this.subscriptionId, nnwdafEventsSubscriptionNotification.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventNotifications, subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NnwdafEventsSubscriptionNotification {\n");
    
    sb.append("    eventNotifications: ").append(toIndentedString(eventNotifications)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

