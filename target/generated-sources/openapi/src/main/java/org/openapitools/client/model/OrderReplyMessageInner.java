/*
 * IB REST API
 * The IB REST API reference documentation
 *
 * The version of the OpenAPI document: 2.13.0
 * Contact: api@interactivebrokers.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * An object containing order reply messages emitted against a single order ticket.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class OrderReplyMessageInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_IS_SUPPRESSED = "isSuppressed";
  @SerializedName(SERIALIZED_NAME_IS_SUPPRESSED)
  @javax.annotation.Nullable
  private Boolean isSuppressed;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private List<String> message = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE_IDS = "messageIds";
  @SerializedName(SERIALIZED_NAME_MESSAGE_IDS)
  @javax.annotation.Nullable
  private List<String> messageIds = new ArrayList<>();

  public OrderReplyMessageInner() {
  }

  public OrderReplyMessageInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The replyId UUID of the order ticket&#39;s emitted order reply messages, used to confirm them and proceed.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public OrderReplyMessageInner isSuppressed(@javax.annotation.Nullable Boolean isSuppressed) {
    this.isSuppressed = isSuppressed;
    return this;
  }

  /**
   * Internal use. Always delivers value &#39;false&#39;.
   * @return isSuppressed
   */
  @javax.annotation.Nullable
  public Boolean getIsSuppressed() {
    return isSuppressed;
  }

  public void setIsSuppressed(@javax.annotation.Nullable Boolean isSuppressed) {
    this.isSuppressed = isSuppressed;
  }


  public OrderReplyMessageInner message(@javax.annotation.Nullable List<String> message) {
    this.message = message;
    return this;
  }

  public OrderReplyMessageInner addMessageItem(String messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<>();
    }
    this.message.add(messageItem);
    return this;
  }

  /**
   * An array containing the human-readable text of all order reply messages emitted for the order ticket.
   * @return message
   */
  @javax.annotation.Nullable
  public List<String> getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable List<String> message) {
    this.message = message;
  }


  public OrderReplyMessageInner messageIds(@javax.annotation.Nullable List<String> messageIds) {
    this.messageIds = messageIds;
    return this;
  }

  public OrderReplyMessageInner addMessageIdsItem(String messageIdsItem) {
    if (this.messageIds == null) {
      this.messageIds = new ArrayList<>();
    }
    this.messageIds.add(messageIdsItem);
    return this;
  }

  /**
   * An array containing identifiers that categorize the types of order reply messages that have been emitted. Elements of this array are ordered so that indicies match the corresponding human-readable text strings in the &#39;message&#39; array.
   * @return messageIds
   */
  @javax.annotation.Nullable
  public List<String> getMessageIds() {
    return messageIds;
  }

  public void setMessageIds(@javax.annotation.Nullable List<String> messageIds) {
    this.messageIds = messageIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReplyMessageInner orderReplyMessageInner = (OrderReplyMessageInner) o;
    return Objects.equals(this.id, orderReplyMessageInner.id) &&
        Objects.equals(this.isSuppressed, orderReplyMessageInner.isSuppressed) &&
        Objects.equals(this.message, orderReplyMessageInner.message) &&
        Objects.equals(this.messageIds, orderReplyMessageInner.messageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isSuppressed, message, messageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReplyMessageInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSuppressed: ").append(toIndentedString(isSuppressed)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageIds: ").append(toIndentedString(messageIds)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("isSuppressed");
    openapiFields.add("message");
    openapiFields.add("messageIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderReplyMessageInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderReplyMessageInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderReplyMessageInner is not found in the empty JSON string", OrderReplyMessageInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderReplyMessageInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderReplyMessageInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull() && !jsonObj.get("message").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be an array in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("messageIds") != null && !jsonObj.get("messageIds").isJsonNull() && !jsonObj.get("messageIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageIds` to be an array in the JSON string but got `%s`", jsonObj.get("messageIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderReplyMessageInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderReplyMessageInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderReplyMessageInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderReplyMessageInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderReplyMessageInner>() {
           @Override
           public void write(JsonWriter out, OrderReplyMessageInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderReplyMessageInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderReplyMessageInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderReplyMessageInner
   * @throws IOException if the JSON string is invalid with respect to OrderReplyMessageInner
   */
  public static OrderReplyMessageInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderReplyMessageInner.class);
  }

  /**
   * Convert an instance of OrderReplyMessageInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

