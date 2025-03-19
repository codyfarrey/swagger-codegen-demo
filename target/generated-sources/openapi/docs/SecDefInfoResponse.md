

# SecDefInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conid** | **Integer** | Contract Identifier of the given contract. |  [optional] |
|**ticker** | **String** | Ticker symbol for the given contract |  [optional] |
|**secType** | **String** | Security type for the given contract. |  [optional] |
|**listingExchange** | **String** | Primary listing exchange for the given contract. |  [optional] |
|**exchange** | **String** | Exchange requesting data for. |  [optional] |
|**companyName** | **String** | Name of the company for the given contract. |  [optional] |
|**currency** | **String** | Traded currency allowed for the given contract. |  [optional] |
|**validExchanges** | **String** | Series of all valid exchanges the contract can be traded on in a single comma-separated string. |  [optional] |
|**priceRendering** | **Object** |  |  [optional] |
|**maturityDate** | **String** | Date of expiration for the given contract. |  [optional] |
|**right** | [**RightEnum**](#RightEnum) | Set the right for the given contract. * &#x60;C&#x60; - for Call options. * &#x60;P&#x60; - for Put options.  |  [optional] |
|**strike** | **BigDecimal** | Returns the given strike value for the given contract. |  [optional] |



## Enum: RightEnum

| Name | Value |
|---- | -----|
| P | &quot;P&quot; |
| C | &quot;C&quot; |



