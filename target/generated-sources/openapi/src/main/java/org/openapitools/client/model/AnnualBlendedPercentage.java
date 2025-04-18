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
 * AnnualBlendedPercentage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AnnualBlendedPercentage {
  public static final String SERIALIZED_NAME_BLENDED_FROM = "blendedFrom";
  @SerializedName(SERIALIZED_NAME_BLENDED_FROM)
  @javax.annotation.Nullable
  private String blendedFrom;

  public static final String SERIALIZED_NAME_BLENDED_TO = "blendedTo";
  @SerializedName(SERIALIZED_NAME_BLENDED_TO)
  @javax.annotation.Nullable
  private String blendedTo;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  @javax.annotation.Nullable
  private String percentage;

  public AnnualBlendedPercentage() {
  }

  public AnnualBlendedPercentage blendedFrom(@javax.annotation.Nullable String blendedFrom) {
    this.blendedFrom = blendedFrom;
    return this;
  }

  /**
   * Get blendedFrom
   * @return blendedFrom
   */
  @javax.annotation.Nullable
  public String getBlendedFrom() {
    return blendedFrom;
  }

  public void setBlendedFrom(@javax.annotation.Nullable String blendedFrom) {
    this.blendedFrom = blendedFrom;
  }


  public AnnualBlendedPercentage blendedTo(@javax.annotation.Nullable String blendedTo) {
    this.blendedTo = blendedTo;
    return this;
  }

  /**
   * Get blendedTo
   * @return blendedTo
   */
  @javax.annotation.Nullable
  public String getBlendedTo() {
    return blendedTo;
  }

  public void setBlendedTo(@javax.annotation.Nullable String blendedTo) {
    this.blendedTo = blendedTo;
  }


  public AnnualBlendedPercentage percentage(@javax.annotation.Nullable String percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
   */
  @javax.annotation.Nullable
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(@javax.annotation.Nullable String percentage) {
    this.percentage = percentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnualBlendedPercentage annualBlendedPercentage = (AnnualBlendedPercentage) o;
    return Objects.equals(this.blendedFrom, annualBlendedPercentage.blendedFrom) &&
        Objects.equals(this.blendedTo, annualBlendedPercentage.blendedTo) &&
        Objects.equals(this.percentage, annualBlendedPercentage.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blendedFrom, blendedTo, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnualBlendedPercentage {\n");
    sb.append("    blendedFrom: ").append(toIndentedString(blendedFrom)).append("\n");
    sb.append("    blendedTo: ").append(toIndentedString(blendedTo)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
    openapiFields.add("blendedFrom");
    openapiFields.add("blendedTo");
    openapiFields.add("percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnnualBlendedPercentage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnnualBlendedPercentage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnualBlendedPercentage is not found in the empty JSON string", AnnualBlendedPercentage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnnualBlendedPercentage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnualBlendedPercentage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("blendedFrom") != null && !jsonObj.get("blendedFrom").isJsonNull()) && !jsonObj.get("blendedFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blendedFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blendedFrom").toString()));
      }
      if ((jsonObj.get("blendedTo") != null && !jsonObj.get("blendedTo").isJsonNull()) && !jsonObj.get("blendedTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blendedTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blendedTo").toString()));
      }
      if ((jsonObj.get("percentage") != null && !jsonObj.get("percentage").isJsonNull()) && !jsonObj.get("percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("percentage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnualBlendedPercentage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnualBlendedPercentage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnualBlendedPercentage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnualBlendedPercentage.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnualBlendedPercentage>() {
           @Override
           public void write(JsonWriter out, AnnualBlendedPercentage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnualBlendedPercentage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnnualBlendedPercentage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnnualBlendedPercentage
   * @throws IOException if the JSON string is invalid with respect to AnnualBlendedPercentage
   */
  public static AnnualBlendedPercentage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnualBlendedPercentage.class);
  }

  /**
   * Convert an instance of AnnualBlendedPercentage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

