# UtilitiesEchoApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gwApiV1EchoHttpsGet**](UtilitiesEchoApi.md#gwApiV1EchoHttpsGet) | **GET** /gw/api/v1/echo/https | Echo A Request With HTTPS Security Policy Back After Validation. |
| [**gwApiV1EchoSignedJwtPost**](UtilitiesEchoApi.md#gwApiV1EchoSignedJwtPost) | **POST** /gw/api/v1/echo/signed-jwt | Echo A Request With Signed JWT Security Policy Back After Validation. |


<a id="gwApiV1EchoHttpsGet"></a>
# **gwApiV1EchoHttpsGet**
> EchoResponse gwApiV1EchoHttpsGet()

Echo A Request With HTTPS Security Policy Back After Validation.

&lt;br&gt;**Scope**: &#x60;echo.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilitiesEchoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    UtilitiesEchoApi apiInstance = new UtilitiesEchoApi(defaultClient);
    try {
      EchoResponse result = apiInstance.gwApiV1EchoHttpsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilitiesEchoApi#gwApiV1EchoHttpsGet");
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

[**EchoResponse**](EchoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a JSON object containing the request parameters. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

<a id="gwApiV1EchoSignedJwtPost"></a>
# **gwApiV1EchoSignedJwtPost**
> EchoResponse gwApiV1EchoSignedJwtPost(signedJwtEchoRequest)

Echo A Request With Signed JWT Security Policy Back After Validation.

&lt;br&gt;**Scope**: &#x60;echo.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilitiesEchoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    UtilitiesEchoApi apiInstance = new UtilitiesEchoApi(defaultClient);
    SignedJwtEchoRequest signedJwtEchoRequest = new SignedJwtEchoRequest(); // SignedJwtEchoRequest | Create a Signed JWT echo request.
    try {
      EchoResponse result = apiInstance.gwApiV1EchoSignedJwtPost(signedJwtEchoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilitiesEchoApi#gwApiV1EchoSignedJwtPost");
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
| **signedJwtEchoRequest** | [**SignedJwtEchoRequest**](SignedJwtEchoRequest.md)| Create a Signed JWT echo request. | |

### Return type

[**EchoResponse**](EchoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/jwt
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a JSON object containing the request parameters. |  -  |
| **401** | Returns a Problem detail instance representing an unauthorized request. |  -  |
| **403** | Returns a Problem detail instance representing a forbidden request. |  -  |
| **500** | Returns a Problem detail instance representing an internal server error. |  -  |

