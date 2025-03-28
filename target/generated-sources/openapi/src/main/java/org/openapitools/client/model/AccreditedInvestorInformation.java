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
 * AccreditedInvestorInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AccreditedInvestorInformation {
  public static final String SERIALIZED_NAME_Q1 = "q1";
  @SerializedName(SERIALIZED_NAME_Q1)
  @javax.annotation.Nullable
  private Boolean q1;

  public static final String SERIALIZED_NAME_Q2 = "q2";
  @SerializedName(SERIALIZED_NAME_Q2)
  @javax.annotation.Nullable
  private Boolean q2;

  public static final String SERIALIZED_NAME_Q3 = "q3";
  @SerializedName(SERIALIZED_NAME_Q3)
  @javax.annotation.Nullable
  private Boolean q3;

  public static final String SERIALIZED_NAME_Q4 = "q4";
  @SerializedName(SERIALIZED_NAME_Q4)
  @javax.annotation.Nullable
  private Boolean q4;

  public static final String SERIALIZED_NAME_Q5 = "q5";
  @SerializedName(SERIALIZED_NAME_Q5)
  @javax.annotation.Nullable
  private Boolean q5;

  public AccreditedInvestorInformation() {
  }

  public AccreditedInvestorInformation q1(@javax.annotation.Nullable Boolean q1) {
    this.q1 = q1;
    return this;
  }

  /**
   * Get q1
   * @return q1
   */
  @javax.annotation.Nullable
  public Boolean getQ1() {
    return q1;
  }

  public void setQ1(@javax.annotation.Nullable Boolean q1) {
    this.q1 = q1;
  }


  public AccreditedInvestorInformation q2(@javax.annotation.Nullable Boolean q2) {
    this.q2 = q2;
    return this;
  }

  /**
   * Get q2
   * @return q2
   */
  @javax.annotation.Nullable
  public Boolean getQ2() {
    return q2;
  }

  public void setQ2(@javax.annotation.Nullable Boolean q2) {
    this.q2 = q2;
  }


  public AccreditedInvestorInformation q3(@javax.annotation.Nullable Boolean q3) {
    this.q3 = q3;
    return this;
  }

  /**
   * Get q3
   * @return q3
   */
  @javax.annotation.Nullable
  public Boolean getQ3() {
    return q3;
  }

  public void setQ3(@javax.annotation.Nullable Boolean q3) {
    this.q3 = q3;
  }


  public AccreditedInvestorInformation q4(@javax.annotation.Nullable Boolean q4) {
    this.q4 = q4;
    return this;
  }

  /**
   * Get q4
   * @return q4
   */
  @javax.annotation.Nullable
  public Boolean getQ4() {
    return q4;
  }

  public void setQ4(@javax.annotation.Nullable Boolean q4) {
    this.q4 = q4;
  }


  public AccreditedInvestorInformation q5(@javax.annotation.Nullable Boolean q5) {
    this.q5 = q5;
    return this;
  }

  /**
   * Get q5
   * @return q5
   */
  @javax.annotation.Nullable
  public Boolean getQ5() {
    return q5;
  }

  public void setQ5(@javax.annotation.Nullable Boolean q5) {
    this.q5 = q5;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccreditedInvestorInformation accreditedInvestorInformation = (AccreditedInvestorInformation) o;
    return Objects.equals(this.q1, accreditedInvestorInformation.q1) &&
        Objects.equals(this.q2, accreditedInvestorInformation.q2) &&
        Objects.equals(this.q3, accreditedInvestorInformation.q3) &&
        Objects.equals(this.q4, accreditedInvestorInformation.q4) &&
        Objects.equals(this.q5, accreditedInvestorInformation.q5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(q1, q2, q3, q4, q5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccreditedInvestorInformation {\n");
    sb.append("    q1: ").append(toIndentedString(q1)).append("\n");
    sb.append("    q2: ").append(toIndentedString(q2)).append("\n");
    sb.append("    q3: ").append(toIndentedString(q3)).append("\n");
    sb.append("    q4: ").append(toIndentedString(q4)).append("\n");
    sb.append("    q5: ").append(toIndentedString(q5)).append("\n");
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
    openapiFields.add("q1");
    openapiFields.add("q2");
    openapiFields.add("q3");
    openapiFields.add("q4");
    openapiFields.add("q5");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccreditedInvestorInformation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccreditedInvestorInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccreditedInvestorInformation is not found in the empty JSON string", AccreditedInvestorInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccreditedInvestorInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccreditedInvestorInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccreditedInvestorInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccreditedInvestorInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccreditedInvestorInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccreditedInvestorInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<AccreditedInvestorInformation>() {
           @Override
           public void write(JsonWriter out, AccreditedInvestorInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccreditedInvestorInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccreditedInvestorInformation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccreditedInvestorInformation
   * @throws IOException if the JSON string is invalid with respect to AccreditedInvestorInformation
   */
  public static AccreditedInvestorInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccreditedInvestorInformation.class);
  }

  /**
   * Convert an instance of AccreditedInvestorInformation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

