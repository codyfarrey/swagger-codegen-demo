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
 * PreviousLossesType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class PreviousLossesType {
  public static final String SERIALIZED_NAME_LOSS = "loss";
  @SerializedName(SERIALIZED_NAME_LOSS)
  @javax.annotation.Nullable
  private Integer loss;

  public static final String SERIALIZED_NAME_QUARTER = "quarter";
  @SerializedName(SERIALIZED_NAME_QUARTER)
  @javax.annotation.Nullable
  private Integer quarter;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nullable
  private Integer year;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public PreviousLossesType() {
  }

  public PreviousLossesType loss(@javax.annotation.Nullable Integer loss) {
    this.loss = loss;
    return this;
  }

  /**
   * Get loss
   * @return loss
   */
  @javax.annotation.Nullable
  public Integer getLoss() {
    return loss;
  }

  public void setLoss(@javax.annotation.Nullable Integer loss) {
    this.loss = loss;
  }


  public PreviousLossesType quarter(@javax.annotation.Nullable Integer quarter) {
    this.quarter = quarter;
    return this;
  }

  /**
   * Get quarter
   * @return quarter
   */
  @javax.annotation.Nullable
  public Integer getQuarter() {
    return quarter;
  }

  public void setQuarter(@javax.annotation.Nullable Integer quarter) {
    this.quarter = quarter;
  }


  public PreviousLossesType year(@javax.annotation.Nullable Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  @javax.annotation.Nullable
  public Integer getYear() {
    return year;
  }

  public void setYear(@javax.annotation.Nullable Integer year) {
    this.year = year;
  }


  public PreviousLossesType currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousLossesType previousLossesType = (PreviousLossesType) o;
    return Objects.equals(this.loss, previousLossesType.loss) &&
        Objects.equals(this.quarter, previousLossesType.quarter) &&
        Objects.equals(this.year, previousLossesType.year) &&
        Objects.equals(this.currency, previousLossesType.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loss, quarter, year, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousLossesType {\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("loss");
    openapiFields.add("quarter");
    openapiFields.add("year");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PreviousLossesType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PreviousLossesType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PreviousLossesType is not found in the empty JSON string", PreviousLossesType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PreviousLossesType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PreviousLossesType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PreviousLossesType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PreviousLossesType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PreviousLossesType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PreviousLossesType.class));

       return (TypeAdapter<T>) new TypeAdapter<PreviousLossesType>() {
           @Override
           public void write(JsonWriter out, PreviousLossesType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PreviousLossesType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PreviousLossesType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PreviousLossesType
   * @throws IOException if the JSON string is invalid with respect to PreviousLossesType
   */
  public static PreviousLossesType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PreviousLossesType.class);
  }

  /**
   * Convert an instance of PreviousLossesType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

