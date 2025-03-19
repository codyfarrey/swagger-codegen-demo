

# QueryRecentInstructionResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientInstructionId** | **String** |  |  |
|**instructionType** | [**InstructionTypeEnum**](#InstructionTypeEnum) |  |  |
|**instructionStatus** | [**InstructionStatusEnum**](#InstructionStatusEnum) |  |  |
|**instructionId** | **BigDecimal** |  |  |
|**ibReferenceId** | **BigDecimal** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**error** | [**PollingInstructionResultError**](PollingInstructionResultError.md) |  |  [optional] |
|**instructionHistory** | [**QueryRecentInstructionResultAllOfInstructionHistory**](QueryRecentInstructionResultAllOfInstructionHistory.md) |  |  |



## Enum: InstructionTypeEnum

| Name | Value |
|---- | -----|
| ACCOUNT_CLOSE | &quot;ACCOUNT_CLOSE&quot; |
| ACH_INSTRUCTION | &quot;ACH_INSTRUCTION&quot; |
| APPLY_FEE_TEMPLATE | &quot;APPLY_FEE_TEMPLATE&quot; |
| CANCEL_INSTRUCTION | &quot;CANCEL_INSTRUCTION&quot; |
| COMPLEX_ASSET_TRANSFER | &quot;COMPLEX_ASSET_TRANSFER&quot; |
| DELETE_BANK_INSTRUCTION | &quot;DELETE_BANK_INSTRUCTION&quot; |
| DEPOSIT | &quot;DEPOSIT&quot; |
| DWAC | &quot;DWAC&quot; |
| EXTERNAL_POSITION_TRANSFER | &quot;EXTERNAL_POSITION_TRANSFER&quot; |
| FOP | &quot;FOP&quot; |
| QUERY_RECENT_INSTRUCTIONS | &quot;QUERY_RECENT_INSTRUCTIONS&quot; |
| QUERY_WITHDAWABLE_FUNDS_INTERNAL_POSITION_TRANSFER | &quot;QUERY_WITHDAWABLE_FUNDS INTERNAL_POSITION_TRANSFER&quot; |
| INTERNAL_CASH_TRANSFER | &quot;INTERNAL_CASH_TRANSFER&quot; |
| MICRO_AMOUNT | &quot;MICRO_AMOUNT&quot; |
| PREDEFINED_DESTINATION_INSTRUCTION_TRADITIONAL_BANK_INSTRUCTION_VERIFICATION | &quot;PREDEFINED_DESTINATION_INSTRUCTION TRADITIONAL_BANK_INSTRUCTION_VERIFICATION&quot; |
| WITHDRAWAL | &quot;WITHDRAWAL&quot; |



## Enum: InstructionStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| REJECTED | &quot;REJECTED&quot; |
| PROCESSED | &quot;PROCESSED&quot; |



