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
 * AttachedFileType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AttachedFileType {
  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  @javax.annotation.Nullable
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_LENGTH = "fileLength";
  @SerializedName(SERIALIZED_NAME_FILE_LENGTH)
  @javax.annotation.Nullable
  private Integer fileLength;

  public static final String SERIALIZED_NAME_SHA1_CHECKSUM = "sha1Checksum";
  @SerializedName(SERIALIZED_NAME_SHA1_CHECKSUM)
  @javax.annotation.Nullable
  private String sha1Checksum;

  public AttachedFileType() {
  }

  public AttachedFileType fileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
  }


  public AttachedFileType fileLength(@javax.annotation.Nullable Integer fileLength) {
    this.fileLength = fileLength;
    return this;
  }

  /**
   * Get fileLength
   * @return fileLength
   */
  @javax.annotation.Nullable
  public Integer getFileLength() {
    return fileLength;
  }

  public void setFileLength(@javax.annotation.Nullable Integer fileLength) {
    this.fileLength = fileLength;
  }


  public AttachedFileType sha1Checksum(@javax.annotation.Nullable String sha1Checksum) {
    this.sha1Checksum = sha1Checksum;
    return this;
  }

  /**
   * Get sha1Checksum
   * @return sha1Checksum
   */
  @javax.annotation.Nullable
  public String getSha1Checksum() {
    return sha1Checksum;
  }

  public void setSha1Checksum(@javax.annotation.Nullable String sha1Checksum) {
    this.sha1Checksum = sha1Checksum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachedFileType attachedFileType = (AttachedFileType) o;
    return Objects.equals(this.fileName, attachedFileType.fileName) &&
        Objects.equals(this.fileLength, attachedFileType.fileLength) &&
        Objects.equals(this.sha1Checksum, attachedFileType.sha1Checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileLength, sha1Checksum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachedFileType {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileLength: ").append(toIndentedString(fileLength)).append("\n");
    sb.append("    sha1Checksum: ").append(toIndentedString(sha1Checksum)).append("\n");
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
    openapiFields.add("fileName");
    openapiFields.add("fileLength");
    openapiFields.add("sha1Checksum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AttachedFileType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AttachedFileType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachedFileType is not found in the empty JSON string", AttachedFileType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AttachedFileType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachedFileType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if ((jsonObj.get("sha1Checksum") != null && !jsonObj.get("sha1Checksum").isJsonNull()) && !jsonObj.get("sha1Checksum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha1Checksum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha1Checksum").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachedFileType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachedFileType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachedFileType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachedFileType.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachedFileType>() {
           @Override
           public void write(JsonWriter out, AttachedFileType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachedFileType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AttachedFileType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AttachedFileType
   * @throws IOException if the JSON string is invalid with respect to AttachedFileType
   */
  public static AttachedFileType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachedFileType.class);
  }

  /**
   * Convert an instance of AttachedFileType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

