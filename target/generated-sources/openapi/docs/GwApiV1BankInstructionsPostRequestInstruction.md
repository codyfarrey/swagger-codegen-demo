

# GwApiV1BankInstructionsPostRequestInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientInstructionId** | **BigDecimal** |  |  |
|**bankInstructionCode** | [**BankInstructionCodeEnum**](#BankInstructionCodeEnum) |  |  |
|**bankInstructionName** | **String** |  |  |
|**accountId** | **String** |  |  |
|**pendingInstructionId** | **BigDecimal** |  |  |
|**creditAmount1** | **BigDecimal** |  |  |
|**creditAmount2** | **BigDecimal** |  |  |
|**achType** | [**AchTypeEnum**](#AchTypeEnum) |  |  |
|**currency** | **String** |  |  |
|**clientAccountInfo** | [**AchInstructionClientAccountInfo**](AchInstructionClientAccountInfo.md) |  |  |
|**bankInstructionMethod** | [**BankInstructionMethodEnum**](#BankInstructionMethodEnum) |  |  |
|**financialInstitution** | [**PredefinedDestinationInstructionFinancialInstitution**](PredefinedDestinationInstructionFinancialInstitution.md) |  |  [optional] |
|**bankBranchCode** | **String** |  |  |
|**bankAccountNumber** | **String** |  |  |
|**bankClearingCode** | **String** |  |  |
|**debtorIdentificationDocumentType** | [**DebtorIdentificationDocumentTypeEnum**](#DebtorIdentificationDocumentTypeEnum) |  |  |



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



## Enum: BankInstructionMethodEnum

| Name | Value |
|---- | -----|
| LVP | &quot;LVP&quot; |
| SEPA | &quot;SEPA&quot; |
| WIRE | &quot;WIRE&quot; |
| ACH | &quot;ACH&quot; |
| CPA | &quot;CPA&quot; |



## Enum: DebtorIdentificationDocumentTypeEnum

| Name | Value |
|---- | -----|
| HK_ID | &quot;hkId&quot; |
| PASSPORT | &quot;passport&quot; |
| CHINA_ID | &quot;chinaId&quot; |
| HK_MACAO_ENTRY_PERMIT | &quot;hkMacaoEntryPermit&quot; |



