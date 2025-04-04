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
import org.openapitools.client.model.RepresentativeDetail;

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
 * UpdateAccountRepresentatives
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class UpdateAccountRepresentatives {
  public static final String SERIALIZED_NAME_REPRESENTATIVE_DETAILS = "representativeDetails";
  @SerializedName(SERIALIZED_NAME_REPRESENTATIVE_DETAILS)
  @javax.annotation.Nullable
  private List<RepresentativeDetail> representativeDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public UpdateAccountRepresentatives() {
  }

  public UpdateAccountRepresentatives representativeDetails(@javax.annotation.Nullable List<RepresentativeDetail> representativeDetails) {
    this.representativeDetails = representativeDetails;
    return this;
  }

  public UpdateAccountRepresentatives addRepresentativeDetailsItem(RepresentativeDetail representativeDetailsItem) {
    if (this.representativeDetails == null) {
      this.representativeDetails = new ArrayList<>();
    }
    this.representativeDetails.add(representativeDetailsItem);
    return this;
  }

  /**
   * Get representativeDetails
   * @return representativeDetails
   */
  @javax.annotation.Nullable
  public List<RepresentativeDetail> getRepresentativeDetails() {
    return representativeDetails;
  }

  public void setRepresentativeDetails(@javax.annotation.Nullable List<RepresentativeDetail> representativeDetails) {
    this.representativeDetails = representativeDetails;
  }


  public UpdateAccountRepresentatives accountId(@javax.annotation.Nullable String accountId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccountRepresentatives updateAccountRepresentatives = (UpdateAccountRepresentatives) o;
    return Objects.equals(this.representativeDetails, updateAccountRepresentatives.representativeDetails) &&
        Objects.equals(this.accountId, updateAccountRepresentatives.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(representativeDetails, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccountRepresentatives {\n");
    sb.append("    representativeDetails: ").append(toIndentedString(representativeDetails)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
    openapiFields.add("representativeDetails");
    openapiFields.add("accountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateAccountRepresentatives
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAccountRepresentatives.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAccountRepresentatives is not found in the empty JSON string", UpdateAccountRepresentatives.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAccountRepresentatives.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAccountRepresentatives` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("representativeDetails") != null && !jsonObj.get("representativeDetails").isJsonNull()) {
        JsonArray jsonArrayrepresentativeDetails = jsonObj.getAsJsonArray("representativeDetails");
        if (jsonArrayrepresentativeDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("representativeDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `representativeDetails` to be an array in the JSON string but got `%s`", jsonObj.get("representativeDetails").toString()));
          }

          // validate the optional field `representativeDetails` (array)
          for (int i = 0; i < jsonArrayrepresentativeDetails.size(); i++) {
            RepresentativeDetail.validateJsonElement(jsonArrayrepresentativeDetails.get(i));
          };
        }
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAccountRepresentatives.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAccountRepresentatives' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAccountRepresentatives> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAccountRepresentatives.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAccountRepresentatives>() {
           @Override
           public void write(JsonWriter out, UpdateAccountRepresentatives value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAccountRepresentatives read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateAccountRepresentatives given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAccountRepresentatives
   * @throws IOException if the JSON string is invalid with respect to UpdateAccountRepresentatives
   */
  public static UpdateAccountRepresentatives fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAccountRepresentatives.class);
  }

  /**
   * Convert an instance of UpdateAccountRepresentatives to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

