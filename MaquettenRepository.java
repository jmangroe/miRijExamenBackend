package com.example.demo.repos;

import com.example.demo.entity.Maquetten;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaquettenRepository extends JpaRepository <Maquetten, Long> {
}
