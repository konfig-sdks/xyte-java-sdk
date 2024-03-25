/*
 * Testing API
 * Xyte's Device Cloud is the first all-in-one servitization platform designed for device and hardware manufacturers to cloudify, operate, support, and commercialize their connected devices in a unified platform.   We enable OEMs across different industries to navigate their digital journey, transforming their devices into integrated business solutions that combine hardware, software and services. The only business and commerce platform designed specifically for IoT device manufacturers, our fully-federated Device Cloud empowers OEMs to manage the complete lifecycle of their devices, from the minute they leave the warehouse through aftermarket sales to end customers.  Our out-of-the-box applications for asset management, remote support, ecommerce and subscription management, financing, and a powerful and secure back office suite help OEMs boost revenue and market growth, optimize operational efficiencies, gain instant insights into equipment and device performance, and develop sustainable customer relationships.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.TicketAddCommentRequest;
import com.konfigthis.client.model.TicketAddCommentResponse;
import com.konfigthis.client.model.TicketCloseResponse;
import com.konfigthis.client.model.TicketGetByIdResponse;
import com.konfigthis.client.model.TicketListResponseInner;
import com.konfigthis.client.model.TicketUpdateTicketByIdRequest;
import com.konfigthis.client.model.TicketUpdateTicketByIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TicketApi
 */
@Disabled
public class TicketApiTest {

    private static TicketApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TicketApi(apiClient);
    }

    /**
     * Add Comment
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCommentTest() throws ApiException {
        String ticketId = null;
        String message = null;
        TicketAddCommentResponse response = api.addComment(ticketId)
                .message(message)
                .execute();
        // TODO: test validations
    }

    /**
     * Close Ticket
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void closeTest() throws ApiException {
        String ticketId = null;
        TicketCloseResponse response = api.close(ticketId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Ticket
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String ticketId = null;
        TicketGetByIdResponse response = api.getById(ticketId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Tickets
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        List<TicketListResponseInner> response = api.list()
                .execute();
        // TODO: test validations
    }

    /**
     * Update Ticket
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTicketByIdTest() throws ApiException {
        String ticketId = null;
        String title = null;
        String description = null;
        TicketUpdateTicketByIdResponse response = api.updateTicketById(ticketId)
                .title(title)
                .description(description)
                .execute();
        // TODO: test validations
    }

}
