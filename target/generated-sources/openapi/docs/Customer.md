

# Customer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organization** | [**OrganizationApplicant**](OrganizationApplicant.md) |  |  [optional] |
|**accountHolder** | [**IndividualApplicant**](IndividualApplicant.md) |  |  [optional] |
|**jointHolders** | [**JointApplicant**](JointApplicant.md) |  |  [optional] |
|**trust** | [**TrustApplicant**](TrustApplicant.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**transferUsMicroCapStock** | **Boolean** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**userName** | **String** |  |  [optional] |
|**userNameAlias** | **String** |  |  [optional] |
|**userNameSource** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**mdStatusNonPro** | **Boolean** |  |  [optional] |
|**preferredPrimaryLanguage** | **String** |  |  [optional] |
|**preferredSecondaryLanguage** | **String** |  |  [optional] |
|**legalResidenceCountry** | **String** |  |  [optional] |
|**taxTreatyCountry** | **String** |  |  [optional] |
|**meetAmlStandard** | **String** |  |  [optional] |
|**meetsAmlStandard** | **String** |  |  [optional] |
|**directTradingAccess** | **Boolean** |  |  [optional] |
|**originCountry** | **String** |  |  [optional] |
|**terminationAge** | **Integer** |  |  [optional] |
|**governingState** | **String** |  |  [optional] |
|**optForDebitCard** | **Boolean** |  |  [optional] |
|**roboFaClient** | **Boolean** |  |  [optional] |
|**independentAccount** | **Boolean** |  |  [optional] |
|**paperAccount** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| JOINT | &quot;JOINT&quot; |
| TRUST | &quot;TRUST&quot; |
| UGMA | &quot;UGMA&quot; |
| UTMA | &quot;UTMA&quot; |
| ORG | &quot;ORG&quot; |
| IRA | &quot;IRA&quot; |



