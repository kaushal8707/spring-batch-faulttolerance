package com.spring.batch.fault.tolerance.api.config;
import com.spring.batch.fault.tolerance.api.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) {
        int age = Integer.parseInt(customer.getAge());//vhjkdfh38497infdhg
        if (age >= 18) {
            return customer;
        }
        return null;
    }
}
