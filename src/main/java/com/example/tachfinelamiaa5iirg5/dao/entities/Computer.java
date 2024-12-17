package com.example.tachfinelamiaa5iirg5.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Computer {

    @Id
    @GeneratedValue
    Long id_Pc;
    String proce;
    String ram;
    String hardDrive;
    double price;
}

