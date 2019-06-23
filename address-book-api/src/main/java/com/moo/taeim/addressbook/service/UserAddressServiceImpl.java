package com.moo.taeim.addressbook.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.moo.taeim.addressbook.model.AddressDataFactory;
import com.moo.taeim.addressbook.model.User;
import com.moo.taeim.addressbook.model.UserAddress;

@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Override
    public List<User> getUserList(String surname) {
        List<User> list = new AddressDataFactory().initUserListFactory();

        if (StringUtils.isEmpty(surname)) {
            return list;
        }

        List<User> searchResultlist = list.stream()
                .filter(user -> surname.equals(user.getSurname())).collect(Collectors.toList());

        return searchResultlist;
    }

    @Override
    public UserAddress getUserAddress(int userNumber) {

        List<UserAddress> addresses = new AddressDataFactory().initUserAddressListFactory();

        UserAddress searchResult = addresses.stream()
                .filter(info -> (userNumber == info.getUserNumber())).findAny().orElse(null);

        return searchResult;
    }
}
