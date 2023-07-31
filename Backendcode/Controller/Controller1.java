package com.example.demo.Controller;

import com.example.demo.Model.model1;
import com.example.demo.Service.service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class Controller1 {

    private service1 healthDataService;

    @Autowired
    public Controller1(service1 healthDataService) {
        this.healthDataService = healthDataService;
    }

    @PostMapping("/save_health_data")
    public model1 saveHealthData(@RequestBody model1 healthData) {
        return healthDataService.saveHealthData(healthData);
    }
}
