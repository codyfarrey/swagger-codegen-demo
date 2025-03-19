

# WithholdingStatementType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  [optional] |
|**fatcaCompliantType** | [**FatcaCompliantTypeEnum**](#FatcaCompliantTypeEnum) |  |  [optional] |
|**usBackupWithholding** | **Boolean** |  |  [optional] |
|**treatyCountry** | **String** |  |  [optional] |
|**corporation** | **Boolean** |  |  [optional] |
|**flowThrough** | **Boolean** |  |  [optional] |
|**effectiveDate** | **LocalDate** |  |  [optional] |
|**dividendRate** | **Float** |  |  [optional] |
|**interestRate** | **Float** |  |  [optional] |
|**usOtherRate** | **Float** |  |  [optional] |
|**eciRate** | **Float** |  |  [optional] |



## Enum: FatcaCompliantTypeEnum

| Name | Value |
|---- | -----|
| FATCA_COMPLIANT | &quot;FATCA_COMPLIANT&quot; |
| NON_CONSENTING_US_ACCOUNT | &quot;NON_CONSENTING_US_ACCOUNT&quot; |
| NON_COOPERATIVE_ACCOUNT | &quot;NON_COOPERATIVE_ACCOUNT&quot; |



