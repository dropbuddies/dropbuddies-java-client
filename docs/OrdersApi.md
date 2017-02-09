# OrdersApi

All URIs are relative to *http://api.dropbuddies.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiOrdersAcceptOrderIdGet**](OrdersApi.md#apiOrdersAcceptOrderIdGet) | **GET** api/orders/accept/{order_id} | Get all the dropbuddies who accepted a request
[**apiOrdersAcceptOrderIdPost**](OrdersApi.md#apiOrdersAcceptOrderIdPost) | **POST** api/orders/accept/{order_id} | Accept orders
[**apiOrdersApproveOrderIdPost**](OrdersApi.md#apiOrdersApproveOrderIdPost) | **POST** api/orders/approve/{order_id} | Allows a dropbuddy approve a dropbuddy&#39;s proposal
[**apiOrdersCancelOrderIdPost**](OrdersApi.md#apiOrdersCancelOrderIdPost) | **POST** api/orders/cancel/{order_id} | Cancel orders that have failed or completed
[**apiOrdersDropOrderIdPost**](OrdersApi.md#apiOrdersDropOrderIdPost) | **POST** api/orders/drop/{order_id} | DropBuddy can drop a request only 5mins after accepting a request
[**apiOrdersEstimateCustomPost**](OrdersApi.md#apiOrdersEstimateCustomPost) | **POST** api/orders/estimate/custom | Information about estimating custom orders
[**apiOrdersEstimatePost**](OrdersApi.md#apiOrdersEstimatePost) | **POST** api/orders/estimate | Generate an estimated cost based on request preferences
[**apiOrdersHistoryGet**](OrdersApi.md#apiOrdersHistoryGet) | **GET** api/orders/history | Returns all the requests and orders made by user
[**apiOrdersOrderIdGet**](OrdersApi.md#apiOrdersOrderIdGet) | **GET** api/orders/{order_id} | Returns a single order information
[**apiOrdersPendingGet**](OrdersApi.md#apiOrdersPendingGet) | **GET** api/orders/pending | Returns pending requests within a particular location if the location is provided
[**apiOrdersPlaceCustomPost**](OrdersApi.md#apiOrdersPlaceCustomPost) | **POST** api/orders/place/custom | Place shopping type requests
[**apiOrdersPlaceDispatchPost**](OrdersApi.md#apiOrdersPlaceDispatchPost) | **POST** api/orders/place/dispatch | You can place dispatch type requests via this endpoint
[**apiOrdersPlaceFoodPost**](OrdersApi.md#apiOrdersPlaceFoodPost) | **POST** api/orders/place/food | Place shopping type requests
[**apiOrdersPlaceShoppingPost**](OrdersApi.md#apiOrdersPlaceShoppingPost) | **POST** api/orders/place/shopping | Place shopping type requests
[**apiOrdersRateOrderIdPost**](OrdersApi.md#apiOrdersRateOrderIdPost) | **POST** api/orders/rate/{order_id} | Rate a dropbuddy after delivery is completed. User cannot rate an order until delivery_status is completed
[**apiOrdersUpdateOrderIdPost**](OrdersApi.md#apiOrdersUpdateOrderIdPost) | **POST** api/orders/update/{order_id} | You can set any values within the order class. The object is sanitized
[**apiOrdersUpdateStatusOrderIdPost**](OrdersApi.md#apiOrdersUpdateStatusOrderIdPost) | **POST** api/orders/update/status/{order_id} | 


<a name="apiOrdersAcceptOrderIdGet"></a>
# **apiOrdersAcceptOrderIdGet**
> Acceptors apiOrdersAcceptOrderIdGet(orderId)

Get all the dropbuddies who accepted a request

You can retrieve all the dropbuddies that accepted a request

### Example
```java
// Import classes:
//import com.dropbuddies.ApiException;
//import com.dropbuddies.client.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
try {
    Acceptors result = apiInstance.apiOrdersAcceptOrderIdGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersAcceptOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |

### Return type

[**Acceptors**](Acceptors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersAcceptOrderIdPost"></a>
# **apiOrdersAcceptOrderIdPost**
> Void apiOrdersAcceptOrderIdPost(orderId, priceSuggestion)

Accept orders

A signed in dropbuddy can accept a pending request

### Example
```java
// Import classes:
//import com.dropbuddies.ApiException;
//import com.dropbuddies.client.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
Double priceSuggestion = 3.4D; // Double | Supplied using this field is the amount a dropbuddy is willing to accept for a request.
try {
    Void result = apiInstance.apiOrdersAcceptOrderIdPost(orderId, priceSuggestion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersAcceptOrderIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |
 **priceSuggestion** | **Double**| Supplied using this field is the amount a dropbuddy is willing to accept for a request. | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
String dropbuddyId = "dropbuddyId_example"; // String | DropBuddy Identification value
try {
    CompleteOrderResponse result = apiInstance.apiOrdersApproveOrderIdPost(orderId, dropbuddyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersApproveOrderIdPost");
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

<a name="apiOrdersCancelOrderIdPost"></a>
# **apiOrdersCancelOrderIdPost**
> Void apiOrdersCancelOrderIdPost(orderId)

Cancel orders that have failed or completed

Brief summary

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
try {
    Void result = apiInstance.apiOrdersCancelOrderIdPost(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersCancelOrderIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersDropOrderIdPost"></a>
# **apiOrdersDropOrderIdPost**
> Void apiOrdersDropOrderIdPost(orderId)

DropBuddy can drop a request only 5mins after accepting a request

DropBuddy can drop a request only 5mins after accepting a request

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
try {
    Void result = apiInstance.apiOrdersDropOrderIdPost(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersDropOrderIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |

### Return type

[**Void**](.md)

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
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Order body = new Order(); // Order | Should be sent as body of the request
try {
    InlineResponse2003 result = apiInstance.apiOrdersEstimateCustomPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersEstimateCustomPost");
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
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Order body = new Order(); // Order | Should be sent as body of the request
try {
    InlineResponse2002 result = apiInstance.apiOrdersEstimatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersEstimatePost");
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

<a name="apiOrdersHistoryGet"></a>
# **apiOrdersHistoryGet**
> InlineResponse2004 apiOrdersHistoryGet()

Returns all the requests and orders made by user

History

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
try {
    InlineResponse2004 result = apiInstance.apiOrdersHistoryGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersHistoryGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersOrderIdGet"></a>
# **apiOrdersOrderIdGet**
> InlineResponse2005 apiOrdersOrderIdGet(orderId)

Returns a single order information

Return order information

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
try {
    InlineResponse2005 result = apiInstance.apiOrdersOrderIdGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersPendingGet"></a>
# **apiOrdersPendingGet**
> InlineResponse2004 apiOrdersPendingGet(keyword, limit, mode, orderby, longitude, latitude)

Returns pending requests within a particular location if the location is provided

Pending Requests

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String keyword = "keyword_example"; // String | Keyword
Integer limit = 56; // Integer | Limit Results amount
String mode = "mode_example"; // String | Order DESC or ASC
String orderby = "orderby_example"; // String | Order the responses in a certain way
Double longitude = 3.4D; // Double | Longitude value of client
Double latitude = 3.4D; // Double | Latitude value of client
try {
    InlineResponse2004 result = apiInstance.apiOrdersPendingGet(keyword, limit, mode, orderby, longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersPendingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**| Keyword | [optional]
 **limit** | **Integer**| Limit Results amount | [optional]
 **mode** | **String**| Order DESC or ASC | [optional]
 **orderby** | **String**| Order the responses in a certain way | [optional]
 **longitude** | **Double**| Longitude value of client | [optional]
 **latitude** | **Double**| Latitude value of client | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersPlaceCustomPost"></a>
# **apiOrdersPlaceCustomPost**
> CompleteOrder apiOrdersPlaceCustomPost(pickupLocation, description, valueOfItem, suggestedPrice, pickupTime, deliveryType, source)

Place shopping type requests

More Information

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Location pickupLocation = new Location(); // Location | Location object for the pickup address. This is more precise and recommended
String description = "description_example"; // String | Information describing the request
Double valueOfItem = 3.4D; // Double | Total Shopping value
Double suggestedPrice = 3.4D; // Double | Amount user is willing to pay for request
Long pickupTime = 789L; // Long | Pickup Time in millis
String deliveryType = "deliveryType_example"; // String | Defaults to `REGULAR` if not set `REGULAR`, `NEXTDAY`, `PRIME`
String source = "source_example"; // String | Source of the request
try {
    CompleteOrder result = apiInstance.apiOrdersPlaceCustomPost(pickupLocation, description, valueOfItem, suggestedPrice, pickupTime, deliveryType, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersPlaceCustomPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pickupLocation** | [**Location**](Location.md)| Location object for the pickup address. This is more precise and recommended |
 **description** | **String**| Information describing the request |
 **valueOfItem** | **Double**| Total Shopping value |
 **suggestedPrice** | **Double**| Amount user is willing to pay for request |
 **pickupTime** | **Long**| Pickup Time in millis |
 **deliveryType** | **String**| Defaults to &#x60;REGULAR&#x60; if not set &#x60;REGULAR&#x60;, &#x60;NEXTDAY&#x60;, &#x60;PRIME&#x60; | [optional]
 **source** | **String**| Source of the request | [optional]

### Return type

[**CompleteOrder**](CompleteOrder.md)

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
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
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
    System.err.println("Exception when calling OrdersApi#apiOrdersPlaceDispatchPost");
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
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
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
    System.err.println("Exception when calling OrdersApi#apiOrdersPlaceFoodPost");
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
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
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
    System.err.println("Exception when calling OrdersApi#apiOrdersPlaceShoppingPost");
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

<a name="apiOrdersRateOrderIdPost"></a>
# **apiOrdersRateOrderIdPost**
> Void apiOrdersRateOrderIdPost(orderId, rating, ratingMessage)

Rate a dropbuddy after delivery is completed. User cannot rate an order until delivery_status is completed

A dropbuddy after delivery

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
Integer rating = 56; // Integer | Rating value is between 0-5
String ratingMessage = "ratingMessage_example"; // String | User can add a message
try {
    Void result = apiInstance.apiOrdersRateOrderIdPost(orderId, rating, ratingMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersRateOrderIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |
 **rating** | **Integer**| Rating value is between 0-5 |
 **ratingMessage** | **String**| User can add a message | [optional]

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersUpdateOrderIdPost"></a>
# **apiOrdersUpdateOrderIdPost**
> Void apiOrdersUpdateOrderIdPost(orderId, body)

You can set any values within the order class. The object is sanitized

Information about update

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
Order body = new Order(); // Order | Should be sent as body of the request
try {
    Void result = apiInstance.apiOrdersUpdateOrderIdPost(orderId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersUpdateOrderIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |
 **body** | [**Order**](Order.md)| Should be sent as body of the request |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiOrdersUpdateStatusOrderIdPost"></a>
# **apiOrdersUpdateStatusOrderIdPost**
> Void apiOrdersUpdateStatusOrderIdPost(orderId, deliveryStatus)



### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | Order identifier value
String deliveryStatus = "deliveryStatus_example"; // String | The status that the delivery should be updated to
try {
    Void result = apiInstance.apiOrdersUpdateStatusOrderIdPost(orderId, deliveryStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#apiOrdersUpdateStatusOrderIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order identifier value |
 **deliveryStatus** | **String**| The status that the delivery should be updated to |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

