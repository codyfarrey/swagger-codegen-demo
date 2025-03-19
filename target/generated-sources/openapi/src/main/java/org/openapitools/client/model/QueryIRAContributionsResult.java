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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PollingInstructionResultError;
import org.openapitools.client.model.QueryIRAContributionsResultAllOfContributions;

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
 * QueryIRAContributionsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class QueryIRAContributionsResult {
  public static final String SERIALIZED_NAME_CLIENT_INSTRUCTION_ID = "clientInstructionId";
  @SerializedName(SERIALIZED_NAME_CLIENT_INSTRUCTION_ID)
  @javax.annotation.Nonnull
  private String clientInstructionId;

  /**
   * Gets or Sets instructionType
   */
  @JsonAdapter(InstructionTypeEnum.Adapter.class)
  public enum InstructionTypeEnum {
    ACCOUNT_CLOSE("ACCOUNT_CLOSE"),
    
    ACH_INSTRUCTION("ACH_INSTRUCTION"),
    
    APPLY_FEE_TEMPLATE("APPLY_FEE_TEMPLATE"),
    
    CANCEL_INSTRUCTION("CANCEL_INSTRUCTION"),
    
    COMPLEX_ASSET_TRANSFER("COMPLEX_ASSET_TRANSFER"),
    
    DELETE_BANK_INSTRUCTION("DELETE_BANK_INSTRUCTION"),
    
    DEPOSIT("DEPOSIT"),
    
    DWAC("DWAC"),
    
    EXTERNAL_POSITION_TRANSFER("EXTERNAL_POSITION_TRANSFER"),
    
    FOP("FOP"),
    
    QUERY_RECENT_INSTRUCTIONS("QUERY_RECENT_INSTRUCTIONS"),
    
    QUERY_WITHDAWABLE_FUNDS_INTERNAL_POSITION_TRANSFER("QUERY_WITHDAWABLE_FUNDS INTERNAL_POSITION_TRANSFER"),
    
    INTERNAL_CASH_TRANSFER("INTERNAL_CASH_TRANSFER"),
    
    MICRO_AMOUNT("MICRO_AMOUNT"),
    
    PREDEFINED_DESTINATION_INSTRUCTION_TRADITIONAL_BANK_INSTRUCTION_VERIFICATION("PREDEFINED_DESTINATION_INSTRUCTION TRADITIONAL_BANK_INSTRUCTION_VERIFICATION"),
    
    WITHDRAWAL("WITHDRAWAL");

    private String value;

    InstructionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstructionTypeEnum fromValue(String value) {
      for (InstructionTypeEnum b : InstructionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InstructionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstructionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstructionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstructionTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      InstructionTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INSTRUCTION_TYPE = "instructionType";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_TYPE)
  @javax.annotation.Nonnull
  private InstructionTypeEnum instructionType;

  /**
   * Gets or Sets instructionStatus
   */
  @JsonAdapter(InstructionStatusEnum.Adapter.class)
  public enum InstructionStatusEnum {
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    PROCESSED("PROCESSED");

    private String value;

    InstructionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstructionStatusEnum fromValue(String value) {
      for (InstructionStatusEnum b : InstructionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InstructionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstructionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstructionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstructionStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      InstructionStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INSTRUCTION_STATUS = "instructionStatus";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_STATUS)
  @javax.annotation.Nonnull
  private InstructionStatusEnum instructionStatus;

  public static final String SERIALIZED_NAME_INSTRUCTION_ID = "instructionId";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_ID)
  @javax.annotation.Nonnull
  private BigDecimal instructionId;

  public static final String SERIALIZED_NAME_IB_REFERENCE_ID = "ibReferenceId";
  @SerializedName(SERIALIZED_NAME_IB_REFERENCE_ID)
  @javax.annotation.Nullable
  private BigDecimal ibReferenceId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @javax.annotation.Nullable
  private PollingInstructionResultError error;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nonnull
  private String accountId;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  @javax.annotation.Nonnull
  private String year;

  public static final String SERIALIZED_NAME_IRA_TYPE = "iraType";
  @SerializedName(SERIALIZED_NAME_IRA_TYPE)
  @javax.annotation.Nonnull
  private String iraType;

  public static final String SERIALIZED_NAME_CONTRIBUTIONS = "contributions";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTIONS)
  @javax.annotation.Nonnull
  private List<QueryIRAContributionsResultAllOfContributions> contributions = new ArrayList<>();

  public QueryIRAContributionsResult() {
  }

  public QueryIRAContributionsResult clientInstructionId(@javax.annotation.Nonnull String clientInstructionId) {
    this.clientInstructionId = clientInstructionId;
    return this;
  }

  /**
   * Get clientInstructionId
   * @return clientInstructionId
   */
  @javax.annotation.Nonnull
  public String getClientInstructionId() {
    return clientInstructionId;
  }

  public void setClientInstructionId(@javax.annotation.Nonnull String clientInstructionId) {
    this.clientInstructionId = clientInstructionId;
  }


  public QueryIRAContributionsResult instructionType(@javax.annotation.Nonnull InstructionTypeEnum instructionType) {
    this.instructionType = instructionType;
    return this;
  }

  /**
   * Get instructionType
   * @return instructionType
   */
  @javax.annotation.Nonnull
  public InstructionTypeEnum getInstructionType() {
    return instructionType;
  }

  public void setInstructionType(@javax.annotation.Nonnull InstructionTypeEnum instructionType) {
    this.instructionType = instructionType;
  }


  public QueryIRAContributionsResult instructionStatus(@javax.annotation.Nonnull InstructionStatusEnum instructionStatus) {
    this.instructionStatus = instructionStatus;
    return this;
  }

  /**
   * Get instructionStatus
   * @return instructionStatus
   */
  @javax.annotation.Nonnull
  public InstructionStatusEnum getInstructionStatus() {
    return instructionStatus;
  }

  public void setInstructionStatus(@javax.annotation.Nonnull InstructionStatusEnum instructionStatus) {
    this.instructionStatus = instructionStatus;
  }


  public QueryIRAContributionsResult instructionId(@javax.annotation.Nonnull BigDecimal instructionId) {
    this.instructionId = instructionId;
    return this;
  }

  /**
   * Get instructionId
   * @return instructionId
   */
  @javax.annotation.Nonnull
  public BigDecimal getInstructionId() {
    return instructionId;
  }

  public void setInstructionId(@javax.annotation.Nonnull BigDecimal instructionId) {
    this.instructionId = instructionId;
  }


  public QueryIRAContributionsResult ibReferenceId(@javax.annotation.Nullable BigDecimal ibReferenceId) {
    this.ibReferenceId = ibReferenceId;
    return this;
  }

  /**
   * Get ibReferenceId
   * @return ibReferenceId
   */
  @javax.annotation.Nullable
  public BigDecimal getIbReferenceId() {
    return ibReferenceId;
  }

  public void setIbReferenceId(@javax.annotation.Nullable BigDecimal ibReferenceId) {
    this.ibReferenceId = ibReferenceId;
  }


  public QueryIRAContributionsResult description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public QueryIRAContributionsResult error(@javax.annotation.Nullable PollingInstructionResultError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public PollingInstructionResultError getError() {
    return error;
  }

  public void setError(@javax.annotation.Nullable PollingInstructionResultError error) {
    this.error = error;
  }


  public QueryIRAContributionsResult accountId(@javax.annotation.Nonnull String accountId) {
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


  public QueryIRAContributionsResult year(@javax.annotation.Nonnull String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  @javax.annotation.Nonnull
  public String getYear() {
    return year;
  }

  public void setYear(@javax.annotation.Nonnull String year) {
    this.year = year;
  }


  public QueryIRAContributionsResult iraType(@javax.annotation.Nonnull String iraType) {
    this.iraType = iraType;
    return this;
  }

  /**
   * Get iraType
   * @return iraType
   */
  @javax.annotation.Nonnull
  public String getIraType() {
    return iraType;
  }

  public void setIraType(@javax.annotation.Nonnull String iraType) {
    this.iraType = iraType;
  }


  public QueryIRAContributionsResult contributions(@javax.annotation.Nonnull List<QueryIRAContributionsResultAllOfContributions> contributions) {
    this.contributions = contributions;
    return this;
  }

  public QueryIRAContributionsResult addContributionsItem(QueryIRAContributionsResultAllOfContributions contributionsItem) {
    if (this.contributions == null) {
      this.contributions = new ArrayList<>();
    }
    this.contributions.add(contributionsItem);
    return this;
  }

  /**
   * Get contributions
   * @return contributions
   */
  @javax.annotation.Nonnull
  public List<QueryIRAContributionsResultAllOfContributions> getContributions() {
    return contributions;
  }

  public void setContributions(@javax.annotation.Nonnull List<QueryIRAContributionsResultAllOfContributions> contributions) {
    this.contributions = contributions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryIRAContributionsResult queryIRAContributionsResult = (QueryIRAContributionsResult) o;
    return Objects.equals(this.clientInstructionId, queryIRAContributionsResult.clientInstructionId) &&
        Objects.equals(this.instructionType, queryIRAContributionsResult.instructionType) &&
        Objects.equals(this.instructionStatus, queryIRAContributionsResult.instructionStatus) &&
        Objects.equals(this.instructionId, queryIRAContributionsResult.instructionId) &&
        Objects.equals(this.ibReferenceId, queryIRAContributionsResult.ibReferenceId) &&
        Objects.equals(this.description, queryIRAContributionsResult.description) &&
        Objects.equals(this.error, queryIRAContributionsResult.error) &&
        Objects.equals(this.accountId, queryIRAContributionsResult.accountId) &&
        Objects.equals(this.year, queryIRAContributionsResult.year) &&
        Objects.equals(this.iraType, queryIRAContributionsResult.iraType) &&
        Objects.equals(this.contributions, queryIRAContributionsResult.contributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientInstructionId, instructionType, instructionStatus, instructionId, ibReferenceId, description, error, accountId, year, iraType, contributions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryIRAContributionsResult {\n");
    sb.append("    clientInstructionId: ").append(toIndentedString(clientInstructionId)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    instructionStatus: ").append(toIndentedString(instructionStatus)).append("\n");
    sb.append("    instructionId: ").append(toIndentedString(instructionId)).append("\n");
    sb.append("    ibReferenceId: ").append(toIndentedString(ibReferenceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    iraType: ").append(toIndentedString(iraType)).append("\n");
    sb.append("    contributions: ").append(toIndentedString(contributions)).append("\n");
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
    openapiFields.add("instructionType");
    openapiFields.add("instructionStatus");
    openapiFields.add("instructionId");
    openapiFields.add("ibReferenceId");
    openapiFields.add("description");
    openapiFields.add("error");
    openapiFields.add("accountId");
    openapiFields.add("year");
    openapiFields.add("iraType");
    openapiFields.add("contributions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientInstructionId");
    openapiRequiredFields.add("instructionType");
    openapiRequiredFields.add("instructionStatus");
    openapiRequiredFields.add("instructionId");
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("year");
    openapiRequiredFields.add("iraType");
    openapiRequiredFields.add("contributions");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueryIRAContributionsResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryIRAContributionsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryIRAContributionsResult is not found in the empty JSON string", QueryIRAContributionsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryIRAContributionsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryIRAContributionsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryIRAContributionsResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("clientInstructionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientInstructionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientInstructionId").toString()));
      }
      if (!jsonObj.get("instructionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructionType").toString()));
      }
      // validate the required field `instructionType`
      InstructionTypeEnum.validateJsonElement(jsonObj.get("instructionType"));
      if (!jsonObj.get("instructionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructionStatus").toString()));
      }
      // validate the required field `instructionStatus`
      InstructionStatusEnum.validateJsonElement(jsonObj.get("instructionStatus"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        PollingInstructionResultError.validateJsonElement(jsonObj.get("error"));
      }
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if (!jsonObj.get("year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year").toString()));
      }
      if (!jsonObj.get("iraType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iraType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iraType").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("contributions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contributions` to be an array in the JSON string but got `%s`", jsonObj.get("contributions").toString()));
      }

      JsonArray jsonArraycontributions = jsonObj.getAsJsonArray("contributions");
      // validate the required field `contributions` (array)
      for (int i = 0; i < jsonArraycontributions.size(); i++) {
        QueryIRAContributionsResultAllOfContributions.validateJsonElement(jsonArraycontributions.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryIRAContributionsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryIRAContributionsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryIRAContributionsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryIRAContributionsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryIRAContributionsResult>() {
           @Override
           public void write(JsonWriter out, QueryIRAContributionsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryIRAContributionsResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueryIRAContributionsResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueryIRAContributionsResult
   * @throws IOException if the JSON string is invalid with respect to QueryIRAContributionsResult
   */
  public static QueryIRAContributionsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryIRAContributionsResult.class);
  }

  /**
   * Convert an instance of QueryIRAContributionsResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

