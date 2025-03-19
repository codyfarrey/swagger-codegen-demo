# TradingOAuth10aApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauthAccessTokenPost**](TradingOAuth10aApi.md#oauthAccessTokenPost) | **POST** /oauth/access_token | Request An Access Token For The IB Username That Has Granted Authorization To The Consumer. |
| [**oauthLiveSessionTokenPost**](TradingOAuth10aApi.md#oauthLiveSessionTokenPost) | **POST** /oauth/live_session_token | Generate A Live Session Token Shared Secret And Gain Access To Web API. |
| [**oauthRequestTokenPost**](TradingOAuth10aApi.md#oauthRequestTokenPost) | **POST** /oauth/request_token | Request A Temporary Token As A Third Party To Begin The OAuth 1.0a Authorization Workflow. |


<a id="oauthAccessTokenPost"></a>
# **oauthAccessTokenPost**
> OauthAccessTokenPost200Response oauthAccessTokenPost(authorization)

Request An Access Token For The IB Username That Has Granted Authorization To The Consumer.

Request an access token for the IB username that has granted authorization to the consumer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOAuth10aApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOAuth10aApi apiInstance = new TradingOAuth10aApi(defaultClient);
    String authorization = "OAuth oauth_verifier=\"1e1dc5666e87ca5a18e0\",oauth_token=\"e0d75b4c5c1d2c0f2af7\",oauth_consumer_key=\"TESTCONS\",oauth_nonce=\"v235...456h\",oauth_signature=\"af1%252...0nd2\",oauth_signature_method=\"RSA-SHA256\",oauth_timestamp=\"1714489450\",realm=\"test_realm\""; // String | OAuth 1.0a authorization request header for request to /access_token endpoint.
    try {
      OauthAccessTokenPost200Response result = apiInstance.oauthAccessTokenPost(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOAuth10aApi#oauthAccessTokenPost");
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
| **authorization** | **String**| OAuth 1.0a authorization request header for request to /access_token endpoint. | [optional] |

### Return type

[**OauthAccessTokenPost200Response**](OauthAccessTokenPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response with permanent OAuth access token |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="oauthLiveSessionTokenPost"></a>
# **oauthLiveSessionTokenPost**
> OauthLiveSessionTokenPost200Response oauthLiveSessionTokenPost(authorization)

Generate A Live Session Token Shared Secret And Gain Access To Web API.

Generate a Live Session Token shared secret and gain access to Web API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOAuth10aApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOAuth10aApi apiInstance = new TradingOAuth10aApi(defaultClient);
    String authorization = "OAuth diffie_hellman_challenge=\"b393...g6f3\",oauth_token=\"56786fc07bcbabc4584\",oauth_consumer_key=\"TESTCONS\",oauth_nonce=\"v235...456h\",oauth_signature=\"af1%252...0nd2\",oauth_signature_method=\"RSA-SHA256\",oauth_timestamp=\"1714489460\",realm=\"test_realm\""; // String | OAuth 1.0a authorization request header for request to /live_session_token endpoint.
    try {
      OauthLiveSessionTokenPost200Response result = apiInstance.oauthLiveSessionTokenPost(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOAuth10aApi#oauthLiveSessionTokenPost");
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
| **authorization** | **String**| OAuth 1.0a authorization request header for request to /live_session_token endpoint. | [optional] |

### Return type

[**OauthLiveSessionTokenPost200Response**](OauthLiveSessionTokenPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response with Diffie-Hellman challenge and Signature value |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="oauthRequestTokenPost"></a>
# **oauthRequestTokenPost**
> OauthRequestTokenPost200Response oauthRequestTokenPost(authorization)

Request A Temporary Token As A Third Party To Begin The OAuth 1.0a Authorization Workflow.

Request a temporary token as a third party to begin the OAuth 1.0a authorization workflow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingOAuth10aApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingOAuth10aApi apiInstance = new TradingOAuth10aApi(defaultClient);
    String authorization = "OAuth oauth_callback=\"oob\",oauth_consumer_key=\"TESTCONS\",oauth_nonce=\"b249...8f57\",oauth_signature=\"41Sx%252...ZYZ2\",oauth_signature_method=\"RSA-SHA256\",oauth_timestamp=\"1714489440\",realm=\"test_realm\""; // String | OAuth 1.0a authorization request header for request to /request_token endpoint.
    try {
      OauthRequestTokenPost200Response result = apiInstance.oauthRequestTokenPost(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingOAuth10aApi#oauthRequestTokenPost");
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
| **authorization** | **String**| OAuth 1.0a authorization request header for request to /request_token endpoint. | [optional] |

### Return type

[**OauthRequestTokenPost200Response**](OauthRequestTokenPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response with temporary OAuth access token |  -  |
| **401** | access denied |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

