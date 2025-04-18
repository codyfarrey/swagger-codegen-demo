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
 * TaxFormType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class TaxFormType {
  public static final String SERIALIZED_NAME_IS_FORM = "isForm";
  @SerializedName(SERIALIZED_NAME_IS_FORM)
  @javax.annotation.Nullable
  private Boolean isForm;

  public static final String SERIALIZED_NAME_TAX_FORM_NAME = "taxFormName";
  @SerializedName(SERIALIZED_NAME_TAX_FORM_NAME)
  @javax.annotation.Nullable
  private String taxFormName;

  public static final String SERIALIZED_NAME_FORMATS = "formats";
  @SerializedName(SERIALIZED_NAME_FORMATS)
  @javax.annotation.Nullable
  private List<String> formats = new ArrayList<>();

  public TaxFormType() {
  }

  public TaxFormType isForm(@javax.annotation.Nullable Boolean isForm) {
    this.isForm = isForm;
    return this;
  }

  /**
   * Get isForm
   * @return isForm
   */
  @javax.annotation.Nullable
  public Boolean getIsForm() {
    return isForm;
  }

  public void setIsForm(@javax.annotation.Nullable Boolean isForm) {
    this.isForm = isForm;
  }


  public TaxFormType taxFormName(@javax.annotation.Nullable String taxFormName) {
    this.taxFormName = taxFormName;
    return this;
  }

  /**
   * Get taxFormName
   * @return taxFormName
   */
  @javax.annotation.Nullable
  public String getTaxFormName() {
    return taxFormName;
  }

  public void setTaxFormName(@javax.annotation.Nullable String taxFormName) {
    this.taxFormName = taxFormName;
  }


  public TaxFormType formats(@javax.annotation.Nullable List<String> formats) {
    this.formats = formats;
    return this;
  }

  public TaxFormType addFormatsItem(String formatsItem) {
    if (this.formats == null) {
      this.formats = new ArrayList<>();
    }
    this.formats.add(formatsItem);
    return this;
  }

  /**
   * available tax form formats
   * @return formats
   */
  @javax.annotation.Nullable
  public List<String> getFormats() {
    return formats;
  }

  public void setFormats(@javax.annotation.Nullable List<String> formats) {
    this.formats = formats;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxFormType taxFormType = (TaxFormType) o;
    return Objects.equals(this.isForm, taxFormType.isForm) &&
        Objects.equals(this.taxFormName, taxFormType.taxFormName) &&
        Objects.equals(this.formats, taxFormType.formats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isForm, taxFormName, formats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxFormType {\n");
    sb.append("    isForm: ").append(toIndentedString(isForm)).append("\n");
    sb.append("    taxFormName: ").append(toIndentedString(taxFormName)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
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
    openapiFields.add("isForm");
    openapiFields.add("taxFormName");
    openapiFields.add("formats");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaxFormType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaxFormType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxFormType is not found in the empty JSON string", TaxFormType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaxFormType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxFormType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("taxFormName") != null && !jsonObj.get("taxFormName").isJsonNull()) && !jsonObj.get("taxFormName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxFormName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxFormName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("formats") != null && !jsonObj.get("formats").isJsonNull() && !jsonObj.get("formats").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `formats` to be an array in the JSON string but got `%s`", jsonObj.get("formats").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxFormType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxFormType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxFormType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxFormType.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxFormType>() {
           @Override
           public void write(JsonWriter out, TaxFormType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxFormType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TaxFormType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaxFormType
   * @throws IOException if the JSON string is invalid with respect to TaxFormType
   */
  public static TaxFormType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxFormType.class);
  }

  /**
   * Convert an instance of TaxFormType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

