package com.moo.taeim.addressbook.controller;

import com.moo.taeim.addressbook.model.User;
import com.moo.taeim.addressbook.model.UserAddress;
import com.moo.taeim.addressbook.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
	
    @Autowired
    private UserAddressService userAddressService;
    
    /**
     * Exposes the URI "/addresses" and "listens" for GET reqeusts. If the request does not contain any more parameters,
     * the method will return all customers that exist in the address book. If some of the optional parameters "surname" exist in the HTTP request,
     * it will return the users matching these values.
     *
     * @param surname - the surname to be looked up in the address book.
     * @return a collection of user list that match with surname provided by the request. If no parameters are provided returns all the contacts in the address book.
     */
    @GetMapping("/addresses")
    public ResponseEntity<List<User>> getUsers(@RequestParam(value = "surname", required = false) String surname) {
 
    	List<User> searchResultlist = userAddressService.getUserList(surname);

        return ResponseEntity.ok(searchResultlist);
    }
    
    /**
     * Searches in the address book for a customer that matches the GET request's id and if the customer exists, returns it.
     *
     * @param userNumber - the user number to be looked up in the address book.
     * @return the detailed customer's info that matches request's number, if such customer exists.
     */
    @GetMapping(value = "/addresses/{userNumber}")
    public ResponseEntity<UserAddress> getUserDetail(@PathVariable("userNumber") int userNumber) {

        UserAddress searchResult = userAddressService.getUserAddress(userNumber);

        return ResponseEntity.ok(searchResult);
    }

}
