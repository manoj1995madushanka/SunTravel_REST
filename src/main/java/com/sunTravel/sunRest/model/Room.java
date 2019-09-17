package com.sunTravel.sunRest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="T475_Room")
public class Room implements Serializable {
    @Id
    @Column(name="room_type")
    private String room_type;
    @Column(name="room_count")
    private int room_count;
    @Column(name="max_adults")
    private int max_adults;
    @Column(name="room_price")
    private double room_price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotel_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    /*@JsonIgnore*/
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Hotel hotel;


    //many to many relationship between room and contract
    @OneToMany(
            mappedBy = "room",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Contract_Room> rooms = new ArrayList<>();


    public Room(){}

    public Room(String room_type, int room_count, int max_adults, double room_price) {
        this.room_type = room_type;
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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Contract_Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Contract_Room> rooms) {
        this.rooms = rooms;
    }
}
