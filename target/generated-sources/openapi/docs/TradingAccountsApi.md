# TradingAccountsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aceswsAccountIdSignaturesAndOwnersGet**](TradingAccountsApi.md#aceswsAccountIdSignaturesAndOwnersGet) | **GET** /acesws/{accountId}/signatures-and-owners | Signatures And Owners |
| [**iserverAccountAccountIdSummaryAvailableFundsGet**](TradingAccountsApi.md#iserverAccountAccountIdSummaryAvailableFundsGet) | **GET** /iserver/account/{accountId}/summary/available_funds | Summary Of Available Funds |
| [**iserverAccountAccountIdSummaryBalancesGet**](TradingAccountsApi.md#iserverAccountAccountIdSummaryBalancesGet) | **GET** /iserver/account/{accountId}/summary/balances | Summary Of Account Balances |
| [**iserverAccountAccountIdSummaryGet**](TradingAccountsApi.md#iserverAccountAccountIdSummaryGet) | **GET** /iserver/account/{accountId}/summary | General Account Summary |
| [**iserverAccountAccountIdSummaryMarginsGet**](TradingAccountsApi.md#iserverAccountAccountIdSummaryMarginsGet) | **GET** /iserver/account/{accountId}/summary/margins | Summary Of Account Margin |
| [**iserverAccountAccountIdSummaryMarketValueGet**](TradingAccountsApi.md#iserverAccountAccountIdSummaryMarketValueGet) | **GET** /iserver/account/{accountId}/summary/market_value | Summary Of Account&#39;s Market Value |
| [**iserverAccountPnlPartitionedGet**](TradingAccountsApi.md#iserverAccountPnlPartitionedGet) | **GET** /iserver/account/pnl/partitioned | Account Profit And Loss |
| [**iserverAccountPost**](TradingAccountsApi.md#iserverAccountPost) | **POST** /iserver/account | Switch Account |
| [**iserverAccountSearchSearchPatternGet**](TradingAccountsApi.md#iserverAccountSearchSearchPatternGet) | **GET** /iserver/account/search/{searchPattern} | Search Dynamic Account |
| [**iserverAccountsGet**](TradingAccountsApi.md#iserverAccountsGet) | **GET** /iserver/accounts | Receive Brokerage Accounts For The Current User. |
| [**iserverDynaccountPost**](TradingAccountsApi.md#iserverDynaccountPost) | **POST** /iserver/dynaccount | Set Dynamic Account |


<a id="aceswsAccountIdSignaturesAndOwnersGet"></a>
# **aceswsAccountIdSignaturesAndOwnersGet**
> SignatureAndOwners aceswsAccountIdSignaturesAndOwnersGet(accountId)

Signatures And Owners

Receive a list of all applicant names on the account and for which account and entity is represented.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      SignatureAndOwners result = apiInstance.aceswsAccountIdSignaturesAndOwnersGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#aceswsAccountIdSignaturesAndOwnersGet");
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

[**SignatureAndOwners**](SignatureAndOwners.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing valid accounts and the account properties regarding trading access. This endpoint is also used to confirm account validation. |  -  |
| **400** | bad request; accountId is empty |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdSummaryAvailableFundsGet"></a>
# **iserverAccountAccountIdSummaryAvailableFundsGet**
> AvailableFundsResponse iserverAccountAccountIdSummaryAvailableFundsGet(accountId)

Summary Of Available Funds

Provides a summary specific for avilable funds giving more depth than the standard /summary endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    try {
      AvailableFundsResponse result = apiInstance.iserverAccountAccountIdSummaryAvailableFundsGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountAccountIdSummaryAvailableFundsGet");
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

[**AvailableFundsResponse**](AvailableFundsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates a successful return of available funds. |  -  |
| **400** | bad request; passed input cannot pass initial validation and detected right away |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdSummaryBalancesGet"></a>
# **iserverAccountAccountIdSummaryBalancesGet**
> SummaryOfAccountBalancesResponse iserverAccountAccountIdSummaryBalancesGet(accountId)

Summary Of Account Balances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    try {
      SummaryOfAccountBalancesResponse result = apiInstance.iserverAccountAccountIdSummaryBalancesGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountAccountIdSummaryBalancesGet");
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

[**SummaryOfAccountBalancesResponse**](SummaryOfAccountBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates a successful return of available funds. |  -  |
| **400** | bad request; passed input cannot pass initial validation and detected right away |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdSummaryGet"></a>
# **iserverAccountAccountIdSummaryGet**
> AccountSummaryResponse iserverAccountAccountIdSummaryGet(accountId)

General Account Summary

Provides a general overview of the account details such as balance values.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    try {
      AccountSummaryResponse result = apiInstance.iserverAccountAccountIdSummaryGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountAccountIdSummaryGet");
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

[**AccountSummaryResponse**](AccountSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Provides a general overview of the account details such as balance values. |  -  |
| **400** | bad request; passed input cannot pass initial validation and detected right away |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdSummaryMarginsGet"></a>
# **iserverAccountAccountIdSummaryMarginsGet**
> SummaryOfAccountMarginResponse iserverAccountAccountIdSummaryMarginsGet(accountId)

Summary Of Account Margin

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    try {
      SummaryOfAccountMarginResponse result = apiInstance.iserverAccountAccountIdSummaryMarginsGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountAccountIdSummaryMarginsGet");
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

[**SummaryOfAccountMarginResponse**](SummaryOfAccountMarginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates a success request to receive margin balance values. |  -  |
| **400** | bad request; passed input cannot pass initial validation and detected right away |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAccountIdSummaryMarketValueGet"></a>
# **iserverAccountAccountIdSummaryMarketValueGet**
> SummaryMarketValueResponse iserverAccountAccountIdSummaryMarketValueGet(accountId)

Summary Of Account&#39;s Market Value

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    String accountId = "U1234567"; // String | 
    try {
      SummaryMarketValueResponse result = apiInstance.iserverAccountAccountIdSummaryMarketValueGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountAccountIdSummaryMarketValueGet");
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

[**SummaryMarketValueResponse**](SummaryMarketValueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates a successful market value request. |  -  |
| **400** | bad request; passed input cannot pass initial validation and detected right away |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountPnlPartitionedGet"></a>
# **iserverAccountPnlPartitionedGet**
> PnlPartitionedResponse iserverAccountPnlPartitionedGet()

Account Profit And Loss

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    try {
      PnlPartitionedResponse result = apiInstance.iserverAccountPnlPartitionedGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountPnlPartitionedGet");
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

[**PnlPartitionedResponse**](PnlPartitionedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refers to “updated PnL”. Holds a json object of key-value paired pnl details. |  -  |
| **400** | bad request; passed input cannot pass initial validation and detected right away |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountPost"></a>
# **iserverAccountPost**
> SetAccountResponse iserverAccountPost(iserverAccountPostRequest)

Switch Account

Switch the active account for how you request data. Only available for financial advisors and multi-account structures. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    IserverAccountPostRequest iserverAccountPostRequest = new IserverAccountPostRequest(); // IserverAccountPostRequest | 
    try {
      SetAccountResponse result = apiInstance.iserverAccountPost(iserverAccountPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountPost");
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
| **iserverAccountPostRequest** | [**IserverAccountPostRequest**](IserverAccountPostRequest.md)|  | |

### Return type

[**SetAccountResponse**](SetAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validates the account swapped to. |  -  |
| **401** | access denied |  -  |
| **500** | Internal Server Error. Unable to process request if incoming values are not valid. For example accountId is not correct  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountSearchSearchPatternGet"></a>
# **iserverAccountSearchSearchPatternGet**
> DynAccountSearchResponse iserverAccountSearchSearchPatternGet(searchPattern)

Search Dynamic Account

Returns a list of accounts matching a query pattern set in the request. Broker accounts configured with the DYNACCT property will not receive account information at login. Instead, they must dynamically query then set their account number. Customers without the DYNACCT property will receive a 503 error. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    String searchPattern = "U123"; // String | 
    try {
      DynAccountSearchResponse result = apiInstance.iserverAccountSearchSearchPatternGet(searchPattern);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountSearchSearchPatternGet");
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
| **searchPattern** | **String**|  | |

### Return type

[**DynAccountSearchResponse**](DynAccountSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all accounts that match the searchPattern string. |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountsGet"></a>
# **iserverAccountsGet**
> UserAccountsResponse iserverAccountsGet()

Receive Brokerage Accounts For The Current User.

Returns a list of accounts the user has trading access to, their respective aliases and the currently selected account. Note this endpoint must be called before modifying an order or querying open orders.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    try {
      UserAccountsResponse result = apiInstance.iserverAccountsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverAccountsGet");
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

[**UserAccountsResponse**](UserAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object containing valid accounts and the account properties regarding trading access. This endpoint is also used to confirm account validation. |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverDynaccountPost"></a>
# **iserverDynaccountPost**
> SetAccountResponse iserverDynaccountPost(iserverDynaccountPostRequest)

Set Dynamic Account

Set the active dynamic account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingAccountsApi apiInstance = new TradingAccountsApi(defaultClient);
    IserverDynaccountPostRequest iserverDynaccountPostRequest = new IserverDynaccountPostRequest(); // IserverDynaccountPostRequest | 
    try {
      SetAccountResponse result = apiInstance.iserverDynaccountPost(iserverDynaccountPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAccountsApi#iserverDynaccountPost");
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
| **iserverDynaccountPostRequest** | [**IserverDynaccountPostRequest**](IserverDynaccountPostRequest.md)|  | |

### Return type

[**SetAccountResponse**](SetAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

