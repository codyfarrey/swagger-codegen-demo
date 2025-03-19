

# AccountAttributesParent

Describes account relations in partitioned or multiplexed (segemented) account structures.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mmc** | **List&lt;String&gt;** | Money manager client. |  [optional] |
|**accountId** | **String** | Account ID of the parent account in a multiplex account structure. |  [optional] |
|**isMChild** | **Boolean** | Indicates that the given account is a multiplex child account. |  [optional] |
|**isMParent** | **Boolean** | Indicates that the given account is itself a multiplex parent account. |  [optional] |
|**isMultiplex** | **Boolean** | Indicates that the account is a multiplex account. |  [optional] |



