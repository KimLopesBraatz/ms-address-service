package com.target.addressservice.resource;

import com.target.addressservice.domain.Address;
import com.target.addressservice.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/address")
public class AddressResource {

    private AddressService service;

    @GetMapping("/cep/{cep}")
    public ResponseEntity<Address> getAddressByCep(@PathVariable Long cep) {
        return new ResponseEntity<>(service.getAddressByCep(cep), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Address>> postAddress(@Valid @RequestBody List<Address> addressList) {
        return new ResponseEntity<>(service.save(addressList), HttpStatus.OK);
    }
}
