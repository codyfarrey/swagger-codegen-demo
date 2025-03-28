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
import org.openapitools.client.model.UpdateEmail;
import org.openapitools.client.model.UpdatePassword;

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
 * UpdateCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class UpdateCredentials {
  public static final String SERIALIZED_NAME_UPDATE_EMAIL = "updateEmail";
  @SerializedName(SERIALIZED_NAME_UPDATE_EMAIL)
  @javax.annotation.Nullable
  private UpdateEmail updateEmail;

  public static final String SERIALIZED_NAME_UPDATE_PASSWORD = "updatePassword";
  @SerializedName(SERIALIZED_NAME_UPDATE_PASSWORD)
  @javax.annotation.Nullable
  private UpdatePassword updatePassword;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_REFERENCE_USER_NAME = "referenceUserName";
  @SerializedName(SERIALIZED_NAME_REFERENCE_USER_NAME)
  @javax.annotation.Nullable
  private String referenceUserName;

  public UpdateCredentials() {
  }

  public UpdateCredentials updateEmail(@javax.annotation.Nullable UpdateEmail updateEmail) {
    this.updateEmail = updateEmail;
    return this;
  }

  /**
   * Get updateEmail
   * @return updateEmail
   */
  @javax.annotation.Nullable
  public UpdateEmail getUpdateEmail() {
    return updateEmail;
  }

  public void setUpdateEmail(@javax.annotation.Nullable UpdateEmail updateEmail) {
    this.updateEmail = updateEmail;
  }


  public UpdateCredentials updatePassword(@javax.annotation.Nullable UpdatePassword updatePassword) {
    this.updatePassword = updatePassword;
    return this;
  }

  /**
   * Get updatePassword
   * @return updatePassword
   */
  @javax.annotation.Nullable
  public UpdatePassword getUpdatePassword() {
    return updatePassword;
  }

  public void setUpdatePassword(@javax.annotation.Nullable UpdatePassword updatePassword) {
    this.updatePassword = updatePassword;
  }


  public UpdateCredentials accountId(@javax.annotation.Nullable String accountId) {
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


  public UpdateCredentials referenceUserName(@javax.annotation.Nullable String referenceUserName) {
    this.referenceUserName = referenceUserName;
    return this;
  }

  /**
   * Get referenceUserName
   * @return referenceUserName
   */
  @javax.annotation.Nullable
  public String getReferenceUserName() {
    return referenceUserName;
  }

  public void setReferenceUserName(@javax.annotation.Nullable String referenceUserName) {
    this.referenceUserName = referenceUserName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCredentials updateCredentials = (UpdateCredentials) o;
    return Objects.equals(this.updateEmail, updateCredentials.updateEmail) &&
        Objects.equals(this.updatePassword, updateCredentials.updatePassword) &&
        Objects.equals(this.accountId, updateCredentials.accountId) &&
        Objects.equals(this.referenceUserName, updateCredentials.referenceUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateEmail, updatePassword, accountId, referenceUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCredentials {\n");
    sb.append("    updateEmail: ").append(toIndentedString(updateEmail)).append("\n");
    sb.append("    updatePassword: ").append(toIndentedString(updatePassword)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    referenceUserName: ").append(toIndentedString(referenceUserName)).append("\n");
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
    openapiFields.add("updateEmail");
    openapiFields.add("updatePassword");
    openapiFields.add("accountId");
    openapiFields.add("referenceUserName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateCredentials
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateCredentials is not found in the empty JSON string", UpdateCredentials.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateCredentials.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateCredentials` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `updateEmail`
      if (jsonObj.get("updateEmail") != null && !jsonObj.get("updateEmail").isJsonNull()) {
        UpdateEmail.validateJsonElement(jsonObj.get("updateEmail"));
      }
      // validate the optional field `updatePassword`
      if (jsonObj.get("updatePassword") != null && !jsonObj.get("updatePassword").isJsonNull()) {
        UpdatePassword.validateJsonElement(jsonObj.get("updatePassword"));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("referenceUserName") != null && !jsonObj.get("referenceUserName").isJsonNull()) && !jsonObj.get("referenceUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceUserName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateCredentials>() {
           @Override
           public void write(JsonWriter out, UpdateCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateCredentials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateCredentials given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateCredentials
   * @throws IOException if the JSON string is invalid with respect to UpdateCredentials
   */
  public static UpdateCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateCredentials.class);
  }

  /**
   * Convert an instance of UpdateCredentials to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

