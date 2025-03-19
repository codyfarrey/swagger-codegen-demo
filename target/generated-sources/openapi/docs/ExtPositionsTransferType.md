

# ExtPositionsTransferType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partialStockPositions** | [**List&lt;PartialStockPosition&gt;**](PartialStockPosition.md) |  |  [optional] |
|**partialBondPositions** | [**List&lt;PartialBondPosition&gt;**](PartialBondPosition.md) |  |  [optional] |
|**partialOptionPositions** | [**List&lt;PartialOptionPosition&gt;**](PartialOptionPosition.md) |  |  [optional] |
|**partialWarrantPositions** | [**List&lt;PartialWarrantPosition&gt;**](PartialWarrantPosition.md) |  |  [optional] |
|**partialFundPositions** | [**List&lt;PartialFundPosition&gt;**](PartialFundPosition.md) |  |  [optional] |
|**partialCashPositions** | [**List&lt;PartialCashPosition&gt;**](PartialCashPosition.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**subType** | [**SubTypeEnum**](#SubTypeEnum) |  |  [optional] |
|**brokerId** | **String** |  |  [optional] |
|**brokerName** | **String** |  |  [optional] |
|**accountAtBroker** | **String** |  |  [optional] |
|**srcIRAType** | [**SrcIRATypeEnum**](#SrcIRATypeEnum) |  |  [optional] |
|**marginLoan** | **Boolean** |  |  [optional] |
|**shortPos** | **Boolean** |  |  [optional] |
|**optionPos** | **Boolean** |  |  [optional] |
|**ibAccount** | **String** |  |  [optional] |
|**thirdPartyType** | **String** |  |  [optional] |
|**approximateAccountValue** | **Integer** |  |  [optional] |
|**ssn** | **String** |  |  [optional] |
|**ein** | **String** |  |  [optional] |
|**signature** | **String** |  |  [optional] |
|**authorizeToRemoveFund** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL | &quot;FULL&quot; |
| PARTIAL | &quot;PARTIAL&quot; |



## Enum: SubTypeEnum

| Name | Value |
|---- | -----|
| ACATS | &quot;ACATS&quot; |
| ATON | &quot;ATON&quot; |



## Enum: SrcIRATypeEnum

| Name | Value |
|---- | -----|
| RI | &quot;RI&quot; |
| RO | &quot;RO&quot; |
| RT | &quot;RT&quot; |
| SP | &quot;SP&quot; |
| ED | &quot;ED&quot; |
| TH | &quot;TH&quot; |
| RH | &quot;RH&quot; |
| SH | &quot;SH&quot; |
| RRSP | &quot;RRSP&quot; |
| SRRSP | &quot;SRRSP&quot; |
| TFSA | &quot;TFSA&quot; |
| SIMPLE | &quot;SIMPLE&quot; |
| ISA | &quot;ISA&quot; |



