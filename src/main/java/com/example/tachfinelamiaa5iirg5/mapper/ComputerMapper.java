package com.example.tachfinelamiaa5iirg5.mapper;

import com.example.tachfinelamiaa5iirg5.dao.entities.Computer;
import com.example.tachfinelamiaa5iirg5.dto.ComputerDto;
import org.modelmapper.ModelMapper;

public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }

}
