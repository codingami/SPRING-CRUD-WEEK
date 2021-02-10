package com.springcrudweek.amirahapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcrudweek.amirahapi.model.Address;
import com.springcrudweek.amirahapi.service.AddressService;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses/{id}")
    public ResponseEntity <Address> getAddressById(@PathVariable long id) {
        return  ResponseEntity.ok().body(addressService.getAddressById(id));
    }

    @PostMapping("/addresses")
    public ResponseEntity <Address> createAddress(@RequestBody Address address) {
        return ResponseEntity.ok().body(this.addressService.createAddress(address));
    }

    @PutMapping("/addresses/{id}")
    public ResponseEntity <Address> updateAddress(@PathVariable long id, @RequestBody Address address) {
        address.setId(id);
        return ResponseEntity.ok().body(this.addressService.updateAddress(address));
    }

    @DeleteMapping("/addresses/{id}")
    public HttpStatus deletePerson(@PathVariable long id) {
        this.addressService.deleteAddress(id);
        return HttpStatus.OK;
    }
}

