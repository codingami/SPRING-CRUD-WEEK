package com.springcrudweek.amirahapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcrudweek.amirahapi.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
