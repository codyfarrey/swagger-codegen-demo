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
import org.openapitools.client.model.ORGRegulatorType;
import org.openapitools.client.model.PublicCompanyInfoType;

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
 * ORGRegulatoryInfoType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class ORGRegulatoryInfoType {
  public static final String SERIALIZED_NAME_PUBLIC_COMPANY_INFO = "publicCompanyInfo";
  @SerializedName(SERIALIZED_NAME_PUBLIC_COMPANY_INFO)
  @javax.annotation.Nullable
  private PublicCompanyInfoType publicCompanyInfo;

  public static final String SERIALIZED_NAME_ORG_REGULATORS = "orgRegulators";
  @SerializedName(SERIALIZED_NAME_ORG_REGULATORS)
  @javax.annotation.Nullable
  private List<ORGRegulatorType> orgRegulators = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGULATED = "regulated";
  @SerializedName(SERIALIZED_NAME_REGULATED)
  @javax.annotation.Nullable
  private Boolean regulated;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  @javax.annotation.Nullable
  private Boolean _public;

  public ORGRegulatoryInfoType() {
  }

  public ORGRegulatoryInfoType publicCompanyInfo(@javax.annotation.Nullable PublicCompanyInfoType publicCompanyInfo) {
    this.publicCompanyInfo = publicCompanyInfo;
    return this;
  }

  /**
   * Get publicCompanyInfo
   * @return publicCompanyInfo
   */
  @javax.annotation.Nullable
  public PublicCompanyInfoType getPublicCompanyInfo() {
    return publicCompanyInfo;
  }

  public void setPublicCompanyInfo(@javax.annotation.Nullable PublicCompanyInfoType publicCompanyInfo) {
    this.publicCompanyInfo = publicCompanyInfo;
  }


  public ORGRegulatoryInfoType orgRegulators(@javax.annotation.Nullable List<ORGRegulatorType> orgRegulators) {
    this.orgRegulators = orgRegulators;
    return this;
  }

  public ORGRegulatoryInfoType addOrgRegulatorsItem(ORGRegulatorType orgRegulatorsItem) {
    if (this.orgRegulators == null) {
      this.orgRegulators = new ArrayList<>();
    }
    this.orgRegulators.add(orgRegulatorsItem);
    return this;
  }

  /**
   * Get orgRegulators
   * @return orgRegulators
   */
  @javax.annotation.Nullable
  public List<ORGRegulatorType> getOrgRegulators() {
    return orgRegulators;
  }

  public void setOrgRegulators(@javax.annotation.Nullable List<ORGRegulatorType> orgRegulators) {
    this.orgRegulators = orgRegulators;
  }


  public ORGRegulatoryInfoType regulated(@javax.annotation.Nullable Boolean regulated) {
    this.regulated = regulated;
    return this;
  }

  /**
   * Get regulated
   * @return regulated
   */
  @javax.annotation.Nullable
  public Boolean getRegulated() {
    return regulated;
  }

  public void setRegulated(@javax.annotation.Nullable Boolean regulated) {
    this.regulated = regulated;
  }


  public ORGRegulatoryInfoType _public(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
   */
  @javax.annotation.Nullable
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ORGRegulatoryInfoType orGRegulatoryInfoType = (ORGRegulatoryInfoType) o;
    return Objects.equals(this.publicCompanyInfo, orGRegulatoryInfoType.publicCompanyInfo) &&
        Objects.equals(this.orgRegulators, orGRegulatoryInfoType.orgRegulators) &&
        Objects.equals(this.regulated, orGRegulatoryInfoType.regulated) &&
        Objects.equals(this._public, orGRegulatoryInfoType._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicCompanyInfo, orgRegulators, regulated, _public);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ORGRegulatoryInfoType {\n");
    sb.append("    publicCompanyInfo: ").append(toIndentedString(publicCompanyInfo)).append("\n");
    sb.append("    orgRegulators: ").append(toIndentedString(orgRegulators)).append("\n");
    sb.append("    regulated: ").append(toIndentedString(regulated)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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
    openapiFields.add("publicCompanyInfo");
    openapiFields.add("orgRegulators");
    openapiFields.add("regulated");
    openapiFields.add("public");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ORGRegulatoryInfoType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ORGRegulatoryInfoType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ORGRegulatoryInfoType is not found in the empty JSON string", ORGRegulatoryInfoType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ORGRegulatoryInfoType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ORGRegulatoryInfoType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `publicCompanyInfo`
      if (jsonObj.get("publicCompanyInfo") != null && !jsonObj.get("publicCompanyInfo").isJsonNull()) {
        PublicCompanyInfoType.validateJsonElement(jsonObj.get("publicCompanyInfo"));
      }
      if (jsonObj.get("orgRegulators") != null && !jsonObj.get("orgRegulators").isJsonNull()) {
        JsonArray jsonArrayorgRegulators = jsonObj.getAsJsonArray("orgRegulators");
        if (jsonArrayorgRegulators != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orgRegulators").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orgRegulators` to be an array in the JSON string but got `%s`", jsonObj.get("orgRegulators").toString()));
          }

          // validate the optional field `orgRegulators` (array)
          for (int i = 0; i < jsonArrayorgRegulators.size(); i++) {
            ORGRegulatorType.validateJsonElement(jsonArrayorgRegulators.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ORGRegulatoryInfoType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ORGRegulatoryInfoType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ORGRegulatoryInfoType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ORGRegulatoryInfoType.class));

       return (TypeAdapter<T>) new TypeAdapter<ORGRegulatoryInfoType>() {
           @Override
           public void write(JsonWriter out, ORGRegulatoryInfoType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ORGRegulatoryInfoType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ORGRegulatoryInfoType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ORGRegulatoryInfoType
   * @throws IOException if the JSON string is invalid with respect to ORGRegulatoryInfoType
   */
  public static ORGRegulatoryInfoType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ORGRegulatoryInfoType.class);
  }

  /**
   * Convert an instance of ORGRegulatoryInfoType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

