

# OrderStatus

Object containing information about the status of an order ticket.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subType** | **String** | Internal use only. |  [optional] |
|**requestId** | **String** | Internal use only. IB-assigned identifier for the status request. |  [optional] |
|**serverId** | **String** | IB-assigned meta-identifier used to associate rejected and resubmitted orders following Server Prompts. |  [optional] |
|**orderId** | **Integer** | The IB-assigned order identifier of the order, as provided in the request path. |  [optional] |
|**conidex** | **String** | Contract ID and routing destination in format 123456@EXCHANGE. |  [optional] |
|**conid** | **String** | Contract ID of the order&#39;s instrument. |  [optional] |
|**symbol** | **String** | Symbol of the order ticket&#39;s instrument. |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | Side of the order ticket. |  [optional] |
|**contractDescription1** | **String** | Human-readable description of the order&#39;s instrument. |  [optional] |
|**listingExchange** | **String** | Primary listing exchange of the order ticket&#39;s instrument. |  [optional] |
|**optionAcct** | **String** | Internal use only. |  [optional] |
|**companyName** | **String** | Name of the company or asset associated with the instrument. |  [optional] |
|**size** | **String** | Remaining unfilled size of the order ticket. Will reflect 0.0 if order is filled in full, cancelled, or otherwise resolved and no longer working. |  [optional] |
|**totalSize** | **String** | The total size of the order ticket. |  [optional] |
|**currency** | **String** | The currency in which the instrument trades and executions are conducted. |  [optional] |
|**account** | **String** | The account receiving executions against this order ticket. |  [optional] |
|**orderType** | **String** | The order&#39;s  IB order type. |  [optional] |
|**cumFill** | **String** | Cumulative filled quantity of the instrument against the order ticket. |  [optional] |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | Status of the order ticket. |  [optional] |
|**orderCcpStatus** | **String** | IB internal order status. |  [optional] |
|**orderStatusDescription** | **String** | Human-readable rendering of the order&#39;s status meant for presentation in UI. |  [optional] |
|**tif** | [**TifEnum**](#TifEnum) | Time in force of the order ticket. |  [optional] |
|**fgColor** | **String** | Internal use. IB&#39;s UI foreground color in hex. |  [optional] |
|**bgColor** | **String** | Internal use. IB&#39;s UI background color in hex. |  [optional] |
|**orderNotEditable** | **Boolean** | Indicates whether the order ticket can be modified. |  [optional] |
|**editableFields** | **String** | Indicates which fields of the order ticket can be modified currently. |  [optional] |
|**cannotCancelOrder** | **Boolean** | Indicates whether the order ticket can be cancelled. |  [optional] |
|**deactivateOrder** | **Boolean** | Indicates whether the order ticket can be deactivated. |  [optional] |
|**secType** | [**SecTypeEnum**](#SecTypeEnum) | IB asset class identifier. |  [optional] |
|**availableChartPeriods** | **String** | Internal use. Indicates chart periods available for the instrument. |  [optional] |
|**orderDescription** | **String** | Human-readable description of the status or current result of the order ticket, meant for UI presentation. |  [optional] |
|**orderDescriptionWithContract** | **String** | Human-readable description of the status or current result of the order ticket, meant for UI presentation. Includes instrument name. |  [optional] |
|**alertActive** | **Integer** | Indicates that an alert is active for the order ticket. |  [optional] |
|**childOrderType** | [**ChildOrderTypeEnum**](#ChildOrderTypeEnum) | Indicates if the order ticket is hedged, and if so, in what way. 0 &#x3D; No hedge, A &#x3D; Attached child hedge order, B &#x3D; Beta/portfolio hedge |  [optional] |
|**orderClearingAccount** | **String** | The IB account to which the order ticket clears. |  [optional] |
|**sizeAndFills** | **String** | A string reflecting the cumulative fills and total size of the order. |  [optional] |
|**exitStrategyDisplayPrice** | **String** | Internal use. The UI-displayed price associated with a Client Portal exist strategy. |  [optional] |
|**exitStrategyChartDescription** | **String** | Internal use. A string describing an active Client Portal exit strategy, or the result of its execution. |  [optional] |
|**averagePrice** | **String** | Average price of fills against the order, if any. |  [optional] |
|**exitStrategyToolAvailability** | **String** | Internal use. Indicates the availability of Client Portal exit strategy tool for the order. |  [optional] |
|**allowedDuplicateOpposite** | **Boolean** | Indicates whether an identical order on the opposite side can be placed. |  [optional] |
|**orderTime** | **String** | Time of the order&#39;s submission in format YYMMDDhhmmss. |  [optional] |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



## Enum: OrderStatusEnum

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



## Enum: TifEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| IOC | &quot;IOC&quot; |
| GTC | &quot;GTC&quot; |
| OPG | &quot;OPG&quot; |
| PAX | &quot;PAX&quot; |



## Enum: SecTypeEnum

| Name | Value |
|---- | -----|
| STK | &quot;STK&quot; |
| OPT | &quot;OPT&quot; |
| FUT | &quot;FUT&quot; |
| FOP | &quot;FOP&quot; |
| CASH | &quot;CASH&quot; |
| CRYPTO | &quot;CRYPTO&quot; |
| BOND | &quot;BOND&quot; |
| WAR | &quot;WAR&quot; |
| FUND | &quot;FUND&quot; |



## Enum: ChildOrderTypeEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| A | &quot;A&quot; |
| B | &quot;B&quot; |



