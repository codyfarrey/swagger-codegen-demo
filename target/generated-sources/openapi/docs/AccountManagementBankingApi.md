# AccountManagementBankingApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gwApiV1BankInstructionsPost**](AccountManagementBankingApi.md#gwApiV1BankInstructionsPost) | **POST** /gw/api/v1/bank-instructions | Manage Bank Instructions |
| [**gwApiV1BankInstructionsQueryPost**](AccountManagementBankingApi.md#gwApiV1BankInstructionsQueryPost) | **POST** /gw/api/v1/bank-instructions/query | View Bank Instructions |
| [**gwApiV1ClientInstructionsClientInstructionIdGet**](AccountManagementBankingApi.md#gwApiV1ClientInstructionsClientInstructionIdGet) | **GET** /gw/api/v1/client-instructions/{clientInstructionId} | Get Status For ClientInstructionId |
| [**gwApiV1ExternalAssetTransfersPost**](AccountManagementBankingApi.md#gwApiV1ExternalAssetTransfersPost) | **POST** /gw/api/v1/external-asset-transfers | Transfer Positions Externally (ACATS, ATON, FOP, DWAC, Complex Asset Transfer) |
| [**gwApiV1ExternalCashTransfersPost**](AccountManagementBankingApi.md#gwApiV1ExternalCashTransfersPost) | **POST** /gw/api/v1/external-cash-transfers | Transfer Cash Externally |
| [**gwApiV1ExternalCashTransfersQueryPost**](AccountManagementBankingApi.md#gwApiV1ExternalCashTransfersQueryPost) | **POST** /gw/api/v1/external-cash-transfers/query | View Cash Balances |
| [**gwApiV1InstructionSetsInstructionSetIdGet**](AccountManagementBankingApi.md#gwApiV1InstructionSetsInstructionSetIdGet) | **GET** /gw/api/v1/instruction-sets/{instructionSetId} | Get Status For InstructionSetId |
| [**gwApiV1InstructionsCancelPost**](AccountManagementBankingApi.md#gwApiV1InstructionsCancelPost) | **POST** /gw/api/v1/instructions/cancel | Cancel Request |
| [**gwApiV1InstructionsInstructionIdGet**](AccountManagementBankingApi.md#gwApiV1InstructionsInstructionIdGet) | **GET** /gw/api/v1/instructions/{instructionId} | Get Status For InstructionId |
| [**gwApiV1InstructionsQueryPost**](AccountManagementBankingApi.md#gwApiV1InstructionsQueryPost) | **POST** /gw/api/v1/instructions/query | Get Transaction History |
| [**gwApiV1InternalAssetTransfersPost**](AccountManagementBankingApi.md#gwApiV1InternalAssetTransfersPost) | **POST** /gw/api/v1/internal-asset-transfers | Transfer Positions Internally |
| [**gwApiV1InternalCashTransfersPost**](AccountManagementBankingApi.md#gwApiV1InternalCashTransfersPost) | **POST** /gw/api/v1/internal-cash-transfers | Transfer Cash Internally |


<a id="gwApiV1BankInstructionsPost"></a>
# **gwApiV1BankInstructionsPost**
> InstructionResponse gwApiV1BankInstructionsPost(clientId, gwApiV1BankInstructionsPostRequest)

Manage Bank Instructions

Create or delete bank instructions by accountId. Only ACH and EDDA are supported for &#39;Create&#39;.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;bank-instructions.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1BankInstructionsPostRequest gwApiV1BankInstructionsPostRequest = new GwApiV1BankInstructionsPostRequest(); // GwApiV1BankInstructionsPostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1BankInstructionsPost(clientId, gwApiV1BankInstructionsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1BankInstructionsPost");
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
| **gwApiV1BankInstructionsPostRequest** | [**GwApiV1BankInstructionsPostRequest**](GwApiV1BankInstructionsPostRequest.md)|  | |

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

<a id="gwApiV1BankInstructionsQueryPost"></a>
# **gwApiV1BankInstructionsQueryPost**
> GwApiV1BankInstructionsQueryPost201Response gwApiV1BankInstructionsQueryPost(clientId, gwApiV1BankInstructionsQueryPostRequest)

View Bank Instructions

View active bank instructions for an accountId.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;bank-instructions.read&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1BankInstructionsQueryPostRequest gwApiV1BankInstructionsQueryPostRequest = new GwApiV1BankInstructionsQueryPostRequest(); // GwApiV1BankInstructionsQueryPostRequest | Create get instruction name request body
    try {
      GwApiV1BankInstructionsQueryPost201Response result = apiInstance.gwApiV1BankInstructionsQueryPost(clientId, gwApiV1BankInstructionsQueryPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1BankInstructionsQueryPost");
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
| **gwApiV1BankInstructionsQueryPostRequest** | [**GwApiV1BankInstructionsQueryPostRequest**](GwApiV1BankInstructionsQueryPostRequest.md)| Create get instruction name request body | |

### Return type

[**GwApiV1BankInstructionsQueryPost201Response**](GwApiV1BankInstructionsQueryPost201Response.md)

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

<a id="gwApiV1ClientInstructionsClientInstructionIdGet"></a>
# **gwApiV1ClientInstructionsClientInstructionIdGet**
> GwApiV1ClientInstructionsClientInstructionIdGet200Response gwApiV1ClientInstructionsClientInstructionIdGet(clientId, clientInstructionId)

Get Status For ClientInstructionId

Retrieve status of request by clientInstructionId.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;instructions.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    Integer clientInstructionId = -1988905739; // Integer | The target instruction id.
    try {
      GwApiV1ClientInstructionsClientInstructionIdGet200Response result = apiInstance.gwApiV1ClientInstructionsClientInstructionIdGet(clientId, clientInstructionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1ClientInstructionsClientInstructionIdGet");
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
| **clientInstructionId** | **Integer**| The target instruction id. | |

### Return type

[**GwApiV1ClientInstructionsClientInstructionIdGet200Response**](GwApiV1ClientInstructionsClientInstructionIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the status of an instruction. |  -  |
| **208** | Client tried to reuse the same instructionId for more than one transaction. Returning the status for the first registered transaction under given instructionId (when there were no duplicates yet). Reconsile based on instructionSetId |  -  |
| **404** | Returns a Problem detail instance representing a not found request. |  -  |
| **500** | Unable to process request due to an Internal Error. Please try again later. |  -  |

<a id="gwApiV1ExternalAssetTransfersPost"></a>
# **gwApiV1ExternalAssetTransfersPost**
> InstructionResponse gwApiV1ExternalAssetTransfersPost(clientId, gwApiV1ExternalAssetTransfersPostRequest)

Transfer Positions Externally (ACATS, ATON, FOP, DWAC, Complex Asset Transfer)

Initiate request to submit external position transfer. Methods- ACATS, ATON, Basic FOP, FOP, DWAC. More information on transfer methods can be found here - https://www.interactivebrokers.com/campus/trading-lessons/cash-and-position-transfers/&lt;br&gt;&lt;br&gt;**Scope**: &#x60;transfers.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1ExternalAssetTransfersPostRequest gwApiV1ExternalAssetTransfersPostRequest = new GwApiV1ExternalAssetTransfersPostRequest(); // GwApiV1ExternalAssetTransfersPostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1ExternalAssetTransfersPost(clientId, gwApiV1ExternalAssetTransfersPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1ExternalAssetTransfersPost");
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
| **gwApiV1ExternalAssetTransfersPostRequest** | [**GwApiV1ExternalAssetTransfersPostRequest**](GwApiV1ExternalAssetTransfersPostRequest.md)|  | |

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

<a id="gwApiV1ExternalCashTransfersPost"></a>
# **gwApiV1ExternalCashTransfersPost**
> InstructionResponse gwApiV1ExternalCashTransfersPost(clientId, gwApiV1ExternalCashTransfersPostRequest)

Transfer Cash Externally

Initiate request to deposit or withdrawal between IBKR account and bank account. More information on transfer methods can be found here - https://www.interactivebrokers.com/campus/trading-lessons/cash-and-position-transfers&lt;br&gt;&lt;br&gt;**Scope**: &#x60;transfers.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1ExternalCashTransfersPostRequest gwApiV1ExternalCashTransfersPostRequest = new GwApiV1ExternalCashTransfersPostRequest(); // GwApiV1ExternalCashTransfersPostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1ExternalCashTransfersPost(clientId, gwApiV1ExternalCashTransfersPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1ExternalCashTransfersPost");
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
| **gwApiV1ExternalCashTransfersPostRequest** | [**GwApiV1ExternalCashTransfersPostRequest**](GwApiV1ExternalCashTransfersPostRequest.md)|  | |

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

<a id="gwApiV1ExternalCashTransfersQueryPost"></a>
# **gwApiV1ExternalCashTransfersQueryPost**
> GwApiV1ExternalCashTransfersQueryPost201Response gwApiV1ExternalCashTransfersQueryPost(clientId, gwApiV1ExternalCashTransfersQueryPostRequest)

View Cash Balances

View available cash for withdrawal with and without margin loan by accountId&lt;br&gt;&lt;br&gt;**Scope**: &#x60;transfers.read&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1ExternalCashTransfersQueryPostRequest gwApiV1ExternalCashTransfersQueryPostRequest = new GwApiV1ExternalCashTransfersQueryPostRequest(); // GwApiV1ExternalCashTransfersQueryPostRequest | Create an external cash transfer query request body
    try {
      GwApiV1ExternalCashTransfersQueryPost201Response result = apiInstance.gwApiV1ExternalCashTransfersQueryPost(clientId, gwApiV1ExternalCashTransfersQueryPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1ExternalCashTransfersQueryPost");
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
| **gwApiV1ExternalCashTransfersQueryPostRequest** | [**GwApiV1ExternalCashTransfersQueryPostRequest**](GwApiV1ExternalCashTransfersQueryPostRequest.md)| Create an external cash transfer query request body | |

### Return type

[**GwApiV1ExternalCashTransfersQueryPost201Response**](GwApiV1ExternalCashTransfersQueryPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Instruction successfully created and processed synchronously |  -  |
| **202** | Accepts request to create a new instruction asynchronously |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **422** | Returns a Problem detail instance representing a business error. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1InstructionSetsInstructionSetIdGet"></a>
# **gwApiV1InstructionSetsInstructionSetIdGet**
> BulkMultiStatusResponse gwApiV1InstructionSetsInstructionSetIdGet(clientId, instructionSetId)

Get Status For InstructionSetId

Retrieve status of all requests associated with instructionSetId.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;instructions.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    Integer instructionSetId = -1988905739; // Integer | The target instruction set id.
    try {
      BulkMultiStatusResponse result = apiInstance.gwApiV1InstructionSetsInstructionSetIdGet(clientId, instructionSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1InstructionSetsInstructionSetIdGet");
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
| **instructionSetId** | **Integer**| The target instruction set id. | |

### Return type

[**BulkMultiStatusResponse**](BulkMultiStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the status multiple instructions. |  -  |
| **404** | Returns a Problem detail instance representing a not found request. |  -  |
| **500** | Unable to process request due to an Internal Error. Please try again later. |  -  |

<a id="gwApiV1InstructionsCancelPost"></a>
# **gwApiV1InstructionsCancelPost**
> InstructionResponse gwApiV1InstructionsCancelPost(clientId, gwApiV1InstructionsCancelPostRequest)

Cancel Request

Cancel request by instructionId.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;instructions.read&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1InstructionsCancelPostRequest gwApiV1InstructionsCancelPostRequest = new GwApiV1InstructionsCancelPostRequest(); // GwApiV1InstructionsCancelPostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1InstructionsCancelPost(clientId, gwApiV1InstructionsCancelPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1InstructionsCancelPost");
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
| **gwApiV1InstructionsCancelPostRequest** | [**GwApiV1InstructionsCancelPostRequest**](GwApiV1InstructionsCancelPostRequest.md)|  | |

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
| **201** | Instruction successfully created and processed synchronously |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **422** | Returns a Problem detail instance representing a business error. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1InstructionsInstructionIdGet"></a>
# **gwApiV1InstructionsInstructionIdGet**
> GwApiV1ClientInstructionsClientInstructionIdGet200Response gwApiV1InstructionsInstructionIdGet(clientId, instructionId)

Get Status For InstructionId

Retrieve status of request by instructionId&lt;br&gt;&lt;br&gt;**Scope**: &#x60;instructions.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    Integer instructionId = -1988905739; // Integer | The target instruction id.
    try {
      GwApiV1ClientInstructionsClientInstructionIdGet200Response result = apiInstance.gwApiV1InstructionsInstructionIdGet(clientId, instructionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1InstructionsInstructionIdGet");
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
| **instructionId** | **Integer**| The target instruction id. | |

### Return type

[**GwApiV1ClientInstructionsClientInstructionIdGet200Response**](GwApiV1ClientInstructionsClientInstructionIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the status of an instruction. |  -  |
| **208** | Client tried to reuse the same instructionId for more than one transaction. Returning the status for the first registered transaction under given instructionId (when there were no duplicates yet). Reconsile based on instructionSetId |  -  |
| **404** | Returns a Problem detail instance representing a not found request. |  -  |
| **500** | Unable to process request due to an Internal Error. Please try again later. |  -  |

<a id="gwApiV1InstructionsQueryPost"></a>
# **gwApiV1InstructionsQueryPost**
> InstructionResponse gwApiV1InstructionsQueryPost(clientId, gwApiV1InstructionsQueryPostRequest)

Get Transaction History

Query list of recent transactions (up to 30 days) based on accountId.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;instructions.read&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1InstructionsQueryPostRequest gwApiV1InstructionsQueryPostRequest = new GwApiV1InstructionsQueryPostRequest(); // GwApiV1InstructionsQueryPostRequest | Create recent instructions request body
    try {
      InstructionResponse result = apiInstance.gwApiV1InstructionsQueryPost(clientId, gwApiV1InstructionsQueryPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1InstructionsQueryPost");
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
| **gwApiV1InstructionsQueryPostRequest** | [**GwApiV1InstructionsQueryPostRequest**](GwApiV1InstructionsQueryPostRequest.md)| Create recent instructions request body | |

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

<a id="gwApiV1InternalAssetTransfersPost"></a>
# **gwApiV1InternalAssetTransfersPost**
> InstructionResponse gwApiV1InternalAssetTransfersPost(clientId, gwApiV1InternalAssetTransfersPostRequest)

Transfer Positions Internally

Transfer positions internally between two accounts with Interactive Brokers&lt;br&gt;&lt;br&gt;**Scope**: &#x60;transfers.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1InternalAssetTransfersPostRequest gwApiV1InternalAssetTransfersPostRequest = new GwApiV1InternalAssetTransfersPostRequest(); // GwApiV1InternalAssetTransfersPostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1InternalAssetTransfersPost(clientId, gwApiV1InternalAssetTransfersPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1InternalAssetTransfersPost");
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
| **gwApiV1InternalAssetTransfersPostRequest** | [**GwApiV1InternalAssetTransfersPostRequest**](GwApiV1InternalAssetTransfersPostRequest.md)|  | |

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

<a id="gwApiV1InternalCashTransfersPost"></a>
# **gwApiV1InternalCashTransfersPost**
> InstructionResponse gwApiV1InternalCashTransfersPost(clientId, gwApiV1InternalCashTransfersPostRequest)

Transfer Cash Internally

Transfer cash internally between two accounts with Interactive Brokers.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;transfers.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementBankingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementBankingApi apiInstance = new AccountManagementBankingApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1InternalCashTransfersPostRequest gwApiV1InternalCashTransfersPostRequest = new GwApiV1InternalCashTransfersPostRequest(); // GwApiV1InternalCashTransfersPostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1InternalCashTransfersPost(clientId, gwApiV1InternalCashTransfersPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementBankingApi#gwApiV1InternalCashTransfersPost");
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
| **gwApiV1InternalCashTransfersPostRequest** | [**GwApiV1InternalCashTransfersPostRequest**](GwApiV1InternalCashTransfersPostRequest.md)|  | |

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
| **201** | Creates a new instruction synchronously, e.g., for Internal Cash Transfer w/o dateTimeToOccur |  -  |
| **202** | Accepts request to create a new instruction asynchronously |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request |  -  |
| **422** | Returns a Problem detail instance representing a business error. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

