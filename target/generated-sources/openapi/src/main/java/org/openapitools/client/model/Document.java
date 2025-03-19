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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AttachedFileType;
import org.openapitools.client.model.FilePayload;

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
 * Document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-18T20:44:00.611784800-05:00[America/Chicago]", comments = "Generator version: 7.12.0")
public class Document {
  public static final String SERIALIZED_NAME_SIGNED_BY = "signedBy";
  @SerializedName(SERIALIZED_NAME_SIGNED_BY)
  @javax.annotation.Nullable
  private List<String> signedBy = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTACHED_FILE = "attachedFile";
  @SerializedName(SERIALIZED_NAME_ATTACHED_FILE)
  @javax.annotation.Nullable
  private AttachedFileType attachedFile;

  public static final String SERIALIZED_NAME_FORM_NUMBER = "formNumber";
  @SerializedName(SERIALIZED_NAME_FORM_NUMBER)
  @javax.annotation.Nullable
  private Integer formNumber;

  public static final String SERIALIZED_NAME_VALID_ADDRESS = "validAddress";
  @SerializedName(SERIALIZED_NAME_VALID_ADDRESS)
  @javax.annotation.Nullable
  private Boolean validAddress;

  public static final String SERIALIZED_NAME_EXEC_LOGIN_TIMESTAMP = "execLoginTimestamp";
  @SerializedName(SERIALIZED_NAME_EXEC_LOGIN_TIMESTAMP)
  @javax.annotation.Nullable
  private Integer execLoginTimestamp;

  public static final String SERIALIZED_NAME_EXEC_TIMESTAMP = "execTimestamp";
  @SerializedName(SERIALIZED_NAME_EXEC_TIMESTAMP)
  @javax.annotation.Nullable
  private Integer execTimestamp;

  /**
   * Gets or Sets documentType
   */
  @JsonAdapter(DocumentTypeEnum.Adapter.class)
  public enum DocumentTypeEnum {
    CHECK("Check"),
    
    COMPANY_OWNERSHIP("Company Ownership"),
    
    DIVORCE_SETTLEMENT("Divorce Settlement"),
    
    EMPLOYER_CONFIRMATION("Employer Confirmation"),
    
    ENTITLEMENT_TO_PAYMENTS("Entitlement to Payments"),
    
    LETTER("Letter"),
    
    OWNERSHIP("Ownership"),
    
    PAY_SLIP("Pay Slip"),
    
    PROOF_OF_SALE("Proof of Sale"),
    
    PROOF_OF_WINNINGS("Proof of Winnings"),
    
    SEVERANCE("Severance"),
    
    TAX_RETURN("Tax Return"),
    
    WILL("Will"),
    
    BANK_STATEMENT("Bank Statement"),
    
    BROKERAGE_STATEMENT("Brokerage Statement"),
    
    CURRENT_LEASE("Current Lease"),
    
    FINANCIAL_STATEMENT("Financial Statement"),
    
    CERTIFICATE_OF_INCORPORATION_FORMATION("Certificate of Incorporation/Formation"),
    
    CERTIFICATE_OF_REGISTRATIOS("Certificate of Registratios"),
    
    COMPANY_CHARTER("Company Charter"),
    
    CERTIFICATE_OF_GOOD_STANDING("Certificate of Good Standing"),
    
    GOVERNMENT_ISSUED_BUSINESS_LICENSE("Government-issued Business License"),
    
    CORPORATE_CHARTER("Corporate Charter"),
    
    ARTICLES_OF_INCORPORATION("Articles of Incorporation"),
    
    BANK_PASSBOOK_STATEMENT("Bank Passbook/Statement"),
    
    CERTIFIED_PROOF_OF_IDENTITY("Certified Proof of Identity"),
    
    CERTIFIED_PROOF_OF_ADDRESS("Certified Proof of Address"),
    
    INCOME_TAX_RETURN("Income Tax Return"),
    
    ADDITIONAL_PROOF_OF_IDENTITY_DOCUMENT("Additional Proof of Identity Document"),
    
