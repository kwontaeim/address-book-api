package com.moo.taeim.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moo.taeim.addressbook.model.User;
import com.moo.taeim.addressbook.model.UserAddress;
import com.moo.taeim.addressbook.service.UserAddressService;

@RestController
public class AddressController {
	
    @Autowired
    private UserAddressService userAddressService;

    @GetMapping("/addresses")
    public ResponseEntity<List<User>> getUsers(@RequestParam(value = "surname", required = false) String surname) {
 
    	List<User> searchResultlist = userAddressService.getUserList(surname);

        return ResponseEntity.ok(searchResultlist);
    }

    @GetMapping(value = "/addresses/{userNumber}")
    public ResponseEntity<UserAddress> getUserDetail(@PathVariable("userNumber") int userNumber) {

        UserAddress searchResult = userAddressService.getUserAddress(userNumber);

        return ResponseEntity.ok(searchResult);
    }

}
