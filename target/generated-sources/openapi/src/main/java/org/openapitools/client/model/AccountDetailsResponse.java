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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapitools.client.model.AccountData;
import org.openapitools.client.model.AssociatedEntity;
import org.openapitools.client.model.AssociatedPerson;
import org.openapitools.client.model.EntityIRABene;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.IndividualIRABene;
import org.openapitools.client.model.RestrictionInfo;

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
 * AccountDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class AccountDetailsResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @javax.annotation.Nullable
  private ErrorResponse error;

  public static final String SERIALIZED_NAME_HAS_ERROR = "hasError";
  @SerializedName(SERIALIZED_NAME_HAS_ERROR)
  @javax.annotation.Nullable
  private Boolean hasError;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "errorDescription";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  @javax.annotation.Nullable
  private String errorDescription;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  @javax.annotation.Nullable
  private AccountData account;

  public static final String SERIALIZED_NAME_ASSOCIATED_PERSONS = "associatedPersons";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_PERSONS)
  @javax.annotation.Nullable
  private List<AssociatedPerson> associatedPersons = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSOCIATED_ENTITIES = "associatedEntities";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_ENTITIES)
  @javax.annotation.Nullable
  private List<AssociatedEntity> associatedEntities = new ArrayList<>();

  public static final String SERIALIZED_NAME_WITH_HOLDING_STATEMENT = "withHoldingStatement";
  @SerializedName(SERIALIZED_NAME_WITH_HOLDING_STATEMENT)
  @javax.annotation.Nullable
  private Map<String, String> withHoldingStatement = new HashMap<>();

  public static final String SERIALIZED_NAME_MARKET_DATA = "marketData";
  @SerializedName(SERIALIZED_NAME_MARKET_DATA)
  @javax.annotation.Nullable
  private List<Map<String, String>> marketData = new ArrayList<>();

  public static final String SERIALIZED_NAME_FINANCIAL_INFORMATION = "financialInformation";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INFORMATION)
  @javax.annotation.Nullable
  private Map<String, Object> financialInformation = new HashMap<>();

  public static final String SERIALIZED_NAME_SOURCES_OF_WEALTH = "sourcesOfWealth";
  @SerializedName(SERIALIZED_NAME_SOURCES_OF_WEALTH)
  @javax.annotation.Nullable
  private List<Map<String, Object>> sourcesOfWealth = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRADE_BUNDLES = "tradeBundles";
  @SerializedName(SERIALIZED_NAME_TRADE_BUNDLES)
  @javax.annotation.Nullable
  private List<String> tradeBundles = new ArrayList<>();

  public static final String SERIALIZED_NAME_INDIVIDUAL_I_R_A_BENEFICIARIES = "individualIRABeneficiaries";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_I_R_A_BENEFICIARIES)
  @javax.annotation.Nullable
  private List<IndividualIRABene> individualIRABeneficiaries = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITY_I_R_A_BENEFICIARIES = "entityIRABeneficiaries";
  @SerializedName(SERIALIZED_NAME_ENTITY_I_R_A_BENEFICIARIES)
  @javax.annotation.Nullable
  private List<EntityIRABene> entityIRABeneficiaries = new ArrayList<>();

  public static final String SERIALIZED_NAME_DECEDENTS = "decedents";
  @SerializedName(SERIALIZED_NAME_DECEDENTS)
  @javax.annotation.Nullable
  private List<Map<String, String>> decedents = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  @javax.annotation.Nullable
  private Set<RestrictionInfo> restrictions = new LinkedHashSet<>();

  public AccountDetailsResponse() {
  }

  public AccountDetailsResponse error(@javax.annotation.Nullable ErrorResponse error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public ErrorResponse getError() {
    return error;
  }

  public void setError(@javax.annotation.Nullable ErrorResponse error) {
    this.error = error;
  }


  public AccountDetailsResponse hasError(@javax.annotation.Nullable Boolean hasError) {
    this.hasError = hasError;
    return this;
  }

  /**
   * Get hasError
   * @return hasError
   */
  @javax.annotation.Nullable
  public Boolean getHasError() {
    return hasError;
  }

  public void setHasError(@javax.annotation.Nullable Boolean hasError) {
    this.hasError = hasError;
  }


  public AccountDetailsResponse errorDescription(@javax.annotation.Nullable String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
   */
  @javax.annotation.Nullable
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(@javax.annotation.Nullable String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public AccountDetailsResponse account(@javax.annotation.Nullable AccountData account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable
  public AccountData getAccount() {
    return account;
  }

  public void setAccount(@javax.annotation.Nullable AccountData account) {
    this.account = account;
  }


  public AccountDetailsResponse associatedPersons(@javax.annotation.Nullable List<AssociatedPerson> associatedPersons) {
    this.associatedPersons = associatedPersons;
    return this;
  }

  public AccountDetailsResponse addAssociatedPersonsItem(AssociatedPerson associatedPersonsItem) {
    if (this.associatedPersons == null) {
      this.associatedPersons = new ArrayList<>();
    }
    this.associatedPersons.add(associatedPersonsItem);
    return this;
  }

  /**
   * Get associatedPersons
   * @return associatedPersons
   */
  @javax.annotation.Nullable
  public List<AssociatedPerson> getAssociatedPersons() {
    return associatedPersons;
  }

  public void setAssociatedPersons(@javax.annotation.Nullable List<AssociatedPerson> associatedPersons) {
    this.associatedPersons = associatedPersons;
  }


  public AccountDetailsResponse associatedEntities(@javax.annotation.Nullable List<AssociatedEntity> associatedEntities) {
    this.associatedEntities = associatedEntities;
    return this;
  }

  public AccountDetailsResponse addAssociatedEntitiesItem(AssociatedEntity associatedEntitiesItem) {
    if (this.associatedEntities == null) {
      this.associatedEntities = new ArrayList<>();
    }
    this.associatedEntities.add(associatedEntitiesItem);
    return this;
  }

  /**
   * Get associatedEntities
   * @return associatedEntities
   */
  @javax.annotation.Nullable
  public List<AssociatedEntity> getAssociatedEntities() {
    return associatedEntities;
  }

  public void setAssociatedEntities(@javax.annotation.Nullable List<AssociatedEntity> associatedEntities) {
    this.associatedEntities = associatedEntities;
  }


  public AccountDetailsResponse withHoldingStatement(@javax.annotation.Nullable Map<String, String> withHoldingStatement) {
    this.withHoldingStatement = withHoldingStatement;
    return this;
  }

  public AccountDetailsResponse putWithHoldingStatementItem(String key, String withHoldingStatementItem) {
    if (this.withHoldingStatement == null) {
      this.withHoldingStatement = new HashMap<>();
    }
    this.withHoldingStatement.put(key, withHoldingStatementItem);
    return this;
  }

  /**
   * Get withHoldingStatement
   * @return withHoldingStatement
   */
  @javax.annotation.Nullable
  public Map<String, String> getWithHoldingStatement() {
    return withHoldingStatement;
  }

  public void setWithHoldingStatement(@javax.annotation.Nullable Map<String, String> withHoldingStatement) {
    this.withHoldingStatement = withHoldingStatement;
  }


  public AccountDetailsResponse marketData(@javax.annotation.Nullable List<Map<String, String>> marketData) {
    this.marketData = marketData;
    return this;
  }

  public AccountDetailsResponse addMarketDataItem(Map<String, String> marketDataItem) {
    if (this.marketData == null) {
      this.marketData = new ArrayList<>();
    }
    this.marketData.add(marketDataItem);
    return this;
  }

  /**
   * Get marketData
   * @return marketData
   */
  @javax.annotation.Nullable
  public List<Map<String, String>> getMarketData() {
    return marketData;
  }

  public void setMarketData(@javax.annotation.Nullable List<Map<String, String>> marketData) {
    this.marketData = marketData;
  }


  public AccountDetailsResponse financialInformation(@javax.annotation.Nullable Map<String, Object> financialInformation) {
    this.financialInformation = financialInformation;
    return this;
  }

  public AccountDetailsResponse putFinancialInformationItem(String key, Object financialInformationItem) {
    if (this.financialInformation == null) {
      this.financialInformation = new HashMap<>();
    }
    this.financialInformation.put(key, financialInformationItem);
    return this;
  }

  /**
   * Get financialInformation
   * @return financialInformation
   */
  @javax.annotation.Nullable
  public Map<String, Object> getFinancialInformation() {
    return financialInformation;
  }

  public void setFinancialInformation(@javax.annotation.Nullable Map<String, Object> financialInformation) {
    this.financialInformation = financialInformation;
  }


  public AccountDetailsResponse sourcesOfWealth(@javax.annotation.Nullable List<Map<String, Object>> sourcesOfWealth) {
    this.sourcesOfWealth = sourcesOfWealth;
    return this;
  }

  public AccountDetailsResponse addSourcesOfWealthItem(Map<String, Object> sourcesOfWealthItem) {
    if (this.sourcesOfWealth == null) {
      this.sourcesOfWealth = new ArrayList<>();
    }
    this.sourcesOfWealth.add(sourcesOfWealthItem);
    return this;
  }

  /**
   * Get sourcesOfWealth
   * @return sourcesOfWealth
   */
  @javax.annotation.Nullable
  public List<Map<String, Object>> getSourcesOfWealth() {
    return sourcesOfWealth;
  }

  public void setSourcesOfWealth(@javax.annotation.Nullable List<Map<String, Object>> sourcesOfWealth) {
    this.sourcesOfWealth = sourcesOfWealth;
  }


  public AccountDetailsResponse tradeBundles(@javax.annotation.Nullable List<String> tradeBundles) {
    this.tradeBundles = tradeBundles;
    return this;
  }

  public AccountDetailsResponse addTradeBundlesItem(String tradeBundlesItem) {
    if (this.tradeBundles == null) {
      this.tradeBundles = new ArrayList<>();
    }
    this.tradeBundles.add(tradeBundlesItem);
    return this;
  }

  /**
   * Get tradeBundles
   * @return tradeBundles
   */
  @javax.annotation.Nullable
  public List<String> getTradeBundles() {
    return tradeBundles;
  }

  public void setTradeBundles(@javax.annotation.Nullable List<String> tradeBundles) {
    this.tradeBundles = tradeBundles;
  }


  public AccountDetailsResponse individualIRABeneficiaries(@javax.annotation.Nullable List<IndividualIRABene> individualIRABeneficiaries) {
    this.individualIRABeneficiaries = individualIRABeneficiaries;
    return this;
  }

  public AccountDetailsResponse addIndividualIRABeneficiariesItem(IndividualIRABene individualIRABeneficiariesItem) {
    if (this.individualIRABeneficiaries == null) {
      this.individualIRABeneficiaries = new ArrayList<>();
    }
    this.individualIRABeneficiaries.add(individualIRABeneficiariesItem);
    return this;
  }

  /**
   * Get individualIRABeneficiaries
   * @return individualIRABeneficiaries
   */
  @javax.annotation.Nullable
  public List<IndividualIRABene> getIndividualIRABeneficiaries() {
    return individualIRABeneficiaries;
  }

  public void setIndividualIRABeneficiaries(@javax.annotation.Nullable List<IndividualIRABene> individualIRABeneficiaries) {
    this.individualIRABeneficiaries = individualIRABeneficiaries;
  }


  public AccountDetailsResponse entityIRABeneficiaries(@javax.annotation.Nullable List<EntityIRABene> entityIRABeneficiaries) {
    this.entityIRABeneficiaries = entityIRABeneficiaries;
    return this;
  }

  public AccountDetailsResponse addEntityIRABeneficiariesItem(EntityIRABene entityIRABeneficiariesItem) {
    if (this.entityIRABeneficiaries == null) {
      this.entityIRABeneficiaries = new ArrayList<>();
    }
    this.entityIRABeneficiaries.add(entityIRABeneficiariesItem);
    return this;
  }

  /**
   * Get entityIRABeneficiaries
   * @return entityIRABeneficiaries
   */
  @javax.annotation.Nullable
  public List<EntityIRABene> getEntityIRABeneficiaries() {
    return entityIRABeneficiaries;
  }

  public void setEntityIRABeneficiaries(@javax.annotation.Nullable List<EntityIRABene> entityIRABeneficiaries) {
    this.entityIRABeneficiaries = entityIRABeneficiaries;
  }


  public AccountDetailsResponse decedents(@javax.annotation.Nullable List<Map<String, String>> decedents) {
    this.decedents = decedents;
    return this;
  }

  public AccountDetailsResponse addDecedentsItem(Map<String, String> decedentsItem) {
    if (this.decedents == null) {
      this.decedents = new ArrayList<>();
    }
    this.decedents.add(decedentsItem);
    return this;
  }

  /**
   * Get decedents
   * @return decedents
   */
  @javax.annotation.Nullable
  public List<Map<String, String>> getDecedents() {
    return decedents;
  }

  public void setDecedents(@javax.annotation.Nullable List<Map<String, String>> decedents) {
    this.decedents = decedents;
  }


  public AccountDetailsResponse restrictions(@javax.annotation.Nullable Set<RestrictionInfo> restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  public AccountDetailsResponse addRestrictionsItem(RestrictionInfo restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new LinkedHashSet<>();
    }
    this.restrictions.add(restrictionsItem);
    return this;
  }

  /**
   * Get restrictions
   * @return restrictions
   */
  @javax.annotation.Nullable
  public Set<RestrictionInfo> getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(@javax.annotation.Nullable Set<RestrictionInfo> restrictions) {
    this.restrictions = restrictions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsResponse accountDetailsResponse = (AccountDetailsResponse) o;
    return Objects.equals(this.error, accountDetailsResponse.error) &&
        Objects.equals(this.hasError, accountDetailsResponse.hasError) &&
        Objects.equals(this.errorDescription, accountDetailsResponse.errorDescription) &&
        Objects.equals(this.account, accountDetailsResponse.account) &&
        Objects.equals(this.associatedPersons, accountDetailsResponse.associatedPersons) &&
        Objects.equals(this.associatedEntities, accountDetailsResponse.associatedEntities) &&
        Objects.equals(this.withHoldingStatement, accountDetailsResponse.withHoldingStatement) &&
        Objects.equals(this.marketData, accountDetailsResponse.marketData) &&
        Objects.equals(this.financialInformation, accountDetailsResponse.financialInformation) &&
        Objects.equals(this.sourcesOfWealth, accountDetailsResponse.sourcesOfWealth) &&
        Objects.equals(this.tradeBundles, accountDetailsResponse.tradeBundles) &&
        Objects.equals(this.individualIRABeneficiaries, accountDetailsResponse.individualIRABeneficiaries) &&
        Objects.equals(this.entityIRABeneficiaries, accountDetailsResponse.entityIRABeneficiaries) &&
        Objects.equals(this.decedents, accountDetailsResponse.decedents) &&
        Objects.equals(this.restrictions, accountDetailsResponse.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, hasError, errorDescription, account, associatedPersons, associatedEntities, withHoldingStatement, marketData, financialInformation, sourcesOfWealth, tradeBundles, individualIRABeneficiaries, entityIRABeneficiaries, decedents, restrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hasError: ").append(toIndentedString(hasError)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    associatedPersons: ").append(toIndentedString(associatedPersons)).append("\n");
    sb.append("    associatedEntities: ").append(toIndentedString(associatedEntities)).append("\n");
    sb.append("    withHoldingStatement: ").append(toIndentedString(withHoldingStatement)).append("\n");
    sb.append("    marketData: ").append(toIndentedString(marketData)).append("\n");
    sb.append("    financialInformation: ").append(toIndentedString(financialInformation)).append("\n");
    sb.append("    sourcesOfWealth: ").append(toIndentedString(sourcesOfWealth)).append("\n");
    sb.append("    tradeBundles: ").append(toIndentedString(tradeBundles)).append("\n");
    sb.append("    individualIRABeneficiaries: ").append(toIndentedString(individualIRABeneficiaries)).append("\n");
    sb.append("    entityIRABeneficiaries: ").append(toIndentedString(entityIRABeneficiaries)).append("\n");
    sb.append("    decedents: ").append(toIndentedString(decedents)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("hasError");
    openapiFields.add("errorDescription");
    openapiFields.add("account");
    openapiFields.add("associatedPersons");
    openapiFields.add("associatedEntities");
    openapiFields.add("withHoldingStatement");
    openapiFields.add("marketData");
    openapiFields.add("financialInformation");
    openapiFields.add("sourcesOfWealth");
    openapiFields.add("tradeBundles");
    openapiFields.add("individualIRABeneficiaries");
    openapiFields.add("entityIRABeneficiaries");
    openapiFields.add("decedents");
    openapiFields.add("restrictions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountDetailsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDetailsResponse is not found in the empty JSON string", AccountDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        ErrorResponse.validateJsonElement(jsonObj.get("error"));
      }
      if ((jsonObj.get("errorDescription") != null && !jsonObj.get("errorDescription").isJsonNull()) && !jsonObj.get("errorDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDescription").toString()));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        AccountData.validateJsonElement(jsonObj.get("account"));
      }
      if (jsonObj.get("associatedPersons") != null && !jsonObj.get("associatedPersons").isJsonNull()) {
        JsonArray jsonArrayassociatedPersons = jsonObj.getAsJsonArray("associatedPersons");
        if (jsonArrayassociatedPersons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associatedPersons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associatedPersons` to be an array in the JSON string but got `%s`", jsonObj.get("associatedPersons").toString()));
          }

          // validate the optional field `associatedPersons` (array)
          for (int i = 0; i < jsonArrayassociatedPersons.size(); i++) {
            AssociatedPerson.validateJsonElement(jsonArrayassociatedPersons.get(i));
          };
        }
      }
      if (jsonObj.get("associatedEntities") != null && !jsonObj.get("associatedEntities").isJsonNull()) {
        JsonArray jsonArrayassociatedEntities = jsonObj.getAsJsonArray("associatedEntities");
        if (jsonArrayassociatedEntities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associatedEntities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associatedEntities` to be an array in the JSON string but got `%s`", jsonObj.get("associatedEntities").toString()));
          }

          // validate the optional field `associatedEntities` (array)
          for (int i = 0; i < jsonArrayassociatedEntities.size(); i++) {
            AssociatedEntity.validateJsonElement(jsonArrayassociatedEntities.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("marketData") != null && !jsonObj.get("marketData").isJsonNull() && !jsonObj.get("marketData").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketData` to be an array in the JSON string but got `%s`", jsonObj.get("marketData").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sourcesOfWealth") != null && !jsonObj.get("sourcesOfWealth").isJsonNull() && !jsonObj.get("sourcesOfWealth").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourcesOfWealth` to be an array in the JSON string but got `%s`", jsonObj.get("sourcesOfWealth").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tradeBundles") != null && !jsonObj.get("tradeBundles").isJsonNull() && !jsonObj.get("tradeBundles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tradeBundles` to be an array in the JSON string but got `%s`", jsonObj.get("tradeBundles").toString()));
      }
      if (jsonObj.get("individualIRABeneficiaries") != null && !jsonObj.get("individualIRABeneficiaries").isJsonNull()) {
        JsonArray jsonArrayindividualIRABeneficiaries = jsonObj.getAsJsonArray("individualIRABeneficiaries");
        if (jsonArrayindividualIRABeneficiaries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("individualIRABeneficiaries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `individualIRABeneficiaries` to be an array in the JSON string but got `%s`", jsonObj.get("individualIRABeneficiaries").toString()));
          }

          // validate the optional field `individualIRABeneficiaries` (array)
          for (int i = 0; i < jsonArrayindividualIRABeneficiaries.size(); i++) {
            IndividualIRABene.validateJsonElement(jsonArrayindividualIRABeneficiaries.get(i));
          };
        }
      }
      if (jsonObj.get("entityIRABeneficiaries") != null && !jsonObj.get("entityIRABeneficiaries").isJsonNull()) {
        JsonArray jsonArrayentityIRABeneficiaries = jsonObj.getAsJsonArray("entityIRABeneficiaries");
        if (jsonArrayentityIRABeneficiaries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entityIRABeneficiaries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entityIRABeneficiaries` to be an array in the JSON string but got `%s`", jsonObj.get("entityIRABeneficiaries").toString()));
          }

          // validate the optional field `entityIRABeneficiaries` (array)
          for (int i = 0; i < jsonArrayentityIRABeneficiaries.size(); i++) {
            EntityIRABene.validateJsonElement(jsonArrayentityIRABeneficiaries.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("decedents") != null && !jsonObj.get("decedents").isJsonNull() && !jsonObj.get("decedents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `decedents` to be an array in the JSON string but got `%s`", jsonObj.get("decedents").toString()));
      }
      if (jsonObj.get("restrictions") != null && !jsonObj.get("restrictions").isJsonNull()) {
        JsonArray jsonArrayrestrictions = jsonObj.getAsJsonArray("restrictions");
        if (jsonArrayrestrictions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restrictions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restrictions` to be an array in the JSON string but got `%s`", jsonObj.get("restrictions").toString()));
          }

          // validate the optional field `restrictions` (array)
          for (int i = 0; i < jsonArrayrestrictions.size(); i++) {
            RestrictionInfo.validateJsonElement(jsonArrayrestrictions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDetailsResponse>() {
           @Override
           public void write(JsonWriter out, AccountDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccountDetailsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountDetailsResponse
   * @throws IOException if the JSON string is invalid with respect to AccountDetailsResponse
   */
  public static AccountDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDetailsResponse.class);
  }

  /**
   * Convert an instance of AccountDetailsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

