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
import java.util.Arrays;

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
 * AlertActivationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AlertActivationRequest {
  public static final String SERIALIZED_NAME_ALERT_ID = "alertId";
  @SerializedName(SERIALIZED_NAME_ALERT_ID)
  @javax.annotation.Nonnull
  private Integer alertId;

  public static final String SERIALIZED_NAME_ALERT_ACTIVE = "alertActive";
  @SerializedName(SERIALIZED_NAME_ALERT_ACTIVE)
  @javax.annotation.Nonnull
  private Integer alertActive;

  public AlertActivationRequest() {
  }

  public AlertActivationRequest alertId(@javax.annotation.Nonnull Integer alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * The alert Identifier
   * @return alertId
   */
  @javax.annotation.Nonnull
  public Integer getAlertId() {
    return alertId;
  }

  public void setAlertId(@javax.annotation.Nonnull Integer alertId) {
    this.alertId = alertId;
  }


  public AlertActivationRequest alertActive(@javax.annotation.Nonnull Integer alertActive) {
    this.alertActive = alertActive;
    return this;
  }

  /**
   * Set whether or not the alert should be active (1) or inactive (0).
   * @return alertActive
   */
  @javax.annotation.Nonnull
  public Integer getAlertActive() {
    return alertActive;
  }

  public void setAlertActive(@javax.annotation.Nonnull Integer alertActive) {
    this.alertActive = alertActive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertActivationRequest alertActivationRequest = (AlertActivationRequest) o;
    return Objects.equals(this.alertId, alertActivationRequest.alertId) &&
        Objects.equals(this.alertActive, alertActivationRequest.alertActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, alertActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertActivationRequest {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    alertActive: ").append(toIndentedString(alertActive)).append("\n");
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
    openapiFields.add("alertId");
    openapiFields.add("alertActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alertId");
    openapiRequiredFields.add("alertActive");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AlertActivationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AlertActivationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlertActivationRequest is not found in the empty JSON string", AlertActivationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AlertActivationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlertActivationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlertActivationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlertActivationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlertActivationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlertActivationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlertActivationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlertActivationRequest>() {
           @Override
           public void write(JsonWriter out, AlertActivationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlertActivationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AlertActivationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AlertActivationRequest
   * @throws IOException if the JSON string is invalid with respect to AlertActivationRequest
   */
  public static AlertActivationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlertActivationRequest.class);
  }

  /**
   * Convert an instance of AlertActivationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

