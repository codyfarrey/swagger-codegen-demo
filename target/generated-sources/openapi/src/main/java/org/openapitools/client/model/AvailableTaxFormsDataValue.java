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
import org.openapitools.client.model.TaxFormType;

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
 * AvailableTaxFormsDataValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AvailableTaxFormsDataValue {
  public static final String SERIALIZED_NAME_FORMS = "forms";
  @SerializedName(SERIALIZED_NAME_FORMS)
  @javax.annotation.Nullable
  private List<TaxFormType> forms = new ArrayList<>();

  public AvailableTaxFormsDataValue() {
  }

  public AvailableTaxFormsDataValue forms(@javax.annotation.Nullable List<TaxFormType> forms) {
    this.forms = forms;
    return this;
  }

  public AvailableTaxFormsDataValue addFormsItem(TaxFormType formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

  /**
   * available tax forms
   * @return forms
   */
  @javax.annotation.Nullable
  public List<TaxFormType> getForms() {
    return forms;
  }

  public void setForms(@javax.annotation.Nullable List<TaxFormType> forms) {
    this.forms = forms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTaxFormsDataValue availableTaxFormsDataValue = (AvailableTaxFormsDataValue) o;
    return Objects.equals(this.forms, availableTaxFormsDataValue.forms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTaxFormsDataValue {\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
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
    openapiFields.add("forms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AvailableTaxFormsDataValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailableTaxFormsDataValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableTaxFormsDataValue is not found in the empty JSON string", AvailableTaxFormsDataValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailableTaxFormsDataValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailableTaxFormsDataValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("forms") != null && !jsonObj.get("forms").isJsonNull() && !jsonObj.get("forms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `forms` to be an array in the JSON string but got `%s`", jsonObj.get("forms").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableTaxFormsDataValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableTaxFormsDataValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableTaxFormsDataValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableTaxFormsDataValue.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableTaxFormsDataValue>() {
           @Override
           public void write(JsonWriter out, AvailableTaxFormsDataValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailableTaxFormsDataValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AvailableTaxFormsDataValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AvailableTaxFormsDataValue
   * @throws IOException if the JSON string is invalid with respect to AvailableTaxFormsDataValue
   */
  public static AvailableTaxFormsDataValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableTaxFormsDataValue.class);
  }

  /**
   * Convert an instance of AvailableTaxFormsDataValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

