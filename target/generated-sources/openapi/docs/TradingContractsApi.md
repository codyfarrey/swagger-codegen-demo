# TradingContractsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iserverContractConidAlgosGet**](TradingContractsApi.md#iserverContractConidAlgosGet) | **GET** /iserver/contract/{conid}/algos | Search Algo Params By Contract ID |
| [**iserverContractConidInfoAndRulesGet**](TradingContractsApi.md#iserverContractConidInfoAndRulesGet) | **GET** /iserver/contract/{conid}/info-and-rules | Contract Information And Rules By Contract ID |
| [**iserverContractConidInfoGet**](TradingContractsApi.md#iserverContractConidInfoGet) | **GET** /iserver/contract/{conid}/info | Contract Information By Contract ID |
| [**iserverContractRulesPost**](TradingContractsApi.md#iserverContractRulesPost) | **POST** /iserver/contract/rules | Search Contract Rules |
| [**iserverCurrencyPairsGet**](TradingContractsApi.md#iserverCurrencyPairsGet) | **GET** /iserver/currency/pairs |  |
| [**iserverExchangerateGet**](TradingContractsApi.md#iserverExchangerateGet) | **GET** /iserver/exchangerate | Currency Exchange Rate |
| [**iserverSecdefBondFiltersGet**](TradingContractsApi.md#iserverSecdefBondFiltersGet) | **GET** /iserver/secdef/bond-filters | Search Bond Filter Information |
| [**iserverSecdefInfoGet**](TradingContractsApi.md#iserverSecdefInfoGet) | **GET** /iserver/secdef/info | SecDef Info |
| [**iserverSecdefSearchGet**](TradingContractsApi.md#iserverSecdefSearchGet) | **GET** /iserver/secdef/search | Returns A List Of Contracts Based On Symbol. |
| [**iserverSecdefSearchPost**](TradingContractsApi.md#iserverSecdefSearchPost) | **POST** /iserver/secdef/search | Returns A List Of Contracts Based On Symbol. |
| [**iserverSecdefStrikesGet**](TradingContractsApi.md#iserverSecdefStrikesGet) | **GET** /iserver/secdef/strikes | Get Strikes |
| [**trsrvAllConidsGet**](TradingContractsApi.md#trsrvAllConidsGet) | **GET** /trsrv/all-conids | All Conids By Exchange |
| [**trsrvFuturesGet**](TradingContractsApi.md#trsrvFuturesGet) | **GET** /trsrv/futures | Future  Security Definition By Symbol |
| [**trsrvSecdefGet**](TradingContractsApi.md#trsrvSecdefGet) | **GET** /trsrv/secdef | Search The Security Definition By Contract ID |
| [**trsrvSecdefScheduleGet**](TradingContractsApi.md#trsrvSecdefScheduleGet) | **GET** /trsrv/secdef/schedule | Trading Schedule By Symbol |
| [**trsrvStocksGet**](TradingContractsApi.md#trsrvStocksGet) | **GET** /trsrv/stocks | Stock Security Definition By Symbol |


<a id="iserverContractConidAlgosGet"></a>
# **iserverContractConidAlgosGet**
> AlgosResponse iserverContractConidAlgosGet(conid, algos, addDescription, addParams)

Search Algo Params By Contract ID

Returns supported IB Algos for contract. A pre-flight request must be submitted before retrieving information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String conid = "conid_example"; // String | 
    String algos = "Adaptive"; // String | 
    String addDescription = "0"; // String | 
    String addParams = "0"; // String | 
    try {
      AlgosResponse result = apiInstance.iserverContractConidAlgosGet(conid, algos, addDescription, addParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverContractConidAlgosGet");
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
| **algos** | **String**|  | [optional] [enum: Adaptive, Vwap] |
| **addDescription** | **String**|  | [optional] [default to 0] |
| **addParams** | **String**|  | [optional] [default to 0] |

### Return type

[**AlgosResponse**](AlgosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of available algos and a description of their behavior. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverContractConidInfoAndRulesGet"></a>
# **iserverContractConidInfoAndRulesGet**
> IserverContractConidInfoAndRulesGet200Response iserverContractConidInfoAndRulesGet(conid)

Contract Information And Rules By Contract ID

Requests full contract details for the given conid.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String conid = "265598"; // String | 
    try {
      IserverContractConidInfoAndRulesGet200Response result = apiInstance.iserverContractConidInfoAndRulesGet(conid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverContractConidInfoAndRulesGet");
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

[**IserverContractConidInfoAndRulesGet200Response**](IserverContractConidInfoAndRulesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of available algos and a description of their behavior. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverContractConidInfoGet"></a>
# **iserverContractConidInfoGet**
> ContractInfo iserverContractConidInfoGet(conid)

Contract Information By Contract ID

Requests full contract details for the given conid.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String conid = "265598"; // String | 
    try {
      ContractInfo result = apiInstance.iserverContractConidInfoGet(conid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverContractConidInfoGet");
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

[**ContractInfo**](ContractInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of available algos and a description of their behavior. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverContractRulesPost"></a>
# **iserverContractRulesPost**
> ContractRules iserverContractRulesPost(iserverContractRulesPostRequest)

Search Contract Rules

Returns trading related rules for a specific contract and side.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    IserverContractRulesPostRequest iserverContractRulesPostRequest = new IserverContractRulesPostRequest(); // IserverContractRulesPostRequest | 
    try {
      ContractRules result = apiInstance.iserverContractRulesPost(iserverContractRulesPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverContractRulesPost");
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
| **iserverContractRulesPostRequest** | [**IserverContractRulesPostRequest**](IserverContractRulesPostRequest.md)|  | |

### Return type

[**ContractRules**](ContractRules.md)

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

<a id="iserverCurrencyPairsGet"></a>
# **iserverCurrencyPairsGet**
> Map&lt;String, List&lt;CurrencyPairsValueInner&gt;&gt; iserverCurrencyPairsGet(currency)



Obtains available currency pairs corresponding to the given target currency.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String currency = "USD"; // String | 
    try {
      Map<String, List<CurrencyPairsValueInner>> result = apiInstance.iserverCurrencyPairsGet(currency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverCurrencyPairsGet");
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
| **currency** | **String**|  | |

### Return type

[**Map&lt;String, List&lt;CurrencyPairsValueInner&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of valid forex pairs for the given currency. The currency can apply as both the target or base currency. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverExchangerateGet"></a>
# **iserverExchangerateGet**
> IserverExchangerateGet200Response iserverExchangerateGet(target, source)

Currency Exchange Rate

Obtains the exchange rates of the currency pair.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String target = "EUR"; // String | 
    String source = "USD"; // String | 
    try {
      IserverExchangerateGet200Response result = apiInstance.iserverExchangerateGet(target, source);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverExchangerateGet");
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
| **target** | **String**|  | |
| **source** | **String**|  | |

### Return type

[**IserverExchangerateGet200Response**](IserverExchangerateGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful requests return the currency exchange rate of the target currency value divided by the source currency. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverSecdefBondFiltersGet"></a>
# **iserverSecdefBondFiltersGet**
> BondFiltersResponse iserverSecdefBondFiltersGet(symbol, issueId)

Search Bond Filter Information

Request a list of filters relating to a given Bond issuerID. The issuerId is retrieved from /iserver/secdef/search and can be used in /iserver/secdef/info?issuerId&#x3D;{issuerId} for retrieving conIds.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String symbol = "BOND"; // String | 
    String issueId = "e1400715"; // String | 
    try {
      BondFiltersResponse result = apiInstance.iserverSecdefBondFiltersGet(symbol, issueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverSecdefBondFiltersGet");
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
| **symbol** | **String**|  | |
| **issueId** | **String**|  | |

### Return type

[**BondFiltersResponse**](BondFiltersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful requests return the currency exchange rate of the target currency value divided by the source currency. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverSecdefInfoGet"></a>
# **iserverSecdefInfoGet**
> SecDefInfoResponse iserverSecdefInfoGet(conid, sectype, month, exchange, strike, right, issuerId, filters)

SecDef Info

SecDef info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String conid = "265598"; // String | 
    Object sectype = null; // Object | 
    Object month = null; // Object | 
    Object exchange = null; // Object | 
    Object strike = null; // Object | 
    String right = "C"; // String | 
    String issuerId = "“e1234567”"; // String | 
    Object filters = null; // Object | 
    try {
      SecDefInfoResponse result = apiInstance.iserverSecdefInfoGet(conid, sectype, month, exchange, strike, right, issuerId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverSecdefInfoGet");
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
| **conid** | **String**|  | [optional] |
| **sectype** | [**Object**](.md)|  | [optional] |
| **month** | [**Object**](.md)|  | [optional] |
| **exchange** | [**Object**](.md)|  | [optional] |
| **strike** | [**Object**](.md)|  | [optional] |
| **right** | **String**|  | [optional] [enum: C, P] |
| **issuerId** | **String**|  | [optional] |
| **filters** | [**Object**](.md)|  | [optional] |

### Return type

[**SecDefInfoResponse**](SecDefInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing a contract&#39;s security definition. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="iserverSecdefSearchGet"></a>
# **iserverSecdefSearchGet**
> List&lt;SecdefSearchResponseInner&gt; iserverSecdefSearchGet(symbol, secType, name, more, fund, fundFamilyConidEx, pattern, referrer)

Returns A List Of Contracts Based On Symbol.

Returns a list of contracts based on the search symbol provided as a query param.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String symbol = "AAPL"; // String | 
    String secType = "STK"; // String | Available underlying security types:   * `STK` - Represents an underlying as a Stock security type.   * `IND` - Represents an underlying as an Index security type.   * `BOND` - Represents an underlying as a Bond security type. 
    Boolean name = true; // Boolean | 
    Boolean more = true; // Boolean | 
    Boolean fund = true; // Boolean | 
    String fundFamilyConidEx = "fundFamilyConidEx_example"; // String | 
    Boolean pattern = true; // Boolean | 
    String referrer = "referrer_example"; // String | 
    try {
      List<SecdefSearchResponseInner> result = apiInstance.iserverSecdefSearchGet(symbol, secType, name, more, fund, fundFamilyConidEx, pattern, referrer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverSecdefSearchGet");
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
| **symbol** | **String**|  | [optional] |
| **secType** | **String**| Available underlying security types:   * &#x60;STK&#x60; - Represents an underlying as a Stock security type.   * &#x60;IND&#x60; - Represents an underlying as an Index security type.   * &#x60;BOND&#x60; - Represents an underlying as a Bond security type.  | [optional] [default to STK] [enum: STK, IND, BOND] |
| **name** | **Boolean**|  | [optional] |
| **more** | **Boolean**|  | [optional] |
| **fund** | **Boolean**|  | [optional] |
| **fundFamilyConidEx** | **String**|  | [optional] |
| **pattern** | **Boolean**|  | [optional] |
| **referrer** | **String**|  | [optional] |

### Return type

[**List&lt;SecdefSearchResponseInner&gt;**](SecdefSearchResponseInner.md)

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

<a id="iserverSecdefSearchPost"></a>
# **iserverSecdefSearchPost**
> List&lt;SecdefSearchResponseInner&gt; iserverSecdefSearchPost(iserverSecdefSearchPostRequest)

Returns A List Of Contracts Based On Symbol.

Returns a list of contracts based on the search symbol provided as a query param.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    IserverSecdefSearchPostRequest iserverSecdefSearchPostRequest = new IserverSecdefSearchPostRequest(); // IserverSecdefSearchPostRequest | 
    try {
      List<SecdefSearchResponseInner> result = apiInstance.iserverSecdefSearchPost(iserverSecdefSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverSecdefSearchPost");
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
| **iserverSecdefSearchPostRequest** | [**IserverSecdefSearchPostRequest**](IserverSecdefSearchPostRequest.md)|  | |

### Return type

[**List&lt;SecdefSearchResponseInner&gt;**](SecdefSearchResponseInner.md)

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

<a id="iserverSecdefStrikesGet"></a>
# **iserverSecdefStrikesGet**
> IserverSecdefStrikesGet200Response iserverSecdefStrikesGet(conid, sectype, month, exchange)

Get Strikes

strikes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String conid = "265598"; // String | 
    String sectype = "OPT"; // String | 
    String month = "JAN24"; // String | 
    String exchange = "SMART"; // String | 
    try {
      IserverSecdefStrikesGet200Response result = apiInstance.iserverSecdefStrikesGet(conid, sectype, month, exchange);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#iserverSecdefStrikesGet");
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
| **sectype** | **String**|  | |
| **month** | **String**|  | |
| **exchange** | **String**|  | [optional] [default to SMART] |

### Return type

[**IserverSecdefStrikesGet200Response**](IserverSecdefStrikesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing a contract&#39;s security definition. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="trsrvAllConidsGet"></a>
# **trsrvAllConidsGet**
> List&lt;TrsrvAllConidsGet200ResponseInner&gt; trsrvAllConidsGet(exchange, assetClass)

All Conids By Exchange

Send out a request to retrieve all contracts made available on a requested exchange. This returns all contracts that are tradable on the exchange, even those that are not using the exchange as their primary listing.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String exchange = "AMEX"; // String | 
    Object assetClass = STK; // Object | 
    try {
      List<TrsrvAllConidsGet200ResponseInner> result = apiInstance.trsrvAllConidsGet(exchange, assetClass);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#trsrvAllConidsGet");
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
| **exchange** | **String**|  | |
| **assetClass** | [**Object**](.md)|  | [optional] [default to STK] |

### Return type

[**List&lt;TrsrvAllConidsGet200ResponseInner&gt;**](TrsrvAllConidsGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing a contract&#39;s security definition. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="trsrvFuturesGet"></a>
# **trsrvFuturesGet**
> Features trsrvFuturesGet(symbols, exchange)

Future  Security Definition By Symbol

Returns a list of non-expired future contracts for given symbol(s)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String symbols = "ES,MES"; // String | 
    Object exchange = null; // Object | 
    try {
      Features result = apiInstance.trsrvFuturesGet(symbols, exchange);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#trsrvFuturesGet");
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
| **symbols** | **String**|  | |
| **exchange** | [**Object**](.md)|  | [optional] |

### Return type

[**Features**](Features.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing a contract&#39;s security definition. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="trsrvSecdefGet"></a>
# **trsrvSecdefGet**
> TrsrvSecDefResponse trsrvSecdefGet(conids, UNKNOWN_PARAMETER_NAME, UNKNOWN_PARAMETER_NAME2)

Search The Security Definition By Contract ID

Returns a list of security definitions for the given conids.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String conids = "265598,8314"; // String | 
     UNKNOWN_PARAMETER_NAME = new null(); //  | 
     UNKNOWN_PARAMETER_NAME2 = new null(); //  | 
    try {
      TrsrvSecDefResponse result = apiInstance.trsrvSecdefGet(conids, UNKNOWN_PARAMETER_NAME, UNKNOWN_PARAMETER_NAME2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#trsrvSecdefGet");
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
| **UNKNOWN_PARAMETER_NAME** | [****](.md)|  | [optional] |
| **UNKNOWN_PARAMETER_NAME2** | [****](.md)|  | [optional] |

### Return type

[**TrsrvSecDefResponse**](TrsrvSecDefResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing a contract&#39;s security definition. |  -  |
| **204** | no content |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="trsrvSecdefScheduleGet"></a>
# **trsrvSecdefScheduleGet**
> List&lt;TradingScheduleInner&gt; trsrvSecdefScheduleGet(assetClass, symbol, exchange, exchangeFilter)

Trading Schedule By Symbol

Returns the trading schedule up to a month for the requested contract.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String assetClass = "STK"; // String | 
    String symbol = "AAPL"; // String | 
    String exchange = "NASDAQ"; // String | 
    String exchangeFilter = "AMEX,NASDAQ,NYSE"; // String | 
    try {
      List<TradingScheduleInner> result = apiInstance.trsrvSecdefScheduleGet(assetClass, symbol, exchange, exchangeFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#trsrvSecdefScheduleGet");
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
| **assetClass** | **String**|  | [enum: STK, OPT, FUT, CFD, WAR, SWP, FND, BND, ICS] |
| **symbol** | **String**|  | |
| **exchange** | **String**|  | [optional] |
| **exchangeFilter** | **String**|  | [optional] |

### Return type

[**List&lt;TradingScheduleInner&gt;**](TradingScheduleInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the trading schedule up to a month for the requested contract. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="trsrvStocksGet"></a>
# **trsrvStocksGet**
> Map&lt;String, List&lt;StocksValueInner&gt;&gt; trsrvStocksGet(symbols)

Stock Security Definition By Symbol

Returns an object contains all stock contracts for given symbol(s)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingContractsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingContractsApi apiInstance = new TradingContractsApi(defaultClient);
    String symbols = "AAPL,IBKR"; // String | 
    try {
      Map<String, List<StocksValueInner>> result = apiInstance.trsrvStocksGet(symbols);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingContractsApi#trsrvStocksGet");
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
| **symbols** | **String**|  | |

### Return type

[**Map&lt;String, List&lt;StocksValueInner&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing a contract&#39;s security definition. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

