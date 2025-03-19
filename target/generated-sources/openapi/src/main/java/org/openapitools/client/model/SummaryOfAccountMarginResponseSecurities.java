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
 * SummaryOfAccountMarginResponseSecurities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class SummaryOfAccountMarginResponseSecurities {
  public static final String SERIALIZED_NAME_CURRENT_INITIAL = "current_initial";
  @SerializedName(SERIALIZED_NAME_CURRENT_INITIAL)
  @javax.annotation.Nullable
  private String currentInitial;

  public static final String SERIALIZED_NAME_PRDCTD_PST_XPRY_MRGN_AT_OPN = "Prdctd Pst-xpry Mrgn @ Opn";
  @SerializedName(SERIALIZED_NAME_PRDCTD_PST_XPRY_MRGN_AT_OPN)
  @javax.annotation.Nullable
  private String prdctdPstXpryMrgnAtOpn;

  public static final String SERIALIZED_NAME_CURRENT_MAINT = "current_maint";
  @SerializedName(SERIALIZED_NAME_CURRENT_MAINT)
  @javax.annotation.Nullable
  private String currentMaint;

  public static final String SERIALIZED_NAME_PROJECTED_LIQUIDITY_INITAL_MARGIN = "projected_liquidity_inital_margin";
  @SerializedName(SERIALIZED_NAME_PROJECTED_LIQUIDITY_INITAL_MARGIN)
  @javax.annotation.Nullable
  private String projectedLiquidityInitalMargin;

  public static final String SERIALIZED_NAME_PRJCTD_LK_AHD_MNTNNC_MRGN = "Prjctd Lk Ahd Mntnnc Mrgn";
  @SerializedName(SERIALIZED_NAME_PRJCTD_LK_AHD_MNTNNC_MRGN)
  @javax.annotation.Nullable
  private String prjctdLkAhdMntnncMrgn;

  public static final String SERIALIZED_NAME_PROJECTED_OVERNIGHT_INITIAL_MARGIN = "projected_overnight_initial_margin";
  @SerializedName(SERIALIZED_NAME_PROJECTED_OVERNIGHT_INITIAL_MARGIN)
  @javax.annotation.Nullable
  private String projectedOvernightInitialMargin;

  public static final String SERIALIZED_NAME_PRJCTD_OVRNGHT_MNTNNC_MRGN = "Prjctd Ovrnght Mntnnc Mrgn";
  @SerializedName(SERIALIZED_NAME_PRJCTD_OVRNGHT_MNTNNC_MRGN)
  @javax.annotation.Nullable
  private String prjctdOvrnghtMntnncMrgn;

  public SummaryOfAccountMarginResponseSecurities() {
  }

  public SummaryOfAccountMarginResponseSecurities currentInitial(@javax.annotation.Nullable String currentInitial) {
    this.currentInitial = currentInitial;
    return this;
  }

  /**
   * The minimum amount required to open a new position.
   * @return currentInitial
   */
  @javax.annotation.Nullable
  public String getCurrentInitial() {
    return currentInitial;
  }

  public void setCurrentInitial(@javax.annotation.Nullable String currentInitial) {
    this.currentInitial = currentInitial;
  }


  public SummaryOfAccountMarginResponseSecurities prdctdPstXpryMrgnAtOpn(@javax.annotation.Nullable String prdctdPstXpryMrgnAtOpn) {
    this.prdctdPstXpryMrgnAtOpn = prdctdPstXpryMrgnAtOpn;
    return this;
  }

  /**
   * Provides a projected “at expiration” margin value based on the soon-to-expire contracts in your portfolio.
   * @return prdctdPstXpryMrgnAtOpn
   */
  @javax.annotation.Nullable
  public String getPrdctdPstXpryMrgnAtOpn() {
    return prdctdPstXpryMrgnAtOpn;
  }

  public void setPrdctdPstXpryMrgnAtOpn(@javax.annotation.Nullable String prdctdPstXpryMrgnAtOpn) {
    this.prdctdPstXpryMrgnAtOpn = prdctdPstXpryMrgnAtOpn;
  }


  public SummaryOfAccountMarginResponseSecurities currentMaint(@javax.annotation.Nullable String currentMaint) {
    this.currentMaint = currentMaint;
    return this;
  }

  /**
   * The amount of equity required to maintain your positions.
   * @return currentMaint
   */
  @javax.annotation.Nullable
  public String getCurrentMaint() {
    return currentMaint;
  }

  public void setCurrentMaint(@javax.annotation.Nullable String currentMaint) {
    this.currentMaint = currentMaint;
  }


  public SummaryOfAccountMarginResponseSecurities projectedLiquidityInitalMargin(@javax.annotation.Nullable String projectedLiquidityInitalMargin) {
    this.projectedLiquidityInitalMargin = projectedLiquidityInitalMargin;
    return this;
  }

  /**
   * Provides a projected \&quot;liquid\&quot; initial margin value based on account liquidation value.
   * @return projectedLiquidityInitalMargin
   */
  @javax.annotation.Nullable
  public String getProjectedLiquidityInitalMargin() {
    return projectedLiquidityInitalMargin;
  }

  public void setProjectedLiquidityInitalMargin(@javax.annotation.Nullable String projectedLiquidityInitalMargin) {
    this.projectedLiquidityInitalMargin = projectedLiquidityInitalMargin;
  }


  public SummaryOfAccountMarginResponseSecurities prjctdLkAhdMntnncMrgn(@javax.annotation.Nullable String prjctdLkAhdMntnncMrgn) {
    this.prjctdLkAhdMntnncMrgn = prjctdLkAhdMntnncMrgn;
    return this;
  }

  /**
   * If it is 3:00 pm ET, the next calculation you’re looking ahead to is after the close, or the Overnight Initial Margin. If it’s 3:00 am ET, the next calculation will be at the market’s open.  * &#x60;Securities&#x60; – Projected maintenance margin requirement as of next period’s margin change, in the base currency of the account.   * &#x60;Commodities&#x60; – Maintenance margin requirement as of next period’s margin change in the base currency of the account based on current margin requirements, which are subject to change. This value depends on when you are viewing your margin requirements. 
   * @return prjctdLkAhdMntnncMrgn
   */
  @javax.annotation.Nullable
  public String getPrjctdLkAhdMntnncMrgn() {
    return prjctdLkAhdMntnncMrgn;
  }

  public void setPrjctdLkAhdMntnncMrgn(@javax.annotation.Nullable String prjctdLkAhdMntnncMrgn) {
    this.prjctdLkAhdMntnncMrgn = prjctdLkAhdMntnncMrgn;
  }


  public SummaryOfAccountMarginResponseSecurities projectedOvernightInitialMargin(@javax.annotation.Nullable String projectedOvernightInitialMargin) {
    this.projectedOvernightInitialMargin = projectedOvernightInitialMargin;
    return this;
  }

  /**
   * Overnight refers to the window of time after the local market trading day is closed.    * Securities – Projected overnight initial margin requirement in the base currency of the account.    * Commodities – Overnight initial margin requirement in the base currency of the account based on current margin requirements, which are subject to change. 
   * @return projectedOvernightInitialMargin
   */
  @javax.annotation.Nullable
  public String getProjectedOvernightInitialMargin() {
    return projectedOvernightInitialMargin;
  }

  public void setProjectedOvernightInitialMargin(@javax.annotation.Nullable String projectedOvernightInitialMargin) {
    this.projectedOvernightInitialMargin = projectedOvernightInitialMargin;
  }


  public SummaryOfAccountMarginResponseSecurities prjctdOvrnghtMntnncMrgn(@javax.annotation.Nullable String prjctdOvrnghtMntnncMrgn) {
    this.prjctdOvrnghtMntnncMrgn = prjctdOvrnghtMntnncMrgn;
    return this;
  }

  /**
   * Overnight refers to the window of time after the local market trading day is closed.    * &#x60;Securities&#x60; – Projected overnight maintenance margin requirement in the base currency of the account.    * &#x60;Commodities&#x60; – Overnight maintenance margin requirement in the base currency of the account based on current margin requirements, which are subject to change.   
   * @return prjctdOvrnghtMntnncMrgn
   */
  @javax.annotation.Nullable
  public String getPrjctdOvrnghtMntnncMrgn() {
    return prjctdOvrnghtMntnncMrgn;
  }

  public void setPrjctdOvrnghtMntnncMrgn(@javax.annotation.Nullable String prjctdOvrnghtMntnncMrgn) {
    this.prjctdOvrnghtMntnncMrgn = prjctdOvrnghtMntnncMrgn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryOfAccountMarginResponseSecurities summaryOfAccountMarginResponseSecurities = (SummaryOfAccountMarginResponseSecurities) o;
    return Objects.equals(this.currentInitial, summaryOfAccountMarginResponseSecurities.currentInitial) &&
        Objects.equals(this.prdctdPstXpryMrgnAtOpn, summaryOfAccountMarginResponseSecurities.prdctdPstXpryMrgnAtOpn) &&
        Objects.equals(this.currentMaint, summaryOfAccountMarginResponseSecurities.currentMaint) &&
        Objects.equals(this.projectedLiquidityInitalMargin, summaryOfAccountMarginResponseSecurities.projectedLiquidityInitalMargin) &&
        Objects.equals(this.prjctdLkAhdMntnncMrgn, summaryOfAccountMarginResponseSecurities.prjctdLkAhdMntnncMrgn) &&
        Objects.equals(this.projectedOvernightInitialMargin, summaryOfAccountMarginResponseSecurities.projectedOvernightInitialMargin) &&
        Objects.equals(this.prjctdOvrnghtMntnncMrgn, summaryOfAccountMarginResponseSecurities.prjctdOvrnghtMntnncMrgn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentInitial, prdctdPstXpryMrgnAtOpn, currentMaint, projectedLiquidityInitalMargin, prjctdLkAhdMntnncMrgn, projectedOvernightInitialMargin, prjctdOvrnghtMntnncMrgn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryOfAccountMarginResponseSecurities {\n");
    sb.append("    currentInitial: ").append(toIndentedString(currentInitial)).append("\n");
    sb.append("    prdctdPstXpryMrgnAtOpn: ").append(toIndentedString(prdctdPstXpryMrgnAtOpn)).append("\n");
    sb.append("    currentMaint: ").append(toIndentedString(currentMaint)).append("\n");
    sb.append("    projectedLiquidityInitalMargin: ").append(toIndentedString(projectedLiquidityInitalMargin)).append("\n");
    sb.append("    prjctdLkAhdMntnncMrgn: ").append(toIndentedString(prjctdLkAhdMntnncMrgn)).append("\n");
    sb.append("    projectedOvernightInitialMargin: ").append(toIndentedString(projectedOvernightInitialMargin)).append("\n");
    sb.append("    prjctdOvrnghtMntnncMrgn: ").append(toIndentedString(prjctdOvrnghtMntnncMrgn)).append("\n");
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
    openapiFields.add("current_initial");
    openapiFields.add("Prdctd Pst-xpry Mrgn @ Opn");
    openapiFields.add("current_maint");
    openapiFields.add("projected_liquidity_inital_margin");
    openapiFields.add("Prjctd Lk Ahd Mntnnc Mrgn");
    openapiFields.add("projected_overnight_initial_margin");
    openapiFields.add("Prjctd Ovrnght Mntnnc Mrgn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SummaryOfAccountMarginResponseSecurities
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SummaryOfAccountMarginResponseSecurities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SummaryOfAccountMarginResponseSecurities is not found in the empty JSON string", SummaryOfAccountMarginResponseSecurities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SummaryOfAccountMarginResponseSecurities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SummaryOfAccountMarginResponseSecurities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("current_initial") != null && !jsonObj.get("current_initial").isJsonNull()) && !jsonObj.get("current_initial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_initial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_initial").toString()));
      }
      if ((jsonObj.get("Prdctd Pst-xpry Mrgn @ Opn") != null && !jsonObj.get("Prdctd Pst-xpry Mrgn @ Opn").isJsonNull()) && !jsonObj.get("Prdctd Pst-xpry Mrgn @ Opn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Prdctd Pst-xpry Mrgn @ Opn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Prdctd Pst-xpry Mrgn @ Opn").toString()));
      }
      if ((jsonObj.get("current_maint") != null && !jsonObj.get("current_maint").isJsonNull()) && !jsonObj.get("current_maint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_maint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_maint").toString()));
      }
      if ((jsonObj.get("projected_liquidity_inital_margin") != null && !jsonObj.get("projected_liquidity_inital_margin").isJsonNull()) && !jsonObj.get("projected_liquidity_inital_margin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projected_liquidity_inital_margin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projected_liquidity_inital_margin").toString()));
      }
      if ((jsonObj.get("Prjctd Lk Ahd Mntnnc Mrgn") != null && !jsonObj.get("Prjctd Lk Ahd Mntnnc Mrgn").isJsonNull()) && !jsonObj.get("Prjctd Lk Ahd Mntnnc Mrgn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Prjctd Lk Ahd Mntnnc Mrgn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Prjctd Lk Ahd Mntnnc Mrgn").toString()));
      }
      if ((jsonObj.get("projected_overnight_initial_margin") != null && !jsonObj.get("projected_overnight_initial_margin").isJsonNull()) && !jsonObj.get("projected_overnight_initial_margin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projected_overnight_initial_margin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projected_overnight_initial_margin").toString()));
      }
      if ((jsonObj.get("Prjctd Ovrnght Mntnnc Mrgn") != null && !jsonObj.get("Prjctd Ovrnght Mntnnc Mrgn").isJsonNull()) && !jsonObj.get("Prjctd Ovrnght Mntnnc Mrgn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Prjctd Ovrnght Mntnnc Mrgn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Prjctd Ovrnght Mntnnc Mrgn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SummaryOfAccountMarginResponseSecurities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SummaryOfAccountMarginResponseSecurities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SummaryOfAccountMarginResponseSecurities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SummaryOfAccountMarginResponseSecurities.class));

       return (TypeAdapter<T>) new TypeAdapter<SummaryOfAccountMarginResponseSecurities>() {
           @Override
           public void write(JsonWriter out, SummaryOfAccountMarginResponseSecurities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SummaryOfAccountMarginResponseSecurities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SummaryOfAccountMarginResponseSecurities given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SummaryOfAccountMarginResponseSecurities
   * @throws IOException if the JSON string is invalid with respect to SummaryOfAccountMarginResponseSecurities
   */
  public static SummaryOfAccountMarginResponseSecurities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SummaryOfAccountMarginResponseSecurities.class);
  }

  /**
   * Convert an instance of SummaryOfAccountMarginResponseSecurities to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

