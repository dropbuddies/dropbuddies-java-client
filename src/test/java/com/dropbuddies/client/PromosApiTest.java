package com.dropbuddies.client;

import com.dropbuddies.ApiClient;
import com.dropbuddies.core.client.Error;
import com.dropbuddies.core.client.InlineResponse2006;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PromosApi
 */
public class PromosApiTest {

    private PromosApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PromosApi.class);
    }

    
    /**
     * Get active promos
     *
     * Get active promos
     */
    @Test
    public void apiPromosActiveGetTest() {
        // InlineResponse2006 response = api.apiPromosActiveGet();

        // TODO: test validations
    }
    
    /**
     * Get promos
     *
     * Get promos
     */
    @Test
    public void apiPromosGetTest() {
        // InlineResponse2006 response = api.apiPromosGet();

        // TODO: test validations
    }
    
    /**
     * Get inactive promos
     *
     * Get inactive promos
     */
    @Test
    public void apiPromosInactiveGetTest() {
        // InlineResponse2006 response = api.apiPromosInactiveGet();

        // TODO: test validations
    }
    
    /**
     * Validate promocode
     *
     * Validate promocode
     */
    @Test
    public void apiValidatePromocodeGetTest() {
        // Void response = api.apiValidatePromocodeGet();

        // TODO: test validations
    }
    
}