    PROOF_OF_PRINCIPAL_PLACE_OF_BUSINESS_AND_REGISTRATION("Proof of Principal Place of Business and Registration"),
    
    UTILITY_BILL("Utility Bill"),
    
    EVIDENCE_OF_OWNERSHIP_OF_PROPERTY("Evidence of Ownership of Property"),
    
    AUTHORIZATION_TO_OPEN_ACCOUNT_EVIDENCE("Authorization to Open Account - Evidence"),
    
    AUTHORIZATION_TO_OPEN_ACCOUNT_CERTIFICATION("Authorization to Open Account - Certification"),
    
    ITALIAN_HEALTH_CARD_TESSERA_SANITARIA_("Italian Health Card (Tessera Sanitaria)"),
    
    CRS_CARD_OF_LOMBARDY("CRS card of Lombardy"),
    
    ITALIAN_ELECTRONIC_ID_CARD_CIE("Italian Electronic ID Card - CIE"),
    
    COURT_OR_GOVT_ISSUED_DOCUMENT("Court- or Govt-issued document"),
    
    COPY_OF_PASSPORT_NATIONAL_ID_OR_DRIVER_S_LICENSE("Copy of Passport, National Id or Driver's License"),
    
    PASSPORT("Passport"),
    
    NATIONAL_ID("National ID");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String value) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DocumentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  @javax.annotation.Nullable
  private DocumentTypeEnum documentType;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  @javax.annotation.Nullable
  private String signature;

  public static final String SERIALIZED_NAME_EXTERNAL_ACCOUNT_ID = "externalAccountId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String externalAccountId;

  public static final String SERIALIZED_NAME_EXTERNAL_INDIVIDUAL_ID = "externalIndividualId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_INDIVIDUAL_ID)
  @javax.annotation.Nullable
  private String externalIndividualId;

  /**
   * Gets or Sets proofOfIdentityType
   */
  @JsonAdapter(ProofOfIdentityTypeEnum.Adapter.class)
  public enum ProofOfIdentityTypeEnum {
    DRIVER_LICENSE("Driver License"),
    
    PASSPORT("Passport"),
    
    ALIEN_ID_CARD("Alien ID Card"),
    
    NATIONAL_ID_CARD("National ID Card"),
    
    BANK_STATEMENT("Bank Statement"),
    
    EVIDENCE_OF_OWNERSHIP_OF_PROPERTY("Evidence of Ownership of Property"),
    
    CREDIT_CARD_STATEMENT("Credit Card Statement"),
    
    UTILITY_BILL("Utility Bill"),
    
    BROKERAGE_STATEMENT("Brokerage Statement"),
    
    T4_STATEMENT("T4 Statement"),
    
    CRA_ASSESSMENT("CRA Assessment"),
    
    HONG_KONG_AND_MACAO_ENTRY_PERMIT("Hong Kong and Macao Entry Permit");

    private String value;

    ProofOfIdentityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProofOfIdentityTypeEnum fromValue(String value) {
      for (ProofOfIdentityTypeEnum b : ProofOfIdentityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProofOfIdentityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProofOfIdentityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProofOfIdentityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProofOfIdentityTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProofOfIdentityTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROOF_OF_IDENTITY_TYPE = "proofOfIdentityType";
  @SerializedName(SERIALIZED_NAME_PROOF_OF_IDENTITY_TYPE)
  @javax.annotation.Nullable
  private ProofOfIdentityTypeEnum proofOfIdentityType;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  @javax.annotation.Nullable
  private LocalDate expirationDate;

  /**
   * Gets or Sets proofOfAddressType
   */
  @JsonAdapter(ProofOfAddressTypeEnum.Adapter.class)
  public enum ProofOfAddressTypeEnum {
    DRIVER_LICENSE("Driver License"),
    
    BANK_STATEMENT("Bank Statement"),
    
    BROKERAGE_STATEMENT("Brokerage Statement"),
    
    HOMEOWNER_INSURANCE_POLICY_BILL("Homeowner Insurance Policy Bill"),
    
    HOMEOWNER_INSURANCE_POLICY_DOCUMENT("Homeowner Insurance Policy Document"),
    
    RENTER_INSURANCE_POLICY_BILL("Renter Insurance Policy bill"),
    
    RENTER_INSURANCE_POLICY_DOCUMENT("Renter Insurance Policy Document"),
    
    SECURITY_SYSTEM_BILL("Security System Bill"),
    
    GOVERNMENT_ISSUED_LETTERS("Government Issued Letters"),
    
    UTILITY_BILL("Utility Bill"),
    
    CURRENT_LEASE("Current Lease"),
    
    EVIDENCE_OF_OWNERSHIP_OF_PROPERTY("Evidence of Ownership of Property"),
    
    OTHER_DOCUMENT("Other Document");

    private String value;

    ProofOfAddressTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProofOfAddressTypeEnum fromValue(String value) {
      for (ProofOfAddressTypeEnum b : ProofOfAddressTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProofOfAddressTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProofOfAddressTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProofOfAddressTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProofOfAddressTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProofOfAddressTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROOF_OF_ADDRESS_TYPE = "proofOfAddressType";
  @SerializedName(SERIALIZED_NAME_PROOF_OF_ADDRESS_TYPE)
  @javax.annotation.Nullable
  private ProofOfAddressTypeEnum proofOfAddressType;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  @javax.annotation.Nullable
  private FilePayload payload;

  public Document() {
  }

  public Document signedBy(@javax.annotation.Nullable List<String> signedBy) {
    this.signedBy = signedBy;
    return this;
  }

  public Document addSignedByItem(String signedByItem) {
    if (this.signedBy == null) {
      this.signedBy = new ArrayList<>();
    }
    this.signedBy.add(signedByItem);
    return this;
  }

  /**
   * Get signedBy
   * @return signedBy
   */
  @javax.annotation.Nullable
  public List<String> getSignedBy() {
    return signedBy;
  }

  public void setSignedBy(@javax.annotation.Nullable List<String> signedBy) {
    this.signedBy = signedBy;
  }


  public Document attachedFile(@javax.annotation.Nullable AttachedFileType attachedFile) {
    this.attachedFile = attachedFile;
    return this;
  }

  /**
   * Get attachedFile
   * @return attachedFile
   */
  @javax.annotation.Nullable
  public AttachedFileType getAttachedFile() {
    return attachedFile;
  }

  public void setAttachedFile(@javax.annotation.Nullable AttachedFileType attachedFile) {
    this.attachedFile = attachedFile;
  }


  public Document formNumber(@javax.annotation.Nullable Integer formNumber) {
    this.formNumber = formNumber;
    return this;
  }

  /**
   * Get formNumber
   * @return formNumber
   */
  @javax.annotation.Nullable
  public Integer getFormNumber() {
    return formNumber;
  }

  public void setFormNumber(@javax.annotation.Nullable Integer formNumber) {
    this.formNumber = formNumber;
  }


  public Document validAddress(@javax.annotation.Nullable Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

  /**
   * Get validAddress
   * @return validAddress
   */
  @javax.annotation.Nullable
  public Boolean getValidAddress() {
    return validAddress;
  }

  public void setValidAddress(@javax.annotation.Nullable Boolean validAddress) {
    this.validAddress = validAddress;
  }


  public Document execLoginTimestamp(@javax.annotation.Nullable Integer execLoginTimestamp) {
    this.execLoginTimestamp = execLoginTimestamp;
    return this;
  }

  /**
   * Get execLoginTimestamp
   * @return execLoginTimestamp
   */
  @javax.annotation.Nullable
  public Integer getExecLoginTimestamp() {
    return execLoginTimestamp;
  }

  public void setExecLoginTimestamp(@javax.annotation.Nullable Integer execLoginTimestamp) {
    this.execLoginTimestamp = execLoginTimestamp;
  }


  public Document execTimestamp(@javax.annotation.Nullable Integer execTimestamp) {
    this.execTimestamp = execTimestamp;
    return this;
  }

  /**
   * Get execTimestamp
   * @return execTimestamp
   */
  @javax.annotation.Nullable
  public Integer getExecTimestamp() {
    return execTimestamp;
  }

  public void setExecTimestamp(@javax.annotation.Nullable Integer execTimestamp) {
    this.execTimestamp = execTimestamp;
  }


  public Document documentType(@javax.annotation.Nullable DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
   */
  @javax.annotation.Nullable
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(@javax.annotation.Nullable DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }


  public Document signature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(@javax.annotation.Nullable String signature) {
    this.signature = signature;
  }


  public Document externalAccountId(@javax.annotation.Nullable String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Get externalAccountId
   * @return externalAccountId
   */
  @javax.annotation.Nullable
  public String getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(@javax.annotation.Nullable String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }


  public Document externalIndividualId(@javax.annotation.Nullable String externalIndividualId) {
    this.externalIndividualId = externalIndividualId;
    return this;
  }

  /**
   * Get externalIndividualId
   * @return externalIndividualId
   */
  @javax.annotation.Nullable
  public String getExternalIndividualId() {
    return externalIndividualId;
  }

  public void setExternalIndividualId(@javax.annotation.Nullable String externalIndividualId) {
    this.externalIndividualId = externalIndividualId;
  }


  public Document proofOfIdentityType(@javax.annotation.Nullable ProofOfIdentityTypeEnum proofOfIdentityType) {
    this.proofOfIdentityType = proofOfIdentityType;
    return this;
  }

  /**
   * Get proofOfIdentityType
   * @return proofOfIdentityType
   */
  @javax.annotation.Nullable
  public ProofOfIdentityTypeEnum getProofOfIdentityType() {
    return proofOfIdentityType;
  }

  public void setProofOfIdentityType(@javax.annotation.Nullable ProofOfIdentityTypeEnum proofOfIdentityType) {
    this.proofOfIdentityType = proofOfIdentityType;
  }


  public Document expirationDate(@javax.annotation.Nullable LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(@javax.annotation.Nullable LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  public Document proofOfAddressType(@javax.annotation.Nullable ProofOfAddressTypeEnum proofOfAddressType) {
    this.proofOfAddressType = proofOfAddressType;
    return this;
  }

  /**
   * Get proofOfAddressType
   * @return proofOfAddressType
   */
  @javax.annotation.Nullable
  public ProofOfAddressTypeEnum getProofOfAddressType() {
    return proofOfAddressType;
  }

  public void setProofOfAddressType(@javax.annotation.Nullable ProofOfAddressTypeEnum proofOfAddressType) {
    this.proofOfAddressType = proofOfAddressType;
  }


  public Document payload(@javax.annotation.Nullable FilePayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nullable
  public FilePayload getPayload() {
    return payload;
  }

  public void setPayload(@javax.annotation.Nullable FilePayload payload) {
    this.payload = payload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.signedBy, document.signedBy) &&
        Objects.equals(this.attachedFile, document.attachedFile) &&
        Objects.equals(this.formNumber, document.formNumber) &&
        Objects.equals(this.validAddress, document.validAddress) &&
        Objects.equals(this.execLoginTimestamp, document.execLoginTimestamp) &&
        Objects.equals(this.execTimestamp, document.execTimestamp) &&
        Objects.equals(this.documentType, document.documentType) &&
        Objects.equals(this.signature, document.signature) &&
        Objects.equals(this.externalAccountId, document.externalAccountId) &&
        Objects.equals(this.externalIndividualId, document.externalIndividualId) &&
        Objects.equals(this.proofOfIdentityType, document.proofOfIdentityType) &&
        Objects.equals(this.expirationDate, document.expirationDate) &&
        Objects.equals(this.proofOfAddressType, document.proofOfAddressType) &&
        Objects.equals(this.payload, document.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedBy, attachedFile, formNumber, validAddress, execLoginTimestamp, execTimestamp, documentType, signature, externalAccountId, externalIndividualId, proofOfIdentityType, expirationDate, proofOfAddressType, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    signedBy: ").append(toIndentedString(signedBy)).append("\n");
    sb.append("    attachedFile: ").append(toIndentedString(attachedFile)).append("\n");
    sb.append("    formNumber: ").append(toIndentedString(formNumber)).append("\n");
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    execLoginTimestamp: ").append(toIndentedString(execLoginTimestamp)).append("\n");
    sb.append("    execTimestamp: ").append(toIndentedString(execTimestamp)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    externalIndividualId: ").append(toIndentedString(externalIndividualId)).append("\n");
    sb.append("    proofOfIdentityType: ").append(toIndentedString(proofOfIdentityType)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    proofOfAddressType: ").append(toIndentedString(proofOfAddressType)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    openapiFields.add("signedBy");
    openapiFields.add("attachedFile");
    openapiFields.add("formNumber");
    openapiFields.add("validAddress");
    openapiFields.add("execLoginTimestamp");
    openapiFields.add("execTimestamp");
    openapiFields.add("documentType");
    openapiFields.add("signature");
    openapiFields.add("externalAccountId");
    openapiFields.add("externalIndividualId");
    openapiFields.add("proofOfIdentityType");
    openapiFields.add("expirationDate");
    openapiFields.add("proofOfAddressType");
    openapiFields.add("payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Document
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Document.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Document is not found in the empty JSON string", Document.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Document.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Document` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("signedBy") != null && !jsonObj.get("signedBy").isJsonNull() && !jsonObj.get("signedBy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `signedBy` to be an array in the JSON string but got `%s`", jsonObj.get("signedBy").toString()));
      }
      // validate the optional field `attachedFile`
      if (jsonObj.get("attachedFile") != null && !jsonObj.get("attachedFile").isJsonNull()) {
        AttachedFileType.validateJsonElement(jsonObj.get("attachedFile"));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      // validate the optional field `documentType`
      if (jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) {
        DocumentTypeEnum.validateJsonElement(jsonObj.get("documentType"));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("externalAccountId") != null && !jsonObj.get("externalAccountId").isJsonNull()) && !jsonObj.get("externalAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalAccountId").toString()));
      }
      if ((jsonObj.get("externalIndividualId") != null && !jsonObj.get("externalIndividualId").isJsonNull()) && !jsonObj.get("externalIndividualId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalIndividualId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalIndividualId").toString()));
      }
      if ((jsonObj.get("proofOfIdentityType") != null && !jsonObj.get("proofOfIdentityType").isJsonNull()) && !jsonObj.get("proofOfIdentityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proofOfIdentityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proofOfIdentityType").toString()));
      }
      // validate the optional field `proofOfIdentityType`
      if (jsonObj.get("proofOfIdentityType") != null && !jsonObj.get("proofOfIdentityType").isJsonNull()) {
        ProofOfIdentityTypeEnum.validateJsonElement(jsonObj.get("proofOfIdentityType"));
      }
      if ((jsonObj.get("proofOfAddressType") != null && !jsonObj.get("proofOfAddressType").isJsonNull()) && !jsonObj.get("proofOfAddressType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proofOfAddressType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proofOfAddressType").toString()));
      }
      // validate the optional field `proofOfAddressType`
      if (jsonObj.get("proofOfAddressType") != null && !jsonObj.get("proofOfAddressType").isJsonNull()) {
        ProofOfAddressTypeEnum.validateJsonElement(jsonObj.get("proofOfAddressType"));
      }
      // validate the optional field `payload`
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
        FilePayload.validateJsonElement(jsonObj.get("payload"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Document.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Document' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Document> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Document.class));

       return (TypeAdapter<T>) new TypeAdapter<Document>() {
           @Override
           public void write(JsonWriter out, Document value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Document read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Document given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Document
   * @throws IOException if the JSON string is invalid with respect to Document
   */
  public static Document fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Document.class);
  }

  /**
   * Convert an instance of Document to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

