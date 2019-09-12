package com.sunTravel.sunRest.service;

import com.sunTravel.sunRest.model.Hotel;
import com.sunTravel.sunRest.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    public Hotel getHotel(long id){
        return hotelRepository.findById(id).get();
    }

    public void addHotel(Hotel hotel){
        hotelRepository.save(hotel);
    }

    public void updateHotel(Hotel hotel, long hotelId){
        hotel.setHotel_id(hotelId);
        hotelRepository.save(hotel);
    }

    public void deleteHotel(long id) {
        hotelRepository.deleteById(id);
    }
}
