

# DetailedContractInformationValueValue

Returns the performance data for the given period value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nav** | **List&lt;BigDecimal&gt;** | Net asset value data for the account or consolidated accounts. NAV data is not applicable to benchmarks. |  [optional] |
|**cps** | **List&lt;BigDecimal&gt;** | Returns the object containing the Cumulative performance data. Correlates to the same index position of data reutnred by the \&quot;nav\&quot; field. |  [optional] |
|**freq** | **String** | Returns the determining frequency of the data range. |  [optional] |
|**dates** | **List&lt;String&gt;** | Returns the dates corresponding to the frequency of data. |  [optional] |
|**startNav** | [**DetailedContractInformationValueValueStartNav**](DetailedContractInformationValueValueStartNav.md) |  |  [optional] |



