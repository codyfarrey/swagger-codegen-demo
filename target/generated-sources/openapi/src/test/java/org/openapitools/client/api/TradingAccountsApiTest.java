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
import org.openapitools.client.model.AccountSummaryResponse;
import org.openapitools.client.model.AvailableFundsResponse;
import org.openapitools.client.model.DynAccountSearchResponse;
import org.openapitools.client.model.ErrorOnlyResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.IserverAccountPostRequest;
import org.openapitools.client.model.IserverDynaccountPostRequest;
import org.openapitools.client.model.PnlPartitionedResponse;
import org.openapitools.client.model.SetAccountResponse;
import org.openapitools.client.model.SignatureAndOwners;
import org.openapitools.client.model.SummaryMarketValueResponse;
import org.openapitools.client.model.SummaryOfAccountBalancesResponse;
import org.openapitools.client.model.SummaryOfAccountMarginResponse;
import org.openapitools.client.model.UserAccountsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TradingAccountsApi
 */
@Disabled
public class TradingAccountsApiTest {

    private final TradingAccountsApi api = new TradingAccountsApi();

    /**
     * Signatures And Owners
     *
     * Receive a list of all applicant names on the account and for which account and entity is represented.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void aceswsAccountIdSignaturesAndOwnersGetTest() throws ApiException {
        String accountId = null;
        SignatureAndOwners response = api.aceswsAccountIdSignaturesAndOwnersGet(accountId);
        // TODO: test validations
    }

    /**
     * Summary Of Available Funds
     *
     * Provides a summary specific for avilable funds giving more depth than the standard /summary endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdSummaryAvailableFundsGetTest() throws ApiException {
        String accountId = null;
        AvailableFundsResponse response = api.iserverAccountAccountIdSummaryAvailableFundsGet(accountId);
        // TODO: test validations
    }

    /**
     * Summary Of Account Balances
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdSummaryBalancesGetTest() throws ApiException {
        String accountId = null;
        SummaryOfAccountBalancesResponse response = api.iserverAccountAccountIdSummaryBalancesGet(accountId);
        // TODO: test validations
    }

    /**
     * General Account Summary
     *
     * Provides a general overview of the account details such as balance values.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdSummaryGetTest() throws ApiException {
        String accountId = null;
        AccountSummaryResponse response = api.iserverAccountAccountIdSummaryGet(accountId);
        // TODO: test validations
    }

    /**
     * Summary Of Account Margin
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdSummaryMarginsGetTest() throws ApiException {
        String accountId = null;
        SummaryOfAccountMarginResponse response = api.iserverAccountAccountIdSummaryMarginsGet(accountId);
        // TODO: test validations
    }

    /**
     * Summary Of Account&#39;s Market Value
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdSummaryMarketValueGetTest() throws ApiException {
        String accountId = null;
        SummaryMarketValueResponse response = api.iserverAccountAccountIdSummaryMarketValueGet(accountId);
        // TODO: test validations
    }

    /**
     * Account Profit And Loss
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountPnlPartitionedGetTest() throws ApiException {
        PnlPartitionedResponse response = api.iserverAccountPnlPartitionedGet();
        // TODO: test validations
    }

    /**
     * Switch Account
     *
     * Switch the active account for how you request data. Only available for financial advisors and multi-account structures. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountPostTest() throws ApiException {
        IserverAccountPostRequest iserverAccountPostRequest = null;
        SetAccountResponse response = api.iserverAccountPost(iserverAccountPostRequest);
        // TODO: test validations
    }

    /**
     * Search Dynamic Account
     *
     * Returns a list of accounts matching a query pattern set in the request. Broker accounts configured with the DYNACCT property will not receive account information at login. Instead, they must dynamically query then set their account number. Customers without the DYNACCT property will receive a 503 error. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountSearchSearchPatternGetTest() throws ApiException {
        String searchPattern = null;
        DynAccountSearchResponse response = api.iserverAccountSearchSearchPatternGet(searchPattern);
        // TODO: test validations
    }

    /**
     * Receive Brokerage Accounts For The Current User.
     *
     * Returns a list of accounts the user has trading access to, their respective aliases and the currently selected account. Note this endpoint must be called before modifying an order or querying open orders.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountsGetTest() throws ApiException {
        UserAccountsResponse response = api.iserverAccountsGet();
        // TODO: test validations
    }

    /**
     * Set Dynamic Account
     *
     * Set the active dynamic account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverDynaccountPostTest() throws ApiException {
        IserverDynaccountPostRequest iserverDynaccountPostRequest = null;
        SetAccountResponse response = api.iserverDynaccountPost(iserverDynaccountPostRequest);
        // TODO: test validations
    }

}
