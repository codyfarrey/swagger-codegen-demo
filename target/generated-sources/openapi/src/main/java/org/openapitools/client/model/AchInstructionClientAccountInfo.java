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
 * AchInstructionClientAccountInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AchInstructionClientAccountInfo {
  public static final String SERIALIZED_NAME_BANK_ROUTING_NUMBER = "bankRoutingNumber";
  @SerializedName(SERIALIZED_NAME_BANK_ROUTING_NUMBER)
  @javax.annotation.Nonnull
  private String bankRoutingNumber;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_NUMBER = "bankAccountNumber";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_NUMBER)
  @javax.annotation.Nonnull
  private String bankAccountNumber;

  public static final String SERIALIZED_NAME_BANK_NAME = "bankName";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  @javax.annotation.Nonnull
  private String bankName;

  /**
   * Gets or Sets bankAccountTypeCode
   */
  @JsonAdapter(BankAccountTypeCodeEnum.Adapter.class)
  public enum BankAccountTypeCodeEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1")),
    
    NUMBER_2(new BigDecimal("2"));

    private BigDecimal value;

    BankAccountTypeCodeEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BankAccountTypeCodeEnum fromValue(BigDecimal value) {
      for (BankAccountTypeCodeEnum b : BankAccountTypeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BankAccountTypeCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BankAccountTypeCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BankAccountTypeCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BankAccountTypeCodeEnum.fromValue(new BigDecimal(value));
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BankAccountTypeCodeEnum.fromValue(new BigDecimal(value));
    }
  }

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE_CODE = "bankAccountTypeCode";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE_CODE)
  @javax.annotation.Nonnull
  private BankAccountTypeCodeEnum bankAccountTypeCode;

  public AchInstructionClientAccountInfo() {
  }

  public AchInstructionClientAccountInfo bankRoutingNumber(@javax.annotation.Nonnull String bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
    return this;
  }

  /**
   * Get bankRoutingNumber
   * @return bankRoutingNumber
   */
  @javax.annotation.Nonnull
  public String getBankRoutingNumber() {
    return bankRoutingNumber;
  }

  public void setBankRoutingNumber(@javax.annotation.Nonnull String bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
  }


  public AchInstructionClientAccountInfo bankAccountNumber(@javax.annotation.Nonnull String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

  /**
   * Get bankAccountNumber
   * @return bankAccountNumber
   */
  @javax.annotation.Nonnull
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(@javax.annotation.Nonnull String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public AchInstructionClientAccountInfo bankName(@javax.annotation.Nonnull String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
   */
  @javax.annotation.Nonnull
  public String getBankName() {
    return bankName;
  }

  public void setBankName(@javax.annotation.Nonnull String bankName) {
    this.bankName = bankName;
  }


  public AchInstructionClientAccountInfo bankAccountTypeCode(@javax.annotation.Nonnull BankAccountTypeCodeEnum bankAccountTypeCode) {
    this.bankAccountTypeCode = bankAccountTypeCode;
    return this;
  }

  /**
   * Get bankAccountTypeCode
   * @return bankAccountTypeCode
   */
  @javax.annotation.Nonnull
  public BankAccountTypeCodeEnum getBankAccountTypeCode() {
    return bankAccountTypeCode;
  }

  public void setBankAccountTypeCode(@javax.annotation.Nonnull BankAccountTypeCodeEnum bankAccountTypeCode) {
    this.bankAccountTypeCode = bankAccountTypeCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchInstructionClientAccountInfo achInstructionClientAccountInfo = (AchInstructionClientAccountInfo) o;
    return Objects.equals(this.bankRoutingNumber, achInstructionClientAccountInfo.bankRoutingNumber) &&
        Objects.equals(this.bankAccountNumber, achInstructionClientAccountInfo.bankAccountNumber) &&
        Objects.equals(this.bankName, achInstructionClientAccountInfo.bankName) &&
        Objects.equals(this.bankAccountTypeCode, achInstructionClientAccountInfo.bankAccountTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankRoutingNumber, bankAccountNumber, bankName, bankAccountTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchInstructionClientAccountInfo {\n");
    sb.append("    bankRoutingNumber: ").append(toIndentedString(bankRoutingNumber)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankAccountTypeCode: ").append(toIndentedString(bankAccountTypeCode)).append("\n");
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
    openapiFields.add("bankRoutingNumber");
    openapiFields.add("bankAccountNumber");
    openapiFields.add("bankName");
    openapiFields.add("bankAccountTypeCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bankRoutingNumber");
    openapiRequiredFields.add("bankAccountNumber");
    openapiRequiredFields.add("bankName");
    openapiRequiredFields.add("bankAccountTypeCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AchInstructionClientAccountInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AchInstructionClientAccountInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AchInstructionClientAccountInfo is not found in the empty JSON string", AchInstructionClientAccountInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AchInstructionClientAccountInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AchInstructionClientAccountInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AchInstructionClientAccountInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("bankRoutingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankRoutingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankRoutingNumber").toString()));
      }
      if (!jsonObj.get("bankAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankAccountNumber").toString()));
      }
      if (!jsonObj.get("bankName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankName").toString()));
      }
      // validate the required field `bankAccountTypeCode`
      BankAccountTypeCodeEnum.validateJsonElement(jsonObj.get("bankAccountTypeCode"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AchInstructionClientAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AchInstructionClientAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AchInstructionClientAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AchInstructionClientAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AchInstructionClientAccountInfo>() {
           @Override
           public void write(JsonWriter out, AchInstructionClientAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AchInstructionClientAccountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AchInstructionClientAccountInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AchInstructionClientAccountInfo
   * @throws IOException if the JSON string is invalid with respect to AchInstructionClientAccountInfo
   */
  public static AchInstructionClientAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AchInstructionClientAccountInfo.class);
  }

  /**
   * Convert an instance of AchInstructionClientAccountInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

