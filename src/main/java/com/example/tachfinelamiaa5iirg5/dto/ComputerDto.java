package com.example.tachfinelamiaa5iirg5.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Data
public class ComputerDto {
    String proce;
    String ram;
    String hardDrive;
    double price;

}