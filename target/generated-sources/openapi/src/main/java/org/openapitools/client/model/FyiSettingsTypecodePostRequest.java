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
 * FyiSettingsTypecodePostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class FyiSettingsTypecodePostRequest {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  @javax.annotation.Nullable
  private Boolean enabled;

  public FyiSettingsTypecodePostRequest() {
  }

  public FyiSettingsTypecodePostRequest enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * the notification should be enabled or disabled.
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FyiSettingsTypecodePostRequest fyiSettingsTypecodePostRequest = (FyiSettingsTypecodePostRequest) o;
    return Objects.equals(this.enabled, fyiSettingsTypecodePostRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FyiSettingsTypecodePostRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FyiSettingsTypecodePostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FyiSettingsTypecodePostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FyiSettingsTypecodePostRequest is not found in the empty JSON string", FyiSettingsTypecodePostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FyiSettingsTypecodePostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FyiSettingsTypecodePostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FyiSettingsTypecodePostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FyiSettingsTypecodePostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FyiSettingsTypecodePostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FyiSettingsTypecodePostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FyiSettingsTypecodePostRequest>() {
           @Override
           public void write(JsonWriter out, FyiSettingsTypecodePostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FyiSettingsTypecodePostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FyiSettingsTypecodePostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FyiSettingsTypecodePostRequest
   * @throws IOException if the JSON string is invalid with respect to FyiSettingsTypecodePostRequest
   */
  public static FyiSettingsTypecodePostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FyiSettingsTypecodePostRequest.class);
  }

  /**
   * Convert an instance of FyiSettingsTypecodePostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

