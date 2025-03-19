

# RecurringTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**achInstruction** | [**ACHInstruction**](ACHInstruction.md) |  |  [optional] |
|**iraWithdrawalDetails** | [**IRAWithdrawalDetails**](IRAWithdrawalDetails.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) |  |  [optional] |
|**instruction** | **String** |  |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**endDate** | **LocalDate** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional] |
|**ibAccount** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAWAL | &quot;WITHDRAWAL&quot; |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| CHECK | &quot;CHECK&quot; |
| WIRE | &quot;WIRE&quot; |
| ACH | &quot;ACH&quot; |
| SKIP_DEPOSIT | &quot;SKIP_DEPOSIT&quot; |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| YEARLY | &quot;YEARLY&quot; |



## Enum: CurrencyEnum

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



