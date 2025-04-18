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
import org.openapitools.client.model.AccreditedInvestorInformation;
import org.openapitools.client.model.AssociationTypeEntities;
import org.openapitools.client.model.FinancialInformation;
import org.openapitools.client.model.FormW8BENE;
import org.openapitools.client.model.FormW8IMY;
import org.openapitools.client.model.RegulatedMembership;
import org.openapitools.client.model.RegulatoryInformation;
import org.openapitools.client.model.TaxResidency;
import org.openapitools.client.model.TrustIdentification;
import org.openapitools.client.model.TrusteesType;
import org.openapitools.client.model.WithholdingStatementType;

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
 * TrustApplicant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class TrustApplicant {
  public static final String SERIALIZED_NAME_IDENTIFICATION = "identification";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION)
  @javax.annotation.Nullable
  private List<TrustIdentification> identification = new ArrayList<>();

  public static final String SERIALIZED_NAME_FINANCIAL_INFORMATION = "financialInformation";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INFORMATION)
  @javax.annotation.Nullable
  private List<FinancialInformation> financialInformation = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGULATORY_INFORMATION = "regulatoryInformation";
  @SerializedName(SERIALIZED_NAME_REGULATORY_INFORMATION)
  @javax.annotation.Nullable
  private List<RegulatoryInformation> regulatoryInformation = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGULATED_MEMBERSHIPS = "regulatedMemberships";
  @SerializedName(SERIALIZED_NAME_REGULATED_MEMBERSHIPS)
  @javax.annotation.Nullable
  private List<RegulatedMembership> regulatedMemberships = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCREDITED_INVESTOR_INFORMATION = "accreditedInvestorInformation";
  @SerializedName(SERIALIZED_NAME_ACCREDITED_INVESTOR_INFORMATION)
  @javax.annotation.Nullable
  private AccreditedInvestorInformation accreditedInvestorInformation;

  public static final String SERIALIZED_NAME_TRUSTEES = "trustees";
  @SerializedName(SERIALIZED_NAME_TRUSTEES)
  @javax.annotation.Nullable
  private TrusteesType trustees;

  public static final String SERIALIZED_NAME_BENEFICIARIES = "beneficiaries";
  @SerializedName(SERIALIZED_NAME_BENEFICIARIES)
  @javax.annotation.Nullable
  private AssociationTypeEntities beneficiaries;

  public static final String SERIALIZED_NAME_GRANTORS = "grantors";
  @SerializedName(SERIALIZED_NAME_GRANTORS)
  @javax.annotation.Nullable
  private AssociationTypeEntities grantors;

  public static final String SERIALIZED_NAME_TAX_RESIDENCIES = "taxResidencies";
  @SerializedName(SERIALIZED_NAME_TAX_RESIDENCIES)
  @javax.annotation.Nullable
  private List<TaxResidency> taxResidencies = new ArrayList<>();

  public static final String SERIALIZED_NAME_W8_BEN_E = "w8BenE";
  @SerializedName(SERIALIZED_NAME_W8_BEN_E)
  @javax.annotation.Nullable
  private FormW8BENE w8BenE;

  public static final String SERIALIZED_NAME_W8_I_M_Y = "w8IMY";
  @SerializedName(SERIALIZED_NAME_W8_I_M_Y)
  @javax.annotation.Nullable
  private FormW8IMY w8IMY;

  public static final String SERIALIZED_NAME_WITHHOLDING_STATEMENT = "withholdingStatement";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_STATEMENT)
  @javax.annotation.Nullable
  private WithholdingStatementType withholdingStatement;

  public static final String SERIALIZED_NAME_THIRD_PARTY_MANAGEMENT = "thirdPartyManagement";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_MANAGEMENT)
  @javax.annotation.Nullable
  private Boolean thirdPartyManagement;

  /**
   * Gets or Sets trustType
   */
  @JsonAdapter(TrustTypeEnum.Adapter.class)
  public enum TrustTypeEnum {
    COMPLEX_TRUST("COMPLEX_TRUST"),
    
    SINGLE_TRUST("SINGLE_TRUST"),
    
    GRANTOR_TRUST("GRANTOR_TRUST"),
    
    US_TAXABLE_TRUST("US_TAXABLE_TRUST");

    private String value;

    TrustTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrustTypeEnum fromValue(String value) {
      for (TrustTypeEnum b : TrustTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TrustTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrustTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrustTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TrustTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TrustTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TRUST_TYPE = "trustType";
  @SerializedName(SERIALIZED_NAME_TRUST_TYPE)
  @javax.annotation.Nullable
  private TrustTypeEnum trustType;

  public TrustApplicant() {
  }

  public TrustApplicant identification(@javax.annotation.Nullable List<TrustIdentification> identification) {
    this.identification = identification;
    return this;
  }

  public TrustApplicant addIdentificationItem(TrustIdentification identificationItem) {
    if (this.identification == null) {
      this.identification = new ArrayList<>();
    }
    this.identification.add(identificationItem);
    return this;
  }

  /**
   * Get identification
   * @return identification
   */
  @javax.annotation.Nullable
  public List<TrustIdentification> getIdentification() {
    return identification;
  }

  public void setIdentification(@javax.annotation.Nullable List<TrustIdentification> identification) {
    this.identification = identification;
  }


  public TrustApplicant financialInformation(@javax.annotation.Nullable List<FinancialInformation> financialInformation) {
    this.financialInformation = financialInformation;
    return this;
  }

  public TrustApplicant addFinancialInformationItem(FinancialInformation financialInformationItem) {
    if (this.financialInformation == null) {
      this.financialInformation = new ArrayList<>();
    }
    this.financialInformation.add(financialInformationItem);
    return this;
  }

  /**
   * Get financialInformation
   * @return financialInformation
   */
  @javax.annotation.Nullable
  public List<FinancialInformation> getFinancialInformation() {
    return financialInformation;
  }

  public void setFinancialInformation(@javax.annotation.Nullable List<FinancialInformation> financialInformation) {
    this.financialInformation = financialInformation;
  }


  public TrustApplicant regulatoryInformation(@javax.annotation.Nullable List<RegulatoryInformation> regulatoryInformation) {
    this.regulatoryInformation = regulatoryInformation;
    return this;
  }

  public TrustApplicant addRegulatoryInformationItem(RegulatoryInformation regulatoryInformationItem) {
    if (this.regulatoryInformation == null) {
      this.regulatoryInformation = new ArrayList<>();
    }
    this.regulatoryInformation.add(regulatoryInformationItem);
    return this;
  }

  /**
   * Get regulatoryInformation
   * @return regulatoryInformation
   */
  @javax.annotation.Nullable
  public List<RegulatoryInformation> getRegulatoryInformation() {
    return regulatoryInformation;
  }

  public void setRegulatoryInformation(@javax.annotation.Nullable List<RegulatoryInformation> regulatoryInformation) {
    this.regulatoryInformation = regulatoryInformation;
  }


  public TrustApplicant regulatedMemberships(@javax.annotation.Nullable List<RegulatedMembership> regulatedMemberships) {
    this.regulatedMemberships = regulatedMemberships;
    return this;
  }

  public TrustApplicant addRegulatedMembershipsItem(RegulatedMembership regulatedMembershipsItem) {
    if (this.regulatedMemberships == null) {
      this.regulatedMemberships = new ArrayList<>();
    }
    this.regulatedMemberships.add(regulatedMembershipsItem);
    return this;
  }

  /**
   * Get regulatedMemberships
   * @return regulatedMemberships
   */
  @javax.annotation.Nullable
  public List<RegulatedMembership> getRegulatedMemberships() {
    return regulatedMemberships;
  }

  public void setRegulatedMemberships(@javax.annotation.Nullable List<RegulatedMembership> regulatedMemberships) {
    this.regulatedMemberships = regulatedMemberships;
  }


  public TrustApplicant accreditedInvestorInformation(@javax.annotation.Nullable AccreditedInvestorInformation accreditedInvestorInformation) {
    this.accreditedInvestorInformation = accreditedInvestorInformation;
    return this;
  }

  /**
   * Get accreditedInvestorInformation
   * @return accreditedInvestorInformation
   */
  @javax.annotation.Nullable
  public AccreditedInvestorInformation getAccreditedInvestorInformation() {
    return accreditedInvestorInformation;
  }

  public void setAccreditedInvestorInformation(@javax.annotation.Nullable AccreditedInvestorInformation accreditedInvestorInformation) {
    this.accreditedInvestorInformation = accreditedInvestorInformation;
  }


  public TrustApplicant trustees(@javax.annotation.Nullable TrusteesType trustees) {
    this.trustees = trustees;
    return this;
  }

  /**
   * Get trustees
   * @return trustees
   */
  @javax.annotation.Nullable
  public TrusteesType getTrustees() {
    return trustees;
  }

  public void setTrustees(@javax.annotation.Nullable TrusteesType trustees) {
    this.trustees = trustees;
  }


  public TrustApplicant beneficiaries(@javax.annotation.Nullable AssociationTypeEntities beneficiaries) {
    this.beneficiaries = beneficiaries;
    return this;
  }

  /**
   * Get beneficiaries
   * @return beneficiaries
   */
  @javax.annotation.Nullable
  public AssociationTypeEntities getBeneficiaries() {
    return beneficiaries;
  }

  public void setBeneficiaries(@javax.annotation.Nullable AssociationTypeEntities beneficiaries) {
    this.beneficiaries = beneficiaries;
  }


  public TrustApplicant grantors(@javax.annotation.Nullable AssociationTypeEntities grantors) {
    this.grantors = grantors;
    return this;
  }

  /**
   * Get grantors
   * @return grantors
   */
  @javax.annotation.Nullable
  public AssociationTypeEntities getGrantors() {
    return grantors;
  }

  public void setGrantors(@javax.annotation.Nullable AssociationTypeEntities grantors) {
    this.grantors = grantors;
  }


  public TrustApplicant taxResidencies(@javax.annotation.Nullable List<TaxResidency> taxResidencies) {
    this.taxResidencies = taxResidencies;
    return this;
  }

  public TrustApplicant addTaxResidenciesItem(TaxResidency taxResidenciesItem) {
    if (this.taxResidencies == null) {
      this.taxResidencies = new ArrayList<>();
    }
    this.taxResidencies.add(taxResidenciesItem);
    return this;
  }

  /**
   * Get taxResidencies
   * @return taxResidencies
   */
  @javax.annotation.Nullable
  public List<TaxResidency> getTaxResidencies() {
    return taxResidencies;
  }

  public void setTaxResidencies(@javax.annotation.Nullable List<TaxResidency> taxResidencies) {
    this.taxResidencies = taxResidencies;
  }


  public TrustApplicant w8BenE(@javax.annotation.Nullable FormW8BENE w8BenE) {
    this.w8BenE = w8BenE;
    return this;
  }

  /**
   * Get w8BenE
   * @return w8BenE
   */
  @javax.annotation.Nullable
  public FormW8BENE getW8BenE() {
    return w8BenE;
  }

  public void setW8BenE(@javax.annotation.Nullable FormW8BENE w8BenE) {
    this.w8BenE = w8BenE;
  }


  public TrustApplicant w8IMY(@javax.annotation.Nullable FormW8IMY w8IMY) {
    this.w8IMY = w8IMY;
    return this;
  }

  /**
   * Get w8IMY
   * @return w8IMY
   */
  @javax.annotation.Nullable
  public FormW8IMY getW8IMY() {
    return w8IMY;
  }

  public void setW8IMY(@javax.annotation.Nullable FormW8IMY w8IMY) {
    this.w8IMY = w8IMY;
  }


  public TrustApplicant withholdingStatement(@javax.annotation.Nullable WithholdingStatementType withholdingStatement) {
    this.withholdingStatement = withholdingStatement;
    return this;
  }

  /**
   * Get withholdingStatement
   * @return withholdingStatement
   */
  @javax.annotation.Nullable
  public WithholdingStatementType getWithholdingStatement() {
    return withholdingStatement;
  }

  public void setWithholdingStatement(@javax.annotation.Nullable WithholdingStatementType withholdingStatement) {
    this.withholdingStatement = withholdingStatement;
  }


  public TrustApplicant thirdPartyManagement(@javax.annotation.Nullable Boolean thirdPartyManagement) {
    this.thirdPartyManagement = thirdPartyManagement;
    return this;
  }

  /**
   * Get thirdPartyManagement
   * @return thirdPartyManagement
   */
  @javax.annotation.Nullable
  public Boolean getThirdPartyManagement() {
    return thirdPartyManagement;
  }

  public void setThirdPartyManagement(@javax.annotation.Nullable Boolean thirdPartyManagement) {
    this.thirdPartyManagement = thirdPartyManagement;
  }


  public TrustApplicant trustType(@javax.annotation.Nullable TrustTypeEnum trustType) {
    this.trustType = trustType;
    return this;
  }

  /**
   * Get trustType
   * @return trustType
   */
  @javax.annotation.Nullable
  public TrustTypeEnum getTrustType() {
    return trustType;
  }

  public void setTrustType(@javax.annotation.Nullable TrustTypeEnum trustType) {
    this.trustType = trustType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustApplicant trustApplicant = (TrustApplicant) o;
    return Objects.equals(this.identification, trustApplicant.identification) &&
        Objects.equals(this.financialInformation, trustApplicant.financialInformation) &&
        Objects.equals(this.regulatoryInformation, trustApplicant.regulatoryInformation) &&
        Objects.equals(this.regulatedMemberships, trustApplicant.regulatedMemberships) &&
        Objects.equals(this.accreditedInvestorInformation, trustApplicant.accreditedInvestorInformation) &&
        Objects.equals(this.trustees, trustApplicant.trustees) &&
        Objects.equals(this.beneficiaries, trustApplicant.beneficiaries) &&
        Objects.equals(this.grantors, trustApplicant.grantors) &&
        Objects.equals(this.taxResidencies, trustApplicant.taxResidencies) &&
        Objects.equals(this.w8BenE, trustApplicant.w8BenE) &&
        Objects.equals(this.w8IMY, trustApplicant.w8IMY) &&
        Objects.equals(this.withholdingStatement, trustApplicant.withholdingStatement) &&
        Objects.equals(this.thirdPartyManagement, trustApplicant.thirdPartyManagement) &&
        Objects.equals(this.trustType, trustApplicant.trustType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, financialInformation, regulatoryInformation, regulatedMemberships, accreditedInvestorInformation, trustees, beneficiaries, grantors, taxResidencies, w8BenE, w8IMY, withholdingStatement, thirdPartyManagement, trustType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustApplicant {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    financialInformation: ").append(toIndentedString(financialInformation)).append("\n");
    sb.append("    regulatoryInformation: ").append(toIndentedString(regulatoryInformation)).append("\n");
    sb.append("    regulatedMemberships: ").append(toIndentedString(regulatedMemberships)).append("\n");
    sb.append("    accreditedInvestorInformation: ").append(toIndentedString(accreditedInvestorInformation)).append("\n");
    sb.append("    trustees: ").append(toIndentedString(trustees)).append("\n");
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
    sb.append("    grantors: ").append(toIndentedString(grantors)).append("\n");
    sb.append("    taxResidencies: ").append(toIndentedString(taxResidencies)).append("\n");
    sb.append("    w8BenE: ").append(toIndentedString(w8BenE)).append("\n");
    sb.append("    w8IMY: ").append(toIndentedString(w8IMY)).append("\n");
    sb.append("    withholdingStatement: ").append(toIndentedString(withholdingStatement)).append("\n");
    sb.append("    thirdPartyManagement: ").append(toIndentedString(thirdPartyManagement)).append("\n");
    sb.append("    trustType: ").append(toIndentedString(trustType)).append("\n");
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
    openapiFields.add("identification");
    openapiFields.add("financialInformation");
    openapiFields.add("regulatoryInformation");
    openapiFields.add("regulatedMemberships");
    openapiFields.add("accreditedInvestorInformation");
    openapiFields.add("trustees");
    openapiFields.add("beneficiaries");
    openapiFields.add("grantors");
    openapiFields.add("taxResidencies");
    openapiFields.add("w8BenE");
    openapiFields.add("w8IMY");
    openapiFields.add("withholdingStatement");
    openapiFields.add("thirdPartyManagement");
    openapiFields.add("trustType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TrustApplicant
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrustApplicant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrustApplicant is not found in the empty JSON string", TrustApplicant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrustApplicant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrustApplicant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("identification") != null && !jsonObj.get("identification").isJsonNull()) {
        JsonArray jsonArrayidentification = jsonObj.getAsJsonArray("identification");
        if (jsonArrayidentification != null) {
          // ensure the json data is an array
          if (!jsonObj.get("identification").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `identification` to be an array in the JSON string but got `%s`", jsonObj.get("identification").toString()));
          }

          // validate the optional field `identification` (array)
          for (int i = 0; i < jsonArrayidentification.size(); i++) {
            TrustIdentification.validateJsonElement(jsonArrayidentification.get(i));
          };
        }
      }
      if (jsonObj.get("financialInformation") != null && !jsonObj.get("financialInformation").isJsonNull()) {
        JsonArray jsonArrayfinancialInformation = jsonObj.getAsJsonArray("financialInformation");
        if (jsonArrayfinancialInformation != null) {
          // ensure the json data is an array
          if (!jsonObj.get("financialInformation").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `financialInformation` to be an array in the JSON string but got `%s`", jsonObj.get("financialInformation").toString()));
          }

          // validate the optional field `financialInformation` (array)
          for (int i = 0; i < jsonArrayfinancialInformation.size(); i++) {
            FinancialInformation.validateJsonElement(jsonArrayfinancialInformation.get(i));
          };
        }
      }
      if (jsonObj.get("regulatoryInformation") != null && !jsonObj.get("regulatoryInformation").isJsonNull()) {
        JsonArray jsonArrayregulatoryInformation = jsonObj.getAsJsonArray("regulatoryInformation");
        if (jsonArrayregulatoryInformation != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regulatoryInformation").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regulatoryInformation` to be an array in the JSON string but got `%s`", jsonObj.get("regulatoryInformation").toString()));
          }

          // validate the optional field `regulatoryInformation` (array)
          for (int i = 0; i < jsonArrayregulatoryInformation.size(); i++) {
            RegulatoryInformation.validateJsonElement(jsonArrayregulatoryInformation.get(i));
          };
        }
      }
      if (jsonObj.get("regulatedMemberships") != null && !jsonObj.get("regulatedMemberships").isJsonNull()) {
        JsonArray jsonArrayregulatedMemberships = jsonObj.getAsJsonArray("regulatedMemberships");
        if (jsonArrayregulatedMemberships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regulatedMemberships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regulatedMemberships` to be an array in the JSON string but got `%s`", jsonObj.get("regulatedMemberships").toString()));
          }

          // validate the optional field `regulatedMemberships` (array)
          for (int i = 0; i < jsonArrayregulatedMemberships.size(); i++) {
            RegulatedMembership.validateJsonElement(jsonArrayregulatedMemberships.get(i));
          };
        }
      }
      // validate the optional field `accreditedInvestorInformation`
      if (jsonObj.get("accreditedInvestorInformation") != null && !jsonObj.get("accreditedInvestorInformation").isJsonNull()) {
        AccreditedInvestorInformation.validateJsonElement(jsonObj.get("accreditedInvestorInformation"));
      }
      // validate the optional field `trustees`
      if (jsonObj.get("trustees") != null && !jsonObj.get("trustees").isJsonNull()) {
        TrusteesType.validateJsonElement(jsonObj.get("trustees"));
      }
      // validate the optional field `beneficiaries`
      if (jsonObj.get("beneficiaries") != null && !jsonObj.get("beneficiaries").isJsonNull()) {
        AssociationTypeEntities.validateJsonElement(jsonObj.get("beneficiaries"));
      }
      // validate the optional field `grantors`
      if (jsonObj.get("grantors") != null && !jsonObj.get("grantors").isJsonNull()) {
        AssociationTypeEntities.validateJsonElement(jsonObj.get("grantors"));
      }
      if (jsonObj.get("taxResidencies") != null && !jsonObj.get("taxResidencies").isJsonNull()) {
        JsonArray jsonArraytaxResidencies = jsonObj.getAsJsonArray("taxResidencies");
        if (jsonArraytaxResidencies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taxResidencies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taxResidencies` to be an array in the JSON string but got `%s`", jsonObj.get("taxResidencies").toString()));
          }

          // validate the optional field `taxResidencies` (array)
          for (int i = 0; i < jsonArraytaxResidencies.size(); i++) {
            TaxResidency.validateJsonElement(jsonArraytaxResidencies.get(i));
          };
        }
      }
      // validate the optional field `w8BenE`
      if (jsonObj.get("w8BenE") != null && !jsonObj.get("w8BenE").isJsonNull()) {
        FormW8BENE.validateJsonElement(jsonObj.get("w8BenE"));
      }
      // validate the optional field `w8IMY`
      if (jsonObj.get("w8IMY") != null && !jsonObj.get("w8IMY").isJsonNull()) {
        FormW8IMY.validateJsonElement(jsonObj.get("w8IMY"));
      }
      // validate the optional field `withholdingStatement`
      if (jsonObj.get("withholdingStatement") != null && !jsonObj.get("withholdingStatement").isJsonNull()) {
        WithholdingStatementType.validateJsonElement(jsonObj.get("withholdingStatement"));
      }
      if ((jsonObj.get("trustType") != null && !jsonObj.get("trustType").isJsonNull()) && !jsonObj.get("trustType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trustType").toString()));
      }
      // validate the optional field `trustType`
      if (jsonObj.get("trustType") != null && !jsonObj.get("trustType").isJsonNull()) {
        TrustTypeEnum.validateJsonElement(jsonObj.get("trustType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustApplicant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustApplicant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustApplicant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustApplicant.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustApplicant>() {
           @Override
           public void write(JsonWriter out, TrustApplicant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrustApplicant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TrustApplicant given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TrustApplicant
   * @throws IOException if the JSON string is invalid with respect to TrustApplicant
   */
  public static TrustApplicant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustApplicant.class);
  }

  /**
   * Convert an instance of TrustApplicant to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

