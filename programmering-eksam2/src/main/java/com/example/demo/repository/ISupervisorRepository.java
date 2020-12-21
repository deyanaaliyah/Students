package com.example.demo.repository;

import com.example.demo.model.Supervisor;
import org.springframework.data.repository.CrudRepository;

public interface ISupervisorRepository extends CrudRepository<Supervisor, Long> {
}
