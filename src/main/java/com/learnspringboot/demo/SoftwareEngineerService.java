package com.learnspringboot.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(
        SoftwareEngineerRepository softwareEngineerRepository
    ){
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){  //this will return an entity
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
         return softwareEngineerRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException(id + " not found "));
    }
}
  