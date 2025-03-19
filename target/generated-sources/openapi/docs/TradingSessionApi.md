# TradingSessionApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**iserverAuthSsodhInitPost**](TradingSessionApi.md#iserverAuthSsodhInitPost) | **POST** /iserver/auth/ssodh/init | Initialize Brokerage Session. |
| [**iserverAuthStatusPost**](TradingSessionApi.md#iserverAuthStatusPost) | **POST** /iserver/auth/status | Brokerage Session Auth Status |
| [**iserverReauthenticateGet**](TradingSessionApi.md#iserverReauthenticateGet) | **GET** /iserver/reauthenticate | Re-authenticate The Brokerage Session |
| [**logoutPost**](TradingSessionApi.md#logoutPost) | **POST** /logout | Logout Of The Current Session. |
| [**ssoValidateGet**](TradingSessionApi.md#ssoValidateGet) | **GET** /sso/validate | Validate SSO |
| [**ticklePost**](TradingSessionApi.md#ticklePost) | **POST** /tickle | Server Ping. |


<a id="iserverAuthSsodhInitPost"></a>
# **iserverAuthSsodhInitPost**
> BrokerageSessionStatus iserverAuthSsodhInitPost(brokerageSessionInitRequest)

Initialize Brokerage Session.

After retrieving the access token and subsequent Live Session Token, customers can initialize their brokerage session with the ssodh/init endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingSessionApi apiInstance = new TradingSessionApi(defaultClient);
    BrokerageSessionInitRequest brokerageSessionInitRequest = new BrokerageSessionInitRequest(); // BrokerageSessionInitRequest | 
    try {
      BrokerageSessionStatus result = apiInstance.iserverAuthSsodhInitPost(brokerageSessionInitRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingSessionApi#iserverAuthSsodhInitPost");
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
| **brokerageSessionInitRequest** | [**BrokerageSessionInitRequest**](BrokerageSessionInitRequest.md)|  | |

### Return type

[**BrokerageSessionStatus**](BrokerageSessionStatus.md)

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

<a id="iserverAuthStatusPost"></a>
# **iserverAuthStatusPost**
> BrokerageSessionStatus iserverAuthStatusPost()

Brokerage Session Auth Status

Current Authentication status to the Brokerage system. Market Data and Trading is not possible if not authenticated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingSessionApi apiInstance = new TradingSessionApi(defaultClient);
    try {
      BrokerageSessionStatus result = apiInstance.iserverAuthStatusPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingSessionApi#iserverAuthStatusPost");
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

[**BrokerageSessionStatus**](BrokerageSessionStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Detailed status of the Brokerage session |  -  |
| **401** | access denied |  -  |

<a id="iserverReauthenticateGet"></a>
# **iserverReauthenticateGet**
> IserverReauthenticateGet200Response iserverReauthenticateGet()

Re-authenticate The Brokerage Session

When using the CP Gateway, this endpoint provides a way to reauthenticate to the Brokerage system as long as there is a valid brokerage session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingSessionApi apiInstance = new TradingSessionApi(defaultClient);
    try {
      IserverReauthenticateGet200Response result = apiInstance.iserverReauthenticateGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingSessionApi#iserverReauthenticateGet");
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

[**IserverReauthenticateGet200Response**](IserverReauthenticateGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |

<a id="logoutPost"></a>
# **logoutPost**
> LogoutPost200Response logoutPost()

Logout Of The Current Session.

Logs the user out of the gateway session. Any further activity requires re-authentication.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingSessionApi apiInstance = new TradingSessionApi(defaultClient);
    try {
      LogoutPost200Response result = apiInstance.logoutPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingSessionApi#logoutPost");
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

[**LogoutPost200Response**](LogoutPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **401** | access denied |  -  |

<a id="ssoValidateGet"></a>
# **ssoValidateGet**
> SsoValidateResponse ssoValidateGet()

Validate SSO

Validates the current session for the SSO user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingSessionApi apiInstance = new TradingSessionApi(defaultClient);
    try {
      SsoValidateResponse result = apiInstance.ssoValidateGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingSessionApi#ssoValidateGet");
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

[**SsoValidateResponse**](SsoValidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **401** | access denied |  -  |

<a id="ticklePost"></a>
# **ticklePost**
> TickleResponse ticklePost()

Server Ping.

If the gateway has not received any requests for several minutes an open session will automatically timeout. The tickle endpoint pings the server to prevent the session from ending. It is expected to call this endpoint approximately every 60 seconds to maintain the connection to the brokerage session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingSessionApi apiInstance = new TradingSessionApi(defaultClient);
    try {
      TickleResponse result = apiInstance.ticklePost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingSessionApi#ticklePost");
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

[**TickleResponse**](TickleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of objects detailing contract information. |  -  |
| **401** | access denied |  -  |

