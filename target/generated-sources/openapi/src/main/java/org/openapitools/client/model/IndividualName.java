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
 * IndividualName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class IndividualName {
  /**
   * Gets or Sets salutation
   */
  @JsonAdapter(SalutationEnum.Adapter.class)
  public enum SalutationEnum {
    MR_("Mr."),
    
    MRS_("Mrs."),
    
    MS_("Ms."),
    
    DR_("Dr."),
    
    MX_("Mx."),
    
    IND_("Ind.");

    private String value;

    SalutationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SalutationEnum fromValue(String value) {
      for (SalutationEnum b : SalutationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SalutationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SalutationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SalutationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SalutationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SalutationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SALUTATION = "salutation";
  @SerializedName(SERIALIZED_NAME_SALUTATION)
  @javax.annotation.Nullable
  private SalutationEnum salutation;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  @javax.annotation.Nullable
  private String first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  @javax.annotation.Nullable
  private String last;

  public static final String SERIALIZED_NAME_MIDDLE = "middle";
  @SerializedName(SERIALIZED_NAME_MIDDLE)
  @javax.annotation.Nullable
  private String middle;

  /**
   * Gets or Sets suffix
   */
  @JsonAdapter(SuffixEnum.Adapter.class)
  public enum SuffixEnum {
    JR_("Jr."),
    
    SR_("Sr."),
    
    I("I"),
    
    II("II"),
    
    III("III"),
    
    IV("IV"),
    
    V("V");

    private String value;

    SuffixEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuffixEnum fromValue(String value) {
      for (SuffixEnum b : SuffixEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuffixEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuffixEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuffixEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SuffixEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SuffixEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  @javax.annotation.Nullable
  private SuffixEnum suffix;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nullable
  private String title;

  public IndividualName() {
  }

  public IndividualName salutation(@javax.annotation.Nullable SalutationEnum salutation) {
    this.salutation = salutation;
    return this;
  }

  /**
   * Get salutation
   * @return salutation
   */
  @javax.annotation.Nullable
  public SalutationEnum getSalutation() {
    return salutation;
  }

  public void setSalutation(@javax.annotation.Nullable SalutationEnum salutation) {
    this.salutation = salutation;
  }


  public IndividualName first(@javax.annotation.Nullable String first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
   */
  @javax.annotation.Nullable
  public String getFirst() {
    return first;
  }

  public void setFirst(@javax.annotation.Nullable String first) {
    this.first = first;
  }


  public IndividualName last(@javax.annotation.Nullable String last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
   */
  @javax.annotation.Nullable
  public String getLast() {
    return last;
  }

  public void setLast(@javax.annotation.Nullable String last) {
    this.last = last;
  }


  public IndividualName middle(@javax.annotation.Nullable String middle) {
    this.middle = middle;
    return this;
  }

  /**
   * Get middle
   * @return middle
   */
  @javax.annotation.Nullable
  public String getMiddle() {
    return middle;
  }

  public void setMiddle(@javax.annotation.Nullable String middle) {
    this.middle = middle;
  }


  public IndividualName suffix(@javax.annotation.Nullable SuffixEnum suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
   */
  @javax.annotation.Nullable
  public SuffixEnum getSuffix() {
    return suffix;
  }

  public void setSuffix(@javax.annotation.Nullable SuffixEnum suffix) {
    this.suffix = suffix;
  }


  public IndividualName title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualName individualName = (IndividualName) o;
    return Objects.equals(this.salutation, individualName.salutation) &&
        Objects.equals(this.first, individualName.first) &&
        Objects.equals(this.last, individualName.last) &&
        Objects.equals(this.middle, individualName.middle) &&
        Objects.equals(this.suffix, individualName.suffix) &&
        Objects.equals(this.title, individualName.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salutation, first, last, middle, suffix, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualName {\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("salutation");
    openapiFields.add("first");
    openapiFields.add("last");
    openapiFields.add("middle");
    openapiFields.add("suffix");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IndividualName
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IndividualName.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndividualName is not found in the empty JSON string", IndividualName.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IndividualName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndividualName` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("salutation") != null && !jsonObj.get("salutation").isJsonNull()) && !jsonObj.get("salutation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salutation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salutation").toString()));
      }
      // validate the optional field `salutation`
      if (jsonObj.get("salutation") != null && !jsonObj.get("salutation").isJsonNull()) {
        SalutationEnum.validateJsonElement(jsonObj.get("salutation"));
      }
      if ((jsonObj.get("first") != null && !jsonObj.get("first").isJsonNull()) && !jsonObj.get("first").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first").toString()));
      }
      if ((jsonObj.get("last") != null && !jsonObj.get("last").isJsonNull()) && !jsonObj.get("last").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last").toString()));
      }
      if ((jsonObj.get("middle") != null && !jsonObj.get("middle").isJsonNull()) && !jsonObj.get("middle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle").toString()));
      }
      if ((jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) && !jsonObj.get("suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffix").toString()));
      }
      // validate the optional field `suffix`
      if (jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) {
        SuffixEnum.validateJsonElement(jsonObj.get("suffix"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndividualName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndividualName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndividualName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndividualName.class));

       return (TypeAdapter<T>) new TypeAdapter<IndividualName>() {
           @Override
           public void write(JsonWriter out, IndividualName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndividualName read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IndividualName given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IndividualName
   * @throws IOException if the JSON string is invalid with respect to IndividualName
   */
  public static IndividualName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndividualName.class);
  }

  /**
   * Convert an instance of IndividualName to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

