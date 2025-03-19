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
import java.util.Arrays;
import org.openapitools.client.model.AchInstruction;
import org.openapitools.client.model.AchInstructionClientAccountInfo;
import org.openapitools.client.model.DeleteBankInstruction;
import org.openapitools.client.model.EddaInstruction;
import org.openapitools.client.model.PredefinedDestinationInstruction;
import org.openapitools.client.model.PredefinedDestinationInstructionFinancialInstitution;
import org.openapitools.client.model.TraditionalBankInstructionVerification;



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
public class GwApiV1BankInstructionsPostRequestInstruction extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GwApiV1BankInstructionsPostRequestInstruction.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GwApiV1BankInstructionsPostRequestInstruction.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GwApiV1BankInstructionsPostRequestInstruction' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TraditionalBankInstructionVerification> adapterTraditionalBankInstructionVerification = gson.getDelegateAdapter(this, TypeToken.get(TraditionalBankInstructionVerification.class));
            final TypeAdapter<AchInstruction> adapterAchInstruction = gson.getDelegateAdapter(this, TypeToken.get(AchInstruction.class));
            final TypeAdapter<DeleteBankInstruction> adapterDeleteBankInstruction = gson.getDelegateAdapter(this, TypeToken.get(DeleteBankInstruction.class));
            final TypeAdapter<PredefinedDestinationInstruction> adapterPredefinedDestinationInstruction = gson.getDelegateAdapter(this, TypeToken.get(PredefinedDestinationInstruction.class));
            final TypeAdapter<EddaInstruction> adapterEddaInstruction = gson.getDelegateAdapter(this, TypeToken.get(EddaInstruction.class));

            return (TypeAdapter<T>) new TypeAdapter<GwApiV1BankInstructionsPostRequestInstruction>() {
                @Override
                public void write(JsonWriter out, GwApiV1BankInstructionsPostRequestInstruction value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TraditionalBankInstructionVerification`
                    if (value.getActualInstance() instanceof TraditionalBankInstructionVerification) {
                        JsonElement element = adapterTraditionalBankInstructionVerification.toJsonTree((TraditionalBankInstructionVerification)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `AchInstruction`
                    if (value.getActualInstance() instanceof AchInstruction) {
                        JsonElement element = adapterAchInstruction.toJsonTree((AchInstruction)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `DeleteBankInstruction`
                    if (value.getActualInstance() instanceof DeleteBankInstruction) {
                        JsonElement element = adapterDeleteBankInstruction.toJsonTree((DeleteBankInstruction)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PredefinedDestinationInstruction`
                    if (value.getActualInstance() instanceof PredefinedDestinationInstruction) {
                        JsonElement element = adapterPredefinedDestinationInstruction.toJsonTree((PredefinedDestinationInstruction)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EddaInstruction`
                    if (value.getActualInstance() instanceof EddaInstruction) {
                        JsonElement element = adapterEddaInstruction.toJsonTree((EddaInstruction)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AchInstruction, DeleteBankInstruction, EddaInstruction, PredefinedDestinationInstruction, TraditionalBankInstructionVerification");
                }

                @Override
                public GwApiV1BankInstructionsPostRequestInstruction read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TraditionalBankInstructionVerification
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TraditionalBankInstructionVerification.validateJsonElement(jsonElement);
                        actualAdapter = adapterTraditionalBankInstructionVerification;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TraditionalBankInstructionVerification'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TraditionalBankInstructionVerification failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TraditionalBankInstructionVerification'", e);
                    }
                    // deserialize AchInstruction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AchInstruction.validateJsonElement(jsonElement);
                        actualAdapter = adapterAchInstruction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AchInstruction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AchInstruction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AchInstruction'", e);
                    }
                    // deserialize DeleteBankInstruction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DeleteBankInstruction.validateJsonElement(jsonElement);
                        actualAdapter = adapterDeleteBankInstruction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DeleteBankInstruction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DeleteBankInstruction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DeleteBankInstruction'", e);
                    }
                    // deserialize PredefinedDestinationInstruction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PredefinedDestinationInstruction.validateJsonElement(jsonElement);
                        actualAdapter = adapterPredefinedDestinationInstruction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PredefinedDestinationInstruction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PredefinedDestinationInstruction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PredefinedDestinationInstruction'", e);
                    }
                    // deserialize EddaInstruction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EddaInstruction.validateJsonElement(jsonElement);
                        actualAdapter = adapterEddaInstruction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EddaInstruction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EddaInstruction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EddaInstruction'", e);
                    }

                    if (match == 1) {
                        GwApiV1BankInstructionsPostRequestInstruction ret = new GwApiV1BankInstructionsPostRequestInstruction();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GwApiV1BankInstructionsPostRequestInstruction: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GwApiV1BankInstructionsPostRequestInstruction() {
        super("oneOf", Boolean.FALSE);
    }

    public GwApiV1BankInstructionsPostRequestInstruction(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TraditionalBankInstructionVerification", TraditionalBankInstructionVerification.class);
        schemas.put("AchInstruction", AchInstruction.class);
        schemas.put("DeleteBankInstruction", DeleteBankInstruction.class);
        schemas.put("PredefinedDestinationInstruction", PredefinedDestinationInstruction.class);
        schemas.put("EddaInstruction", EddaInstruction.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GwApiV1BankInstructionsPostRequestInstruction.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AchInstruction, DeleteBankInstruction, EddaInstruction, PredefinedDestinationInstruction, TraditionalBankInstructionVerification
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TraditionalBankInstructionVerification) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AchInstruction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DeleteBankInstruction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PredefinedDestinationInstruction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EddaInstruction) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AchInstruction, DeleteBankInstruction, EddaInstruction, PredefinedDestinationInstruction, TraditionalBankInstructionVerification");
    }

    /**
     * Get the actual instance, which can be the following:
     * AchInstruction, DeleteBankInstruction, EddaInstruction, PredefinedDestinationInstruction, TraditionalBankInstructionVerification
     *
     * @return The actual instance (AchInstruction, DeleteBankInstruction, EddaInstruction, PredefinedDestinationInstruction, TraditionalBankInstructionVerification)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TraditionalBankInstructionVerification`. If the actual instance is not `TraditionalBankInstructionVerification`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TraditionalBankInstructionVerification`
     * @throws ClassCastException if the instance is not `TraditionalBankInstructionVerification`
     */
    public TraditionalBankInstructionVerification getTraditionalBankInstructionVerification() throws ClassCastException {
        return (TraditionalBankInstructionVerification)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AchInstruction`. If the actual instance is not `AchInstruction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AchInstruction`
     * @throws ClassCastException if the instance is not `AchInstruction`
     */
    public AchInstruction getAchInstruction() throws ClassCastException {
        return (AchInstruction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeleteBankInstruction`. If the actual instance is not `DeleteBankInstruction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeleteBankInstruction`
     * @throws ClassCastException if the instance is not `DeleteBankInstruction`
     */
    public DeleteBankInstruction getDeleteBankInstruction() throws ClassCastException {
        return (DeleteBankInstruction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PredefinedDestinationInstruction`. If the actual instance is not `PredefinedDestinationInstruction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PredefinedDestinationInstruction`
     * @throws ClassCastException if the instance is not `PredefinedDestinationInstruction`
     */
    public PredefinedDestinationInstruction getPredefinedDestinationInstruction() throws ClassCastException {
        return (PredefinedDestinationInstruction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EddaInstruction`. If the actual instance is not `EddaInstruction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EddaInstruction`
     * @throws ClassCastException if the instance is not `EddaInstruction`
     */
    public EddaInstruction getEddaInstruction() throws ClassCastException {
        return (EddaInstruction)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GwApiV1BankInstructionsPostRequestInstruction
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with TraditionalBankInstructionVerification
        try {
            TraditionalBankInstructionVerification.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TraditionalBankInstructionVerification failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AchInstruction
        try {
            AchInstruction.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AchInstruction failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with DeleteBankInstruction
        try {
            DeleteBankInstruction.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for DeleteBankInstruction failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PredefinedDestinationInstruction
        try {
            PredefinedDestinationInstruction.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PredefinedDestinationInstruction failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EddaInstruction
        try {
            EddaInstruction.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EddaInstruction failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for GwApiV1BankInstructionsPostRequestInstruction with oneOf schemas: AchInstruction, DeleteBankInstruction, EddaInstruction, PredefinedDestinationInstruction, TraditionalBankInstructionVerification. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of GwApiV1BankInstructionsPostRequestInstruction given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GwApiV1BankInstructionsPostRequestInstruction
     * @throws IOException if the JSON string is invalid with respect to GwApiV1BankInstructionsPostRequestInstruction
     */
    public static GwApiV1BankInstructionsPostRequestInstruction fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GwApiV1BankInstructionsPostRequestInstruction.class);
    }

    /**
     * Convert an instance of GwApiV1BankInstructionsPostRequestInstruction to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

