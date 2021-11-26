package com.ar.customerservice.entity;

import com.ar.customerservice.model.Customer;
import lombok.Data;

@Data
public class CustomerEntity {

    private Long customerId;

    private String customerName;
    private String phoneNumber;
    private Integer age;

    public Customer convertToModel() {
        Customer customer= new Customer();
        customer.setCustomerId(this.getCustomerId());
        customer.setCustomerName(this.getCustomerName());
        customer.setAge(this.getAge());
        customer.setPhoneNumber(this.getPhoneNumber());
        return  customer;
    }

}
