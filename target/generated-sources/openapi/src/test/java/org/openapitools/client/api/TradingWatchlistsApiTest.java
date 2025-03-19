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
import org.openapitools.client.model.ErrorOnlyResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.IserverWatchlistPost200Response;
import org.openapitools.client.model.IserverWatchlistPostRequest;
import org.openapitools.client.model.SingleWatchlist;
import org.openapitools.client.model.WatchlistDeleteSuccess;
import org.openapitools.client.model.WatchlistsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TradingWatchlistsApi
 */
@Disabled
public class TradingWatchlistsApiTest {

    private final TradingWatchlistsApi api = new TradingWatchlistsApi();

    /**
     * Delete A Specified Watchlist From The Username&#39;s Settings.
     *
     * Delete a specified watchlist from the username&#39;s settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverWatchlistDeleteTest() throws ApiException {
        String id = null;
        WatchlistDeleteSuccess response = api.iserverWatchlistDelete(id);
        // TODO: test validations
    }

    /**
     * Retrieve Details Of A Single Watchlist Stored In The Username&#39;s Settings.
     *
     * Retrieve details of a single watchlist stored in the username&#39;s settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverWatchlistGetTest() throws ApiException {
        String id = null;
        SingleWatchlist response = api.iserverWatchlistGet(id);
        // TODO: test validations
    }

    /**
     * Create A Watchlist To Monitor A Set Of Instruments.
     *
     * Create a named watchlist by submitting a set of conids.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverWatchlistPostTest() throws ApiException {
        IserverWatchlistPostRequest iserverWatchlistPostRequest = null;
        IserverWatchlistPost200Response response = api.iserverWatchlistPost(iserverWatchlistPostRequest);
        // TODO: test validations
    }

    /**
     * Retrieve All Saved Watchlists Stored On IB Backend For The Username In Use In The Current Web API Session.
     *
     * Retrieve all saved watchlists stored on IB backend for the username in use in the current Web API session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverWatchlistsGetTest() throws ApiException {
        String SC = null;
        WatchlistsResponse response = api.iserverWatchlistsGet(SC);
        // TODO: test validations
    }

}
