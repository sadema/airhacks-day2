package com.airhacks.flights.bookings.boundary;

import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class BookingsResourceIT {

    private Client client;
    private WebTarget tut;

    @Before
    public void init() {
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8080/flights/resources/bookings");
    }

    @Test
    public void crud() {
        JsonObject booking = this.tut.request(MediaType.APPLICATION_JSON).
                get(JsonObject.class);
        assertNotNull(booking);
        System.out.println("booking = " + booking);
    }

}
