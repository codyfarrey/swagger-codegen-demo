

# AccountAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountAlias** | **String** | User-defined alias assigned to the account for easy identification. |  [optional] |
|**accountStatus** | **Integer** | Unix epoch timestamp of account opening. |  [optional] |
|**accountTitle** | **String** | A name assigned to the account, typically the account holder name or business entity. |  [optional] |
|**accountVan** | **String** | The account&#39;s virtual account number, or otherwise its IB accountId if no VAN is set. |  [optional] |
|**acctCustType** | **String** | Identifies the type of client with which the account is associated, such as an individual or LLC. |  [optional] |
|**brokerageAccess** | **Boolean** | Indicates whether account can receive live orders (do not mix with paper trading). |  [optional] |
|**businessType** | [**BusinessTypeEnum**](#BusinessTypeEnum) | A descriptor of the nature of the account, reflecting the responsible group within IB. |  [optional] |
|**clearingStatus** | [**ClearingStatusEnum**](#ClearingStatusEnum) | Status of the account with respect to clearing at IB. O is open, P pending, N new, A abandoned, C closed, R rejected. |  [optional] |
|**covestor** | **Boolean** | Indicates a Covestor account. |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | Base currency of the account. |  [optional] |
|**desc** | **String** | Internal human-readable description of the account. |  [optional] |
|**displayName** | **String** | Displayed name of the account in UI. Will reflect either the accountId or accountAlias, if set. |  [optional] |
|**faClient** | **Boolean** | Indicates that the account is managed by a financial advisor. |  [optional] |
|**ibEntity** | [**IbEntityEnum**](#IbEntityEnum) | IB business entity under which the account resides. |  [optional] |
|**id** | **String** | The account&#39;s IB accountId. |  [optional] |
|**noClientTrading** | **Boolean** | Indicates that trading by the client is disabled in the account. |  [optional] |
|**parent** | [**AccountAttributesParent**](AccountAttributesParent.md) |  |  [optional] |
|**prepaidCryptoP** | **Boolean** | Indicates whether account has a prepaid crypto segment (Crypto Plus) with PAXOS. |  [optional] |
|**prepaidCryptoZ** | **Boolean** | Indicates whether account has a prepaid crypto segment (Crypto Plus) with ZEROHASH. |  [optional] |
|**trackVirtualFXPortfolio** | **Boolean** | Indicates that virtual forex positions are tracked in the account. |  [optional] |
|**tradingType** | [**TradingTypeEnum**](#TradingTypeEnum) | Internal identifier used by IB to reflect the trading permissions of the account. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates whether the account exists in production, paper, or demo environments. |  [optional] |



## Enum: BusinessTypeEnum

| Name | Value |
|---- | -----|
| IB_SALES | &quot;IB_SALES&quot; |
| IB_PROSERVE | &quot;IB_PROSERVE&quot; |



## Enum: ClearingStatusEnum

| Name | Value |
|---- | -----|
| O | &quot;O&quot; |
| P | &quot;P&quot; |
| N | &quot;N&quot; |
| A | &quot;A&quot; |
| R | &quot;R&quot; |
| C | &quot;C&quot; |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;USD&quot; |



## Enum: IbEntityEnum

| Name | Value |
|---- | -----|
| IBLLC_US | &quot;IBLLC-US&quot; |
| IB_CAN | &quot;IB-CAN&quot; |
| IB_UK | &quot;IB-UK&quot; |
| IB_IE | &quot;IB-IE&quot; |



## Enum: TradingTypeEnum

| Name | Value |
|---- | -----|
| STKNOPT | &quot;STKNOPT&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEMO | &quot;DEMO&quot; |



