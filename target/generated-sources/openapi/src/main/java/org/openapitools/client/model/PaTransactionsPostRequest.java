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
 * PaTransactionsPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class PaTransactionsPostRequest {
  public static final String SERIALIZED_NAME_ACCT_IDS = "acctIds";
  @SerializedName(SERIALIZED_NAME_ACCT_IDS)
  @javax.annotation.Nullable
  private List<String> acctIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONIDS = "conids";
  @SerializedName(SERIALIZED_NAME_CONIDS)
  @javax.annotation.Nullable
  private List<String> conids = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency = "USD";

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  @javax.annotation.Nullable
  private Integer days = 90;

  public PaTransactionsPostRequest() {
  }

  public PaTransactionsPostRequest acctIds(@javax.annotation.Nullable List<String> acctIds) {
    this.acctIds = acctIds;
    return this;
  }

  public PaTransactionsPostRequest addAcctIdsItem(String acctIdsItem) {
    if (this.acctIds == null) {
      this.acctIds = new ArrayList<>();
    }
    this.acctIds.add(acctIdsItem);
    return this;
  }

  /**
   * Include each account ID as a string to receive data for.
   * @return acctIds
   */
  @javax.annotation.Nullable
  public List<String> getAcctIds() {
    return acctIds;
  }

  public void setAcctIds(@javax.annotation.Nullable List<String> acctIds) {
    this.acctIds = acctIds;
  }


  public PaTransactionsPostRequest conids(@javax.annotation.Nullable List<String> conids) {
    this.conids = conids;
    return this;
  }

  public PaTransactionsPostRequest addConidsItem(String conidsItem) {
    if (this.conids == null) {
      this.conids = new ArrayList<>();
    }
    this.conids.add(conidsItem);
    return this;
  }

  /**
   * Include contract ID to receive data for.  Conids may be passed as integers or strings. Only supports one contract id at a time. 
   * @return conids
   */
  @javax.annotation.Nullable
  public List<String> getConids() {
    return conids;
  }

  public void setConids(@javax.annotation.Nullable List<String> conids) {
    this.conids = conids;
  }


  public PaTransactionsPostRequest currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Define the currency to display price amounts with.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public PaTransactionsPostRequest days(@javax.annotation.Nullable Integer days) {
    this.days = days;
    return this;
  }

  /**
   * Specify the number of days to receive transaction data for.
   * @return days
   */
  @javax.annotation.Nullable
  public Integer getDays() {
    return days;
  }

  public void setDays(@javax.annotation.Nullable Integer days) {
    this.days = days;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaTransactionsPostRequest paTransactionsPostRequest = (PaTransactionsPostRequest) o;
    return Objects.equals(this.acctIds, paTransactionsPostRequest.acctIds) &&
        Objects.equals(this.conids, paTransactionsPostRequest.conids) &&
        Objects.equals(this.currency, paTransactionsPostRequest.currency) &&
        Objects.equals(this.days, paTransactionsPostRequest.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acctIds, conids, currency, days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaTransactionsPostRequest {\n");
    sb.append("    acctIds: ").append(toIndentedString(acctIds)).append("\n");
    sb.append("    conids: ").append(toIndentedString(conids)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
    openapiFields.add("acctIds");
    openapiFields.add("conids");
    openapiFields.add("currency");
    openapiFields.add("days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaTransactionsPostRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaTransactionsPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaTransactionsPostRequest is not found in the empty JSON string", PaTransactionsPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaTransactionsPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaTransactionsPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("acctIds") != null && !jsonObj.get("acctIds").isJsonNull() && !jsonObj.get("acctIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `acctIds` to be an array in the JSON string but got `%s`", jsonObj.get("acctIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("conids") != null && !jsonObj.get("conids").isJsonNull() && !jsonObj.get("conids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `conids` to be an array in the JSON string but got `%s`", jsonObj.get("conids").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaTransactionsPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaTransactionsPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaTransactionsPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaTransactionsPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaTransactionsPostRequest>() {
           @Override
           public void write(JsonWriter out, PaTransactionsPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaTransactionsPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaTransactionsPostRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaTransactionsPostRequest
   * @throws IOException if the JSON string is invalid with respect to PaTransactionsPostRequest
   */
  public static PaTransactionsPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaTransactionsPostRequest.class);
  }

  /**
   * Convert an instance of PaTransactionsPostRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

