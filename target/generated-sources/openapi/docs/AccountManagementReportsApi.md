# AccountManagementReportsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gwApiV1StatementsAvailableGet**](AccountManagementReportsApi.md#gwApiV1StatementsAvailableGet) | **GET** /gw/api/v1/statements/available | Fetch Available Daily, Monthly, And Annual Report Dates For An Account Id |
| [**gwApiV1StatementsPost**](AccountManagementReportsApi.md#gwApiV1StatementsPost) | **POST** /gw/api/v1/statements | Generates Statements In Supported Formats Based On Request Parameters. |
| [**gwApiV1TaxDocumentsAvailableGet**](AccountManagementReportsApi.md#gwApiV1TaxDocumentsAvailableGet) | **GET** /gw/api/v1/tax-documents/available | Fetch List Of Available Tax Reports/forms/documents For A Specified Account And Tax Year |
| [**gwApiV1TaxDocumentsPost**](AccountManagementReportsApi.md#gwApiV1TaxDocumentsPost) | **POST** /gw/api/v1/tax-documents | Fetch Tax Forms In Supported Formats Based On Request Parameters. |


<a id="gwApiV1StatementsAvailableGet"></a>
# **gwApiV1StatementsAvailableGet**
> GetAvailableStmtDatesResponse gwApiV1StatementsAvailableGet(authorization, accountId)

Fetch Available Daily, Monthly, And Annual Report Dates For An Account Id

&lt;br&gt;**Scope**: &#x60;statements.read&#x60; OR &#x60;reports.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementReportsApi apiInstance = new AccountManagementReportsApi(defaultClient);
    String authorization = "Bearer eyJ0eXAiOiJKV1..."; // String | Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...).
    String accountId = "UXXXX"; // String | Specifies the account id to retrieve information
    try {
      GetAvailableStmtDatesResponse result = apiInstance.gwApiV1StatementsAvailableGet(authorization, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementReportsApi#gwApiV1StatementsAvailableGet");
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
| **authorization** | **String**| Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...). | |
| **accountId** | **String**| Specifies the account id to retrieve information | |

### Return type

[**GetAvailableStmtDatesResponse**](GetAvailableStmtDatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a JSON object containing the available report dates. |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **402** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1StatementsPost"></a>
# **gwApiV1StatementsPost**
> GetStatementsResponse gwApiV1StatementsPost(authorization, stmtRequest)

Generates Statements In Supported Formats Based On Request Parameters.

&lt;br&gt;**Scope**: &#x60;statements.read&#x60; OR &#x60;statements.write&#x60; OR &#x60;reports.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementReportsApi apiInstance = new AccountManagementReportsApi(defaultClient);
    String authorization = "Bearer eyJ0eXAiOiJKV1..."; // String | Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...).
    StmtRequest stmtRequest = new StmtRequest(); // StmtRequest | Report request object
    try {
      GetStatementsResponse result = apiInstance.gwApiV1StatementsPost(authorization, stmtRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementReportsApi#gwApiV1StatementsPost");
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
| **authorization** | **String**| Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...). | |
| **stmtRequest** | [**StmtRequest**](StmtRequest.md)| Report request object | |

### Return type

[**GetStatementsResponse**](GetStatementsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/pdf, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a JSON object containing the relevant statement. |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **402** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1TaxDocumentsAvailableGet"></a>
# **gwApiV1TaxDocumentsAvailableGet**
> GetAvailableTaxFormsResponse gwApiV1TaxDocumentsAvailableGet(authorization, accountId, year)

Fetch List Of Available Tax Reports/forms/documents For A Specified Account And Tax Year

&lt;br&gt;**Scope**: &#x60;statements.read&#x60; OR &#x60;reports.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementReportsApi apiInstance = new AccountManagementReportsApi(defaultClient);
    String authorization = "Bearer eyJ0eXAiOiJKV1..."; // String | Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...).
    String accountId = "UXXXX"; // String | Specifies the account id to retrieve information
    Integer year = 2024; // Integer | Specifies the tax year to retrieve information
    try {
      GetAvailableTaxFormsResponse result = apiInstance.gwApiV1TaxDocumentsAvailableGet(authorization, accountId, year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementReportsApi#gwApiV1TaxDocumentsAvailableGet");
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
| **authorization** | **String**| Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...). | |
| **accountId** | **String**| Specifies the account id to retrieve information | |
| **year** | **Integer**| Specifies the tax year to retrieve information | |

### Return type

[**GetAvailableTaxFormsResponse**](GetAvailableTaxFormsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a JSON object containing the available report dates. |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **402** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1TaxDocumentsPost"></a>
# **gwApiV1TaxDocumentsPost**
> TaxFormResponse gwApiV1TaxDocumentsPost(authorization, taxFormRequest)

Fetch Tax Forms In Supported Formats Based On Request Parameters.

&lt;br&gt;**Scope**: &#x60;statements.write&#x60; OR &#x60;reports.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountManagementReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AccountManagementReportsApi apiInstance = new AccountManagementReportsApi(defaultClient);
    String authorization = "Bearer eyJ0eXAiOiJKV1..."; // String | Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...).
    TaxFormRequest taxFormRequest = new TaxFormRequest(); // TaxFormRequest | Tax Form request object
    try {
      TaxFormResponse result = apiInstance.gwApiV1TaxDocumentsPost(authorization, taxFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountManagementReportsApi#gwApiV1TaxDocumentsPost");
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
| **authorization** | **String**| Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...). | |
| **taxFormRequest** | [**TaxFormRequest**](TaxFormRequest.md)| Tax Form request object | |

### Return type

[**TaxFormResponse**](TaxFormResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/pdf, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a JSON object containing the relevant Tax Form. |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **402** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

