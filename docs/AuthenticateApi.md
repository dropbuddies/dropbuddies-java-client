# AuthenticateApi

All URIs are relative to *http://api.dropbuddies.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticateAccountTypeActivateActivationCodeGet**](AuthenticateApi.md#authenticateAccountTypeActivateActivationCodeGet) | **GET** authenticate/{account_type}/activate/{activation_code} | Activate account
[**authenticateAccountTypeCreatePost**](AuthenticateApi.md#authenticateAccountTypeCreatePost) | **POST** authenticate/{account_type}/create | Create an account of the corresponding type in the endpoint
[**authenticateAccountTypePost**](AuthenticateApi.md#authenticateAccountTypePost) | **POST** authenticate/{account_type} | Signin a user by providing their email and password
[**authenticateAccountTypeResetConfirmCodePost**](AuthenticateApi.md#authenticateAccountTypeResetConfirmCodePost) | **POST** authenticate/{account_type}/reset/confirm/{code} | Reset Account confirmation
[**authenticateAccountTypeResetPost**](AuthenticateApi.md#authenticateAccountTypeResetPost) | **POST** authenticate/{account_type}/reset | Reset account
[**authenticateAccountTypeTokenRenewPost**](AuthenticateApi.md#authenticateAccountTypeTokenRenewPost) | **POST** authenticate/{account_type}/token/renew | Renew a token by providing the access_token and jwt_token provided after successful login
[**authenticateDeveloperNewTokenPost**](AuthenticateApi.md#authenticateDeveloperNewTokenPost) | **POST** authenticate/developer/new-token | Developer can request a new token that is tied to his account


<a name="authenticateAccountTypeActivateActivationCodeGet"></a>
# **authenticateAccountTypeActivateActivationCodeGet**
> Void authenticateAccountTypeActivateActivationCodeGet(accountType, activationCode, email)

Activate account

Activate account

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AuthenticateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AuthenticateApi apiInstance = new AuthenticateApi();
String accountType = "accountType_example"; // String | Account type
String activationCode = "activationCode_example"; // String | Activation code sent to users email
String email = "email_example"; // String | Email address
try {
    Void result = apiInstance.authenticateAccountTypeActivateActivationCodeGet(accountType, activationCode, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#authenticateAccountTypeActivateActivationCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |
 **activationCode** | **String**| Activation code sent to users email |
 **email** | **String**| Email address |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authenticateAccountTypeCreatePost"></a>
# **authenticateAccountTypeCreatePost**
> InlineResponse2001 authenticateAccountTypeCreatePost(accountType, body)

Create an account of the corresponding type in the endpoint

Create an account of the corresponding type in the endpoint

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AuthenticateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AuthenticateApi apiInstance = new AuthenticateApi();
String accountType = "accountType_example"; // String | Account type
Account body = new Account(); // Account | Should be sent as body of the request
try {
    InlineResponse2001 result = apiInstance.authenticateAccountTypeCreatePost(accountType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#authenticateAccountTypeCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |
 **body** | [**Account**](Account.md)| Should be sent as body of the request |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authenticateAccountTypePost"></a>
# **authenticateAccountTypePost**
> InlineResponse2007 authenticateAccountTypePost(accountType, email, password)

Signin a user by providing their email and password

Generated jwt_token expires after one week, after which you have to call the renew api endpoint

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AuthenticateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AuthenticateApi apiInstance = new AuthenticateApi();
String accountType = "accountType_example"; // String | Account type
String email = "email_example"; // String | 
String password = "password_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.authenticateAccountTypePost(accountType, email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#authenticateAccountTypePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |
 **email** | **String**|  |
 **password** | **String**|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authenticateAccountTypeResetConfirmCodePost"></a>
# **authenticateAccountTypeResetConfirmCodePost**
> Void authenticateAccountTypeResetConfirmCodePost(accountType, code, body)

Reset Account confirmation

Reset Account confirmation

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AuthenticateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AuthenticateApi apiInstance = new AuthenticateApi();
String accountType = "accountType_example"; // String | Account type
String code = "code_example"; // String | Reset code sent via email
Account body = new Account(); // Account | Properties of account that needs to be change. Mostly password or email
try {
    Void result = apiInstance.authenticateAccountTypeResetConfirmCodePost(accountType, code, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#authenticateAccountTypeResetConfirmCodePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |
 **code** | **String**| Reset code sent via email |
 **body** | [**Account**](Account.md)| Properties of account that needs to be change. Mostly password or email |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authenticateAccountTypeResetPost"></a>
# **authenticateAccountTypeResetPost**
> Void authenticateAccountTypeResetPost(accountType, body)

Reset account

Reset account

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AuthenticateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AuthenticateApi apiInstance = new AuthenticateApi();
String accountType = "accountType_example"; // String | Account type
Account body = new Account(); // Account | Should be sent as body of the request
try {
    Void result = apiInstance.authenticateAccountTypeResetPost(accountType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#authenticateAccountTypeResetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |
 **body** | [**Account**](Account.md)| Should be sent as body of the request |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authenticateAccountTypeTokenRenewPost"></a>
# **authenticateAccountTypeTokenRenewPost**
> InlineResponse2007 authenticateAccountTypeTokenRenewPost(accountType, accessToken, jwtToken)

Renew a token by providing the access_token and jwt_token provided after successful login

You can renew token without requesting the user to sign in again

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AuthenticateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AuthenticateApi apiInstance = new AuthenticateApi();
String accountType = "accountType_example"; // String | Account type
String accessToken = "accessToken_example"; // String | 
String jwtToken = "jwtToken_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.authenticateAccountTypeTokenRenewPost(accountType, accessToken, jwtToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#authenticateAccountTypeTokenRenewPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |
 **accessToken** | **String**|  |
 **jwtToken** | **String**|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authenticateDeveloperNewTokenPost"></a>
# **authenticateDeveloperNewTokenPost**
> InlineResponse2007 authenticateDeveloperNewTokenPost(body, body2)

Developer can request a new token that is tied to his account

Developer can request a new token that is tied to his account

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AuthenticateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AuthenticateApi apiInstance = new AuthenticateApi();
Account body = new Account(); // Account | Some parameters from Account are allowed
AuthenticatorLog body2 = new AuthenticatorLog(); // AuthenticatorLog | Some parameters from AuthenticatorLog are allowed
try {
    InlineResponse2007 result = apiInstance.authenticateDeveloperNewTokenPost(body, body2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticateApi#authenticateDeveloperNewTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Account**](Account.md)| Some parameters from Account are allowed |
 **body2** | [**AuthenticatorLog**](AuthenticatorLog.md)| Some parameters from AuthenticatorLog are allowed |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

