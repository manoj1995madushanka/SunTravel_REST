package com.sunTravel.sunRest.repository;

import com.sunTravel.sunRest.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
