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
import org.openapitools.client.model.IserverAccountAccountIdOrderOrderIdDelete200Response;
import org.openapitools.client.model.IserverAccountAccountIdOrderOrderIdPost200Response;
import org.openapitools.client.model.IserverAccountOrderStatusOrderIdGet200Response;
import org.openapitools.client.model.IserverNotificationPostRequest;
import org.openapitools.client.model.IserverQuestionsSuppressPost200Response;
import org.openapitools.client.model.IserverQuestionsSuppressPostRequest;
import org.openapitools.client.model.IserverQuestionsSuppressResetPost200Response;
import org.openapitools.client.model.IserverReplyReplyIdPost200Response;
import org.openapitools.client.model.IserverReplyReplyIdPostRequest;
import org.openapitools.client.model.LiveOrdersResponse;
import org.openapitools.client.model.OrderPreview;
import org.openapitools.client.model.SingleOrderSubmissionRequest;
import org.openapitools.client.model.TradesResponseInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TradingOrdersApi
 */
@Disabled
public class TradingOrdersApiTest {

    private final TradingOrdersApi api = new TradingOrdersApi();

    /**
     * Cancel An Existing, Unfilled Order.
     *
     * Cancel an existing, unfilled order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrderOrderIdDeleteTest() throws ApiException {
        String accountId = null;
        String orderId = null;
        IserverAccountAccountIdOrderOrderIdDelete200Response response = api.iserverAccountAccountIdOrderOrderIdDelete(accountId, orderId);
        // TODO: test validations
    }

    /**
     * Modify An Existing, Unfilled Order.
     *
     * Modify an existing, unfilled order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrderOrderIdPostTest() throws ApiException {
        String accountId = null;
        String orderId = null;
        SingleOrderSubmissionRequest singleOrderSubmissionRequest = null;
        IserverAccountAccountIdOrderOrderIdPost200Response response = api.iserverAccountAccountIdOrderOrderIdPost(accountId, orderId, singleOrderSubmissionRequest);
        // TODO: test validations
    }

    /**
     * Submit A New Order(s) Ticket, Bracket, Or OCA Group.
     *
     * Submit a new order(s) ticket, bracket, or OCA group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrdersPostTest() throws ApiException {
        String accountId = null;
        List<SingleOrderSubmissionRequest> singleOrderSubmissionRequest = null;
        IserverAccountAccountIdOrderOrderIdPost200Response response = api.iserverAccountAccountIdOrdersPost(accountId, singleOrderSubmissionRequest);
        // TODO: test validations
    }

    /**
     * Preview The Projected Effects Of An Order Ticket Or Bracket Of Orders, Including Cost And Changes To Margin And Account Equity.
     *
     * Preview the projected effects of an order ticket or bracket of orders, including cost and changes to margin and account equity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountAccountIdOrdersWhatifPostTest() throws ApiException {
        String accountId = null;
        List<SingleOrderSubmissionRequest> singleOrderSubmissionRequest = null;
        OrderPreview response = api.iserverAccountAccountIdOrdersWhatifPost(accountId, singleOrderSubmissionRequest);
        // TODO: test validations
    }

    /**
     * Retrieve The Status Of A Single Order.
     *
     * Retrieve the status of a single order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountOrderStatusOrderIdGetTest() throws ApiException {
        String orderId = null;
        IserverAccountOrderStatusOrderIdGet200Response response = api.iserverAccountOrderStatusOrderIdGet(orderId);
        // TODO: test validations
    }

    /**
     * Retrieves Open Orders And Filled Or Cancelled Orders Submitted During The Current Brokerage Session.
     *
     * Retrieves open orders and filled or cancelled orders submitted during the current brokerage session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountOrdersGetTest() throws ApiException {
        String filters = null;
        Boolean force = null;
        String accountId = null;
        LiveOrdersResponse response = api.iserverAccountOrdersGet(filters, force, accountId);
        // TODO: test validations
    }

    /**
     * Retrieve A List Of Trades.
     *
     * Retrieve a list of trades, up to a maximum of 7 days prior.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountTradesGetTest() throws ApiException {
        String days = null;
        String accountId = null;
        List<TradesResponseInner> response = api.iserverAccountTradesGet(days, accountId);
        // TODO: test validations
    }

    /**
     * Respond To A Server Prompt.
     *
     * Respond to a server prompt received via ntf webscoket message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverNotificationPostTest() throws ApiException {
        IserverNotificationPostRequest iserverNotificationPostRequest = null;
        String response = api.iserverNotificationPost(iserverNotificationPostRequest);
        // TODO: test validations
    }

    /**
     * Suppress The Specified Order Reply Messages.
     *
     * Suppress the specified order reply messages for the duration of the brokerage session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverQuestionsSuppressPostTest() throws ApiException {
        IserverQuestionsSuppressPostRequest iserverQuestionsSuppressPostRequest = null;
        IserverQuestionsSuppressPost200Response response = api.iserverQuestionsSuppressPost(iserverQuestionsSuppressPostRequest);
        // TODO: test validations
    }

    /**
     * Removes Suppression Of All Order Reply Messages.
     *
     * Removes suppression of all order reply messages that were previously suppressed in the current brokerage session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverQuestionsSuppressResetPostTest() throws ApiException {
        IserverQuestionsSuppressResetPost200Response response = api.iserverQuestionsSuppressResetPost();
        // TODO: test validations
    }

    /**
     * Confirm An Order Reply Message.
     *
     * Confirm an order reply message and continue with submission of order ticket.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverReplyReplyIdPostTest() throws ApiException {
        String replyId = null;
        IserverReplyReplyIdPostRequest iserverReplyReplyIdPostRequest = null;
        IserverReplyReplyIdPost200Response response = api.iserverReplyReplyIdPost(replyId, iserverReplyReplyIdPostRequest);
        // TODO: test validations
    }

}
