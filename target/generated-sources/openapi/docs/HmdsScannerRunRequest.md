

# HmdsScannerRunRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrument** | **String** | Specify the type of instrument for the request. Found under the “instrument_list” value of the /hmds/scanner/params request. |  [optional] |
|**locations** | **String** | Specify the type of location for the request. Found under the “location_tree” value of the /hmds/scanner/params request. |  [optional] |
|**scanCode** | **String** | Specify the scanner type for the request. Found under the “scan_type_list” value of the /hmds/scanner/params request. |  [optional] |
|**secType** | **String** | Specify the type of security type for the request. Found under the “location_tree” value of the /hmds/scanner/params request. |  [optional] |
|**delayedLocations** | **String** |  |  [optional] |
|**maxItems** | **Integer** | Specify how many items should be returned. |  [optional] |
|**filters** |  | Array of objects containing all filters upon the scanner request. Content contains a series of key:value pairs. While “filters” must be specified in the body, no content in the array needs to be passed.  |  [optional] |



