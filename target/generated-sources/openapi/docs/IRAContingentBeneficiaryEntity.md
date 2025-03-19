

# IRAContingentBeneficiaryEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**ownershipPercentage** | **BigDecimal** |  |  [optional] |
|**title** | [**Title**](Title.md) |  |  [optional] |
|**relationship** | [**RelationshipEnum**](#RelationshipEnum) |  |  [optional] |
|**executor** | [**Individual**](Individual.md) |  |  [optional] |
|**executionDate** | **LocalDate** |  |  [optional] |
|**articleOfWill** | **String** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional] |



## Enum: RelationshipEnum

| Name | Value |
|---- | -----|
| BROTHER | &quot;Brother&quot; |
| DAUGHTER | &quot;Daughter&quot; |
| ESTATE | &quot;Estate&quot; |
| FATHER | &quot;Father&quot; |
| HUSBAND | &quot;Husband&quot; |
| MOTHER | &quot;Mother&quot; |
| OTHER | &quot;Other&quot; |
| SISTER | &quot;Sister&quot; |
| SON | &quot;Son&quot; |
| WIFE | &quot;Wife&quot; |
| CHARITY | &quot;Charity&quot; |
| TRUST | &quot;Trust&quot; |
| SPOUSE | &quot;Spouse&quot; |
| CHILD | &quot;Child&quot; |
| SIBLING | &quot;Sibling&quot; |
| PARENT | &quot;Parent&quot; |
| GRANDCHILD | &quot;Grandchild&quot; |
| COMMON_LAW_PARTNER | &quot;Common Law Partner&quot; |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| TRUST | &quot;Trust&quot; |
| ESTATE | &quot;Estate&quot; |
| CHARITY | &quot;Charity&quot; |



