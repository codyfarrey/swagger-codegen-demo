# TradingOrdersApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iserverAccountAccountIdOrderOrderIdDelete**](TradingOrdersApi.md#iserverAccountAccountIdOrderOrderIdDelete) | **DELETE** /iserver/account/{accountId}/order/{orderId} | Cancel An Existing, Unfilled Order. |
| [**iserverAccountAccountIdOrderOrderIdPost**](TradingOrdersApi.md#iserverAccountAccountIdOrderOrderIdPost) | **POST** /iserver/account/{accountId}/order/{orderId} | Modify An Existing, Unfilled Order. |
| [**iserverAccountAccountIdOrdersPost**](TradingOrdersApi.md#iserverAccountAccountIdOrdersPost) | **POST** /iserver/account/{accountId}/orders | Submit A New Order(s) Ticket, Bracket, Or OCA Group. |
| [**iserverAccountAccountIdOrdersWhatifPost**](TradingOrdersApi.md#iserverAccountAccountIdOrdersWhatifPost) | **POST** /iserver/account/{accountId}/orders/whatif | Preview The Projected Effects Of An Order Ticket Or Bracket Of Orders, Including Cost And Changes To Margin And Account Equity. |
| [**iserverAccountOrderStatusOrderIdGet**](TradingOrdersApi.md#iserverAccountOrderStatusOrderIdGet) | **GET** /iserver/account/order/status/{orderId} | Retrieve The Status Of A Single Order. |
| [**iserverAccountOrdersGet**](TradingOrdersApi.md#iserverAccountOrdersGet) | **GET** /iserver/account/orders | Retrieves Open Orders And Filled Or Cancelled Orders Submitted During The Current Brokerage Session. |
| [**iserverAccountTradesGet**](TradingOrdersApi.md#iserverAccountTradesGet) | **GET** /iserver/account/trades | Retrieve A List Of Trades. |
| [**iserverNotificationPost**](TradingOrdersApi.md#iserverNotificationPost) | **POST** /iserver/notification | Respond To A Server Prompt. |
| [**iserverQuestionsSuppressPost**](TradingOrdersApi.md#iserverQuestionsSuppressPost) | **POST** /iserver/questions/suppress | Suppress The Specified Order Reply Messages. |
| [**iserverQuestionsSuppressResetPost**](TradingOrdersApi.md#iserverQuestionsSuppressResetPost) | **POST** /iserver/questions/suppress/reset | Removes Suppression Of All Order Reply Messages. |
| [**iserverReplyReplyIdPost**](TradingOrdersApi.md#iserverReplyReplyIdPost) | **POST** /iserver/reply/{replyId} | Confirm An Order Reply Message. |


<a id="iserverAccountAccountIdOrderOrderIdDelete"></a>
# **iserverAccountAccountIdOrderOrderIdDelete**
> IserverAccountAccountIdOrderOrderIdDelete200Response iserverAccountAccountIdOrderOrderIdDelete(accountId, orderId)

Cancel An Existing, Unfilled Order.

Cancel an existing, unfilled order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String accountId = "DU123456"; // String | The account to which the order will clear.
    String orderId = "1799796559"; // String | The IB-assigned order ID of the desired order ticket.
    try {
      IserverAccountAccountIdOrderOrderIdDelete200Response result = apiInstance.iserverAccountAccountIdOrderOrderIdDelete(accountId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverAccountAccountIdOrderOrderIdDelete");
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
| **accountId** | **String**| The account to which the order will clear. | |
| **orderId** | **String**| The IB-assigned order ID of the desired order ticket. | |

### Return type

[**IserverAccountAccountIdOrderOrderIdDelete200Response**](IserverAccountAccountIdOrderOrderIdDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status of submission |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdOrderOrderIdPost"></a>
# **iserverAccountAccountIdOrderOrderIdPost**
> IserverAccountAccountIdOrderOrderIdPost200Response iserverAccountAccountIdOrderOrderIdPost(accountId, orderId, singleOrderSubmissionRequest)

Modify An Existing, Unfilled Order.

Modify an existing, unfilled order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String accountId = "DU123456"; // String | The account to which the order will clear.
    String orderId = "1799796559"; // String | The IB-assigned order ID of the desired order ticket.
    SingleOrderSubmissionRequest singleOrderSubmissionRequest = new SingleOrderSubmissionRequest(); // SingleOrderSubmissionRequest | 
    try {
      IserverAccountAccountIdOrderOrderIdPost200Response result = apiInstance.iserverAccountAccountIdOrderOrderIdPost(accountId, orderId, singleOrderSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverAccountAccountIdOrderOrderIdPost");
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
| **accountId** | **String**| The account to which the order will clear. | |
| **orderId** | **String**| The IB-assigned order ID of the desired order ticket. | |
| **singleOrderSubmissionRequest** | [**SingleOrderSubmissionRequest**](SingleOrderSubmissionRequest.md)|  | |

### Return type

[**IserverAccountAccountIdOrderOrderIdPost200Response**](IserverAccountAccountIdOrderOrderIdPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status of submission |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdOrdersPost"></a>
# **iserverAccountAccountIdOrdersPost**
> IserverAccountAccountIdOrderOrderIdPost200Response iserverAccountAccountIdOrdersPost(accountId, singleOrderSubmissionRequest)

Submit A New Order(s) Ticket, Bracket, Or OCA Group.

Submit a new order(s) ticket, bracket, or OCA group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String accountId = "DU123456"; // String | The account to which the order will clear.
    List<SingleOrderSubmissionRequest> singleOrderSubmissionRequest = Arrays.asList(); // List<SingleOrderSubmissionRequest> | 
    try {
      IserverAccountAccountIdOrderOrderIdPost200Response result = apiInstance.iserverAccountAccountIdOrdersPost(accountId, singleOrderSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverAccountAccountIdOrdersPost");
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
| **accountId** | **String**| The account to which the order will clear. | |
| **singleOrderSubmissionRequest** | [**List&lt;SingleOrderSubmissionRequest&gt;**](SingleOrderSubmissionRequest.md)|  | |

### Return type

[**IserverAccountAccountIdOrderOrderIdPost200Response**](IserverAccountAccountIdOrderOrderIdPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order submission response (success, error, reply is required or order reject) |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdOrdersWhatifPost"></a>
# **iserverAccountAccountIdOrdersWhatifPost**
> OrderPreview iserverAccountAccountIdOrdersWhatifPost(accountId, singleOrderSubmissionRequest)

Preview The Projected Effects Of An Order Ticket Or Bracket Of Orders, Including Cost And Changes To Margin And Account Equity.

Preview the projected effects of an order ticket or bracket of orders, including cost and changes to margin and account equity.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String accountId = "DU123456"; // String | The account to which the order will clear.
    List<SingleOrderSubmissionRequest> singleOrderSubmissionRequest = Arrays.asList(); // List<SingleOrderSubmissionRequest> | 
    try {
      OrderPreview result = apiInstance.iserverAccountAccountIdOrdersWhatifPost(accountId, singleOrderSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverAccountAccountIdOrdersWhatifPost");
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
| **accountId** | **String**| The account to which the order will clear. | |
| **singleOrderSubmissionRequest** | [**List&lt;SingleOrderSubmissionRequest&gt;**](SingleOrderSubmissionRequest.md)|  | |

### Return type

[**OrderPreview**](OrderPreview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Preview |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountOrderStatusOrderIdGet"></a>
# **iserverAccountOrderStatusOrderIdGet**
> IserverAccountOrderStatusOrderIdGet200Response iserverAccountOrderStatusOrderIdGet(orderId)

Retrieve The Status Of A Single Order.

Retrieve the status of a single order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String orderId = "1799796559"; // String | 
    try {
      IserverAccountOrderStatusOrderIdGet200Response result = apiInstance.iserverAccountOrderStatusOrderIdGet(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverAccountOrderStatusOrderIdGet");
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
| **orderId** | **String**|  | |

### Return type

[**IserverAccountOrderStatusOrderIdGet200Response**](IserverAccountOrderStatusOrderIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | order status |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountOrdersGet"></a>
# **iserverAccountOrdersGet**
> LiveOrdersResponse iserverAccountOrdersGet(filters, force, accountId)

Retrieves Open Orders And Filled Or Cancelled Orders Submitted During The Current Brokerage Session.

Retrieves open orders and filled or cancelled orders submitted during the current brokerage session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String filters = "Inactive"; // String | Filter results using a comma-separated list of Order Status values. Also accepts a value to sort results by time.
    Boolean force = true; // Boolean | Instructs IB to clear cache of orders and obtain updated view from brokerage backend. Response will be an empty array.
    String accountId = "DU123456"; // String | Retrieve orders for a specific account in the structure.
    try {
      LiveOrdersResponse result = apiInstance.iserverAccountOrdersGet(filters, force, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverAccountOrdersGet");
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
| **filters** | **String**| Filter results using a comma-separated list of Order Status values. Also accepts a value to sort results by time. | [optional] [enum: Inactive, PendingSubmit, PreSubmitted, Submitted, Filled, PendingCancel, Cancelled, WarnState, SortByTime] |
| **force** | **Boolean**| Instructs IB to clear cache of orders and obtain updated view from brokerage backend. Response will be an empty array. | [optional] |
| **accountId** | **String**| Retrieve orders for a specific account in the structure. | [optional] |

### Return type

[**LiveOrdersResponse**](LiveOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Orders for a specific account |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountTradesGet"></a>
# **iserverAccountTradesGet**
> List&lt;TradesResponseInner&gt; iserverAccountTradesGet(days, accountId)

Retrieve A List Of Trades.

Retrieve a list of trades, up to a maximum of 7 days prior.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String days = "3"; // String | The number of prior days prior to include in response, up to a maximum of 7. If omitted, only the current day's executions will be returned.
    String accountId = "DU123456"; // String | Filter trades by account ID or allocation group.
    try {
      List<TradesResponseInner> result = apiInstance.iserverAccountTradesGet(days, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverAccountTradesGet");
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
| **days** | **String**| The number of prior days prior to include in response, up to a maximum of 7. If omitted, only the current day&#39;s executions will be returned. | [optional] |
| **accountId** | **String**| Filter trades by account ID or allocation group. | [optional] |

### Return type

[**List&lt;TradesResponseInner&gt;**](TradesResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | trades |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverNotificationPost"></a>
# **iserverNotificationPost**
> String iserverNotificationPost(iserverNotificationPostRequest)

Respond To A Server Prompt.

Respond to a server prompt received via ntf webscoket message.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    IserverNotificationPostRequest iserverNotificationPostRequest = new IserverNotificationPostRequest(); // IserverNotificationPostRequest | 
    try {
      String result = apiInstance.iserverNotificationPost(iserverNotificationPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverNotificationPost");
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
| **iserverNotificationPostRequest** | [**IserverNotificationPostRequest**](IserverNotificationPostRequest.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status of submitted prompt |  -  |

<a id="iserverQuestionsSuppressPost"></a>
# **iserverQuestionsSuppressPost**
> IserverQuestionsSuppressPost200Response iserverQuestionsSuppressPost(iserverQuestionsSuppressPostRequest)

Suppress The Specified Order Reply Messages.

Suppress the specified order reply messages for the duration of the brokerage session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    IserverQuestionsSuppressPostRequest iserverQuestionsSuppressPostRequest = new IserverQuestionsSuppressPostRequest(); // IserverQuestionsSuppressPostRequest | 
    try {
      IserverQuestionsSuppressPost200Response result = apiInstance.iserverQuestionsSuppressPost(iserverQuestionsSuppressPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverQuestionsSuppressPost");
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
| **iserverQuestionsSuppressPostRequest** | [**IserverQuestionsSuppressPostRequest**](IserverQuestionsSuppressPostRequest.md)|  | |

### Return type

[**IserverQuestionsSuppressPost200Response**](IserverQuestionsSuppressPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request&#39;s status |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverQuestionsSuppressResetPost"></a>
# **iserverQuestionsSuppressResetPost**
> IserverQuestionsSuppressResetPost200Response iserverQuestionsSuppressResetPost()

Removes Suppression Of All Order Reply Messages.

Removes suppression of all order reply messages that were previously suppressed in the current brokerage session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    try {
      IserverQuestionsSuppressResetPost200Response result = apiInstance.iserverQuestionsSuppressResetPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverQuestionsSuppressResetPost");
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

[**IserverQuestionsSuppressResetPost200Response**](IserverQuestionsSuppressResetPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request&#39;s status |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverReplyReplyIdPost"></a>
# **iserverReplyReplyIdPost**
> IserverReplyReplyIdPost200Response iserverReplyReplyIdPost(replyId, iserverReplyReplyIdPostRequest)

Confirm An Order Reply Message.

Confirm an order reply message and continue with submission of order ticket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOrdersApi apiInstance = new TradingOrdersApi(defaultClient);
    String replyId = "99097238-9824-4830-84ef-46979aa22593"; // String | The UUID of the reply message to be confirmed, obtained from an order submission response.
    IserverReplyReplyIdPostRequest iserverReplyReplyIdPostRequest = new IserverReplyReplyIdPostRequest(); // IserverReplyReplyIdPostRequest | 
    try {
      IserverReplyReplyIdPost200Response result = apiInstance.iserverReplyReplyIdPost(replyId, iserverReplyReplyIdPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOrdersApi#iserverReplyReplyIdPost");
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
| **replyId** | **String**| The UUID of the reply message to be confirmed, obtained from an order submission response. | |
| **iserverReplyReplyIdPostRequest** | [**IserverReplyReplyIdPostRequest**](IserverReplyReplyIdPostRequest.md)|  | |

### Return type

[**IserverReplyReplyIdPost200Response**](IserverReplyReplyIdPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status of reply |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

