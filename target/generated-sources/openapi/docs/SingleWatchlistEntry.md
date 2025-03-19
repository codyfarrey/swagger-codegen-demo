

# SingleWatchlistEntry

Object containing watchlist entry for a single instrument.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ST** | [**STEnum**](#STEnum) | All-capital, shorthand security type identifier of the instrument. |  [optional] |
|**C** | **String** | Instrument conid as a string. |  [optional] |
|**conid** | **Integer** | IB contract ID of the instrument. |  [optional] |
|**name** | **String** | Complete display name of the instrument. |  [optional] |
|**fullName** | **String** | Full display presentation of the instrument symbol. |  [optional] |
|**assetClass** | [**AssetClassEnum**](#AssetClassEnum) | All-capital, shorthand security type identifier of the instrument. |  [optional] |
|**ticker** | **String** | Symbol of the instrument. |  [optional] |
|**chineseName** | **String** | Rendering of the instrument name in Chinese. |  [optional] |



## Enum: STEnum

| Name | Value |
|---- | -----|
| STK | &quot;STK&quot; |
| OPT | &quot;OPT&quot; |
| FUT | &quot;FUT&quot; |
| BOND | &quot;BOND&quot; |
| FUND | &quot;FUND&quot; |
| WAR | &quot;WAR&quot; |
| CASH | &quot;CASH&quot; |
| CRYPTO | &quot;CRYPTO&quot; |



## Enum: AssetClassEnum

| Name | Value |
|---- | -----|
| STK | &quot;STK&quot; |
| OPT | &quot;OPT&quot; |
| FUT | &quot;FUT&quot; |
| BOND | &quot;BOND&quot; |
| FUND | &quot;FUND&quot; |
| WAR | &quot;WAR&quot; |
| CASH | &quot;CASH&quot; |
| CRYPTO | &quot;CRYPTO&quot; |



