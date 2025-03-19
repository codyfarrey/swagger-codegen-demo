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
 * PortfolioSummaryFullavailablefunds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class PortfolioSummaryFullavailablefunds {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private BigDecimal currency;

  public static final String SERIALIZED_NAME_IS_NULL = "isNull";
  @SerializedName(SERIALIZED_NAME_IS_NULL)
  @javax.annotation.Nullable
  private Boolean isNull;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  @javax.annotation.Nullable
  private Integer severity;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  @javax.annotation.Nullable
  private Integer timestamp;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public PortfolioSummaryFullavailablefunds() {
  }

  public PortfolioSummaryFullavailablefunds amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Numerical data for the associated key.
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
  }


  public PortfolioSummaryFullavailablefunds currency(@javax.annotation.Nullable BigDecimal currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency in which the value of the &#39;amount&#39; field is denominated.
   * @return currency
   */
  @javax.annotation.Nullable
  public BigDecimal getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable BigDecimal currency) {
    this.currency = currency;
  }


  public PortfolioSummaryFullavailablefunds isNull(@javax.annotation.Nullable Boolean isNull) {
    this.isNull = isNull;
    return this;
  }

  /**
   * Indicates whether the associated key&#39;s value does not exist, as opposed to a value of zero.
   * @return isNull
   */
  @javax.annotation.Nullable
  public Boolean getIsNull() {
    return isNull;
  }

  public void setIsNull(@javax.annotation.Nullable Boolean isNull) {
    this.isNull = isNull;
  }


  public PortfolioSummaryFullavailablefunds severity(@javax.annotation.Nullable Integer severity) {
    this.severity = severity;
    return this;
  }

  /**
   * severity
   * @return severity
   */
  @javax.annotation.Nullable
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(@javax.annotation.Nullable Integer severity) {
    this.severity = severity;
  }


  public PortfolioSummaryFullavailablefunds timestamp(@javax.annotation.Nullable Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Unix epoch timestamp of returned data in milliseconds.
   * @return timestamp
   */
  @javax.annotation.Nullable
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(@javax.annotation.Nullable Integer timestamp) {
    this.timestamp = timestamp;
  }


  public PortfolioSummaryFullavailablefunds value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * String and boolean (non-numerical) data for the associated key.
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
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
    PortfolioSummaryFullavailablefunds portfolioSummaryFullavailablefunds = (PortfolioSummaryFullavailablefunds) o;
    return Objects.equals(this.amount, portfolioSummaryFullavailablefunds.amount) &&
        Objects.equals(this.currency, portfolioSummaryFullavailablefunds.currency) &&
        Objects.equals(this.isNull, portfolioSummaryFullavailablefunds.isNull) &&
        Objects.equals(this.severity, portfolioSummaryFullavailablefunds.severity) &&
        Objects.equals(this.timestamp, portfolioSummaryFullavailablefunds.timestamp) &&
        Objects.equals(this.value, portfolioSummaryFullavailablefunds.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, isNull, severity, timestamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioSummaryFullavailablefunds {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isNull: ").append(toIndentedString(isNull)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("isNull");
    openapiFields.add("severity");
    openapiFields.add("timestamp");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PortfolioSummaryFullavailablefunds
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PortfolioSummaryFullavailablefunds.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortfolioSummaryFullavailablefunds is not found in the empty JSON string", PortfolioSummaryFullavailablefunds.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PortfolioSummaryFullavailablefunds.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PortfolioSummaryFullavailablefunds` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortfolioSummaryFullavailablefunds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortfolioSummaryFullavailablefunds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortfolioSummaryFullavailablefunds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortfolioSummaryFullavailablefunds.class));

       return (TypeAdapter<T>) new TypeAdapter<PortfolioSummaryFullavailablefunds>() {
           @Override
           public void write(JsonWriter out, PortfolioSummaryFullavailablefunds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PortfolioSummaryFullavailablefunds read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PortfolioSummaryFullavailablefunds given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PortfolioSummaryFullavailablefunds
   * @throws IOException if the JSON string is invalid with respect to PortfolioSummaryFullavailablefunds
   */
  public static PortfolioSummaryFullavailablefunds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortfolioSummaryFullavailablefunds.class);
  }

  /**
   * Convert an instance of PortfolioSummaryFullavailablefunds to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

