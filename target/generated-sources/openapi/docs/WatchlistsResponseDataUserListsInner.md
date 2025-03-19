

# WatchlistsResponseDataUserListsInner

Details of a single watchlist.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isOpen** | **Boolean** | Internal use. Indicates if the watchlist is currently in use. |  [optional] |
|**readOnly** | **Boolean** | Indicates if the watchlist can be edited. |  [optional] |
|**name** | **String** | Display name of the watchlist. |  [optional] |
|**modified** | **Integer** | Unix timestamp in milliseconds of the last modification of the watchlist. |  [optional] |
|**id** | **String** | Watchlist ID of the watchlist. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Always has value &#39;watchlist&#39;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WATCHLIST | &quot;watchlist&quot; |



