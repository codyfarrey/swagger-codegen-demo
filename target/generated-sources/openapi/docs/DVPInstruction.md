

# DVPInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**externalAccountID** | **String** |  |  [optional] |
|**accountID** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**agentID** | **String** |  |  [optional] |
|**firmID** | **String** |  |  [optional] |
|**agentName** | **String** |  |  [optional] |
|**accountName** | **String** |  |  [optional] |
|**dayDoID** | **String** |  |  [optional] |
|**txGroupCode** | [**TxGroupCodeEnum**](#TxGroupCodeEnum) |  |  [optional] |
|**brokerCode** | **String** |  |  [optional] |
|**assetClass** | [**AssetClassEnum**](#AssetClassEnum) |  |  [optional] |
|**exchange** | [**ExchangeEnum**](#ExchangeEnum) |  |  [optional] |
|**prepayTax** | **Boolean** |  |  [optional] |
|**prepayCommission** | **Boolean** |  |  [optional] |
|**expiry** | **LocalDate** |  |  [optional] |
|**_default** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DTCID | &quot;DTCID&quot; |
| NSCC | &quot;NSCC&quot; |
| CMTA | &quot;CMTA&quot; |
| GUS | &quot;GUS&quot; |
| OCCSSF | &quot;OCCSSF&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| E | &quot;E&quot; |
| C | &quot;C&quot; |
| B | &quot;B&quot; |



## Enum: TxGroupCodeEnum

| Name | Value |
|---- | -----|
| G | &quot;G&quot; |
| Z | &quot;Z&quot; |
| R | &quot;R&quot; |
| N | &quot;N&quot; |



## Enum: AssetClassEnum

| Name | Value |
|---- | -----|
| BILL | &quot;BILL&quot; |
| BOND | &quot;BOND&quot; |
| CASH | &quot;CASH&quot; |
| CFD | &quot;CFD&quot; |
| COMB | &quot;COMB&quot; |
| FOP | &quot;FOP&quot; |
| FUND | &quot;FUND&quot; |
| FUT | &quot;FUT&quot; |
| OPT | &quot;OPT&quot; |
| SSF | &quot;SSF&quot; |
| STK | &quot;STK&quot; |
| WAR | &quot;WAR&quot; |
| MRGN | &quot;MRGN&quot; |



## Enum: ExchangeEnum

| Name | Value |
|---- | -----|
| NYSE | &quot;NYSE&quot; |
| AMEX | &quot;AMEX&quot; |
| NASDAQ | &quot;NASDAQ&quot; |
| CBOE | &quot;CBOE&quot; |
| ISE | &quot;ISE&quot; |
| BOX | &quot;BOX&quot; |
| PHLX | &quot;PHLX&quot; |
| PSE | &quot;PSE&quot; |



