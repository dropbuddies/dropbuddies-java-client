# PaymentsApi

All URIs are relative to *http://api.dropbuddies.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiOrdersApproveOrderIdPost**](PaymentsApi.md#apiOrdersApproveOrderIdPost) | **POST** api/orders/approve/{order_id} | Allows a dropbuddy approve a dropbuddy&#39;s proposal
[**apiOrdersEstimateCustomPost**](PaymentsApi.md#apiOrdersEstimateCustomPost) | **POST** api/orders/estimate/custom | Information about estimating custom orders
[**apiOrdersEstimatePost**](PaymentsApi.md#apiOrdersEstimatePost) | **POST** api/orders/estimate | Generate an estimated cost based on request preferences
[**apiOrdersPlaceDispatchPost**](PaymentsApi.md#apiOrdersPlaceDispatchPost) | **POST** api/orders/place/dispatch | You can place dispatch type requests via this endpoint
[**apiOrdersPlaceFoodPost**](PaymentsApi.md#apiOrdersPlaceFoodPost) | **POST** api/orders/place/food | Place shopping type requests
[**apiOrdersPlaceShoppingPost**](PaymentsApi.md#apiOrdersPlaceShoppingPost) | **POST** api/orders/place/shopping | Place shopping type requests


<a name="apiOrdersApproveOrderIdPost"></a>
# **apiOrdersApproveOrderIdPost**
> CompleteOrderResponse apiOrdersApproveOrderIdPost(orderId, dropbuddyId)

Allows a dropbuddy approve a dropbuddy&#39;s proposal

Only custom requests can be approved. Returns a payment information so that dropbuddy can make payment

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String orderId = "orderId_example"; // String | Order identifier value
String dropbuddyId = "dropbuddyId_example"; // String | DropBuddy Identification value
try {
    CompleteOrderResponse result = apiInstance.apiOrdersApproveOrderIdPost(orderId, dropbuddyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#apiOrdersApproveOrderIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |
 **dropbuddyId** | **String**| DropBuddy Identification value | [optional]

### Return type

[**CompleteOrderResponse**](CompleteOrderResponse.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersEstimateCustomPost"></a>
# **apiOrdersEstimateCustomPost**
> InlineResponse2003 apiOrdersEstimateCustomPost(body)

Information about estimating custom orders

Information about estimating custom orders

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
Order body = new Order(); // Order | Should be sent as body of the request
try {
    InlineResponse2003 result = apiInstance.apiOrdersEstimateCustomPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#apiOrdersEstimateCustomPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Should be sent as body of the request |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersEstimatePost"></a>
# **apiOrdersEstimatePost**
> InlineResponse2002 apiOrdersEstimatePost(body)

Generate an estimated cost based on request preferences

Generate an estimated cost based on request preferences

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
Order body = new Order(); // Order | Should be sent as body of the request
try {
    InlineResponse2002 result = apiInstance.apiOrdersEstimatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#apiOrdersEstimatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Should be sent as body of the request |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersPlaceDispatchPost"></a>
# **apiOrdersPlaceDispatchPost**
> CompleteOrder apiOrdersPlaceDispatchPost(pickupAddress, dropoffAddress, pickupLocation, dropoffLocation, description, recipientName, recipientPhonenumber, valueOfItem, itemType, deliveryType, pickupName, pickupPhonenumber, pickupEmail, recipientEmail, source, pickupTime, dropoffTime, quantity, sizeFit)

You can place dispatch type requests via this endpoint

More information

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String pickupAddress = "pickupAddress_example"; // String | Geocode selected on the map by the user for the pickup address
String dropoffAddress = "dropoffAddress_example"; // String | Geocode selected on the map by the user for the dropoff address
Location pickupLocation = new Location(); // Location | Location object for the pickup address. This is more precise and recommended
Location dropoffLocation = new Location(); // Location | Location object for the dropoff address. This is more precise and recommended
String description = "description_example"; // String | Information describing the request
String recipientName = "recipientName_example"; // String | Name of recipient is required
String recipientPhonenumber = "recipientPhonenumber_example"; // String | Phonenumber of recipient is required
Double valueOfItem = 3.4D; // Double | Items value
String itemType = "itemType_example"; // String | Defaults to `parcel` - Avaliable options `document`, `parcel`, `other`
String deliveryType = "deliveryType_example"; // String | Defaults to `REGULAR` if not set `REGULAR`, `NEXTDAY`, `PRIME`
String pickupName = "pickupName_example"; // String | Uses user information if not provided
String pickupPhonenumber = "pickupPhonenumber_example"; // String | Uses user information if not provided
String pickupEmail = "pickupEmail_example"; // String | defaults user information if not provided
String recipientEmail = "recipientEmail_example"; // String | Recipient email address not necessary
String source = "source_example"; // String | Source of the request
Long pickupTime = 789L; // Long | Pickup Time in millis
Long dropoffTime = 789L; // Long | Pickup Time in millis
Integer quantity = 56; // Integer | Quantity of items that should be delivered. Item must be the same
String sizeFit = "sizeFit_example"; // String | Defaults to `BIKE` if not set `TRUCK`, `CAR`, `BIKE`, `BAG`
try {
    CompleteOrder result = apiInstance.apiOrdersPlaceDispatchPost(pickupAddress, dropoffAddress, pickupLocation, dropoffLocation, description, recipientName, recipientPhonenumber, valueOfItem, itemType, deliveryType, pickupName, pickupPhonenumber, pickupEmail, recipientEmail, source, pickupTime, dropoffTime, quantity, sizeFit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#apiOrdersPlaceDispatchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickupAddress** | **String**| Geocode selected on the map by the user for the pickup address |
 **dropoffAddress** | **String**| Geocode selected on the map by the user for the dropoff address |
 **pickupLocation** | [**Location**](Location.md)| Location object for the pickup address. This is more precise and recommended |
 **dropoffLocation** | [**Location**](Location.md)| Location object for the dropoff address. This is more precise and recommended |
 **description** | **String**| Information describing the request |
 **recipientName** | **String**| Name of recipient is required |
 **recipientPhonenumber** | **String**| Phonenumber of recipient is required |
 **valueOfItem** | **Double**| Items value |
 **itemType** | **String**| Defaults to &#x60;parcel&#x60; - Avaliable options &#x60;document&#x60;, &#x60;parcel&#x60;, &#x60;other&#x60; | [optional]
 **deliveryType** | **String**| Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; | [optional]
 **pickupName** | **String**| Uses user information if not provided | [optional]
 **pickupPhonenumber** | **String**| Uses user information if not provided | [optional]
 **pickupEmail** | **String**| defaults user information if not provided | [optional]
 **recipientEmail** | **String**| Recipient email address not necessary | [optional]
 **source** | **String**| Source of the request | [optional]
 **pickupTime** | **Long**| Pickup Time in millis | [optional]
 **dropoffTime** | **Long**| Pickup Time in millis | [optional]
 **quantity** | **Integer**| Quantity of items that should be delivered. Item must be the same | [optional]
 **sizeFit** | **String**| Defaults to &#x60;BIKE&#x60; if not set &#x60;TRUCK&#x60;, &#x60;CAR&#x60;, &#x60;BIKE&#x60;, &#x60;BAG&#x60; | [optional]

### Return type

[**CompleteOrder**](CompleteOrder.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersPlaceFoodPost"></a>
# **apiOrdersPlaceFoodPost**
> CompleteOrder apiOrdersPlaceFoodPost(pickupLocation, dropoffLocation, recipientName, recipientPhonenumber, description, recipientEmail, valueOfItem, sizeFit, deliveryType, source, pickupTime, dropoffTime)

Place shopping type requests

More Information

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
Location pickupLocation = new Location(); // Location | Location object for the pickup address. This is more precise and recommended
Location dropoffLocation = new Location(); // Location | Location object for the dropoff address. This is more precise and recommended
String recipientName = "recipientName_example"; // String | Name of recipient is required
String recipientPhonenumber = "recipientPhonenumber_example"; // String | Phonenumber of recipient is required
String description = "description_example"; // String | Information describing the request
String recipientEmail = "recipientEmail_example"; // String | Recipient email address not necessary
Double valueOfItem = 3.4D; // Double | Total Shopping value
String sizeFit = "sizeFit_example"; // String | Defaults to `BIKE` if not set `TRUCK`, `CAR`, `BIKE`, `BAG`
String deliveryType = "deliveryType_example"; // String | Defaults to `REGULAR` if not set `REGULAR`, `NEXTDAY`, `PRIME`
String source = "source_example"; // String | Source of the request
Long pickupTime = 789L; // Long | Pickup Time in millis
Long dropoffTime = 789L; // Long | Pickup Time in millis
try {
    CompleteOrder result = apiInstance.apiOrdersPlaceFoodPost(pickupLocation, dropoffLocation, recipientName, recipientPhonenumber, description, recipientEmail, valueOfItem, sizeFit, deliveryType, source, pickupTime, dropoffTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#apiOrdersPlaceFoodPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickupLocation** | [**Location**](Location.md)| Location object for the pickup address. This is more precise and recommended |
 **dropoffLocation** | [**Location**](Location.md)| Location object for the dropoff address. This is more precise and recommended |
 **recipientName** | **String**| Name of recipient is required |
 **recipientPhonenumber** | **String**| Phonenumber of recipient is required |
 **description** | **String**| Information describing the request |
 **recipientEmail** | **String**| Recipient email address not necessary | [optional]
 **valueOfItem** | **Double**| Total Shopping value | [optional]
 **sizeFit** | **String**| Defaults to &#x60;BIKE&#x60; if not set &#x60;TRUCK&#x60;, &#x60;CAR&#x60;, &#x60;BIKE&#x60;, &#x60;BAG&#x60; | [optional]
 **deliveryType** | **String**| Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; | [optional]
 **source** | **String**| Source of the request | [optional]
 **pickupTime** | **Long**| Pickup Time in millis | [optional]
 **dropoffTime** | **Long**| Pickup Time in millis | [optional]

### Return type

[**CompleteOrder**](CompleteOrder.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersPlaceShoppingPost"></a>
# **apiOrdersPlaceShoppingPost**
> CompleteOrder apiOrdersPlaceShoppingPost(pickupLocation, dropoffLocation, recipientName, recipientPhonenumber, description, valueOfItem, recipientEmail, sizeFit, deliveryType, source, pickupTime, dropoffTime)

Place shopping type requests

More Information

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
Location pickupLocation = new Location(); // Location | Location object for the pickup address. This is more precise and recommended
Location dropoffLocation = new Location(); // Location | Location object for the dropoff address. This is more precise and recommended
String recipientName = "recipientName_example"; // String | Name of recipient is required
String recipientPhonenumber = "recipientPhonenumber_example"; // String | Phonenumber of recipient is required
String description = "description_example"; // String | Information describing the request
Double valueOfItem = 3.4D; // Double | Total Shopping value
String recipientEmail = "recipientEmail_example"; // String | Recipient email address not necessary
String sizeFit = "sizeFit_example"; // String | Defaults to `BIKE` if not set `TRUCK`, `CAR`, `BIKE`, `BAG`
String deliveryType = "deliveryType_example"; // String | Defaults to `REGULAR` if not set `REGULAR`, `NEXTDAY`, `PRIME`
String source = "source_example"; // String | Source of the request
Long pickupTime = 789L; // Long | Pickup Time in millis
Long dropoffTime = 789L; // Long | Pickup Time in millis
try {
    CompleteOrder result = apiInstance.apiOrdersPlaceShoppingPost(pickupLocation, dropoffLocation, recipientName, recipientPhonenumber, description, valueOfItem, recipientEmail, sizeFit, deliveryType, source, pickupTime, dropoffTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#apiOrdersPlaceShoppingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickupLocation** | [**Location**](Location.md)| Location object for the pickup address. This is more precise and recommended |
 **dropoffLocation** | [**Location**](Location.md)| Location object for the dropoff address. This is more precise and recommended |
 **recipientName** | **String**| Name of recipient is required |
 **recipientPhonenumber** | **String**| Phonenumber of recipient is required |
 **description** | **String**| Information describing the request |
 **valueOfItem** | **Double**| Total Shopping value |
 **recipientEmail** | **String**| Recipient email address not necessary | [optional]
 **sizeFit** | **String**| Defaults to &#x60;BIKE&#x60; if not set &#x60;TRUCK&#x60;, &#x60;CAR&#x60;, &#x60;BIKE&#x60;, &#x60;BAG&#x60; | [optional]
 **deliveryType** | **String**| Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; | [optional]
 **source** | **String**| Source of the request | [optional]
 **pickupTime** | **Long**| Pickup Time in millis | [optional]
 **dropoffTime** | **Long**| Pickup Time in millis | [optional]

### Return type

[**CompleteOrder**](CompleteOrder.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

