

# TrustApplicant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identification** | [**List&lt;TrustIdentification&gt;**](TrustIdentification.md) |  |  [optional] |
|**financialInformation** | [**List&lt;FinancialInformation&gt;**](FinancialInformation.md) |  |  [optional] |
|**regulatoryInformation** | [**List&lt;RegulatoryInformation&gt;**](RegulatoryInformation.md) |  |  [optional] |
|**regulatedMemberships** | [**List&lt;RegulatedMembership&gt;**](RegulatedMembership.md) |  |  [optional] |
|**accreditedInvestorInformation** | [**AccreditedInvestorInformation**](AccreditedInvestorInformation.md) |  |  [optional] |
|**trustees** | [**TrusteesType**](TrusteesType.md) |  |  [optional] |
|**beneficiaries** | [**AssociationTypeEntities**](AssociationTypeEntities.md) |  |  [optional] |
|**grantors** | [**AssociationTypeEntities**](AssociationTypeEntities.md) |  |  [optional] |
|**taxResidencies** | [**List&lt;TaxResidency&gt;**](TaxResidency.md) |  |  [optional] |
|**w8BenE** | [**FormW8BENE**](FormW8BENE.md) |  |  [optional] |
|**w8IMY** | [**FormW8IMY**](FormW8IMY.md) |  |  [optional] |
|**withholdingStatement** | [**WithholdingStatementType**](WithholdingStatementType.md) |  |  [optional] |
|**thirdPartyManagement** | **Boolean** |  |  [optional] |
|**trustType** | [**TrustTypeEnum**](#TrustTypeEnum) |  |  [optional] |



## Enum: TrustTypeEnum

| Name | Value |
|---- | -----|
| COMPLEX_TRUST | &quot;COMPLEX_TRUST&quot; |
| SINGLE_TRUST | &quot;SINGLE_TRUST&quot; |
| GRANTOR_TRUST | &quot;GRANTOR_TRUST&quot; |
| US_TAXABLE_TRUST | &quot;US_TAXABLE_TRUST&quot; |



