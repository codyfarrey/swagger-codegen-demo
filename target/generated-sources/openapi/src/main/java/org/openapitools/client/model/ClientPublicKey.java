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
 * ClientPublicKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class ClientPublicKey {
  public static final String SERIALIZED_NAME_KEY_ID = "keyId";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  @javax.annotation.Nonnull
  private String keyId;

  public static final String SERIALIZED_NAME_KEY_BIT_SIZE = "keyBitSize";
  @SerializedName(SERIALIZED_NAME_KEY_BIT_SIZE)
  @javax.annotation.Nullable
  private Integer keyBitSize;

  public static final String SERIALIZED_NAME_KEY_STATUS = "keyStatus";
  @SerializedName(SERIALIZED_NAME_KEY_STATUS)
  @javax.annotation.Nullable
  private String keyStatus;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  @javax.annotation.Nullable
  private Boolean active;

  public static final String SERIALIZED_NAME_SYMMETRIC = "symmetric";
  @SerializedName(SERIALIZED_NAME_SYMMETRIC)
  @javax.annotation.Nullable
  private Boolean symmetric;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  @javax.annotation.Nullable
  private Boolean _public;

  public static final String SERIALIZED_NAME_PRIVATE = "private";
  @SerializedName(SERIALIZED_NAME_PRIVATE)
  @javax.annotation.Nullable
  private Boolean _private;

  public static final String SERIALIZED_NAME_ASYMMETRIC = "asymmetric";
  @SerializedName(SERIALIZED_NAME_ASYMMETRIC)
  @javax.annotation.Nullable
  private Boolean asymmetric;

  public static final String SERIALIZED_NAME_EMPTY = "empty";
  @SerializedName(SERIALIZED_NAME_EMPTY)
  @javax.annotation.Nullable
  private Boolean empty;

  public ClientPublicKey() {
  }

  public ClientPublicKey keyId(@javax.annotation.Nonnull String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * Get keyId
   * @return keyId
   */
  @javax.annotation.Nonnull
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(@javax.annotation.Nonnull String keyId) {
    this.keyId = keyId;
  }


  public ClientPublicKey keyBitSize(@javax.annotation.Nullable Integer keyBitSize) {
    this.keyBitSize = keyBitSize;
    return this;
  }

  /**
   * Get keyBitSize
   * minimum: 3072
   * @return keyBitSize
   */
  @javax.annotation.Nullable
  public Integer getKeyBitSize() {
    return keyBitSize;
  }

  public void setKeyBitSize(@javax.annotation.Nullable Integer keyBitSize) {
    this.keyBitSize = keyBitSize;
  }


  public ClientPublicKey keyStatus(@javax.annotation.Nullable String keyStatus) {
    this.keyStatus = keyStatus;
    return this;
  }

  /**
   * Get keyStatus
   * @return keyStatus
   */
  @javax.annotation.Nullable
  public String getKeyStatus() {
    return keyStatus;
  }

  public void setKeyStatus(@javax.annotation.Nullable String keyStatus) {
    this.keyStatus = keyStatus;
  }


  public ClientPublicKey active(@javax.annotation.Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(@javax.annotation.Nullable Boolean active) {
    this.active = active;
  }


  public ClientPublicKey symmetric(@javax.annotation.Nullable Boolean symmetric) {
    this.symmetric = symmetric;
    return this;
  }

  /**
   * Get symmetric
   * @return symmetric
   */
  @javax.annotation.Nullable
  public Boolean getSymmetric() {
    return symmetric;
  }

  public void setSymmetric(@javax.annotation.Nullable Boolean symmetric) {
    this.symmetric = symmetric;
  }


  public ClientPublicKey _public(@javax.annotation.Nullable Boolean _public) {
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


  public ClientPublicKey _private(@javax.annotation.Nullable Boolean _private) {
    this._private = _private;
    return this;
  }

  /**
   * Get _private
   * @return _private
   */
  @javax.annotation.Nullable
  public Boolean getPrivate() {
    return _private;
  }

  public void setPrivate(@javax.annotation.Nullable Boolean _private) {
    this._private = _private;
  }


  public ClientPublicKey asymmetric(@javax.annotation.Nullable Boolean asymmetric) {
    this.asymmetric = asymmetric;
    return this;
  }

  /**
   * Get asymmetric
   * @return asymmetric
   */
  @javax.annotation.Nullable
  public Boolean getAsymmetric() {
    return asymmetric;
  }

  public void setAsymmetric(@javax.annotation.Nullable Boolean asymmetric) {
    this.asymmetric = asymmetric;
  }


  public ClientPublicKey empty(@javax.annotation.Nullable Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
   */
  @javax.annotation.Nullable
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(@javax.annotation.Nullable Boolean empty) {
    this.empty = empty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientPublicKey clientPublicKey = (ClientPublicKey) o;
    return Objects.equals(this.keyId, clientPublicKey.keyId) &&
        Objects.equals(this.keyBitSize, clientPublicKey.keyBitSize) &&
        Objects.equals(this.keyStatus, clientPublicKey.keyStatus) &&
        Objects.equals(this.active, clientPublicKey.active) &&
        Objects.equals(this.symmetric, clientPublicKey.symmetric) &&
        Objects.equals(this._public, clientPublicKey._public) &&
        Objects.equals(this._private, clientPublicKey._private) &&
        Objects.equals(this.asymmetric, clientPublicKey.asymmetric) &&
        Objects.equals(this.empty, clientPublicKey.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, keyBitSize, keyStatus, active, symmetric, _public, _private, asymmetric, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientPublicKey {\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    keyBitSize: ").append(toIndentedString(keyBitSize)).append("\n");
    sb.append("    keyStatus: ").append(toIndentedString(keyStatus)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    symmetric: ").append(toIndentedString(symmetric)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    asymmetric: ").append(toIndentedString(asymmetric)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
    openapiFields.add("keyId");
    openapiFields.add("keyBitSize");
    openapiFields.add("keyStatus");
    openapiFields.add("active");
    openapiFields.add("symmetric");
    openapiFields.add("public");
    openapiFields.add("private");
    openapiFields.add("asymmetric");
    openapiFields.add("empty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("keyId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClientPublicKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientPublicKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientPublicKey is not found in the empty JSON string", ClientPublicKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientPublicKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientPublicKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientPublicKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("keyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyId").toString()));
      }
      if ((jsonObj.get("keyStatus") != null && !jsonObj.get("keyStatus").isJsonNull()) && !jsonObj.get("keyStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientPublicKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientPublicKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientPublicKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientPublicKey.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientPublicKey>() {
           @Override
           public void write(JsonWriter out, ClientPublicKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientPublicKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClientPublicKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClientPublicKey
   * @throws IOException if the JSON string is invalid with respect to ClientPublicKey
   */
  public static ClientPublicKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientPublicKey.class);
  }

  /**
   * Convert an instance of ClientPublicKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

