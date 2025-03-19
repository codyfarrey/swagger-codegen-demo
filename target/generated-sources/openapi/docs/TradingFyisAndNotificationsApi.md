# TradingFyisAndNotificationsApi

All URIs are relative to *https://api.ibkr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fyiDeliveryoptionsDeviceIdDelete**](TradingFyisAndNotificationsApi.md#fyiDeliveryoptionsDeviceIdDelete) | **DELETE** /fyi/deliveryoptions/{deviceId} | Delete A Device |
| [**fyiDeliveryoptionsDevicePost**](TradingFyisAndNotificationsApi.md#fyiDeliveryoptionsDevicePost) | **POST** /fyi/deliveryoptions/device | Enable/Disable Device Option |
| [**fyiDeliveryoptionsEmailPut**](TradingFyisAndNotificationsApi.md#fyiDeliveryoptionsEmailPut) | **PUT** /fyi/deliveryoptions/email | Enable/Disable Email Option |
| [**fyiDeliveryoptionsGet**](TradingFyisAndNotificationsApi.md#fyiDeliveryoptionsGet) | **GET** /fyi/deliveryoptions | Get Delivery OptionsCopy Location |
| [**fyiDisclaimerTypecodeGet**](TradingFyisAndNotificationsApi.md#fyiDisclaimerTypecodeGet) | **GET** /fyi/disclaimer/{typecode} | Get Disclaimer For A Certain Kind Of Fyi |
| [**fyiDisclaimerTypecodePut**](TradingFyisAndNotificationsApi.md#fyiDisclaimerTypecodePut) | **PUT** /fyi/disclaimer/{typecode} | Mark Disclaimer Read |
| [**fyiNotificationsGet**](TradingFyisAndNotificationsApi.md#fyiNotificationsGet) | **GET** /fyi/notifications | Get A List Of Notifications |
| [**fyiNotificationsNotificationIDPut**](TradingFyisAndNotificationsApi.md#fyiNotificationsNotificationIDPut) | **PUT** /fyi/notifications/{notificationID} | Mark Notification Read |
| [**fyiSettingsGet**](TradingFyisAndNotificationsApi.md#fyiSettingsGet) | **GET** /fyi/settings | Get Notification Settings |
| [**fyiSettingsTypecodePost**](TradingFyisAndNotificationsApi.md#fyiSettingsTypecodePost) | **POST** /fyi/settings/{typecode} | Modify FYI Notifications |
| [**fyiUnreadnumberGet**](TradingFyisAndNotificationsApi.md#fyiUnreadnumberGet) | **GET** /fyi/unreadnumber | Unread Bulletins |


<a id="fyiDeliveryoptionsDeviceIdDelete"></a>
# **fyiDeliveryoptionsDeviceIdDelete**
> fyiDeliveryoptionsDeviceIdDelete(deviceId)

Delete A Device

Delete a specific device from our saved list of notification devices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    Object deviceId = null; // Object | 
    try {
      apiInstance.fyiDeliveryoptionsDeviceIdDelete(deviceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiDeliveryoptionsDeviceIdDelete");
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
| **deviceId** | [**Object**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | No response message is returned. Instead, you will only receive an empty string with a 200 OK status code indicating a successfully deleted account. |  -  |

<a id="fyiDeliveryoptionsDevicePost"></a>
# **fyiDeliveryoptionsDevicePost**
> FyiVT fyiDeliveryoptionsDevicePost(fyiEnableDeviceOption)

Enable/Disable Device Option

Choose whether a particular device is enabled or disabled.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    FyiEnableDeviceOption fyiEnableDeviceOption = new FyiEnableDeviceOption(); // FyiEnableDeviceOption | 
    try {
      FyiVT result = apiInstance.fyiDeliveryoptionsDevicePost(fyiEnableDeviceOption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiDeliveryoptionsDevicePost");
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
| **fyiEnableDeviceOption** | [**FyiEnableDeviceOption**](FyiEnableDeviceOption.md)|  | |

### Return type

[**FyiVT**](FyiVT.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieve preset details |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiDeliveryoptionsEmailPut"></a>
# **fyiDeliveryoptionsEmailPut**
> FyiVT fyiDeliveryoptionsEmailPut(enabled)

Enable/Disable Email Option

Enable or disable your account’s primary email to receive notifications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    Object enabled = null; // Object | 
    try {
      FyiVT result = apiInstance.fyiDeliveryoptionsEmailPut(enabled);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiDeliveryoptionsEmailPut");
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
| **enabled** | [**Object**](.md)|  | |

### Return type

[**FyiVT**](FyiVT.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully enabled or disabled your email notifications. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiDeliveryoptionsGet"></a>
# **fyiDeliveryoptionsGet**
> DeliveryOptions fyiDeliveryoptionsGet()

Get Delivery OptionsCopy Location

Options for sending fyis to email and other devices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    try {
      DeliveryOptions result = apiInstance.fyiDeliveryoptionsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiDeliveryoptionsGet");
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

[**DeliveryOptions**](DeliveryOptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieve preset details |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiDisclaimerTypecodeGet"></a>
# **fyiDisclaimerTypecodeGet**
> DisclaimerInfo fyiDisclaimerTypecodeGet(typecode)

Get Disclaimer For A Certain Kind Of Fyi

Receive additional disclaimers based on the specified typecode.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    Typecodes typecode = Typecodes.fromValue("BA"); // Typecodes | 
    try {
      DisclaimerInfo result = apiInstance.fyiDisclaimerTypecodeGet(typecode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiDisclaimerTypecodeGet");
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
| **typecode** | [**Typecodes**](.md)|  | [enum: BA, CA, DA, EA, MF, OE, PR, SE, SG, SM, T2, TO, UA, M8, PS, DL, PT, CB, MS, TD, ST, TI, CT] |

### Return type

[**DisclaimerInfo**](DisclaimerInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully disclaimer details |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiDisclaimerTypecodePut"></a>
# **fyiDisclaimerTypecodePut**
> FyiVT fyiDisclaimerTypecodePut(typecode)

Mark Disclaimer Read

Mark a specific disclaimer message as read.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    Typecodes typecode = Typecodes.fromValue("BA"); // Typecodes | 
    try {
      FyiVT result = apiInstance.fyiDisclaimerTypecodePut(typecode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiDisclaimerTypecodePut");
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
| **typecode** | [**Typecodes**](.md)|  | [enum: BA, CA, DA, EA, MF, OE, PR, SE, SG, SM, T2, TO, UA, M8, PS, DL, PT, CB, MS, TD, ST, TI, CT] |

### Return type

[**FyiVT**](FyiVT.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully marked as read |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiNotificationsGet"></a>
# **fyiNotificationsGet**
> List&lt;NotificationsInner&gt; fyiNotificationsGet(max, include, exclude, id)

Get A List Of Notifications

Get a list of available notifications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    String max = "10"; // String | 
    Object include = null; // Object | 
    Object exclude = null; // Object | 
    Object id = null; // Object | 
    try {
      List<NotificationsInner> result = apiInstance.fyiNotificationsGet(max, include, exclude, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiNotificationsGet");
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
| **max** | **String**|  | |
| **include** | [**Object**](.md)|  | [optional] |
| **exclude** | [**Object**](.md)|  | [optional] |
| **id** | [**Object**](.md)|  | [optional] |

### Return type

[**List&lt;NotificationsInner&gt;**](NotificationsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully enabled or disabled your email notifications. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiNotificationsNotificationIDPut"></a>
# **fyiNotificationsNotificationIDPut**
> NotificationReadAcknowledge fyiNotificationsNotificationIDPut(notificationId)

Mark Notification Read

Mark a particular notification message as read or unread.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    Object notificationId = null; // Object | 
    try {
      NotificationReadAcknowledge result = apiInstance.fyiNotificationsNotificationIDPut(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiNotificationsNotificationIDPut");
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
| **notificationId** | [**Object**](.md)|  | |

### Return type

[**NotificationReadAcknowledge**](NotificationReadAcknowledge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully enabled or disabled your email notifications. |  -  |
| **400** | bad request |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiSettingsGet"></a>
# **fyiSettingsGet**
> List&lt;FyiSettingsInner&gt; fyiSettingsGet()

Get Notification Settings

Return the current choices of subscriptions for notifications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    try {
      List<FyiSettingsInner> result = apiInstance.fyiSettingsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiSettingsGet");
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

[**List&lt;FyiSettingsInner&gt;**](FyiSettingsInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates data is being returned successfully. |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiSettingsTypecodePost"></a>
# **fyiSettingsTypecodePost**
> FyiVT fyiSettingsTypecodePost(typecode, fyiSettingsTypecodePostRequest)

Modify FYI Notifications

Enable or disable group of notifications by the specific typecode.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    Typecodes typecode = Typecodes.fromValue("BA"); // Typecodes | 
    FyiSettingsTypecodePostRequest fyiSettingsTypecodePostRequest = new FyiSettingsTypecodePostRequest(); // FyiSettingsTypecodePostRequest | 
    try {
      FyiVT result = apiInstance.fyiSettingsTypecodePost(typecode, fyiSettingsTypecodePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiSettingsTypecodePost");
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
| **typecode** | [**Typecodes**](.md)|  | [enum: BA, CA, DA, EA, MF, OE, PR, SE, SG, SM, T2, TO, UA, M8, PS, DL, PT, CB, MS, TD, ST, TI, CT] |
| **fyiSettingsTypecodePostRequest** | [**FyiSettingsTypecodePostRequest**](FyiSettingsTypecodePostRequest.md)|  | |

### Return type

[**FyiVT**](FyiVT.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieve preset details |  -  |
| **401** | access denied |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

<a id="fyiUnreadnumberGet"></a>
# **fyiUnreadnumberGet**
> FyiUnreadnumberGet200Response fyiUnreadnumberGet()

Unread Bulletins

Returns the total number of unread notifications

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingFyisAndNotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ibkr.com");

    TradingFyisAndNotificationsApi apiInstance = new TradingFyisAndNotificationsApi(defaultClient);
    try {
      FyiUnreadnumberGet200Response result = apiInstance.fyiUnreadnumberGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingFyisAndNotificationsApi#fyiUnreadnumberGet");
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

[**FyiUnreadnumberGet200Response**](FyiUnreadnumberGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain; charset=utf-8, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Indicates data is being returned successfully. |  -  |
| **401** | access denied |  -  |
| **423** | Return if called too frequently. Should not be called more than 1 time in 5 minutes |  -  |
| **500** | internal server error, returned when incoming request cannot be processed. It can sometimes include subset of bad requests.  For example, wrong accountId passed and it can only be detected later in handling request. Error contains reason of the problem.  |  -  |
| **503** | service is unavailable. For example if request takes more than 10s due to some internal service unavailability,  request aborted and this status returned  |  -  |

