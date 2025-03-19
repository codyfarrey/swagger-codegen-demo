# TradingFaAllocationManagementApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iserverAccountAllocationAccountsGet**](TradingFaAllocationManagementApi.md#iserverAccountAllocationAccountsGet) | **GET** /iserver/account/allocation/accounts | Allocatable Sub-Accounts |
| [**iserverAccountAllocationGroupDeletePost**](TradingFaAllocationManagementApi.md#iserverAccountAllocationGroupDeletePost) | **POST** /iserver/account/allocation/group/delete | Remove Allocation Group |
| [**iserverAccountAllocationGroupGet**](TradingFaAllocationManagementApi.md#iserverAccountAllocationGroupGet) | **GET** /iserver/account/allocation/group | List All Allocation Groups |
| [**iserverAccountAllocationGroupPost**](TradingFaAllocationManagementApi.md#iserverAccountAllocationGroupPost) | **POST** /iserver/account/allocation/group | Add Allocation Group |
| [**iserverAccountAllocationGroupPut**](TradingFaAllocationManagementApi.md#iserverAccountAllocationGroupPut) | **PUT** /iserver/account/allocation/group | Modify Allocation Group |
| [**iserverAccountAllocationGroupSinglePost**](TradingFaAllocationManagementApi.md#iserverAccountAllocationGroupSinglePost) | **POST** /iserver/account/allocation/group/single | Retrieve Single Allocation Group |
| [**iserverAccountAllocationPresetsGet**](TradingFaAllocationManagementApi.md#iserverAccountAllocationPresetsGet) | **GET** /iserver/account/allocation/presets | Retrieve Allocation Presets |
| [**iserverAccountAllocationPresetsPost**](TradingFaAllocationManagementApi.md#iserverAccountAllocationPresetsPost) | **POST** /iserver/account/allocation/presets | Set The Allocation Presets |


<a id="iserverAccountAllocationAccountsGet"></a>
# **iserverAccountAllocationAccountsGet**
> SubAccounts iserverAccountAllocationAccountsGet()

Allocatable Sub-Accounts

Retrieves a list of all sub-accounts and returns their net liquidity and available equity for advisors to make decisions on what accounts should be allocated and how.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    try {
      SubAccounts result = apiInstance.iserverAccountAllocationAccountsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationAccountsGet");
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

[**SubAccounts**](SubAccounts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates data is being returned successfully. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAllocationGroupDeletePost"></a>
# **iserverAccountAllocationGroupDeletePost**
> IserverAccountAllocationGroupPut200Response iserverAccountAllocationGroupDeletePost(iserverAccountAllocationGroupDeletePostRequest)

Remove Allocation Group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    IserverAccountAllocationGroupDeletePostRequest iserverAccountAllocationGroupDeletePostRequest = new IserverAccountAllocationGroupDeletePostRequest(); // IserverAccountAllocationGroupDeletePostRequest | 
    try {
      IserverAccountAllocationGroupPut200Response result = apiInstance.iserverAccountAllocationGroupDeletePost(iserverAccountAllocationGroupDeletePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationGroupDeletePost");
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
| **iserverAccountAllocationGroupDeletePostRequest** | [**IserverAccountAllocationGroupDeletePostRequest**](IserverAccountAllocationGroupDeletePostRequest.md)|  | |

### Return type

[**IserverAccountAllocationGroupPut200Response**](IserverAccountAllocationGroupPut200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a confirmation that the modification was successful. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAllocationGroupGet"></a>
# **iserverAccountAllocationGroupGet**
> AllocationGroups iserverAccountAllocationGroupGet()

List All Allocation Groups

Retrieves a list of all of the advisor’s allocation groups. This describes the name of the allocation group, number of subaccounts within the group, and the method in use for the group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    try {
      AllocationGroups result = apiInstance.iserverAccountAllocationGroupGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationGroupGet");
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

[**AllocationGroups**](AllocationGroups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the \&quot;data\&quot; array, which contains all allocation groups under the advisor account. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAllocationGroupPost"></a>
# **iserverAccountAllocationGroupPost**
> IserverAccountAllocationGroupPut200Response iserverAccountAllocationGroupPost(iserverAccountAllocationGroupPostRequest)

Add Allocation Group

Add a new allocation group. This group can be used to trade in place of the {accountId} for the /iserver/account/{accountId}/orders endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    IserverAccountAllocationGroupPostRequest iserverAccountAllocationGroupPostRequest = new IserverAccountAllocationGroupPostRequest(); // IserverAccountAllocationGroupPostRequest | 
    try {
      IserverAccountAllocationGroupPut200Response result = apiInstance.iserverAccountAllocationGroupPost(iserverAccountAllocationGroupPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationGroupPost");
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
| **iserverAccountAllocationGroupPostRequest** | [**IserverAccountAllocationGroupPostRequest**](IserverAccountAllocationGroupPostRequest.md)|  | |

### Return type

[**IserverAccountAllocationGroupPut200Response**](IserverAccountAllocationGroupPut200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a confirmation that the modification was successful. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAllocationGroupPut"></a>
# **iserverAccountAllocationGroupPut**
> IserverAccountAllocationGroupPut200Response iserverAccountAllocationGroupPut(iserverAccountAllocationGroupPutRequest)

Modify Allocation Group

Modify an existing allocation group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    IserverAccountAllocationGroupPutRequest iserverAccountAllocationGroupPutRequest = new IserverAccountAllocationGroupPutRequest(); // IserverAccountAllocationGroupPutRequest | 
    try {
      IserverAccountAllocationGroupPut200Response result = apiInstance.iserverAccountAllocationGroupPut(iserverAccountAllocationGroupPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationGroupPut");
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
| **iserverAccountAllocationGroupPutRequest** | [**IserverAccountAllocationGroupPutRequest**](IserverAccountAllocationGroupPutRequest.md)|  | |

### Return type

[**IserverAccountAllocationGroupPut200Response**](IserverAccountAllocationGroupPut200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a confirmation that the modification was successful. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAllocationGroupSinglePost"></a>
# **iserverAccountAllocationGroupSinglePost**
> AllocationGroup iserverAccountAllocationGroupSinglePost(iserverAccountAllocationGroupDeletePostRequest)

Retrieve Single Allocation Group

Retrieves the configuration of a single account group. This describes the name of the allocation group, the specific accounts contained in the group, and the allocation method in use along with any relevant quantities.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    IserverAccountAllocationGroupDeletePostRequest iserverAccountAllocationGroupDeletePostRequest = new IserverAccountAllocationGroupDeletePostRequest(); // IserverAccountAllocationGroupDeletePostRequest | 
    try {
      AllocationGroup result = apiInstance.iserverAccountAllocationGroupSinglePost(iserverAccountAllocationGroupDeletePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationGroupSinglePost");
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
| **iserverAccountAllocationGroupDeletePostRequest** | [**IserverAccountAllocationGroupDeletePostRequest**](IserverAccountAllocationGroupDeletePostRequest.md)|  | |

### Return type

[**AllocationGroup**](AllocationGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns details of the allocation group. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAllocationPresetsGet"></a>
# **iserverAccountAllocationPresetsGet**
> Presets iserverAccountAllocationPresetsGet()

Retrieve Allocation Presets

Retrieve the preset behavior for allocation groups for specific events.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    try {
      Presets result = apiInstance.iserverAccountAllocationPresetsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationPresetsGet");
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

[**Presets**](Presets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieve preset details |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverAccountAllocationPresetsPost"></a>
# **iserverAccountAllocationPresetsPost**
> IserverAccountAllocationPresetsPost200Response iserverAccountAllocationPresetsPost(presets)

Set The Allocation Presets

Set the preset behavior for new allocation groups for specific events.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFaAllocationManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFaAllocationManagementApi apiInstance = new TradingFaAllocationManagementApi(defaultClient);
    Presets presets = new Presets(); // Presets | 
    try {
      IserverAccountAllocationPresetsPost200Response result = apiInstance.iserverAccountAllocationPresetsPost(presets);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFaAllocationManagementApi#iserverAccountAllocationPresetsPost");
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
| **presets** | [**Presets**](Presets.md)|  | |

### Return type

[**IserverAccountAllocationPresetsPost200Response**](IserverAccountAllocationPresetsPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieve preset details |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

