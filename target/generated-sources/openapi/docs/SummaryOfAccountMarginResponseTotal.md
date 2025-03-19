

# SummaryOfAccountMarginResponseTotal


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentInitial** | **String** | The minimum amount required to open a new position. |  [optional] |
|**prdctdPstXpryMrgnAtOpn** | **String** | Provides a projected “at expiration” margin value based on the soon-to-expire contracts in your portfolio. |  [optional] |
|**currentMaint** | **String** | The amount of equity required to maintain your positions. |  [optional] |
|**projectedLiquidityInitalMargin** | **String** | Provides a projected \&quot;liquid\&quot; initial margin value based on account liquidation value. |  [optional] |
|**prjctdLkAhdMntnncMrgn** | **String** | If it is 3:00 pm ET, the next calculation you’re looking ahead to is after the close, or the Overnight Initial Margin. If it’s 3:00 am ET, the next calculation will be at the market’s open.  * &#x60;Securities&#x60; – Projected maintenance margin requirement as of next period’s margin change, in the base currency of the account.   * &#x60;Commodities&#x60; – Maintenance margin requirement as of next period’s margin change in the base currency of the account based on current margin requirements, which are subject to change. This value depends on when you are viewing your margin requirements.  |  [optional] |
|**projectedOvernightInitialMargin** | **String** | Overnight refers to the window of time after the local market trading day is closed.    * Securities – Projected overnight initial margin requirement in the base currency of the account.    * Commodities – Overnight initial margin requirement in the base currency of the account based on current margin requirements, which are subject to change.  |  [optional] |
|**prjctdOvrnghtMntnncMrgn** | **String** | Overnight refers to the window of time after the local market trading day is closed.    * &#x60;Securities&#x60; – Projected overnight maintenance margin requirement in the base currency of the account.    * &#x60;Commodities&#x60; – Overnight maintenance margin requirement in the base currency of the account based on current margin requirements, which are subject to change.  |  [optional] |



