# AccountsApi

All URIs are relative to *http://api.dropbuddies.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAccountsAccountTypeAccountIdGet**](AccountsApi.md#apiAccountsAccountTypeAccountIdGet) | **GET** api/accounts/{account_type}/{account_id} | Retrieve details about an account
[**apiAccountsAccountTypeDeactivateDelete**](AccountsApi.md#apiAccountsAccountTypeDeactivateDelete) | **DELETE** api/accounts/{account_type}/deactivate | Account is temporary deactivated and finally removed after 7days
[**apiAccountsAccountTypeDeleteDelete**](AccountsApi.md#apiAccountsAccountTypeDeleteDelete) | **DELETE** api/accounts/{account_type}/delete | Account is temporary deleted and finally removed after 7days
[**apiAccountsAccountTypeGet**](AccountsApi.md#apiAccountsAccountTypeGet) | **GET** api/accounts/{account_type} | Returns the account tied the JWT-Token
[**apiAccountsAccountTypeUpdatePost**](AccountsApi.md#apiAccountsAccountTypeUpdatePost) | **POST** api/accounts/{account_type}/update | Update account details
[**apiAccountsDropbuddyApplyGet**](AccountsApi.md#apiAccountsDropbuddyApplyGet) | **GET** api/accounts/dropbuddy/apply | Account can apply as a dropbuddy
[**apiAccountsGet**](AccountsApi.md#apiAccountsGet) | **GET** api/accounts | Returns the available account types
[**authenticateAccountTypeActivateActivationCodeGet**](AccountsApi.md#authenticateAccountTypeActivateActivationCodeGet) | **GET** authenticate/{account_type}/activate/{activation_code} | Activate account
[**authenticateAccountTypeCreatePost**](AccountsApi.md#authenticateAccountTypeCreatePost) | **POST** authenticate/{account_type}/create | Create an account of the corresponding type in the endpoint
[**authenticateAccountTypePost**](AccountsApi.md#authenticateAccountTypePost) | **POST** authenticate/{account_type} | Signin a user by providing their email and password
[**authenticateAccountTypeResetConfirmCodePost**](AccountsApi.md#authenticateAccountTypeResetConfirmCodePost) | **POST** authenticate/{account_type}/reset/confirm/{code} | Reset Account confirmation
[**authenticateAccountTypeResetPost**](AccountsApi.md#authenticateAccountTypeResetPost) | **POST** authenticate/{account_type}/reset | Reset account
[**authenticateAccountTypeTokenRenewPost**](AccountsApi.md#authenticateAccountTypeTokenRenewPost) | **POST** authenticate/{account_type}/token/renew | Renew a token by providing the access_token and jwt_token provided after successful login
[**authenticateDeveloperNewTokenPost**](AccountsApi.md#authenticateDeveloperNewTokenPost) | **POST** authenticate/developer/new-token | Developer can request a new token that is tied to his account


<a name="apiAccountsAccountTypeAccountIdGet"></a>
# **apiAccountsAccountTypeAccountIdGet**
> InlineResponse2001 apiAccountsAccountTypeAccountIdGet(accountType, accountId)

Retrieve details about an account

Retrieve account details

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
String accountId = "accountId_example"; // String | Account Id
try {
    InlineResponse2001 result = apiInstance.apiAccountsAccountTypeAccountIdGet(accountType, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#apiAccountsAccountTypeAccountIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |
 **accountId** | **String**| Account Id |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiAccountsAccountTypeDeactivateDelete"></a>
# **apiAccountsAccountTypeDeactivateDelete**
> Void apiAccountsAccountTypeDeactivateDelete(accountType)

Account is temporary deactivated and finally removed after 7days

Account is temporary deactivated

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
try {
    Void result = apiInstance.apiAccountsAccountTypeDeactivateDelete(accountType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#apiAccountsAccountTypeDeactivateDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiAccountsAccountTypeDeleteDelete"></a>
# **apiAccountsAccountTypeDeleteDelete**
> Void apiAccountsAccountTypeDeleteDelete(accountType)

Account is temporary deleted and finally removed after 7days

Account deletion

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
try {
    Void result = apiInstance.apiAccountsAccountTypeDeleteDelete(accountType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#apiAccountsAccountTypeDeleteDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiAccountsAccountTypeGet"></a>
# **apiAccountsAccountTypeGet**
> InlineResponse2001 apiAccountsAccountTypeGet(accountType)

Returns the account tied the JWT-Token

Returns the account tied the JWT-Token. Use the endpoint to get user information after successfull login

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
try {
    InlineResponse2001 result = apiInstance.apiAccountsAccountTypeGet(accountType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#apiAccountsAccountTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiAccountsAccountTypeUpdatePost"></a>
# **apiAccountsAccountTypeUpdatePost**
> Void apiAccountsAccountTypeUpdatePost(accountType)

Update account details

Update account information

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
try {
    Void result = apiInstance.apiAccountsAccountTypeUpdatePost(accountType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#apiAccountsAccountTypeUpdatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | **String**| Account type |

### Return type

[**Void**](.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiAccountsDropbuddyApplyGet"></a>
# **apiAccountsDropbuddyApplyGet**
> Void apiAccountsDropbuddyApplyGet()

Account can apply as a dropbuddy

Account can apply as a dropbuddy

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    Void result = apiInstance.apiAccountsDropbuddyApplyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#apiAccountsDropbuddyApplyGet");
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

<a name="apiAccountsGet"></a>
# **apiAccountsGet**
> InlineResponse200 apiAccountsGet()

Returns the available account types

Returns the available account types, the preferred account type can be appended after &#x60;/api/accounts/&#x60;to perform accounts based requests

### Example
```java
// Import classes:
//import com.dropbuddies.ApiClient;
//import com.dropbuddies.ApiException;
//import com.dropbuddies.Configuration;
//import com.dropbuddies.auth.*;
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    InlineResponse200 result = apiInstance.apiAccountsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#apiAccountsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
String activationCode = "activationCode_example"; // String | Activation code sent to users email
String email = "email_example"; // String | Email address
try {
    Void result = apiInstance.authenticateAccountTypeActivateActivationCodeGet(accountType, activationCode, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#authenticateAccountTypeActivateActivationCodeGet");
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
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
Account body = new Account(); // Account | Should be sent as body of the request
try {
    InlineResponse2001 result = apiInstance.authenticateAccountTypeCreatePost(accountType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#authenticateAccountTypeCreatePost");
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
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
String email = "email_example"; // String | 
String password = "password_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.authenticateAccountTypePost(accountType, email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#authenticateAccountTypePost");
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
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
String code = "code_example"; // String | Reset code sent via email
Account body = new Account(); // Account | Properties of account that needs to be change. Mostly password or email
try {
    Void result = apiInstance.authenticateAccountTypeResetConfirmCodePost(accountType, code, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#authenticateAccountTypeResetConfirmCodePost");
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
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
Account body = new Account(); // Account | Should be sent as body of the request
try {
    Void result = apiInstance.authenticateAccountTypeResetPost(accountType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#authenticateAccountTypeResetPost");
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
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountType = "accountType_example"; // String | Account type
String accessToken = "accessToken_example"; // String | 
String jwtToken = "jwtToken_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.authenticateAccountTypeTokenRenewPost(accountType, accessToken, jwtToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#authenticateAccountTypeTokenRenewPost");
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
//import com.dropbuddies.client.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: jwtToken
OAuth jwtToken = (OAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
Account body = new Account(); // Account | Some parameters from Account are allowed
AuthenticatorLog body2 = new AuthenticatorLog(); // AuthenticatorLog | Some parameters from AuthenticatorLog are allowed
try {
    InlineResponse2007 result = apiInstance.authenticateDeveloperNewTokenPost(body, body2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#authenticateDeveloperNewTokenPost");
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

