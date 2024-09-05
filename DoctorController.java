package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;
@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorservice;

    @GetMapping("/api/view")
    public ResponseEntity <List<Doctor>> addDetail(){
        return ResponseEntity.ok(doctorservice.addDetail());

    }

    @PostMapping("/api/doctor")
    public ResponseEntity <Doctor> putDetail(@RequestBody Doctor doctor){
        return ResponseEntity.ok(doctorservice.putDetail(doctor));

    }

    @GetMapping("/api/{id}")
    public ResponseEntity <Optional<Doctor>> addDetailById(@PathVariable Long id){
        return ResponseEntity.ok(doctorservice.addDetailById(id));

    }
        
    }



