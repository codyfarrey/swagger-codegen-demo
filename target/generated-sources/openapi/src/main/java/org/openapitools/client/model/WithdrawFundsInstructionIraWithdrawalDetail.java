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
 * WithdrawFundsInstructionIraWithdrawalDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class WithdrawFundsInstructionIraWithdrawalDetail {
  public static final String SERIALIZED_NAME_FED_INCOME_TAX_PERCENTAGE = "fedIncomeTaxPercentage";
  @SerializedName(SERIALIZED_NAME_FED_INCOME_TAX_PERCENTAGE)
  @javax.annotation.Nullable
  private BigDecimal fedIncomeTaxPercentage;

  public static final String SERIALIZED_NAME_STATE_INCOME_TAX_PERCENTAGE = "stateIncomeTaxPercentage";
  @SerializedName(SERIALIZED_NAME_STATE_INCOME_TAX_PERCENTAGE)
  @javax.annotation.Nullable
  private BigDecimal stateIncomeTaxPercentage;

  public static final String SERIALIZED_NAME_STATE_CD = "stateCd";
  @SerializedName(SERIALIZED_NAME_STATE_CD)
  @javax.annotation.Nullable
  private String stateCd;

  /**
   * Gets or Sets iraWithholdType
   */
  @JsonAdapter(IraWithholdTypeEnum.Adapter.class)
  public enum IraWithholdTypeEnum {
    DIRECT_ROLLOVER("DIRECT_ROLLOVER"),
    
    ROTH_DISTRIBUTION("ROTH_DISTRIBUTION"),
    
    NORMAL("NORMAL"),
    
    EARLY("EARLY"),
    
    DEATH("DEATH"),
    
    EXCESS_CY("EXCESS_CY"),
    
    EXCESS_PY("EXCESS_PY"),
    
    EXCESS_SC("EXCESS_SC");

    private String value;

    IraWithholdTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IraWithholdTypeEnum fromValue(String value) {
      for (IraWithholdTypeEnum b : IraWithholdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IraWithholdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IraWithholdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IraWithholdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IraWithholdTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IraWithholdTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IRA_WITHHOLD_TYPE = "iraWithholdType";
  @SerializedName(SERIALIZED_NAME_IRA_WITHHOLD_TYPE)
  @javax.annotation.Nullable
  private IraWithholdTypeEnum iraWithholdType;

  public WithdrawFundsInstructionIraWithdrawalDetail() {
  }

  public WithdrawFundsInstructionIraWithdrawalDetail fedIncomeTaxPercentage(@javax.annotation.Nullable BigDecimal fedIncomeTaxPercentage) {
    this.fedIncomeTaxPercentage = fedIncomeTaxPercentage;
    return this;
  }

  /**
   * Get fedIncomeTaxPercentage
   * minimum: 0
   * @return fedIncomeTaxPercentage
   */
  @javax.annotation.Nullable
  public BigDecimal getFedIncomeTaxPercentage() {
    return fedIncomeTaxPercentage;
  }

  public void setFedIncomeTaxPercentage(@javax.annotation.Nullable BigDecimal fedIncomeTaxPercentage) {
    this.fedIncomeTaxPercentage = fedIncomeTaxPercentage;
  }


  public WithdrawFundsInstructionIraWithdrawalDetail stateIncomeTaxPercentage(@javax.annotation.Nullable BigDecimal stateIncomeTaxPercentage) {
    this.stateIncomeTaxPercentage = stateIncomeTaxPercentage;
    return this;
  }

  /**
   * Get stateIncomeTaxPercentage
   * minimum: 0
   * @return stateIncomeTaxPercentage
   */
  @javax.annotation.Nullable
  public BigDecimal getStateIncomeTaxPercentage() {
    return stateIncomeTaxPercentage;
  }

  public void setStateIncomeTaxPercentage(@javax.annotation.Nullable BigDecimal stateIncomeTaxPercentage) {
    this.stateIncomeTaxPercentage = stateIncomeTaxPercentage;
  }


  public WithdrawFundsInstructionIraWithdrawalDetail stateCd(@javax.annotation.Nullable String stateCd) {
    this.stateCd = stateCd;
    return this;
  }

  /**
   * Get stateCd
   * @return stateCd
   */
  @javax.annotation.Nullable
  public String getStateCd() {
    return stateCd;
  }

  public void setStateCd(@javax.annotation.Nullable String stateCd) {
    this.stateCd = stateCd;
  }


  public WithdrawFundsInstructionIraWithdrawalDetail iraWithholdType(@javax.annotation.Nullable IraWithholdTypeEnum iraWithholdType) {
    this.iraWithholdType = iraWithholdType;
    return this;
  }

  /**
   * Get iraWithholdType
   * @return iraWithholdType
   */
  @javax.annotation.Nullable
  public IraWithholdTypeEnum getIraWithholdType() {
    return iraWithholdType;
  }

  public void setIraWithholdType(@javax.annotation.Nullable IraWithholdTypeEnum iraWithholdType) {
    this.iraWithholdType = iraWithholdType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawFundsInstructionIraWithdrawalDetail withdrawFundsInstructionIraWithdrawalDetail = (WithdrawFundsInstructionIraWithdrawalDetail) o;
    return Objects.equals(this.fedIncomeTaxPercentage, withdrawFundsInstructionIraWithdrawalDetail.fedIncomeTaxPercentage) &&
        Objects.equals(this.stateIncomeTaxPercentage, withdrawFundsInstructionIraWithdrawalDetail.stateIncomeTaxPercentage) &&
        Objects.equals(this.stateCd, withdrawFundsInstructionIraWithdrawalDetail.stateCd) &&
        Objects.equals(this.iraWithholdType, withdrawFundsInstructionIraWithdrawalDetail.iraWithholdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fedIncomeTaxPercentage, stateIncomeTaxPercentage, stateCd, iraWithholdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawFundsInstructionIraWithdrawalDetail {\n");
    sb.append("    fedIncomeTaxPercentage: ").append(toIndentedString(fedIncomeTaxPercentage)).append("\n");
    sb.append("    stateIncomeTaxPercentage: ").append(toIndentedString(stateIncomeTaxPercentage)).append("\n");
    sb.append("    stateCd: ").append(toIndentedString(stateCd)).append("\n");
    sb.append("    iraWithholdType: ").append(toIndentedString(iraWithholdType)).append("\n");
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
    openapiFields.add("fedIncomeTaxPercentage");
    openapiFields.add("stateIncomeTaxPercentage");
    openapiFields.add("stateCd");
    openapiFields.add("iraWithholdType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WithdrawFundsInstructionIraWithdrawalDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WithdrawFundsInstructionIraWithdrawalDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WithdrawFundsInstructionIraWithdrawalDetail is not found in the empty JSON string", WithdrawFundsInstructionIraWithdrawalDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WithdrawFundsInstructionIraWithdrawalDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WithdrawFundsInstructionIraWithdrawalDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stateCd") != null && !jsonObj.get("stateCd").isJsonNull()) && !jsonObj.get("stateCd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateCd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateCd").toString()));
      }
      if ((jsonObj.get("iraWithholdType") != null && !jsonObj.get("iraWithholdType").isJsonNull()) && !jsonObj.get("iraWithholdType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iraWithholdType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iraWithholdType").toString()));
      }
      // validate the optional field `iraWithholdType`
      if (jsonObj.get("iraWithholdType") != null && !jsonObj.get("iraWithholdType").isJsonNull()) {
        IraWithholdTypeEnum.validateJsonElement(jsonObj.get("iraWithholdType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WithdrawFundsInstructionIraWithdrawalDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WithdrawFundsInstructionIraWithdrawalDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WithdrawFundsInstructionIraWithdrawalDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WithdrawFundsInstructionIraWithdrawalDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<WithdrawFundsInstructionIraWithdrawalDetail>() {
           @Override
           public void write(JsonWriter out, WithdrawFundsInstructionIraWithdrawalDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WithdrawFundsInstructionIraWithdrawalDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WithdrawFundsInstructionIraWithdrawalDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WithdrawFundsInstructionIraWithdrawalDetail
   * @throws IOException if the JSON string is invalid with respect to WithdrawFundsInstructionIraWithdrawalDetail
   */
  public static WithdrawFundsInstructionIraWithdrawalDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WithdrawFundsInstructionIraWithdrawalDetail.class);
  }

  /**
   * Convert an instance of WithdrawFundsInstructionIraWithdrawalDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

