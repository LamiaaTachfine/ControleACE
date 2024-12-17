package com.example.tachfinelamiaa5iirg5.services;

import com.example.tachfinelamiaa5iirg5.dto.ComputerDto;

import java.util.List;


    public interface ComputerService {
        public ComputerDto saveComputer(ComputerDto computerDto);


        public List<ComputerDto> getComputerByProce(String proce);


    }


