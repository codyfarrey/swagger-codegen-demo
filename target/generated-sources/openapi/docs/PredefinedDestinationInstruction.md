

# PredefinedDestinationInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientInstructionId** | **BigDecimal** |  |  |
|**bankInstructionName** | **String** |  |  |
|**bankInstructionMethod** | [**BankInstructionMethodEnum**](#BankInstructionMethodEnum) |  |  |
|**accountId** | **String** |  |  |
|**currency** | **String** |  |  |
|**financialInstitution** | [**PredefinedDestinationInstructionFinancialInstitution**](PredefinedDestinationInstructionFinancialInstitution.md) |  |  [optional] |



## Enum: BankInstructionMethodEnum

| Name | Value |
|---- | -----|
| LVP | &quot;LVP&quot; |
| SEPA | &quot;SEPA&quot; |
| WIRE | &quot;WIRE&quot; |
| ACH | &quot;ACH&quot; |
| CPA | &quot;CPA&quot; |



