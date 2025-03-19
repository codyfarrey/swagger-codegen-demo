

# WithdrawFundsInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientInstructionId** | **BigDecimal** |  |  |
|**accountId** | **String** |  |  |
|**currency** | **String** |  |  |
|**amount** | **BigDecimal** |  |  |
|**bankInstructionName** | **String** |  |  |
|**bankInstructionMethod** | [**BankInstructionMethodEnum**](#BankInstructionMethodEnum) |  |  |
|**dateTimeToOccur** | **OffsetDateTime** |  |  [optional] |
|**iraWithdrawalDetail** | [**WithdrawFundsInstructionIraWithdrawalDetail**](WithdrawFundsInstructionIraWithdrawalDetail.md) |  |  [optional] |
|**recurringInstructionDetail** | [**RecurringInstructionDetail**](RecurringInstructionDetail.md) |  |  [optional] |



## Enum: BankInstructionMethodEnum

| Name | Value |
|---- | -----|
| ACH | &quot;ACH&quot; |
| WIRE | &quot;WIRE&quot; |
| CHECK | &quot;CHECK&quot; |



