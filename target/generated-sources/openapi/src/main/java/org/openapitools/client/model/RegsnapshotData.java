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
 * Object containing regulatory snapshot data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class RegsnapshotData {
  public static final String SERIALIZED_NAME_CONID = "conid";
  @SerializedName(SERIALIZED_NAME_CONID)
  @javax.annotation.Nullable
  private Integer conid;

  public static final String SERIALIZED_NAME_CONID_EX = "conidEx";
  @SerializedName(SERIALIZED_NAME_CONID_EX)
  @javax.annotation.Nullable
  private String conidEx;

  public static final String SERIALIZED_NAME_SIZE_MIN_TICK = "sizeMinTick";
  @SerializedName(SERIALIZED_NAME_SIZE_MIN_TICK)
  @javax.annotation.Nullable
  private BigDecimal sizeMinTick;

  public static final String SERIALIZED_NAME_BBO_EXCHANGE = "BboExchange";
  @SerializedName(SERIALIZED_NAME_BBO_EXCHANGE)
  @javax.annotation.Nullable
  private String bboExchange;

  public static final String SERIALIZED_NAME_HAS_DELAYED = "HasDelayed";
  @SerializedName(SERIALIZED_NAME_HAS_DELAYED)
  @javax.annotation.Nullable
  private Boolean hasDelayed;

  public static final String SERIALIZED_NAME_84 = "84";
  @SerializedName(SERIALIZED_NAME_84)
  @javax.annotation.Nullable
  private String _84;

  public static final String SERIALIZED_NAME_86 = "86";
  @SerializedName(SERIALIZED_NAME_86)
  @javax.annotation.Nullable
  private String _86;

  public static final String SERIALIZED_NAME_88 = "88";
  @SerializedName(SERIALIZED_NAME_88)
  @javax.annotation.Nullable
  private Integer _88;

  public static final String SERIALIZED_NAME_85 = "85";
  @SerializedName(SERIALIZED_NAME_85)
  @javax.annotation.Nullable
  private Integer _85;

  public static final String SERIALIZED_NAME_BEST_BID_EXCH = "BestBidExch";
  @SerializedName(SERIALIZED_NAME_BEST_BID_EXCH)
  @javax.annotation.Nullable
  private Integer bestBidExch;

  public static final String SERIALIZED_NAME_BEST_ASK_EXCH = "BestAskExch";
  @SerializedName(SERIALIZED_NAME_BEST_ASK_EXCH)
  @javax.annotation.Nullable
  private Integer bestAskExch;

  public static final String SERIALIZED_NAME_31 = "31";
  @SerializedName(SERIALIZED_NAME_31)
  @javax.annotation.Nullable
  private String _31;

  public static final String SERIALIZED_NAME_7059 = "7059";
  @SerializedName(SERIALIZED_NAME_7059)
  @javax.annotation.Nullable
  private String _7059;

  public static final String SERIALIZED_NAME_LAST_EXCH = "LastExch";
  @SerializedName(SERIALIZED_NAME_LAST_EXCH)
  @javax.annotation.Nullable
  private Integer lastExch;

  public static final String SERIALIZED_NAME_7057 = "7057";
  @SerializedName(SERIALIZED_NAME_7057)
  @javax.annotation.Nullable
  private String _7057;

  public static final String SERIALIZED_NAME_7068 = "7068";
  @SerializedName(SERIALIZED_NAME_7068)
  @javax.annotation.Nullable
  private String _7068;

  public static final String SERIALIZED_NAME_7058 = "7058";
  @SerializedName(SERIALIZED_NAME_7058)
  @javax.annotation.Nullable
  private String _7058;

  public RegsnapshotData() {
  }

  public RegsnapshotData conid(@javax.annotation.Nullable Integer conid) {
    this.conid = conid;
    return this;
  }

  /**
   * IB contract ID.
   * @return conid
   */
  @javax.annotation.Nullable
  public Integer getConid() {
    return conid;
  }

  public void setConid(@javax.annotation.Nullable Integer conid) {
    this.conid = conid;
  }


  public RegsnapshotData conidEx(@javax.annotation.Nullable String conidEx) {
    this.conidEx = conidEx;
    return this;
  }

  /**
   * Contract ID and routing destination in format 123456@EXCHANGE.
   * @return conidEx
   */
  @javax.annotation.Nullable
  public String getConidEx() {
    return conidEx;
  }

  public void setConidEx(@javax.annotation.Nullable String conidEx) {
    this.conidEx = conidEx;
  }


  public RegsnapshotData sizeMinTick(@javax.annotation.Nullable BigDecimal sizeMinTick) {
    this.sizeMinTick = sizeMinTick;
    return this;
  }

  /**
   * Internal use. Minimum size display increment.
   * @return sizeMinTick
   */
  @javax.annotation.Nullable
  public BigDecimal getSizeMinTick() {
    return sizeMinTick;
  }

  public void setSizeMinTick(@javax.annotation.Nullable BigDecimal sizeMinTick) {
    this.sizeMinTick = sizeMinTick;
  }


  public RegsnapshotData bboExchange(@javax.annotation.Nullable String bboExchange) {
    this.bboExchange = bboExchange;
    return this;
  }

  /**
   * Internal use. Exchange map code.
   * @return bboExchange
   */
  @javax.annotation.Nullable
  public String getBboExchange() {
    return bboExchange;
  }

  public void setBboExchange(@javax.annotation.Nullable String bboExchange) {
    this.bboExchange = bboExchange;
  }


  public RegsnapshotData hasDelayed(@javax.annotation.Nullable Boolean hasDelayed) {
    this.hasDelayed = hasDelayed;
    return this;
  }

  /**
   * Indicates whether delayed data is available.
   * @return hasDelayed
   */
  @javax.annotation.Nullable
  public Boolean getHasDelayed() {
    return hasDelayed;
  }

  public void setHasDelayed(@javax.annotation.Nullable Boolean hasDelayed) {
    this.hasDelayed = hasDelayed;
  }


  public RegsnapshotData _84(@javax.annotation.Nullable String _84) {
    this._84 = _84;
    return this;
  }

  /**
   * Bid price.
   * @return _84
   */
  @javax.annotation.Nullable
  public String get84() {
    return _84;
  }

  public void set84(@javax.annotation.Nullable String _84) {
    this._84 = _84;
  }


  public RegsnapshotData _86(@javax.annotation.Nullable String _86) {
    this._86 = _86;
    return this;
  }

  /**
   * Ask price.
   * @return _86
   */
  @javax.annotation.Nullable
  public String get86() {
    return _86;
  }

  public void set86(@javax.annotation.Nullable String _86) {
    this._86 = _86;
  }


  public RegsnapshotData _88(@javax.annotation.Nullable Integer _88) {
    this._88 = _88;
    return this;
  }

  /**
   * Bid size in round lots (100 shares).
   * @return _88
   */
  @javax.annotation.Nullable
  public Integer get88() {
    return _88;
  }

  public void set88(@javax.annotation.Nullable Integer _88) {
    this._88 = _88;
  }


  public RegsnapshotData _85(@javax.annotation.Nullable Integer _85) {
    this._85 = _85;
    return this;
  }

  /**
   * Ask size in round lots (100 shares).
   * @return _85
   */
  @javax.annotation.Nullable
  public Integer get85() {
    return _85;
  }

  public void set85(@javax.annotation.Nullable Integer _85) {
    this._85 = _85;
  }


  public RegsnapshotData bestBidExch(@javax.annotation.Nullable Integer bestBidExch) {
    this.bestBidExch = bestBidExch;
    return this;
  }

  /**
   * Internal use. Equivalent binary encoding of field 7068.
   * @return bestBidExch
   */
  @javax.annotation.Nullable
  public Integer getBestBidExch() {
    return bestBidExch;
  }

  public void setBestBidExch(@javax.annotation.Nullable Integer bestBidExch) {
    this.bestBidExch = bestBidExch;
  }


  public RegsnapshotData bestAskExch(@javax.annotation.Nullable Integer bestAskExch) {
    this.bestAskExch = bestAskExch;
    return this;
  }

  /**
   * Internal use. Equivalent binary encoding of field 7057.
   * @return bestAskExch
   */
  @javax.annotation.Nullable
  public Integer getBestAskExch() {
    return bestAskExch;
  }

  public void setBestAskExch(@javax.annotation.Nullable Integer bestAskExch) {
    this.bestAskExch = bestAskExch;
  }


  public RegsnapshotData _31(@javax.annotation.Nullable String _31) {
    this._31 = _31;
    return this;
  }

  /**
   * Last traded price.
   * @return _31
   */
  @javax.annotation.Nullable
  public String get31() {
    return _31;
  }

  public void set31(@javax.annotation.Nullable String _31) {
    this._31 = _31;
  }


  public RegsnapshotData _7059(@javax.annotation.Nullable String _7059) {
    this._7059 = _7059;
    return this;
  }

  /**
   * Last traded size in round lots (100 shares).
   * @return _7059
   */
  @javax.annotation.Nullable
  public String get7059() {
    return _7059;
  }

  public void set7059(@javax.annotation.Nullable String _7059) {
    this._7059 = _7059;
  }


  public RegsnapshotData lastExch(@javax.annotation.Nullable Integer lastExch) {
    this.lastExch = lastExch;
    return this;
  }

  /**
   * Internal use. Equivalent binary encoding of field 7058.
   * @return lastExch
   */
  @javax.annotation.Nullable
  public Integer getLastExch() {
    return lastExch;
  }

  public void setLastExch(@javax.annotation.Nullable Integer lastExch) {
    this.lastExch = lastExch;
  }


  public RegsnapshotData _7057(@javax.annotation.Nullable String _7057) {
    this._7057 = _7057;
    return this;
  }

  /**
   * Best ask exchanges(s). String of single, capital-letter MCOIDs.
   * @return _7057
   */
  @javax.annotation.Nullable
  public String get7057() {
    return _7057;
  }

  public void set7057(@javax.annotation.Nullable String _7057) {
    this._7057 = _7057;
  }


  public RegsnapshotData _7068(@javax.annotation.Nullable String _7068) {
    this._7068 = _7068;
    return this;
  }

  /**
   * Best bid exchange(s). String of single, capital-letter MCOIDs.
   * @return _7068
   */
  @javax.annotation.Nullable
  public String get7068() {
    return _7068;
  }

  public void set7068(@javax.annotation.Nullable String _7068) {
    this._7068 = _7068;
  }


  public RegsnapshotData _7058(@javax.annotation.Nullable String _7058) {
    this._7058 = _7058;
    return this;
  }

  /**
   * Exchange of last trade. A single, capital-letter MCOID.
   * @return _7058
   */
  @javax.annotation.Nullable
  public String get7058() {
    return _7058;
  }

  public void set7058(@javax.annotation.Nullable String _7058) {
    this._7058 = _7058;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegsnapshotData regsnapshotData = (RegsnapshotData) o;
    return Objects.equals(this.conid, regsnapshotData.conid) &&
        Objects.equals(this.conidEx, regsnapshotData.conidEx) &&
        Objects.equals(this.sizeMinTick, regsnapshotData.sizeMinTick) &&
        Objects.equals(this.bboExchange, regsnapshotData.bboExchange) &&
        Objects.equals(this.hasDelayed, regsnapshotData.hasDelayed) &&
        Objects.equals(this._84, regsnapshotData._84) &&
        Objects.equals(this._86, regsnapshotData._86) &&
        Objects.equals(this._88, regsnapshotData._88) &&
        Objects.equals(this._85, regsnapshotData._85) &&
        Objects.equals(this.bestBidExch, regsnapshotData.bestBidExch) &&
        Objects.equals(this.bestAskExch, regsnapshotData.bestAskExch) &&
        Objects.equals(this._31, regsnapshotData._31) &&
        Objects.equals(this._7059, regsnapshotData._7059) &&
        Objects.equals(this.lastExch, regsnapshotData.lastExch) &&
        Objects.equals(this._7057, regsnapshotData._7057) &&
        Objects.equals(this._7068, regsnapshotData._7068) &&
        Objects.equals(this._7058, regsnapshotData._7058);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conid, conidEx, sizeMinTick, bboExchange, hasDelayed, _84, _86, _88, _85, bestBidExch, bestAskExch, _31, _7059, lastExch, _7057, _7068, _7058);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegsnapshotData {\n");
    sb.append("    conid: ").append(toIndentedString(conid)).append("\n");
    sb.append("    conidEx: ").append(toIndentedString(conidEx)).append("\n");
    sb.append("    sizeMinTick: ").append(toIndentedString(sizeMinTick)).append("\n");
    sb.append("    bboExchange: ").append(toIndentedString(bboExchange)).append("\n");
    sb.append("    hasDelayed: ").append(toIndentedString(hasDelayed)).append("\n");
    sb.append("    _84: ").append(toIndentedString(_84)).append("\n");
    sb.append("    _86: ").append(toIndentedString(_86)).append("\n");
    sb.append("    _88: ").append(toIndentedString(_88)).append("\n");
    sb.append("    _85: ").append(toIndentedString(_85)).append("\n");
    sb.append("    bestBidExch: ").append(toIndentedString(bestBidExch)).append("\n");
    sb.append("    bestAskExch: ").append(toIndentedString(bestAskExch)).append("\n");
    sb.append("    _31: ").append(toIndentedString(_31)).append("\n");
    sb.append("    _7059: ").append(toIndentedString(_7059)).append("\n");
    sb.append("    lastExch: ").append(toIndentedString(lastExch)).append("\n");
    sb.append("    _7057: ").append(toIndentedString(_7057)).append("\n");
    sb.append("    _7068: ").append(toIndentedString(_7068)).append("\n");
    sb.append("    _7058: ").append(toIndentedString(_7058)).append("\n");
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
    openapiFields.add("conid");
    openapiFields.add("conidEx");
    openapiFields.add("sizeMinTick");
    openapiFields.add("BboExchange");
    openapiFields.add("HasDelayed");
    openapiFields.add("84");
    openapiFields.add("86");
    openapiFields.add("88");
    openapiFields.add("85");
    openapiFields.add("BestBidExch");
    openapiFields.add("BestAskExch");
    openapiFields.add("31");
    openapiFields.add("7059");
    openapiFields.add("LastExch");
    openapiFields.add("7057");
    openapiFields.add("7068");
    openapiFields.add("7058");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RegsnapshotData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RegsnapshotData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RegsnapshotData is not found in the empty JSON string", RegsnapshotData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RegsnapshotData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RegsnapshotData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("conidEx") != null && !jsonObj.get("conidEx").isJsonNull()) && !jsonObj.get("conidEx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conidEx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conidEx").toString()));
      }
      if ((jsonObj.get("BboExchange") != null && !jsonObj.get("BboExchange").isJsonNull()) && !jsonObj.get("BboExchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BboExchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BboExchange").toString()));
      }
      if ((jsonObj.get("84") != null && !jsonObj.get("84").isJsonNull()) && !jsonObj.get("84").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `84` to be a primitive type in the JSON string but got `%s`", jsonObj.get("84").toString()));
      }
      if ((jsonObj.get("86") != null && !jsonObj.get("86").isJsonNull()) && !jsonObj.get("86").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `86` to be a primitive type in the JSON string but got `%s`", jsonObj.get("86").toString()));
      }
      if ((jsonObj.get("31") != null && !jsonObj.get("31").isJsonNull()) && !jsonObj.get("31").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `31` to be a primitive type in the JSON string but got `%s`", jsonObj.get("31").toString()));
      }
      if ((jsonObj.get("7059") != null && !jsonObj.get("7059").isJsonNull()) && !jsonObj.get("7059").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `7059` to be a primitive type in the JSON string but got `%s`", jsonObj.get("7059").toString()));
      }
      if ((jsonObj.get("7057") != null && !jsonObj.get("7057").isJsonNull()) && !jsonObj.get("7057").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `7057` to be a primitive type in the JSON string but got `%s`", jsonObj.get("7057").toString()));
      }
      if ((jsonObj.get("7068") != null && !jsonObj.get("7068").isJsonNull()) && !jsonObj.get("7068").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `7068` to be a primitive type in the JSON string but got `%s`", jsonObj.get("7068").toString()));
      }
      if ((jsonObj.get("7058") != null && !jsonObj.get("7058").isJsonNull()) && !jsonObj.get("7058").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `7058` to be a primitive type in the JSON string but got `%s`", jsonObj.get("7058").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RegsnapshotData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RegsnapshotData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RegsnapshotData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RegsnapshotData.class));

       return (TypeAdapter<T>) new TypeAdapter<RegsnapshotData>() {
           @Override
           public void write(JsonWriter out, RegsnapshotData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RegsnapshotData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RegsnapshotData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RegsnapshotData
   * @throws IOException if the JSON string is invalid with respect to RegsnapshotData
   */
  public static RegsnapshotData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RegsnapshotData.class);
  }

  /**
   * Convert an instance of RegsnapshotData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

