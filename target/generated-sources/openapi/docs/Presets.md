

# Presets


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupAutoClosePositions** | **Boolean** | Determines if allocation groups should prioritize closing positions over equal distribution. |  [optional] |
|**defaultMethodForAll** | [**DefaultMethodForAllEnum**](#DefaultMethodForAllEnum) | Interactive Brokers supports two forms of allocation methods. Allocation methods that have calculations completed by Interactive Brokers, and a set of allocation methods calculated by the user and then specified. IB-computed allocation methods:   * &#x60;A&#x60; - Available Equity   * &#x60;E&#x60; - Equal   * &#x60;N&#x60; - Net Liquidation Value  User-specified allocation methods:   * &#x60;C&#x60; - Cash Quantity   * &#x60;P&#x60; - Percentage   * &#x60;R&#x60; - Ratios   * &#x60;S&#x60; - Shares  |  [optional] |
|**profilesAutoClosePositions** | **Boolean** | Determines if allocation profiles should prioritize closing positions over equal distribution. |  [optional] |
|**strictCreditCheck** | **Boolean** | Determines if the system should always check user credit before beginning the order process every time, or only at the time of order placement and execution. |  [optional] |
|**groupProportionalAllocation** | **Boolean** | Determines if the system should keep allocation groups proportional for scaling. |  [optional] |



## Enum: DefaultMethodForAllEnum

| Name | Value |
|---- | -----|
| AVAILABLE_EQUITY | &quot;AvailableEquity&quot; |
| E | &quot;E&quot; |
| N | &quot;N&quot; |
| C | &quot;C&quot; |
| P | &quot;P&quot; |
| R | &quot;R&quot; |
| S | &quot;S&quot; |



