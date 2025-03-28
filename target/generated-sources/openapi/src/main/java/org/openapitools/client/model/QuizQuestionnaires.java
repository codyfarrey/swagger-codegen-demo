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
import org.openapitools.client.model.Questionnaire;
import org.openapitools.client.model.Task;

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
 * QuizQuestionnaires
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class QuizQuestionnaires {
  public static final String SERIALIZED_NAME_QUESTIONNAIRE = "questionnaire";
  @SerializedName(SERIALIZED_NAME_QUESTIONNAIRE)
  @javax.annotation.Nullable
  private List<Questionnaire> questionnaire = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_TASK = "task";
  @SerializedName(SERIALIZED_NAME_TASK)
  @javax.annotation.Nullable
  private List<Task> task = new ArrayList<>();

  public QuizQuestionnaires() {
  }

  public QuizQuestionnaires questionnaire(@javax.annotation.Nullable List<Questionnaire> questionnaire) {
    this.questionnaire = questionnaire;
    return this;
  }

  public QuizQuestionnaires addQuestionnaireItem(Questionnaire questionnaireItem) {
    if (this.questionnaire == null) {
      this.questionnaire = new ArrayList<>();
    }
    this.questionnaire.add(questionnaireItem);
    return this;
  }

  /**
   * Get questionnaire
   * @return questionnaire
   */
  @javax.annotation.Nullable
  public List<Questionnaire> getQuestionnaire() {
    return questionnaire;
  }

  public void setQuestionnaire(@javax.annotation.Nullable List<Questionnaire> questionnaire) {
    this.questionnaire = questionnaire;
  }


  public QuizQuestionnaires accountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public QuizQuestionnaires task(@javax.annotation.Nullable List<Task> task) {
    this.task = task;
    return this;
  }

  public QuizQuestionnaires addTaskItem(Task taskItem) {
    if (this.task == null) {
      this.task = new ArrayList<>();
    }
    this.task.add(taskItem);
    return this;
  }

  /**
   * Get task
   * @return task
   */
  @javax.annotation.Nullable
  public List<Task> getTask() {
    return task;
  }

  public void setTask(@javax.annotation.Nullable List<Task> task) {
    this.task = task;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizQuestionnaires quizQuestionnaires = (QuizQuestionnaires) o;
    return Objects.equals(this.questionnaire, quizQuestionnaires.questionnaire) &&
        Objects.equals(this.accountId, quizQuestionnaires.accountId) &&
        Objects.equals(this.task, quizQuestionnaires.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionnaire, accountId, task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizQuestionnaires {\n");
    sb.append("    questionnaire: ").append(toIndentedString(questionnaire)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
    openapiFields.add("questionnaire");
    openapiFields.add("accountId");
    openapiFields.add("task");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuizQuestionnaires
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuizQuestionnaires.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuizQuestionnaires is not found in the empty JSON string", QuizQuestionnaires.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuizQuestionnaires.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuizQuestionnaires` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("questionnaire") != null && !jsonObj.get("questionnaire").isJsonNull()) {
        JsonArray jsonArrayquestionnaire = jsonObj.getAsJsonArray("questionnaire");
        if (jsonArrayquestionnaire != null) {
          // ensure the json data is an array
          if (!jsonObj.get("questionnaire").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `questionnaire` to be an array in the JSON string but got `%s`", jsonObj.get("questionnaire").toString()));
          }

          // validate the optional field `questionnaire` (array)
          for (int i = 0; i < jsonArrayquestionnaire.size(); i++) {
            Questionnaire.validateJsonElement(jsonArrayquestionnaire.get(i));
          };
        }
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if (jsonObj.get("task") != null && !jsonObj.get("task").isJsonNull()) {
        JsonArray jsonArraytask = jsonObj.getAsJsonArray("task");
        if (jsonArraytask != null) {
          // ensure the json data is an array
          if (!jsonObj.get("task").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `task` to be an array in the JSON string but got `%s`", jsonObj.get("task").toString()));
          }

          // validate the optional field `task` (array)
          for (int i = 0; i < jsonArraytask.size(); i++) {
            Task.validateJsonElement(jsonArraytask.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuizQuestionnaires.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuizQuestionnaires' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuizQuestionnaires> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuizQuestionnaires.class));

       return (TypeAdapter<T>) new TypeAdapter<QuizQuestionnaires>() {
           @Override
           public void write(JsonWriter out, QuizQuestionnaires value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuizQuestionnaires read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuizQuestionnaires given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuizQuestionnaires
   * @throws IOException if the JSON string is invalid with respect to QuizQuestionnaires
   */
  public static QuizQuestionnaires fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuizQuestionnaires.class);
  }

  /**
   * Convert an instance of QuizQuestionnaires to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

