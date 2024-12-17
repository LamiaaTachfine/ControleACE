package com.example.tachfinelamiaa5iirg5.services;

import com.example.tachfinelamiaa5iirg5.dao.entities.Computer;
import com.example.tachfinelamiaa5iirg5.dao.repositories.ComputerRepository;
import com.example.tachfinelamiaa5iirg5.dto.ComputerDto;
import com.example.tachfinelamiaa5iirg5.mapper.ComputerMapper;

import java.util.ArrayList;
import java.util.List;

public class ComputerManager implements ComputerService {


    private ComputerRepository computerRepository ;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return computerDto;


    }



    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }






}

