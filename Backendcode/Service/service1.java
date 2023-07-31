package com.example.demo.Service;

import com.example.demo.Model.model1;
import com.example.demo.Repository.repository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service1 {

    private final repository1 healthDataRepository;

    @Autowired
    public service1(repository1 healthDataRepository) {
        this.healthDataRepository = healthDataRepository;
    }

    public model1 saveHealthData(model1 healthData) {
        return healthDataRepository.save(healthData);
    }
}
