# PromosApi

All URIs are relative to *http://api.dropbuddies.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPromosActiveGet**](PromosApi.md#apiPromosActiveGet) | **GET** api/promos/active | Get active promos
[**apiPromosGet**](PromosApi.md#apiPromosGet) | **GET** api/promos | Get promos
[**apiPromosInactiveGet**](PromosApi.md#apiPromosInactiveGet) | **GET** api/promos/inactive | Get inactive promos
[**apiValidatePromocodeGet**](PromosApi.md#apiValidatePromocodeGet) | **GET** api/validate/{promocode} | Validate promocode


<a name="apiPromosActiveGet"></a>
# **apiPromosActiveGet**
> InlineResponse2006 apiPromosActiveGet()

Get active promos

Get active promos

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PromosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PromosApi apiInstance = new PromosApi();
try {
    InlineResponse2006 result = apiInstance.apiPromosActiveGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromosApi#apiPromosActiveGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPromosGet"></a>
# **apiPromosGet**
> InlineResponse2006 apiPromosGet()

Get promos

Get promos

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PromosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PromosApi apiInstance = new PromosApi();
try {
    InlineResponse2006 result = apiInstance.apiPromosGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromosApi#apiPromosGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPromosInactiveGet"></a>
# **apiPromosInactiveGet**
> InlineResponse2006 apiPromosInactiveGet()

Get inactive promos

Get inactive promos

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PromosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PromosApi apiInstance = new PromosApi();
try {
    InlineResponse2006 result = apiInstance.apiPromosInactiveGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromosApi#apiPromosInactiveGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiValidatePromocodeGet"></a>
# **apiValidatePromocodeGet**
> Void apiValidatePromocodeGet()

Validate promocode

Validate promocode

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.PromosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

PromosApi apiInstance = new PromosApi();
try {
    Void result = apiInstance.apiValidatePromocodeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromosApi#apiValidatePromocodeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

