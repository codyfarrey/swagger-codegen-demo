

# UserEntity

Provide information about the particular entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityName** | **String** | The full entity&#39;s name, concatenating the first and last name fields |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | The type of entity assigned to the user |  [optional] |
|**firstName** | **String** | The first name of the user |  [optional] |
|**lastName** | **String** | The last name of the user |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| JOINT | &quot;Joint&quot; |
| ORG | &quot;ORG&quot; |



