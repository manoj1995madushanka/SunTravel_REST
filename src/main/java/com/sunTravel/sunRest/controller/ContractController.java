package com.sunTravel.sunRest.controller;

import com.sunTravel.sunRest.model.Contract;
import com.sunTravel.sunRest.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContractController {
    @Autowired
    private ContractService contractService;

    @RequestMapping("/contracts")
    public List<Contract> getAllContracts(){

        return this.contractService.getAllContracts();
    }

    @RequestMapping("/contracts/{contractId}")
    public Contract getContract(@PathVariable("contractId") int id){
        return this.contractService.getContract(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "contracts")
    public void addContract(@RequestBody Contract contract){
        contractService.addContract(contract);
    }

    @RequestMapping(method = RequestMethod.PUT, value= "contracts/{contractId}")
    public void updateContract(@RequestBody Contract contract, @PathVariable int contractId){
        contractService.updateContract(contract,contractId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "contracts/{contractId}")
    public void deleteContract(@PathVariable("contractId") int id){
        contractService.deleteContract(id);
    }
}
