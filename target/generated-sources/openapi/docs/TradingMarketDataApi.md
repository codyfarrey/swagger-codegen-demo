# TradingMarketDataApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hmdsHistoryGet**](TradingMarketDataApi.md#hmdsHistoryGet) | **GET** /hmds/history | Request Historical Data For An Instrument In The Form Of OHLC Bars. |
| [**iserverMarketdataHistoryGet**](TradingMarketDataApi.md#iserverMarketdataHistoryGet) | **GET** /iserver/marketdata/history | Request Historical Data For An Instrument In The Form Of OHLC Bars. |
| [**iserverMarketdataSnapshotGet**](TradingMarketDataApi.md#iserverMarketdataSnapshotGet) | **GET** /iserver/marketdata/snapshot | Live Market Data Snapshot |
| [**iserverMarketdataUnsubscribePost**](TradingMarketDataApi.md#iserverMarketdataUnsubscribePost) | **POST** /iserver/marketdata/unsubscribe | Instruct IServer To Close Its Backend Stream For The Instrument. |
| [**iserverMarketdataUnsubscribeallGet**](TradingMarketDataApi.md#iserverMarketdataUnsubscribeallGet) | **GET** /iserver/marketdata/unsubscribeall | Instruct IServer To Close All Of Its Open Backend Data Streams For All Instruments. |
| [**mdRegsnapshotGet**](TradingMarketDataApi.md#mdRegsnapshotGet) | **GET** /md/regsnapshot | Request A Regulatory Snapshot For An Instrument. |


<a id="hmdsHistoryGet"></a>
# **hmdsHistoryGet**
> HmdsHistoryResponse hmdsHistoryGet(conid, period, bar, barType, startTime, direction, outsideRth)

Request Historical Data For An Instrument In The Form Of OHLC Bars.

Request historical data for an instrument in the form of OHLC bars.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingMarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingMarketDataApi apiInstance = new TradingMarketDataApi(defaultClient);
    String conid = "265598"; // String | IB contract ID of the requested instrument.
    String period = "6d"; // String | A time duration away from startTime, as governed by the direction parameter, to be divided into bars of the specified width.
    String bar = "5mins"; // String | The width of the bars into which the interval determined by period and startTime will be divided. It is not required that bar evenly divide period; partial bars can be returned.
    String barType = "Last"; // String | The requested historical data type. If omitted, Last Trade data is queried.
    String startTime = "startTime_example"; // String | A fixed UTC date-time reference point for the historical data request, from which the specified period extends, as governed by the direction parameter. Format is YYYYMMDD-hh:mm:ss. If omitted, the current time is used, and direction must be omitted or 1.
    String direction = "-1"; // String | The requested period's direction in time away from the startTime. -1 queries bars from startTime forward into the future for the span of the requested period, 1 queries bars from startTime backward into the past for the span of the request period. Default behavior is 1, from startTime backward.
    Boolean outsideRth = true; // Boolean | Indicates whether data outside of regular trading hours should be included in response.
    try {
      HmdsHistoryResponse result = apiInstance.hmdsHistoryGet(conid, period, bar, barType, startTime, direction, outsideRth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingMarketDataApi#hmdsHistoryGet");
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
| **conid** | **String**| IB contract ID of the requested instrument. | |
| **period** | **String**| A time duration away from startTime, as governed by the direction parameter, to be divided into bars of the specified width. | |
| **bar** | **String**| The width of the bars into which the interval determined by period and startTime will be divided. It is not required that bar evenly divide period; partial bars can be returned. | |
| **barType** | **String**| The requested historical data type. If omitted, Last Trade data is queried. | [optional] [enum: Last, Bid, Ask, Midpoint, FeeRate, Inventory] |
| **startTime** | **String**| A fixed UTC date-time reference point for the historical data request, from which the specified period extends, as governed by the direction parameter. Format is YYYYMMDD-hh:mm:ss. If omitted, the current time is used, and direction must be omitted or 1. | [optional] |
| **direction** | **String**| The requested period&#39;s direction in time away from the startTime. -1 queries bars from startTime forward into the future for the span of the requested period, 1 queries bars from startTime backward into the past for the span of the request period. Default behavior is 1, from startTime backward. | [optional] |
| **outsideRth** | **Boolean**| Indicates whether data outside of regular trading hours should be included in response. | [optional] |

### Return type

[**HmdsHistoryResponse**](HmdsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical data query successfully returned data. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverMarketdataHistoryGet"></a>
# **iserverMarketdataHistoryGet**
> IserverHistoryResponse iserverMarketdataHistoryGet(conid, period, bar, exchange, startTime, outsideRth)

Request Historical Data For An Instrument In The Form Of OHLC Bars.

Request historical data for an instrument in the form of OHLC bars.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingMarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingMarketDataApi apiInstance = new TradingMarketDataApi(defaultClient);
    String conid = "265598"; // String | IB contract ID of the requested instrument.
    String period = "6d"; // String | A time duration away from startTime into the future to be divided into bars of the specified width.
    String bar = "5mins"; // String | The width of the bars into which the interval determined by period and startTime will be divided. It is not required that bar evenly divide period; partial bars can be returned.
    String exchange = "NYSE"; // String | Exchange (or SMART) from which data is requested.
    String startTime = "startTime_example"; // String | A fixed UTC date-time reference point for the historical data request, from which the specified period extends. Format is YYYYMMDD-hh:mm:ss. If omitted, the current time is used, and direction must be omitted or 1.
    Boolean outsideRth = true; // Boolean | Indicates whether data outside of regular trading hours should be included in response.
    try {
      IserverHistoryResponse result = apiInstance.iserverMarketdataHistoryGet(conid, period, bar, exchange, startTime, outsideRth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingMarketDataApi#iserverMarketdataHistoryGet");
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
| **conid** | **String**| IB contract ID of the requested instrument. | |
| **period** | **String**| A time duration away from startTime into the future to be divided into bars of the specified width. | |
| **bar** | **String**| The width of the bars into which the interval determined by period and startTime will be divided. It is not required that bar evenly divide period; partial bars can be returned. | |
| **exchange** | **String**| Exchange (or SMART) from which data is requested. | [optional] |
| **startTime** | **String**| A fixed UTC date-time reference point for the historical data request, from which the specified period extends. Format is YYYYMMDD-hh:mm:ss. If omitted, the current time is used, and direction must be omitted or 1. | [optional] |
| **outsideRth** | **Boolean**| Indicates whether data outside of regular trading hours should be included in response. | [optional] |

### Return type

[**IserverHistoryResponse**](IserverHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Historical data query successfully returned data. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverMarketdataSnapshotGet"></a>
# **iserverMarketdataSnapshotGet**
> FyiVT iserverMarketdataSnapshotGet(conids, fields)

Live Market Data Snapshot

Get Market Data for the given conid(s). A pre-flight request must be made prior to ever receiving data. For some fields, it may take more than a few moments to receive information. See response fields for a list of available fields that can be request via fields argument. The endpoint /iserver/accounts must be called prior to /iserver/marketdata/snapshot. For derivative contracts the endpoint /iserver/secdef/search must be called first. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingMarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingMarketDataApi apiInstance = new TradingMarketDataApi(defaultClient);
    String conids = "265598"; // String | 
    MdFields fields = MdFields.fromValue("31"); // MdFields | 
    try {
      FyiVT result = apiInstance.iserverMarketdataSnapshotGet(conids, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingMarketDataApi#iserverMarketdataSnapshotGet");
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
| **conids** | **String**|  | |
| **fields** | [**MdFields**](.md)|  | [optional] [enum: 31, 55, 58, 70, 71, 73, 74, 75, 76, 77, 78, 79, 80, 82, 83, 84, 85, 86, 87, 88, 6004, 6008, 6070, 6072, 6073, 6119, 6457, 6508, 6509, 7051, 7057, 7058, 7059, 7068, 7084, 7085, 7086, 7087, 7088, 7089, 7094, 7184, 7219, 7220, 7221, 7280, 7281, 7282, 7283, 7284, 7285, 7286, 7287, 7288, 7289, 7290, 7291, 7292, 7293, 7294, 7295, 7296, 7308, 7309, 7310, 7311, 7607, 7633, 7635, 7636, 7637, 7638, 7639, 7644, 7655, 7671, 7672, 7674, 7675, 7676, 7677, 7678, 7679, 7724, 7681, 7682, 7683, 7684, 7685, 7686, 7687, 7688, 7689, 7690, 7694, 7695, 7696, 7697, 7698, 7699, 7700, 7702, 7703, 7704, 7705, 7706, 7707, 7708, 7714, 7715, 7718, 7720, 7741, 7762, 7768, 7920, 7921] |

### Return type

[**FyiVT**](FyiVT.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully enabled or disabled your email notifications. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverMarketdataUnsubscribePost"></a>
# **iserverMarketdataUnsubscribePost**
> IserverMarketdataUnsubscribePost200Response iserverMarketdataUnsubscribePost(iserverMarketdataUnsubscribePostRequest)

Instruct IServer To Close Its Backend Stream For The Instrument.

Instruct IServer to close its backend stream for the instrument when real-time snapshots are no longer needed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingMarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingMarketDataApi apiInstance = new TradingMarketDataApi(defaultClient);
    IserverMarketdataUnsubscribePostRequest iserverMarketdataUnsubscribePostRequest = new IserverMarketdataUnsubscribePostRequest(); // IserverMarketdataUnsubscribePostRequest | 
    try {
      IserverMarketdataUnsubscribePost200Response result = apiInstance.iserverMarketdataUnsubscribePost(iserverMarketdataUnsubscribePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingMarketDataApi#iserverMarketdataUnsubscribePost");
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
| **iserverMarketdataUnsubscribePostRequest** | [**IserverMarketdataUnsubscribePostRequest**](IserverMarketdataUnsubscribePostRequest.md)|  | |

### Return type

[**IserverMarketdataUnsubscribePost200Response**](IserverMarketdataUnsubscribePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Acknowledges a successful request |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverMarketdataUnsubscribeallGet"></a>
# **iserverMarketdataUnsubscribeallGet**
> IserverMarketdataUnsubscribeallGet200Response iserverMarketdataUnsubscribeallGet()

Instruct IServer To Close All Of Its Open Backend Data Streams For All Instruments.

Instruct IServer to close all of its open backend data streams for all instruments.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingMarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingMarketDataApi apiInstance = new TradingMarketDataApi(defaultClient);
    try {
      IserverMarketdataUnsubscribeallGet200Response result = apiInstance.iserverMarketdataUnsubscribeallGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingMarketDataApi#iserverMarketdataUnsubscribeallGet");
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

[**IserverMarketdataUnsubscribeallGet200Response**](IserverMarketdataUnsubscribeallGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates a successful request to unsubscribe all streams. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="mdRegsnapshotGet"></a>
# **mdRegsnapshotGet**
> RegsnapshotData mdRegsnapshotGet(conid)

Request A Regulatory Snapshot For An Instrument.

Request a regulatory snapshot for an instrument.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingMarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingMarketDataApi apiInstance = new TradingMarketDataApi(defaultClient);
    String conid = "265598"; // String | An IB contract ID.
    try {
      RegsnapshotData result = apiInstance.mdRegsnapshotGet(conid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingMarketDataApi#mdRegsnapshotGet");
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
| **conid** | **String**| An IB contract ID. | |

### Return type

[**RegsnapshotData**](RegsnapshotData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Market Data reg. snapshot |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

