package com.moo.taeim.addressbook.service;

import com.moo.taeim.addressbook.model.User;
import com.moo.taeim.addressbook.model.UserAddress;

import java.util.List;

public interface UserAddressService {

    public List<User> getUserList(String surname);

    public UserAddress getUserAddress(int userNumber);
}
