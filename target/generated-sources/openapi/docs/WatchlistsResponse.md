

# WatchlistsResponse

Object containing a successful query for watchlists saved for the username in use in the current Web API session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**WatchlistsResponseData**](WatchlistsResponseData.md) |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Internal use. Always has value &#39;content&#39;. |  [optional] |
|**MID** | **String** | Internal use. Number of times endpoint has been visited during session. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CONTENT | &quot;content&quot; |



