package com.moo.taeim.addressbook.model;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;

public class User extends ResourceSupport {

    private int userNumber;
    private String firstName;
    private String surname;

    @JsonCreator
    public User(int userNumber, String firstName, String surname) {
        super();
        this.userNumber = userNumber;
        this.firstName = firstName;
        this.surname = surname;
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


}
