package com.moo.taeim.addressbook.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UserAddress {

    private int userNumber;
    private String firstName;
    private String surname;
    private String address;
    private String phone;

    @JsonCreator
    public UserAddress(int userNumber, String firstName, String surname, String address, String phone) {
        this.userNumber = userNumber;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
