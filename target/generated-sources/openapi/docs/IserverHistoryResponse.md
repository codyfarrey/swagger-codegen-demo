

# IserverHistoryResponse

Object containing the requested historical data and related metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serverId** | **String** | Internal use. Identifier of the request. |  [optional] |
|**symbol** | **String** | Symbol of the request instrument. |  [optional] |
|**text** | **String** | Description or company name of the instrument. |  [optional] |
|**priceFactor** | **Integer** | Internal use. Used to scale Client Portal chart Y-axis. |  [optional] |
|**startTime** | **String** | UTC date and time of the start (chronologically earlier) of the complete period in format YYYYMMDD-hh:mm:ss. |  [optional] |
|**high** | **String** | Internal use. Delivers highest price value in total interval. Used for chart scaling. A string constructed as &#39;highestPrice*priceFactor/totalVolume*volumeFactor/minutesFromStartTime&#39;. |  [optional] |
|**low** | **String** | Internal use. Delivers lowest price value in total interval. Used for chart scaling. A string constructed as &#39;lowestPrice*priceFactor/totalVolume*volumeFactor/minutesFromStartTime&#39;. |  [optional] |
|**timePeriod** | **String** | The client-specified period value. |  [optional] |
|**barLength** | **Integer** | The client-specified bar width, represented in seconds. |  [optional] |
|**mdAvailability** | **String** | A three-character string reflecting the nature of available data. R &#x3D; Realtime, D &#x3D; Delayed, Z &#x3D; Frozen, Y &#x3D; Frozen Delayed, N &#x3D; Not Subscribed. P &#x3D; Snapshot, p &#x3D; Consolidated. B &#x3D; Top of book. |  [optional] |
|**outsideRth** | **Boolean** | Indicates whether data from outside regular trading hours is included in the response. |  [optional] |
|**tradingDayDuration** | **Integer** | Length of instrument&#39;s trading day in seconds. |  [optional] |
|**volumeFactor** | **Integer** | Internal use. Used to scale volume histograms. |  [optional] |
|**priceDisplayRule** | **Integer** | Internal use. Governs application of pricing display rule. |  [optional] |
|**priceDisplayValue** | **String** | Internal use. Governs rendering of displayed pricing. |  [optional] |
|**chartPanStartTime** | **String** | Internal use. UTC datetime string used to center Client Portal charts. Format YYYYMMDD-hh:mm:ss. |  [optional] |
|**direction** | **Integer** | Indicates how the period is applied in relation to the startTime. Value will always be -1, indicating that the period extends from the startTime forward into the future. |  [optional] |
|**negativeCapable** | **Boolean** | Indicates whether instrument is capable of negative pricing. |  [optional] |
|**messageVersion** | **Integer** | Internal use. Reflects the version of the response schema used. |  [optional] |
|**travelTime** | **Integer** | Internal time in flight to serve the request. |  [optional] |
|**data** | [**List&lt;SingleHistoricalBar&gt;**](SingleHistoricalBar.md) | Array containing OHLC bars for the requested period. |  [optional] |
|**points** | **Integer** | Count of the number of bars returned in the data array. |  [optional] |
|**mktDataDelay** | **Integer** | Number of milliseconds taken to satisfy this historical data request. |  [optional] |



