package com.sunTravel.sunRest.repository;

import com.sunTravel.sunRest.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
