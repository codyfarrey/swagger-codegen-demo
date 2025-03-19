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
import org.openapitools.client.model.BondFiltersResponseBondFiltersInnerOptionsInner;

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
 * BondFiltersResponseBondFiltersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class BondFiltersResponseBondFiltersInner {
  /**
   * An identifier used to document returned options/values. This can be thought of as a key value.
   */
  @JsonAdapter(DisplayTextEnum.Adapter.class)
  public enum DisplayTextEnum {
    MATURITY_DATE("Maturity Date"),
    
    ISSUE_DATE("Issue Date"),
    
    COUPON("Coupon"),
    
    CURRENCY("Currency");

    private String value;

    DisplayTextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayTextEnum fromValue(String value) {
      for (DisplayTextEnum b : DisplayTextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisplayTextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayTextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayTextEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisplayTextEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DisplayTextEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DISPLAY_TEXT = "displayText";
  @SerializedName(SERIALIZED_NAME_DISPLAY_TEXT)
  @javax.annotation.Nullable
  private DisplayTextEnum displayText;

  public static final String SERIALIZED_NAME_COLUMN_ID = "columnId";
  @SerializedName(SERIALIZED_NAME_COLUMN_ID)
  @javax.annotation.Nullable
  private Integer columnId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  @javax.annotation.Nullable
  private List<BondFiltersResponseBondFiltersInnerOptionsInner> options = new ArrayList<>();

  public BondFiltersResponseBondFiltersInner() {
  }

  public BondFiltersResponseBondFiltersInner displayText(@javax.annotation.Nullable DisplayTextEnum displayText) {
    this.displayText = displayText;
    return this;
  }

  /**
   * An identifier used to document returned options/values. This can be thought of as a key value.
   * @return displayText
   */
  @javax.annotation.Nullable
  public DisplayTextEnum getDisplayText() {
    return displayText;
  }

  public void setDisplayText(@javax.annotation.Nullable DisplayTextEnum displayText) {
    this.displayText = displayText;
  }


  public BondFiltersResponseBondFiltersInner columnId(@javax.annotation.Nullable Integer columnId) {
    this.columnId = columnId;
    return this;
  }

  /**
   * Used for user interfaces. Internal use only.
   * @return columnId
   */
  @javax.annotation.Nullable
  public Integer getColumnId() {
    return columnId;
  }

  public void setColumnId(@javax.annotation.Nullable Integer columnId) {
    this.columnId = columnId;
  }


  public BondFiltersResponseBondFiltersInner options(@javax.annotation.Nullable List<BondFiltersResponseBondFiltersInnerOptionsInner> options) {
    this.options = options;
    return this;
  }

  public BondFiltersResponseBondFiltersInner addOptionsItem(BondFiltersResponseBondFiltersInnerOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Contains all objects with values corresponding to the parent displayText key.
   * @return options
   */
  @javax.annotation.Nullable
  public List<BondFiltersResponseBondFiltersInnerOptionsInner> getOptions() {
    return options;
  }

  public void setOptions(@javax.annotation.Nullable List<BondFiltersResponseBondFiltersInnerOptionsInner> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BondFiltersResponseBondFiltersInner bondFiltersResponseBondFiltersInner = (BondFiltersResponseBondFiltersInner) o;
    return Objects.equals(this.displayText, bondFiltersResponseBondFiltersInner.displayText) &&
        Objects.equals(this.columnId, bondFiltersResponseBondFiltersInner.columnId) &&
        Objects.equals(this.options, bondFiltersResponseBondFiltersInner.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayText, columnId, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BondFiltersResponseBondFiltersInner {\n");
    sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("displayText");
    openapiFields.add("columnId");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BondFiltersResponseBondFiltersInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BondFiltersResponseBondFiltersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BondFiltersResponseBondFiltersInner is not found in the empty JSON string", BondFiltersResponseBondFiltersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BondFiltersResponseBondFiltersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BondFiltersResponseBondFiltersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayText") != null && !jsonObj.get("displayText").isJsonNull()) && !jsonObj.get("displayText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayText").toString()));
      }
      // validate the optional field `displayText`
      if (jsonObj.get("displayText") != null && !jsonObj.get("displayText").isJsonNull()) {
        DisplayTextEnum.validateJsonElement(jsonObj.get("displayText"));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            BondFiltersResponseBondFiltersInnerOptionsInner.validateJsonElement(jsonArrayoptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BondFiltersResponseBondFiltersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BondFiltersResponseBondFiltersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BondFiltersResponseBondFiltersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BondFiltersResponseBondFiltersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BondFiltersResponseBondFiltersInner>() {
           @Override
           public void write(JsonWriter out, BondFiltersResponseBondFiltersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BondFiltersResponseBondFiltersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BondFiltersResponseBondFiltersInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BondFiltersResponseBondFiltersInner
   * @throws IOException if the JSON string is invalid with respect to BondFiltersResponseBondFiltersInner
   */
  public static BondFiltersResponseBondFiltersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BondFiltersResponseBondFiltersInner.class);
  }

  /**
   * Convert an instance of BondFiltersResponseBondFiltersInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

