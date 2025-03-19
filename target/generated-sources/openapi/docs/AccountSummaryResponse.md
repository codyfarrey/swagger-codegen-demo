

# AccountSummaryResponse

Successful return contianing an array of at-a-glance account details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | **String** | Describes the unique account type. For standard individual accounts, an empty string is returned. |  [optional] |
|**status** | **String** | If the account is currently non-tradeable, a status message will be dispalyed. |  [optional] |
|**balance** | **Integer** | Returns the total account balance. |  [optional] |
|**SMA** | **Integer** | Simple Moving Average of the account. |  [optional] |
|**buyingPower** | **Integer** | Total buying power available for the account. |  [optional] |
|**availableFunds** | **Integer** | The amount of equity you have available for trading. For both the Securities and Commodities segments, this is calculated as: Equity with Loan Value – Initial Margin. |  [optional] |
|**excessLiquidity** | **Integer** | The amount of cash in excess of the usual requirement in your account. |  [optional] |
|**netLiquidationValue** | **Integer** | The basis for determining the price of the assets in your account. |  [optional] |
|**equityWithLoanValue** | **Integer** | The basis for determining whether you have the necessary assets to either initiate or maintain security assets. |  [optional] |
|**regTLoan** | **Integer** | The Federal Reserve Board regulation governing the amount of credit that broker dealers may extend to clients who borrow money to buy securities on margin. |  [optional] |
|**securitiesGVP** | **Integer** | Absolute value of the Long Stock Value + Short Stock Value + Long Option Value + Short Option Value + Fund Value. |  [optional] |
|**totalCashValue** | **Integer** | Cash recognized at the time of trade + futures P&amp;L. This value reflects real-time currency positions, including:  *  Trades executed directly through the FX market.  *  Trades executed as a result of automatic IB conversions, which occur when you trade a product in a non-base currency.  *  Trades deliberately executed to close non-base currency positions using the FXCONV destination.  |  [optional] |
|**accruedInterest** | **Integer** | Accrued interest is the interest accruing on a security since the previous coupon date. If a security is sold between two payment dates, the buyer usually compensates the seller for the interest accrued, either within the price or as a separate payment. |  [optional] |
|**regTMargin** | **Integer** | The initial margin requirements calculated under US Regulation T rules for both the securities and commodities segment of your account. |  [optional] |
|**initialMargin** | **Integer** | The available initial margin for the account. |  [optional] |
|**maintenanceMargin** | **Integer** | The available maintenance margin for the account. |  [optional] |
|**cashBalances** | [**List&lt;AccountSummaryResponseCashBalancesInner&gt;**](AccountSummaryResponseCashBalancesInner.md) | An array containing balance information for all currencies held by the account. |  [optional] |



