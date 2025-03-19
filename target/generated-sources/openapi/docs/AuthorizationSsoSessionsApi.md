# AuthorizationSsoSessionsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gwApiV1SsoBrowserSessionsPost**](AuthorizationSsoSessionsApi.md#gwApiV1SsoBrowserSessionsPost) | **POST** /gw/api/v1/sso-browser-sessions | Create SSO Browser Session. |
| [**gwApiV1SsoSessionsPost**](AuthorizationSsoSessionsApi.md#gwApiV1SsoSessionsPost) | **POST** /gw/api/v1/sso-sessions | Create A New SSO Session On Behalf Of An End-user. |


<a id="gwApiV1SsoBrowserSessionsPost"></a>
# **gwApiV1SsoBrowserSessionsPost**
> CreateBrowserSessionResponse gwApiV1SsoBrowserSessionsPost(authorization, createBrowserSessionRequest)

Create SSO Browser Session.

&lt;br&gt;**Scope**: &#x60;sso-browser-sessions.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorizationSsoSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AuthorizationSsoSessionsApi apiInstance = new AuthorizationSsoSessionsApi(defaultClient);
    String authorization = "Bearer eyJ0eXAiOiJKV1..."; // String | Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...).
    CreateBrowserSessionRequest createBrowserSessionRequest = new CreateBrowserSessionRequest(); // CreateBrowserSessionRequest | Create browser session on behalf of end-user.
    try {
      CreateBrowserSessionResponse result = apiInstance.gwApiV1SsoBrowserSessionsPost(authorization, createBrowserSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationSsoSessionsApi#gwApiV1SsoBrowserSessionsPost");
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
| **createBrowserSessionRequest** | [**CreateBrowserSessionRequest**](CreateBrowserSessionRequest.md)| Create browser session on behalf of end-user. | |

### Return type

[**CreateBrowserSessionResponse**](CreateBrowserSessionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jwt
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Single Sign On (SSO) to access the IBKR hosted portal (White Branded). |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1SsoSessionsPost"></a>
# **gwApiV1SsoSessionsPost**
> CreateSessionResponse gwApiV1SsoSessionsPost(authorization, createSessionRequest)

Create A New SSO Session On Behalf Of An End-user.

&lt;br&gt;**Scope**: &#x60;sso-sessions.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorizationSsoSessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AuthorizationSsoSessionsApi apiInstance = new AuthorizationSsoSessionsApi(defaultClient);
    String authorization = "Bearer eyJ0eXAiOiJKV1..."; // String | Specifies the authorization header value (e.g., Bearer eyJ0eXAiOiJKV1...).
    CreateSessionRequest createSessionRequest = new CreateSessionRequest(); // CreateSessionRequest | Create session on behalf of end-user.
    try {
      CreateSessionResponse result = apiInstance.gwApiV1SsoSessionsPost(authorization, createSessionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationSsoSessionsApi#gwApiV1SsoSessionsPost");
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
| **createSessionRequest** | [**CreateSessionRequest**](CreateSessionRequest.md)| Create session on behalf of end-user. | |

### Return type

[**CreateSessionResponse**](CreateSessionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jwt
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a JSON object containing a reference to the newly created SSO session. |  -  |
| **400** | Returns a Problem detail instance representing a bad request. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

