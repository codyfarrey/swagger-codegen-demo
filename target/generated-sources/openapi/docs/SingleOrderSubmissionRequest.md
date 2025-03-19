

# SingleOrderSubmissionRequest

A single order ticket.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acctId** | **String** | Receiving account of the order ticket. |  [optional] |
|**conid** | **Integer** | IB contract ID of the instrument. |  |
|**conidex** | **String** | Contract ID and routing destination together in format 123456@EXCHANGE. |  [optional] |
|**secType** | **String** | IB asset class identifier. |  [optional] |
|**cOID** | **String** | Client-configurable order identifier. |  [optional] |
|**parentId** | **String** | If the order ticket is a child order in a bracket, the parentId field must be set equal to the cOID provided for the parent order. |  [optional] |
|**listingExchange** | **String** | The listing exchange of the instrument. |  [optional] |
|**isSingleGroup** | **Boolean** | Indicates that all orders in the containing array are to be treated as an OCA group. |  [optional] |
|**outsideRTH** | **Boolean** | Instructs IB to permit the order to execute outside of regular trading hours. |  [optional] |
|**auxPrice** | **BigDecimal** | Additional price value used in certain order types, such as stop orders. |  [optional] |
|**ticker** | **String** | Ticker symbol of the instrument. |  [optional] |
|**trailingAmt** | **BigDecimal** | Offset used with Trailing orders. |  [optional] |
|**trailingType** | [**TrailingTypeEnum**](#TrailingTypeEnum) | Specifies the type of trailing used with a Trailing order. |  [optional] |
|**referrer** | **String** | IB internal identifier for order entry UI element. |  [optional] |
|**cashQty** | **BigDecimal** | Quantity of currency used with cash quantity orders. |  [optional] |
|**useAdaptive** | **Boolean** | Instructs IB to apply the Price Management Algo. |  [optional] |
|**isCcyConv** | **Boolean** | Indicates that a forex order is for currency conversion and should not entail a virtual forex position in the account, where applicable. |  [optional] |
|**orderType** | **String** | IB order type identifier. |  |
|**price** | **BigDecimal** | Price of the order ticket, where applicable. |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | Side of the order ticket. |  |
|**tif** | [**TifEnum**](#TifEnum) | Time in force of the order ticket. |  |
|**quantity** | **BigDecimal** | Quantity of the order ticket in units of the instrument. |  |
|**strategy** | **String** | The name of an execution algorithm. |  [optional] |
|**strategyParameters** | [**SingleOrderSubmissionRequestStrategyParameters**](SingleOrderSubmissionRequestStrategyParameters.md) |  |  [optional] |



## Enum: TrailingTypeEnum

| Name | Value |
|---- | -----|
| AMT | &quot;amt&quot; |
| PERCENT | &quot;%&quot; |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



## Enum: TifEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| IOC | &quot;IOC&quot; |
| GTC | &quot;GTC&quot; |
| OPG | &quot;OPG&quot; |
| PAX | &quot;PAX&quot; |



