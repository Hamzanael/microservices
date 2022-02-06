package com.ctech.customer.controller;

import com.ctech.customer.model.Customer;
import com.ctech.customer.service.CustomerService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Setter
@Getter
@RequiredArgsConstructor
@RequestMapping("/api/v1/customer")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        log.info("receiving {}", customer);
        return customerService.saveCustomer(customer);
    }


}
