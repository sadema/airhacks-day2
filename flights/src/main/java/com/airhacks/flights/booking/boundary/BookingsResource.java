package com.airhacks.flights.booking.boundary;

import com.airhacks.flights.booking.entity.Booking;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author airhacks.com
 */
@Stateless
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "airhacks/custom"})
@Path("bookings")
public class BookingsResource {

    @Inject
    BookingProcessor processor;

    @GET
    public List<Booking> flight() {
        return this.processor.findAll();
    }

    @POST
    public void save(Booking booking) {
        this.processor.create(booking);
    }

}
