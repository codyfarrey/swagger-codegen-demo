

# IserverAccountAccountIdOrderOrderIdPost200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **String** | Message indicating that order submission was not successful. |  [optional] |
|**orderId** | **Integer** | The order ID assigned by IB to the rejected order ticket. |  [optional] |
|**reqId** | **String** | IB&#39;s internal identifier assigned to the returned message. |  [optional] |
|**dismissable** | **List&lt;String&gt;** | Indicates whether this prompt is dismissable. |  [optional] |
|**text** | **String** | Human-readable text of the messages emitted by IB in response to order submission. |  [optional] |
|**options** | **List&lt;String&gt;** | Choices available to the client in response to the rejection message. |  [optional] |
|**type** | **String** | The specific type of message returned. |  [optional] |
|**messageId** | **String** | IB internal identifier for the nature or category of the returned message. |  [optional] |
|**prompt** | **Boolean** | Indicates that the message is a prompt offering a set of decisions, one or more of which may permit the rejected order to be resubmitted. |  [optional] |



