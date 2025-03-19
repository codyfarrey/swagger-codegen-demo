

# DepositNotification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkDetails** | [**CheckDetails**](CheckDetails.md) |  |  [optional] |
|**wireDetails** | [**WireDetails**](WireDetails.md) |  |  [optional] |
|**achDetails** | [**ACHDetails**](ACHDetails.md) |  |  [optional] |
|**iraDepositDetails** | [**IRADepositDetails**](IRADepositDetails.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional] |
|**ibAccount** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHECK | &quot;CHECK&quot; |
| WIRE | &quot;WIRE&quot; |
| ACH | &quot;ACH&quot; |
| SKIP_DEPOSIT | &quot;SKIP_DEPOSIT&quot; |



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



