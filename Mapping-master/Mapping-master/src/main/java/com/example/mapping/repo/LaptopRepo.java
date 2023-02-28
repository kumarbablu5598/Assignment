package com.example.mapping.repo;

import com.example.mapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,String> {
}
