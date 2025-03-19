

# FormW9


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**localTaxForms** | [**List&lt;LocalTaxForm&gt;**](LocalTaxForm.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**businessName** | **String** |  |  [optional] |
|**customerType** | [**CustomerTypeEnum**](#CustomerTypeEnum) |  |  [optional] |
|**taxClassification** | **String** |  |  [optional] |
|**otherCustomerType** | **String** |  |  [optional] |
|**tin** | **String** |  |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) |  |  [optional] |
|**cert1** | **Boolean** |  |  [optional] |
|**cert2** | **Boolean** |  |  [optional] |
|**cert3** | **Boolean** |  |  [optional] |
|**cert4** | **Boolean** |  |  [optional] |
|**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) |  |  [optional] |
|**blankForm** | **Boolean** |  |  [optional] |
|**taxFormFile** | **String** |  |  [optional] |
|**proprietaryFormNumber** | **Integer** |  |  [optional] |



## Enum: CustomerTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| CORPORATION | &quot;Corporation&quot; |
| PARTNERSHIP | &quot;Partnership&quot; |
| LLC | &quot;LLC&quot; |
| OTHER | &quot;Other&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| SSN | &quot;SSN&quot; |
| EIN | &quot;EIN&quot; |
| NON_US_NATIONAL_ID | &quot;NonUS_NationalId&quot; |



## Enum: SignatureTypeEnum

| Name | Value |
|---- | -----|
| ELECTRONIC | &quot;Electronic&quot; |
| PHYSICAL | &quot;Physical&quot; |



