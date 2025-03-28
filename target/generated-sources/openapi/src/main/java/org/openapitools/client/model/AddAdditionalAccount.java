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
import org.openapitools.client.model.Account;
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.Document;
import org.openapitools.client.model.User;

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
 * AddAdditionalAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AddAdditionalAccount {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  @javax.annotation.Nullable
  private Customer customer;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  @javax.annotation.Nullable
  private Account account;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  @javax.annotation.Nullable
  private List<Document> documents = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  @javax.annotation.Nullable
  private List<User> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public AddAdditionalAccount() {
  }

  public AddAdditionalAccount customer(@javax.annotation.Nullable Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   */
  @javax.annotation.Nullable
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(@javax.annotation.Nullable Customer customer) {
    this.customer = customer;
  }


  public AddAdditionalAccount account(@javax.annotation.Nullable Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable
  public Account getAccount() {
    return account;
  }

  public void setAccount(@javax.annotation.Nullable Account account) {
    this.account = account;
  }


  public AddAdditionalAccount documents(@javax.annotation.Nullable List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public AddAdditionalAccount addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
   */
  @javax.annotation.Nullable
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(@javax.annotation.Nullable List<Document> documents) {
    this.documents = documents;
  }


  public AddAdditionalAccount users(@javax.annotation.Nullable List<User> users) {
    this.users = users;
    return this;
  }

  public AddAdditionalAccount addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @javax.annotation.Nullable
  public List<User> getUsers() {
    return users;
  }

  public void setUsers(@javax.annotation.Nullable List<User> users) {
    this.users = users;
  }


  public AddAdditionalAccount accountId(@javax.annotation.Nullable String accountId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAdditionalAccount addAdditionalAccount = (AddAdditionalAccount) o;
    return Objects.equals(this.customer, addAdditionalAccount.customer) &&
        Objects.equals(this.account, addAdditionalAccount.account) &&
        Objects.equals(this.documents, addAdditionalAccount.documents) &&
        Objects.equals(this.users, addAdditionalAccount.users) &&
        Objects.equals(this.accountId, addAdditionalAccount.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, account, documents, users, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAdditionalAccount {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("account");
    openapiFields.add("documents");
    openapiFields.add("users");
    openapiFields.add("accountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AddAdditionalAccount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddAdditionalAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddAdditionalAccount is not found in the empty JSON string", AddAdditionalAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddAdditionalAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddAdditionalAccount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        Customer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        Account.validateJsonElement(jsonObj.get("account"));
      }
      if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
        JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
        if (jsonArraydocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
          }

          // validate the optional field `documents` (array)
          for (int i = 0; i < jsonArraydocuments.size(); i++) {
            Document.validateJsonElement(jsonArraydocuments.get(i));
          };
        }
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            User.validateJsonElement(jsonArrayusers.get(i));
          };
        }
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddAdditionalAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddAdditionalAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddAdditionalAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddAdditionalAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<AddAdditionalAccount>() {
           @Override
           public void write(JsonWriter out, AddAdditionalAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddAdditionalAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AddAdditionalAccount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AddAdditionalAccount
   * @throws IOException if the JSON string is invalid with respect to AddAdditionalAccount
   */
  public static AddAdditionalAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddAdditionalAccount.class);
  }

  /**
   * Convert an instance of AddAdditionalAccount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

