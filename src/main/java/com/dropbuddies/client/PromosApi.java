package com.dropbuddies.client;

import com.dropbuddies.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.dropbuddies.core.client.Error;
import com.dropbuddies.core.client.InlineResponse2006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PromosApi {
  /**
   * Get active promos
   * Get active promos
   * @return Call&lt;InlineResponse2006&gt;
   */
  
  @GET("api/promos/active")
  Call<InlineResponse2006> apiPromosActiveGet();
    

  /**
   * Get promos
   * Get promos
   * @return Call&lt;InlineResponse2006&gt;
   */
  
  @GET("api/promos")
  Call<InlineResponse2006> apiPromosGet();
    

  /**
   * Get inactive promos
   * Get inactive promos
   * @return Call&lt;InlineResponse2006&gt;
   */
  
  @GET("api/promos/inactive")
  Call<InlineResponse2006> apiPromosInactiveGet();
    

  /**
   * Validate promocode
   * Validate promocode
   * @return Call&lt;Void&gt;
   */
  
  @GET("api/validate/{promocode}")
  Call<Void> apiValidatePromocodeGet();
    

}
