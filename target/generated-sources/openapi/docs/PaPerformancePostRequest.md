

# PaPerformancePostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acctIds** | **List&lt;String&gt;** | An array of strings containing each account identifier to retrieve performance details for. |  [optional] |
|**period** | [**PeriodEnum**](#PeriodEnum) | Specify the period for which the account should be analyzed. Available period lengths:   * &#x60;1D&#x60; - The last 24 hours.   * &#x60;7D&#x60; - The last 7 full days.   * &#x60;MTD&#x60; - Performance since the 1st of the month.   * &#x60;1M&#x60; - A full calendar month from the last full trade day.   * &#x60;3M&#x60; - 3 full calendar months from the last full trade day.   * &#x60;6M&#x60; - 6 full calendar months from the last full trade day.   * &#x60;12M&#x60; - 12 full calendar month from the last full trade day.   * &#x60;YTD&#x60; - Performance since January 1st.  |  [optional] |



## Enum: PeriodEnum

| Name | Value |
|---- | -----|
| _1_D | &quot;1D&quot; |
| _7_D | &quot;7D&quot; |
| MTD | &quot;MTD&quot; |
| _1_M | &quot;1M&quot; |
| _3_M | &quot;3M&quot; |
| _6_M | &quot;6M&quot; |
| _12_M | &quot;12M&quot; |
| YTD | &quot;YTD&quot; |



