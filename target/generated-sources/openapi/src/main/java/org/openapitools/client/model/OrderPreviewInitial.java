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
 * Describes the projected change to initial margin.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class OrderPreviewInitial {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  @javax.annotation.Nullable
  private String current;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  @javax.annotation.Nullable
  private String change;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  @javax.annotation.Nullable
  private String after;

  public OrderPreviewInitial() {
  }

  public OrderPreviewInitial current(@javax.annotation.Nullable String current) {
    this.current = current;
    return this;
  }

  /**
   * Current initial margin.
   * @return current
   */
  @javax.annotation.Nullable
  public String getCurrent() {
    return current;
  }

  public void setCurrent(@javax.annotation.Nullable String current) {
    this.current = current;
  }


  public OrderPreviewInitial change(@javax.annotation.Nullable String change) {
    this.change = change;
    return this;
  }

  /**
   * Difference between current and projected initial margin values.
   * @return change
   */
  @javax.annotation.Nullable
  public String getChange() {
    return change;
  }

  public void setChange(@javax.annotation.Nullable String change) {
    this.change = change;
  }


  public OrderPreviewInitial after(@javax.annotation.Nullable String after) {
    this.after = after;
    return this;
  }

  /**
   * Projected initial margin after execution of the order.
   * @return after
   */
  @javax.annotation.Nullable
  public String getAfter() {
    return after;
  }

  public void setAfter(@javax.annotation.Nullable String after) {
    this.after = after;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPreviewInitial orderPreviewInitial = (OrderPreviewInitial) o;
    return Objects.equals(this.current, orderPreviewInitial.current) &&
        Objects.equals(this.change, orderPreviewInitial.change) &&
        Objects.equals(this.after, orderPreviewInitial.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, change, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPreviewInitial {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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
    openapiFields.add("current");
    openapiFields.add("change");
    openapiFields.add("after");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderPreviewInitial
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderPreviewInitial.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderPreviewInitial is not found in the empty JSON string", OrderPreviewInitial.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderPreviewInitial.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderPreviewInitial` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("current") != null && !jsonObj.get("current").isJsonNull()) && !jsonObj.get("current").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current").toString()));
      }
      if ((jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) && !jsonObj.get("change").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change").toString()));
      }
      if ((jsonObj.get("after") != null && !jsonObj.get("after").isJsonNull()) && !jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderPreviewInitial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderPreviewInitial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderPreviewInitial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderPreviewInitial.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderPreviewInitial>() {
           @Override
           public void write(JsonWriter out, OrderPreviewInitial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderPreviewInitial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderPreviewInitial given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderPreviewInitial
   * @throws IOException if the JSON string is invalid with respect to OrderPreviewInitial
   */
  public static OrderPreviewInitial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderPreviewInitial.class);
  }

  /**
   * Convert an instance of OrderPreviewInitial to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

