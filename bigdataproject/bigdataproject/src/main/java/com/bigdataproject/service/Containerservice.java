package com.bigdataproject.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdataproject.dao.Containerdao;
import com.bigdataproject.dto.Container1;

@Service
public class Containerservice {

    @Autowired
    private Containerdao containerdao;

    public Container1 saveContainer(Container1 container1) {
        return containerdao.saveContainer(container1);
    }

   
    public Container1 getOptimalContainer() {
        List<Container1> containers = containerdao.getAllContainers();
        if (containers.isEmpty()) {
            return null;
        }
        Container1 optimal = containers.get(0);
        for (Container1 container : containers) {
            if (container.getDistance() < optimal.getDistance()) {
                optimal = container;
            }
        }
        return optimal;
    }

   
    public List<Container1> getSortedContainersByDistance() {
        List<Container1> containers = containerdao.getAllContainers();
        containers.sort(Comparator.comparingDouble(Container1::getDistance));
        return containers;
    }
}
