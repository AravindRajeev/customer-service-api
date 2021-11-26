package com.ar.customerservice.entity;

import com.ar.customerservice.model.Customer;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Customer")
public class CustomerEntity {

    @Id
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
