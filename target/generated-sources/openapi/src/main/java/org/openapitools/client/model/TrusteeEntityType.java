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
import org.openapitools.client.model.Individual;
import org.openapitools.client.model.LegalEntity;

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
 * TrusteeEntityType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class TrusteeEntityType {
  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legalEntity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  @javax.annotation.Nullable
  private LegalEntity legalEntity;

  public static final String SERIALIZED_NAME_EMPLOYEES = "employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  @javax.annotation.Nullable
  private List<Individual> employees = new ArrayList<>();

  public TrusteeEntityType() {
  }

  public TrusteeEntityType legalEntity(@javax.annotation.Nullable LegalEntity legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
   */
  @javax.annotation.Nullable
  public LegalEntity getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(@javax.annotation.Nullable LegalEntity legalEntity) {
    this.legalEntity = legalEntity;
  }


  public TrusteeEntityType employees(@javax.annotation.Nullable List<Individual> employees) {
    this.employees = employees;
    return this;
  }

  public TrusteeEntityType addEmployeesItem(Individual employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * Get employees
   * @return employees
   */
  @javax.annotation.Nullable
  public List<Individual> getEmployees() {
    return employees;
  }

  public void setEmployees(@javax.annotation.Nullable List<Individual> employees) {
    this.employees = employees;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrusteeEntityType trusteeEntityType = (TrusteeEntityType) o;
    return Objects.equals(this.legalEntity, trusteeEntityType.legalEntity) &&
        Objects.equals(this.employees, trusteeEntityType.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntity, employees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrusteeEntityType {\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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
    openapiFields.add("legalEntity");
    openapiFields.add("employees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrusteeEntityType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrusteeEntityType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrusteeEntityType is not found in the empty JSON string", TrusteeEntityType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrusteeEntityType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrusteeEntityType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `legalEntity`
      if (jsonObj.get("legalEntity") != null && !jsonObj.get("legalEntity").isJsonNull()) {
        LegalEntity.validateJsonElement(jsonObj.get("legalEntity"));
      }
      if (jsonObj.get("employees") != null && !jsonObj.get("employees").isJsonNull()) {
        JsonArray jsonArrayemployees = jsonObj.getAsJsonArray("employees");
        if (jsonArrayemployees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employees` to be an array in the JSON string but got `%s`", jsonObj.get("employees").toString()));
          }

          // validate the optional field `employees` (array)
          for (int i = 0; i < jsonArrayemployees.size(); i++) {
            Individual.validateJsonElement(jsonArrayemployees.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrusteeEntityType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrusteeEntityType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrusteeEntityType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrusteeEntityType.class));

       return (TypeAdapter<T>) new TypeAdapter<TrusteeEntityType>() {
           @Override
           public void write(JsonWriter out, TrusteeEntityType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrusteeEntityType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrusteeEntityType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrusteeEntityType
   * @throws IOException if the JSON string is invalid with respect to TrusteeEntityType
   */
  public static TrusteeEntityType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrusteeEntityType.class);
  }

  /**
   * Convert an instance of TrusteeEntityType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

