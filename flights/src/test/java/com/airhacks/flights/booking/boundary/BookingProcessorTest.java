package com.airhacks.flights.booking.boundary;

import com.airhacks.flights.booking.control.Validator;
import com.airhacks.flights.booking.entity.Booking;
import javax.persistence.EntityManager;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author airhacks.com
 */
public class BookingProcessorTest {

    private BookingProcessor cut;

    @Before
    public void inject() {
        this.cut = new BookingProcessor();
        this.cut.validator = mock(Validator.class);
        this.cut.em = mock(EntityManager.class);
    }

    @Test
    public void booking() {
        final Booking booking = new Booking();
        when(this.cut.validator.isValid(booking)).thenReturn(true);
        this.cut.create(booking);
        verify(this.cut.em, times(1)).persist(booking);
    }

    @Test(expected = IllegalStateException.class)
    public void createInvalidBooking() {
        final Booking booking = new Booking();
        when(this.cut.validator.isValid(booking)).thenReturn(false);
        this.cut.create(booking);
    }

}
