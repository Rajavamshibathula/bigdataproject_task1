package com.bigdataproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bigdataproject.dto.Container1;
import com.bigdataproject.service.Containerservice;

@RestController
public class ContainerController { 

    @Autowired
    private Containerservice containerservice;

    @PostMapping("/savecontainer")
    public Container1 container1(@RequestBody Container1 container1) {
        return containerservice.saveContainer(container1);
    }

   
    @GetMapping("/getoptimalcontainer")
    public Container1 getOptimalContainer() {
        return containerservice.getOptimalContainer();
    }

   
    @GetMapping("/getcontainerssorted")
    public List<Container1> getSortedContainers() {
        return containerservice.getSortedContainersByDistance();
    }
}
