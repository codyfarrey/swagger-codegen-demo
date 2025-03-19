

# Account


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountConfiguration** | [**AccountConfigurationType**](AccountConfigurationType.md) |  |  [optional] |
|**investmentObjectives** | [**List&lt;InvestmentObjectivesEnum&gt;**](#List&lt;InvestmentObjectivesEnum&gt;) |  |  [optional] |
|**brokerageServiceCodes** | [**List&lt;BrokerageServiceCodesEnum&gt;**](#List&lt;BrokerageServiceCodesEnum&gt;) |  |  [optional] |
|**capabilities** | [**List&lt;CapabilitiesEnum&gt;**](#List&lt;CapabilitiesEnum&gt;) |  |  [optional] |
|**tradingPermissions** | [**List&lt;TradingPermission&gt;**](TradingPermission.md) |  |  [optional] |
|**commissionConfigs** | [**List&lt;CommissionConfig&gt;**](CommissionConfig.md) |  |  [optional] |
|**allExchangeAccess** | [**List&lt;ExchangeAccess&gt;**](ExchangeAccess.md) |  |  [optional] |
|**dvpInstructions** | [**List&lt;DVPInstruction&gt;**](DVPInstruction.md) |  |  [optional] |
|**tradingLimits** | [**TradingLimits**](TradingLimits.md) |  |  [optional] |
|**advisorWrapFees** | [**AdvisorWrapFeesType**](AdvisorWrapFeesType.md) |  |  [optional] |
|**feesTemplateName** | **String** |  |  [optional] |
|**clientCommissionSchedule** | [**CommissionScheduleType**](CommissionScheduleType.md) |  |  [optional] |
|**clientInterestMarkupSchedules** | [**List&lt;InterestMarkupType&gt;**](InterestMarkupType.md) |  |  [optional] |
|**decendent** | [**IRADecedent**](IRADecedent.md) |  |  [optional] |
|**iraBeneficiaries** | [**IRABeneficiariesType**](IRABeneficiariesType.md) |  |  [optional] |
|**extPositionsTransfers** | [**List&lt;ExtPositionsTransferType&gt;**](ExtPositionsTransferType.md) |  |  [optional] |
|**depositNotification** | [**DepositNotification**](DepositNotification.md) |  |  [optional] |
|**achInstructions** | [**List&lt;ACHInstruction&gt;**](ACHInstruction.md) |  |  [optional] |
|**recurringTransactions** | [**List&lt;RecurringTransaction&gt;**](RecurringTransaction.md) |  |  [optional] |
|**custodian** | [**CustodianType**](CustodianType.md) |  |  [optional] |
|**successorCustodian** | [**CustodianType**](CustodianType.md) |  |  [optional] |
|**accountRep** | [**AccountRep**](AccountRep.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**propertyProfile** | **String** |  |  [optional] |
|**baseCurrency** | [**BaseCurrencyEnum**](#BaseCurrencyEnum) |  |  [optional] |
|**employeePlan** | **String** |  |  [optional] |
|**multiCurrency** | **Boolean** |  |  [optional] |
|**migration** | **Boolean** |  |  [optional] |
|**sourceAccountId** | **String** |  |  [optional] |
|**margin** | **String** |  |  [optional] |
|**ira** | **Boolean** |  |  [optional] |
|**iraType** | [**IraTypeEnum**](#IraTypeEnum) |  |  [optional] |
|**iraOfficialTitle** | **String** |  |  [optional] |
|**clientActiveTrading** | **Boolean** |  |  [optional] |
|**duplicate** | **Boolean** |  |  [optional] |
|**numberOfDuplicates** | **Integer** |  |  [optional] |
|**stockYieldProgram** | **Boolean** |  |  [optional] |
|**alias** | **String** |  |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional] |
|**drip** | **Boolean** |  |  [optional] |
|**limitedOptions** | **Boolean** |  |  [optional] |



## Enum: List&lt;InvestmentObjectivesEnum&gt;

| Name | Value |
|---- | -----|
| TRADING | &quot;Trading&quot; |
| GROWTH | &quot;Growth&quot; |
| SPECULATION | &quot;Speculation&quot; |
| HEDGING | &quot;Hedging&quot; |
| PRESERVATION | &quot;Preservation&quot; |
| INCOME | &quot;Income&quot; |



## Enum: List&lt;BrokerageServiceCodesEnum&gt;

| Name | Value |
|---- | -----|
| IB_CLEARING | &quot;IBClearing&quot; |
| IB_EXECUTION | &quot;IBExecution&quot; |
| IB_PRIME | &quot;IBPrime&quot; |



## Enum: List&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| BOND | &quot;BOND&quot; |
| FOP | &quot;FOP&quot; |
| FUND | &quot;FUND&quot; |
| FUT | &quot;FUT&quot; |
| MRGN | &quot;MRGN&quot; |
| MULT | &quot;MULT&quot; |
| OPT | &quot;OPT&quot; |
| SSF | &quot;SSF&quot; |
| CFD | &quot;CFD&quot; |
| STK | &quot;STK&quot; |
| CLP | &quot;CLP&quot; |
| LEVFX | &quot;LEVFX&quot; |
| CMDTY | &quot;CMDTY&quot; |



## Enum: BaseCurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;USD&quot; |
| EUR | &quot;EUR&quot; |
| GBP | &quot;GBP&quot; |
| CAD | &quot;CAD&quot; |
| JPY | &quot;JPY&quot; |
| HKD | &quot;HKD&quot; |
| AUD | &quot;AUD&quot; |
| CHF | &quot;CHF&quot; |
| MXN | &quot;MXN&quot; |
| SEK | &quot;SEK&quot; |
| NZD | &quot;NZD&quot; |
| HUF | &quot;HUF&quot; |
| CZK | &quot;CZK&quot; |
| CNH | &quot;CNH&quot; |
| DKK | &quot;DKK&quot; |
| RUB | &quot;RUB&quot; |
| ILS | &quot;ILS&quot; |
| NOK | &quot;NOK&quot; |
| SGD | &quot;SGD&quot; |
| PLN | &quot;PLN&quot; |
| ZAR | &quot;ZAR&quot; |
| AED | &quot;AED&quot; |
| KRW | &quot;KRW&quot; |
| SAR | &quot;SAR&quot; |
| TRY | &quot;TRY&quot; |



## Enum: IraTypeEnum

| Name | Value |
|---- | -----|
| RI | &quot;RI&quot; |
| RO | &quot;RO&quot; |
| RT | &quot;RT&quot; |
| SP | &quot;SP&quot; |
| ED | &quot;ED&quot; |
| TH | &quot;TH&quot; |
| RH | &quot;RH&quot; |
| SH | &quot;SH&quot; |
| RRSP | &quot;RRSP&quot; |
| SRRSP | &quot;SRRSP&quot; |
| TFSA | &quot;TFSA&quot; |
| SIMPLE | &quot;SIMPLE&quot; |
| ISA | &quot;ISA&quot; |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| INVESTMENT | &quot;Investment&quot; |
| TRADING | &quot;Trading&quot; |
| SMSF | &quot;SMSF&quot; |



