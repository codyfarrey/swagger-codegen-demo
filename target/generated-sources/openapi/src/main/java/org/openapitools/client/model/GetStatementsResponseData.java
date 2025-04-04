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
 * GetStatementsResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class GetStatementsResponseData {
  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  @javax.annotation.Nullable
  private String dataType;

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  @javax.annotation.Nullable
  private String encoding;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  @javax.annotation.Nullable
  private String mimeType;

  public static final String SERIALIZED_NAME_GZIP = "gzip";
  @SerializedName(SERIALIZED_NAME_GZIP)
  @javax.annotation.Nullable
  private Boolean gzip;

  public static final String SERIALIZED_NAME_ACCEPT = "accept";
  @SerializedName(SERIALIZED_NAME_ACCEPT)
  @javax.annotation.Nullable
  private String accept;

  public GetStatementsResponseData() {
  }

  public GetStatementsResponseData dataType(@javax.annotation.Nullable String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * the data type of the value after decoding
   * @return dataType
   */
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }

  public void setDataType(@javax.annotation.Nullable String dataType) {
    this.dataType = dataType;
  }


  public GetStatementsResponseData encoding(@javax.annotation.Nullable String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * encoding used for the value
   * @return encoding
   */
  @javax.annotation.Nullable
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(@javax.annotation.Nullable String encoding) {
    this.encoding = encoding;
  }


  public GetStatementsResponseData value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Base 64 encoded String of byte[]. Byte[] represents compressed data when gzip is true
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
    this.value = value;
  }


  public GetStatementsResponseData mimeType(@javax.annotation.Nullable String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * mimeType of document after decoding and serializing the value
   * @return mimeType
   */
  @javax.annotation.Nullable
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(@javax.annotation.Nullable String mimeType) {
    this.mimeType = mimeType;
  }


  public GetStatementsResponseData gzip(@javax.annotation.Nullable Boolean gzip) {
    this.gzip = gzip;
    return this;
  }

  /**
   * content encoding flag. Represents whether the response is compressed
   * @return gzip
   */
  @javax.annotation.Nullable
  public Boolean getGzip() {
    return gzip;
  }

  public void setGzip(@javax.annotation.Nullable Boolean gzip) {
    this.gzip = gzip;
  }


  public GetStatementsResponseData accept(@javax.annotation.Nullable String accept) {
    this.accept = accept;
    return this;
  }

  /**
   * specify response media types that are acceptable
   * @return accept
   */
  @javax.annotation.Nullable
  public String getAccept() {
    return accept;
  }

  public void setAccept(@javax.annotation.Nullable String accept) {
    this.accept = accept;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatementsResponseData getStatementsResponseData = (GetStatementsResponseData) o;
    return Objects.equals(this.dataType, getStatementsResponseData.dataType) &&
        Objects.equals(this.encoding, getStatementsResponseData.encoding) &&
        Objects.equals(this.value, getStatementsResponseData.value) &&
        Objects.equals(this.mimeType, getStatementsResponseData.mimeType) &&
        Objects.equals(this.gzip, getStatementsResponseData.gzip) &&
        Objects.equals(this.accept, getStatementsResponseData.accept);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, encoding, value, mimeType, gzip, accept);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatementsResponseData {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    gzip: ").append(toIndentedString(gzip)).append("\n");
    sb.append("    accept: ").append(toIndentedString(accept)).append("\n");
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
    openapiFields.add("dataType");
    openapiFields.add("encoding");
    openapiFields.add("value");
    openapiFields.add("mimeType");
    openapiFields.add("gzip");
    openapiFields.add("accept");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetStatementsResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetStatementsResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetStatementsResponseData is not found in the empty JSON string", GetStatementsResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetStatementsResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetStatementsResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if ((jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) && !jsonObj.get("encoding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("mimeType") != null && !jsonObj.get("mimeType").isJsonNull()) && !jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      if ((jsonObj.get("accept") != null && !jsonObj.get("accept").isJsonNull()) && !jsonObj.get("accept").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accept` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accept").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetStatementsResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetStatementsResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetStatementsResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetStatementsResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetStatementsResponseData>() {
           @Override
           public void write(JsonWriter out, GetStatementsResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetStatementsResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetStatementsResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetStatementsResponseData
   * @throws IOException if the JSON string is invalid with respect to GetStatementsResponseData
   */
  public static GetStatementsResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetStatementsResponseData.class);
  }

  /**
   * Convert an instance of GetStatementsResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

