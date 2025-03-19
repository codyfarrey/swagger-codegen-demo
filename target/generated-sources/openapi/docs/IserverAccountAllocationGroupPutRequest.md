

# IserverAccountAllocationGroupPutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name used to refer to your allocation group. If prev_name is specified, this will become the new name of the group. |  |
|**prevName** | **String** | Can be used to rename a group. Using this field will recognize the previous name, while the \&quot;name\&quot; filed will mark the updated name. |  [optional] |
|**accounts** | **List&lt;String&gt;** | An array of accounts that should be held in the allocation group and, if using a User-specified allocaiton method, the value correlated to the allocation. |  |
|**defaultMethod** | **AllocationMethod** |  |  |



