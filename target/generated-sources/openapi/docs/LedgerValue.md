

# LedgerValue

Object describing the account's balances in its base currency, by asset class and account segments. Will be duplicated by another object in response bearing the currency's name.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acctcode** | **String** | The Account ID of the requested account. |  [optional] |
|**cashbalance** | **BigDecimal** | The given account&#39;s cash balance in this currency. |  [optional] |
|**cashbalancefxsegment** | **BigDecimal** | The given account&#39;s cash balance in its dedicated forex segment in this currency, if applicable. |  [optional] |
|**commoditymarketvalue** | **BigDecimal** | Market value of the given account&#39;s commodity positions in this currency. |  [optional] |
|**corporatebondsmarketvalue** | **BigDecimal** | Market value of the given account&#39;s corporate bond positions in this currency. |  [optional] |
|**currency** | **String** | Three-letter name of the currency reflected by this object, or &#39;BASE&#39; for the account&#39;s base currency. |  [optional] |
|**dividends** | **BigDecimal** | The given account&#39;s receivable (not yet disbursed) dividend balance in this currency. |  [optional] |
|**exchangerate** | **Integer** | Exchange rate of this currency relative to the account&#39;s base currency. |  [optional] |
|**funds** | **BigDecimal** | The value of the given account&#39;s mutual fund holdings in this currency. |  [optional] |
|**futuremarketvalue** | **BigDecimal** | Market value of the given account&#39;s futures positions in this currency. |  [optional] |
|**futureoptionmarketvalue** | **BigDecimal** | Market value of the given account&#39;s futures options positions in this currency. |  [optional] |
|**futuresonlypnl** | **BigDecimal** | PnL of the given account&#39;s futures positions in this currency. |  [optional] |
|**interest** | **BigDecimal** | The given account&#39;s receivable interest balance in this currency. |  [optional] |
|**issueroptionsmarketvalue** | **BigDecimal** | Market value of the given account&#39;s issuer options positions in this currency. |  [optional] |
|**key** | [**KeyEnum**](#KeyEnum) | Identifies the nature of data. Always takes values &#39;LedgerList&#39;. |  [optional] |
|**moneyfunds** | **BigDecimal** | The value of the given account&#39;s money market fund holdings in this currency. |  [optional] |
|**netliquidationvalue** | **BigDecimal** | The given account&#39;s net liquidation value of positions in this currency. |  [optional] |
|**realizedpnl** | **BigDecimal** | The given account&#39;s realized PnL for positions in this currency. |  [optional] |
|**secondkey** | **String** | Additional identifier of the currency reflected in this object. Always matches &#39;currency&#39; field. |  [optional] |
|**sessionid** | **Integer** |  |  [optional] |
|**settledcash** | **BigDecimal** | The given account&#39;s settled cash balance in this currency. |  [optional] |
|**severity** | **Integer** |  |  [optional] |
|**stockmarketvalue** | **BigDecimal** | Market value of the given account&#39;s stock positions in this currency. |  [optional] |
|**stockoptionmarketvalue** | **BigDecimal** | Market value of the given account&#39;s stock options positions in this currency. |  [optional] |
|**tbillsmarketvalue** | **BigDecimal** | Market value of the given account&#39;s treasury bill positions in this currency. |  [optional] |
|**tbondsmarketvalue** | **BigDecimal** | Market value of the given account&#39;s treasury bond positions in this currency. |  [optional] |
|**timestamp** | **Integer** | Timestamp of retrievable of this account ledger data. |  [optional] |
|**unrealizedpnl** | **BigDecimal** | The given account&#39;s unrealied PnL for positions in this currency. |  [optional] |
|**warrantsmarketvalue** | **BigDecimal** | Market value of the given account&#39;s warrant positions in this currency. |  [optional] |



## Enum: KeyEnum

| Name | Value |
|---- | -----|
| LEDGER_LIST | &quot;LedgerList&quot; |



