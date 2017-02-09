package com.dropbuddies.client;

import com.dropbuddies.ApiClient;
import com.dropbuddies.core.client.Error;
import com.dropbuddies.core.client.Account;
import com.dropbuddies.core.client.InlineResponse2001;
import com.dropbuddies.core.client.InlineResponse2007;
import com.dropbuddies.core.client.AuthenticatorLog;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticateApi
 */
public class AuthenticateApiTest {

    private AuthenticateApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthenticateApi.class);
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
