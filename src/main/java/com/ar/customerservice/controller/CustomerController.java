package com.ar.customerservice.controller;

import com.ar.customerservice.model.Customer;
import com.ar.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/getCustomer/{customerId}")
    public Customer getCustomer(@PathVariable Long customerId){
        return customerService.getCustomer(customerId);
    }
}
