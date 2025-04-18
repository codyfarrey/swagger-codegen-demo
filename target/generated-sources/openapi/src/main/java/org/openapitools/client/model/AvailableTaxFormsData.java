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
import org.openapitools.client.model.AvailableTaxFormsDataValue;

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
 * AvailableTaxFormsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AvailableTaxFormsData {
  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  @javax.annotation.Nullable
  private String dataType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private AvailableTaxFormsDataValue value;

  public AvailableTaxFormsData() {
  }

  public AvailableTaxFormsData dataType(@javax.annotation.Nullable String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   */
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }

  public void setDataType(@javax.annotation.Nullable String dataType) {
    this.dataType = dataType;
  }


  public AvailableTaxFormsData value(@javax.annotation.Nullable AvailableTaxFormsDataValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public AvailableTaxFormsDataValue getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable AvailableTaxFormsDataValue value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTaxFormsData availableTaxFormsData = (AvailableTaxFormsData) o;
    return Objects.equals(this.dataType, availableTaxFormsData.dataType) &&
        Objects.equals(this.value, availableTaxFormsData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTaxFormsData {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("dataType");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvailableTaxFormsData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailableTaxFormsData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableTaxFormsData is not found in the empty JSON string", AvailableTaxFormsData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailableTaxFormsData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailableTaxFormsData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        AvailableTaxFormsDataValue.validateJsonElement(jsonObj.get("value"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableTaxFormsData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableTaxFormsData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableTaxFormsData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableTaxFormsData.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableTaxFormsData>() {
           @Override
           public void write(JsonWriter out, AvailableTaxFormsData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailableTaxFormsData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AvailableTaxFormsData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AvailableTaxFormsData
   * @throws IOException if the JSON string is invalid with respect to AvailableTaxFormsData
   */
  public static AvailableTaxFormsData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableTaxFormsData.class);
  }

  /**
   * Convert an instance of AvailableTaxFormsData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

