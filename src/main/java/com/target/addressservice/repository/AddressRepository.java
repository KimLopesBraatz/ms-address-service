package com.target.addressservice.repository;

import com.target.addressservice.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByCep(Long cep);
}
