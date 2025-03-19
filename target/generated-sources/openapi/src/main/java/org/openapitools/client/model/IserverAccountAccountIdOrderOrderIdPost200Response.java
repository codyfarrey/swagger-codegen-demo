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
import org.openapitools.client.model.AdvancedOrderReject;
import org.openapitools.client.model.OrderReplyMessageInner;
import org.openapitools.client.model.OrderSubmitError;
import org.openapitools.client.model.OrderSubmitSuccessInner;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class IserverAccountAccountIdOrderOrderIdPost200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(IserverAccountAccountIdOrderOrderIdPost200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!IserverAccountAccountIdOrderOrderIdPost200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'IserverAccountAccountIdOrderOrderIdPost200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstanceListOrderSubmitSuccessInner = new TypeToken<List<OrderSubmitSuccessInner>>(){}.getType();
            final TypeAdapter<List<OrderSubmitSuccessInner>> adapterListOrderSubmitSuccessInner = (TypeAdapter<List<OrderSubmitSuccessInner>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListOrderSubmitSuccessInner));
            final TypeAdapter<OrderSubmitError> adapterOrderSubmitError = gson.getDelegateAdapter(this, TypeToken.get(OrderSubmitError.class));

            final Type typeInstanceListOrderReplyMessageInner = new TypeToken<List<OrderReplyMessageInner>>(){}.getType();
            final TypeAdapter<List<OrderReplyMessageInner>> adapterListOrderReplyMessageInner = (TypeAdapter<List<OrderReplyMessageInner>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListOrderReplyMessageInner));
            final TypeAdapter<AdvancedOrderReject> adapterAdvancedOrderReject = gson.getDelegateAdapter(this, TypeToken.get(AdvancedOrderReject.class));

            return (TypeAdapter<T>) new TypeAdapter<IserverAccountAccountIdOrderOrderIdPost200Response>() {
                @Override
                public void write(JsonWriter out, IserverAccountAccountIdOrderOrderIdPost200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<OrderSubmitSuccessInner>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof OrderSubmitSuccessInner) {
                            JsonArray array = adapterListOrderSubmitSuccessInner.toJsonTree((List<OrderSubmitSuccessInner>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    // check if the actual instance is of the type `OrderSubmitError`
                    if (value.getActualInstance() instanceof OrderSubmitError) {
                        JsonElement element = adapterOrderSubmitError.toJsonTree((OrderSubmitError)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `AdvancedOrderReject`
                    if (value.getActualInstance() instanceof AdvancedOrderReject) {
                        JsonElement element = adapterAdvancedOrderReject.toJsonTree((AdvancedOrderReject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AdvancedOrderReject, List<OrderReplyMessageInner>, List<OrderSubmitSuccessInner>, OrderSubmitError");
                }

                @Override
                public IserverAccountAccountIdOrderOrderIdPost200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<OrderSubmitSuccessInner>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            OrderSubmitSuccessInner.validateJsonElement(element);
                        }
                        actualAdapter = adapterListOrderSubmitSuccessInner;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<OrderSubmitSuccessInner>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<OrderSubmitSuccessInner> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<OrderSubmitSuccessInner>'", e);
                    }
                    // deserialize OrderSubmitError
                    try {
                        // validate the JSON object to see if any exception is thrown
                        OrderSubmitError.validateJsonElement(jsonElement);
                        actualAdapter = adapterOrderSubmitError;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'OrderSubmitError'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for OrderSubmitError failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'OrderSubmitError'", e);
                    }
                    // deserialize AdvancedOrderReject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AdvancedOrderReject.validateJsonElement(jsonElement);
                        actualAdapter = adapterAdvancedOrderReject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AdvancedOrderReject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AdvancedOrderReject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AdvancedOrderReject'", e);
                    }

                    if (match == 1) {
                        IserverAccountAccountIdOrderOrderIdPost200Response ret = new IserverAccountAccountIdOrderOrderIdPost200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for IserverAccountAccountIdOrderOrderIdPost200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public IserverAccountAccountIdOrderOrderIdPost200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public IserverAccountAccountIdOrderOrderIdPost200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<OrderSubmitSuccessInner>", List.class);
        schemas.put("OrderSubmitError", OrderSubmitError.class);
        schemas.put("AdvancedOrderReject", AdvancedOrderReject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return IserverAccountAccountIdOrderOrderIdPost200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AdvancedOrderReject, List<OrderReplyMessageInner>, List<OrderSubmitSuccessInner>, OrderSubmitError
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof OrderSubmitSuccessInner) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof OrderSubmitError) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AdvancedOrderReject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AdvancedOrderReject, List<OrderReplyMessageInner>, List<OrderSubmitSuccessInner>, OrderSubmitError");
    }

    /**
     * Get the actual instance, which can be the following:
     * AdvancedOrderReject, List<OrderReplyMessageInner>, List<OrderSubmitSuccessInner>, OrderSubmitError
     *
     * @return The actual instance (AdvancedOrderReject, List<OrderReplyMessageInner>, List<OrderSubmitSuccessInner>, OrderSubmitError)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<OrderSubmitSuccessInner>`. If the actual instance is not `List<OrderSubmitSuccessInner>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<OrderSubmitSuccessInner>`
     * @throws ClassCastException if the instance is not `List<OrderSubmitSuccessInner>`
     */
    public List<OrderSubmitSuccessInner> getListOrderSubmitSuccessInner() throws ClassCastException {
        return (List<OrderSubmitSuccessInner>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OrderSubmitError`. If the actual instance is not `OrderSubmitError`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OrderSubmitError`
     * @throws ClassCastException if the instance is not `OrderSubmitError`
     */
    public OrderSubmitError getOrderSubmitError() throws ClassCastException {
        return (OrderSubmitError)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<OrderReplyMessageInner>`. If the actual instance is not `List<OrderReplyMessageInner>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<OrderReplyMessageInner>`
     * @throws ClassCastException if the instance is not `List<OrderReplyMessageInner>`
     */
    public List<OrderReplyMessageInner> getListOrderReplyMessageInner() throws ClassCastException {
        return (List<OrderReplyMessageInner>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AdvancedOrderReject`. If the actual instance is not `AdvancedOrderReject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AdvancedOrderReject`
     * @throws ClassCastException if the instance is not `AdvancedOrderReject`
     */
    public AdvancedOrderReject getAdvancedOrderReject() throws ClassCastException {
        return (AdvancedOrderReject)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to IserverAccountAccountIdOrderOrderIdPost200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with List<OrderSubmitSuccessInner>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                OrderSubmitSuccessInner.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<OrderSubmitSuccessInner> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with OrderSubmitError
        try {
            OrderSubmitError.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for OrderSubmitError failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AdvancedOrderReject
        try {
            AdvancedOrderReject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AdvancedOrderReject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for IserverAccountAccountIdOrderOrderIdPost200Response with oneOf schemas: AdvancedOrderReject, List<OrderReplyMessageInner>, List<OrderSubmitSuccessInner>, OrderSubmitError. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of IserverAccountAccountIdOrderOrderIdPost200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of IserverAccountAccountIdOrderOrderIdPost200Response
     * @throws IOException if the JSON string is invalid with respect to IserverAccountAccountIdOrderOrderIdPost200Response
     */
    public static IserverAccountAccountIdOrderOrderIdPost200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, IserverAccountAccountIdOrderOrderIdPost200Response.class);
    }

    /**
     * Convert an instance of IserverAccountAccountIdOrderOrderIdPost200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

