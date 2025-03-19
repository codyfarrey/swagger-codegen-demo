# AccountManagementUtilitiesApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gwApiV1EnumerationsComplexAssetTransferGet**](AccountManagementUtilitiesApi.md#gwApiV1EnumerationsComplexAssetTransferGet) | **GET** /gw/api/v1/enumerations/complex-asset-transfer | Get A List Of Participating Brokers For The Given Asset Type |
| [**gwApiV1EnumerationsEnumerationTypeGet**](AccountManagementUtilitiesApi.md#gwApiV1EnumerationsEnumerationTypeGet) | **GET** /gw/api/v1/enumerations/{enumerationType} | Get Enumerations For Trading Permission, Employment Detail, Affiliation Detail, Financial Range Information, ACATS And So On |
| [**gwApiV1FeeTemplatesPost**](AccountManagementUtilitiesApi.md#gwApiV1FeeTemplatesPost) | **POST** /gw/api/v1/fee-templates | Set Fees For Account |
| [**gwApiV1FeeTemplatesQueryPost**](AccountManagementUtilitiesApi.md#gwApiV1FeeTemplatesQueryPost) | **POST** /gw/api/v1/fee-templates/query | View Fee Template For Account |
| [**gwApiV1FormsGet**](AccountManagementUtilitiesApi.md#gwApiV1FormsGet) | **GET** /gw/api/v1/forms | Get Forms |
| [**gwApiV1ParticipatingBanksGet**](AccountManagementUtilitiesApi.md#gwApiV1ParticipatingBanksGet) | **GET** /gw/api/v1/participating-banks | Get Participating Banks |
| [**gwApiV1RequestsGet**](AccountManagementUtilitiesApi.md#gwApiV1RequestsGet) | **GET** /gw/api/v1/requests | Get Requests&#39; Details By Timeframe |
| [**gwApiV1RequestsRequestIdStatusGet**](AccountManagementUtilitiesApi.md#gwApiV1RequestsRequestIdStatusGet) | **GET** /gw/api/v1/requests/{requestId}/status | Get Status Of A Request |
| [**gwApiV1ValidationsUsernamesUsernameGet**](AccountManagementUtilitiesApi.md#gwApiV1ValidationsUsernamesUsernameGet) | **GET** /gw/api/v1/validations/usernames/{username} | Verify User Availability |


<a id="gwApiV1EnumerationsComplexAssetTransferGet"></a>
# **gwApiV1EnumerationsComplexAssetTransferGet**
> GetBrokerListResponse gwApiV1EnumerationsComplexAssetTransferGet(clientId, instructionType)

Get A List Of Participating Brokers For The Given Asset Type

Get list of brokers supported for given asset transfer type&lt;br&gt;&lt;br&gt;**Scope**: &#x60;enumerations.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    Object instructionType = COMPLEX_ASSET_TRANSFER; // Object | Asset transfer type to get the list of supported brokers
    try {
      GetBrokerListResponse result = apiInstance.gwApiV1EnumerationsComplexAssetTransferGet(clientId, instructionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1EnumerationsComplexAssetTransferGet");
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
| **clientId** | **String**| The client&#39;s clientId | |
| **instructionType** | [**Object**](.md)| Asset transfer type to get the list of supported brokers | |

### Return type

[**GetBrokerListResponse**](GetBrokerListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns list of brokers supported for given asset type |  -  |
| **400** | Returns a Problem detail instance representing a not found request. |  -  |
| **500** | Unable to process request due to an Internal Error. Please try again later. |  -  |

<a id="gwApiV1EnumerationsEnumerationTypeGet"></a>
# **gwApiV1EnumerationsEnumerationTypeGet**
> EnumerationResponse gwApiV1EnumerationsEnumerationTypeGet(type, currency, ibEntity, mdStatusNonPro, formNumber, language)

Get Enumerations For Trading Permission, Employment Detail, Affiliation Detail, Financial Range Information, ACATS And So On

Get enumerations&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60; OR &#x60;enumerations.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    String type = "type_example"; // String | 
    String currency = "currency_example"; // String | 
    String ibEntity = "ibEntity_example"; // String | 
    String mdStatusNonPro = "mdStatusNonPro_example"; // String | 
    String formNumber = "formNumber_example"; // String | 
    String language = "en"; // String | 
    try {
      EnumerationResponse result = apiInstance.gwApiV1EnumerationsEnumerationTypeGet(type, currency, ibEntity, mdStatusNonPro, formNumber, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1EnumerationsEnumerationTypeGet");
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
| **type** | **String**|  | |
| **currency** | **String**|  | [optional] |
| **ibEntity** | **String**|  | [optional] |
| **mdStatusNonPro** | **String**|  | [optional] |
| **formNumber** | **String**|  | [optional] |
| **language** | **String**|  | [optional] [enum: en, ar, de, es, fr, he, hu, it, ja, nl, pt, ru, zh_CN, zh_TW] |

### Return type

[**EnumerationResponse**](EnumerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Get enumerations |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1FeeTemplatesPost"></a>
# **gwApiV1FeeTemplatesPost**
> InstructionResponse gwApiV1FeeTemplatesPost(clientId, gwApiV1FeeTemplatesPostRequest)

Set Fees For Account

Apply predefined fee template to existing account.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;fee-templates.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1FeeTemplatesPostRequest gwApiV1FeeTemplatesPostRequest = new GwApiV1FeeTemplatesPostRequest(); // GwApiV1FeeTemplatesPostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1FeeTemplatesPost(clientId, gwApiV1FeeTemplatesPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1FeeTemplatesPost");
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
| **clientId** | **String**| The client&#39;s clientId | |
| **gwApiV1FeeTemplatesPostRequest** | [**GwApiV1FeeTemplatesPostRequest**](GwApiV1FeeTemplatesPostRequest.md)|  | |

### Return type

[**InstructionResponse**](InstructionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepts request to create a new instruction asynchronously |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **422** | Returns a Problem detail instance representing a business error. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1FeeTemplatesQueryPost"></a>
# **gwApiV1FeeTemplatesQueryPost**
> QueryFeeTemplateResult gwApiV1FeeTemplatesQueryPost(clientId, gwApiV1FeeTemplatesQueryPostRequest)

View Fee Template For Account

View fee template applied to an existing account.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;fee-templates.read&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1FeeTemplatesQueryPostRequest gwApiV1FeeTemplatesQueryPostRequest = new GwApiV1FeeTemplatesQueryPostRequest(); // GwApiV1FeeTemplatesQueryPostRequest | Create fee template request body
    try {
      QueryFeeTemplateResult result = apiInstance.gwApiV1FeeTemplatesQueryPost(clientId, gwApiV1FeeTemplatesQueryPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1FeeTemplatesQueryPost");
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
| **clientId** | **String**| The client&#39;s clientId | |
| **gwApiV1FeeTemplatesQueryPostRequest** | [**GwApiV1FeeTemplatesQueryPostRequest**](GwApiV1FeeTemplatesQueryPostRequest.md)| Create fee template request body | |

### Return type

[**QueryFeeTemplateResult**](QueryFeeTemplateResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Instruction successfully created and processed synchronously |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **422** | Returns a Problem detail instance representing a business error. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1FormsGet"></a>
# **gwApiV1FormsGet**
> FormFileResponse gwApiV1FormsGet(formNo, getDocs, fromDate, toDate, language, projection)

Get Forms

Get forms&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60; OR &#x60;forms.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    List<Integer> formNo = Arrays.asList(); // List<Integer> | 
    String getDocs = "getDocs_example"; // String | 
    String fromDate = "fromDate_example"; // String | 
    String toDate = "toDate_example"; // String | 
    String language = "language_example"; // String | 
    String projection = "PAYLOAD"; // String | 
    try {
      FormFileResponse result = apiInstance.gwApiV1FormsGet(formNo, getDocs, fromDate, toDate, language, projection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1FormsGet");
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
| **formNo** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **getDocs** | **String**|  | [optional] |
| **fromDate** | **String**|  | [optional] |
| **toDate** | **String**|  | [optional] |
| **language** | **String**|  | [optional] |
| **projection** | **String**|  | [optional] [default to NONE] [enum: PAYLOAD, DOCS, NONE] |

### Return type

[**FormFileResponse**](FormFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Get forms |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1ParticipatingBanksGet"></a>
# **gwApiV1ParticipatingBanksGet**
> GetParticipatingListResponse gwApiV1ParticipatingBanksGet(clientId, type)

Get Participating Banks

Get list of banks which support banking connection with Interactive Brokers.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;enumerations.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    String type = "eDDA"; // String | Parameter for which the list of participating banks is fetched
    try {
      GetParticipatingListResponse result = apiInstance.gwApiV1ParticipatingBanksGet(clientId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1ParticipatingBanksGet");
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
| **clientId** | **String**| The client&#39;s clientId | |
| **type** | **String**| Parameter for which the list of participating banks is fetched | |

### Return type

[**GetParticipatingListResponse**](GetParticipatingListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of participating banks. |  -  |
| **400** | Returns a Problem detail instance representing a not found request. |  -  |
| **500** | Unable to process request due to an Internal Error. Please try again later. |  -  |

<a id="gwApiV1RequestsGet"></a>
# **gwApiV1RequestsGet**
> RequestDetailsResponse gwApiV1RequestsGet(requestDetails)

Get Requests&#39; Details By Timeframe

Fetch Requests&#39; Details By Timeframe&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    RequestDetailsRequest requestDetails = new RequestDetailsRequest(); // RequestDetailsRequest | 
    try {
      RequestDetailsResponse result = apiInstance.gwApiV1RequestsGet(requestDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1RequestsGet");
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
| **requestDetails** | [**RequestDetailsRequest**](.md)|  | |

### Return type

[**RequestDetailsResponse**](RequestDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Fetch Requests&#39; Details By Timeframe |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1RequestsRequestIdStatusGet"></a>
# **gwApiV1RequestsRequestIdStatusGet**
> GwApiV1RequestsRequestIdStatusGet200Response gwApiV1RequestsRequestIdStatusGet(requestId, type)

Get Status Of A Request

Returns status for account management request&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    Integer requestId = 56; // Integer | 
    String type = "response"; // String | 
    try {
      GwApiV1RequestsRequestIdStatusGet200Response result = apiInstance.gwApiV1RequestsRequestIdStatusGet(requestId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1RequestsRequestIdStatusGet");
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
| **requestId** | **Integer**|  | |
| **type** | **String**|  | [enum: response, update] |

### Return type

[**GwApiV1RequestsRequestIdStatusGet200Response**](GwApiV1RequestsRequestIdStatusGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Returns status for account management request |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1ValidationsUsernamesUsernameGet"></a>
# **gwApiV1ValidationsUsernamesUsernameGet**
> UserNameAvailableResponse gwApiV1ValidationsUsernamesUsernameGet(username)

Verify User Availability

Verify whether user is valid and available&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60; OR &#x60;validations.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementUtilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementUtilitiesApi apiInstance = new AccountManagementUtilitiesApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      UserNameAvailableResponse result = apiInstance.gwApiV1ValidationsUsernamesUsernameGet(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementUtilitiesApi#gwApiV1ValidationsUsernamesUsernameGet");
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
| **username** | **String**|  | |

### Return type

[**UserNameAvailableResponse**](UserNameAvailableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Verify whether user is valid and available |  -  |
| **401** | Returns error description representing access issue |  -  |

