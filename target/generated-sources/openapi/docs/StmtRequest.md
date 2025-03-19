

# StmtRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | account id |  |
|**accountIds** | **List&lt;String&gt;** | array of account id&#39;s |  [optional] |
|**startDate** | **String** | from date |  |
|**endDate** | **String** | to date |  |
|**multiAccountFormat** | **String** | possible values are consolidate, concatenate, or customConsolidate |  [optional] |
|**cryptoConsolIfAvailable** | **Boolean** | crypto consolidate flag, If request contains any accounts with crypto segment, will turn request into Crypto Consolidated |  [optional] |
|**mimeType** | **String** | output format |  [optional] |
|**language** | **String** | two character ISO language code |  [optional] |
|**gzip** | **Boolean** | to gzip the whole response pass true |  [optional] |



