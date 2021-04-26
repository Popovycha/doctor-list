package com.popovych.doctor.list.controller;


import com.popovych.doctor.list.model.Doctor;
import com.popovych.doctor.list.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorResource {

    private final DoctorService doctorService;

    public DoctorResource(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    //Returns all doctors
    @GetMapping("/all") //retrieve all info to backend
    public ResponseEntity<List<Doctor>> getAllDoctors(){ //respEntity generic
        List<Doctor> doctors = doctorService.findAllDoctors();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

    @GetMapping("/find/{id}") //find a user
    public ResponseEntity<Doctor> getDoctorById(@PathVariable("id") Long id){
        Doctor doctor = doctorService.findDoctorById(id);
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    //we make a change in the back end,why we use postmapping
    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) { //doctor json format will be expected from the user
        Doctor newDoctor = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(newDoctor, HttpStatus.ACCEPTED);
    }

    //makes an update in the back end,
    @PutMapping("/update")
    public ResponseEntity<Doctor> updateDoctor(@RequestBody Doctor doctor) {
        Doctor updateDoctor = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(updateDoctor, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDoctor(@PathVariable("id") Long id) {
        doctorService.deleteDoctor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
