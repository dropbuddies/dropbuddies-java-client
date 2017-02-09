package com.dropbuddies.client;

import com.dropbuddies.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrdersApi {
  /**
   * Get all the dropbuddies who accepted a request
   * You can retrieve all the dropbuddies that accepted a request
   * @param orderId Order identifier value (required)
   * @return Call&lt;Acceptors&gt;
   */
  
  @GET("api/orders/accept/{order_id}")
  Call<Acceptors> apiOrdersAcceptOrderIdGet(
    @Path("order_id") String orderId
  );

  /**
   * Accept orders
   * A signed in dropbuddy can accept a pending request
   * @param orderId Order identifier value (required)
   * @param priceSuggestion Supplied using this field is the amount a dropbuddy is willing to accept for a request. (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("api/orders/accept/{order_id}")
  Call<Void> apiOrdersAcceptOrderIdPost(
    @Path("order_id") String orderId, @Body Double priceSuggestion
  );

  /**
   * Allows a dropbuddy approve a dropbuddy&#39;s proposal
   * Only custom requests can be approved. Returns a payment information so that dropbuddy can make payment
   * @param orderId Order identifier value (required)
   * @param dropbuddyId DropBuddy Identification value (optional)
   * @return Call&lt;CompleteOrderResponse&gt;
   */
  
  @POST("api/orders/approve/{order_id}")
  Call<CompleteOrderResponse> apiOrdersApproveOrderIdPost(
    @Path("order_id") String orderId, @Body String dropbuddyId
  );

  /**
   * Cancel orders that have failed or completed
   * Brief summary
   * @param orderId Order identifier value (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("api/orders/cancel/{order_id}")
  Call<Void> apiOrdersCancelOrderIdPost(
    @Path("order_id") String orderId
  );

  /**
   * DropBuddy can drop a request only 5mins after accepting a request
   * DropBuddy can drop a request only 5mins after accepting a request
   * @param orderId Order identifier value (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("api/orders/drop/{order_id}")
  Call<Void> apiOrdersDropOrderIdPost(
    @Path("order_id") String orderId
  );

  /**
   * Information about estimating custom orders
   * Information about estimating custom orders
   * @param body Should be sent as body of the request (required)
   * @return Call&lt;InlineResponse2003&gt;
   */
  
  @POST("api/orders/estimate/custom")
  Call<InlineResponse2003> apiOrdersEstimateCustomPost(
    @Body Order body
  );

  /**
   * Generate an estimated cost based on request preferences
   * Generate an estimated cost based on request preferences
   * @param body Should be sent as body of the request (required)
   * @return Call&lt;InlineResponse2002&gt;
   */
  
  @POST("api/orders/estimate")
  Call<InlineResponse2002> apiOrdersEstimatePost(
    @Body Order body
  );

  /**
   * Returns all the requests and orders made by user
   * History
   * @return Call&lt;InlineResponse2004&gt;
   */
  
  @GET("api/orders/history")
  Call<InlineResponse2004> apiOrdersHistoryGet();
    

  /**
   * Returns a single order information
   * Return order information
   * @param orderId Order identifier value (required)
   * @return Call&lt;InlineResponse2005&gt;
   */
  
  @GET("api/orders/{order_id}")
  Call<InlineResponse2005> apiOrdersOrderIdGet(
    @Path("order_id") String orderId
  );

  /**
   * Returns pending requests within a particular location if the location is provided
   * Pending Requests
   * @param keyword Keyword (optional)
   * @param limit Limit Results amount (optional)
   * @param mode Order DESC or ASC (optional)
   * @param orderby Order the responses in a certain way (optional)
   * @param longitude Longitude value of client (optional)
   * @param latitude Latitude value of client (optional)
   * @return Call&lt;InlineResponse2004&gt;
   */
  
  @GET("api/orders/pending")
  Call<InlineResponse2004> apiOrdersPendingGet(
    @Query("keyword") String keyword, @Query("limit") Integer limit, @Query("mode") String mode, @Query("orderby") String orderby, @Query("longitude") Double longitude, @Query("latitude") Double latitude
  );

  /**
   * Place shopping type requests
   * More Information
   * @param pickupLocation Location object for the pickup address. This is more precise and recommended (required)
   * @param description Information describing the request (required)
   * @param valueOfItem Total Shopping value (required)
   * @param suggestedPrice Amount user is willing to pay for request (required)
   * @param pickupTime Pickup Time in millis (required)
   * @param deliveryType Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; (optional)
   * @param source Source of the request (optional)
   * @return Call&lt;CompleteOrder&gt;
   */
  
  @POST("api/orders/place/custom")
  Call<CompleteOrder> apiOrdersPlaceCustomPost(
    @Body Location pickupLocation, @Body String description, @Body Double valueOfItem, @Body Double suggestedPrice, @Body Long pickupTime, @Body String deliveryType, @Body String source
  );

  /**
   * You can place dispatch type requests via this endpoint
   * More information
   * @param pickupAddress Geocode selected on the map by the user for the pickup address (required)
   * @param dropoffAddress Geocode selected on the map by the user for the dropoff address (required)
   * @param pickupLocation Location object for the pickup address. This is more precise and recommended (required)
   * @param dropoffLocation Location object for the dropoff address. This is more precise and recommended (required)
   * @param description Information describing the request (required)
   * @param recipientName Name of recipient is required (required)
   * @param recipientPhonenumber Phonenumber of recipient is required (required)
   * @param valueOfItem Items value (required)
   * @param itemType Defaults to &#x60;parcel&#x60; - Avaliable options &#x60;document&#x60;, &#x60;parcel&#x60;, &#x60;other&#x60; (optional)
   * @param deliveryType Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; (optional)
   * @param pickupName Uses user information if not provided (optional)
   * @param pickupPhonenumber Uses user information if not provided (optional)
   * @param pickupEmail defaults user information if not provided (optional)
   * @param recipientEmail Recipient email address not necessary (optional)
   * @param source Source of the request (optional)
   * @param pickupTime Pickup Time in millis (optional)
   * @param dropoffTime Pickup Time in millis (optional)
   * @param quantity Quantity of items that should be delivered. Item must be the same (optional)
   * @param sizeFit Defaults to &#x60;BIKE&#x60; if not set &#x60;TRUCK&#x60;, &#x60;CAR&#x60;, &#x60;BIKE&#x60;, &#x60;BAG&#x60; (optional)
   * @return Call&lt;CompleteOrder&gt;
   */
  
  @POST("api/orders/place/dispatch")
  Call<CompleteOrder> apiOrdersPlaceDispatchPost(
    @Body String pickupAddress, @Body String dropoffAddress, @Body Location pickupLocation, @Body Location dropoffLocation, @Body String description, @Body String recipientName, @Body String recipientPhonenumber, @Body Double valueOfItem, @Body String itemType, @Body String deliveryType, @Body String pickupName, @Body String pickupPhonenumber, @Body String pickupEmail, @Body String recipientEmail, @Body String source, @Body Long pickupTime, @Body Long dropoffTime, @Body Integer quantity, @Body String sizeFit
  );

  /**
   * Place shopping type requests
   * More Information
   * @param pickupLocation Location object for the pickup address. This is more precise and recommended (required)
   * @param dropoffLocation Location object for the dropoff address. This is more precise and recommended (required)
   * @param recipientName Name of recipient is required (required)
   * @param recipientPhonenumber Phonenumber of recipient is required (required)
   * @param description Information describing the request (required)
   * @param recipientEmail Recipient email address not necessary (optional)
   * @param valueOfItem Total Shopping value (optional)
   * @param sizeFit Defaults to &#x60;BIKE&#x60; if not set &#x60;TRUCK&#x60;, &#x60;CAR&#x60;, &#x60;BIKE&#x60;, &#x60;BAG&#x60; (optional)
   * @param deliveryType Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; (optional)
   * @param source Source of the request (optional)
   * @param pickupTime Pickup Time in millis (optional)
   * @param dropoffTime Pickup Time in millis (optional)
   * @return Call&lt;CompleteOrder&gt;
   */
  
  @POST("api/orders/place/food")
  Call<CompleteOrder> apiOrdersPlaceFoodPost(
    @Body Location pickupLocation, @Body Location dropoffLocation, @Body String recipientName, @Body String recipientPhonenumber, @Body String description, @Body String recipientEmail, @Body Double valueOfItem, @Body String sizeFit, @Body String deliveryType, @Body String source, @Body Long pickupTime, @Body Long dropoffTime
  );

  /**
   * Place shopping type requests
   * More Information
   * @param pickupLocation Location object for the pickup address. This is more precise and recommended (required)
   * @param dropoffLocation Location object for the dropoff address. This is more precise and recommended (required)
   * @param recipientName Name of recipient is required (required)
   * @param recipientPhonenumber Phonenumber of recipient is required (required)
   * @param description Information describing the request (required)
   * @param valueOfItem Total Shopping value (required)
   * @param recipientEmail Recipient email address not necessary (optional)
   * @param sizeFit Defaults to &#x60;BIKE&#x60; if not set &#x60;TRUCK&#x60;, &#x60;CAR&#x60;, &#x60;BIKE&#x60;, &#x60;BAG&#x60; (optional)
   * @param deliveryType Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; (optional)
   * @param source Source of the request (optional)
   * @param pickupTime Pickup Time in millis (optional)
   * @param dropoffTime Pickup Time in millis (optional)
   * @return Call&lt;CompleteOrder&gt;
   */
  
  @POST("api/orders/place/shopping")
  Call<CompleteOrder> apiOrdersPlaceShoppingPost(
    @Body Location pickupLocation, @Body Location dropoffLocation, @Body String recipientName, @Body String recipientPhonenumber, @Body String description, @Body Double valueOfItem, @Body String recipientEmail, @Body String sizeFit, @Body String deliveryType, @Body String source, @Body Long pickupTime, @Body Long dropoffTime
  );

  /**
   * Rate a dropbuddy after delivery is completed. User cannot rate an order until delivery_status is completed
   * A dropbuddy after delivery
   * @param orderId Order identifier value (required)
   * @param rating Rating value is between 0-5 (required)
   * @param ratingMessage User can add a message (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("api/orders/rate/{order_id}")
  Call<Void> apiOrdersRateOrderIdPost(
    @Path("order_id") String orderId, @Body Integer rating, @Body String ratingMessage
  );

  /**
   * You can set any values within the order class. The object is sanitized
   * Information about update
   * @param orderId Order identifier value (required)
   * @param body Should be sent as body of the request (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("api/orders/update/{order_id}")
  Call<Void> apiOrdersUpdateOrderIdPost(
    @Path("order_id") String orderId, @Body Order body
  );

  /**
   * 
   * 
   * @param orderId Order identifier value (required)
   * @param deliveryStatus The status that the delivery should be updated to (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("api/orders/update/status/{order_id}")
  Call<Void> apiOrdersUpdateStatusOrderIdPost(
    @Path("order_id") String orderId, @Body String deliveryStatus
  );

}
