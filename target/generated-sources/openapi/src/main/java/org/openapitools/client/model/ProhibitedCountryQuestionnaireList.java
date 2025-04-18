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
import org.openapitools.client.model.ProhibitedQuestionnaireDetail;

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
 * ProhibitedCountryQuestionnaireList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class ProhibitedCountryQuestionnaireList {
  public static final String SERIALIZED_NAME_PROHIBITED_QUESTIONNAIRE_DETAIL = "prohibitedQuestionnaireDetail";
  @SerializedName(SERIALIZED_NAME_PROHIBITED_QUESTIONNAIRE_DETAIL)
  @javax.annotation.Nullable
  private List<ProhibitedQuestionnaireDetail> prohibitedQuestionnaireDetail = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  @javax.annotation.Nullable
  private String entityId;

  public ProhibitedCountryQuestionnaireList() {
  }

  public ProhibitedCountryQuestionnaireList prohibitedQuestionnaireDetail(@javax.annotation.Nullable List<ProhibitedQuestionnaireDetail> prohibitedQuestionnaireDetail) {
    this.prohibitedQuestionnaireDetail = prohibitedQuestionnaireDetail;
    return this;
  }

  public ProhibitedCountryQuestionnaireList addProhibitedQuestionnaireDetailItem(ProhibitedQuestionnaireDetail prohibitedQuestionnaireDetailItem) {
    if (this.prohibitedQuestionnaireDetail == null) {
      this.prohibitedQuestionnaireDetail = new ArrayList<>();
    }
    this.prohibitedQuestionnaireDetail.add(prohibitedQuestionnaireDetailItem);
    return this;
  }

  /**
   * Get prohibitedQuestionnaireDetail
   * @return prohibitedQuestionnaireDetail
   */
  @javax.annotation.Nullable
  public List<ProhibitedQuestionnaireDetail> getProhibitedQuestionnaireDetail() {
    return prohibitedQuestionnaireDetail;
  }

  public void setProhibitedQuestionnaireDetail(@javax.annotation.Nullable List<ProhibitedQuestionnaireDetail> prohibitedQuestionnaireDetail) {
    this.prohibitedQuestionnaireDetail = prohibitedQuestionnaireDetail;
  }


  public ProhibitedCountryQuestionnaireList accountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public ProhibitedCountryQuestionnaireList externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public ProhibitedCountryQuestionnaireList entityId(@javax.annotation.Nullable String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(@javax.annotation.Nullable String entityId) {
    this.entityId = entityId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProhibitedCountryQuestionnaireList prohibitedCountryQuestionnaireList = (ProhibitedCountryQuestionnaireList) o;
    return Objects.equals(this.prohibitedQuestionnaireDetail, prohibitedCountryQuestionnaireList.prohibitedQuestionnaireDetail) &&
        Objects.equals(this.accountId, prohibitedCountryQuestionnaireList.accountId) &&
        Objects.equals(this.externalId, prohibitedCountryQuestionnaireList.externalId) &&
        Objects.equals(this.entityId, prohibitedCountryQuestionnaireList.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prohibitedQuestionnaireDetail, accountId, externalId, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProhibitedCountryQuestionnaireList {\n");
    sb.append("    prohibitedQuestionnaireDetail: ").append(toIndentedString(prohibitedQuestionnaireDetail)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
    openapiFields.add("prohibitedQuestionnaireDetail");
    openapiFields.add("accountId");
    openapiFields.add("externalId");
    openapiFields.add("entityId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProhibitedCountryQuestionnaireList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProhibitedCountryQuestionnaireList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProhibitedCountryQuestionnaireList is not found in the empty JSON string", ProhibitedCountryQuestionnaireList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProhibitedCountryQuestionnaireList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProhibitedCountryQuestionnaireList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("prohibitedQuestionnaireDetail") != null && !jsonObj.get("prohibitedQuestionnaireDetail").isJsonNull()) {
        JsonArray jsonArrayprohibitedQuestionnaireDetail = jsonObj.getAsJsonArray("prohibitedQuestionnaireDetail");
        if (jsonArrayprohibitedQuestionnaireDetail != null) {
          // ensure the json data is an array
          if (!jsonObj.get("prohibitedQuestionnaireDetail").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `prohibitedQuestionnaireDetail` to be an array in the JSON string but got `%s`", jsonObj.get("prohibitedQuestionnaireDetail").toString()));
          }

          // validate the optional field `prohibitedQuestionnaireDetail` (array)
          for (int i = 0; i < jsonArrayprohibitedQuestionnaireDetail.size(); i++) {
            ProhibitedQuestionnaireDetail.validateJsonElement(jsonArrayprohibitedQuestionnaireDetail.get(i));
          };
        }
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProhibitedCountryQuestionnaireList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProhibitedCountryQuestionnaireList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProhibitedCountryQuestionnaireList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProhibitedCountryQuestionnaireList.class));

       return (TypeAdapter<T>) new TypeAdapter<ProhibitedCountryQuestionnaireList>() {
           @Override
           public void write(JsonWriter out, ProhibitedCountryQuestionnaireList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProhibitedCountryQuestionnaireList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProhibitedCountryQuestionnaireList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProhibitedCountryQuestionnaireList
   * @throws IOException if the JSON string is invalid with respect to ProhibitedCountryQuestionnaireList
   */
  public static ProhibitedCountryQuestionnaireList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProhibitedCountryQuestionnaireList.class);
  }

  /**
   * Convert an instance of ProhibitedCountryQuestionnaireList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

