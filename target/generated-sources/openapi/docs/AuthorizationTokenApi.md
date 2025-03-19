# AuthorizationTokenApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateToken**](AuthorizationTokenApi.md#generateToken) | **POST** /oauth2/api/v1/token | Create Access Token |


<a id="generateToken"></a>
# **generateToken**
> TokenResponse generateToken(grantType, clientAssertion, clientAssertionType, scope)

Create Access Token

Generate OAuth 2.0 access tokens based on request parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorizationTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    AuthorizationTokenApi apiInstance = new AuthorizationTokenApi(defaultClient);
    String grantType = "grantType_example"; // String | The [authorization grant flow](https://dataetracker.ietf.org/doc/html/rfc6749#section-1.3) for the creation of the tokens.
    String clientAssertion = "clientAssertion_example"; // String | The compact [client assertion](https://www.rfc-editor.org/rfc/rfc7521.html) token used to authenticate you as a registered client.
    String clientAssertionType = "clientAssertionType_example"; // String | The [client assertion type](https://www.rfc-editor.org/rfc/rfc7521.html#section-4.2) that identifies the client assertion.
    String scope = "scope_example"; // String | The space-delimited list of scopes
    try {
      TokenResponse result = apiInstance.generateToken(grantType, clientAssertion, clientAssertionType, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationTokenApi#generateToken");
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
| **grantType** | **String**| The [authorization grant flow](https://dataetracker.ietf.org/doc/html/rfc6749#section-1.3) for the creation of the tokens. | |
| **clientAssertion** | **String**| The compact [client assertion](https://www.rfc-editor.org/rfc/rfc7521.html) token used to authenticate you as a registered client. | |
| **clientAssertionType** | **String**| The [client assertion type](https://www.rfc-editor.org/rfc/rfc7521.html#section-4.2) that identifies the client assertion. | |
| **scope** | **String**| The space-delimited list of scopes | |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a token response. |  -  |
| **400** | Returns a [Problem detail](https://datatracker.ietf.org/doc/html/rfc9457) instance representing a bad request. |  -  |
| **500** | Returns a [Problem detail](https://datatracker.ietf.org/doc/html/rfc9457) instance representing an internal server error. |  -  |

