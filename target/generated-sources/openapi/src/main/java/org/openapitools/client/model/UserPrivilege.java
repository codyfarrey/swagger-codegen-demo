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
 * UserPrivilege
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class UserPrivilege {
  public static final String SERIALIZED_NAME_EXTERNAL_ACCOUNT_ID = "externalAccountId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String externalAccountId;

  /**
   * Gets or Sets privilege
   */
  @JsonAdapter(PrivilegeEnum.Adapter.class)
  public enum PrivilegeEnum {
    OWNER("OWNER"),
    
    TRADER("TRADER"),
    
    CUSTOM("CUSTOM"),
    
    NONE("NONE");

    private String value;

    PrivilegeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivilegeEnum fromValue(String value) {
      for (PrivilegeEnum b : PrivilegeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrivilegeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivilegeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivilegeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrivilegeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PrivilegeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PRIVILEGE = "privilege";
  @SerializedName(SERIALIZED_NAME_PRIVILEGE)
  @javax.annotation.Nullable
  private PrivilegeEnum privilege;

  public UserPrivilege() {
  }

  public UserPrivilege externalAccountId(@javax.annotation.Nullable String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Get externalAccountId
   * @return externalAccountId
   */
  @javax.annotation.Nullable
  public String getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(@javax.annotation.Nullable String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }


  public UserPrivilege privilege(@javax.annotation.Nullable PrivilegeEnum privilege) {
    this.privilege = privilege;
    return this;
  }

  /**
   * Get privilege
   * @return privilege
   */
  @javax.annotation.Nullable
  public PrivilegeEnum getPrivilege() {
    return privilege;
  }

  public void setPrivilege(@javax.annotation.Nullable PrivilegeEnum privilege) {
    this.privilege = privilege;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPrivilege userPrivilege = (UserPrivilege) o;
    return Objects.equals(this.externalAccountId, userPrivilege.externalAccountId) &&
        Objects.equals(this.privilege, userPrivilege.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalAccountId, privilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPrivilege {\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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
    openapiFields.add("externalAccountId");
    openapiFields.add("privilege");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserPrivilege
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserPrivilege.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserPrivilege is not found in the empty JSON string", UserPrivilege.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserPrivilege.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserPrivilege` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("externalAccountId") != null && !jsonObj.get("externalAccountId").isJsonNull()) && !jsonObj.get("externalAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalAccountId").toString()));
      }
      if ((jsonObj.get("privilege") != null && !jsonObj.get("privilege").isJsonNull()) && !jsonObj.get("privilege").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privilege` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privilege").toString()));
      }
      // validate the optional field `privilege`
      if (jsonObj.get("privilege") != null && !jsonObj.get("privilege").isJsonNull()) {
        PrivilegeEnum.validateJsonElement(jsonObj.get("privilege"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserPrivilege.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserPrivilege' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserPrivilege> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserPrivilege.class));

       return (TypeAdapter<T>) new TypeAdapter<UserPrivilege>() {
           @Override
           public void write(JsonWriter out, UserPrivilege value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserPrivilege read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserPrivilege given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserPrivilege
   * @throws IOException if the JSON string is invalid with respect to UserPrivilege
   */
  public static UserPrivilege fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserPrivilege.class);
  }

  /**
   * Convert an instance of UserPrivilege to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

