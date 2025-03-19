/*
 * IB REST API
 * The IB REST API reference documentation
 *
 * The version of the OpenAPI document: 2.13.0
 * Contact: api@interactivebrokers.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.EchoResponse;
import org.openapitools.client.model.InsufficientScopeResponse;
import org.openapitools.client.model.InternalServerErrorResponse;
import org.openapitools.client.model.InvalidAccessTokenResponse;
import org.openapitools.client.model.SignedJwtEchoRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilitiesEchoApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UtilitiesEchoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UtilitiesEchoApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for gwApiV1EchoHttpsGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call gwApiV1EchoHttpsGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/gw/api/v1/echo/https";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call gwApiV1EchoHttpsGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return gwApiV1EchoHttpsGetCall(_callback);

    }

    /**
     * Echo A Request With HTTPS Security Policy Back After Validation.
     * &lt;br&gt;**Scope**: &#x60;echo.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;
     * @return EchoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public EchoResponse gwApiV1EchoHttpsGet() throws ApiException {
        ApiResponse<EchoResponse> localVarResp = gwApiV1EchoHttpsGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Echo A Request With HTTPS Security Policy Back After Validation.
     * &lt;br&gt;**Scope**: &#x60;echo.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;
     * @return ApiResponse&lt;EchoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EchoResponse> gwApiV1EchoHttpsGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = gwApiV1EchoHttpsGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<EchoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Echo A Request With HTTPS Security Policy Back After Validation. (asynchronously)
     * &lt;br&gt;**Scope**: &#x60;echo.read&#x60;&lt;br&gt;**Security Policy**: &#x60;HTTPS&#x60;
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call gwApiV1EchoHttpsGetAsync(final ApiCallback<EchoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = gwApiV1EchoHttpsGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<EchoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for gwApiV1EchoSignedJwtPost
     * @param signedJwtEchoRequest Create a Signed JWT echo request. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call gwApiV1EchoSignedJwtPostCall(SignedJwtEchoRequest signedJwtEchoRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = signedJwtEchoRequest;

        // create path and map variables
        String localVarPath = "/gw/api/v1/echo/signed-jwt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/jwt"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call gwApiV1EchoSignedJwtPostValidateBeforeCall(SignedJwtEchoRequest signedJwtEchoRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'signedJwtEchoRequest' is set
        if (signedJwtEchoRequest == null) {
            throw new ApiException("Missing the required parameter 'signedJwtEchoRequest' when calling gwApiV1EchoSignedJwtPost(Async)");
        }

        return gwApiV1EchoSignedJwtPostCall(signedJwtEchoRequest, _callback);

    }

    /**
     * Echo A Request With Signed JWT Security Policy Back After Validation.
     * &lt;br&gt;**Scope**: &#x60;echo.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;
     * @param signedJwtEchoRequest Create a Signed JWT echo request. (required)
     * @return EchoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public EchoResponse gwApiV1EchoSignedJwtPost(SignedJwtEchoRequest signedJwtEchoRequest) throws ApiException {
        ApiResponse<EchoResponse> localVarResp = gwApiV1EchoSignedJwtPostWithHttpInfo(signedJwtEchoRequest);
        return localVarResp.getData();
    }

    /**
     * Echo A Request With Signed JWT Security Policy Back After Validation.
     * &lt;br&gt;**Scope**: &#x60;echo.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;
     * @param signedJwtEchoRequest Create a Signed JWT echo request. (required)
     * @return ApiResponse&lt;EchoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EchoResponse> gwApiV1EchoSignedJwtPostWithHttpInfo(SignedJwtEchoRequest signedJwtEchoRequest) throws ApiException {
        okhttp3.Call localVarCall = gwApiV1EchoSignedJwtPostValidateBeforeCall(signedJwtEchoRequest, null);
        Type localVarReturnType = new TypeToken<EchoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Echo A Request With Signed JWT Security Policy Back After Validation. (asynchronously)
     * &lt;br&gt;**Scope**: &#x60;echo.write&#x60;&lt;br&gt;**Security Policy**: &#x60;Signed JWT&#x60;
     * @param signedJwtEchoRequest Create a Signed JWT echo request. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a JSON object containing the request parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns a Problem detail instance representing an unauthorized request. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returns a Problem detail instance representing a forbidden request. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returns a Problem detail instance representing an internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call gwApiV1EchoSignedJwtPostAsync(SignedJwtEchoRequest signedJwtEchoRequest, final ApiCallback<EchoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = gwApiV1EchoSignedJwtPostValidateBeforeCall(signedJwtEchoRequest, _callback);
        Type localVarReturnType = new TypeToken<EchoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
