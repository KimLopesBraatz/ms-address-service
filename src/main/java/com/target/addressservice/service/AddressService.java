package com.target.addressservice.service;

import com.target.addressservice.domain.Address;
import com.target.addressservice.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressService {

    private AddressRepository repository;

    public Address getAddressByCep(Long cep) {
        return repository.findByCep(cep);
    }

    public List<Address> save(List<Address> addressList) {
        return repository.saveAll(addressList);
    }
}
