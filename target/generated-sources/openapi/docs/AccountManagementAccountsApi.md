# AccountManagementAccountsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gwApiV1AccountsAccountIdDetailsGet**](AccountManagementAccountsApi.md#gwApiV1AccountsAccountIdDetailsGet) | **GET** /gw/api/v1/accounts/{accountId}/details | Get Account Information |
| [**gwApiV1AccountsAccountIdKycGet**](AccountManagementAccountsApi.md#gwApiV1AccountsAccountIdKycGet) | **GET** /gw/api/v1/accounts/{accountId}/kyc | Retrieve Au10Tix URL |
| [**gwApiV1AccountsAccountIdLoginMessagesGet**](AccountManagementAccountsApi.md#gwApiV1AccountsAccountIdLoginMessagesGet) | **GET** /gw/api/v1/accounts/{accountId}/login-messages | Get Login Message By Account |
| [**gwApiV1AccountsAccountIdStatusGet**](AccountManagementAccountsApi.md#gwApiV1AccountsAccountIdStatusGet) | **GET** /gw/api/v1/accounts/{accountId}/status | Get Status By Account |
| [**gwApiV1AccountsAccountIdTasksGet**](AccountManagementAccountsApi.md#gwApiV1AccountsAccountIdTasksGet) | **GET** /gw/api/v1/accounts/{accountId}/tasks | Get Registration Tasks |
| [**gwApiV1AccountsClosePost**](AccountManagementAccountsApi.md#gwApiV1AccountsClosePost) | **POST** /gw/api/v1/accounts/close | Close Account |
| [**gwApiV1AccountsDocumentsPost**](AccountManagementAccountsApi.md#gwApiV1AccountsDocumentsPost) | **POST** /gw/api/v1/accounts/documents | Submit General Agreements And Disclosures |
| [**gwApiV1AccountsGet**](AccountManagementAccountsApi.md#gwApiV1AccountsGet) | **GET** /gw/api/v1/accounts | Retrieve Processed Application |
| [**gwApiV1AccountsLoginMessagesGet**](AccountManagementAccountsApi.md#gwApiV1AccountsLoginMessagesGet) | **GET** /gw/api/v1/accounts/login-messages | Get Login Messages |
| [**gwApiV1AccountsPatch**](AccountManagementAccountsApi.md#gwApiV1AccountsPatch) | **PATCH** /gw/api/v1/accounts | Update Account |
| [**gwApiV1AccountsPost**](AccountManagementAccountsApi.md#gwApiV1AccountsPost) | **POST** /gw/api/v1/accounts | Create Account |
| [**gwApiV1AccountsStatusGet**](AccountManagementAccountsApi.md#gwApiV1AccountsStatusGet) | **GET** /gw/api/v1/accounts/status | Get Status Of Accounts |


<a id="gwApiV1AccountsAccountIdDetailsGet"></a>
# **gwApiV1AccountsAccountIdDetailsGet**
> AccountDetailsResponse gwApiV1AccountsAccountIdDetailsGet(accountId)

Get Account Information

&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AccountDetailsResponse result = apiInstance.gwApiV1AccountsAccountIdDetailsGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsAccountIdDetailsGet");
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

[**AccountDetailsResponse**](AccountDetailsResponse.md)

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
| **200** | View information associated with account including contact data, financial information and trading configuration. |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsAccountIdKycGet"></a>
# **gwApiV1AccountsAccountIdKycGet**
> Au10TixDetailResponse gwApiV1AccountsAccountIdKycGet(accountId)

Retrieve Au10Tix URL

Generate URL address to complete real-time KYC verification using Au10Tix&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      Au10TixDetailResponse result = apiInstance.gwApiV1AccountsAccountIdKycGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsAccountIdKycGet");
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

[**Au10TixDetailResponse**](Au10TixDetailResponse.md)

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
| **200** | Generate URL address to complete real-time KYC verification using Au10Tix |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsAccountIdLoginMessagesGet"></a>
# **gwApiV1AccountsAccountIdLoginMessagesGet**
> LoginMessageResponse gwApiV1AccountsAccountIdLoginMessagesGet(accountId, type)

Get Login Message By Account

Query login messages assigned by accountId&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String type = "type_example"; // String | 
    try {
      LoginMessageResponse result = apiInstance.gwApiV1AccountsAccountIdLoginMessagesGet(accountId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsAccountIdLoginMessagesGet");
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
| **type** | **String**|  | [optional] |

### Return type

[**LoginMessageResponse**](LoginMessageResponse.md)

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
| **200** | Query login messages assigned by accountId |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsAccountIdStatusGet"></a>
# **gwApiV1AccountsAccountIdStatusGet**
> AccountStatusResponse gwApiV1AccountsAccountIdStatusGet(accountId)

Get Status By Account

Query status of account by accountId&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AccountStatusResponse result = apiInstance.gwApiV1AccountsAccountIdStatusGet(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsAccountIdStatusGet");
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

[**AccountStatusResponse**](AccountStatusResponse.md)

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
| **200** | Query status of account by accountId. |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsAccountIdTasksGet"></a>
# **gwApiV1AccountsAccountIdTasksGet**
> GwApiV1AccountsAccountIdTasksGet200Response gwApiV1AccountsAccountIdTasksGet(accountId, type)

Get Registration Tasks

Query registration tasks assigned to account and pending tasks that are required for account approval&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String type = "pending"; // String | 
    try {
      GwApiV1AccountsAccountIdTasksGet200Response result = apiInstance.gwApiV1AccountsAccountIdTasksGet(accountId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsAccountIdTasksGet");
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
| **type** | **String**|  | [optional] [default to registration] [enum: pending, registration] |

### Return type

[**GwApiV1AccountsAccountIdTasksGet200Response**](GwApiV1AccountsAccountIdTasksGet200Response.md)

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
| **200** | Query registration tasks assigned to account and pending tasks that are required for account approval |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsClosePost"></a>
# **gwApiV1AccountsClosePost**
> InstructionResponse gwApiV1AccountsClosePost(clientId, gwApiV1AccountsClosePostRequest)

Close Account

Submit request to close account that is opened.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    String clientId = "abc123"; // String | The client's clientId
    GwApiV1AccountsClosePostRequest gwApiV1AccountsClosePostRequest = new GwApiV1AccountsClosePostRequest(); // GwApiV1AccountsClosePostRequest | 
    try {
      InstructionResponse result = apiInstance.gwApiV1AccountsClosePost(clientId, gwApiV1AccountsClosePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsClosePost");
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
| **gwApiV1AccountsClosePostRequest** | [**GwApiV1AccountsClosePostRequest**](GwApiV1AccountsClosePostRequest.md)|  | |

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

<a id="gwApiV1AccountsDocumentsPost"></a>
# **gwApiV1AccountsDocumentsPost**
> StatusResponse gwApiV1AccountsDocumentsPost(processDocuments)

Submit General Agreements And Disclosures

Provides mechanism to submit Agreements and Disclosures to IBKR once a day instead of with each application. We store these documents on the servers and will use them for new application requests submitted that day.&lt;ul&gt;&lt;li&gt;Documents will need to be submitted once a day (before the Applications are submitted). PDFs will be displayed and submitted as is- no changes/edits will be made to the actual PDF files.&lt;/li&gt;&lt;li&gt;This end-point will not process any Tax Form Documents. Tax Form document should be submitted with every application&lt;/li&gt;&lt;li&gt;If submitted in the morning, you only need to include the Tax Form attachment for each applicant. Otherwise, you will need to include PDFs with each application (Create Account).&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    ProcessDocuments processDocuments = new ProcessDocuments(); // ProcessDocuments | 
    try {
      StatusResponse result = apiInstance.gwApiV1AccountsDocumentsPost(processDocuments);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsDocumentsPost");
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
| **processDocuments** | [**ProcessDocuments**](ProcessDocuments.md)|  | |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jwt
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Submit standard agreements and disclosures |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsGet"></a>
# **gwApiV1AccountsGet**
> GwApiV1AccountsGet200Response gwApiV1AccountsGet(accountId, externalId)

Retrieve Processed Application

Retrieve the application request and IBKR response data based on IBKR accountId or externalId. Only available for accounts that originate via API&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String externalId = "externalId_example"; // String | 
    try {
      GwApiV1AccountsGet200Response result = apiInstance.gwApiV1AccountsGet(accountId, externalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsGet");
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
| **accountId** | **String**|  | [optional] |
| **externalId** | **String**|  | [optional] |

### Return type

[**GwApiV1AccountsGet200Response**](GwApiV1AccountsGet200Response.md)

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
| **200** | Retrieve the application request and IBKR response data based on IBKR accountId or externalId. Only available for accounts that originate via API |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsLoginMessagesGet"></a>
# **gwApiV1AccountsLoginMessagesGet**
> LoginMessageResponse gwApiV1AccountsLoginMessagesGet(loginMessageRequest)

Get Login Messages

Query all accounts associated with ‘Client ID’ that have incomplete login message&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    LoginMessageRequest loginMessageRequest = new LoginMessageRequest(); // LoginMessageRequest | 
    try {
      LoginMessageResponse result = apiInstance.gwApiV1AccountsLoginMessagesGet(loginMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsLoginMessagesGet");
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
| **loginMessageRequest** | [**LoginMessageRequest**](.md)|  | |

### Return type

[**LoginMessageResponse**](LoginMessageResponse.md)

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
| **200** | Query all accounts associated with ‘Client ID’ that have incomplete login message |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsPatch"></a>
# **gwApiV1AccountsPatch**
> StatusResponse gwApiV1AccountsPatch(accountManagementRequestsPayload)

Update Account

Update information for an existing accountId&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    AccountManagementRequestsPayload accountManagementRequestsPayload = new AccountManagementRequestsPayload(); // AccountManagementRequestsPayload | 
    try {
      StatusResponse result = apiInstance.gwApiV1AccountsPatch(accountManagementRequestsPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsPatch");
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
| **accountManagementRequestsPayload** | [**AccountManagementRequestsPayload**](AccountManagementRequestsPayload.md)|  | |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jwt
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Update information for an existing accountId |  -  |
| **202** | Initiate update information for an existing accountId. |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsPost"></a>
# **gwApiV1AccountsPost**
> StatusResponse gwApiV1AccountsPost(applicationPayload)

Create Account

Submit account application. This will create brokerage account for the end user.&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    ApplicationPayload applicationPayload = new ApplicationPayload(); // ApplicationPayload | 
    try {
      StatusResponse result = apiInstance.gwApiV1AccountsPost(applicationPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsPost");
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
| **applicationPayload** | [**ApplicationPayload**](ApplicationPayload.md)|  | |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jwt
 - **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Returns error description representing access issue |  -  |
| **500** | Returns error description representing internal server error |  -  |
| **400** | Returns error description representing bad request |  -  |
| **200** | Submit account application. This will create brokerage account for the end user. |  -  |
| **202** | Submit account application. This will initiate creation of brokerage account for the end user. |  -  |
| **401** | Returns error description representing access issue |  -  |

<a id="gwApiV1AccountsStatusGet"></a>
# **gwApiV1AccountsStatusGet**
> AccountStatusBulkResponse gwApiV1AccountsStatusGet(accountStatusRequest)

Get Status Of Accounts

Query status of all accounts associated with ‘Client ID&#39;&lt;br&gt;&lt;br&gt;**Scope**: &#x60;accounts.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementAccountsApi apiInstance = new AccountManagementAccountsApi(defaultClient);
    AccountStatusRequest accountStatusRequest = new AccountStatusRequest(); // AccountStatusRequest | 
    try {
      AccountStatusBulkResponse result = apiInstance.gwApiV1AccountsStatusGet(accountStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementAccountsApi#gwApiV1AccountsStatusGet");
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
| **accountStatusRequest** | [**AccountStatusRequest**](.md)|  | |

### Return type

[**AccountStatusBulkResponse**](AccountStatusBulkResponse.md)

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
| **200** | Query status of all accounts associated with ‘Client ID&#39; |  -  |
| **401** | Returns error description representing access issue |  -  |

