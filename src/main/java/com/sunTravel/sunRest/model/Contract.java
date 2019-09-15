package com.sunTravel.sunRest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T475_Contract")
public class  Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contractId")
    private long contractId;

    @Column(name="start_date")
    private Date st_date;

    @Column(name="end_date")
    private Date end_date;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "hotel_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    /*@JsonIgnore*/
    private Hotel hotel;

    public Contract(){}

    public Contract(Date st_date, Date end_date) {
        this.st_date = st_date;
        this.end_date = end_date;
    }

    public long getContractId() {
        return contractId;
    }

    public void setContractId(long contractId) {
        this.contractId = contractId;
    }

    public Date getSt_date() {
        return st_date;
    }

    public void setSt_date(Date st_date) {
        this.st_date = st_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
