

# TransactionsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rc** | **Integer** | Client portal use only |  [optional] |
|**nd** | **Integer** | Client portal use only |  [optional] |
|**rpnl** | [**TransactionsResponseRpnl**](TransactionsResponseRpnl.md) |  |  [optional] |
|**currency** | **String** | Returns the currency the account is traded in. |  [optional] |
|**from** | **Integer** | Returns the epoch time for the start of requests. |  [optional] |
|**id** | **String** | Returns the request identifier, getTransactions. |  [optional] |
|**to** | **Integer** | Returns the epoch time for the end of requests. |  [optional] |
|**includesRealTime** | **Boolean** | Returns if the trades are up to date or not. |  [optional] |
|**transactions** | [**List&lt;TransactionsResponseTransactionsInner&gt;**](TransactionsResponseTransactionsInner.md) | Lists all supported transaction values. |  [optional] |



