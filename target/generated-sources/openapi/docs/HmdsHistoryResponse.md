

# HmdsHistoryResponse

Object containing the requested historical data and related metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **String** | UTC date and time of the start (chronologically earlier) of the complete period in format YYYYMMDD-hh:mm:ss. |  [optional] |
|**startTimeVal** | **Integer** | Unix timestamp of the start (chronologically earlier) of the complete period. |  [optional] |
|**endTime** | **String** | UTC date and time of the end (chronologically later) of the complete period in format YYYYMMDD-hh:mm:ss. |  [optional] |
|**endTimeVal** | **Integer** | Unix timestamp of the end (chronologically later) of the complete period. |  [optional] |
|**data** | [**List&lt;SingleHistoricalBar&gt;**](SingleHistoricalBar.md) | Array containing OHLC bars for the requested period. |  [optional] |
|**points** | **Integer** | Count of the number of bars returned in the data array. |  [optional] |
|**mktDataDelay** | **Integer** | Number of milliseconds taken to satisfy this historical data request. |  [optional] |



