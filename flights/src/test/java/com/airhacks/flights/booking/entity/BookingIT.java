package com.airhacks.flights.booking.entity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class BookingIT {

    private EntityManager em;
    private EntityTransaction tx;

    @Before
    public void init() {
        this.em = Persistence.createEntityManagerFactory("it").createEntityManager();
        this.tx = this.em.getTransaction();
    }

    @Test
    public void crud() {
        this.tx.begin();
        this.em.merge(new Booking());
        this.tx.commit();
        List<Booking> resultList = this.em.
                createNamedQuery(Booking.findAll, Booking.class).
                getResultList();
        assertFalse(resultList.isEmpty());
    }

}
