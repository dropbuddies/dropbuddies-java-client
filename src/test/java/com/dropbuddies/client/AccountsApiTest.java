package com.dropbuddies.client;

import com.dropbuddies.ApiClient;
import com.dropbuddies.core.client.InlineResponse2001;
import com.dropbuddies.core.client.Error;
import com.dropbuddies.core.client.InlineResponse200;
import com.dropbuddies.core.client.Account;
import com.dropbuddies.core.client.InlineResponse2007;
import com.dropbuddies.core.client.AuthenticatorLog;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
public class AccountsApiTest {

    private AccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountsApi.class);
    }

    
    /**
     * Retrieve details about an account
     *
     * Retrieve account details
     */
    @Test
    public void apiAccountsAccountTypeAccountIdGetTest() {
        String accountType = null;
        String accountId = null;
        // InlineResponse2001 response = api.apiAccountsAccountTypeAccountIdGet(accountType, accountId);

        // TODO: test validations
    }
    
    /**
     * Account is temporary deactivated and finally removed after 7days
     *
     * Account is temporary deactivated
     */
    @Test
    public void apiAccountsAccountTypeDeactivateDeleteTest() {
        String accountType = null;
        // Void response = api.apiAccountsAccountTypeDeactivateDelete(accountType);

        // TODO: test validations
    }
    
    /**
     * Account is temporary deleted and finally removed after 7days
     *
     * Account deletion
     */
    @Test
    public void apiAccountsAccountTypeDeleteDeleteTest() {
        String accountType = null;
        // Void response = api.apiAccountsAccountTypeDeleteDelete(accountType);

        // TODO: test validations
    }
    
    /**
     * Returns the account tied the JWT-Token
     *
     * Returns the account tied the JWT-Token. Use the endpoint to get user information after successfull login
     */
    @Test
    public void apiAccountsAccountTypeGetTest() {
        String accountType = null;
        // InlineResponse2001 response = api.apiAccountsAccountTypeGet(accountType);

        // TODO: test validations
    }
    
    /**
     * Update account details
     *
     * Update account information
     */
    @Test
    public void apiAccountsAccountTypeUpdatePostTest() {
        String accountType = null;
        // Void response = api.apiAccountsAccountTypeUpdatePost(accountType);

        // TODO: test validations
    }
    
    /**
     * Account can apply as a dropbuddy
     *
     * Account can apply as a dropbuddy
     */
    @Test
    public void apiAccountsDropbuddyApplyGetTest() {
        // Void response = api.apiAccountsDropbuddyApplyGet();

        // TODO: test validations
    }
    
    /**
     * Returns the available account types
     *
     * Returns the available account types, the preferred account type can be appended after &#x60;/api/accounts/&#x60;to perform accounts based requests
     */
    @Test
    public void apiAccountsGetTest() {
        // InlineResponse200 response = api.apiAccountsGet();

        // TODO: test validations
    }
    
    /**
     * Activate account
     *
     * Activate account
     */
    @Test
    public void authenticateAccountTypeActivateActivationCodeGetTest() {
        String accountType = null;
        String activationCode = null;
        String email = null;
        // Void response = api.authenticateAccountTypeActivateActivationCodeGet(accountType, activationCode, email);

        // TODO: test validations
    }
    
    /**
     * Create an account of the corresponding type in the endpoint
     *
     * Create an account of the corresponding type in the endpoint
     */
    @Test
    public void authenticateAccountTypeCreatePostTest() {
        String accountType = null;
        Account body = null;
        // InlineResponse2001 response = api.authenticateAccountTypeCreatePost(accountType, body);

        // TODO: test validations
    }
    
    /**
     * Signin a user by providing their email and password
     *
     * Generated jwt_token expires after one week, after which you have to call the renew api endpoint
     */
    @Test
    public void authenticateAccountTypePostTest() {
        String accountType = null;
        String email = null;
        String password = null;
        // InlineResponse2007 response = api.authenticateAccountTypePost(accountType, email, password);

        // TODO: test validations
    }
    
    /**
     * Reset Account confirmation
     *
     * Reset Account confirmation
     */
    @Test
    public void authenticateAccountTypeResetConfirmCodePostTest() {
        String accountType = null;
        String code = null;
        Account body = null;
        // Void response = api.authenticateAccountTypeResetConfirmCodePost(accountType, code, body);

        // TODO: test validations
    }
    
    /**
     * Reset account
     *
     * Reset account
     */
    @Test
    public void authenticateAccountTypeResetPostTest() {
        String accountType = null;
        Account body = null;
        // Void response = api.authenticateAccountTypeResetPost(accountType, body);

        // TODO: test validations
    }
    
    /**
     * Renew a token by providing the access_token and jwt_token provided after successful login
     *
     * You can renew token without requesting the user to sign in again
     */
    @Test
    public void authenticateAccountTypeTokenRenewPostTest() {
        String accountType = null;
        String accessToken = null;
        String jwtToken = null;
        // InlineResponse2007 response = api.authenticateAccountTypeTokenRenewPost(accountType, accessToken, jwtToken);

        // TODO: test validations
    }
    
    /**
     * Developer can request a new token that is tied to his account
     *
     * Developer can request a new token that is tied to his account
     */
    @Test
    public void authenticateDeveloperNewTokenPostTest() {
        Account body = null;
        AuthenticatorLog body2 = null;
        // InlineResponse2007 response = api.authenticateDeveloperNewTokenPost(body, body2);

        // TODO: test validations
    }
    
}
