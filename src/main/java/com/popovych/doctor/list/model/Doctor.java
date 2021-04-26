package com.popovych.doctor.list.model;

import javax.persistence.*;
import java.io.Serializable;
//Serializable helps to transform into diff types of stream
@Entity
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//?\Saved in db
    @Column(nullable = false, updatable = false)//specify in column,once it set ,it can never updated
    private Long id;
    private String name;
    private String email;
    private String speciality;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String doctorCode;

    public Doctor() {}

    public Doctor(Long id, String name,String email, String speciality, String phone, String imageUrl, String doctorCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.doctorCode = doctorCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", speciality='" + speciality + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", doctorCode='" + doctorCode + '\'' +
                '}';
    }
}
