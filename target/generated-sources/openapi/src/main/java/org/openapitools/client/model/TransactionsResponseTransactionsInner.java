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
 * TransactionsResponseTransactionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class TransactionsResponseTransactionsInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_CUR = "cur";
  @SerializedName(SERIALIZED_NAME_CUR)
  @javax.annotation.Nullable
  private String cur;

  public static final String SERIALIZED_NAME_FX_RATE = "fxRate";
  @SerializedName(SERIALIZED_NAME_FX_RATE)
  @javax.annotation.Nullable
  private Integer fxRate;

  public static final String SERIALIZED_NAME_PR = "pr";
  @SerializedName(SERIALIZED_NAME_PR)
  @javax.annotation.Nullable
  private Integer pr;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @SerializedName(SERIALIZED_NAME_QTY)
  @javax.annotation.Nullable
  private Integer qty;

  public static final String SERIALIZED_NAME_ACCTID = "acctid";
  @SerializedName(SERIALIZED_NAME_ACCTID)
  @javax.annotation.Nullable
  private String acctid;

  public static final String SERIALIZED_NAME_AMT = "amt";
  @SerializedName(SERIALIZED_NAME_AMT)
  @javax.annotation.Nullable
  private Integer amt;

  public static final String SERIALIZED_NAME_CONID = "conid";
  @SerializedName(SERIALIZED_NAME_CONID)
  @javax.annotation.Nullable
  private Integer conid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  @javax.annotation.Nullable
  private String desc;

  public TransactionsResponseTransactionsInner() {
  }

  public TransactionsResponseTransactionsInner date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Reutrns the human-readable datetime of the transaction.
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public TransactionsResponseTransactionsInner cur(@javax.annotation.Nullable String cur) {
    this.cur = cur;
    return this;
  }

  /**
   * Returns the currency of the traded insturment.
   * @return cur
   */
  @javax.annotation.Nullable
  public String getCur() {
    return cur;
  }

  public void setCur(@javax.annotation.Nullable String cur) {
    this.cur = cur;
  }


  public TransactionsResponseTransactionsInner fxRate(@javax.annotation.Nullable Integer fxRate) {
    this.fxRate = fxRate;
    return this;
  }

  /**
   * Returns the forex conversion rate.
   * @return fxRate
   */
  @javax.annotation.Nullable
  public Integer getFxRate() {
    return fxRate;
  }

  public void setFxRate(@javax.annotation.Nullable Integer fxRate) {
    this.fxRate = fxRate;
  }


  public TransactionsResponseTransactionsInner pr(@javax.annotation.Nullable Integer pr) {
    this.pr = pr;
    return this;
  }

  /**
   * Returns the price per share of the transaction.
   * @return pr
   */
  @javax.annotation.Nullable
  public Integer getPr() {
    return pr;
  }

  public void setPr(@javax.annotation.Nullable Integer pr) {
    this.pr = pr;
  }


  public TransactionsResponseTransactionsInner qty(@javax.annotation.Nullable Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * Returns the total quantity traded. Will display a negative value for sell orders, and a positive value for buy orders. 
   * @return qty
   */
  @javax.annotation.Nullable
  public Integer getQty() {
    return qty;
  }

  public void setQty(@javax.annotation.Nullable Integer qty) {
    this.qty = qty;
  }


  public TransactionsResponseTransactionsInner acctid(@javax.annotation.Nullable String acctid) {
    this.acctid = acctid;
    return this;
  }

  /**
   * Returns the account which made the transaction.
   * @return acctid
   */
  @javax.annotation.Nullable
  public String getAcctid() {
    return acctid;
  }

  public void setAcctid(@javax.annotation.Nullable String acctid) {
    this.acctid = acctid;
  }


  public TransactionsResponseTransactionsInner amt(@javax.annotation.Nullable Integer amt) {
    this.amt = amt;
    return this;
  }

  /**
   * Returns the total value of the trade.
   * @return amt
   */
  @javax.annotation.Nullable
  public Integer getAmt() {
    return amt;
  }

  public void setAmt(@javax.annotation.Nullable Integer amt) {
    this.amt = amt;
  }


  public TransactionsResponseTransactionsInner conid(@javax.annotation.Nullable Integer conid) {
    this.conid = conid;
    return this;
  }

  /**
   * Returns the contract identifier.
   * @return conid
   */
  @javax.annotation.Nullable
  public Integer getConid() {
    return conid;
  }

  public void setConid(@javax.annotation.Nullable Integer conid) {
    this.conid = conid;
  }


  public TransactionsResponseTransactionsInner type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Returns the order side.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public TransactionsResponseTransactionsInner desc(@javax.annotation.Nullable String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Returns the long name for the company.
   * @return desc
   */
  @javax.annotation.Nullable
  public String getDesc() {
    return desc;
  }

  public void setDesc(@javax.annotation.Nullable String desc) {
    this.desc = desc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsResponseTransactionsInner transactionsResponseTransactionsInner = (TransactionsResponseTransactionsInner) o;
    return Objects.equals(this.date, transactionsResponseTransactionsInner.date) &&
        Objects.equals(this.cur, transactionsResponseTransactionsInner.cur) &&
        Objects.equals(this.fxRate, transactionsResponseTransactionsInner.fxRate) &&
        Objects.equals(this.pr, transactionsResponseTransactionsInner.pr) &&
        Objects.equals(this.qty, transactionsResponseTransactionsInner.qty) &&
        Objects.equals(this.acctid, transactionsResponseTransactionsInner.acctid) &&
        Objects.equals(this.amt, transactionsResponseTransactionsInner.amt) &&
        Objects.equals(this.conid, transactionsResponseTransactionsInner.conid) &&
        Objects.equals(this.type, transactionsResponseTransactionsInner.type) &&
        Objects.equals(this.desc, transactionsResponseTransactionsInner.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, cur, fxRate, pr, qty, acctid, amt, conid, type, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResponseTransactionsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    cur: ").append(toIndentedString(cur)).append("\n");
    sb.append("    fxRate: ").append(toIndentedString(fxRate)).append("\n");
    sb.append("    pr: ").append(toIndentedString(pr)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    acctid: ").append(toIndentedString(acctid)).append("\n");
    sb.append("    amt: ").append(toIndentedString(amt)).append("\n");
    sb.append("    conid: ").append(toIndentedString(conid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("cur");
    openapiFields.add("fxRate");
    openapiFields.add("pr");
    openapiFields.add("qty");
    openapiFields.add("acctid");
    openapiFields.add("amt");
    openapiFields.add("conid");
    openapiFields.add("type");
    openapiFields.add("desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionsResponseTransactionsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionsResponseTransactionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionsResponseTransactionsInner is not found in the empty JSON string", TransactionsResponseTransactionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionsResponseTransactionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionsResponseTransactionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("cur") != null && !jsonObj.get("cur").isJsonNull()) && !jsonObj.get("cur").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cur` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cur").toString()));
      }
      if ((jsonObj.get("acctid") != null && !jsonObj.get("acctid").isJsonNull()) && !jsonObj.get("acctid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acctid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acctid").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonNull()) && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionsResponseTransactionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionsResponseTransactionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionsResponseTransactionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionsResponseTransactionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionsResponseTransactionsInner>() {
           @Override
           public void write(JsonWriter out, TransactionsResponseTransactionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionsResponseTransactionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionsResponseTransactionsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionsResponseTransactionsInner
   * @throws IOException if the JSON string is invalid with respect to TransactionsResponseTransactionsInner
   */
  public static TransactionsResponseTransactionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionsResponseTransactionsInner.class);
  }

  /**
   * Convert an instance of TransactionsResponseTransactionsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

