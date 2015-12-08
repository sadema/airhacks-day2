package com.airhacks.flights.booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author airhacks.com
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NamedQuery(name = Booking.findAll, query = "SELECT b FROM Booking b")
public class Booking {

    @Id
    @GeneratedValue
    private long id;

    private String nbr;
    private int price;

    private final static String PREFIX = "com.airhacks.flights.booking.entity.Booking.";
    public static final String findAll = PREFIX + "all";

    public Booking(String nbr, int price) {
        this.nbr = nbr;
        this.price = price;
    }

    public Booking() {
    }
}
