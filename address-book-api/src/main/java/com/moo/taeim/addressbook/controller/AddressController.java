package com.moo.taeim.addressbook.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moo.taeim.addressbook.model.User;
import com.moo.taeim.addressbook.model.UserAddress;

@RestController
public class AddressController {

    @GetMapping("/addresses")
    public ResponseEntity<List<User>> getUsers(@RequestParam(value = "surname", required = false) String surname) {

 
        return null;
    }

    @GetMapping(value = "/addresses/{userNumber}")
    public ResponseEntity<UserAddress> getUserDetail(@PathVariable("userNumber") int userNumber) {

   

        return null;
    }

}
