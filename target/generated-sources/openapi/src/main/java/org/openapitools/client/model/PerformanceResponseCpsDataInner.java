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
 * PerformanceResponseCpsDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class PerformanceResponseCpsDataInner {
  public static final String SERIALIZED_NAME_ID_TYPE = "idType";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  @javax.annotation.Nullable
  private String idType;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private String start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private String end;

  public static final String SERIALIZED_NAME_RETURNS = "returns";
  @SerializedName(SERIALIZED_NAME_RETURNS)
  @javax.annotation.Nullable
  private List<String> returns = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_BASE_CURRENCY = "baseCurrency";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY)
  @javax.annotation.Nullable
  private String baseCurrency;

  public PerformanceResponseCpsDataInner() {
  }

  public PerformanceResponseCpsDataInner idType(@javax.annotation.Nullable String idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Returns the key value of the request.
   * @return idType
   */
  @javax.annotation.Nullable
  public String getIdType() {
    return idType;
  }

  public void setIdType(@javax.annotation.Nullable String idType) {
    this.idType = idType;
  }


  public PerformanceResponseCpsDataInner start(@javax.annotation.Nullable String start) {
    this.start = start;
    return this;
  }

  /**
   * Returns the starting value of the value range.
   * @return start
   */
  @javax.annotation.Nullable
  public String getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable String start) {
    this.start = start;
  }


  public PerformanceResponseCpsDataInner end(@javax.annotation.Nullable String end) {
    this.end = end;
    return this;
  }

  /**
   * Returns the ending value of the value range.
   * @return end
   */
  @javax.annotation.Nullable
  public String getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable String end) {
    this.end = end;
  }


  public PerformanceResponseCpsDataInner returns(@javax.annotation.Nullable List<String> returns) {
    this.returns = returns;
    return this;
  }

  public PerformanceResponseCpsDataInner addReturnsItem(String returnsItem) {
    if (this.returns == null) {
      this.returns = new ArrayList<>();
    }
    this.returns.add(returnsItem);
    return this;
  }

  /**
   * Returns all cps values in order between the start and end times.
   * @return returns
   */
  @javax.annotation.Nullable
  public List<String> getReturns() {
    return returns;
  }

  public void setReturns(@javax.annotation.Nullable List<String> returns) {
    this.returns = returns;
  }


  public PerformanceResponseCpsDataInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Returns the account identifier.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public PerformanceResponseCpsDataInner baseCurrency(@javax.annotation.Nullable String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * Returns the base curency for the account.
   * @return baseCurrency
   */
  @javax.annotation.Nullable
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(@javax.annotation.Nullable String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformanceResponseCpsDataInner performanceResponseCpsDataInner = (PerformanceResponseCpsDataInner) o;
    return Objects.equals(this.idType, performanceResponseCpsDataInner.idType) &&
        Objects.equals(this.start, performanceResponseCpsDataInner.start) &&
        Objects.equals(this.end, performanceResponseCpsDataInner.end) &&
        Objects.equals(this.returns, performanceResponseCpsDataInner.returns) &&
        Objects.equals(this.id, performanceResponseCpsDataInner.id) &&
        Objects.equals(this.baseCurrency, performanceResponseCpsDataInner.baseCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType, start, end, returns, id, baseCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceResponseCpsDataInner {\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
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
    openapiFields.add("idType");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("returns");
    openapiFields.add("id");
    openapiFields.add("baseCurrency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PerformanceResponseCpsDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PerformanceResponseCpsDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PerformanceResponseCpsDataInner is not found in the empty JSON string", PerformanceResponseCpsDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PerformanceResponseCpsDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PerformanceResponseCpsDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("idType") != null && !jsonObj.get("idType").isJsonNull()) && !jsonObj.get("idType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idType").toString()));
      }
      if ((jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) && !jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      if ((jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) && !jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("returns") != null && !jsonObj.get("returns").isJsonNull() && !jsonObj.get("returns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `returns` to be an array in the JSON string but got `%s`", jsonObj.get("returns").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("baseCurrency") != null && !jsonObj.get("baseCurrency").isJsonNull()) && !jsonObj.get("baseCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseCurrency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PerformanceResponseCpsDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PerformanceResponseCpsDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PerformanceResponseCpsDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PerformanceResponseCpsDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PerformanceResponseCpsDataInner>() {
           @Override
           public void write(JsonWriter out, PerformanceResponseCpsDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PerformanceResponseCpsDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PerformanceResponseCpsDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PerformanceResponseCpsDataInner
   * @throws IOException if the JSON string is invalid with respect to PerformanceResponseCpsDataInner
   */
  public static PerformanceResponseCpsDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PerformanceResponseCpsDataInner.class);
  }

  /**
   * Convert an instance of PerformanceResponseCpsDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

