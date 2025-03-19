

# GwApiV1ExternalAssetTransfersPostRequestInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientInstructionId** | **BigDecimal** |  |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  |
|**accountId** | **String** |  |  |
|**contraBrokerAccountId** | **String** |  |  |
|**contraBrokerDtcCode** | **String** |  |  |
|**quantity** | **BigDecimal** |  |  |
|**tradingInstrument** | **Object** |  |  |
|**contraBrokerTaxId** | **String** |  |  |
|**accountTitle** | **String** |  |  [optional] |
|**refrenceId** | **String** |  |  [optional] |
|**contraBrokerInfo** | [**ContraBrokerInfo**](ContraBrokerInfo.md) |  |  |
|**nonDisclosedDetail** | [**NonDisclosedDetail**](NonDisclosedDetail.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**subtype** | [**SubtypeEnum**](#SubtypeEnum) |  |  |
|**brokerId** | **String** |  |  |
|**brokerName** | **String** |  |  |
|**accountAtBroker** | **String** |  |  |
|**sourceIRAType** | [**SourceIRATypeEnum**](#SourceIRATypeEnum) |  |  [optional] |
|**signature** | **String** |  |  |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| IN | &quot;IN&quot; |
| OUT | &quot;OUT&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL | &quot;FULL&quot; |



## Enum: SubtypeEnum

| Name | Value |
|---- | -----|
| ACATS | &quot;ACATS&quot; |
| ATON | &quot;ATON&quot; |



## Enum: SourceIRATypeEnum

| Name | Value |
|---- | -----|
| RO | &quot;RO&quot; |
| RI | &quot;RI&quot; |
| RT | &quot;RT&quot; |
| SP | &quot;SP&quot; |
| ED | &quot;ED&quot; |
| TH | &quot;TH&quot; |
| RH | &quot;RH&quot; |
| SH | &quot;SH&quot; |



