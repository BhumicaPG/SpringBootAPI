package com.learnspringboot.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

        private final SoftwareEngineerService softwareEngineerService;

        public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService){
                this.softwareEngineerService = softwareEngineerService;
        }
        @GetMapping
        public List<SoftwareEngineer> getEngineers() {
                return softwareEngineerService.getAllSoftwareEngineers(); //get all ses
        }

        @GetMapping("{id}")
        public SoftwareEngineer getEngineerById(@PathVariable Integer id) {
                return softwareEngineerService.getSoftwareEngineerById(id); //get all ses@Path
        }

        //applies client to server
        @PostMapping
        public void addNewSoftwareEngineer(
                @RequestBody SoftwareEngineer softwareEngineer){
                softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
        }
}
