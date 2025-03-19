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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BrokerageSessionInitRequest;
import org.openapitools.client.model.BrokerageSessionStatus;
import org.openapitools.client.model.ErrorOnlyResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.IserverReauthenticateGet200Response;
import org.openapitools.client.model.LogoutPost200Response;
import org.openapitools.client.model.SsoValidateResponse;
import org.openapitools.client.model.TickleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TradingSessionApi
 */
@Disabled
public class TradingSessionApiTest {

    private final TradingSessionApi api = new TradingSessionApi();

    /**
     * Initialize Brokerage Session.
     *
     * After retrieving the access token and subsequent Live Session Token, customers can initialize their brokerage session with the ssodh/init endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAuthSsodhInitPostTest() throws ApiException {
        BrokerageSessionInitRequest brokerageSessionInitRequest = null;
        BrokerageSessionStatus response = api.iserverAuthSsodhInitPost(brokerageSessionInitRequest);
        // TODO: test validations
    }

    /**
     * Brokerage Session Auth Status
     *
     * Current Authentication status to the Brokerage system. Market Data and Trading is not possible if not authenticated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAuthStatusPostTest() throws ApiException {
        BrokerageSessionStatus response = api.iserverAuthStatusPost();
        // TODO: test validations
    }

    /**
     * Re-authenticate The Brokerage Session
     *
     * When using the CP Gateway, this endpoint provides a way to reauthenticate to the Brokerage system as long as there is a valid brokerage session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverReauthenticateGetTest() throws ApiException {
        IserverReauthenticateGet200Response response = api.iserverReauthenticateGet();
        // TODO: test validations
    }

    /**
     * Logout Of The Current Session.
     *
     * Logs the user out of the gateway session. Any further activity requires re-authentication.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutPostTest() throws ApiException {
        LogoutPost200Response response = api.logoutPost();
        // TODO: test validations
    }

    /**
     * Validate SSO
     *
     * Validates the current session for the SSO user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ssoValidateGetTest() throws ApiException {
        SsoValidateResponse response = api.ssoValidateGet();
        // TODO: test validations
    }

    /**
     * Server Ping.
     *
     * If the gateway has not received any requests for several minutes an open session will automatically timeout. The tickle endpoint pings the server to prevent the session from ending. It is expected to call this endpoint approximately every 60 seconds to maintain the connection to the brokerage session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ticklePostTest() throws ApiException {
        TickleResponse response = api.ticklePost();
        // TODO: test validations
    }

}
