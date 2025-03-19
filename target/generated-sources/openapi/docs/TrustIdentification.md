

# TrustIdentification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | [**Address**](Address.md) |  |  [optional] |
|**mailingAddress** | [**Address**](Address.md) |  |  [optional] |
|**phones** | [**List&lt;PhoneInfo&gt;**](PhoneInfo.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**typeOfTrust** | [**TypeOfTrustEnum**](#TypeOfTrustEnum) |  |  [optional] |
|**purposeOfTrust** | **String** |  |  [optional] |
|**dateFormed** | **LocalDate** |  |  [optional] |
|**formationCountry** | **String** |  |  [optional] |
|**formationState** | **String** |  |  [optional] |
|**registrationNumber** | **String** |  |  [optional] |
|**registrationType** | [**RegistrationTypeEnum**](#RegistrationTypeEnum) |  |  [optional] |
|**registrationCountry** | **String** |  |  [optional] |
|**sameMailAddress** | **Boolean** |  |  [optional] |
|**translated** | **Boolean** |  |  [optional] |



## Enum: TypeOfTrustEnum

| Name | Value |
|---- | -----|
| IRREVOC | &quot;IRREVOC&quot; |
| SMSF | &quot;SMSF&quot; |
| REVOCABLE | &quot;REVOCABLE&quot; |
| TESTAMENTARY | &quot;TESTAMENTARY&quot; |
| RETIREMENT | &quot;RETIREMENT&quot; |
| ERISA | &quot;ERISA&quot; |
| OTHER | &quot;OTHER&quot; |



## Enum: RegistrationTypeEnum

| Name | Value |
|---- | -----|
| SSN | &quot;SSN&quot; |
| EIN | &quot;EIN&quot; |
| NON_US_NATIONAL_ID | &quot;NonUS_NationalId&quot; |



