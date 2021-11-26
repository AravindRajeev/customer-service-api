package com.ar.customerservice.repository;

import com.ar.customerservice.entity.CustomerEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Optional<CustomerEntity> findById(Long id) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerId(1234l);
        customerEntity.setCustomerName("Aravind Rajeev");
        customerEntity.setPhoneNumber("9400608284");
        customerEntity.setAge(23);

        CustomerEntity customerEntity1 = new CustomerEntity();
        customerEntity1.setCustomerId(1230l);
        customerEntity1.setCustomerName("Arjun Rajeev");
        customerEntity1.setPhoneNumber("8089266847");
        customerEntity1.setAge(30);
        return Optional.ofNullable(customerEntity);
    }
}
