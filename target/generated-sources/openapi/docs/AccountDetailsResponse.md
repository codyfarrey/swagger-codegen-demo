

# AccountDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | [**ErrorResponse**](ErrorResponse.md) |  |  [optional] |
|**hasError** | **Boolean** |  |  [optional] |
|**errorDescription** | **String** |  |  [optional] |
|**account** | [**AccountData**](AccountData.md) |  |  [optional] |
|**associatedPersons** | [**List&lt;AssociatedPerson&gt;**](AssociatedPerson.md) |  |  [optional] |
|**associatedEntities** | [**List&lt;AssociatedEntity&gt;**](AssociatedEntity.md) |  |  [optional] |
|**withHoldingStatement** | **Map&lt;String, String&gt;** |  |  [optional] |
|**marketData** | **List&lt;Map&lt;String, String&gt;&gt;** |  |  [optional] |
|**financialInformation** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**sourcesOfWealth** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional] |
|**tradeBundles** | **List&lt;String&gt;** |  |  [optional] |
|**individualIRABeneficiaries** | [**List&lt;IndividualIRABene&gt;**](IndividualIRABene.md) |  |  [optional] |
|**entityIRABeneficiaries** | [**List&lt;EntityIRABene&gt;**](EntityIRABene.md) |  |  [optional] |
|**decedents** | **List&lt;Map&lt;String, String&gt;&gt;** |  |  [optional] |
|**restrictions** | [**Set&lt;RestrictionInfo&gt;**](RestrictionInfo.md) |  |  [optional] |



