

# IserverSecdefSearchPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | The ticker symbol, bond issuer type, or company name of the equity you are looking to trade. |  |
|**secType** | [**SecTypeEnum**](#SecTypeEnum) | Available underlying security types:   * &#x60;STK&#x60; - Represents an underlying as a Stock security type.   * &#x60;IND&#x60; - Represents an underlying as an Index security type.   * &#x60;BOND&#x60; - Represents an underlying as a Bond security type.  |  [optional] |
|**name** | **Boolean** | Denotes if the symbol value is the ticker symbol or part of the company&#39;s name. |  [optional] |
|**more** | **Boolean** |  |  [optional] |
|**fund** | **Boolean** | fund search |  [optional] |
|**fundFamilyConidEx** | **String** |  |  [optional] |
|**pattern** | **Boolean** | pattern search |  [optional] |
|**referrer** | **String** |  |  [optional] |



## Enum: SecTypeEnum

| Name | Value |
|---- | -----|
| STK | &quot;STK&quot; |
| IND | &quot;IND&quot; |
| BOND | &quot;BOND&quot; |



