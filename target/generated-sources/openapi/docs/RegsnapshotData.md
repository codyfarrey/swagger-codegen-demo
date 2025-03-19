

# RegsnapshotData

Object containing regulatory snapshot data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conid** | **Integer** | IB contract ID. |  [optional] |
|**conidEx** | **String** | Contract ID and routing destination in format 123456@EXCHANGE. |  [optional] |
|**sizeMinTick** | **BigDecimal** | Internal use. Minimum size display increment. |  [optional] |
|**bboExchange** | **String** | Internal use. Exchange map code. |  [optional] |
|**hasDelayed** | **Boolean** | Indicates whether delayed data is available. |  [optional] |
|**_84** | **String** | Bid price. |  [optional] |
|**_86** | **String** | Ask price. |  [optional] |
|**_88** | **Integer** | Bid size in round lots (100 shares). |  [optional] |
|**_85** | **Integer** | Ask size in round lots (100 shares). |  [optional] |
|**bestBidExch** | **Integer** | Internal use. Equivalent binary encoding of field 7068. |  [optional] |
|**bestAskExch** | **Integer** | Internal use. Equivalent binary encoding of field 7057. |  [optional] |
|**_31** | **String** | Last traded price. |  [optional] |
|**_7059** | **String** | Last traded size in round lots (100 shares). |  [optional] |
|**lastExch** | **Integer** | Internal use. Equivalent binary encoding of field 7058. |  [optional] |
|**_7057** | **String** | Best ask exchanges(s). String of single, capital-letter MCOIDs. |  [optional] |
|**_7068** | **String** | Best bid exchange(s). String of single, capital-letter MCOIDs. |  [optional] |
|**_7058** | **String** | Exchange of last trade. A single, capital-letter MCOID. |  [optional] |



