# TradingAlertsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iserverAccountAccountIdAlertActivatePost**](TradingAlertsApi.md#iserverAccountAccountIdAlertActivatePost) | **POST** /iserver/account/{accountId}/alert/activate | Activate Or Deactivate An Alert |
| [**iserverAccountAccountIdAlertAlertIdDelete**](TradingAlertsApi.md#iserverAccountAccountIdAlertAlertIdDelete) | **DELETE** /iserver/account/{accountId}/alert/{alertId} | Delete An Alert |
| [**iserverAccountAccountIdAlertPost**](TradingAlertsApi.md#iserverAccountAccountIdAlertPost) | **POST** /iserver/account/{accountId}/alert | Create Or Modify Alert |
| [**iserverAccountAccountIdAlertsGet**](TradingAlertsApi.md#iserverAccountAccountIdAlertsGet) | **GET** /iserver/account/{accountId}/alerts | Get A List Of Available Alerts |
| [**iserverAccountAlertAlertIdGet**](TradingAlertsApi.md#iserverAccountAlertAlertIdGet) | **GET** /iserver/account/alert/{alertId} | Get Details Of A Specific Alert |
| [**iserverAccountMtaGet**](TradingAlertsApi.md#iserverAccountMtaGet) | **GET** /iserver/account/mta | Get MTA Alert |


<a id="iserverAccountAccountIdAlertActivatePost"></a>
# **iserverAccountAccountIdAlertActivatePost**
> AlertActivationResponse iserverAccountAccountIdAlertActivatePost(accountId, alertActivationRequest)

Activate Or Deactivate An Alert

Activate or Deactivate existing alerts created for this account. This does not delete alerts, but disables notifications until reactivated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAlertsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAlertsApi apiInstance = new TradingAlertsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    AlertActivationRequest alertActivationRequest = new AlertActivationRequest(); // AlertActivationRequest | 
    try {
      AlertActivationResponse result = apiInstance.iserverAccountAccountIdAlertActivatePost(accountId, alertActivationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAlertsApi#iserverAccountAccountIdAlertActivatePost");
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
| **accountId** | **String**|  | |
| **alertActivationRequest** | [**AlertActivationRequest**](AlertActivationRequest.md)|  | |

### Return type

[**AlertActivationResponse**](AlertActivationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing details about the activated/deactivated alert. |  -  |
| **401** | access denied |  -  |
| **500** | Internal Server Error; unable to process incoming request due to invalid data in it |  -  |

<a id="iserverAccountAccountIdAlertAlertIdDelete"></a>
# **iserverAccountAccountIdAlertAlertIdDelete**
> AlertDeletionResponse iserverAccountAccountIdAlertAlertIdDelete(accountId, alertId, body)

Delete An Alert

Permanently delete an existing alert. Deleting an MTA alert will reset it to the default state.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAlertsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAlertsApi apiInstance = new TradingAlertsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    String alertId = "9876543210"; // String | 
    Object body = null; // Object | 
    try {
      AlertDeletionResponse result = apiInstance.iserverAccountAccountIdAlertAlertIdDelete(accountId, alertId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAlertsApi#iserverAccountAccountIdAlertAlertIdDelete");
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
| **accountId** | **String**|  | |
| **alertId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**AlertDeletionResponse**](AlertDeletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing details on the deleted endpoint. |  -  |
| **401** | access denied |  -  |
| **500** | Internal Server Error; Unable to delete alert in case when provided alert id doesn&#39;t exist |  -  |

<a id="iserverAccountAccountIdAlertPost"></a>
# **iserverAccountAccountIdAlertPost**
> AlertCreationResponse iserverAccountAccountIdAlertPost(accountId, alertCreationRequest)

Create Or Modify Alert

Endpoint used to create a new alert, or modify an existing alert.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAlertsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAlertsApi apiInstance = new TradingAlertsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    AlertCreationRequest alertCreationRequest = new AlertCreationRequest(); // AlertCreationRequest | 
    try {
      AlertCreationResponse result = apiInstance.iserverAccountAccountIdAlertPost(accountId, alertCreationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAlertsApi#iserverAccountAccountIdAlertPost");
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
| **accountId** | **String**|  | |
| **alertCreationRequest** | [**AlertCreationRequest**](AlertCreationRequest.md)|  | |

### Return type

[**AlertCreationResponse**](AlertCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing valid accounts and the account properties regarding trading access. This endpoint is also used to confirm account validation. |  -  |
| **400** | bad request; body is empty |  -  |
| **401** | access denied |  -  |
| **500** | Internal Server Error. Unable to process request if incoming values are not valid. For example operator is \&quot;abc\&quot; Or if modification request contains unmodified fields  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdAlertsGet"></a>
# **iserverAccountAccountIdAlertsGet**
> Set&lt;Alert&gt; iserverAccountAccountIdAlertsGet(accountId)

Get A List Of Available Alerts

Retrieve a list of all alerts attached to the provided account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAlertsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAlertsApi apiInstance = new TradingAlertsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    try {
      Set<Alert> result = apiInstance.iserverAccountAccountIdAlertsGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAlertsApi#iserverAccountAccountIdAlertsGet");
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
| **accountId** | **String**|  | |

### Return type

[**Set&lt;Alert&gt;**](Alert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAlertAlertIdGet"></a>
# **iserverAccountAlertAlertIdGet**
> AlertDetails iserverAccountAlertAlertIdGet(alertId, type)

Get Details Of A Specific Alert

Request details of a specific alert by providing the assigned alertId Id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAlertsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAlertsApi apiInstance = new TradingAlertsApi(defaultClient);
    String alertId = "alertId_example"; // String | 
    String type = "Q"; // String | 
    try {
      AlertDetails result = apiInstance.iserverAccountAlertAlertIdGet(alertId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAlertsApi#iserverAccountAlertAlertIdGet");
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
| **alertId** | **String**|  | |
| **type** | **String**|  | [enum: Q] |

### Return type

[**AlertDetails**](AlertDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing all unique details of the specified alert. |  -  |
| **400** | bad request if orderId is empty or type is invalid |  -  |
| **401** | access denied |  -  |
| **500** | orderId is not parsable; unable to process request |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountMtaGet"></a>
# **iserverAccountMtaGet**
> AlertDetails iserverAccountMtaGet()

Get MTA Alert

Retrieve information about your MTA alert. Each login user only has one mobile trading assistant (MTA) alert with it’s own unique tool id that cannot be changed. MTA alerts can not be created or deleted, only modified. When modified a new order Id is generated. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAlertsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAlertsApi apiInstance = new TradingAlertsApi(defaultClient);
    try {
      AlertDetails result = apiInstance.iserverAccountMtaGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAlertsApi#iserverAccountMtaGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertDetails**](AlertDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The alert description for the unique MTA alert on the account. |  -  |

