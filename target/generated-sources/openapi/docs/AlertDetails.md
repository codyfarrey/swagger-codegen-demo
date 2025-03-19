

# AlertDetails

details of the specified alert

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | **String** | Requestor’s account ID |  [optional] |
|**orderId** | **Integer** | Alert’s tracking ID. Can be used for modifying or deleting alerts. |  [optional] |
|**alertName** | **String** | Human readable name of the alert. |  [optional] |
|**tif** | **String** | Time in Force effective for the Alert |  [optional] |
|**expireTime** | **String** | Returns the UTC formatted date used in GTD orders. |  [optional] |
|**alertActive** | **Integer** | Returns if the alert is active [1] or disabled [0]. |  [optional] |
|**alertRepeatable** | **Integer** | Returns if the alert can be sent more than once. |  [optional] |
|**alertEmail** | **String** | Returns the designated email address for sendMessage functionality. |  [optional] |
|**alertSendMessage** | **Integer** | Returns whether or not the alert will send an email. |  [optional] |
|**alertMessage** | **String** | Returns the body content of what your alert will report once triggered |  [optional] |
|**alertShowPopup** | **Integer** | Returns whether or not the alert will trigger TWS Pop-up messages |  [optional] |
|**alertPlayAudio** | **Integer** | Returns whether or not the alert will play audio |  [optional] |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | represent order statusAlways returns “Presubmitted”. |  [optional] |
|**alertTriggered** | **Integer** | Returns whether or not the alert was triggered yet. |  [optional] |
|**fgColor** | **String** | Foreground color. Not applicable to API. |  [optional] |
|**bgColor** | **String** | Background color. Not applicable to API. |  [optional] |
|**orderNotEditable** | **Boolean** | Returns if the order can be edited. |  [optional] |
|**itwsOrdersOnly** | **Integer** | Returns whether or not the alert will trigger mobile notifications. |  [optional] |
|**alertMtaCurrency** | **String** | Returns currency set for MTA alerts. Only valid for alert type 8 &amp; 9. |  [optional] |
|**alertMtaDefaults** | **String** | Returns current MTA default values. |  [optional] |
|**toolId** | **Integer** | Tracking ID for MTA alerts only. Returns ‘null’ for standard alerts. |  [optional] |
|**timeZone** | **String** | Returned for time-specific conditions. |  [optional] |
|**alertDefaultType** | **Integer** | Returns default type set for alerts. Configured in Client Portal. |  [optional] |
|**conditionSize** | **Integer** | Returns the total number of conditions in the alert. |  [optional] |
|**conditionOutsideRth** | **Integer** | Returns whether or not the alert will trigger outside of regular trading hours. |  [optional] |
|**conditions** | [**List&lt;AlertCondition&gt;**](AlertCondition.md) | Returns all conditions |  [optional] |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| PRESUBMITTED | &quot;Presubmitted&quot; |
| SUBMITTED | &quot;Submitted&quot; |



