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
 * NonDisclosedDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class NonDisclosedDetail {
  public static final String SERIALIZED_NAME_TRADE_DATE = "tradeDate";
  @SerializedName(SERIALIZED_NAME_TRADE_DATE)
  @javax.annotation.Nonnull
  private String tradeDate;

  public static final String SERIALIZED_NAME_SETTLE_DATE = "settleDate";
  @SerializedName(SERIALIZED_NAME_SETTLE_DATE)
  @javax.annotation.Nonnull
  private String settleDate;

  public static final String SERIALIZED_NAME_PSET_BIC = "psetBic";
  @SerializedName(SERIALIZED_NAME_PSET_BIC)
  @javax.annotation.Nullable
  private String psetBic;

  public static final String SERIALIZED_NAME_REAG_DEAG_BIC = "reagDeagBic";
  @SerializedName(SERIALIZED_NAME_REAG_DEAG_BIC)
  @javax.annotation.Nullable
  private String reagDeagBic;

  public static final String SERIALIZED_NAME_BUYER_SELL_BIC = "buyerSellBic";
  @SerializedName(SERIALIZED_NAME_BUYER_SELL_BIC)
  @javax.annotation.Nullable
  private String buyerSellBic;

  public static final String SERIALIZED_NAME_MEMBER_ACCOUNT_ID = "memberAccountId";
  @SerializedName(SERIALIZED_NAME_MEMBER_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String memberAccountId;

  public static final String SERIALIZED_NAME_SAFE_KEEPING_ACCOUNT_ID = "safeKeepingAccountId";
  @SerializedName(SERIALIZED_NAME_SAFE_KEEPING_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String safeKeepingAccountId;

  public NonDisclosedDetail() {
  }

  public NonDisclosedDetail tradeDate(@javax.annotation.Nonnull String tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

  /**
   * Get tradeDate
   * @return tradeDate
   */
  @javax.annotation.Nonnull
  public String getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(@javax.annotation.Nonnull String tradeDate) {
    this.tradeDate = tradeDate;
  }


  public NonDisclosedDetail settleDate(@javax.annotation.Nonnull String settleDate) {
    this.settleDate = settleDate;
    return this;
  }

  /**
   * Get settleDate
   * @return settleDate
   */
  @javax.annotation.Nonnull
  public String getSettleDate() {
    return settleDate;
  }

  public void setSettleDate(@javax.annotation.Nonnull String settleDate) {
    this.settleDate = settleDate;
  }


  public NonDisclosedDetail psetBic(@javax.annotation.Nullable String psetBic) {
    this.psetBic = psetBic;
    return this;
  }

  /**
   * Get psetBic
   * @return psetBic
   */
  @javax.annotation.Nullable
  public String getPsetBic() {
    return psetBic;
  }

  public void setPsetBic(@javax.annotation.Nullable String psetBic) {
    this.psetBic = psetBic;
  }


  public NonDisclosedDetail reagDeagBic(@javax.annotation.Nullable String reagDeagBic) {
    this.reagDeagBic = reagDeagBic;
    return this;
  }

  /**
   * Get reagDeagBic
   * @return reagDeagBic
   */
  @javax.annotation.Nullable
  public String getReagDeagBic() {
    return reagDeagBic;
  }

  public void setReagDeagBic(@javax.annotation.Nullable String reagDeagBic) {
    this.reagDeagBic = reagDeagBic;
  }


  public NonDisclosedDetail buyerSellBic(@javax.annotation.Nullable String buyerSellBic) {
    this.buyerSellBic = buyerSellBic;
    return this;
  }

  /**
   * Get buyerSellBic
   * @return buyerSellBic
   */
  @javax.annotation.Nullable
  public String getBuyerSellBic() {
    return buyerSellBic;
  }

  public void setBuyerSellBic(@javax.annotation.Nullable String buyerSellBic) {
    this.buyerSellBic = buyerSellBic;
  }


  public NonDisclosedDetail memberAccountId(@javax.annotation.Nullable String memberAccountId) {
    this.memberAccountId = memberAccountId;
    return this;
  }

  /**
   * Get memberAccountId
   * @return memberAccountId
   */
  @javax.annotation.Nullable
  public String getMemberAccountId() {
    return memberAccountId;
  }

  public void setMemberAccountId(@javax.annotation.Nullable String memberAccountId) {
    this.memberAccountId = memberAccountId;
  }


  public NonDisclosedDetail safeKeepingAccountId(@javax.annotation.Nullable String safeKeepingAccountId) {
    this.safeKeepingAccountId = safeKeepingAccountId;
    return this;
  }

  /**
   * Get safeKeepingAccountId
   * @return safeKeepingAccountId
   */
  @javax.annotation.Nullable
  public String getSafeKeepingAccountId() {
    return safeKeepingAccountId;
  }

  public void setSafeKeepingAccountId(@javax.annotation.Nullable String safeKeepingAccountId) {
    this.safeKeepingAccountId = safeKeepingAccountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonDisclosedDetail nonDisclosedDetail = (NonDisclosedDetail) o;
    return Objects.equals(this.tradeDate, nonDisclosedDetail.tradeDate) &&
        Objects.equals(this.settleDate, nonDisclosedDetail.settleDate) &&
        Objects.equals(this.psetBic, nonDisclosedDetail.psetBic) &&
        Objects.equals(this.reagDeagBic, nonDisclosedDetail.reagDeagBic) &&
        Objects.equals(this.buyerSellBic, nonDisclosedDetail.buyerSellBic) &&
        Objects.equals(this.memberAccountId, nonDisclosedDetail.memberAccountId) &&
        Objects.equals(this.safeKeepingAccountId, nonDisclosedDetail.safeKeepingAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeDate, settleDate, psetBic, reagDeagBic, buyerSellBic, memberAccountId, safeKeepingAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonDisclosedDetail {\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    settleDate: ").append(toIndentedString(settleDate)).append("\n");
    sb.append("    psetBic: ").append(toIndentedString(psetBic)).append("\n");
    sb.append("    reagDeagBic: ").append(toIndentedString(reagDeagBic)).append("\n");
    sb.append("    buyerSellBic: ").append(toIndentedString(buyerSellBic)).append("\n");
    sb.append("    memberAccountId: ").append(toIndentedString(memberAccountId)).append("\n");
    sb.append("    safeKeepingAccountId: ").append(toIndentedString(safeKeepingAccountId)).append("\n");
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
    openapiFields.add("tradeDate");
    openapiFields.add("settleDate");
    openapiFields.add("psetBic");
    openapiFields.add("reagDeagBic");
    openapiFields.add("buyerSellBic");
    openapiFields.add("memberAccountId");
    openapiFields.add("safeKeepingAccountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tradeDate");
    openapiRequiredFields.add("settleDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NonDisclosedDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NonDisclosedDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NonDisclosedDetail is not found in the empty JSON string", NonDisclosedDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NonDisclosedDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NonDisclosedDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NonDisclosedDetail.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tradeDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tradeDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tradeDate").toString()));
      }
      if (!jsonObj.get("settleDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settleDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settleDate").toString()));
      }
      if ((jsonObj.get("psetBic") != null && !jsonObj.get("psetBic").isJsonNull()) && !jsonObj.get("psetBic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `psetBic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("psetBic").toString()));
      }
      if ((jsonObj.get("reagDeagBic") != null && !jsonObj.get("reagDeagBic").isJsonNull()) && !jsonObj.get("reagDeagBic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reagDeagBic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reagDeagBic").toString()));
      }
      if ((jsonObj.get("buyerSellBic") != null && !jsonObj.get("buyerSellBic").isJsonNull()) && !jsonObj.get("buyerSellBic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyerSellBic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyerSellBic").toString()));
      }
      if ((jsonObj.get("memberAccountId") != null && !jsonObj.get("memberAccountId").isJsonNull()) && !jsonObj.get("memberAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memberAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memberAccountId").toString()));
      }
      if ((jsonObj.get("safeKeepingAccountId") != null && !jsonObj.get("safeKeepingAccountId").isJsonNull()) && !jsonObj.get("safeKeepingAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safeKeepingAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safeKeepingAccountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NonDisclosedDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NonDisclosedDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NonDisclosedDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NonDisclosedDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<NonDisclosedDetail>() {
           @Override
           public void write(JsonWriter out, NonDisclosedDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NonDisclosedDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NonDisclosedDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NonDisclosedDetail
   * @throws IOException if the JSON string is invalid with respect to NonDisclosedDetail
   */
  public static NonDisclosedDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NonDisclosedDetail.class);
  }

  /**
   * Convert an instance of NonDisclosedDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

