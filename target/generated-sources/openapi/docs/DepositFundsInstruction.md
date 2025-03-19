

# DepositFundsInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientInstructionId** | **BigDecimal** |  |  |
|**accountId** | **String** |  |  |
|**currency** | **String** |  |  |
|**amount** | **BigDecimal** |  |  |
|**bankInstructionMethod** | [**BankInstructionMethodEnum**](#BankInstructionMethodEnum) |  |  |
|**sendingInstitution** | **String** |  |  [optional] |
|**identifier** | **String** |  |  [optional] |
|**specialInstruction** | **String** |  |  [optional] |
|**bankInstructionName** | **String** |  |  [optional] |
|**senderInstitutionName** | **String** |  |  [optional] |
|**iraDepositDetail** | [**DepositFundsInstructionIraDepositDetail**](DepositFundsInstructionIraDepositDetail.md) |  |  [optional] |
|**recurringInstructionDetail** | [**RecurringInstructionDetail**](RecurringInstructionDetail.md) |  |  [optional] |



## Enum: BankInstructionMethodEnum

| Name | Value |
|---- | -----|
| ACH | &quot;ACH&quot; |
| WIRE | &quot;WIRE&quot; |
| E_DDA | &quot;eDDA&quot; |



