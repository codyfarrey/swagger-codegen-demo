# TradingScannerApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hmdsScannerParamsGet**](TradingScannerApi.md#hmdsScannerParamsGet) | **GET** /hmds/scanner/params | HMDS Scanner Parameters |
| [**hmdsScannerRunPost**](TradingScannerApi.md#hmdsScannerRunPost) | **POST** /hmds/scanner/run | HMDS Market Scanner |
| [**iserverScannerParamsGet**](TradingScannerApi.md#iserverScannerParamsGet) | **GET** /iserver/scanner/params | Iserver Scanner Parameters |
| [**iserverScannerRunPost**](TradingScannerApi.md#iserverScannerRunPost) | **POST** /iserver/scanner/run | Iserver Market Scanner |


<a id="hmdsScannerParamsGet"></a>
# **hmdsScannerParamsGet**
> HmdsScannerParams hmdsScannerParamsGet()

HMDS Scanner Parameters

Query the parameter list for the HMDS market scanner.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingScannerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingScannerApi apiInstance = new TradingScannerApi(defaultClient);
    try {
      HmdsScannerParams result = apiInstance.hmdsScannerParamsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingScannerApi#hmdsScannerParamsGet");
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

[**HmdsScannerParams**](HmdsScannerParams.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="hmdsScannerRunPost"></a>
# **hmdsScannerRunPost**
> HmdsScannerRunPost200Response hmdsScannerRunPost(hmdsScannerRunRequest)

HMDS Market Scanner

Request a market scanner from our HMDS service. Can return a maximum of 250 contracts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingScannerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingScannerApi apiInstance = new TradingScannerApi(defaultClient);
    HmdsScannerRunRequest hmdsScannerRunRequest = new HmdsScannerRunRequest(); // HmdsScannerRunRequest | 
    try {
      HmdsScannerRunPost200Response result = apiInstance.hmdsScannerRunPost(hmdsScannerRunRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingScannerApi#hmdsScannerRunPost");
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
| **hmdsScannerRunRequest** | [**HmdsScannerRunRequest**](HmdsScannerRunRequest.md)|  | |

### Return type

[**HmdsScannerRunPost200Response**](HmdsScannerRunPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **404** | Returned on the first successful request. Used as a preflight message. |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverScannerParamsGet"></a>
# **iserverScannerParamsGet**
> IserverScannerParams iserverScannerParamsGet()

Iserver Scanner Parameters

Returns an xml file containing all available parameters to be sent for the Iserver scanner request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingScannerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingScannerApi apiInstance = new TradingScannerApi(defaultClient);
    try {
      IserverScannerParams result = apiInstance.iserverScannerParamsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingScannerApi#iserverScannerParamsGet");
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

[**IserverScannerParams**](IserverScannerParams.md)

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
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverScannerRunPost"></a>
# **iserverScannerRunPost**
> IserverScannerRunResponse iserverScannerRunPost(iserverScannerRunRequest)

Iserver Market Scanner

Searches for contracts according to the filters specified in /iserver/scanner/params endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingScannerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingScannerApi apiInstance = new TradingScannerApi(defaultClient);
    IserverScannerRunRequest iserverScannerRunRequest = new IserverScannerRunRequest(); // IserverScannerRunRequest | 
    try {
      IserverScannerRunResponse result = apiInstance.iserverScannerRunPost(iserverScannerRunRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingScannerApi#iserverScannerRunPost");
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
| **iserverScannerRunRequest** | [**IserverScannerRunRequest**](IserverScannerRunRequest.md)|  | |

### Return type

[**IserverScannerRunResponse**](IserverScannerRunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

