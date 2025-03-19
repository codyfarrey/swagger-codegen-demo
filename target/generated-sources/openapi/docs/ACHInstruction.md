

# AchInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientInstructionId** | **BigDecimal** |  |  |
|**bankInstructionCode** | [**BankInstructionCodeEnum**](#BankInstructionCodeEnum) |  |  |
|**achType** | [**AchTypeEnum**](#AchTypeEnum) |  |  |
|**bankInstructionName** | **String** |  |  |
|**currency** | **String** |  |  |
|**accountId** | **String** |  |  |
|**clientAccountInfo** | [**AchInstructionClientAccountInfo**](AchInstructionClientAccountInfo.md) |  |  |



## Enum: BankInstructionCodeEnum

| Name | Value |
|---- | -----|
| CAACH | &quot;CAACH&quot; |
| USACH | &quot;USACH&quot; |



## Enum: AchTypeEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;DEBIT&quot; |
| CREDIT | &quot;CREDIT&quot; |
| DEBIT_CREDIT | &quot;DEBIT_CREDIT&quot; |



