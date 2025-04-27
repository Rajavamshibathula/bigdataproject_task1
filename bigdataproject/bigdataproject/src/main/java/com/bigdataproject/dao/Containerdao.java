package com.bigdataproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigdataproject.dto.Container1;
import com.bigdataproject.repository.Containerrepository;

@Repository
public class Containerdao {

    @Autowired
    private Containerrepository containerrepository;

    public Container1 saveContainer(Container1 container) {
        return containerrepository.save(container);
    }
    
    public List<Container1> getAllContainers() {   
        return containerrepository.findAll();
    }
}
