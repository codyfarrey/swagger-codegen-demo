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
 * LinkDuplicateAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class LinkDuplicateAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_EXTERNAL_ACCOUNT_ID = "externalAccountId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String externalAccountId;

  public static final String SERIALIZED_NAME_CLIENT_ACTIVE_TRADING = "clientActiveTrading";
  @SerializedName(SERIALIZED_NAME_CLIENT_ACTIVE_TRADING)
  @javax.annotation.Nullable
  private Boolean clientActiveTrading;

  public LinkDuplicateAccount() {
  }

  public LinkDuplicateAccount accountId(@javax.annotation.Nullable String accountId) {
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


  public LinkDuplicateAccount externalAccountId(@javax.annotation.Nullable String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Get externalAccountId
   * @return externalAccountId
   */
  @javax.annotation.Nullable
  public String getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(@javax.annotation.Nullable String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }


  public LinkDuplicateAccount clientActiveTrading(@javax.annotation.Nullable Boolean clientActiveTrading) {
    this.clientActiveTrading = clientActiveTrading;
    return this;
  }

  /**
   * Get clientActiveTrading
   * @return clientActiveTrading
   */
  @javax.annotation.Nullable
  public Boolean getClientActiveTrading() {
    return clientActiveTrading;
  }

  public void setClientActiveTrading(@javax.annotation.Nullable Boolean clientActiveTrading) {
    this.clientActiveTrading = clientActiveTrading;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDuplicateAccount linkDuplicateAccount = (LinkDuplicateAccount) o;
    return Objects.equals(this.accountId, linkDuplicateAccount.accountId) &&
        Objects.equals(this.externalAccountId, linkDuplicateAccount.externalAccountId) &&
        Objects.equals(this.clientActiveTrading, linkDuplicateAccount.clientActiveTrading);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalAccountId, clientActiveTrading);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDuplicateAccount {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    clientActiveTrading: ").append(toIndentedString(clientActiveTrading)).append("\n");
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
    openapiFields.add("externalAccountId");
    openapiFields.add("clientActiveTrading");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LinkDuplicateAccount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinkDuplicateAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkDuplicateAccount is not found in the empty JSON string", LinkDuplicateAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinkDuplicateAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkDuplicateAccount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("externalAccountId") != null && !jsonObj.get("externalAccountId").isJsonNull()) && !jsonObj.get("externalAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalAccountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkDuplicateAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkDuplicateAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkDuplicateAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkDuplicateAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkDuplicateAccount>() {
           @Override
           public void write(JsonWriter out, LinkDuplicateAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkDuplicateAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LinkDuplicateAccount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LinkDuplicateAccount
   * @throws IOException if the JSON string is invalid with respect to LinkDuplicateAccount
   */
  public static LinkDuplicateAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkDuplicateAccount.class);
  }

  /**
   * Convert an instance of LinkDuplicateAccount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

