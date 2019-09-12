package com.sunTravel.sunRest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T475_Room")
public class Room {
    @Id
    @Column(name="room_type")
    private String room_type;
    @Column(name="room_count")
    private int room_count;
    @Column(name="max_adults")
    private int max_adults;
    @Column(name="room_price")
    private double room_price;

    public Room(){}

    public Room( int room_count, int max_adults, double room_price) {
        this.room_count = room_count;
        this.max_adults = max_adults;
        this.room_price = room_price;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getRoom_count() {
        return room_count;
    }

    public void setRoom_count(int room_count) {
        this.room_count = room_count;
    }

    public int getMax_adults() {
        return max_adults;
    }

    public void setMax_adults(int max_adults) {
        this.max_adults = max_adults;
    }

    public double getRoom_price() {
        return room_price;
    }

    public void setRoom_price(double room_price) {
        this.room_price = room_price;
    }
}
