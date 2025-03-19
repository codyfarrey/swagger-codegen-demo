

# AdvisorWrapFeesType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**automatedFeesDetails** | [**List&lt;AutomatedWrapFeeDetailsType&gt;**](AutomatedWrapFeeDetailsType.md) |  |  [optional] |
|**highWaterMarkConfigHwma** | [**HighWaterMarkType**](HighWaterMarkType.md) |  |  [optional] |
|**highWaterMarkConfigHwmq** | [**HighWaterMarkType**](HighWaterMarkType.md) |  |  [optional] |
|**strategy** | [**StrategyEnum**](#StrategyEnum) |  |  [optional] |
|**chargeAdvisor** | **Boolean** |  |  [optional] |
|**chargeOtherFeesToAdvisor** | **Boolean** |  |  [optional] |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| AUTOMATED | &quot;AUTOMATED&quot; |
| DIRECTBILLING | &quot;DIRECTBILLING&quot; |
| NO_FEE | &quot;NO_FEE&quot; |



