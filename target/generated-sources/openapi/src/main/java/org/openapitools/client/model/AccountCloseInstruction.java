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
import org.openapitools.client.model.AccountCloseInstructionWithdrawalInfo;

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
 * AccountCloseInstruction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AccountCloseInstruction {
  public static final String SERIALIZED_NAME_CLIENT_INSTRUCTION_ID = "clientInstructionId";
  @SerializedName(SERIALIZED_NAME_CLIENT_INSTRUCTION_ID)
  @javax.annotation.Nonnull
  private BigDecimal clientInstructionId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nonnull
  private String accountId;

  public static final String SERIALIZED_NAME_CLOSE_REASON = "closeReason";
  @SerializedName(SERIALIZED_NAME_CLOSE_REASON)
  @javax.annotation.Nullable
  private String closeReason;

  public static final String SERIALIZED_NAME_WITHDRAWAL_INFO = "withdrawalInfo";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL_INFO)
  @javax.annotation.Nullable
  private AccountCloseInstructionWithdrawalInfo withdrawalInfo;

  public AccountCloseInstruction() {
  }

  public AccountCloseInstruction clientInstructionId(@javax.annotation.Nonnull BigDecimal clientInstructionId) {
    this.clientInstructionId = clientInstructionId;
    return this;
  }

  /**
   * Get clientInstructionId
   * @return clientInstructionId
   */
  @javax.annotation.Nonnull
  public BigDecimal getClientInstructionId() {
    return clientInstructionId;
  }

  public void setClientInstructionId(@javax.annotation.Nonnull BigDecimal clientInstructionId) {
    this.clientInstructionId = clientInstructionId;
  }


  public AccountCloseInstruction accountId(@javax.annotation.Nonnull String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nonnull
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nonnull String accountId) {
    this.accountId = accountId;
  }


  public AccountCloseInstruction closeReason(@javax.annotation.Nullable String closeReason) {
    this.closeReason = closeReason;
    return this;
  }

  /**
   * Get closeReason
   * @return closeReason
   */
  @javax.annotation.Nullable
  public String getCloseReason() {
    return closeReason;
  }

  public void setCloseReason(@javax.annotation.Nullable String closeReason) {
    this.closeReason = closeReason;
  }


  public AccountCloseInstruction withdrawalInfo(@javax.annotation.Nullable AccountCloseInstructionWithdrawalInfo withdrawalInfo) {
    this.withdrawalInfo = withdrawalInfo;
    return this;
  }

  /**
   * Get withdrawalInfo
   * @return withdrawalInfo
   */
  @javax.annotation.Nullable
  public AccountCloseInstructionWithdrawalInfo getWithdrawalInfo() {
    return withdrawalInfo;
  }

  public void setWithdrawalInfo(@javax.annotation.Nullable AccountCloseInstructionWithdrawalInfo withdrawalInfo) {
    this.withdrawalInfo = withdrawalInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCloseInstruction accountCloseInstruction = (AccountCloseInstruction) o;
    return Objects.equals(this.clientInstructionId, accountCloseInstruction.clientInstructionId) &&
        Objects.equals(this.accountId, accountCloseInstruction.accountId) &&
        Objects.equals(this.closeReason, accountCloseInstruction.closeReason) &&
        Objects.equals(this.withdrawalInfo, accountCloseInstruction.withdrawalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientInstructionId, accountId, closeReason, withdrawalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCloseInstruction {\n");
    sb.append("    clientInstructionId: ").append(toIndentedString(clientInstructionId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
    sb.append("    withdrawalInfo: ").append(toIndentedString(withdrawalInfo)).append("\n");
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
    openapiFields.add("clientInstructionId");
    openapiFields.add("accountId");
    openapiFields.add("closeReason");
    openapiFields.add("withdrawalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientInstructionId");
    openapiRequiredFields.add("accountId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountCloseInstruction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountCloseInstruction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountCloseInstruction is not found in the empty JSON string", AccountCloseInstruction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountCloseInstruction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountCloseInstruction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountCloseInstruction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("closeReason") != null && !jsonObj.get("closeReason").isJsonNull()) && !jsonObj.get("closeReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closeReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closeReason").toString()));
      }
      // validate the optional field `withdrawalInfo`
      if (jsonObj.get("withdrawalInfo") != null && !jsonObj.get("withdrawalInfo").isJsonNull()) {
        AccountCloseInstructionWithdrawalInfo.validateJsonElement(jsonObj.get("withdrawalInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountCloseInstruction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountCloseInstruction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountCloseInstruction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountCloseInstruction.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountCloseInstruction>() {
           @Override
           public void write(JsonWriter out, AccountCloseInstruction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountCloseInstruction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountCloseInstruction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountCloseInstruction
   * @throws IOException if the JSON string is invalid with respect to AccountCloseInstruction
   */
  public static AccountCloseInstruction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountCloseInstruction.class);
  }

  /**
   * Convert an instance of AccountCloseInstruction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

