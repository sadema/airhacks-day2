package com.airhacks.flights.booking.boundary;

import com.airhacks.flights.booking.control.Validator;
import com.airhacks.flights.booking.entity.Booking;
import javax.persistence.EntityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author airhacks.com
 */
@RunWith(MockitoJUnitRunner.class)
public class BookingProcessorTest {

    @InjectMocks
    private BookingProcessor cut;

    @Mock
    EntityManager em;

    @Mock
    Validator validator;

    @Test
    public void booking() {
        final Booking booking = new Booking();
        when(this.validator.isValid(booking)).thenReturn(true);
        this.cut.create(booking);
        verify(this.em, times(1)).persist(booking);
    }

    @Test(expected = IllegalStateException.class)
    public void createInvalidBooking() {
        final Booking booking = new Booking();
        when(this.validator.isValid(booking)).thenReturn(false);
        this.cut.create(booking);
    }

}
