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
import org.openapitools.client.model.HighWaterMarkConfigurationType;
import org.openapitools.client.model.PreviousLossesType;

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
 * HighWaterMarkType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class HighWaterMarkType {
  public static final String SERIALIZED_NAME_HWM = "hwm";
  @SerializedName(SERIALIZED_NAME_HWM)
  @javax.annotation.Nullable
  private HighWaterMarkConfigurationType hwm;

  public static final String SERIALIZED_NAME_PREVIOUS_LOSSES = "previousLosses";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_LOSSES)
  @javax.annotation.Nullable
  private List<PreviousLossesType> previousLosses = new ArrayList<>();

  public HighWaterMarkType() {
  }

  public HighWaterMarkType hwm(@javax.annotation.Nullable HighWaterMarkConfigurationType hwm) {
    this.hwm = hwm;
    return this;
  }

  /**
   * Get hwm
   * @return hwm
   */
  @javax.annotation.Nullable
  public HighWaterMarkConfigurationType getHwm() {
    return hwm;
  }

  public void setHwm(@javax.annotation.Nullable HighWaterMarkConfigurationType hwm) {
    this.hwm = hwm;
  }


  public HighWaterMarkType previousLosses(@javax.annotation.Nullable List<PreviousLossesType> previousLosses) {
    this.previousLosses = previousLosses;
    return this;
  }

  public HighWaterMarkType addPreviousLossesItem(PreviousLossesType previousLossesItem) {
    if (this.previousLosses == null) {
      this.previousLosses = new ArrayList<>();
    }
    this.previousLosses.add(previousLossesItem);
    return this;
  }

  /**
   * Get previousLosses
   * @return previousLosses
   */
  @javax.annotation.Nullable
  public List<PreviousLossesType> getPreviousLosses() {
    return previousLosses;
  }

  public void setPreviousLosses(@javax.annotation.Nullable List<PreviousLossesType> previousLosses) {
    this.previousLosses = previousLosses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighWaterMarkType highWaterMarkType = (HighWaterMarkType) o;
    return Objects.equals(this.hwm, highWaterMarkType.hwm) &&
        Objects.equals(this.previousLosses, highWaterMarkType.previousLosses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hwm, previousLosses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighWaterMarkType {\n");
    sb.append("    hwm: ").append(toIndentedString(hwm)).append("\n");
    sb.append("    previousLosses: ").append(toIndentedString(previousLosses)).append("\n");
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
    openapiFields.add("hwm");
    openapiFields.add("previousLosses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HighWaterMarkType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HighWaterMarkType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HighWaterMarkType is not found in the empty JSON string", HighWaterMarkType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HighWaterMarkType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HighWaterMarkType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `hwm`
      if (jsonObj.get("hwm") != null && !jsonObj.get("hwm").isJsonNull()) {
        HighWaterMarkConfigurationType.validateJsonElement(jsonObj.get("hwm"));
      }
      if (jsonObj.get("previousLosses") != null && !jsonObj.get("previousLosses").isJsonNull()) {
        JsonArray jsonArraypreviousLosses = jsonObj.getAsJsonArray("previousLosses");
        if (jsonArraypreviousLosses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("previousLosses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `previousLosses` to be an array in the JSON string but got `%s`", jsonObj.get("previousLosses").toString()));
          }

          // validate the optional field `previousLosses` (array)
          for (int i = 0; i < jsonArraypreviousLosses.size(); i++) {
            PreviousLossesType.validateJsonElement(jsonArraypreviousLosses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HighWaterMarkType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HighWaterMarkType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HighWaterMarkType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HighWaterMarkType.class));

       return (TypeAdapter<T>) new TypeAdapter<HighWaterMarkType>() {
           @Override
           public void write(JsonWriter out, HighWaterMarkType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HighWaterMarkType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HighWaterMarkType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HighWaterMarkType
   * @throws IOException if the JSON string is invalid with respect to HighWaterMarkType
   */
  public static HighWaterMarkType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HighWaterMarkType.class);
  }

  /**
   * Convert an instance of HighWaterMarkType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

