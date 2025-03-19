

# OrderCancelSuccess

Acknowledges IB's acceptance of the request to cancel the order. Does not report whether the cancellation can or will ultimately be enacted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**msg** | [**MsgEnum**](#MsgEnum) | Indicates success with value &#39;Request was submitted&#39; |  [optional] |
|**orderId** | **String** | IB order ID of the order ticket requested for cancellation. |  [optional] |
|**conid** | **String** | IB contract ID of the order ticket&#39;s instrument. |  [optional] |
|**account** | **String** | IB account to which the order was originally set to clear. |  [optional] |



## Enum: MsgEnum

| Name | Value |
|---- | -----|
| REQUEST_WAS_SUBMITTED | &quot;Request was submitted&quot; |



