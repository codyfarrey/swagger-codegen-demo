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
 * IserverScannerParamsFilterListInnerComboValuesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class IserverScannerParamsFilterListInnerComboValuesInner {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  @javax.annotation.Nullable
  private Boolean _default;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  @javax.annotation.Nullable
  private Object vendor;

  public IserverScannerParamsFilterListInnerComboValuesInner() {
  }

  public IserverScannerParamsFilterListInnerComboValuesInner _default(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   */
  @javax.annotation.Nullable
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
  }


  public IserverScannerParamsFilterListInnerComboValuesInner vendor(@javax.annotation.Nullable Object vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Get vendor
   * @return vendor
   */
  @javax.annotation.Nullable
  public Object getVendor() {
    return vendor;
  }

  public void setVendor(@javax.annotation.Nullable Object vendor) {
    this.vendor = vendor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IserverScannerParamsFilterListInnerComboValuesInner iserverScannerParamsFilterListInnerComboValuesInner = (IserverScannerParamsFilterListInnerComboValuesInner) o;
    return Objects.equals(this._default, iserverScannerParamsFilterListInnerComboValuesInner._default) &&
        Objects.equals(this.vendor, iserverScannerParamsFilterListInnerComboValuesInner.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IserverScannerParamsFilterListInnerComboValuesInner {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
    openapiFields.add("default");
    openapiFields.add("vendor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IserverScannerParamsFilterListInnerComboValuesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IserverScannerParamsFilterListInnerComboValuesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IserverScannerParamsFilterListInnerComboValuesInner is not found in the empty JSON string", IserverScannerParamsFilterListInnerComboValuesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IserverScannerParamsFilterListInnerComboValuesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IserverScannerParamsFilterListInnerComboValuesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IserverScannerParamsFilterListInnerComboValuesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IserverScannerParamsFilterListInnerComboValuesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IserverScannerParamsFilterListInnerComboValuesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IserverScannerParamsFilterListInnerComboValuesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<IserverScannerParamsFilterListInnerComboValuesInner>() {
           @Override
           public void write(JsonWriter out, IserverScannerParamsFilterListInnerComboValuesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IserverScannerParamsFilterListInnerComboValuesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IserverScannerParamsFilterListInnerComboValuesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IserverScannerParamsFilterListInnerComboValuesInner
   * @throws IOException if the JSON string is invalid with respect to IserverScannerParamsFilterListInnerComboValuesInner
   */
  public static IserverScannerParamsFilterListInnerComboValuesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IserverScannerParamsFilterListInnerComboValuesInner.class);
  }

  /**
   * Convert an instance of IserverScannerParamsFilterListInnerComboValuesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

