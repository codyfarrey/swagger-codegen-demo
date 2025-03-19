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
import org.openapitools.client.model.PnlPartitionedResponseUpnl;

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
 * PnlPartitionedResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class PnlPartitionedResponse {
  public static final String SERIALIZED_NAME_UPNL = "upnl";
  @SerializedName(SERIALIZED_NAME_UPNL)
  @javax.annotation.Nullable
  private PnlPartitionedResponseUpnl upnl;

  public PnlPartitionedResponse() {
  }

  public PnlPartitionedResponse upnl(@javax.annotation.Nullable PnlPartitionedResponseUpnl upnl) {
    this.upnl = upnl;
    return this;
  }

  /**
   * Get upnl
   * @return upnl
   */
  @javax.annotation.Nullable
  public PnlPartitionedResponseUpnl getUpnl() {
    return upnl;
  }

  public void setUpnl(@javax.annotation.Nullable PnlPartitionedResponseUpnl upnl) {
    this.upnl = upnl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnlPartitionedResponse pnlPartitionedResponse = (PnlPartitionedResponse) o;
    return Objects.equals(this.upnl, pnlPartitionedResponse.upnl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upnl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnlPartitionedResponse {\n");
    sb.append("    upnl: ").append(toIndentedString(upnl)).append("\n");
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
    openapiFields.add("upnl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PnlPartitionedResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PnlPartitionedResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PnlPartitionedResponse is not found in the empty JSON string", PnlPartitionedResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PnlPartitionedResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PnlPartitionedResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `upnl`
      if (jsonObj.get("upnl") != null && !jsonObj.get("upnl").isJsonNull()) {
        PnlPartitionedResponseUpnl.validateJsonElement(jsonObj.get("upnl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PnlPartitionedResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PnlPartitionedResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PnlPartitionedResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PnlPartitionedResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PnlPartitionedResponse>() {
           @Override
           public void write(JsonWriter out, PnlPartitionedResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PnlPartitionedResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PnlPartitionedResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PnlPartitionedResponse
   * @throws IOException if the JSON string is invalid with respect to PnlPartitionedResponse
   */
  public static PnlPartitionedResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PnlPartitionedResponse.class);
  }

  /**
   * Convert an instance of PnlPartitionedResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

