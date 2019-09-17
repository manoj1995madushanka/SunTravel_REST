package com.sunTravel.sunRest.model;

import javax.persistence.*;

@Entity
@Table(name = "T475_Contract_Room")
public class Contract_Room {

    @Id
    @Column(name = "contract_room_id")
    private String contract_room_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_type")
    private Room room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contractId")
    private Contract contract;

    public Contract_Room(){}

    public Contract_Room(String contract_room_id, Room room, Contract contract) {
        this.contract_room_id = contract_room_id;
        this.room = room;
        this.contract = contract;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getContract_room_id() {
        return contract_room_id;
    }

    public void setContract_room_id(Long contractId, String room_type) {
        this.contract_room_id = contract.getContractId()+room.getRoom_type();
    }
}
