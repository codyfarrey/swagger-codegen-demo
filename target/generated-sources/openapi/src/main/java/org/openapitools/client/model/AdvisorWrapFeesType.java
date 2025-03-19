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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AutomatedWrapFeeDetailsType;
import org.openapitools.client.model.HighWaterMarkType;

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
 * AdvisorWrapFeesType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AdvisorWrapFeesType {
  public static final String SERIALIZED_NAME_AUTOMATED_FEES_DETAILS = "automatedFeesDetails";
  @SerializedName(SERIALIZED_NAME_AUTOMATED_FEES_DETAILS)
  @javax.annotation.Nullable
  private List<AutomatedWrapFeeDetailsType> automatedFeesDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_HIGH_WATER_MARK_CONFIG_HWMA = "highWaterMarkConfigHwma";
  @SerializedName(SERIALIZED_NAME_HIGH_WATER_MARK_CONFIG_HWMA)
  @javax.annotation.Nullable
  private HighWaterMarkType highWaterMarkConfigHwma;

  public static final String SERIALIZED_NAME_HIGH_WATER_MARK_CONFIG_HWMQ = "highWaterMarkConfigHwmq";
  @SerializedName(SERIALIZED_NAME_HIGH_WATER_MARK_CONFIG_HWMQ)
  @javax.annotation.Nullable
  private HighWaterMarkType highWaterMarkConfigHwmq;

  /**
   * Gets or Sets strategy
   */
  @JsonAdapter(StrategyEnum.Adapter.class)
  public enum StrategyEnum {
    AUTOMATED("AUTOMATED"),
    
    DIRECTBILLING("DIRECTBILLING"),
    
    NO_FEE("NO_FEE");

    private String value;

    StrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StrategyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StrategyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  @javax.annotation.Nullable
  private StrategyEnum strategy;

  public static final String SERIALIZED_NAME_CHARGE_ADVISOR = "chargeAdvisor";
  @SerializedName(SERIALIZED_NAME_CHARGE_ADVISOR)
  @javax.annotation.Nullable
  private Boolean chargeAdvisor;

  public static final String SERIALIZED_NAME_CHARGE_OTHER_FEES_TO_ADVISOR = "chargeOtherFeesToAdvisor";
  @SerializedName(SERIALIZED_NAME_CHARGE_OTHER_FEES_TO_ADVISOR)
  @javax.annotation.Nullable
  private Boolean chargeOtherFeesToAdvisor;

  public AdvisorWrapFeesType() {
  }

  public AdvisorWrapFeesType automatedFeesDetails(@javax.annotation.Nullable List<AutomatedWrapFeeDetailsType> automatedFeesDetails) {
    this.automatedFeesDetails = automatedFeesDetails;
    return this;
  }

  public AdvisorWrapFeesType addAutomatedFeesDetailsItem(AutomatedWrapFeeDetailsType automatedFeesDetailsItem) {
    if (this.automatedFeesDetails == null) {
      this.automatedFeesDetails = new ArrayList<>();
    }
    this.automatedFeesDetails.add(automatedFeesDetailsItem);
    return this;
  }

  /**
   * Get automatedFeesDetails
   * @return automatedFeesDetails
   */
  @javax.annotation.Nullable
  public List<AutomatedWrapFeeDetailsType> getAutomatedFeesDetails() {
    return automatedFeesDetails;
  }

  public void setAutomatedFeesDetails(@javax.annotation.Nullable List<AutomatedWrapFeeDetailsType> automatedFeesDetails) {
    this.automatedFeesDetails = automatedFeesDetails;
  }


  public AdvisorWrapFeesType highWaterMarkConfigHwma(@javax.annotation.Nullable HighWaterMarkType highWaterMarkConfigHwma) {
    this.highWaterMarkConfigHwma = highWaterMarkConfigHwma;
    return this;
  }

  /**
   * Get highWaterMarkConfigHwma
   * @return highWaterMarkConfigHwma
   */
  @javax.annotation.Nullable
  public HighWaterMarkType getHighWaterMarkConfigHwma() {
    return highWaterMarkConfigHwma;
  }

  public void setHighWaterMarkConfigHwma(@javax.annotation.Nullable HighWaterMarkType highWaterMarkConfigHwma) {
    this.highWaterMarkConfigHwma = highWaterMarkConfigHwma;
  }


  public AdvisorWrapFeesType highWaterMarkConfigHwmq(@javax.annotation.Nullable HighWaterMarkType highWaterMarkConfigHwmq) {
    this.highWaterMarkConfigHwmq = highWaterMarkConfigHwmq;
    return this;
  }

  /**
   * Get highWaterMarkConfigHwmq
   * @return highWaterMarkConfigHwmq
   */
  @javax.annotation.Nullable
  public HighWaterMarkType getHighWaterMarkConfigHwmq() {
    return highWaterMarkConfigHwmq;
  }

  public void setHighWaterMarkConfigHwmq(@javax.annotation.Nullable HighWaterMarkType highWaterMarkConfigHwmq) {
    this.highWaterMarkConfigHwmq = highWaterMarkConfigHwmq;
  }


  public AdvisorWrapFeesType strategy(@javax.annotation.Nullable StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
   */
  @javax.annotation.Nullable
  public StrategyEnum getStrategy() {
    return strategy;
  }

  public void setStrategy(@javax.annotation.Nullable StrategyEnum strategy) {
    this.strategy = strategy;
  }


  public AdvisorWrapFeesType chargeAdvisor(@javax.annotation.Nullable Boolean chargeAdvisor) {
    this.chargeAdvisor = chargeAdvisor;
    return this;
  }

  /**
   * Get chargeAdvisor
   * @return chargeAdvisor
   */
  @javax.annotation.Nullable
  public Boolean getChargeAdvisor() {
    return chargeAdvisor;
  }

  public void setChargeAdvisor(@javax.annotation.Nullable Boolean chargeAdvisor) {
    this.chargeAdvisor = chargeAdvisor;
  }


  public AdvisorWrapFeesType chargeOtherFeesToAdvisor(@javax.annotation.Nullable Boolean chargeOtherFeesToAdvisor) {
    this.chargeOtherFeesToAdvisor = chargeOtherFeesToAdvisor;
    return this;
  }

  /**
   * Get chargeOtherFeesToAdvisor
   * @return chargeOtherFeesToAdvisor
   */
  @javax.annotation.Nullable
  public Boolean getChargeOtherFeesToAdvisor() {
    return chargeOtherFeesToAdvisor;
  }

  public void setChargeOtherFeesToAdvisor(@javax.annotation.Nullable Boolean chargeOtherFeesToAdvisor) {
    this.chargeOtherFeesToAdvisor = chargeOtherFeesToAdvisor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvisorWrapFeesType advisorWrapFeesType = (AdvisorWrapFeesType) o;
    return Objects.equals(this.automatedFeesDetails, advisorWrapFeesType.automatedFeesDetails) &&
        Objects.equals(this.highWaterMarkConfigHwma, advisorWrapFeesType.highWaterMarkConfigHwma) &&
        Objects.equals(this.highWaterMarkConfigHwmq, advisorWrapFeesType.highWaterMarkConfigHwmq) &&
        Objects.equals(this.strategy, advisorWrapFeesType.strategy) &&
        Objects.equals(this.chargeAdvisor, advisorWrapFeesType.chargeAdvisor) &&
        Objects.equals(this.chargeOtherFeesToAdvisor, advisorWrapFeesType.chargeOtherFeesToAdvisor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automatedFeesDetails, highWaterMarkConfigHwma, highWaterMarkConfigHwmq, strategy, chargeAdvisor, chargeOtherFeesToAdvisor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvisorWrapFeesType {\n");
    sb.append("    automatedFeesDetails: ").append(toIndentedString(automatedFeesDetails)).append("\n");
    sb.append("    highWaterMarkConfigHwma: ").append(toIndentedString(highWaterMarkConfigHwma)).append("\n");
    sb.append("    highWaterMarkConfigHwmq: ").append(toIndentedString(highWaterMarkConfigHwmq)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    chargeAdvisor: ").append(toIndentedString(chargeAdvisor)).append("\n");
    sb.append("    chargeOtherFeesToAdvisor: ").append(toIndentedString(chargeOtherFeesToAdvisor)).append("\n");
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
    openapiFields.add("automatedFeesDetails");
    openapiFields.add("highWaterMarkConfigHwma");
    openapiFields.add("highWaterMarkConfigHwmq");
    openapiFields.add("strategy");
    openapiFields.add("chargeAdvisor");
    openapiFields.add("chargeOtherFeesToAdvisor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdvisorWrapFeesType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdvisorWrapFeesType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdvisorWrapFeesType is not found in the empty JSON string", AdvisorWrapFeesType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdvisorWrapFeesType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdvisorWrapFeesType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("automatedFeesDetails") != null && !jsonObj.get("automatedFeesDetails").isJsonNull()) {
        JsonArray jsonArrayautomatedFeesDetails = jsonObj.getAsJsonArray("automatedFeesDetails");
        if (jsonArrayautomatedFeesDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("automatedFeesDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `automatedFeesDetails` to be an array in the JSON string but got `%s`", jsonObj.get("automatedFeesDetails").toString()));
          }

          // validate the optional field `automatedFeesDetails` (array)
          for (int i = 0; i < jsonArrayautomatedFeesDetails.size(); i++) {
            AutomatedWrapFeeDetailsType.validateJsonElement(jsonArrayautomatedFeesDetails.get(i));
          };
        }
      }
      // validate the optional field `highWaterMarkConfigHwma`
      if (jsonObj.get("highWaterMarkConfigHwma") != null && !jsonObj.get("highWaterMarkConfigHwma").isJsonNull()) {
        HighWaterMarkType.validateJsonElement(jsonObj.get("highWaterMarkConfigHwma"));
      }
      // validate the optional field `highWaterMarkConfigHwmq`
      if (jsonObj.get("highWaterMarkConfigHwmq") != null && !jsonObj.get("highWaterMarkConfigHwmq").isJsonNull()) {
        HighWaterMarkType.validateJsonElement(jsonObj.get("highWaterMarkConfigHwmq"));
      }
      if ((jsonObj.get("strategy") != null && !jsonObj.get("strategy").isJsonNull()) && !jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
      // validate the optional field `strategy`
      if (jsonObj.get("strategy") != null && !jsonObj.get("strategy").isJsonNull()) {
        StrategyEnum.validateJsonElement(jsonObj.get("strategy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvisorWrapFeesType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvisorWrapFeesType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvisorWrapFeesType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvisorWrapFeesType.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvisorWrapFeesType>() {
           @Override
           public void write(JsonWriter out, AdvisorWrapFeesType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvisorWrapFeesType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdvisorWrapFeesType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdvisorWrapFeesType
   * @throws IOException if the JSON string is invalid with respect to AdvisorWrapFeesType
   */
  public static AdvisorWrapFeesType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvisorWrapFeesType.class);
  }

  /**
   * Convert an instance of AdvisorWrapFeesType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

