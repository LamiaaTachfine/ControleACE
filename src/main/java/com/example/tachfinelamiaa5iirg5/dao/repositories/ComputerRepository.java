package com.example.tachfinelamiaa5iirg5.dao.repositories;

import com.example.tachfinelamiaa5iirg5.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    public List<Computer> getComputerByProce(String proce);
    public List<Computer> findByProce(String proce);
}
