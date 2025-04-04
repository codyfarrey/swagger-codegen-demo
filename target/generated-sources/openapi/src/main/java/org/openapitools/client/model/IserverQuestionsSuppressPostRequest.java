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
 * IserverQuestionsSuppressPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class IserverQuestionsSuppressPostRequest {
  public static final String SERIALIZED_NAME_MESSAGE_IDS = "messageIds";
  @SerializedName(SERIALIZED_NAME_MESSAGE_IDS)
  @javax.annotation.Nullable
  private List<String> messageIds = new ArrayList<>();

  public IserverQuestionsSuppressPostRequest() {
  }

  public IserverQuestionsSuppressPostRequest messageIds(@javax.annotation.Nullable List<String> messageIds) {
    this.messageIds = messageIds;
    return this;
  }

  public IserverQuestionsSuppressPostRequest addMessageIdsItem(String messageIdsItem) {
    if (this.messageIds == null) {
      this.messageIds = new ArrayList<>();
    }
    this.messageIds.add(messageIdsItem);
    return this;
  }

  /**
   * Array of order reply messageId identifier strings to be suppressed.
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
    IserverQuestionsSuppressPostRequest iserverQuestionsSuppressPostRequest = (IserverQuestionsSuppressPostRequest) o;
    return Objects.equals(this.messageIds, iserverQuestionsSuppressPostRequest.messageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IserverQuestionsSuppressPostRequest {\n");
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
    openapiFields.add("messageIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IserverQuestionsSuppressPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IserverQuestionsSuppressPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IserverQuestionsSuppressPostRequest is not found in the empty JSON string", IserverQuestionsSuppressPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IserverQuestionsSuppressPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IserverQuestionsSuppressPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("messageIds") != null && !jsonObj.get("messageIds").isJsonNull() && !jsonObj.get("messageIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageIds` to be an array in the JSON string but got `%s`", jsonObj.get("messageIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IserverQuestionsSuppressPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IserverQuestionsSuppressPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IserverQuestionsSuppressPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IserverQuestionsSuppressPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IserverQuestionsSuppressPostRequest>() {
           @Override
           public void write(JsonWriter out, IserverQuestionsSuppressPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IserverQuestionsSuppressPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IserverQuestionsSuppressPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IserverQuestionsSuppressPostRequest
   * @throws IOException if the JSON string is invalid with respect to IserverQuestionsSuppressPostRequest
   */
  public static IserverQuestionsSuppressPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IserverQuestionsSuppressPostRequest.class);
  }

  /**
   * Convert an instance of IserverQuestionsSuppressPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

