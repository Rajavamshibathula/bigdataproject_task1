package com.bigdataproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Container1 {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int containerid;
  private String container;
  private String destination;
  private double distance;
}
