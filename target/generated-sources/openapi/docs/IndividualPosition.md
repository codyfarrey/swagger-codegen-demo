

# IndividualPosition

A specific account's position in the requested conid.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acctId** | **String** | IB accountId of an account with a position in the requested conid. |  [optional] |
|**allExchanges** | **String** | Comma separated all exchanges on which the instrument trades. |  [optional] |
|**assetClass** | **String** | Asset class of the requested instrument. |  [optional] |
|**avgCost** | **BigDecimal** | The account&#39;s average cost for its position. |  [optional] |
|**avgPrice** | **BigDecimal** | The account&#39;s average price for its position. |  [optional] |
|**baseAvgCost** | **BigDecimal** | Average cost in the account&#39;s base currency. |  [optional] |
|**baseAvgPrice** | **BigDecimal** | Average price in the account&#39;s base currency. |  [optional] |
|**baseMktPrice** | **BigDecimal** | Market price of instrument in the account&#39;s base currency. |  [optional] |
|**baseMktValue** | **BigDecimal** | Market value of the position in the account&#39;s base currency. |  [optional] |
|**baseRealizedPnl** | **BigDecimal** | Realized PnL for the instrument in the account&#39;s base currency. |  [optional] |
|**baseUnrealizedPnl** | **BigDecimal** | Unrealized PnL for the instrument in the account&#39;s base currency. |  [optional] |
|**chineseName** | **String** | Chinese name of the instrument. |  [optional] |
|**conExchMap** | **List&lt;String&gt;** |  |  [optional] |
|**conid** | **Integer** | IB contract ID for the instrument. |  [optional] |
|**contractDesc** | **String** | Human-readable description of the instrument. |  [optional] |
|**countryCode** | **String** | Country in which the instrument is issued. |  [optional] |
|**currency** | **String** | Currency in which the instrument trades. |  [optional] |
|**displayRule** | [**IndividualPositionDisplayRule**](IndividualPositionDisplayRule.md) |  |  [optional] |
|**exchs** | **Object** |  |  [optional] |
|**exerciseStyle** | **String** | Style of exercise for options. |  [optional] |
|**expiry** | **String** | Expiration of instrument, if applicable. |  [optional] |
|**fullName** | **String** | Full display name of the instrument. |  [optional] |
|**group** | **String** | Industry sub-categorization of the instrument. |  [optional] |
|**hasOptions** | **Boolean** | Indicates whether instrument has options contracts available for trading at IB. |  [optional] |
|**incrementRules** | [**List&lt;IndividualPositionIncrementRulesInner&gt;**](IndividualPositionIncrementRulesInner.md) | Array containing increment rules used when pricing orders for the instrument. |  [optional] |
|**isEventContract** | **Boolean** | Indicates whether the instrument is an Event Contract. |  [optional] |
|**isUS** | **Boolean** | Indicates whether the instrument is issued in the US. |  [optional] |
|**lastTradingDay** | **String** | Last day of trading in the instrument, if applicable. Formatted &#x60;YYYYMMDD&#x60;. |  [optional] |
|**listingExchange** | **String** | The exchange on which the instrument is listed, or the primary exchange recognized by IB for the instrument. |  [optional] |
|**mktPrice** | **BigDecimal** | Current market price of the instrument, in the instrument&#39;s currency. |  [optional] |
|**mktValue** | **BigDecimal** | Current market value of the account&#39;s position in the instrument, in the instrument&#39;s currency. |  [optional] |
|**model** | **String** | Name of the model portfolio in which the account is invested that contributes this position. |  [optional] |
|**multiplier** | **BigDecimal** | Instrument&#39;s multiplier, if applicable. |  [optional] |
|**name** | **String** | Formal name of the entity or asset to which the instrument relates. |  [optional] |
|**pageSize** | **Integer** | Maximum number of accounts that can be returned in a single request. |  [optional] |
|**position** | **BigDecimal** | Size of position in units of instrument. |  [optional] |
|**putOrCall** | [**PutOrCallEnum**](#PutOrCallEnum) | The right of an options contract, if applicable. |  [optional] |
|**realizedPnl** | **BigDecimal** | Realized PnL for the instrument in the instrument&#39;s currency. |  [optional] |
|**sector** | **String** | Industry sector categorization of the instrument. |  [optional] |
|**sectorGroup** | **String** | Industry sub-categorization of the instrument. |  [optional] |
|**strike** | **String** | Strike price, if applicable. Returned as string. |  [optional] |
|**ticker** | **String** | Symbol associated with the instrument. |  [optional] |
|**time** | **Integer** | Time taken to retrieve position data in milliseconds. |  [optional] |
|**type** | **String** | Description of instrument, used to differentiate classes, if applicable. |  [optional] |
|**undConid** | **Integer** | Contract ID of underlying instrument, if applicable. |  [optional] |
|**unrealizedPnl** | **BigDecimal** | Unrealized PnL for the instrument in the account. |  [optional] |



## Enum: PutOrCallEnum

| Name | Value |
|---- | -----|
| P | &quot;P&quot; |
| C | &quot;C&quot; |



