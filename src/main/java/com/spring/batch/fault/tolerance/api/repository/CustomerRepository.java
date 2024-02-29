package com.spring.batch.fault.tolerance.api.repository;
import com.spring.batch.fault.tolerance.api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
