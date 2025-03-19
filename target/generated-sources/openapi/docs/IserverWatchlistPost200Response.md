

# IserverWatchlistPost200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The submitted watchlist ID. |  [optional] |
|**hash** | **String** | IB&#39;s internal hash of the submitted watchlist. |  [optional] |
|**name** | **String** | The submitted human-readable watchlist name. |  [optional] |
|**readOnly** | **Boolean** | Indicates whether watchlist is write-restricted. User-created watchlists will always show false. |  [optional] |
|**instruments** | **List&lt;String&gt;** | Array will always be empty. Contents can be queried via GET /iserver/watchlist?id&#x3D; |  [optional] |



