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
import org.openapitools.client.model.DetailedContractInformationValueValue;

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
 * Contains the relevant performance data for the specified accountId.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class DetailedContractInformationValue {
  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_UPDATE = "lastSuccessfulUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_UPDATE)
  @javax.annotation.Nullable
  private String lastSuccessfulUpdate;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private String start;

  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  @javax.annotation.Nullable
  private List<String> periods = new ArrayList<>();

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private String end;

  public static final String SERIALIZED_NAME_BASE_CURRENCY = "baseCurrency";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY)
  @javax.annotation.Nullable
  private String baseCurrency;

  public DetailedContractInformationValue() {
  }

  public DetailedContractInformationValue lastSuccessfulUpdate(@javax.annotation.Nullable String lastSuccessfulUpdate) {
    this.lastSuccessfulUpdate = lastSuccessfulUpdate;
    return this;
  }

  /**
   * Returns the datetime in EST of the last successful call to the /pa endpoint.
   * @return lastSuccessfulUpdate
   */
  @javax.annotation.Nullable
  public String getLastSuccessfulUpdate() {
    return lastSuccessfulUpdate;
  }

  public void setLastSuccessfulUpdate(@javax.annotation.Nullable String lastSuccessfulUpdate) {
    this.lastSuccessfulUpdate = lastSuccessfulUpdate;
  }


  public DetailedContractInformationValue start(@javax.annotation.Nullable String start) {
    this.start = start;
    return this;
  }

  /**
   * Returns the start date of the request range.
   * @return start
   */
  @javax.annotation.Nullable
  public String getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable String start) {
    this.start = start;
  }


  public DetailedContractInformationValue periods(@javax.annotation.Nullable List<String> periods) {
    this.periods = periods;
    return this;
  }

  public DetailedContractInformationValue addPeriodsItem(String periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * Returns the valid period values returned by the /pa/allperiods endpoint.
   * @return periods
   */
  @javax.annotation.Nullable
  public List<String> getPeriods() {
    return periods;
  }

  public void setPeriods(@javax.annotation.Nullable List<String> periods) {
    this.periods = periods;
  }


  public DetailedContractInformationValue end(@javax.annotation.Nullable String end) {
    this.end = end;
    return this;
  }

  /**
   * Returns the end date of the request range.
   * @return end
   */
  @javax.annotation.Nullable
  public String getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable String end) {
    this.end = end;
  }


  public DetailedContractInformationValue baseCurrency(@javax.annotation.Nullable String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  /**
   * Clarifies the base currency of the primary accountId.
   * @return baseCurrency
   */
  @javax.annotation.Nullable
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(@javax.annotation.Nullable String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DetailedContractInformationValue instance itself
   */
  public DetailedContractInformationValue putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedContractInformationValue detailedContractInformationValue = (DetailedContractInformationValue) o;
    return Objects.equals(this.lastSuccessfulUpdate, detailedContractInformationValue.lastSuccessfulUpdate) &&
        Objects.equals(this.start, detailedContractInformationValue.start) &&
        Objects.equals(this.periods, detailedContractInformationValue.periods) &&
        Objects.equals(this.end, detailedContractInformationValue.end) &&
        Objects.equals(this.baseCurrency, detailedContractInformationValue.baseCurrency)&&
        Objects.equals(this.additionalProperties, detailedContractInformationValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSuccessfulUpdate, start, periods, end, baseCurrency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedContractInformationValue {\n");
    sb.append("    lastSuccessfulUpdate: ").append(toIndentedString(lastSuccessfulUpdate)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("lastSuccessfulUpdate");
    openapiFields.add("start");
    openapiFields.add("periods");
    openapiFields.add("end");
    openapiFields.add("baseCurrency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DetailedContractInformationValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DetailedContractInformationValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DetailedContractInformationValue is not found in the empty JSON string", DetailedContractInformationValue.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lastSuccessfulUpdate") != null && !jsonObj.get("lastSuccessfulUpdate").isJsonNull()) && !jsonObj.get("lastSuccessfulUpdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastSuccessfulUpdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSuccessfulUpdate").toString()));
      }
      if ((jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) && !jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("periods") != null && !jsonObj.get("periods").isJsonNull() && !jsonObj.get("periods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `periods` to be an array in the JSON string but got `%s`", jsonObj.get("periods").toString()));
      }
      if ((jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) && !jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      if ((jsonObj.get("baseCurrency") != null && !jsonObj.get("baseCurrency").isJsonNull()) && !jsonObj.get("baseCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseCurrency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DetailedContractInformationValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DetailedContractInformationValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DetailedContractInformationValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DetailedContractInformationValue.class));

       return (TypeAdapter<T>) new TypeAdapter<DetailedContractInformationValue>() {
           @Override
           public void write(JsonWriter out, DetailedContractInformationValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DetailedContractInformationValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DetailedContractInformationValue instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DetailedContractInformationValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DetailedContractInformationValue
   * @throws IOException if the JSON string is invalid with respect to DetailedContractInformationValue
   */
  public static DetailedContractInformationValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetailedContractInformationValue.class);
  }

  /**
   * Convert an instance of DetailedContractInformationValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

