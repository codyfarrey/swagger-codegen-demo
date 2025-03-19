

# TransactionsResponseRpnlItems


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **String** | Specifies the date for the transaction. |  [optional] |
|**cur** | **String** | Specifies the currency of the realized value. |  [optional] |
|**fxRate** | **Integer** | Returns the foreign exchnage rate. |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | Determines if the day was a loss or gain * &#x60;L&#x60; - LOSS * &#x60;G&#x60; - GAIN  |  [optional] |
|**acctid** | **String** | Returns the account ID the trade transacted on. |  [optional] |
|**amt** | **String** | Returns the amount gained or lost on the day. |  [optional] |
|**conid** | **String** | Returns the contract ID of the transaction. |  [optional] |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| L | &quot;L&quot; |
| G | &quot;G&quot; |



