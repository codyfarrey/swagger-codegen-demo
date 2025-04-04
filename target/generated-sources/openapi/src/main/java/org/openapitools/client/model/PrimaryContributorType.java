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
import org.openapitools.client.model.Address;

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
 * PrimaryContributorType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class PrimaryContributorType {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_INITIAL = "middleInitial";
  @SerializedName(SERIALIZED_NAME_MIDDLE_INITIAL)
  @javax.annotation.Nullable
  private String middleInitial;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  /**
   * Gets or Sets suffix
   */
  @JsonAdapter(SuffixEnum.Adapter.class)
  public enum SuffixEnum {
    JR_("Jr."),
    
    SR_("Sr."),
    
    I("I"),
    
    II("II"),
    
    III("III"),
    
    IV("IV"),
    
    V("V");

    private String value;

    SuffixEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuffixEnum fromValue(String value) {
      for (SuffixEnum b : SuffixEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuffixEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuffixEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuffixEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SuffixEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SuffixEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  @javax.annotation.Nullable
  private SuffixEnum suffix;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  @javax.annotation.Nullable
  private String employer;

  public static final String SERIALIZED_NAME_OCCUPATION = "occupation";
  @SerializedName(SERIALIZED_NAME_OCCUPATION)
  @javax.annotation.Nullable
  private String occupation;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private Address address;

  public static final String SERIALIZED_NAME_SOURCE_OF_FUNDS = "sourceOfFunds";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_FUNDS)
  @javax.annotation.Nullable
  private String sourceOfFunds;

  public PrimaryContributorType() {
  }

  public PrimaryContributorType firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public PrimaryContributorType middleInitial(@javax.annotation.Nullable String middleInitial) {
    this.middleInitial = middleInitial;
    return this;
  }

  /**
   * Get middleInitial
   * @return middleInitial
   */
  @javax.annotation.Nullable
  public String getMiddleInitial() {
    return middleInitial;
  }

  public void setMiddleInitial(@javax.annotation.Nullable String middleInitial) {
    this.middleInitial = middleInitial;
  }


  public PrimaryContributorType lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public PrimaryContributorType suffix(@javax.annotation.Nullable SuffixEnum suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
   */
  @javax.annotation.Nullable
  public SuffixEnum getSuffix() {
    return suffix;
  }

  public void setSuffix(@javax.annotation.Nullable SuffixEnum suffix) {
    this.suffix = suffix;
  }


  public PrimaryContributorType employer(@javax.annotation.Nullable String employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
   */
  @javax.annotation.Nullable
  public String getEmployer() {
    return employer;
  }

  public void setEmployer(@javax.annotation.Nullable String employer) {
    this.employer = employer;
  }


  public PrimaryContributorType occupation(@javax.annotation.Nullable String occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * Get occupation
   * @return occupation
   */
  @javax.annotation.Nullable
  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(@javax.annotation.Nullable String occupation) {
    this.occupation = occupation;
  }


  public PrimaryContributorType address(@javax.annotation.Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable Address address) {
    this.address = address;
  }


  public PrimaryContributorType sourceOfFunds(@javax.annotation.Nullable String sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

  /**
   * Get sourceOfFunds
   * @return sourceOfFunds
   */
  @javax.annotation.Nullable
  public String getSourceOfFunds() {
    return sourceOfFunds;
  }

  public void setSourceOfFunds(@javax.annotation.Nullable String sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryContributorType primaryContributorType = (PrimaryContributorType) o;
    return Objects.equals(this.firstName, primaryContributorType.firstName) &&
        Objects.equals(this.middleInitial, primaryContributorType.middleInitial) &&
        Objects.equals(this.lastName, primaryContributorType.lastName) &&
        Objects.equals(this.suffix, primaryContributorType.suffix) &&
        Objects.equals(this.employer, primaryContributorType.employer) &&
        Objects.equals(this.occupation, primaryContributorType.occupation) &&
        Objects.equals(this.address, primaryContributorType.address) &&
        Objects.equals(this.sourceOfFunds, primaryContributorType.sourceOfFunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleInitial, lastName, suffix, employer, occupation, address, sourceOfFunds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryContributorType {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("middleInitial");
    openapiFields.add("lastName");
    openapiFields.add("suffix");
    openapiFields.add("employer");
    openapiFields.add("occupation");
    openapiFields.add("address");
    openapiFields.add("sourceOfFunds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PrimaryContributorType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PrimaryContributorType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrimaryContributorType is not found in the empty JSON string", PrimaryContributorType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PrimaryContributorType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrimaryContributorType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("middleInitial") != null && !jsonObj.get("middleInitial").isJsonNull()) && !jsonObj.get("middleInitial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleInitial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleInitial").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) && !jsonObj.get("suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffix").toString()));
      }
      // validate the optional field `suffix`
      if (jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) {
        SuffixEnum.validateJsonElement(jsonObj.get("suffix"));
      }
      if ((jsonObj.get("employer") != null && !jsonObj.get("employer").isJsonNull()) && !jsonObj.get("employer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer").toString()));
      }
      if ((jsonObj.get("occupation") != null && !jsonObj.get("occupation").isJsonNull()) && !jsonObj.get("occupation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occupation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occupation").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("sourceOfFunds") != null && !jsonObj.get("sourceOfFunds").isJsonNull()) && !jsonObj.get("sourceOfFunds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceOfFunds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceOfFunds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrimaryContributorType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrimaryContributorType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrimaryContributorType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrimaryContributorType.class));

       return (TypeAdapter<T>) new TypeAdapter<PrimaryContributorType>() {
           @Override
           public void write(JsonWriter out, PrimaryContributorType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrimaryContributorType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PrimaryContributorType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PrimaryContributorType
   * @throws IOException if the JSON string is invalid with respect to PrimaryContributorType
   */
  public static PrimaryContributorType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrimaryContributorType.class);
  }

  /**
   * Convert an instance of PrimaryContributorType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

