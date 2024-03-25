package com.konfigthis.client;

import com.konfigthis.client.api.DeviceApi;
import com.konfigthis.client.api.TicketApi;

public class Xyte {
    private ApiClient apiClient;
    public final DeviceApi device;
    public final TicketApi ticket;

    public Xyte() {
        this(null);
    }

    public Xyte(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.device = new DeviceApi(this.apiClient);
        this.ticket = new TicketApi(this.apiClient);
    }

}
