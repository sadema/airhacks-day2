package com.airhacks.flights.booking.boundary;

import com.airhacks.flights.booking.entity.Flight;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author airhacks.com
 */
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "airhacks/custom"})
@Path("bookings")
public class BookingsResource {

    @GET
    public Flight flight() {
        return new Flight("42");
    }

}
