# TradingWebsocketApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wsGet**](TradingWebsocketApi.md#wsGet) | **GET** /ws | Open Websocket. |


<a id="wsGet"></a>
# **wsGet**
> wsGet(connection, upgrade, api, oauthToken)

Open Websocket.

Open websocket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingWebsocketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingWebsocketApi apiInstance = new TradingWebsocketApi(defaultClient);
    String connection = "Upgrade"; // String | 
    String upgrade = "websocket"; // String | 
    String api = "c8fh17fnjr01hfnrh39rhfh8shd1hd93"; // String | 32-character Web API session cookie value.
    String oauthToken = "a1b2c3d4"; // String | 8-character OAuth access token.
    try {
      apiInstance.wsGet(connection, upgrade, api, oauthToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingWebsocketApi#wsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connection** | **String**|  | [enum: Upgrade] |
| **upgrade** | **String**|  | [enum: websocket] |
| **api** | **String**| 32-character Web API session cookie value. | |
| **oauthToken** | **String**| 8-character OAuth access token. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **101** | Successful request to switch protocols. |  * Connection -  <br>  * Upgrade -  <br>  |

