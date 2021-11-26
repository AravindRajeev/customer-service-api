package com.ar.customerservice.repository;

import com.ar.customerservice.entity.CustomerEntity;

import java.util.Optional;

public interface CustomerRepository  {
    public Optional<CustomerEntity> findById(Long id);
}
