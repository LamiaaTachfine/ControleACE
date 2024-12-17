package com.example.tachfinelamiaa5iirg5.web;

import com.example.tachfinelamiaa5iirg5.dto.ComputerDto;
import com.example.tachfinelamiaa5iirg5.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class ComputerGraphQlController {

    private ComputerService computerService ;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computer){
        return computerService.saveComputer(computer);
    }



    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
    }
}