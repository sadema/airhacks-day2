package com.airhacks.flights.booking.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author airhacks.com
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Flight {

    private String nbr;

    public Flight(String nbr) {
        this.nbr = nbr;
    }

    public Flight() {
    }
}
