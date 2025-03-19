

# ContractRules

detailed contract information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**algoEligible** | **Boolean** | Indicates if the contract can trade algos or not. |  [optional] |
|**overnightEligible** | **Boolean** | Indicates if outsideRTH trading is permitted for the instrument |  [optional] |
|**costReport** | **Boolean** | Indicates whether or not a cost report has been requested (Client Portal only). |  [optional] |
|**canTradeAcctIds** | **List&lt;String&gt;** | Indicates permitted accountIDs that may trade the contract. |  [optional] |
|**error** | **String** | If rules information can not be received for any reason, it will be expressed here. |  [optional] |
|**orderTypes** | [**List&lt;OrderTypesEnum&gt;**](#List&lt;OrderTypesEnum&gt;) | Indicates permitted order types for use with standard quantity trading. |  [optional] |
|**ibAlgoTypes** | [**List&lt;IbAlgoTypesEnum&gt;**](#List&lt;IbAlgoTypesEnum&gt;) | Indicates permitted algo types for use with the given contract. |  [optional] |
|**fraqTypes** | [**List&lt;FraqTypesEnum&gt;**](#List&lt;FraqTypesEnum&gt;) | Indicates permitted order types for use with fractional trading. |  [optional] |
|**forceOrderPreview** | **Boolean** | Indicates if the order preview is forced upon the user before submission. |  [optional] |
|**cqtTypes** | [**List&lt;CqtTypesEnum&gt;**](#List&lt;CqtTypesEnum&gt;) | Indicates accepted order types for use with cash quantity. |  [optional] |
|**orderDefaults** | [**ContractRulesOrderDefaults**](ContractRulesOrderDefaults.md) |  |  [optional] |
|**orderTypesOutside** | [**List&lt;OrderTypesOutsideEnum&gt;**](#List&lt;OrderTypesOutsideEnum&gt;) | Indicates permitted order types for use outside of regular trading hours. |  [optional] |
|**defaultSize** | **Integer** | Default total quantity value for orders. |  [optional] |
|**cashSize** | **Integer** | Default cash value quantity. |  [optional] |
|**sizeIncrement** | **Integer** | Indicates quantity increase for the contract. |  [optional] |
|**tifTypes** | **List&lt;String&gt;** | Indicates allowed tif types supported for the contract. |  [optional] |
|**tifDefaults** | [**ContractRulesTifDefaults**](ContractRulesTifDefaults.md) |  |  [optional] |
|**limitPrice** | **Integer** | Default limit price for the given contract. |  [optional] |
|**stopPrice** | **Integer** | Default stop price for the given contract. |  [optional] |
|**orderOrigination** | **String** | Order origin designation for US securities options and Options Clearing Corporation |  [optional] |
|**preview** | **Boolean** | Indicates if the order preview is required (for client portal only) |  [optional] |
|**displaySize** | **Integer** | Standard display increment rule for the instrument. |  [optional] |
|**fraqInt** | **Integer** | Indicates decimal places for fractional order size. |  [optional] |
|**cashCcy** | **String** | Indicates base currency for the instrument. |  [optional] |
|**cashQtyIncr** | **Integer** | Indicates cash quantity increment rules. |  [optional] |
|**priceMagnifier** | **Integer** | Signifies the magnifier of a given contract. This is separate from the price multiplier, and will typically return ‘null’  |  [optional] |
|**negativeCapable** | **Boolean** | Indicates if the value of the contract can be negative (true) or if it is always positive (false). |  [optional] |
|**incrementType** | **Integer** | Indicates the type of increment style. |  [optional] |
|**incrementRules** | [**List&lt;ContractRulesIncrementRulesInner&gt;**](ContractRulesIncrementRulesInner.md) | Indicates increment rule values including lowerEdge and increment value. |  [optional] |
|**hasSecondary** | **Boolean** |  |  [optional] |
|**modTypes** | **List&lt;String&gt;** | Lists the available order types supported when modifying the order. |  [optional] |
|**increment** | **Integer** | Minimum increment values for prices |  [optional] |
|**incrementDigits** | **Integer** | Number of decimal places to indicate the increment value. |  [optional] |



## Enum: List&lt;OrderTypesEnum&gt;

| Name | Value |
|---- | -----|
| LIMIT | &quot;limit&quot; |
| MIDPRICE | &quot;midprice&quot; |
| MARKET | &quot;market&quot; |
| STOP | &quot;stop&quot; |
| STOP_LIMIT | &quot;stop_limit&quot; |
| MIT | &quot;mit&quot; |
| LIT | &quot;lit&quot; |
| TRAILING_STOP | &quot;trailing_stop&quot; |
| TRAILING_STOP_LIMIT | &quot;trailing_stop_limit&quot; |
| RELATIVE | &quot;relative&quot; |
| MARKETONCLOSE | &quot;marketonclose&quot; |
| LIMITONCLOSE | &quot;limitonclose&quot; |



## Enum: List&lt;IbAlgoTypesEnum&gt;

| Name | Value |
|---- | -----|
| LIMIT | &quot;limit&quot; |
| STOP_LIMIT | &quot;stop_limit&quot; |
| LIT | &quot;lit&quot; |
| TRAILING_STOP_LIMIT | &quot;trailing_stop_limit&quot; |
| RELATIVE | &quot;relative&quot; |
| MARKETONCLOSE | &quot;marketonclose&quot; |
| LIMITONCLOSE | &quot;limitonclose&quot; |



## Enum: List&lt;FraqTypesEnum&gt;

| Name | Value |
|---- | -----|
| LIMIT | &quot;limit&quot; |
| MARKET | &quot;market&quot; |
| STOP | &quot;stop&quot; |
| STOP_LIMIT | &quot;stop_limit&quot; |
| MIT | &quot;mit&quot; |
| LIT | &quot;lit&quot; |
| TRAILING_STOP | &quot;trailing_stop&quot; |
| TRAILING_STOP_LIMIT | &quot;trailing_stop_limit&quot; |



## Enum: List&lt;CqtTypesEnum&gt;

| Name | Value |
|---- | -----|
| LIMIT | &quot;limit&quot; |
| MARKET | &quot;market&quot; |
| STOP | &quot;stop&quot; |
| STOP_LIMIT | &quot;stop_limit&quot; |
| MIT | &quot;mit&quot; |
| LIT | &quot;lit&quot; |
| TRAILING_STOP | &quot;trailing_stop&quot; |
| TRAILING_STOP_LIMIT | &quot;trailing_stop_limit&quot; |



## Enum: List&lt;OrderTypesOutsideEnum&gt;

| Name | Value |
|---- | -----|
| LIMIT | &quot;limit&quot; |
| STOP_LIMIT | &quot;stop_limit&quot; |
| LIT | &quot;lit&quot; |
| TRAILING_STOP_LIMIT | &quot;trailing_stop_limit&quot; |
| RELATIVE | &quot;relative&quot; |



