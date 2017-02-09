package com.dropbuddies.client;

import com.dropbuddies.ApiClient;
import com.dropbuddies.core.client.Error;
import com.dropbuddies.core.client.CompleteOrderResponse;
import com.dropbuddies.core.client.Order;
import com.dropbuddies.core.client.InlineResponse2003;
import com.dropbuddies.core.client.InlineResponse2002;
import com.dropbuddies.core.client.CompleteOrder;
import com.dropbuddies.core.client.Location;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
public class PaymentsApiTest {

    private PaymentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentsApi.class);
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
    
}
