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
import org.openapitools.client.model.ErrorResponse;

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
 * ResponseFileResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class ResponseFileResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @javax.annotation.Nullable
  private ErrorResponse error;

  public static final String SERIALIZED_NAME_HAS_ERROR = "hasError";
  @SerializedName(SERIALIZED_NAME_HAS_ERROR)
  @javax.annotation.Nullable
  private Boolean hasError;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "errorDescription";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  @javax.annotation.Nullable
  private String errorDescription;

  public static final String SERIALIZED_NAME_IS_PROCESSED = "isProcessed";
  @SerializedName(SERIALIZED_NAME_IS_PROCESSED)
  @javax.annotation.Nullable
  private Boolean isProcessed;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private Object data;

  public ResponseFileResponse() {
  }

  public ResponseFileResponse error(@javax.annotation.Nullable ErrorResponse error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public ErrorResponse getError() {
    return error;
  }

  public void setError(@javax.annotation.Nullable ErrorResponse error) {
    this.error = error;
  }


  public ResponseFileResponse hasError(@javax.annotation.Nullable Boolean hasError) {
    this.hasError = hasError;
    return this;
  }

  /**
   * Get hasError
   * @return hasError
   */
  @javax.annotation.Nullable
  public Boolean getHasError() {
    return hasError;
  }

  public void setHasError(@javax.annotation.Nullable Boolean hasError) {
    this.hasError = hasError;
  }


  public ResponseFileResponse errorDescription(@javax.annotation.Nullable String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
   */
  @javax.annotation.Nullable
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(@javax.annotation.Nullable String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public ResponseFileResponse isProcessed(@javax.annotation.Nullable Boolean isProcessed) {
    this.isProcessed = isProcessed;
    return this;
  }

  /**
   * Get isProcessed
   * @return isProcessed
   */
  @javax.annotation.Nullable
  public Boolean getIsProcessed() {
    return isProcessed;
  }

  public void setIsProcessed(@javax.annotation.Nullable Boolean isProcessed) {
    this.isProcessed = isProcessed;
  }


  public ResponseFileResponse name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ResponseFileResponse data(@javax.annotation.Nullable Object data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public Object getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable Object data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFileResponse responseFileResponse = (ResponseFileResponse) o;
    return Objects.equals(this.error, responseFileResponse.error) &&
        Objects.equals(this.hasError, responseFileResponse.hasError) &&
        Objects.equals(this.errorDescription, responseFileResponse.errorDescription) &&
        Objects.equals(this.isProcessed, responseFileResponse.isProcessed) &&
        Objects.equals(this.name, responseFileResponse.name) &&
        Objects.equals(this.data, responseFileResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, hasError, errorDescription, isProcessed, name, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFileResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hasError: ").append(toIndentedString(hasError)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    isProcessed: ").append(toIndentedString(isProcessed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("hasError");
    openapiFields.add("errorDescription");
    openapiFields.add("isProcessed");
    openapiFields.add("name");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResponseFileResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResponseFileResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseFileResponse is not found in the empty JSON string", ResponseFileResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResponseFileResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseFileResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        ErrorResponse.validateJsonElement(jsonObj.get("error"));
      }
      if ((jsonObj.get("errorDescription") != null && !jsonObj.get("errorDescription").isJsonNull()) && !jsonObj.get("errorDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDescription").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseFileResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseFileResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseFileResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseFileResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseFileResponse>() {
           @Override
           public void write(JsonWriter out, ResponseFileResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseFileResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ResponseFileResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponseFileResponse
   * @throws IOException if the JSON string is invalid with respect to ResponseFileResponse
   */
  public static ResponseFileResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseFileResponse.class);
  }

  /**
   * Convert an instance of ResponseFileResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

