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
 * ORGRegulatorType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class ORGRegulatorType {
  public static final String SERIALIZED_NAME_REGULATOR_NAME = "regulatorName";
  @SerializedName(SERIALIZED_NAME_REGULATOR_NAME)
  @javax.annotation.Nullable
  private String regulatorName;

  public static final String SERIALIZED_NAME_REGULATOR_COUNTRY = "regulatorCountry";
  @SerializedName(SERIALIZED_NAME_REGULATOR_COUNTRY)
  @javax.annotation.Nullable
  private String regulatorCountry;

  public static final String SERIALIZED_NAME_REGULATED_IN_CAPACITY = "regulatedInCapacity";
  @SerializedName(SERIALIZED_NAME_REGULATED_IN_CAPACITY)
  @javax.annotation.Nullable
  private String regulatedInCapacity;

  public static final String SERIALIZED_NAME_REGULATOR_ID = "regulatorId";
  @SerializedName(SERIALIZED_NAME_REGULATOR_ID)
  @javax.annotation.Nullable
  private String regulatorId;

  public ORGRegulatorType() {
  }

  public ORGRegulatorType regulatorName(@javax.annotation.Nullable String regulatorName) {
    this.regulatorName = regulatorName;
    return this;
  }

  /**
   * Get regulatorName
   * @return regulatorName
   */
  @javax.annotation.Nullable
  public String getRegulatorName() {
    return regulatorName;
  }

  public void setRegulatorName(@javax.annotation.Nullable String regulatorName) {
    this.regulatorName = regulatorName;
  }


  public ORGRegulatorType regulatorCountry(@javax.annotation.Nullable String regulatorCountry) {
    this.regulatorCountry = regulatorCountry;
    return this;
  }

  /**
   * Get regulatorCountry
   * @return regulatorCountry
   */
  @javax.annotation.Nullable
  public String getRegulatorCountry() {
    return regulatorCountry;
  }

  public void setRegulatorCountry(@javax.annotation.Nullable String regulatorCountry) {
    this.regulatorCountry = regulatorCountry;
  }


  public ORGRegulatorType regulatedInCapacity(@javax.annotation.Nullable String regulatedInCapacity) {
    this.regulatedInCapacity = regulatedInCapacity;
    return this;
  }

  /**
   * Get regulatedInCapacity
   * @return regulatedInCapacity
   */
  @javax.annotation.Nullable
  public String getRegulatedInCapacity() {
    return regulatedInCapacity;
  }

  public void setRegulatedInCapacity(@javax.annotation.Nullable String regulatedInCapacity) {
    this.regulatedInCapacity = regulatedInCapacity;
  }


  public ORGRegulatorType regulatorId(@javax.annotation.Nullable String regulatorId) {
    this.regulatorId = regulatorId;
    return this;
  }

  /**
   * Get regulatorId
   * @return regulatorId
   */
  @javax.annotation.Nullable
  public String getRegulatorId() {
    return regulatorId;
  }

  public void setRegulatorId(@javax.annotation.Nullable String regulatorId) {
    this.regulatorId = regulatorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ORGRegulatorType orGRegulatorType = (ORGRegulatorType) o;
    return Objects.equals(this.regulatorName, orGRegulatorType.regulatorName) &&
        Objects.equals(this.regulatorCountry, orGRegulatorType.regulatorCountry) &&
        Objects.equals(this.regulatedInCapacity, orGRegulatorType.regulatedInCapacity) &&
        Objects.equals(this.regulatorId, orGRegulatorType.regulatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatorName, regulatorCountry, regulatedInCapacity, regulatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ORGRegulatorType {\n");
    sb.append("    regulatorName: ").append(toIndentedString(regulatorName)).append("\n");
    sb.append("    regulatorCountry: ").append(toIndentedString(regulatorCountry)).append("\n");
    sb.append("    regulatedInCapacity: ").append(toIndentedString(regulatedInCapacity)).append("\n");
    sb.append("    regulatorId: ").append(toIndentedString(regulatorId)).append("\n");
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
    openapiFields.add("regulatorName");
    openapiFields.add("regulatorCountry");
    openapiFields.add("regulatedInCapacity");
    openapiFields.add("regulatorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ORGRegulatorType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ORGRegulatorType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ORGRegulatorType is not found in the empty JSON string", ORGRegulatorType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ORGRegulatorType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ORGRegulatorType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("regulatorName") != null && !jsonObj.get("regulatorName").isJsonNull()) && !jsonObj.get("regulatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regulatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regulatorName").toString()));
      }
      if ((jsonObj.get("regulatorCountry") != null && !jsonObj.get("regulatorCountry").isJsonNull()) && !jsonObj.get("regulatorCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regulatorCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regulatorCountry").toString()));
      }
      if ((jsonObj.get("regulatedInCapacity") != null && !jsonObj.get("regulatedInCapacity").isJsonNull()) && !jsonObj.get("regulatedInCapacity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regulatedInCapacity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regulatedInCapacity").toString()));
      }
      if ((jsonObj.get("regulatorId") != null && !jsonObj.get("regulatorId").isJsonNull()) && !jsonObj.get("regulatorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regulatorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regulatorId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ORGRegulatorType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ORGRegulatorType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ORGRegulatorType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ORGRegulatorType.class));

       return (TypeAdapter<T>) new TypeAdapter<ORGRegulatorType>() {
           @Override
           public void write(JsonWriter out, ORGRegulatorType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ORGRegulatorType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ORGRegulatorType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ORGRegulatorType
   * @throws IOException if the JSON string is invalid with respect to ORGRegulatorType
   */
  public static ORGRegulatorType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ORGRegulatorType.class);
  }

  /**
   * Convert an instance of ORGRegulatorType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

