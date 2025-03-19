# TradingPortfolioAnalystApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**paAllperiodsPost**](TradingPortfolioAnalystApi.md#paAllperiodsPost) | **POST** /pa/allperiods | Account Performance (All Time Periods) |
| [**paPerformancePost**](TradingPortfolioAnalystApi.md#paPerformancePost) | **POST** /pa/performance | Account Performance |
| [**paTransactionsPost**](TradingPortfolioAnalystApi.md#paTransactionsPost) | **POST** /pa/transactions | Transaction History |


<a id="paAllperiodsPost"></a>
# **paAllperiodsPost**
> DetailedContractInformation paAllperiodsPost(paAllperiodsPostRequest, param0)

Account Performance (All Time Periods)

Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is consolidated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioAnalystApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioAnalystApi apiInstance = new TradingPortfolioAnalystApi(defaultClient);
    PaAllperiodsPostRequest paAllperiodsPostRequest = new PaAllperiodsPostRequest(); // PaAllperiodsPostRequest | 
    String param0 = "param0_example"; // String | 
    try {
      DetailedContractInformation result = apiInstance.paAllperiodsPost(paAllperiodsPostRequest, param0);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioAnalystApi#paAllperiodsPost");
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
| **paAllperiodsPostRequest** | [**PaAllperiodsPostRequest**](PaAllperiodsPostRequest.md)|  | |
| **param0** | **String**|  | [optional] |

### Return type

[**DetailedContractInformation**](DetailedContractInformation.md)

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

<a id="paPerformancePost"></a>
# **paPerformancePost**
> PerformanceResponse paPerformancePost(paPerformancePostRequest)

Account Performance

Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is consolidated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioAnalystApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioAnalystApi apiInstance = new TradingPortfolioAnalystApi(defaultClient);
    PaPerformancePostRequest paPerformancePostRequest = new PaPerformancePostRequest(); // PaPerformancePostRequest | 
    try {
      PerformanceResponse result = apiInstance.paPerformancePost(paPerformancePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioAnalystApi#paPerformancePost");
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
| **paPerformancePostRequest** | [**PaPerformancePostRequest**](PaPerformancePostRequest.md)|  | |

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

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

<a id="paTransactionsPost"></a>
# **paTransactionsPost**
> TransactionsResponse paTransactionsPost(paTransactionsPostRequest)

Transaction History

Transaction history for a given number of conids and accounts. Types of transactions include dividend payments, buy and sell transactions, transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioAnalystApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioAnalystApi apiInstance = new TradingPortfolioAnalystApi(defaultClient);
    PaTransactionsPostRequest paTransactionsPostRequest = new PaTransactionsPostRequest(); // PaTransactionsPostRequest | 
    try {
      TransactionsResponse result = apiInstance.paTransactionsPost(paTransactionsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioAnalystApi#paTransactionsPost");
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
| **paTransactionsPostRequest** | [**PaTransactionsPostRequest**](PaTransactionsPostRequest.md)|  | |

### Return type

[**TransactionsResponse**](TransactionsResponse.md)

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

