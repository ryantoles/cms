package com.ryanspring.springdemo.dao;

import com.ryanspring.springdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerServiceRepository extends JpaRepository<Customer, Integer> {

    @Override
    List<Customer> findAll();
}
