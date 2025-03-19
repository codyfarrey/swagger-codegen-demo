

# TradesResponseInner

Object containing details of a single execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executionId** | **String** | IB-assigned execution identifier. |  [optional] |
|**symbol** | **String** | Symbol of the instrument involved in the execution. |  [optional] |
|**supportsTaxOpt** | [**SupportsTaxOptEnum**](#SupportsTaxOptEnum) | Indicates whether the order is supported by IB&#39;s Tax Optimization tool. |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | Side of the execution. |  [optional] |
|**orderDescription** | **String** | Human-readable description of the outcome of the execution. |  [optional] |
|**tradeTime** | **String** | UTC date and time of the execution in format YYYYMMDD-hh:mm:ss. |  [optional] |
|**tradeTimeR** | **Integer** | Unix timestamp of the execution time in milliseconds. |  [optional] |
|**size** | **BigDecimal** | The size of the execution in units of the instrument. |  [optional] |
|**price** | **String** | The price at which the execution occurred. |  [optional] |
|**orderRef** | **String** | The client-provided customer order identifier. Specified via cOID during order submission in the Web API. |  [optional] |
|**submitter** | **String** | The IB username that originated the order ticket against which the execution occurred. |  [optional] |
|**exchange** | **String** | The exchange or other venue on which the execution occurred. |  [optional] |
|**commission** | **String** | Commissions incurred by the execution. May also include |  [optional] |
|**netAmount** | **BigDecimal** | net_amount |  [optional] |
|**account** | **String** | The IB account ID of the account that received the execution. |  [optional] |
|**accountCode** | **String** | The IB account ID of the account that received the execution. |  [optional] |
|**accountAllocationName** | **String** | The IB account ID of the account that received the execution. |  [optional] |
|**companyName** | **String** | Name of business associated with instrument, or otherwise description of instrument. |  [optional] |
|**contractDescription1** | **String** | Human-readable description of the order&#39;s instrument. |  [optional] |
|**secType** | [**SecTypeEnum**](#SecTypeEnum) | IB asset class identifier. |  [optional] |
|**listingExchange** | **String** | The primary exchange on which the instrument is listed. |  [optional] |
|**conid** | **String** | Contract ID of the order&#39;s instrument. |  [optional] |
|**conidEx** | **String** | Contract ID and routing destination in format 123456@EXCHANGE. |  [optional] |
|**clearingId** | **String** | Identifier of the firm clearing the trade. Value is \&quot;IB\&quot; if account is cleared by Interactive Brokers. |  [optional] |
|**clearingName** | **String** | Name of the firm clearing the trade. Value is \&quot;IB\&quot; if account is cleared by Interactive Brokers. |  [optional] |
|**liquidationTrade** | [**LiquidationTradeEnum**](#LiquidationTradeEnum) | Indicates whether the trade is the result of a liquidiation by IB. |  [optional] |
|**isEventTrading** | [**IsEventTradingEnum**](#IsEventTradingEnum) | Indicates whether the order ticket is an Event Trading order. |  [optional] |



## Enum: SupportsTaxOptEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| B | &quot;B&quot; |
| S | &quot;S&quot; |



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



## Enum: LiquidationTradeEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: IsEventTradingEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



