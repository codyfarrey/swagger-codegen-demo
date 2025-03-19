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
 * PoliticalMilitaryDiplomaticDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class PoliticalMilitaryDiplomaticDetailsType {
  public static final String SERIALIZED_NAME_PERSON_NAME = "personName";
  @SerializedName(SERIALIZED_NAME_PERSON_NAME)
  @javax.annotation.Nullable
  private String personName;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nullable
  private String title;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  @javax.annotation.Nullable
  private String organization;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public PoliticalMilitaryDiplomaticDetailsType() {
  }

  public PoliticalMilitaryDiplomaticDetailsType personName(@javax.annotation.Nullable String personName) {
    this.personName = personName;
    return this;
  }

  /**
   * Get personName
   * @return personName
   */
  @javax.annotation.Nullable
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(@javax.annotation.Nullable String personName) {
    this.personName = personName;
  }


  public PoliticalMilitaryDiplomaticDetailsType title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  public PoliticalMilitaryDiplomaticDetailsType organization(@javax.annotation.Nullable String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @javax.annotation.Nullable
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(@javax.annotation.Nullable String organization) {
    this.organization = organization;
  }


  public PoliticalMilitaryDiplomaticDetailsType country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoliticalMilitaryDiplomaticDetailsType politicalMilitaryDiplomaticDetailsType = (PoliticalMilitaryDiplomaticDetailsType) o;
    return Objects.equals(this.personName, politicalMilitaryDiplomaticDetailsType.personName) &&
        Objects.equals(this.title, politicalMilitaryDiplomaticDetailsType.title) &&
        Objects.equals(this.organization, politicalMilitaryDiplomaticDetailsType.organization) &&
        Objects.equals(this.country, politicalMilitaryDiplomaticDetailsType.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personName, title, organization, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoliticalMilitaryDiplomaticDetailsType {\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("personName");
    openapiFields.add("title");
    openapiFields.add("organization");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PoliticalMilitaryDiplomaticDetailsType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PoliticalMilitaryDiplomaticDetailsType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PoliticalMilitaryDiplomaticDetailsType is not found in the empty JSON string", PoliticalMilitaryDiplomaticDetailsType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PoliticalMilitaryDiplomaticDetailsType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PoliticalMilitaryDiplomaticDetailsType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("personName") != null && !jsonObj.get("personName").isJsonNull()) && !jsonObj.get("personName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personName").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) && !jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PoliticalMilitaryDiplomaticDetailsType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PoliticalMilitaryDiplomaticDetailsType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PoliticalMilitaryDiplomaticDetailsType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PoliticalMilitaryDiplomaticDetailsType.class));

       return (TypeAdapter<T>) new TypeAdapter<PoliticalMilitaryDiplomaticDetailsType>() {
           @Override
           public void write(JsonWriter out, PoliticalMilitaryDiplomaticDetailsType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PoliticalMilitaryDiplomaticDetailsType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PoliticalMilitaryDiplomaticDetailsType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PoliticalMilitaryDiplomaticDetailsType
   * @throws IOException if the JSON string is invalid with respect to PoliticalMilitaryDiplomaticDetailsType
   */
  public static PoliticalMilitaryDiplomaticDetailsType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PoliticalMilitaryDiplomaticDetailsType.class);
  }

  /**
   * Convert an instance of PoliticalMilitaryDiplomaticDetailsType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

