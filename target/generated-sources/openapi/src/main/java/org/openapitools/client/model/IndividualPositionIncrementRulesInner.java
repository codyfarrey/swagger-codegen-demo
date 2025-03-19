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
import java.math.BigDecimal;
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
 * Objects describing a single increment rule.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class IndividualPositionIncrementRulesInner {
  public static final String SERIALIZED_NAME_INCREMENT = "increment";
  @SerializedName(SERIALIZED_NAME_INCREMENT)
  @javax.annotation.Nullable
  private BigDecimal increment;

  public static final String SERIALIZED_NAME_LOWER_EDGE = "lowerEdge";
  @SerializedName(SERIALIZED_NAME_LOWER_EDGE)
  @javax.annotation.Nullable
  private BigDecimal lowerEdge;

  public IndividualPositionIncrementRulesInner() {
  }

  public IndividualPositionIncrementRulesInner increment(@javax.annotation.Nullable BigDecimal increment) {
    this.increment = increment;
    return this;
  }

  /**
   * The pricing increment.
   * @return increment
   */
  @javax.annotation.Nullable
  public BigDecimal getIncrement() {
    return increment;
  }

  public void setIncrement(@javax.annotation.Nullable BigDecimal increment) {
    this.increment = increment;
  }


  public IndividualPositionIncrementRulesInner lowerEdge(@javax.annotation.Nullable BigDecimal lowerEdge) {
    this.lowerEdge = lowerEdge;
    return this;
  }

  /**
   * Lower edge from which the price increment rule is effective.
   * @return lowerEdge
   */
  @javax.annotation.Nullable
  public BigDecimal getLowerEdge() {
    return lowerEdge;
  }

  public void setLowerEdge(@javax.annotation.Nullable BigDecimal lowerEdge) {
    this.lowerEdge = lowerEdge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualPositionIncrementRulesInner individualPositionIncrementRulesInner = (IndividualPositionIncrementRulesInner) o;
    return Objects.equals(this.increment, individualPositionIncrementRulesInner.increment) &&
        Objects.equals(this.lowerEdge, individualPositionIncrementRulesInner.lowerEdge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increment, lowerEdge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualPositionIncrementRulesInner {\n");
    sb.append("    increment: ").append(toIndentedString(increment)).append("\n");
    sb.append("    lowerEdge: ").append(toIndentedString(lowerEdge)).append("\n");
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
    openapiFields.add("increment");
    openapiFields.add("lowerEdge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IndividualPositionIncrementRulesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IndividualPositionIncrementRulesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndividualPositionIncrementRulesInner is not found in the empty JSON string", IndividualPositionIncrementRulesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IndividualPositionIncrementRulesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndividualPositionIncrementRulesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndividualPositionIncrementRulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndividualPositionIncrementRulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndividualPositionIncrementRulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndividualPositionIncrementRulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<IndividualPositionIncrementRulesInner>() {
           @Override
           public void write(JsonWriter out, IndividualPositionIncrementRulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndividualPositionIncrementRulesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IndividualPositionIncrementRulesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IndividualPositionIncrementRulesInner
   * @throws IOException if the JSON string is invalid with respect to IndividualPositionIncrementRulesInner
   */
  public static IndividualPositionIncrementRulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndividualPositionIncrementRulesInner.class);
  }

  /**
   * Convert an instance of IndividualPositionIncrementRulesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

