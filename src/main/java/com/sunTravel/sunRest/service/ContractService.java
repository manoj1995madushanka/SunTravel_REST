package com.sunTravel.sunRest.service;

import com.sunTravel.sunRest.model.Contract;
import com.sunTravel.sunRest.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> getAllContracts(){
        return contractRepository.findAll();
    }

    public Contract getContract(long id){
        return contractRepository.findById(id).get();
    }

    public void addContract(Contract contract){
        contractRepository.save(contract);
    }

    public void updateContract(Contract contract, long contractId){
        contract.setContractId(contractId);
        contractRepository.save(contract);
    }

    public void deleteContract(long id) {
        contractRepository.deleteById(id);
    }
}
