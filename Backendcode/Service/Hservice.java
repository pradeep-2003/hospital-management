package com.example.demo.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Hmodel;
import com.example.demo.Repository.Repo;


     @Service
public class Hservice {
   @Autowired
   Repo repo;
   public void booking(Hmodel mod) {
	   repo.save(mod.getName(),mod.getEmail(),mod.getPhonenumber(),mod.getAppointmentdate(),mod.getAppointmenttime());
   }
   public List<Hmodel> getdet()
   {
	   return repo.findAll();
   }
  
}