package com.moo.taeim.addressbook.model;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import com.moo.taeim.addressbook.controller.AddressController;


/**
 * An class, that creates a collection of the user list and detailed infomation.
 */
public class AddressDataFactory {

    public List initUserListFactory() {
        List<User> userList = new ArrayList<User>();

        userList.add(new User(1, "Alex", "Barnet", linkTo(methodOn(AddressController.class).getUserDetail(1)).withSelfRel()));
        userList.add(new User(2, "Tom", "Barnet",  linkTo(methodOn(AddressController.class).getUserDetail(2)).withSelfRel()));
        userList.add(new User(3, "Taeim", "Kwon", linkTo(methodOn(AddressController.class).getUserDetail(3)).withSelfRel()));
        userList.add(new User(4, "Amy", "Ahn", linkTo(methodOn(AddressController.class).getUserDetail(4)).withSelfRel()));
        userList.add(new User(5, "Jihyun", "Hwang", linkTo(methodOn(AddressController.class).getUserDetail(5)).withSelfRel()));
        userList.add(new User(6, "Bora", "Hwang", linkTo(methodOn(AddressController.class).getUserDetail(6)).withSelfRel()));

        return userList;
    }

    public List initUserAddressListFactory() {
        List<UserAddress> addressList = new ArrayList<UserAddress>();

        addressList.add(new UserAddress(1, "Alex", "Barnet", "London", "07429123456"));
        addressList.add(new UserAddress(2, "Tom", "Barnet","London", "07454165432"));
        addressList.add(new UserAddress(3, "Taeim", "Kwon", "Seoul", "05749124565"));
        addressList.add(new UserAddress(4, "Amy", "Ahn","Busan", "07475008247"));
        addressList.add(new UserAddress(5, "Jihyun", "Hwang","Ulsan", "07429120459"));
        addressList.add(new UserAddress(6, "Bora", "Hwang","Busan", "07428463450"));

        return addressList;
    }
}
