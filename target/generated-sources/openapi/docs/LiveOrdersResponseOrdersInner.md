

# LiveOrdersResponseOrdersInner

Object representing one order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acct** | **String** | IB account ID to which the order was placed. |  [optional] |
|**exchange** | **String** | Routing destination of the order ticket. |  [optional] |
|**conidex** | **String** | Contract ID and routing destination in format 123456@EXCHANGE. |  [optional] |
|**conid** | **String** | Contract ID of the order&#39;s instrument. |  [optional] |
|**account** | **String** | IB account ID to which the order was placed. |  [optional] |
|**orderId** | **Integer** | IB-assigned order identifier. |  [optional] |
|**cashCcy** | **String** | Currency of the order ticket&#39;s Cash Quantity, if applicable. |  [optional] |
|**sizeAndFills** | **String** | Human-readable shorthand rendering of the filled and total quantities of the order. |  [optional] |
|**orderDesc** | **String** | Human-readable shorthand rendering of the order ticket. |  [optional] |
|**description1** | **String** | Descriptive text, or additional details that specific the instrument. |  [optional] |
|**ticker** | **String** | Symbol or base product code of the instrument. |  [optional] |
|**secType** | **String** | Asset class of the instrument. |  [optional] |
|**listingExchange** | **String** | Exchange on which the instrument is listed. |  [optional] |
|**remainingQuantity** | **String** | Quantity remaining to be filled in units of the instrument. |  [optional] |
|**filledQuantity** | **String** | Quantity filled in units of the instrument. |  [optional] |
|**totalSize** | **String** | Total size of an order in the instrument&#39;s units. |  [optional] |
|**totalCashSize** | **String** | Total size of a cash quantity order. |  [optional] |
|**companyName** | **String** | Name of business associated with instrument, or otherwise description of instrument. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the order ticket. |  [optional] |
|**orderCcpStatus** | **String** | IB internal order status. |  [optional] |
|**origOrderType** | **String** | Order type of a filled order. |  [optional] |
|**supportsTaxOpt** | [**SupportsTaxOptEnum**](#SupportsTaxOptEnum) | Indicates whether the order is supported by IB&#39;s Tax Optimization tool. |  [optional] |
|**lastExecutionTime** | **String** | Time of last execution against the order in format YYMMDDhhmmss. |  [optional] |
|**orderType** | **String** | Order type of a working order ticket. |  [optional] |
|**bgColor** | **String** | Internal use. IB&#39;s UI background color in hex. |  [optional] |
|**fgColor** | **String** | Internal use. IB&#39;s UI foreground color in hex. |  [optional] |
|**isEventTrading** | [**IsEventTradingEnum**](#IsEventTradingEnum) | Indicates whether the order ticket is an Event Trading order. |  [optional] |
|**price** | **String** | Price of the order, if applicable to the order type. |  [optional] |
|**timeInForce** | **String** | Time of force of the order. |  [optional] |
|**lastExecutionTimeR** | **String** | Unix timestamp of the last execution against the order. |  [optional] |
|**side** | **String** | Side of the order. |  [optional] |
|**avgPrice** | **String** | Average price of fills against the order, if any. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INACTIVE | &quot;Inactive&quot; |
| PENDING_SUBMIT | &quot;PendingSubmit&quot; |
| PRE_SUBMITTED | &quot;PreSubmitted&quot; |
| SUBMITTED | &quot;Submitted&quot; |
| FILLED | &quot;Filled&quot; |
| PENDING_CANCEL | &quot;PendingCancel&quot; |
| CANCELLED | &quot;Cancelled&quot; |
| WARN_STATE | &quot;WarnState&quot; |



## Enum: SupportsTaxOptEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: IsEventTradingEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



