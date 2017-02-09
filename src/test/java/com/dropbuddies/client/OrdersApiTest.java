package com.dropbuddies.client;

import com.dropbuddies.ApiClient;
import com.dropbuddies.core.client.Error;
import com.dropbuddies.core.client.Acceptors;
import com.dropbuddies.core.client.CompleteOrderResponse;
import com.dropbuddies.core.client.Order;
import com.dropbuddies.core.client.InlineResponse2003;
import com.dropbuddies.core.client.InlineResponse2002;
import com.dropbuddies.core.client.InlineResponse2004;
import com.dropbuddies.core.client.InlineResponse2005;
import com.dropbuddies.core.client.CompleteOrder;
import com.dropbuddies.core.client.Location;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
public class OrdersApiTest {

    private OrdersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OrdersApi.class);
    }

    
    /**
     * Get all the dropbuddies who accepted a request
     *
     * You can retrieve all the dropbuddies that accepted a request
     */
    @Test
    public void apiOrdersAcceptOrderIdGetTest() {
        String orderId = null;
        // Acceptors response = api.apiOrdersAcceptOrderIdGet(orderId);

        // TODO: test validations
    }
    
    /**
     * Accept orders
     *
     * A signed in dropbuddy can accept a pending request
     */
    @Test
    public void apiOrdersAcceptOrderIdPostTest() {
        String orderId = null;
        Double priceSuggestion = null;
        // Void response = api.apiOrdersAcceptOrderIdPost(orderId, priceSuggestion);

        // TODO: test validations
    }
    
    /**
     * Allows a dropbuddy approve a dropbuddy&#39;s proposal
     *
     * Only custom requests can be approved. Returns a payment information so that dropbuddy can make payment
     */
    @Test
    public void apiOrdersApproveOrderIdPostTest() {
        String orderId = null;
        String dropbuddyId = null;
        // CompleteOrderResponse response = api.apiOrdersApproveOrderIdPost(orderId, dropbuddyId);

        // TODO: test validations
    }
    
    /**
     * Cancel orders that have failed or completed
     *
     * Brief summary
     */
    @Test
    public void apiOrdersCancelOrderIdPostTest() {
        String orderId = null;
        // Void response = api.apiOrdersCancelOrderIdPost(orderId);

        // TODO: test validations
    }
    
    /**
     * DropBuddy can drop a request only 5mins after accepting a request
     *
     * DropBuddy can drop a request only 5mins after accepting a request
     */
    @Test
    public void apiOrdersDropOrderIdPostTest() {
        String orderId = null;
        // Void response = api.apiOrdersDropOrderIdPost(orderId);

        // TODO: test validations
    }
    
    /**
     * Information about estimating custom orders
     *
     * Information about estimating custom orders
     */
    @Test
    public void apiOrdersEstimateCustomPostTest() {
        Order body = null;
        // InlineResponse2003 response = api.apiOrdersEstimateCustomPost(body);

        // TODO: test validations
    }
    
    /**
     * Generate an estimated cost based on request preferences
     *
     * Generate an estimated cost based on request preferences
     */
    @Test
    public void apiOrdersEstimatePostTest() {
        Order body = null;
        // InlineResponse2002 response = api.apiOrdersEstimatePost(body);

        // TODO: test validations
    }
    
    /**
     * Returns all the requests and orders made by user
     *
     * History
     */
    @Test
    public void apiOrdersHistoryGetTest() {
        // InlineResponse2004 response = api.apiOrdersHistoryGet();

        // TODO: test validations
    }
    
    /**
     * Returns a single order information
     *
     * Return order information
     */
    @Test
    public void apiOrdersOrderIdGetTest() {
        String orderId = null;
        // InlineResponse2005 response = api.apiOrdersOrderIdGet(orderId);

        // TODO: test validations
    }
    
    /**
     * Returns pending requests within a particular location if the location is provided
     *
     * Pending Requests
     */
    @Test
    public void apiOrdersPendingGetTest() {
        String keyword = null;
        Integer limit = null;
        String mode = null;
        String orderby = null;
        Double longitude = null;
        Double latitude = null;
        // InlineResponse2004 response = api.apiOrdersPendingGet(keyword, limit, mode, orderby, longitude, latitude);

        // TODO: test validations
    }
    
    /**
     * Place shopping type requests
     *
     * More Information
     */
    @Test
    public void apiOrdersPlaceCustomPostTest() {
        Location pickupLocation = null;
        String description = null;
        Double valueOfItem = null;
        Double suggestedPrice = null;
        Long pickupTime = null;
        String deliveryType = null;
        String source = null;
        // CompleteOrder response = api.apiOrdersPlaceCustomPost(pickupLocation, description, valueOfItem, suggestedPrice, pickupTime, deliveryType, source);

        // TODO: test validations
    }
    
    /**
     * You can place dispatch type requests via this endpoint
     *
     * More information
     */
    @Test
    public void apiOrdersPlaceDispatchPostTest() {
        String pickupAddress = null;
        String dropoffAddress = null;
        Location pickupLocation = null;
        Location dropoffLocation = null;
        String description = null;
        String recipientName = null;
        String recipientPhonenumber = null;
        Double valueOfItem = null;
        String itemType = null;
        String deliveryType = null;
        String pickupName = null;
        String pickupPhonenumber = null;
        String pickupEmail = null;
        String recipientEmail = null;
        String source = null;
        Long pickupTime = null;
        Long dropoffTime = null;
        Integer quantity = null;
        String sizeFit = null;
        // CompleteOrder response = api.apiOrdersPlaceDispatchPost(pickupAddress, dropoffAddress, pickupLocation, dropoffLocation, description, recipientName, recipientPhonenumber, valueOfItem, itemType, deliveryType, pickupName, pickupPhonenumber, pickupEmail, recipientEmail, source, pickupTime, dropoffTime, quantity, sizeFit);

        // TODO: test validations
    }
    
    /**
     * Place shopping type requests
     *
     * More Information
     */
    @Test
    public void apiOrdersPlaceFoodPostTest() {
        Location pickupLocation = null;
        Location dropoffLocation = null;
        String recipientName = null;
        String recipientPhonenumber = null;
        String description = null;
        String recipientEmail = null;
        Double valueOfItem = null;
        String sizeFit = null;
        String deliveryType = null;
        String source = null;
        Long pickupTime = null;
        Long dropoffTime = null;
        // CompleteOrder response = api.apiOrdersPlaceFoodPost(pickupLocation, dropoffLocation, recipientName, recipientPhonenumber, description, recipientEmail, valueOfItem, sizeFit, deliveryType, source, pickupTime, dropoffTime);

        // TODO: test validations
    }
    
    /**
     * Place shopping type requests
     *
     * More Information
     */
    @Test
    public void apiOrdersPlaceShoppingPostTest() {
        Location pickupLocation = null;
        Location dropoffLocation = null;
        String recipientName = null;
        String recipientPhonenumber = null;
        String description = null;
        Double valueOfItem = null;
        String recipientEmail = null;
        String sizeFit = null;
        String deliveryType = null;
        String source = null;
        Long pickupTime = null;
        Long dropoffTime = null;
        // CompleteOrder response = api.apiOrdersPlaceShoppingPost(pickupLocation, dropoffLocation, recipientName, recipientPhonenumber, description, valueOfItem, recipientEmail, sizeFit, deliveryType, source, pickupTime, dropoffTime);

        // TODO: test validations
    }
    
    /**
     * Rate a dropbuddy after delivery is completed. User cannot rate an order until delivery_status is completed
     *
     * A dropbuddy after delivery
     */
    @Test
    public void apiOrdersRateOrderIdPostTest() {
        String orderId = null;
        Integer rating = null;
        String ratingMessage = null;
        // Void response = api.apiOrdersRateOrderIdPost(orderId, rating, ratingMessage);

        // TODO: test validations
    }
    
    /**
     * You can set any values within the order class. The object is sanitized
     *
     * Information about update
     */
    @Test
    public void apiOrdersUpdateOrderIdPostTest() {
        String orderId = null;
        Order body = null;
        // Void response = api.apiOrdersUpdateOrderIdPost(orderId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void apiOrdersUpdateStatusOrderIdPostTest() {
        String orderId = null;
        String deliveryStatus = null;
        // Void response = api.apiOrdersUpdateStatusOrderIdPost(orderId, deliveryStatus);

        // TODO: test validations
    }
    
}
