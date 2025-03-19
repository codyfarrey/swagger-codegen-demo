

# PartialWarrantPosition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**numberOfShares** | **Long** |  |  [optional] |
|**all** | **Boolean** |  |  [optional] |
|**position** | [**PositionEnum**](#PositionEnum) |  |  [optional] |
|**optionType** | [**OptionTypeEnum**](#OptionTypeEnum) |  |  [optional] |
|**strikePrice** | **Long** |  |  [optional] |
|**expirationDate** | **String** |  |  [optional] |



## Enum: PositionEnum

| Name | Value |
|---- | -----|
| LONG | &quot;LONG&quot; |
| SHORT | &quot;SHORT&quot; |



## Enum: OptionTypeEnum

| Name | Value |
|---- | -----|
| CALL | &quot;CALL&quot; |
| PUT | &quot;PUT&quot; |



