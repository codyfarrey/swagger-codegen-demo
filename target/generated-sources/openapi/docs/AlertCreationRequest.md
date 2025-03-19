

# AlertCreationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **Long** | optional; used in case of modification and represent Alert Id |  [optional] |
|**alertName** | **String** | Alert name. |  |
|**alertMessage** | **String** | Alert message which will be sent |  |
|**alertRepeatable** | **Integer** | Boolean number (0, 1) signifies if an alert can be triggered more than once. A value of ‘1’ is required for MTA alerts |  |
|**email** | **String** | Email address you want to send email alerts to |  [optional] |
|**expireTime** | **String** | Used with a tif of “GTD” only. Signifies time when the alert should terminate if no alert is triggered. |  [optional] |
|**iTWSOrdersOnly** | **Integer** | allow (0) or disallow (1) alerts to trigger alerts through the mobile app |  [optional] |
|**outsideRth** | **Integer** | Allow (1) or disallow (0) the alert to be triggered outside of regular trading hours |  |
|**sendMessage** | **Integer** | allow (1) or disallow (0) alerts to trigger email messages |  [optional] |
|**showPopup** | **Integer** | allow (1) or disallow (0) alerts to trigger TWS Pop-up messages |  [optional] |
|**tif** | [**TifEnum**](#TifEnum) | Time in Force duration of alert. |  |
|**conditions** | **List&lt;String&gt;** | Container for all conditions applied for an alert to trigger. |  |



## Enum: TifEnum

| Name | Value |
|---- | -----|
| GTC | &quot;GTC&quot; |
| GTD | &quot;GTD&quot; |



