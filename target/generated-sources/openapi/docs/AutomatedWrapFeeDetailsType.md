

# AutomatedWrapFeeDetailsType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**perTradeMarkups** | [**CommissionScheduleType**](CommissionScheduleType.md) |  |  [optional] |
|**annualBlendedPercentages** | [**List&lt;AnnualBlendedPercentage&gt;**](AnnualBlendedPercentage.md) |  |  [optional] |
|**navRanges** | [**List&lt;NAVRangeType&gt;**](NAVRangeType.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**maxFee** | **BigDecimal** |  |  [optional] |
|**numContracts** | **Integer** |  |  [optional] |
|**postFrequency** | **String** |  |  [optional] |
|**percentOfNLVCap** | **String** |  |  [optional] |
|**percentOfNLVCapQ** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANNUALFLATFEE | &quot;ANNUALFLATFEE&quot; |
| ANNUALFLATFEE_MONTHLY | &quot;ANNUALFLATFEE_MONTHLY&quot; |
| ANNUALFLATFEE_QUATERLY | &quot;ANNUALFLATFEE_QUATERLY&quot; |
| PERCENTOFEQUITY | &quot;PERCENTOFEQUITY&quot; |
| PERCENTOFEQUITY_MONTHLY | &quot;PERCENTOFEQUITY_MONTHLY&quot; |
| PERCENTOFEQUITY_QUATERLY | &quot;PERCENTOFEQUITY_QUATERLY&quot; |
| PERCENTOFEQUITY_QUARTERLY | &quot;PERCENTOFEQUITY_QUARTERLY&quot; |
| BLENDEDPERCENTOFEQUITY | &quot;BLENDEDPERCENTOFEQUITY&quot; |
| BLENDEDPERCENTOFEQUITY_MONTHLY | &quot;BLENDEDPERCENTOFEQUITY_MONTHLY&quot; |
| BLENDEDPERCENTOFEQUITY_QUARTERLY | &quot;BLENDEDPERCENTOFEQUITY_QUARTERLY&quot; |
| PERCENTOFPROFIT | &quot;PERCENTOFPROFIT&quot; |
| PERCENTOFPROFIT_QUARTER | &quot;PERCENTOFPROFIT_QUARTER&quot; |
| INVOICE_LIMIT | &quot;INVOICE_LIMIT&quot; |
| INVOICE_LIMIT_Q | &quot;INVOICE_LIMIT_Q&quot; |
| PERTRADE | &quot;PERTRADE&quot; |



