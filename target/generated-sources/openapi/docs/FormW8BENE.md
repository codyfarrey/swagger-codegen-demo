

# FormW8BENE


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**substantialUsOwnerExternalIds** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**countryOfOrganization** | **String** |  |  [optional] |
|**disregardedEntityName** | **String** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional] |
|**fatcaStatus** | [**FatcaStatusEnum**](#FatcaStatusEnum) |  |  [optional] |
|**usTin** | **String** |  |  [optional] |
|**giin** | **String** |  |  [optional] |
|**foreignTin** | **String** |  |  [optional] |
|**tinOrExplanationRequired** | **Boolean** |  |  [optional] |
|**explanation** | [**ExplanationEnum**](#ExplanationEnum) |  |  [optional] |
|**referenceNumber** | **Integer** |  |  [optional] |
|**submitDate** | **String** |  |  [optional] |
|**box11Status** | [**Box11StatusEnum**](#Box11StatusEnum) |  |  [optional] |
|**part314A** | **Boolean** |  |  [optional] |
|**part314ACountry** | **String** |  |  [optional] |
|**part314B** | [**Part314BEnum**](#Part314BEnum) |  |  [optional] |
|**part314C** | **Boolean** |  |  [optional] |
|**part416** | **String** |  |  [optional] |
|**part417I** | **Boolean** |  |  [optional] |
|**part417Ii** | **Boolean** |  |  [optional] |
|**part518** | **Boolean** |  |  [optional] |
|**part619** | **Boolean** |  |  [optional] |
|**part720** | **String** |  |  [optional] |
|**part721** | **Boolean** |  |  [optional] |
|**part822** | **Boolean** |  |  [optional] |
|**part923** | **Boolean** |  |  [optional] |
|**part1024A** | **Boolean** |  |  [optional] |
|**part1024B** | **Boolean** |  |  [optional] |
|**part1024C** | **Boolean** |  |  [optional] |
|**part1024D** | **Boolean** |  |  [optional] |
|**part1125A** | **Boolean** |  |  [optional] |
|**part1125B** | **Boolean** |  |  [optional] |
|**part1125C** | **Boolean** |  |  [optional] |
|**part1226** | **Boolean** |  |  [optional] |
|**part1226Desc1** | **String** |  |  [optional] |
|**part1226Desc2** | **String** |  |  [optional] |
|**part1226Desc3** | [**Part1226Desc3Enum**](#Part1226Desc3Enum) |  |  [optional] |
|**part1226Desc4** | **String** |  |  [optional] |
|**part1327** | **Boolean** |  |  [optional] |
|**part1428A** | **Boolean** |  |  [optional] |
|**part1428B** | **Boolean** |  |  [optional] |
|**part1529A** | **Boolean** |  |  [optional] |
|**part1529B** | **Boolean** |  |  [optional] |
|**part1529C** | **Boolean** |  |  [optional] |
|**part1529D** | **Boolean** |  |  [optional] |
|**part1529E** | **Boolean** |  |  [optional] |
|**part1529F** | **Boolean** |  |  [optional] |
|**part1630** | **Boolean** |  |  [optional] |
|**part1731** | **Boolean** |  |  [optional] |
|**part1832** | **Boolean** |  |  [optional] |
|**part1933** | **Boolean** |  |  [optional] |
|**part2034** | **Boolean** |  |  [optional] |
|**part2135** | **Boolean** |  |  [optional] |
|**part2135Date** | **String** |  |  [optional] |
|**part2236** | **Boolean** |  |  [optional] |
|**part2337A** | **Boolean** |  |  [optional] |
|**part2337ADesc** | **String** |  |  [optional] |
|**part2337B** | **Boolean** |  |  [optional] |
|**part2337BDesc1** | **String** |  |  [optional] |
|**part2337BDesc2** | **String** |  |  [optional] |
|**part2438** | **Boolean** |  |  [optional] |
|**part2539** | **Boolean** |  |  [optional] |
|**part2640A** | **Boolean** |  |  [optional] |
|**part2640B** | **Boolean** |  |  [optional] |
|**part2640C** | **Boolean** |  |  [optional] |
|**part2741** | **Boolean** |  |  [optional] |
|**part2842** | **String** |  |  [optional] |
|**part2843** | **Boolean** |  |  [optional] |
|**cert** | **Boolean** |  |  [optional] |
|**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) |  |  [optional] |
|**blankForm** | **Boolean** |  |  [optional] |
|**taxFormFile** | **String** |  |  [optional] |
|**proprietaryFormNumber** | **Integer** |  |  [optional] |
|**electronicFormat** | **Boolean** |  |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| CORPORATION | &quot;CORPORATION&quot; |
| DISREGARDED_ENTITY | &quot;DISREGARDED_ENTITY&quot; |
| PARTNERSHIP | &quot;PARTNERSHIP&quot; |
| SIMPLE_TRUST | &quot;SIMPLE_TRUST&quot; |
| GRANTOR_TRUST | &quot;GRANTOR_TRUST&quot; |
| COMPLEX_TRUST | &quot;COMPLEX_TRUST&quot; |
| ESTATE | &quot;ESTATE&quot; |
| GOVERNMENT | &quot;GOVERNMENT&quot; |
| CENTRAL_BANK_OF_ISSUE | &quot;CENTRAL_BANK_OF_ISSUE&quot; |
| TAX_EXEMPT_ORGANIZATION | &quot;TAX_EXEMPT_ORGANIZATION&quot; |
| PRIVATE_FOUNDATION | &quot;PRIVATE_FOUNDATION&quot; |



## Enum: FatcaStatusEnum

| Name | Value |
|---- | -----|
| NONPARTICIPATING_FFI | &quot;NONPARTICIPATING_FFI&quot; |
| PARICIPATING_FFI | &quot;PARICIPATING_FFI&quot; |
| REPORTING_MODEL_1_FFI | &quot;REPORTING_MODEL_1_FFI&quot; |
| REPORTING_MODEL_2_FFI | &quot;REPORTING_MODEL_2_FFI&quot; |
| REGISTERED_DEEMED_COMPLIANT_FFI | &quot;REGISTERED_DEEMED_COMPLIANT_FFI&quot; |
| SPONSORED_FFI | &quot;SPONSORED_FFI&quot; |
| CERTIFIED_DEEMED_COMPLIANT_NONREGISTERING_LOCAL_BANK | &quot;CERTIFIED_DEEMED_COMPLIANT_NONREGISTERING_LOCAL_BANK&quot; |
| CERTIFIED_DEEMED_COMPLIANT_FFI | &quot;CERTIFIED_DEEMED_COMPLIANT_FFI&quot; |
| CERTIFIED_DEEMED_COMPLIANT_SPONSORED_VEHICLE | &quot;CERTIFIED_DEEMED_COMPLIANT_SPONSORED_VEHICLE&quot; |
| CERTIFIED_DEEMED_COMPLIANT_LIMITED_LIFE_DEBT | &quot;CERTIFIED_DEEMED_COMPLIANT_LIMITED_LIFE_DEBT&quot; |
| CERTIFIED_DEEMED_COMPLIANT_INVESTMENT_ADVISORS | &quot;CERTIFIED_DEEMED_COMPLIANT_INVESTMENT_ADVISORS&quot; |
| OWNER_DOCUMENTED_FFI | &quot;OWNER_DOCUMENTED_FFI&quot; |
| RESTRICTED_DISTRIBUTOR | &quot;RESTRICTED_DISTRIBUTOR&quot; |
| NONREPORTING_IGA_FFI | &quot;NONREPORTING_IGA_FFI&quot; |
| FOREIGN_GOVERNMENT | &quot;FOREIGN_GOVERNMENT&quot; |
| INTERNATIONAL_ORGANIZATION | &quot;INTERNATIONAL_ORGANIZATION&quot; |
| EXEMPT_RETIREMENT_PLANS | &quot;EXEMPT_RETIREMENT_PLANS&quot; |
| ENTITY_OWNED_BY_EXEMPT_BENEFICIAL_OWNERS | &quot;ENTITY_OWNED_BY_EXEMPT_BENEFICIAL_OWNERS&quot; |
| TERRITORY_FINANCIAL_INSTITUTION | &quot;TERRITORY_FINANCIAL_INSTITUTION&quot; |
| NONFINANCIAL_GROUP | &quot;NONFINANCIAL_GROUP&quot; |
| EXCEPTED_NONFINANCIAL_STARTUP | &quot;EXCEPTED_NONFINANCIAL_STARTUP&quot; |
| EXCEPTED_NONFINANCIAL_ENTITY | &quot;EXCEPTED_NONFINANCIAL_ENTITY&quot; |
| AN_501_C_ORGANIZATION | &quot;AN_501_C_ORGANIZATION&quot; |
| NONPROFIT_ORGANIZATION | &quot;NONPROFIT_ORGANIZATION&quot; |
| PUBLICLY_TRADED_NFFE | &quot;PUBLICLY_TRADED_NFFE&quot; |
| EXCEPTED_TERRITORY_NFFE | &quot;EXCEPTED_TERRITORY_NFFE&quot; |
| ACTIVE_NFFE | &quot;ACTIVE_NFFE&quot; |
| PASSIVE_NFFE | &quot;PASSIVE_NFFE&quot; |
| EXCEPTED_INTER_AFFILIATE_FFI | &quot;EXCEPTED_INTER_AFFILIATE_FFI&quot; |
| DIRECT_REPORTING_NFFE | &quot;DIRECT_REPORTING_NFFE&quot; |
| SPONSORED_DIRECT_REPORTING_NFFE | &quot;SPONSORED_DIRECT_REPORTING_NFFE&quot; |



## Enum: ExplanationEnum

| Name | Value |
|---- | -----|
| US_TIN | &quot;US_TIN&quot; |
| TIN_NOT_DISCLOSED | &quot;TIN_NOT_DISCLOSED&quot; |
| TIN_NOT_REQUIRED | &quot;TIN_NOT_REQUIRED&quot; |
| TIN_NOT_ISSUED | &quot;TIN_NOT_ISSUED&quot; |



## Enum: Box11StatusEnum

| Name | Value |
|---- | -----|
| LIMITED_BRANCH | &quot;LIMITED_BRANCH&quot; |
| US_BRANCH | &quot;US_BRANCH&quot; |
| PARTICIPATING_FFI | &quot;PARTICIPATING_FFI&quot; |
| REPORTING_MODEL_1_FFI | &quot;REPORTING_MODEL_1_FFI&quot; |
| REPORTING_MODEL_2_FFI | &quot;REPORTING_MODEL_2_FFI&quot; |



## Enum: Part314BEnum

| Name | Value |
|---- | -----|
| COMPANY_MEETS_OWNERSHIP_AND_BASE_EROSION_TEST | &quot;CompanyMeetsOwnershipAndBaseErosionTest&quot; |
| TAX_EXEMPT_PENSION_TRUST_OR_PENSION_FUND | &quot;TaxExemptPensionTrustOrPensionFund&quot; |
| COMPANY_MEETS_DERIVATIVE_BENEFITS_TEST | &quot;CompanyMeetsDerivativeBenefitsTest&quot; |
| TAX_EXEMPT_ORGANIZATION | &quot;TaxExemptOrganization&quot; |
| COMPANY_WITH_INCOME_ACTIVE_BUSINESS | &quot;CompanyWithIncomeActiveBusiness&quot; |
| PUBLICLY_TRADED_CORPORATION | &quot;PubliclyTradedCorporation&quot; |
| FAVORABLE_DISCRETIONARY_DETERMINATION | &quot;FavorableDiscretionaryDetermination&quot; |
| SUBSIDIARY_OF_A_PUBLICLY_TRADED_CORPORATION | &quot;SubsidiaryOfAPubliclyTradedCorporation&quot; |
| GOVERNMENT | &quot;Government&quot; |
| NO_LOB_ARTICLE_IN_TREATY | &quot;NoLobArticleInTreaty&quot; |
| OTHER | &quot;Other&quot; |



## Enum: Part1226Desc3Enum

| Name | Value |
|---- | -----|
| COLLECTIVE_INVESTMENT_VEHICLE | &quot;CollectiveInvestmentVehicle&quot; |
| EXEMPT_BENEFICIAL_OWNER_RETIREMENT_PLAN | &quot;ExemptBeneficialOwner-RetirementPlan&quot; |
| FINANCIAL_INSTITUTIONWITHLOCAL_CLIENT_BASE | &quot;FinancialInstitutionwithlocalClientBase&quot; |
| INVESTMENT_ADVISORSAND_MANAGERS | &quot;InvestmentAdvisorsandManagers&quot; |
| LOCAL_BANK | &quot;LocalBank&quot; |
| SPONSORED_CLOSELY_HELD_INVESTMENT_VEHICLE | &quot;SponsoredCloselyHeldInvestmentVehicle&quot; |
| SPONSORED_INVESTMENT_ENTITY | &quot;SponsoredInvestmentEntity&quot; |
| TRUSTEE_DOCUMENTED_TRUST | &quot;TrusteeDocumentedTrust&quot; |



## Enum: SignatureTypeEnum

| Name | Value |
|---- | -----|
| ELECTRONIC | &quot;Electronic&quot; |
| PHYSICAL | &quot;Physical&quot; |



