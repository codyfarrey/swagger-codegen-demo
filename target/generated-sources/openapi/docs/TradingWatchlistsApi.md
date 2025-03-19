# TradingWatchlistsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iserverWatchlistDelete**](TradingWatchlistsApi.md#iserverWatchlistDelete) | **DELETE** /iserver/watchlist | Delete A Specified Watchlist From The Username&#39;s Settings. |
| [**iserverWatchlistGet**](TradingWatchlistsApi.md#iserverWatchlistGet) | **GET** /iserver/watchlist | Retrieve Details Of A Single Watchlist Stored In The Username&#39;s Settings. |
| [**iserverWatchlistPost**](TradingWatchlistsApi.md#iserverWatchlistPost) | **POST** /iserver/watchlist | Create A Watchlist To Monitor A Set Of Instruments. |
| [**iserverWatchlistsGet**](TradingWatchlistsApi.md#iserverWatchlistsGet) | **GET** /iserver/watchlists | Retrieve All Saved Watchlists Stored On IB Backend For The Username In Use In The Current Web API Session. |


<a id="iserverWatchlistDelete"></a>
# **iserverWatchlistDelete**
> WatchlistDeleteSuccess iserverWatchlistDelete(id)

Delete A Specified Watchlist From The Username&#39;s Settings.

Delete a specified watchlist from the username&#39;s settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingWatchlistsApi apiInstance = new TradingWatchlistsApi(defaultClient);
    String id = "1234"; // String | Watchlist ID of the watchlist to be deleted.
    try {
      WatchlistDeleteSuccess result = apiInstance.iserverWatchlistDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingWatchlistsApi#iserverWatchlistDelete");
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
| **id** | **String**| Watchlist ID of the watchlist to be deleted. | |

### Return type

[**WatchlistDeleteSuccess**](WatchlistDeleteSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful deletion of specified watchlist. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverWatchlistGet"></a>
# **iserverWatchlistGet**
> SingleWatchlist iserverWatchlistGet(id)

Retrieve Details Of A Single Watchlist Stored In The Username&#39;s Settings.

Retrieve details of a single watchlist stored in the username&#39;s settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingWatchlistsApi apiInstance = new TradingWatchlistsApi(defaultClient);
    String id = "1234"; // String | Watchlist ID of the requested watchlist.
    try {
      SingleWatchlist result = apiInstance.iserverWatchlistGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingWatchlistsApi#iserverWatchlistGet");
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
| **id** | **String**| Watchlist ID of the requested watchlist. | |

### Return type

[**SingleWatchlist**](SingleWatchlist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful deletion of specified watchlist. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverWatchlistPost"></a>
# **iserverWatchlistPost**
> IserverWatchlistPost200Response iserverWatchlistPost(iserverWatchlistPostRequest)

Create A Watchlist To Monitor A Set Of Instruments.

Create a named watchlist by submitting a set of conids.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingWatchlistsApi apiInstance = new TradingWatchlistsApi(defaultClient);
    IserverWatchlistPostRequest iserverWatchlistPostRequest = new IserverWatchlistPostRequest(); // IserverWatchlistPostRequest | Watchlist contents.
    try {
      IserverWatchlistPost200Response result = apiInstance.iserverWatchlistPost(iserverWatchlistPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingWatchlistsApi#iserverWatchlistPost");
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
| **iserverWatchlistPostRequest** | [**IserverWatchlistPostRequest**](IserverWatchlistPostRequest.md)| Watchlist contents. | |

### Return type

[**IserverWatchlistPost200Response**](IserverWatchlistPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Watchlist creation successful. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverWatchlistsGet"></a>
# **iserverWatchlistsGet**
> WatchlistsResponse iserverWatchlistsGet(SC)

Retrieve All Saved Watchlists Stored On IB Backend For The Username In Use In The Current Web API Session.

Retrieve all saved watchlists stored on IB backend for the username in use in the current Web API session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingWatchlistsApi apiInstance = new TradingWatchlistsApi(defaultClient);
    String SC = "USER_WATCHLIST"; // String | Can only be used with value USER_WATCHLIST, which returns only user-created watchlists and excludes those created by IB.
    try {
      WatchlistsResponse result = apiInstance.iserverWatchlistsGet(SC);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingWatchlistsApi#iserverWatchlistsGet");
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
| **SC** | **String**| Can only be used with value USER_WATCHLIST, which returns only user-created watchlists and excludes those created by IB. | [optional] [enum: USER_WATCHLIST] |

### Return type

[**WatchlistsResponse**](WatchlistsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical data query successfully returned data. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

