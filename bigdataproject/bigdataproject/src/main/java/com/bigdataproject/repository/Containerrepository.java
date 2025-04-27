package com.bigdataproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.bigdataproject.dto.Container1;

public interface Containerrepository extends JpaRepository<Container1, Integer> {

}
