

# Document


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signedBy** | **List&lt;String&gt;** |  |  [optional] |
|**attachedFile** | [**AttachedFileType**](AttachedFileType.md) |  |  [optional] |
|**formNumber** | **Integer** |  |  [optional] |
|**validAddress** | **Boolean** |  |  [optional] |
|**execLoginTimestamp** | **Integer** |  |  [optional] |
|**execTimestamp** | **Integer** |  |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional] |
|**signature** | **String** |  |  [optional] |
|**externalAccountId** | **String** |  |  [optional] |
|**externalIndividualId** | **String** |  |  [optional] |
|**proofOfIdentityType** | [**ProofOfIdentityTypeEnum**](#ProofOfIdentityTypeEnum) |  |  [optional] |
|**expirationDate** | **LocalDate** |  |  [optional] |
|**proofOfAddressType** | [**ProofOfAddressTypeEnum**](#ProofOfAddressTypeEnum) |  |  [optional] |
|**payload** | [**FilePayload**](FilePayload.md) |  |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| CHECK | &quot;Check&quot; |
| COMPANY_OWNERSHIP | &quot;Company Ownership&quot; |
| DIVORCE_SETTLEMENT | &quot;Divorce Settlement&quot; |
| EMPLOYER_CONFIRMATION | &quot;Employer Confirmation&quot; |
| ENTITLEMENT_TO_PAYMENTS | &quot;Entitlement to Payments&quot; |
| LETTER | &quot;Letter&quot; |
| OWNERSHIP | &quot;Ownership&quot; |
| PAY_SLIP | &quot;Pay Slip&quot; |
| PROOF_OF_SALE | &quot;Proof of Sale&quot; |
| PROOF_OF_WINNINGS | &quot;Proof of Winnings&quot; |
| SEVERANCE | &quot;Severance&quot; |
| TAX_RETURN | &quot;Tax Return&quot; |
| WILL | &quot;Will&quot; |
| BANK_STATEMENT | &quot;Bank Statement&quot; |
| BROKERAGE_STATEMENT | &quot;Brokerage Statement&quot; |
| CURRENT_LEASE | &quot;Current Lease&quot; |
| FINANCIAL_STATEMENT | &quot;Financial Statement&quot; |
| CERTIFICATE_OF_INCORPORATION_FORMATION | &quot;Certificate of Incorporation/Formation&quot; |
| CERTIFICATE_OF_REGISTRATIOS | &quot;Certificate of Registratios&quot; |
| COMPANY_CHARTER | &quot;Company Charter&quot; |
| CERTIFICATE_OF_GOOD_STANDING | &quot;Certificate of Good Standing&quot; |
| GOVERNMENT_ISSUED_BUSINESS_LICENSE | &quot;Government-issued Business License&quot; |
| CORPORATE_CHARTER | &quot;Corporate Charter&quot; |
| ARTICLES_OF_INCORPORATION | &quot;Articles of Incorporation&quot; |
| BANK_PASSBOOK_STATEMENT | &quot;Bank Passbook/Statement&quot; |
| CERTIFIED_PROOF_OF_IDENTITY | &quot;Certified Proof of Identity&quot; |
| CERTIFIED_PROOF_OF_ADDRESS | &quot;Certified Proof of Address&quot; |
| INCOME_TAX_RETURN | &quot;Income Tax Return&quot; |
| ADDITIONAL_PROOF_OF_IDENTITY_DOCUMENT | &quot;Additional Proof of Identity Document&quot; |
| PROOF_OF_PRINCIPAL_PLACE_OF_BUSINESS_AND_REGISTRATION | &quot;Proof of Principal Place of Business and Registration&quot; |
| UTILITY_BILL | &quot;Utility Bill&quot; |
| EVIDENCE_OF_OWNERSHIP_OF_PROPERTY | &quot;Evidence of Ownership of Property&quot; |
| AUTHORIZATION_TO_OPEN_ACCOUNT_EVIDENCE | &quot;Authorization to Open Account - Evidence&quot; |
| AUTHORIZATION_TO_OPEN_ACCOUNT_CERTIFICATION | &quot;Authorization to Open Account - Certification&quot; |
| ITALIAN_HEALTH_CARD_TESSERA_SANITARIA_ | &quot;Italian Health Card (Tessera Sanitaria)&quot; |
| CRS_CARD_OF_LOMBARDY | &quot;CRS card of Lombardy&quot; |
| ITALIAN_ELECTRONIC_ID_CARD_CIE | &quot;Italian Electronic ID Card - CIE&quot; |
| COURT_OR_GOVT_ISSUED_DOCUMENT | &quot;Court- or Govt-issued document&quot; |
| COPY_OF_PASSPORT_NATIONAL_ID_OR_DRIVER_S_LICENSE | &quot;Copy of Passport, National Id or Driver&#39;s License&quot; |
| PASSPORT | &quot;Passport&quot; |
| NATIONAL_ID | &quot;National ID&quot; |



## Enum: ProofOfIdentityTypeEnum

| Name | Value |
|---- | -----|
| DRIVER_LICENSE | &quot;Driver License&quot; |
| PASSPORT | &quot;Passport&quot; |
| ALIEN_ID_CARD | &quot;Alien ID Card&quot; |
| NATIONAL_ID_CARD | &quot;National ID Card&quot; |
| BANK_STATEMENT | &quot;Bank Statement&quot; |
| EVIDENCE_OF_OWNERSHIP_OF_PROPERTY | &quot;Evidence of Ownership of Property&quot; |
| CREDIT_CARD_STATEMENT | &quot;Credit Card Statement&quot; |
| UTILITY_BILL | &quot;Utility Bill&quot; |
| BROKERAGE_STATEMENT | &quot;Brokerage Statement&quot; |
| T4_STATEMENT | &quot;T4 Statement&quot; |
| CRA_ASSESSMENT | &quot;CRA Assessment&quot; |
| HONG_KONG_AND_MACAO_ENTRY_PERMIT | &quot;Hong Kong and Macao Entry Permit&quot; |



## Enum: ProofOfAddressTypeEnum

| Name | Value |
|---- | -----|
| DRIVER_LICENSE | &quot;Driver License&quot; |
| BANK_STATEMENT | &quot;Bank Statement&quot; |
| BROKERAGE_STATEMENT | &quot;Brokerage Statement&quot; |
| HOMEOWNER_INSURANCE_POLICY_BILL | &quot;Homeowner Insurance Policy Bill&quot; |
| HOMEOWNER_INSURANCE_POLICY_DOCUMENT | &quot;Homeowner Insurance Policy Document&quot; |
| RENTER_INSURANCE_POLICY_BILL | &quot;Renter Insurance Policy bill&quot; |
| RENTER_INSURANCE_POLICY_DOCUMENT | &quot;Renter Insurance Policy Document&quot; |
| SECURITY_SYSTEM_BILL | &quot;Security System Bill&quot; |
| GOVERNMENT_ISSUED_LETTERS | &quot;Government Issued Letters&quot; |
| UTILITY_BILL | &quot;Utility Bill&quot; |
| CURRENT_LEASE | &quot;Current Lease&quot; |
| EVIDENCE_OF_OWNERSHIP_OF_PROPERTY | &quot;Evidence of Ownership of Property&quot; |
| OTHER_DOCUMENT | &quot;Other Document&quot; |



