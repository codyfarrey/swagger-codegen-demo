# TradingPortfolioApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**portfolioAccountIdAllocationGet**](TradingPortfolioApi.md#portfolioAccountIdAllocationGet) | **GET** /portfolio/{accountId}/allocation | Get An Account&#39;s Allocations By Asset Class, Sector Group, And Sector. |
| [**portfolioAccountIdLedgerGet**](TradingPortfolioApi.md#portfolioAccountIdLedgerGet) | **GET** /portfolio/{accountId}/ledger | Get Ledger Data For The Given Account. |
| [**portfolioAccountIdMetaGet**](TradingPortfolioApi.md#portfolioAccountIdMetaGet) | **GET** /portfolio/{accountId}/meta | Get An Account&#39;s Attributes. |
| [**portfolioAccountIdPositionsInvalidatePost**](TradingPortfolioApi.md#portfolioAccountIdPositionsInvalidatePost) | **POST** /portfolio/{accountId}/positions/invalidate | Instructs IB To Discard Cached Portfolio Positions For A Given Account. |
| [**portfolioAccountIdPositionsPageIdGet**](TradingPortfolioApi.md#portfolioAccountIdPositionsPageIdGet) | **GET** /portfolio/{accountId}/positions/{pageId} | Get All Positions In An Account. |
| [**portfolioAccountIdSummaryGet**](TradingPortfolioApi.md#portfolioAccountIdSummaryGet) | **GET** /portfolio/{accountId}/summary | Portfolio Account Summary |
| [**portfolioAccountidPositionConidGet**](TradingPortfolioApi.md#portfolioAccountidPositionConidGet) | **GET** /portfolio/{accountid}/position/{conid} | Get Position For A Given Instrument In A Single Account. |
| [**portfolioAccountsGet**](TradingPortfolioApi.md#portfolioAccountsGet) | **GET** /portfolio/accounts | Accounts |
| [**portfolioPositionsConidGet**](TradingPortfolioApi.md#portfolioPositionsConidGet) | **GET** /portfolio/positions/{conid} | Get Positions In Accounts For A Given Instrument |
| [**portfolioSubaccountsGet**](TradingPortfolioApi.md#portfolioSubaccountsGet) | **GET** /portfolio/subaccounts | Get Attributes Of Subaccounts In Account Structure |


<a id="portfolioAccountIdAllocationGet"></a>
# **portfolioAccountIdAllocationGet**
> PortfolioAllocations portfolioAccountIdAllocationGet(accountId, model)

Get An Account&#39;s Allocations By Asset Class, Sector Group, And Sector.

Get an account&#39;s allocations by asset class, sector group, and sector.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object model = null; // Object | 
    try {
      PortfolioAllocations result = apiInstance.portfolioAccountIdAllocationGet(accountId, model);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountIdAllocationGet");
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
| **model** | [**Object**](.md)|  | [optional] |

### Return type

[**PortfolioAllocations**](PortfolioAllocations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response with allocations |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioAccountIdLedgerGet"></a>
# **portfolioAccountIdLedgerGet**
> Map&lt;String, LedgerValue&gt; portfolioAccountIdLedgerGet(accountId)

Get Ledger Data For The Given Account.

Get the given account&#39;s ledger data detailing its balances by currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String accountId = "DU123456"; // String | 
    try {
      Map<String, LedgerValue> result = apiInstance.portfolioAccountIdLedgerGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountIdLedgerGet");
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

[**Map&lt;String, LedgerValue&gt;**](LedgerValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ledger |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioAccountIdMetaGet"></a>
# **portfolioAccountIdMetaGet**
> AccountAttributes portfolioAccountIdMetaGet(accountId)

Get An Account&#39;s Attributes.

Get a single account&#39;s attributes and capabilities.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String accountId = "DU123456"; // String | 
    try {
      AccountAttributes result = apiInstance.portfolioAccountIdMetaGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountIdMetaGet");
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

[**AccountAttributes**](AccountAttributes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An account&#39;s attributes |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioAccountIdPositionsInvalidatePost"></a>
# **portfolioAccountIdPositionsInvalidatePost**
> PortfolioAccountIdPositionsInvalidatePost200Response portfolioAccountIdPositionsInvalidatePost(accountId)

Instructs IB To Discard Cached Portfolio Positions For A Given Account.

Instructs IB to discard cached portfolio positions for a given account, so that the next request for positions delivers freshly obtained data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String accountId = "DU123456"; // String | 
    try {
      PortfolioAccountIdPositionsInvalidatePost200Response result = apiInstance.portfolioAccountIdPositionsInvalidatePost(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountIdPositionsInvalidatePost");
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

[**PortfolioAccountIdPositionsInvalidatePost200Response**](PortfolioAccountIdPositionsInvalidatePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | status of invalidation |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioAccountIdPositionsPageIdGet"></a>
# **portfolioAccountIdPositionsPageIdGet**
> List&lt;IndividualPosition&gt; portfolioAccountIdPositionsPageIdGet(accountId, UNKNOWN_PARAMETER_NAME, UNKNOWN_PARAMETER_NAME2, UNKNOWN_PARAMETER_NAME3, pageId, waitForSecDef)

Get All Positions In An Account.

Get all positions in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String accountId = "DU123456"; // String | 
     UNKNOWN_PARAMETER_NAME = new null(); //  | Name of model
     UNKNOWN_PARAMETER_NAME2 = new null(); //  | sorting of result positions by specified field. Defaulted to \"name\" field.
     UNKNOWN_PARAMETER_NAME3 = new null(); //  | Sorting direction. Possible values \"a\" - ascending, \"d\" - descending. Defaulted to \"a\"
    String pageId = "1"; // String | 
    Boolean waitForSecDef = true; // Boolean | 
    try {
      List<IndividualPosition> result = apiInstance.portfolioAccountIdPositionsPageIdGet(accountId, UNKNOWN_PARAMETER_NAME, UNKNOWN_PARAMETER_NAME2, UNKNOWN_PARAMETER_NAME3, pageId, waitForSecDef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountIdPositionsPageIdGet");
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
| **UNKNOWN_PARAMETER_NAME** | [****](.md)| Name of model | |
| **UNKNOWN_PARAMETER_NAME2** | [****](.md)| sorting of result positions by specified field. Defaulted to \&quot;name\&quot; field. | |
| **UNKNOWN_PARAMETER_NAME3** | [****](.md)| Sorting direction. Possible values \&quot;a\&quot; - ascending, \&quot;d\&quot; - descending. Defaulted to \&quot;a\&quot; | |
| **pageId** | **String**|  | [optional] |
| **waitForSecDef** | **Boolean**|  | [optional] |

### Return type

[**List&lt;IndividualPosition&gt;**](IndividualPosition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | positions |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioAccountIdSummaryGet"></a>
# **portfolioAccountIdSummaryGet**
> PortfolioSummary portfolioAccountIdSummaryGet(accountId)

Portfolio Account Summary

Portfolio account summary

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String accountId = "DU123456"; // String | 
    try {
      PortfolioSummary result = apiInstance.portfolioAccountIdSummaryGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountIdSummaryGet");
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

[**PortfolioSummary**](PortfolioSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response with summary definitions |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioAccountidPositionConidGet"></a>
# **portfolioAccountidPositionConidGet**
> List&lt;IndividualPosition&gt; portfolioAccountidPositionConidGet(accountId, conid)

Get Position For A Given Instrument In A Single Account.

Get position for a given instrument in a single account. WaitSecDef attribute is always defaulted to false. It is possible to get position without security definition.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String accountId = "DU123456"; // String | 
    String conid = "265598"; // String | 
    try {
      List<IndividualPosition> result = apiInstance.portfolioAccountidPositionConidGet(accountId, conid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountidPositionConidGet");
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
| **conid** | **String**|  | |

### Return type

[**List&lt;IndividualPosition&gt;**](IndividualPosition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Position details by conid |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioAccountsGet"></a>
# **portfolioAccountsGet**
> List&lt;AccountAttributes&gt; portfolioAccountsGet()

Accounts

return accounts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    try {
      List<AccountAttributes> result = apiInstance.portfolioAccountsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioAccountsGet");
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

[**List&lt;AccountAttributes&gt;**](AccountAttributes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | returned array with user account |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioPositionsConidGet"></a>
# **portfolioPositionsConidGet**
> Map&lt;String, IndividualPosition&gt; portfolioPositionsConidGet(conid)

Get Positions In Accounts For A Given Instrument

Get positions in accounts for a given instrument (no secDef await control)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    String conid = "8314"; // String | 
    try {
      Map<String, IndividualPosition> result = apiInstance.portfolioPositionsConidGet(conid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioPositionsConidGet");
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
| **conid** | **String**|  | |

### Return type

[**Map&lt;String, IndividualPosition&gt;**](IndividualPosition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Object containing positions in the requested conid broken out by account. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="portfolioSubaccountsGet"></a>
# **portfolioSubaccountsGet**
> List&lt;AccountAttributes&gt; portfolioSubaccountsGet()

Get Attributes Of Subaccounts In Account Structure

Retrieve attributes of the subaccounts in the account structure.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingPortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingPortfolioApi apiInstance = new TradingPortfolioApi(defaultClient);
    try {
      List<AccountAttributes> result = apiInstance.portfolioSubaccountsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingPortfolioApi#portfolioSubaccountsGet");
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

[**List&lt;AccountAttributes&gt;**](AccountAttributes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of objects representing accounts in the structure. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

