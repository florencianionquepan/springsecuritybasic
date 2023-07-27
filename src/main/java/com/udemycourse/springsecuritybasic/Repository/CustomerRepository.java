package com.udemycourse.springsecuritybasic.Repository;

import com.udemycourse.springsecuritybasic.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByEmail(String email);
}
