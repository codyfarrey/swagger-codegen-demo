

# StocksValueInner

Contains a series of objects for each symbol that matches the requested

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Full company name for the given contract. |  [optional] |
|**chineseName** | **String** | Chinese name for the given company as unicode. |  [optional] |
|**assetClass** | **String** | Asset class for the given company. |  [optional] |
|**contracts** | [**List&lt;StocksValueInnerContractsInner&gt;**](StocksValueInnerContractsInner.md) | A series of arrays pertaining to the same company listed by “name”. Typically differentiated based on currency of the primary exchange.  |  [optional] |



