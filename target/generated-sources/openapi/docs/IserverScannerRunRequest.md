

# IserverScannerRunRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrument** | **String** | Instrument type as the target of the market scanner request. Found in the “instrument_list” section of the /iserver/scanner/params response. |  [optional] |
|**type** | **String** | Scanner value the market scanner is sorted by. Based on the “scan_type_list” section of the /iserver/scanner/params response. |  [optional] |
|**location** | **String** | Location value the market scanner is searching through. Based on the “location_tree” section of the /iserver/scanner/params response. |  [optional] |
|**filter** | [**List&lt;IserverScannerRunRequestFilterInner&gt;**](IserverScannerRunRequestFilterInner.md) | Contains any additional filters that should apply to response. |  [optional] |



