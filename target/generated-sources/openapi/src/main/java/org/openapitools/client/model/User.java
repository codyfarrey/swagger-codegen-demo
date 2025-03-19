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
import org.openapitools.client.model.UserEntity;

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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class User {
  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  @javax.annotation.Nullable
  private String roleId;

  public static final String SERIALIZED_NAME_HAS_RIGHT_CODE_IND = "hasRightCodeInd";
  @SerializedName(SERIALIZED_NAME_HAS_RIGHT_CODE_IND)
  @javax.annotation.Nullable
  private Boolean hasRightCodeInd;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  @javax.annotation.Nullable
  private UserEntity entity;

  public User() {
  }

  public User roleId(@javax.annotation.Nullable String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * The role of the username as it relates to the account
   * @return roleId
   */
  @javax.annotation.Nullable
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(@javax.annotation.Nullable String roleId) {
    this.roleId = roleId;
  }


  public User hasRightCodeInd(@javax.annotation.Nullable Boolean hasRightCodeInd) {
    this.hasRightCodeInd = hasRightCodeInd;
    return this;
  }

  /**
   * Internally used
   * @return hasRightCodeInd
   */
  @javax.annotation.Nullable
  public Boolean getHasRightCodeInd() {
    return hasRightCodeInd;
  }

  public void setHasRightCodeInd(@javax.annotation.Nullable Boolean hasRightCodeInd) {
    this.hasRightCodeInd = hasRightCodeInd;
  }


  public User entity(@javax.annotation.Nullable UserEntity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
   */
  @javax.annotation.Nullable
  public UserEntity getEntity() {
    return entity;
  }

  public void setEntity(@javax.annotation.Nullable UserEntity entity) {
    this.entity = entity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.roleId, user.roleId) &&
        Objects.equals(this.hasRightCodeInd, user.hasRightCodeInd) &&
        Objects.equals(this.entity, user.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, hasRightCodeInd, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    hasRightCodeInd: ").append(toIndentedString(hasRightCodeInd)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
    openapiFields.add("roleId");
    openapiFields.add("hasRightCodeInd");
    openapiFields.add("entity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to User
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("roleId") != null && !jsonObj.get("roleId").isJsonNull()) && !jsonObj.get("roleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleId").toString()));
      }
      // validate the optional field `entity`
      if (jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) {
        UserEntity.validateJsonElement(jsonObj.get("entity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of User given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User
   * @throws IOException if the JSON string is invalid with respect to User
   */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

  /**
   * Convert an instance of User to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

