package com.example.demo.Repository;

import com.example.demo.Model.model1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository1 extends JpaRepository<model1, Long> {
    // Add custom query methods if needed
}
