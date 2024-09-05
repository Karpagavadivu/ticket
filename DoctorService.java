package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.repo.DoctorRepo;
@Service
public class DoctorService {
    @Autowired
    DoctorRepo doctorrepo;

    public List<Doctor> addDetail(){
        return doctorrepo.findAll();

    }

    public Doctor putDetail(Doctor doctor){
        return doctorrepo.save(doctor);
    }


    public Optional<Doctor> addDetailById(Long id){
        return doctorrepo.findById(id);

    }

    

}



