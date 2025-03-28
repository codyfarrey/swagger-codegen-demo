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
 * IserverReplyReplyIdPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class IserverReplyReplyIdPostRequest {
  public static final String SERIALIZED_NAME_CONFIRMED = "confirmed";
  @SerializedName(SERIALIZED_NAME_CONFIRMED)
  @javax.annotation.Nullable
  private Boolean confirmed;

  public IserverReplyReplyIdPostRequest() {
  }

  public IserverReplyReplyIdPostRequest confirmed(@javax.annotation.Nullable Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

  /**
   * Value of true answers the question in the affirmative and proceeds with order submission.
   * @return confirmed
   */
  @javax.annotation.Nullable
  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(@javax.annotation.Nullable Boolean confirmed) {
    this.confirmed = confirmed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IserverReplyReplyIdPostRequest iserverReplyReplyIdPostRequest = (IserverReplyReplyIdPostRequest) o;
    return Objects.equals(this.confirmed, iserverReplyReplyIdPostRequest.confirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IserverReplyReplyIdPostRequest {\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
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
    openapiFields.add("confirmed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IserverReplyReplyIdPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IserverReplyReplyIdPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IserverReplyReplyIdPostRequest is not found in the empty JSON string", IserverReplyReplyIdPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IserverReplyReplyIdPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IserverReplyReplyIdPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IserverReplyReplyIdPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IserverReplyReplyIdPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IserverReplyReplyIdPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IserverReplyReplyIdPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IserverReplyReplyIdPostRequest>() {
           @Override
           public void write(JsonWriter out, IserverReplyReplyIdPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IserverReplyReplyIdPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IserverReplyReplyIdPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IserverReplyReplyIdPostRequest
   * @throws IOException if the JSON string is invalid with respect to IserverReplyReplyIdPostRequest
   */
  public static IserverReplyReplyIdPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IserverReplyReplyIdPostRequest.class);
  }

  /**
   * Convert an instance of IserverReplyReplyIdPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

