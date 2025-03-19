

# FormW8IMY


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**countryOfIncorporation** | **String** |  |  [optional] |
|**disregardedEntityName** | **String** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional] |
|**fatcaStatus** | [**FatcaStatusEnum**](#FatcaStatusEnum) |  |  [optional] |
|**usTin** | **String** |  |  [optional] |
|**usTinType** | [**UsTinTypeEnum**](#UsTinTypeEnum) |  |  [optional] |
|**giin** | **String** |  |  [optional] |
|**referenceNumber** | **Integer** |  |  [optional] |
|**box11Status** | [**Box11StatusEnum**](#Box11StatusEnum) |  |  [optional] |
|**part314A** | **Boolean** |  |  [optional] |
|**part314B** | **Boolean** |  |  [optional] |
|**part314C** | **Boolean** |  |  [optional] |
|**part314CDesc** | **String** |  |  [optional] |
|**part314D** | **Boolean** |  |  [optional] |
|**part314DDesc** | **String** |  |  [optional] |
|**part314E** | **Boolean** |  |  [optional] |
|**part314EDesc** | **String** |  |  [optional] |
|**part314EI** | **Boolean** |  |  [optional] |
|**part314EIi** | **Boolean** |  |  [optional] |
|**part415A** | **Boolean** |  |  [optional] |
|**part415B** | **Boolean** |  |  [optional] |
|**part415C** | **Boolean** |  |  [optional] |
|**part415D** | **Boolean** |  |  [optional] |
|**part516A** | **Boolean** |  |  [optional] |
|**part516B** | **Boolean** |  |  [optional] |
|**part516C** | **Boolean** |  |  [optional] |
|**part617A** | **Boolean** |  |  [optional] |
|**part617B** | **Boolean** |  |  [optional] |
|**part617C** | **Boolean** |  |  [optional] |
|**part718** | **Boolean** |  |  [optional] |
|**part819** | **Boolean** |  |  [optional] |
|**part920** | **Boolean** |  |  [optional] |
|**part1021** | **String** |  |  [optional] |
|**part1021A** | **String** |  |  [optional] |
|**part1021B** | **Boolean** |  |  [optional] |
|**part1021C** | **Boolean** |  |  [optional] |
|**part1122A** | **Boolean** |  |  [optional] |
|**part1122B** | **Boolean** |  |  [optional] |
|**part1122C** | **Boolean** |  |  [optional] |
|**part1223** | **Boolean** |  |  [optional] |
|**part1324** | **Boolean** |  |  [optional] |
|**part1425A** | **String** |  |  [optional] |
|**part1425B** | **Boolean** |  |  [optional] |
|**part1526** | **Boolean** |  |  [optional] |
|**part1627A** | **Boolean** |  |  [optional] |
|**part1627B** | **Boolean** |  |  [optional] |
|**part1627C** | **Boolean** |  |  [optional] |
|**part1728** | **Boolean** |  |  [optional] |
|**part1829** | **Boolean** |  |  [optional] |
|**part1829Desc1** | **String** |  |  [optional] |
|**part1829Desc2** | **String** |  |  [optional] |
|**part1829Desc3** | **String** |  |  [optional] |
|**part1930A** | **Boolean** |  |  [optional] |
|**part1930B** | **Boolean** |  |  [optional] |
|**part1930C** | **Boolean** |  |  [optional] |
|**part1930D** | **Boolean** |  |  [optional] |
|**part1930E** | **Boolean** |  |  [optional] |
|**part1930F** | **Boolean** |  |  [optional] |
|**part2031** | **Boolean** |  |  [optional] |
|**part2132** | **Boolean** |  |  [optional] |
|**part2132Desc** | **String** |  |  [optional] |
|**part2233** | **Boolean** |  |  [optional] |
|**part2233Desc** | **String** |  |  [optional] |
|**part2334A** | **Boolean** |  |  [optional] |
|**part2334ADesc** | **String** |  |  [optional] |
|**part2334B** | **Boolean** |  |  [optional] |
|**part2334BDesc** | **String** |  |  [optional] |
|**part2435** | **Boolean** |  |  [optional] |
|**part2536** | **Boolean** |  |  [optional] |
|**part2637** | **Boolean** |  |  [optional] |
|**part2738** | **String** |  |  [optional] |
|**part2739** | **Boolean** |  |  [optional] |
|**cert** | **Boolean** |  |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| QUALIFIED_INTERMEDIARY | &quot;QUALIFIED_INTERMEDIARY&quot; |
| NONQUALIFIED_INTERMEDIARY | &quot;NONQUALIFIED_INTERMEDIARY&quot; |
| TERRITORY_FINANCIAL | &quot;TERRITORY_FINANCIAL&quot; |
| US_BRANCH | &quot;US_BRANCH&quot; |
| WITHHOLDING_FOREIGN_PARTNERSHIP | &quot;WITHHOLDING_FOREIGN_PARTNERSHIP&quot; |
| WITHHOLDING_FOREIGN_TRUST | &quot;WITHHOLDING_FOREIGN_TRUST&quot; |
| NONWITHHOLDING_FOREIGN_PARTNERSHIP | &quot;NONWITHHOLDING_FOREIGN_PARTNERSHIP&quot; |
| NONWITHHOLDING_FOREIGN_SIMPLE_TRUST | &quot;NONWITHHOLDING_FOREIGN_SIMPLE_TRUST&quot; |
| NONWITHHOLDING_FOREIGN_GRANTOR_TRUST | &quot;NONWITHHOLDING_FOREIGN_GRANTOR_TRUST&quot; |



## Enum: FatcaStatusEnum

| Name | Value |
|---- | -----|
| NONPARTICIPATING_FFI | &quot;NONPARTICIPATING_FFI&quot; |
| PARTICIPATING_FFI | &quot;PARTICIPATING_FFI&quot; |
| REPORTING_MODEL1_FFI | &quot;REPORTING_MODEL1_FFI&quot; |
| REPORTING_MODEL2_FFI | &quot;REPORTING_MODEL2_FFI&quot; |
| REGISTERED_DEEMED_COMPLAINT | &quot;REGISTERED_DEEMED_COMPLAINT&quot; |
| TERRITORY_FINANCIAL_INSTITUTION | &quot;TERRITORY_FINANCIAL_INSTITUTION&quot; |
| SPONSORED_FFI | &quot;SPONSORED_FFI&quot; |
| CERTIFIED_DEEMED_COMPLAINT_FFI | &quot;CERTIFIED_DEEMED_COMPLAINT_FFI&quot; |
| CERTIFIED_DEEMED_COMPLAINT_SPONSORED | &quot;CERTIFIED_DEEMED_COMPLAINT_SPONSORED&quot; |
| CERTIFIED_DEEMED_COMPLAINT_LIMITED_LIFE_DEBT | &quot;CERTIFIED_DEEMED_COMPLAINT_LIMITED_LIFE_DEBT&quot; |
| OWNER_DOCUMENTED_FFI | &quot;OWNER_DOCUMENTED_FFI&quot; |
| RESTRICTED_DISTRIBUTOR | &quot;RESTRICTED_DISTRIBUTOR&quot; |
| FOREIGN_CENTRAL_BANK_ISSUE | &quot;FOREIGN_CENTRAL_BANK_ISSUE&quot; |
| NONREPORTING_IGA_FFO | &quot;NONREPORTING_IGA_FFO&quot; |
| EXEMPT_RETIREMENT_PLAN | &quot;EXEMPT_RETIREMENT_PLAN&quot; |
| EXCEPTED_NONFINANCIAL_GROUP_ENTITY | &quot;EXCEPTED_NONFINANCIAL_GROUP_ENTITY&quot; |
| EXCEPTED_NONFINANCIAL_STARTUP_COMPANY | &quot;EXCEPTED_NONFINANCIAL_STARTUP_COMPANY&quot; |
| EXCEPTED_NONFINANCIAL_ENTITY_IN_LIQUIDATION | &quot;EXCEPTED_NONFINANCIAL_ENTITY_IN_LIQUIDATION&quot; |
| PUBLICLY_TRADED_NFFE | &quot;PUBLICLY_TRADED_NFFE&quot; |
| EXCEPTED_TERRITORY_NFFE | &quot;EXCEPTED_TERRITORY_NFFE&quot; |
| ACTIVE_NFFE | &quot;ACTIVE_NFFE&quot; |
| PASSIVE_NFFE | &quot;PASSIVE_NFFE&quot; |
| DIRECT_REPORTING_NFFE | &quot;DIRECT_REPORTING_NFFE&quot; |
| SPONSORED_DIRECT_REPORTING_NFFE | &quot;SPONSORED_DIRECT_REPORTING_NFFE&quot; |



## Enum: UsTinTypeEnum

| Name | Value |
|---- | -----|
| QI_EIN | &quot;QI-EIN&quot; |
| WP_EIN | &quot;WP-EIN&quot; |
| WT_EIN | &quot;WT-EIN&quot; |
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |



## Enum: Box11StatusEnum

| Name | Value |
|---- | -----|
| LIMITED_BRANCH | &quot;LIMITED_BRANCH&quot; |
| US_BRANCH | &quot;US_BRANCH&quot; |
| PARTICIPATING_FFI | &quot;PARTICIPATING_FFI&quot; |
| REPORTING_MODEL_1_FFI | &quot;REPORTING_MODEL_1_FFI&quot; |
| REPORTING_MODEL_2_FFI | &quot;REPORTING_MODEL_2_FFI&quot; |



