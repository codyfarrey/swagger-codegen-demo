

# OrderReplyMessageInner

An object containing order reply messages emitted against a single order ticket.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The replyId UUID of the order ticket&#39;s emitted order reply messages, used to confirm them and proceed. |  [optional] |
|**isSuppressed** | **Boolean** | Internal use. Always delivers value &#39;false&#39;. |  [optional] |
|**message** | **List&lt;String&gt;** | An array containing the human-readable text of all order reply messages emitted for the order ticket. |  [optional] |
|**messageIds** | **List&lt;String&gt;** | An array containing identifiers that categorize the types of order reply messages that have been emitted. Elements of this array are ordered so that indicies match the corresponding human-readable text strings in the &#39;message&#39; array. |  [optional] |



