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
import org.openapitools.client.model.DetailedContractInformation;
import org.openapitools.client.model.ErrorOnlyResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.PaAllperiodsPostRequest;
import org.openapitools.client.model.PaPerformancePostRequest;
import org.openapitools.client.model.PaTransactionsPostRequest;
import org.openapitools.client.model.PerformanceResponse;
import org.openapitools.client.model.TransactionsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TradingPortfolioAnalystApi
 */
@Disabled
public class TradingPortfolioAnalystApiTest {

    private final TradingPortfolioAnalystApi api = new TradingPortfolioAnalystApi();

    /**
     * Account Performance (All Time Periods)
     *
     * Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is consolidated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paAllperiodsPostTest() throws ApiException {
        PaAllperiodsPostRequest paAllperiodsPostRequest = null;
        String param0 = null;
        DetailedContractInformation response = api.paAllperiodsPost(paAllperiodsPostRequest, param0);
        // TODO: test validations
    }

    /**
     * Account Performance
     *
     * Returns the performance (MTM) for the given accounts, if more than one account is passed, the result is consolidated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paPerformancePostTest() throws ApiException {
        PaPerformancePostRequest paPerformancePostRequest = null;
        PerformanceResponse response = api.paPerformancePost(paPerformancePostRequest);
        // TODO: test validations
    }

    /**
     * Transaction History
     *
     * Transaction history for a given number of conids and accounts. Types of transactions include dividend payments, buy and sell transactions, transfers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paTransactionsPostTest() throws ApiException {
        PaTransactionsPostRequest paTransactionsPostRequest = null;
        TransactionsResponse response = api.paTransactionsPost(paTransactionsPostRequest);
        // TODO: test validations
    }

}
