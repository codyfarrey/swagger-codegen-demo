

# Individual


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**IndividualName**](IndividualName.md) |  |  [optional] |
|**nativeName** | [**IndividualName**](IndividualName.md) |  |  [optional] |
|**birthName** | [**IndividualName**](IndividualName.md) |  |  [optional] |
|**motherMaidenName** | [**IndividualName**](IndividualName.md) |  |  [optional] |
|**dateOfBirth** | **String** | Date of birth of the applicant. The applicant must be 18 years or older to open an account. &lt;br&gt;&lt;ul&gt;&lt;li&gt;If the YYY-MM-DD &lt; 18 years error will be triggered and the account will not be created.&lt;/li&gt;&lt;li&gt;If YYYY-MM-DD &lt; 21 the applicant is restricted to opening a CASH account only.&lt;/li&gt;&lt;li&gt;UGMA and UTMA accounts are available for minors 18 years of age or younger. An individual or entity who manages an account for a minor until that minor reaches a specific age. Available to US residents only.&lt;/li&gt;&lt;li&gt;This application must be opened using the front-end application which is available within the IBKR Portal.&lt;/li&gt;&lt;li&gt;Assets held in a single account managed by a single Custodian user.&lt;/li&gt;&lt;li&gt;Error will be thrown if dateOfBirth is any value other than YYYY-MM-DD.&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**countryOfBirth** | **String** |  |  [optional] |
|**cityOfBirth** | **String** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) |  |  [optional] |
|**numDependents** | **Integer** |  |  [optional] |
|**residenceAddress** | [**ResidenceAddress**](ResidenceAddress.md) |  |  [optional] |
|**mailingAddress** | [**Address**](Address.md) |  |  [optional] |
|**phones** | [**List&lt;PhoneInfo&gt;**](PhoneInfo.md) |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**identification** | [**Identification**](Identification.md) |  |  [optional] |
|**employmentType** | **String** |  |  [optional] |
|**employmentDetails** | [**EmploymentDetails**](EmploymentDetails.md) |  |  [optional] |
|**employeeTitle** | **String** |  |  [optional] |
|**taxResidencies** | [**List&lt;TaxResidency&gt;**](TaxResidency.md) |  |  [optional] |
|**w9** | [**FormW9**](FormW9.md) |  |  [optional] |
|**w8Ben** | [**FormW8BEN**](FormW8BEN.md) |  |  [optional] |
|**crs** | [**FormCRS**](FormCRS.md) |  |  [optional] |
|**prohibitedCountryQuestionnaire** | [**ProhibitedCountryQuestionnaireList**](ProhibitedCountryQuestionnaireList.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**sameMailAddress** | **Boolean** |  |  [optional] |
|**authorizedToSignOnBehalfOfOwner** | **Boolean** |  |  [optional] |
|**authorizedTrader** | **Boolean** |  |  [optional] |
|**usTaxResident** | **Boolean** |  |  [optional] |
|**translated** | **Boolean** |  |  [optional] |
|**primaryTrustee** | **Boolean** |  |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| M | &quot;M&quot; |
| F | &quot;F&quot; |
| MALE | &quot;Male&quot; |
| FEMALE | &quot;Female&quot; |



## Enum: MaritalStatusEnum

| Name | Value |
|---- | -----|
| S | &quot;S&quot; |
| M | &quot;M&quot; |
| W | &quot;W&quot; |
| D | &quot;D&quot; |
| C | &quot;C&quot; |



