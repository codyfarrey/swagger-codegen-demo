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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.DepositFundsInstruction;
import org.openapitools.client.model.DepositFundsInstructionIraDepositDetail;
import org.openapitools.client.model.RecurringInstructionDetail;
import org.openapitools.client.model.WithdrawFundsInstruction;
import org.openapitools.client.model.WithdrawFundsInstructionIraWithdrawalDetail;



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
public class GwApiV1ExternalCashTransfersPostRequestInstruction extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GwApiV1ExternalCashTransfersPostRequestInstruction.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GwApiV1ExternalCashTransfersPostRequestInstruction.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GwApiV1ExternalCashTransfersPostRequestInstruction' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DepositFundsInstruction> adapterDepositFundsInstruction = gson.getDelegateAdapter(this, TypeToken.get(DepositFundsInstruction.class));
            final TypeAdapter<WithdrawFundsInstruction> adapterWithdrawFundsInstruction = gson.getDelegateAdapter(this, TypeToken.get(WithdrawFundsInstruction.class));

            return (TypeAdapter<T>) new TypeAdapter<GwApiV1ExternalCashTransfersPostRequestInstruction>() {
                @Override
                public void write(JsonWriter out, GwApiV1ExternalCashTransfersPostRequestInstruction value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DepositFundsInstruction`
                    if (value.getActualInstance() instanceof DepositFundsInstruction) {
                        JsonElement element = adapterDepositFundsInstruction.toJsonTree((DepositFundsInstruction)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WithdrawFundsInstruction`
                    if (value.getActualInstance() instanceof WithdrawFundsInstruction) {
                        JsonElement element = adapterWithdrawFundsInstruction.toJsonTree((WithdrawFundsInstruction)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: DepositFundsInstruction, WithdrawFundsInstruction");
                }

                @Override
                public GwApiV1ExternalCashTransfersPostRequestInstruction read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DepositFundsInstruction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DepositFundsInstruction.validateJsonElement(jsonElement);
                        actualAdapter = adapterDepositFundsInstruction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DepositFundsInstruction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DepositFundsInstruction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DepositFundsInstruction'", e);
                    }
                    // deserialize WithdrawFundsInstruction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WithdrawFundsInstruction.validateJsonElement(jsonElement);
                        actualAdapter = adapterWithdrawFundsInstruction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WithdrawFundsInstruction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WithdrawFundsInstruction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WithdrawFundsInstruction'", e);
                    }

                    if (match == 1) {
                        GwApiV1ExternalCashTransfersPostRequestInstruction ret = new GwApiV1ExternalCashTransfersPostRequestInstruction();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GwApiV1ExternalCashTransfersPostRequestInstruction: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GwApiV1ExternalCashTransfersPostRequestInstruction() {
        super("oneOf", Boolean.FALSE);
    }

    public GwApiV1ExternalCashTransfersPostRequestInstruction(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DepositFundsInstruction", DepositFundsInstruction.class);
        schemas.put("WithdrawFundsInstruction", WithdrawFundsInstruction.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GwApiV1ExternalCashTransfersPostRequestInstruction.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DepositFundsInstruction, WithdrawFundsInstruction
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DepositFundsInstruction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WithdrawFundsInstruction) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DepositFundsInstruction, WithdrawFundsInstruction");
    }

    /**
     * Get the actual instance, which can be the following:
     * DepositFundsInstruction, WithdrawFundsInstruction
     *
     * @return The actual instance (DepositFundsInstruction, WithdrawFundsInstruction)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DepositFundsInstruction`. If the actual instance is not `DepositFundsInstruction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DepositFundsInstruction`
     * @throws ClassCastException if the instance is not `DepositFundsInstruction`
     */
    public DepositFundsInstruction getDepositFundsInstruction() throws ClassCastException {
        return (DepositFundsInstruction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WithdrawFundsInstruction`. If the actual instance is not `WithdrawFundsInstruction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WithdrawFundsInstruction`
     * @throws ClassCastException if the instance is not `WithdrawFundsInstruction`
     */
    public WithdrawFundsInstruction getWithdrawFundsInstruction() throws ClassCastException {
        return (WithdrawFundsInstruction)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GwApiV1ExternalCashTransfersPostRequestInstruction
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with DepositFundsInstruction
        try {
            DepositFundsInstruction.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DepositFundsInstruction failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WithdrawFundsInstruction
        try {
            WithdrawFundsInstruction.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WithdrawFundsInstruction failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for GwApiV1ExternalCashTransfersPostRequestInstruction with oneOf schemas: DepositFundsInstruction, WithdrawFundsInstruction. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of GwApiV1ExternalCashTransfersPostRequestInstruction given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GwApiV1ExternalCashTransfersPostRequestInstruction
     * @throws IOException if the JSON string is invalid with respect to GwApiV1ExternalCashTransfersPostRequestInstruction
     */
    public static GwApiV1ExternalCashTransfersPostRequestInstruction fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GwApiV1ExternalCashTransfersPostRequestInstruction.class);
    }

    /**
     * Convert an instance of GwApiV1ExternalCashTransfersPostRequestInstruction to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

