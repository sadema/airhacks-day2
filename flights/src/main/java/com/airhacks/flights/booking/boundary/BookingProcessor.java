package com.airhacks.flights.booking.boundary;

import com.airhacks.flights.booking.control.Validator;
import com.airhacks.flights.booking.entity.Booking;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class BookingProcessor {

    @PersistenceContext
    EntityManager em;

    @Inject
    Validator validator;

    public void create(Booking booking) {
        if (!validator.isValid(booking)) {
            throw new IllegalStateException("Booking is not valid");
        }
        this.em.persist(booking);
    }

}
