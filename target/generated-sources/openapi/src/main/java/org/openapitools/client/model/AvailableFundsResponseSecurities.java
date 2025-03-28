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
 * Contains an overview of Security specific fund values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AvailableFundsResponseSecurities {
  public static final String SERIALIZED_NAME_CURRENT_AVAILABLE = "current_available";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVAILABLE)
  @javax.annotation.Nullable
  private String currentAvailable;

  public static final String SERIALIZED_NAME_CURRENT_EXCESS = "current_excess";
  @SerializedName(SERIALIZED_NAME_CURRENT_EXCESS)
  @javax.annotation.Nullable
  private String currentExcess;

  public static final String SERIALIZED_NAME_PRDCTD_PST_XPRY_EXCSS = "Prdctd Pst-xpry Excss";
  @SerializedName(SERIALIZED_NAME_PRDCTD_PST_XPRY_EXCSS)
  @javax.annotation.Nullable
  private String prdctdPstXpryExcss;

  public static final String SERIALIZED_NAME_S_M_A = "SMA";
  @SerializedName(SERIALIZED_NAME_S_M_A)
  @javax.annotation.Nullable
  private String SMA;

  public static final String SERIALIZED_NAME_LK_AHD_AVLBL_FNDS = "Lk Ahd Avlbl Fnds";
  @SerializedName(SERIALIZED_NAME_LK_AHD_AVLBL_FNDS)
  @javax.annotation.Nullable
  private String lkAhdAvlblFnds;

  public static final String SERIALIZED_NAME_LK_AHD_EXCSS_LQDTY = "Lk Ahd Excss Lqdty";
  @SerializedName(SERIALIZED_NAME_LK_AHD_EXCSS_LQDTY)
  @javax.annotation.Nullable
  private String lkAhdExcssLqdty;

  public static final String SERIALIZED_NAME_OVERNIGHT_AVAILABLE = "overnight_available";
  @SerializedName(SERIALIZED_NAME_OVERNIGHT_AVAILABLE)
  @javax.annotation.Nullable
  private String overnightAvailable;

  public static final String SERIALIZED_NAME_OVERNIGHT_EXCESS = "overnight_excess";
  @SerializedName(SERIALIZED_NAME_OVERNIGHT_EXCESS)
  @javax.annotation.Nullable
  private String overnightExcess;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  @javax.annotation.Nullable
  private String leverage;

  public AvailableFundsResponseSecurities() {
  }

  public AvailableFundsResponseSecurities currentAvailable(@javax.annotation.Nullable String currentAvailable) {
    this.currentAvailable = currentAvailable;
    return this;
  }

  /**
   * Describes currently avialable funds in your account for trading.
   * @return currentAvailable
   */
  @javax.annotation.Nullable
  public String getCurrentAvailable() {
    return currentAvailable;
  }

  public void setCurrentAvailable(@javax.annotation.Nullable String currentAvailable) {
    this.currentAvailable = currentAvailable;
  }


  public AvailableFundsResponseSecurities currentExcess(@javax.annotation.Nullable String currentExcess) {
    this.currentExcess = currentExcess;
    return this;
  }

  /**
   * Describes total value of the account.
   * @return currentExcess
   */
  @javax.annotation.Nullable
  public String getCurrentExcess() {
    return currentExcess;
  }

  public void setCurrentExcess(@javax.annotation.Nullable String currentExcess) {
    this.currentExcess = currentExcess;
  }


  public AvailableFundsResponseSecurities prdctdPstXpryExcss(@javax.annotation.Nullable String prdctdPstXpryExcss) {
    this.prdctdPstXpryExcss = prdctdPstXpryExcss;
    return this;
  }

  /**
   * Displays predicted post-expiration account value.
   * @return prdctdPstXpryExcss
   */
  @javax.annotation.Nullable
  public String getPrdctdPstXpryExcss() {
    return prdctdPstXpryExcss;
  }

  public void setPrdctdPstXpryExcss(@javax.annotation.Nullable String prdctdPstXpryExcss) {
    this.prdctdPstXpryExcss = prdctdPstXpryExcss;
  }


  public AvailableFundsResponseSecurities SMA(@javax.annotation.Nullable String SMA) {
    this.SMA = SMA;
    return this;
  }

  /**
   * Get SMA
   * @return SMA
   */
  @javax.annotation.Nullable
  public String getSMA() {
    return SMA;
  }

  public void setSMA(@javax.annotation.Nullable String SMA) {
    this.SMA = SMA;
  }


  public AvailableFundsResponseSecurities lkAhdAvlblFnds(@javax.annotation.Nullable String lkAhdAvlblFnds) {
    this.lkAhdAvlblFnds = lkAhdAvlblFnds;
    return this;
  }

  /**
   * This value reflects your available funds at the next margin change.
   * @return lkAhdAvlblFnds
   */
  @javax.annotation.Nullable
  public String getLkAhdAvlblFnds() {
    return lkAhdAvlblFnds;
  }

  public void setLkAhdAvlblFnds(@javax.annotation.Nullable String lkAhdAvlblFnds) {
    this.lkAhdAvlblFnds = lkAhdAvlblFnds;
  }


  public AvailableFundsResponseSecurities lkAhdExcssLqdty(@javax.annotation.Nullable String lkAhdExcssLqdty) {
    this.lkAhdExcssLqdty = lkAhdExcssLqdty;
    return this;
  }

  /**
   * * &#x60;Securities&#x60; - Equity with loan value. Look ahead maintenance margin.  * &#x60;Commodities&#x60; - Net Liquidation value. Look ahead maintenance margin. 
   * @return lkAhdExcssLqdty
   */
  @javax.annotation.Nullable
  public String getLkAhdExcssLqdty() {
    return lkAhdExcssLqdty;
  }

  public void setLkAhdExcssLqdty(@javax.annotation.Nullable String lkAhdExcssLqdty) {
    this.lkAhdExcssLqdty = lkAhdExcssLqdty;
  }


  public AvailableFundsResponseSecurities overnightAvailable(@javax.annotation.Nullable String overnightAvailable) {
    this.overnightAvailable = overnightAvailable;
    return this;
  }

  /**
   * Describes available funds for overnight trading.
   * @return overnightAvailable
   */
  @javax.annotation.Nullable
  public String getOvernightAvailable() {
    return overnightAvailable;
  }

  public void setOvernightAvailable(@javax.annotation.Nullable String overnightAvailable) {
    this.overnightAvailable = overnightAvailable;
  }


  public AvailableFundsResponseSecurities overnightExcess(@javax.annotation.Nullable String overnightExcess) {
    this.overnightExcess = overnightExcess;
    return this;
  }

  /**
   * Overnight refers to the window of time after the local market trading day is closed.    * &#x60;Securities&#x60; - Equivalent to regular trading hours.     * &#x60;Commodities&#x60; - Commodities Net Liquidation value. Overnight Maintenance margin. 
   * @return overnightExcess
   */
  @javax.annotation.Nullable
  public String getOvernightExcess() {
    return overnightExcess;
  }

  public void setOvernightExcess(@javax.annotation.Nullable String overnightExcess) {
    this.overnightExcess = overnightExcess;
  }


  public AvailableFundsResponseSecurities leverage(@javax.annotation.Nullable String leverage) {
    this.leverage = leverage;
    return this;
  }

  /**
   * Describes the total combined leverage.
   * @return leverage
   */
  @javax.annotation.Nullable
  public String getLeverage() {
    return leverage;
  }

  public void setLeverage(@javax.annotation.Nullable String leverage) {
    this.leverage = leverage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableFundsResponseSecurities availableFundsResponseSecurities = (AvailableFundsResponseSecurities) o;
    return Objects.equals(this.currentAvailable, availableFundsResponseSecurities.currentAvailable) &&
        Objects.equals(this.currentExcess, availableFundsResponseSecurities.currentExcess) &&
        Objects.equals(this.prdctdPstXpryExcss, availableFundsResponseSecurities.prdctdPstXpryExcss) &&
        Objects.equals(this.SMA, availableFundsResponseSecurities.SMA) &&
        Objects.equals(this.lkAhdAvlblFnds, availableFundsResponseSecurities.lkAhdAvlblFnds) &&
        Objects.equals(this.lkAhdExcssLqdty, availableFundsResponseSecurities.lkAhdExcssLqdty) &&
        Objects.equals(this.overnightAvailable, availableFundsResponseSecurities.overnightAvailable) &&
        Objects.equals(this.overnightExcess, availableFundsResponseSecurities.overnightExcess) &&
        Objects.equals(this.leverage, availableFundsResponseSecurities.leverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAvailable, currentExcess, prdctdPstXpryExcss, SMA, lkAhdAvlblFnds, lkAhdExcssLqdty, overnightAvailable, overnightExcess, leverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableFundsResponseSecurities {\n");
    sb.append("    currentAvailable: ").append(toIndentedString(currentAvailable)).append("\n");
    sb.append("    currentExcess: ").append(toIndentedString(currentExcess)).append("\n");
    sb.append("    prdctdPstXpryExcss: ").append(toIndentedString(prdctdPstXpryExcss)).append("\n");
    sb.append("    SMA: ").append(toIndentedString(SMA)).append("\n");
    sb.append("    lkAhdAvlblFnds: ").append(toIndentedString(lkAhdAvlblFnds)).append("\n");
    sb.append("    lkAhdExcssLqdty: ").append(toIndentedString(lkAhdExcssLqdty)).append("\n");
    sb.append("    overnightAvailable: ").append(toIndentedString(overnightAvailable)).append("\n");
    sb.append("    overnightExcess: ").append(toIndentedString(overnightExcess)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
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
    openapiFields.add("current_available");
    openapiFields.add("current_excess");
    openapiFields.add("Prdctd Pst-xpry Excss");
    openapiFields.add("SMA");
    openapiFields.add("Lk Ahd Avlbl Fnds");
    openapiFields.add("Lk Ahd Excss Lqdty");
    openapiFields.add("overnight_available");
    openapiFields.add("overnight_excess");
    openapiFields.add("leverage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvailableFundsResponseSecurities
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailableFundsResponseSecurities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableFundsResponseSecurities is not found in the empty JSON string", AvailableFundsResponseSecurities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailableFundsResponseSecurities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailableFundsResponseSecurities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("current_available") != null && !jsonObj.get("current_available").isJsonNull()) && !jsonObj.get("current_available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_available").toString()));
      }
      if ((jsonObj.get("current_excess") != null && !jsonObj.get("current_excess").isJsonNull()) && !jsonObj.get("current_excess").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_excess` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_excess").toString()));
      }
      if ((jsonObj.get("Prdctd Pst-xpry Excss") != null && !jsonObj.get("Prdctd Pst-xpry Excss").isJsonNull()) && !jsonObj.get("Prdctd Pst-xpry Excss").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Prdctd Pst-xpry Excss` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Prdctd Pst-xpry Excss").toString()));
      }
      if ((jsonObj.get("SMA") != null && !jsonObj.get("SMA").isJsonNull()) && !jsonObj.get("SMA").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SMA` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SMA").toString()));
      }
      if ((jsonObj.get("Lk Ahd Avlbl Fnds") != null && !jsonObj.get("Lk Ahd Avlbl Fnds").isJsonNull()) && !jsonObj.get("Lk Ahd Avlbl Fnds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Lk Ahd Avlbl Fnds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Lk Ahd Avlbl Fnds").toString()));
      }
      if ((jsonObj.get("Lk Ahd Excss Lqdty") != null && !jsonObj.get("Lk Ahd Excss Lqdty").isJsonNull()) && !jsonObj.get("Lk Ahd Excss Lqdty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Lk Ahd Excss Lqdty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Lk Ahd Excss Lqdty").toString()));
      }
      if ((jsonObj.get("overnight_available") != null && !jsonObj.get("overnight_available").isJsonNull()) && !jsonObj.get("overnight_available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overnight_available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overnight_available").toString()));
      }
      if ((jsonObj.get("overnight_excess") != null && !jsonObj.get("overnight_excess").isJsonNull()) && !jsonObj.get("overnight_excess").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `overnight_excess` to be a primitive type in the JSON string but got `%s`", jsonObj.get("overnight_excess").toString()));
      }
      if ((jsonObj.get("leverage") != null && !jsonObj.get("leverage").isJsonNull()) && !jsonObj.get("leverage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leverage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leverage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableFundsResponseSecurities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableFundsResponseSecurities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableFundsResponseSecurities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableFundsResponseSecurities.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableFundsResponseSecurities>() {
           @Override
           public void write(JsonWriter out, AvailableFundsResponseSecurities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailableFundsResponseSecurities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AvailableFundsResponseSecurities given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AvailableFundsResponseSecurities
   * @throws IOException if the JSON string is invalid with respect to AvailableFundsResponseSecurities
   */
  public static AvailableFundsResponseSecurities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableFundsResponseSecurities.class);
  }

  /**
   * Convert an instance of AvailableFundsResponseSecurities to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

