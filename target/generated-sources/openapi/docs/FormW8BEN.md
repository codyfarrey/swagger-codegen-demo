

# FormW8BEN


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**localTaxForms** | [**List&lt;LocalTaxForm&gt;**](LocalTaxForm.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**tin** | **String** |  |  [optional] |
|**foreignTaxId** | **String** |  |  [optional] |
|**tinOrExplanationRequired** | **Boolean** |  |  [optional] |
|**explanation** | [**ExplanationEnum**](#ExplanationEnum) |  |  [optional] |
|**referenceNumber** | **Integer** |  |  [optional] |
|**part29ACountry** | **String** |  |  [optional] |
|**cert** | **Boolean** |  |  [optional] |
|**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) |  |  [optional] |
|**blankForm** | **Boolean** |  |  [optional] |
|**taxFormFile** | **String** |  |  [optional] |
|**proprietaryFormNumber** | **Integer** |  |  [optional] |
|**electronicFormat** | **Boolean** |  |  [optional] |
|**submitDate** | **String** |  |  [optional] |



## Enum: ExplanationEnum

| Name | Value |
|---- | -----|
| US_TIN | &quot;US_TIN&quot; |
| TIN_NOT_DISCLOSED | &quot;TIN_NOT_DISCLOSED&quot; |
| TIN_NOT_REQUIRED | &quot;TIN_NOT_REQUIRED&quot; |
| TIN_NOT_ISSUED | &quot;TIN_NOT_ISSUED&quot; |



## Enum: SignatureTypeEnum

| Name | Value |
|---- | -----|
| ELECTRONIC | &quot;Electronic&quot; |
| PHYSICAL | &quot;Physical&quot; |



