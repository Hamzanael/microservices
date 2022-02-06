package com.ctech.customer.service;

import com.ctech.customer.model.Customer;
import com.ctech.customer.repository.CustomerRepository;
import com.ctech.customer.service.request.FraudRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

@Service
@Setter
@Getter
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Customer saveCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);

        FraudRequest fraudRequest = restTemplate.postForObject(
                "http://FRAUD/api/v1/fraud",
                new FraudRequest(customer.getId().toString(), customer.getName(), new Date()),
                FraudRequest.class
        );
        log.info("saving new Customer {}", fraudRequest);


        return customer;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> {
            throw new EntityNotFoundException();
        });
    }


}
