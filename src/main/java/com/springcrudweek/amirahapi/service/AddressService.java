package com.springcrudweek.amirahapi.service;


import com.springcrudweek.amirahapi.model.Address;

public interface AddressService {
    Address createAddress(Address address);

    Address updateAddress(Address address);

    Address getAddressById(long addressId);

    void deleteAddress(long id);
}
