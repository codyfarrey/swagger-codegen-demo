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
 * QueryRecentRecurringEvents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class QueryRecentRecurringEvents {
  public static final String SERIALIZED_NAME_CLIENT_INSTRUCTION_ID = "clientInstructionId";
  @SerializedName(SERIALIZED_NAME_CLIENT_INSTRUCTION_ID)
  @javax.annotation.Nonnull
  private BigDecimal clientInstructionId;

  public static final String SERIALIZED_NAME_IB_REFERENCE_ID = "ibReferenceId";
  @SerializedName(SERIALIZED_NAME_IB_REFERENCE_ID)
  @javax.annotation.Nonnull
  private String ibReferenceId;

  public static final String SERIALIZED_NAME_NUMBER_OF_TRANSACTIONS = "numberOfTransactions";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_TRANSACTIONS)
  @javax.annotation.Nullable
  private BigDecimal numberOfTransactions;

  public QueryRecentRecurringEvents() {
  }

  public QueryRecentRecurringEvents clientInstructionId(@javax.annotation.Nonnull BigDecimal clientInstructionId) {
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


  public QueryRecentRecurringEvents ibReferenceId(@javax.annotation.Nonnull String ibReferenceId) {
    this.ibReferenceId = ibReferenceId;
    return this;
  }

  /**
   * Get ibReferenceId
   * @return ibReferenceId
   */
  @javax.annotation.Nonnull
  public String getIbReferenceId() {
    return ibReferenceId;
  }

  public void setIbReferenceId(@javax.annotation.Nonnull String ibReferenceId) {
    this.ibReferenceId = ibReferenceId;
  }


  public QueryRecentRecurringEvents numberOfTransactions(@javax.annotation.Nullable BigDecimal numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
    return this;
  }

  /**
   * Get numberOfTransactions
   * @return numberOfTransactions
   */
  @javax.annotation.Nullable
  public BigDecimal getNumberOfTransactions() {
    return numberOfTransactions;
  }

  public void setNumberOfTransactions(@javax.annotation.Nullable BigDecimal numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRecentRecurringEvents queryRecentRecurringEvents = (QueryRecentRecurringEvents) o;
    return Objects.equals(this.clientInstructionId, queryRecentRecurringEvents.clientInstructionId) &&
        Objects.equals(this.ibReferenceId, queryRecentRecurringEvents.ibReferenceId) &&
        Objects.equals(this.numberOfTransactions, queryRecentRecurringEvents.numberOfTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientInstructionId, ibReferenceId, numberOfTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRecentRecurringEvents {\n");
    sb.append("    clientInstructionId: ").append(toIndentedString(clientInstructionId)).append("\n");
    sb.append("    ibReferenceId: ").append(toIndentedString(ibReferenceId)).append("\n");
    sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
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
    openapiFields.add("ibReferenceId");
    openapiFields.add("numberOfTransactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientInstructionId");
    openapiRequiredFields.add("ibReferenceId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueryRecentRecurringEvents
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryRecentRecurringEvents.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryRecentRecurringEvents is not found in the empty JSON string", QueryRecentRecurringEvents.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryRecentRecurringEvents.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryRecentRecurringEvents` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryRecentRecurringEvents.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ibReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ibReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ibReferenceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryRecentRecurringEvents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryRecentRecurringEvents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryRecentRecurringEvents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryRecentRecurringEvents.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryRecentRecurringEvents>() {
           @Override
           public void write(JsonWriter out, QueryRecentRecurringEvents value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryRecentRecurringEvents read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueryRecentRecurringEvents given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueryRecentRecurringEvents
   * @throws IOException if the JSON string is invalid with respect to QueryRecentRecurringEvents
   */
  public static QueryRecentRecurringEvents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryRecentRecurringEvents.class);
  }

  /**
   * Convert an instance of QueryRecentRecurringEvents to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

