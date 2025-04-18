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
 * UpdateBCAN
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class UpdateBCAN {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_BCAN = "bcan";
  @SerializedName(SERIALIZED_NAME_BCAN)
  @javax.annotation.Nullable
  private String bcan;

  public static final String SERIALIZED_NAME_CE_NUMBER = "ceNumber";
  @SerializedName(SERIALIZED_NAME_CE_NUMBER)
  @javax.annotation.Nullable
  private String ceNumber;

  public UpdateBCAN() {
  }

  public UpdateBCAN accountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public UpdateBCAN bcan(@javax.annotation.Nullable String bcan) {
    this.bcan = bcan;
    return this;
  }

  /**
   * Get bcan
   * @return bcan
   */
  @javax.annotation.Nullable
  public String getBcan() {
    return bcan;
  }

  public void setBcan(@javax.annotation.Nullable String bcan) {
    this.bcan = bcan;
  }


  public UpdateBCAN ceNumber(@javax.annotation.Nullable String ceNumber) {
    this.ceNumber = ceNumber;
    return this;
  }

  /**
   * Get ceNumber
   * @return ceNumber
   */
  @javax.annotation.Nullable
  public String getCeNumber() {
    return ceNumber;
  }

  public void setCeNumber(@javax.annotation.Nullable String ceNumber) {
    this.ceNumber = ceNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBCAN updateBCAN = (UpdateBCAN) o;
    return Objects.equals(this.accountId, updateBCAN.accountId) &&
        Objects.equals(this.bcan, updateBCAN.bcan) &&
        Objects.equals(this.ceNumber, updateBCAN.ceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bcan, ceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBCAN {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bcan: ").append(toIndentedString(bcan)).append("\n");
    sb.append("    ceNumber: ").append(toIndentedString(ceNumber)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("bcan");
    openapiFields.add("ceNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateBCAN
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBCAN.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBCAN is not found in the empty JSON string", UpdateBCAN.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBCAN.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBCAN` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("bcan") != null && !jsonObj.get("bcan").isJsonNull()) && !jsonObj.get("bcan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bcan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bcan").toString()));
      }
      if ((jsonObj.get("ceNumber") != null && !jsonObj.get("ceNumber").isJsonNull()) && !jsonObj.get("ceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ceNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBCAN.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBCAN' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBCAN> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBCAN.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBCAN>() {
           @Override
           public void write(JsonWriter out, UpdateBCAN value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBCAN read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateBCAN given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateBCAN
   * @throws IOException if the JSON string is invalid with respect to UpdateBCAN
   */
  public static UpdateBCAN fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBCAN.class);
  }

  /**
   * Convert an instance of UpdateBCAN to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

