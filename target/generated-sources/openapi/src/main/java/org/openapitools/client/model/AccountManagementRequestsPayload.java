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
import org.openapitools.client.model.AccountManagementRequests;

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
 * AccountManagementRequestsPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AccountManagementRequestsPayload {
  public static final String SERIALIZED_NAME_ACCOUNT_MANAGEMENT_REQUESTS = "accountManagementRequests";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_MANAGEMENT_REQUESTS)
  @javax.annotation.Nullable
  private AccountManagementRequests accountManagementRequests;

  public AccountManagementRequestsPayload() {
  }

  public AccountManagementRequestsPayload accountManagementRequests(@javax.annotation.Nullable AccountManagementRequests accountManagementRequests) {
    this.accountManagementRequests = accountManagementRequests;
    return this;
  }

  /**
   * Get accountManagementRequests
   * @return accountManagementRequests
   */
  @javax.annotation.Nullable
  public AccountManagementRequests getAccountManagementRequests() {
    return accountManagementRequests;
  }

  public void setAccountManagementRequests(@javax.annotation.Nullable AccountManagementRequests accountManagementRequests) {
    this.accountManagementRequests = accountManagementRequests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagementRequestsPayload accountManagementRequestsPayload = (AccountManagementRequestsPayload) o;
    return Objects.equals(this.accountManagementRequests, accountManagementRequestsPayload.accountManagementRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagementRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementRequestsPayload {\n");
    sb.append("    accountManagementRequests: ").append(toIndentedString(accountManagementRequests)).append("\n");
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
    openapiFields.add("accountManagementRequests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountManagementRequestsPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountManagementRequestsPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountManagementRequestsPayload is not found in the empty JSON string", AccountManagementRequestsPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountManagementRequestsPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountManagementRequestsPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `accountManagementRequests`
      if (jsonObj.get("accountManagementRequests") != null && !jsonObj.get("accountManagementRequests").isJsonNull()) {
        AccountManagementRequests.validateJsonElement(jsonObj.get("accountManagementRequests"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountManagementRequestsPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountManagementRequestsPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountManagementRequestsPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountManagementRequestsPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountManagementRequestsPayload>() {
           @Override
           public void write(JsonWriter out, AccountManagementRequestsPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountManagementRequestsPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountManagementRequestsPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountManagementRequestsPayload
   * @throws IOException if the JSON string is invalid with respect to AccountManagementRequestsPayload
   */
  public static AccountManagementRequestsPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountManagementRequestsPayload.class);
  }

  /**
   * Convert an instance of AccountManagementRequestsPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

