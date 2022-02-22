package com.example.SenpiperAssignment.Model;

import com.example.SenpiperAssignment.Address.Address;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "trainingcenters")
public class Assignment {
    @Id
    @NotEmpty(message = "Center Name can not be Empty")
    @Size(max=40,message = "Center name not greater than 40 char")
    @Column(name = "centerName")
    String centerName;
    @NotEmpty(message = "Center code can not be Empty")
    @Size(max=12,message = "Center Code not greater than 12 char")
    @Pattern(regexp = "^[A-Za-z0-9]*$",message = "Alphanumeric Values allowed")
    @Column(name = "CenterCode")
    String centerCode;
    @Column(name = "studentCapacity")
    int studentCapacity;
    @Column(name = "courseoffered")
    ArrayList<String> coursesoffered = new ArrayList<>();
    @NotEmpty(message = "Contact Email can not be null")
    @Email(message = "Enter a valid Email")
    @Column(name = "contactEmail")
    String contactEmail;
//    @Range(min = 10,max= 10, message = "ContactPhone should be exact 10 characters." )
    @Column(name = "contactPhone")
    String contactPhone;
    @Column(name = "createdOn")
    Date createdOn;
//    @Column(name = "address")
//    @Type(type = "com.example.SenpiperAssignment.Address.Address")
//    Address address;

    //@Column(name = "address")

//    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Address.class)
//    private Address address;


    public Assignment(){

    }

    public Assignment(String centerName, String centerCode, int studentCapacity, ArrayList<String> coursesoffered, String contactEmail, String contactPhone, Date createdOn) {
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.studentCapacity = studentCapacity;
        this.coursesoffered = coursesoffered;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.createdOn = createdOn;
    }

//    public Assignment(String centerName, String centerCode, double studentCapacity, ArrayList<String> coursesoffered, String contactEmail, double contactPhone, Date createdOn, Address address) {
//        this.centerName = centerName;
//        this.centerCode = centerCode;
//        this.studentCapacity = studentCapacity;
//        this.coursesoffered = coursesoffered;
//        this.contactEmail = contactEmail;
//        this.contactPhone = contactPhone;
//        this.createdOn = createdOn;
//        this.address = address;
//    }


    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public ArrayList<String> getCoursesoffered() {
        return coursesoffered;
    }

    public void setCoursesoffered(ArrayList<String> coursesoffered) {
        this.coursesoffered = coursesoffered;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @PrePersist
    protected void prePersist() {
        if ((this.createdOn == null) || (this.createdOn != null)) createdOn = new Date();

    }

//    @JoinColumn(name = "address_detailedAddress")
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
