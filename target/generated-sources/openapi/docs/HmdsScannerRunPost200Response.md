

# HmdsScannerRunPost200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**total** | **Integer** | Returns the total number of bonds that match the indicated search. |  [optional] |
|**size** | **Integer** | Returns the total size of the return. |  [optional] |
|**offset** | **Integer** | Returns the distance displaced from the starting 0 value. |  [optional] |
|**scanTime** | **String** | Returns the UTC datetime value of when the request took place. |  [optional] |
|**id** | **String** | Returns the market scanner name. Automatically generates an incremental scanner name for each request formatted as \&quot;scanner{ N }\&quot; |  [optional] |
|**position** | **String** | (Internal use only) |  [optional] |
|**warningText** | **String** | Returns the number of contracts returned out of total contracts that match. |  [optional] |
|**contracts** | [**HmdsScannerRunPost200ResponseContracts**](HmdsScannerRunPost200ResponseContracts.md) |  |  [optional] |



