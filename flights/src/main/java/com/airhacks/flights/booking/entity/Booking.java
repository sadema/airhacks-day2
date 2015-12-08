package com.airhacks.flights.booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Booking {

    @Id
    @GeneratedValue
    private long id;

    private String nbr;
    private int price;

    public Booking(String nbr, int price) {
        this.nbr = nbr;
        this.price = price;
    }

    public Booking() {
    }
}
