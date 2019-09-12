package com.sunTravel.sunRest.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T475_Contract")
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contractId")
    private long contractId;

    @Column(name="start_date")
    private Date st_date;

    @Column(name="end_date")
    private Date end_date;

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
}
