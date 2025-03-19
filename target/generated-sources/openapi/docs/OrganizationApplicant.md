

# OrganizationApplicant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifications** | [**List&lt;OrganizationIdentification&gt;**](OrganizationIdentification.md) |  |  [optional] |
|**accountSupport** | [**AccountSupportType**](AccountSupportType.md) |  |  [optional] |
|**financialInformation** | [**List&lt;FinancialInformation&gt;**](FinancialInformation.md) |  |  [optional] |
|**accreditedInvestorInformation** | [**AccreditedInvestorInformation**](AccreditedInvestorInformation.md) |  |  [optional] |
|**regulatoryInformation** | [**List&lt;RegulatoryInformation&gt;**](RegulatoryInformation.md) |  |  [optional] |
|**managingOwner** | [**ManagingOwner**](ManagingOwner.md) |  |  [optional] |
|**associatedEntities** | [**AssociatedEntities**](AssociatedEntities.md) |  |  [optional] |
|**regulatedMemberships** | [**List&lt;RegulatedMembership&gt;**](RegulatedMembership.md) |  |  [optional] |
|**taxResidencies** | [**List&lt;TaxResidency&gt;**](TaxResidency.md) |  |  [optional] |
|**w8BenE** | [**FormW8BENE**](FormW8BENE.md) |  |  [optional] |
|**w8IMY** | [**FormW8IMY**](FormW8IMY.md) |  |  [optional] |
|**withholdingStatement** | [**WithholdingStatementType**](WithholdingStatementType.md) |  |  [optional] |
|**typeOfTrading** | [**TypeOfTradingEnum**](#TypeOfTradingEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**orgUsSubsidiary** | **Boolean** |  |  [optional] |
|**qualifiedIntermediary** | **Boolean** |  |  [optional] |
|**assumedPrimaryReporting** | **Boolean** |  |  [optional] |
|**acceptedPrimaryWithholding** | **Boolean** |  |  [optional] |
|**usTaxPurposeType** | [**UsTaxPurposeTypeEnum**](#UsTaxPurposeTypeEnum) |  |  [optional] |



## Enum: TypeOfTradingEnum

| Name | Value |
|---- | -----|
| FIRM | &quot;FIRM&quot; |
| CUSTOMER | &quot;CUSTOMER&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LLC | &quot;LLC&quot; |
| CORPORATION | &quot;CORPORATION&quot; |
| PARTNERSHIP | &quot;PARTNERSHIP&quot; |
| UNINCORPORATED_BUSINESS | &quot;UNINCORPORATED BUSINESS&quot; |



## Enum: UsTaxPurposeTypeEnum

| Name | Value |
|---- | -----|
| C | &quot;C&quot; |
| P | &quot;P&quot; |
| E | &quot;E&quot; |



