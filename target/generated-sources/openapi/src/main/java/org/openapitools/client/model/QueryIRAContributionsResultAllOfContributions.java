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
 * QueryIRAContributionsResultAllOfContributions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class QueryIRAContributionsResultAllOfContributions {
  public static final String SERIALIZED_NAME_MAXIMUM_CONTRIBUTION_LIMIT = "maximumContributionLimit";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_CONTRIBUTION_LIMIT)
  @javax.annotation.Nonnull
  private BigDecimal maximumContributionLimit;

  public static final String SERIALIZED_NAME_YEAR_TO_DATE_CONTRIBUTION = "yearToDateContribution";
  @SerializedName(SERIALIZED_NAME_YEAR_TO_DATE_CONTRIBUTION)
  @javax.annotation.Nonnull
  private BigDecimal yearToDateContribution;

  public static final String SERIALIZED_NAME_ALLOWED_CONTRIBUTION_LIMIT = "allowedContributionLimit";
  @SerializedName(SERIALIZED_NAME_ALLOWED_CONTRIBUTION_LIMIT)
  @javax.annotation.Nonnull
  private BigDecimal allowedContributionLimit;

  public QueryIRAContributionsResultAllOfContributions() {
  }

  public QueryIRAContributionsResultAllOfContributions maximumContributionLimit(@javax.annotation.Nonnull BigDecimal maximumContributionLimit) {
    this.maximumContributionLimit = maximumContributionLimit;
    return this;
  }

  /**
   * Get maximumContributionLimit
   * @return maximumContributionLimit
   */
  @javax.annotation.Nonnull
  public BigDecimal getMaximumContributionLimit() {
    return maximumContributionLimit;
  }

  public void setMaximumContributionLimit(@javax.annotation.Nonnull BigDecimal maximumContributionLimit) {
    this.maximumContributionLimit = maximumContributionLimit;
  }


  public QueryIRAContributionsResultAllOfContributions yearToDateContribution(@javax.annotation.Nonnull BigDecimal yearToDateContribution) {
    this.yearToDateContribution = yearToDateContribution;
    return this;
  }

  /**
   * Get yearToDateContribution
   * @return yearToDateContribution
   */
  @javax.annotation.Nonnull
  public BigDecimal getYearToDateContribution() {
    return yearToDateContribution;
  }

  public void setYearToDateContribution(@javax.annotation.Nonnull BigDecimal yearToDateContribution) {
    this.yearToDateContribution = yearToDateContribution;
  }


  public QueryIRAContributionsResultAllOfContributions allowedContributionLimit(@javax.annotation.Nonnull BigDecimal allowedContributionLimit) {
    this.allowedContributionLimit = allowedContributionLimit;
    return this;
  }

  /**
   * Get allowedContributionLimit
   * @return allowedContributionLimit
   */
  @javax.annotation.Nonnull
  public BigDecimal getAllowedContributionLimit() {
    return allowedContributionLimit;
  }

  public void setAllowedContributionLimit(@javax.annotation.Nonnull BigDecimal allowedContributionLimit) {
    this.allowedContributionLimit = allowedContributionLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryIRAContributionsResultAllOfContributions queryIRAContributionsResultAllOfContributions = (QueryIRAContributionsResultAllOfContributions) o;
    return Objects.equals(this.maximumContributionLimit, queryIRAContributionsResultAllOfContributions.maximumContributionLimit) &&
        Objects.equals(this.yearToDateContribution, queryIRAContributionsResultAllOfContributions.yearToDateContribution) &&
        Objects.equals(this.allowedContributionLimit, queryIRAContributionsResultAllOfContributions.allowedContributionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumContributionLimit, yearToDateContribution, allowedContributionLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryIRAContributionsResultAllOfContributions {\n");
    sb.append("    maximumContributionLimit: ").append(toIndentedString(maximumContributionLimit)).append("\n");
    sb.append("    yearToDateContribution: ").append(toIndentedString(yearToDateContribution)).append("\n");
    sb.append("    allowedContributionLimit: ").append(toIndentedString(allowedContributionLimit)).append("\n");
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
    openapiFields.add("maximumContributionLimit");
    openapiFields.add("yearToDateContribution");
    openapiFields.add("allowedContributionLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maximumContributionLimit");
    openapiRequiredFields.add("yearToDateContribution");
    openapiRequiredFields.add("allowedContributionLimit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueryIRAContributionsResultAllOfContributions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryIRAContributionsResultAllOfContributions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryIRAContributionsResultAllOfContributions is not found in the empty JSON string", QueryIRAContributionsResultAllOfContributions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryIRAContributionsResultAllOfContributions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryIRAContributionsResultAllOfContributions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryIRAContributionsResultAllOfContributions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryIRAContributionsResultAllOfContributions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryIRAContributionsResultAllOfContributions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryIRAContributionsResultAllOfContributions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryIRAContributionsResultAllOfContributions.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryIRAContributionsResultAllOfContributions>() {
           @Override
           public void write(JsonWriter out, QueryIRAContributionsResultAllOfContributions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryIRAContributionsResultAllOfContributions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueryIRAContributionsResultAllOfContributions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueryIRAContributionsResultAllOfContributions
   * @throws IOException if the JSON string is invalid with respect to QueryIRAContributionsResultAllOfContributions
   */
  public static QueryIRAContributionsResultAllOfContributions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryIRAContributionsResultAllOfContributions.class);
  }

  /**
   * Convert an instance of QueryIRAContributionsResultAllOfContributions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

