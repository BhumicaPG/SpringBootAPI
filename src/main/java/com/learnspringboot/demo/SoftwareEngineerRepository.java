package com.learnspringboot.demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository extends JpaRepository <SoftwareEngineer, Integer> {
    
}
