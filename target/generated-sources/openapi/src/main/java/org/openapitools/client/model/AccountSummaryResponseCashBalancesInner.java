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
 * AccountSummaryResponseCashBalancesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AccountSummaryResponseCashBalancesInner {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  @javax.annotation.Nullable
  private Integer balance;

  public static final String SERIALIZED_NAME_SETTLED_CASH = "settledCash";
  @SerializedName(SERIALIZED_NAME_SETTLED_CASH)
  @javax.annotation.Nullable
  private Integer settledCash;

  public AccountSummaryResponseCashBalancesInner() {
  }

  public AccountSummaryResponseCashBalancesInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency the values represent. Base currency represented as \&quot;Total (in {BaseCurrency})\&quot; 
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public AccountSummaryResponseCashBalancesInner balance(@javax.annotation.Nullable Integer balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The total available currency held in the account.
   * @return balance
   */
  @javax.annotation.Nullable
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(@javax.annotation.Nullable Integer balance) {
    this.balance = balance;
  }


  public AccountSummaryResponseCashBalancesInner settledCash(@javax.annotation.Nullable Integer settledCash) {
    this.settledCash = settledCash;
    return this;
  }

  /**
   * The available settled cash that can be withdrawn from the account.
   * @return settledCash
   */
  @javax.annotation.Nullable
  public Integer getSettledCash() {
    return settledCash;
  }

  public void setSettledCash(@javax.annotation.Nullable Integer settledCash) {
    this.settledCash = settledCash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSummaryResponseCashBalancesInner accountSummaryResponseCashBalancesInner = (AccountSummaryResponseCashBalancesInner) o;
    return Objects.equals(this.currency, accountSummaryResponseCashBalancesInner.currency) &&
        Objects.equals(this.balance, accountSummaryResponseCashBalancesInner.balance) &&
        Objects.equals(this.settledCash, accountSummaryResponseCashBalancesInner.settledCash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, balance, settledCash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSummaryResponseCashBalancesInner {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    settledCash: ").append(toIndentedString(settledCash)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("balance");
    openapiFields.add("settledCash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountSummaryResponseCashBalancesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountSummaryResponseCashBalancesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountSummaryResponseCashBalancesInner is not found in the empty JSON string", AccountSummaryResponseCashBalancesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountSummaryResponseCashBalancesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountSummaryResponseCashBalancesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!AccountSummaryResponseCashBalancesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountSummaryResponseCashBalancesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountSummaryResponseCashBalancesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountSummaryResponseCashBalancesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountSummaryResponseCashBalancesInner>() {
           @Override
           public void write(JsonWriter out, AccountSummaryResponseCashBalancesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountSummaryResponseCashBalancesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountSummaryResponseCashBalancesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountSummaryResponseCashBalancesInner
   * @throws IOException if the JSON string is invalid with respect to AccountSummaryResponseCashBalancesInner
   */
  public static AccountSummaryResponseCashBalancesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountSummaryResponseCashBalancesInner.class);
  }

  /**
   * Convert an instance of AccountSummaryResponseCashBalancesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

