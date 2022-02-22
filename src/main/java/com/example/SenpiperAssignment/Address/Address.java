package com.example.SenpiperAssignment.Address;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @Column
    String detailedAddress;
    @Column
    String city;
    @Column
    String state;
    @Column
    String pincode;

    public Address(){

    }


    public Address(String detailedAddress, String city, String state, String pincode) {
        this.detailedAddress = detailedAddress;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
