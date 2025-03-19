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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.PhoneInfo;

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
 * TrustIdentification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class TrustIdentification {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private Address address;

  public static final String SERIALIZED_NAME_MAILING_ADDRESS = "mailingAddress";
  @SerializedName(SERIALIZED_NAME_MAILING_ADDRESS)
  @javax.annotation.Nullable
  private Address mailingAddress;

  public static final String SERIALIZED_NAME_PHONES = "phones";
  @SerializedName(SERIALIZED_NAME_PHONES)
  @javax.annotation.Nullable
  private List<PhoneInfo> phones = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  /**
   * Gets or Sets typeOfTrust
   */
  @JsonAdapter(TypeOfTrustEnum.Adapter.class)
  public enum TypeOfTrustEnum {
    IRREVOC("IRREVOC"),
    
    SMSF("SMSF"),
    
    REVOCABLE("REVOCABLE"),
    
    TESTAMENTARY("TESTAMENTARY"),
    
    RETIREMENT("RETIREMENT"),
    
    ERISA("ERISA"),
    
    OTHER("OTHER");

    private String value;

    TypeOfTrustEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeOfTrustEnum fromValue(String value) {
      for (TypeOfTrustEnum b : TypeOfTrustEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeOfTrustEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeOfTrustEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeOfTrustEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeOfTrustEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeOfTrustEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE_OF_TRUST = "typeOfTrust";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_TRUST)
  @javax.annotation.Nullable
  private TypeOfTrustEnum typeOfTrust;

  public static final String SERIALIZED_NAME_PURPOSE_OF_TRUST = "purposeOfTrust";
  @SerializedName(SERIALIZED_NAME_PURPOSE_OF_TRUST)
  @javax.annotation.Nullable
  private String purposeOfTrust;

  public static final String SERIALIZED_NAME_DATE_FORMED = "dateFormed";
  @SerializedName(SERIALIZED_NAME_DATE_FORMED)
  @javax.annotation.Nullable
  private LocalDate dateFormed;

  public static final String SERIALIZED_NAME_FORMATION_COUNTRY = "formationCountry";
  @SerializedName(SERIALIZED_NAME_FORMATION_COUNTRY)
  @javax.annotation.Nullable
  private String formationCountry;

  public static final String SERIALIZED_NAME_FORMATION_STATE = "formationState";
  @SerializedName(SERIALIZED_NAME_FORMATION_STATE)
  @javax.annotation.Nullable
  private String formationState;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registrationNumber";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  @javax.annotation.Nullable
  private String registrationNumber;

  /**
   * Gets or Sets registrationType
   */
  @JsonAdapter(RegistrationTypeEnum.Adapter.class)
  public enum RegistrationTypeEnum {
    SSN("SSN"),
    
    EIN("EIN"),
    
    NON_US_NATIONAL_ID("NonUS_NationalId");

    private String value;

    RegistrationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegistrationTypeEnum fromValue(String value) {
      for (RegistrationTypeEnum b : RegistrationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RegistrationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegistrationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegistrationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RegistrationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RegistrationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REGISTRATION_TYPE = "registrationType";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_TYPE)
  @javax.annotation.Nullable
  private RegistrationTypeEnum registrationType;

  public static final String SERIALIZED_NAME_REGISTRATION_COUNTRY = "registrationCountry";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_COUNTRY)
  @javax.annotation.Nullable
  private String registrationCountry;

  public static final String SERIALIZED_NAME_SAME_MAIL_ADDRESS = "sameMailAddress";
  @SerializedName(SERIALIZED_NAME_SAME_MAIL_ADDRESS)
  @javax.annotation.Nullable
  private Boolean sameMailAddress;

  public static final String SERIALIZED_NAME_TRANSLATED = "translated";
  @SerializedName(SERIALIZED_NAME_TRANSLATED)
  @javax.annotation.Nullable
  private Boolean translated;

  public TrustIdentification() {
  }

  public TrustIdentification address(@javax.annotation.Nullable Address address) {
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


  public TrustIdentification mailingAddress(@javax.annotation.Nullable Address mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

  /**
   * Get mailingAddress
   * @return mailingAddress
   */
  @javax.annotation.Nullable
  public Address getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(@javax.annotation.Nullable Address mailingAddress) {
    this.mailingAddress = mailingAddress;
  }


  public TrustIdentification phones(@javax.annotation.Nullable List<PhoneInfo> phones) {
    this.phones = phones;
    return this;
  }

  public TrustIdentification addPhonesItem(PhoneInfo phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Get phones
   * @return phones
   */
  @javax.annotation.Nullable
  public List<PhoneInfo> getPhones() {
    return phones;
  }

  public void setPhones(@javax.annotation.Nullable List<PhoneInfo> phones) {
    this.phones = phones;
  }


  public TrustIdentification name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public TrustIdentification description(@javax.annotation.Nullable String description) {
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


  public TrustIdentification typeOfTrust(@javax.annotation.Nullable TypeOfTrustEnum typeOfTrust) {
    this.typeOfTrust = typeOfTrust;
    return this;
  }

  /**
   * Get typeOfTrust
   * @return typeOfTrust
   */
  @javax.annotation.Nullable
  public TypeOfTrustEnum getTypeOfTrust() {
    return typeOfTrust;
  }

  public void setTypeOfTrust(@javax.annotation.Nullable TypeOfTrustEnum typeOfTrust) {
    this.typeOfTrust = typeOfTrust;
  }


  public TrustIdentification purposeOfTrust(@javax.annotation.Nullable String purposeOfTrust) {
    this.purposeOfTrust = purposeOfTrust;
    return this;
  }

  /**
   * Get purposeOfTrust
   * @return purposeOfTrust
   */
  @javax.annotation.Nullable
  public String getPurposeOfTrust() {
    return purposeOfTrust;
  }

  public void setPurposeOfTrust(@javax.annotation.Nullable String purposeOfTrust) {
    this.purposeOfTrust = purposeOfTrust;
  }


  public TrustIdentification dateFormed(@javax.annotation.Nullable LocalDate dateFormed) {
    this.dateFormed = dateFormed;
    return this;
  }

  /**
   * Get dateFormed
   * @return dateFormed
   */
  @javax.annotation.Nullable
  public LocalDate getDateFormed() {
    return dateFormed;
  }

  public void setDateFormed(@javax.annotation.Nullable LocalDate dateFormed) {
    this.dateFormed = dateFormed;
  }


  public TrustIdentification formationCountry(@javax.annotation.Nullable String formationCountry) {
    this.formationCountry = formationCountry;
    return this;
  }

  /**
   * Get formationCountry
   * @return formationCountry
   */
  @javax.annotation.Nullable
  public String getFormationCountry() {
    return formationCountry;
  }

  public void setFormationCountry(@javax.annotation.Nullable String formationCountry) {
    this.formationCountry = formationCountry;
  }


  public TrustIdentification formationState(@javax.annotation.Nullable String formationState) {
    this.formationState = formationState;
    return this;
  }

  /**
   * Get formationState
   * @return formationState
   */
  @javax.annotation.Nullable
  public String getFormationState() {
    return formationState;
  }

  public void setFormationState(@javax.annotation.Nullable String formationState) {
    this.formationState = formationState;
  }


  public TrustIdentification registrationNumber(@javax.annotation.Nullable String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Get registrationNumber
   * @return registrationNumber
   */
  @javax.annotation.Nullable
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(@javax.annotation.Nullable String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public TrustIdentification registrationType(@javax.annotation.Nullable RegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
    return this;
  }

  /**
   * Get registrationType
   * @return registrationType
   */
  @javax.annotation.Nullable
  public RegistrationTypeEnum getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(@javax.annotation.Nullable RegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
  }


  public TrustIdentification registrationCountry(@javax.annotation.Nullable String registrationCountry) {
    this.registrationCountry = registrationCountry;
    return this;
  }

  /**
   * Get registrationCountry
   * @return registrationCountry
   */
  @javax.annotation.Nullable
  public String getRegistrationCountry() {
    return registrationCountry;
  }

  public void setRegistrationCountry(@javax.annotation.Nullable String registrationCountry) {
    this.registrationCountry = registrationCountry;
  }


  public TrustIdentification sameMailAddress(@javax.annotation.Nullable Boolean sameMailAddress) {
    this.sameMailAddress = sameMailAddress;
    return this;
  }

  /**
   * Get sameMailAddress
   * @return sameMailAddress
   */
  @javax.annotation.Nullable
  public Boolean getSameMailAddress() {
    return sameMailAddress;
  }

  public void setSameMailAddress(@javax.annotation.Nullable Boolean sameMailAddress) {
    this.sameMailAddress = sameMailAddress;
  }


  public TrustIdentification translated(@javax.annotation.Nullable Boolean translated) {
    this.translated = translated;
    return this;
  }

  /**
   * Get translated
   * @return translated
   */
  @javax.annotation.Nullable
  public Boolean getTranslated() {
    return translated;
  }

  public void setTranslated(@javax.annotation.Nullable Boolean translated) {
    this.translated = translated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustIdentification trustIdentification = (TrustIdentification) o;
    return Objects.equals(this.address, trustIdentification.address) &&
        Objects.equals(this.mailingAddress, trustIdentification.mailingAddress) &&
        Objects.equals(this.phones, trustIdentification.phones) &&
        Objects.equals(this.name, trustIdentification.name) &&
        Objects.equals(this.description, trustIdentification.description) &&
        Objects.equals(this.typeOfTrust, trustIdentification.typeOfTrust) &&
        Objects.equals(this.purposeOfTrust, trustIdentification.purposeOfTrust) &&
        Objects.equals(this.dateFormed, trustIdentification.dateFormed) &&
        Objects.equals(this.formationCountry, trustIdentification.formationCountry) &&
        Objects.equals(this.formationState, trustIdentification.formationState) &&
        Objects.equals(this.registrationNumber, trustIdentification.registrationNumber) &&
        Objects.equals(this.registrationType, trustIdentification.registrationType) &&
        Objects.equals(this.registrationCountry, trustIdentification.registrationCountry) &&
        Objects.equals(this.sameMailAddress, trustIdentification.sameMailAddress) &&
        Objects.equals(this.translated, trustIdentification.translated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, mailingAddress, phones, name, description, typeOfTrust, purposeOfTrust, dateFormed, formationCountry, formationState, registrationNumber, registrationType, registrationCountry, sameMailAddress, translated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustIdentification {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    typeOfTrust: ").append(toIndentedString(typeOfTrust)).append("\n");
    sb.append("    purposeOfTrust: ").append(toIndentedString(purposeOfTrust)).append("\n");
    sb.append("    dateFormed: ").append(toIndentedString(dateFormed)).append("\n");
    sb.append("    formationCountry: ").append(toIndentedString(formationCountry)).append("\n");
    sb.append("    formationState: ").append(toIndentedString(formationState)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    registrationType: ").append(toIndentedString(registrationType)).append("\n");
    sb.append("    registrationCountry: ").append(toIndentedString(registrationCountry)).append("\n");
    sb.append("    sameMailAddress: ").append(toIndentedString(sameMailAddress)).append("\n");
    sb.append("    translated: ").append(toIndentedString(translated)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("mailingAddress");
    openapiFields.add("phones");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("typeOfTrust");
    openapiFields.add("purposeOfTrust");
    openapiFields.add("dateFormed");
    openapiFields.add("formationCountry");
    openapiFields.add("formationState");
    openapiFields.add("registrationNumber");
    openapiFields.add("registrationType");
    openapiFields.add("registrationCountry");
    openapiFields.add("sameMailAddress");
    openapiFields.add("translated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrustIdentification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrustIdentification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrustIdentification is not found in the empty JSON string", TrustIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrustIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrustIdentification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `mailingAddress`
      if (jsonObj.get("mailingAddress") != null && !jsonObj.get("mailingAddress").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("mailingAddress"));
      }
      if (jsonObj.get("phones") != null && !jsonObj.get("phones").isJsonNull()) {
        JsonArray jsonArrayphones = jsonObj.getAsJsonArray("phones");
        if (jsonArrayphones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("phones").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `phones` to be an array in the JSON string but got `%s`", jsonObj.get("phones").toString()));
          }

          // validate the optional field `phones` (array)
          for (int i = 0; i < jsonArrayphones.size(); i++) {
            PhoneInfo.validateJsonElement(jsonArrayphones.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("typeOfTrust") != null && !jsonObj.get("typeOfTrust").isJsonNull()) && !jsonObj.get("typeOfTrust").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeOfTrust` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeOfTrust").toString()));
      }
      // validate the optional field `typeOfTrust`
      if (jsonObj.get("typeOfTrust") != null && !jsonObj.get("typeOfTrust").isJsonNull()) {
        TypeOfTrustEnum.validateJsonElement(jsonObj.get("typeOfTrust"));
      }
      if ((jsonObj.get("purposeOfTrust") != null && !jsonObj.get("purposeOfTrust").isJsonNull()) && !jsonObj.get("purposeOfTrust").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purposeOfTrust` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purposeOfTrust").toString()));
      }
      if ((jsonObj.get("formationCountry") != null && !jsonObj.get("formationCountry").isJsonNull()) && !jsonObj.get("formationCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formationCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formationCountry").toString()));
      }
      if ((jsonObj.get("formationState") != null && !jsonObj.get("formationState").isJsonNull()) && !jsonObj.get("formationState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formationState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formationState").toString()));
      }
      if ((jsonObj.get("registrationNumber") != null && !jsonObj.get("registrationNumber").isJsonNull()) && !jsonObj.get("registrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationNumber").toString()));
      }
      if ((jsonObj.get("registrationType") != null && !jsonObj.get("registrationType").isJsonNull()) && !jsonObj.get("registrationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationType").toString()));
      }
      // validate the optional field `registrationType`
      if (jsonObj.get("registrationType") != null && !jsonObj.get("registrationType").isJsonNull()) {
        RegistrationTypeEnum.validateJsonElement(jsonObj.get("registrationType"));
      }
      if ((jsonObj.get("registrationCountry") != null && !jsonObj.get("registrationCountry").isJsonNull()) && !jsonObj.get("registrationCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationCountry").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustIdentification>() {
           @Override
           public void write(JsonWriter out, TrustIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrustIdentification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrustIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrustIdentification
   * @throws IOException if the JSON string is invalid with respect to TrustIdentification
   */
  public static TrustIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustIdentification.class);
  }

  /**
   * Convert an instance of TrustIdentification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

