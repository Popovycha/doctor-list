package com.popovych.doctor.list.service;

import com.popovych.doctor.list.exception.UserNotFoundException;
import com.popovych.doctor.list.model.Doctor;
import com.popovych.doctor.list.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.UUID;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor addDoctor(Doctor doctor) {
        doctor.setDoctorCode(UUID.randomUUID().toString());
        return doctorRepository.save(doctor);
    }

    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor updateDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    public Doctor findDoctorById(Long id) {
        return doctorRepository.findDoctorById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteDoctor(Long id) {
        doctorRepository.deleteDoctorById(id);
    }
}
