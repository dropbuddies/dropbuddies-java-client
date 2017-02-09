package com.dropbuddies.client;

import com.dropbuddies.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.dropbuddies.core.client.Error;
import com.dropbuddies.core.client.Account;
import com.dropbuddies.core.client.InlineResponse2001;
import com.dropbuddies.core.client.InlineResponse2007;
import com.dropbuddies.core.client.AuthenticatorLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AuthenticateApi {
  /**
   * Activate account
   * Activate account
   * @param accountType Account type (required)
   * @param activationCode Activation code sent to users email (required)
   * @param email Email address (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("authenticate/{account_type}/activate/{activation_code}")
  Call<Void> authenticateAccountTypeActivateActivationCodeGet(
    @Path("account_type") String accountType, @Path("activation_code") String activationCode, @Query("email") String email
  );

  /**
   * Create an account of the corresponding type in the endpoint
   * Create an account of the corresponding type in the endpoint
   * @param accountType Account type (required)
   * @param body Should be sent as body of the request (required)
   * @return Call&lt;InlineResponse2001&gt;
   */
  
  @POST("authenticate/{account_type}/create")
  Call<InlineResponse2001> authenticateAccountTypeCreatePost(
    @Path("account_type") String accountType, @Body Account body
  );

  /**
   * Signin a user by providing their email and password
   * Generated jwt_token expires after one week, after which you have to call the renew api endpoint
   * @param accountType Account type (required)
   * @param email  (required)
   * @param password  (required)
   * @return Call&lt;InlineResponse2007&gt;
   */
  
  @POST("authenticate/{account_type}")
  Call<InlineResponse2007> authenticateAccountTypePost(
    @Path("account_type") String accountType, @Body String email, @Body String password
  );

  /**
   * Reset Account confirmation
   * Reset Account confirmation
   * @param accountType Account type (required)
   * @param code Reset code sent via email (required)
   * @param body Properties of account that needs to be change. Mostly password or email (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("authenticate/{account_type}/reset/confirm/{code}")
  Call<Void> authenticateAccountTypeResetConfirmCodePost(
    @Path("account_type") String accountType, @Path("code") String code, @Body Account body
  );

  /**
   * Reset account
   * Reset account
   * @param accountType Account type (required)
   * @param body Should be sent as body of the request (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("authenticate/{account_type}/reset")
  Call<Void> authenticateAccountTypeResetPost(
    @Path("account_type") String accountType, @Body Account body
  );

  /**
   * Renew a token by providing the access_token and jwt_token provided after successful login
   * You can renew token without requesting the user to sign in again
   * @param accountType Account type (required)
   * @param accessToken  (required)
   * @param jwtToken  (required)
   * @return Call&lt;InlineResponse2007&gt;
   */
  
  @POST("authenticate/{account_type}/token/renew")
  Call<InlineResponse2007> authenticateAccountTypeTokenRenewPost(
    @Path("account_type") String accountType, @Body String accessToken, @Body String jwtToken
  );

  /**
   * Developer can request a new token that is tied to his account
   * Developer can request a new token that is tied to his account
   * @param body Some parameters from Account are allowed (required)
   * @param body2 Some parameters from AuthenticatorLog are allowed (required)
   * @return Call&lt;InlineResponse2007&gt;
   */
  
  @POST("authenticate/developer/new-token")
  Call<InlineResponse2007> authenticateDeveloperNewTokenPost(
    @Body Account body, @Body AuthenticatorLog body2
  );

}
