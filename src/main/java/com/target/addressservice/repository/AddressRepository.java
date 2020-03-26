package com.target.addressservice.repository;

import com.target.addressservice.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByZipCode(Long zipCode);

    List<Address> findByPersonId(Long personId);
}
