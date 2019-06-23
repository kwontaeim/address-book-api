package com.moo.taeim.addressbook.model;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User extends ResourceSupport {

    private int userNumber;
    private String firstName;
    private String surname;
    private Link link;

    @JsonCreator
    public User(int userNumber, String firstName, String surname, @JsonProperty("linkToDetail")Link link) {
        super();
        this.userNumber = userNumber;
        this.firstName = firstName;
        this.surname = surname;
        this.link = link;
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

    public Link getLink() {
        return link;
    }
    public void setLink(Link link) {
        this.link = link;
    }


}
