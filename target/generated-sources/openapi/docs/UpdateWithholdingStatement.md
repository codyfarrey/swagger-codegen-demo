

# UpdateWithholdingStatement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  [optional] |
|**fatcaCompliantType** | [**FatcaCompliantTypeEnum**](#FatcaCompliantTypeEnum) |  |  [optional] |
|**usIncomeTax** | **Boolean** |  |  [optional] |
|**treatyCountry** | **String** |  |  [optional] |
|**certW8Imy** | **Boolean** |  |  [optional] |
|**effectiveDate** | **LocalDate** |  |  [optional] |



## Enum: FatcaCompliantTypeEnum

| Name | Value |
|---- | -----|
| FATCA_COMPLIANT | &quot;FATCA_COMPLIANT&quot; |
| NON_CONSENTING_US_ACCOUNT | &quot;NON_CONSENTING_US_ACCOUNT&quot; |
| NON_COOPERATIVE_ACCOUNT | &quot;NON_COOPERATIVE_ACCOUNT&quot; |



