package com.popovych.doctor.list.repository;

import com.popovych.doctor.list.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//creates query and deletes by id
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    void deleteDoctorById(Long id);

    //Query method
    Optional <Doctor> findDoctorById(Long id);
}
