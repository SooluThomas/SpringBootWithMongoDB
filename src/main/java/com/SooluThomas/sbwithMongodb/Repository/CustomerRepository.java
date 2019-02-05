package com.SooluThomas.sbwithMongodb.Repository;

import com.SooluThomas.sbwithMongodb.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface CustomerRepository  extends MongoRepository<Customer, Integer> {
    public List<Customer> findByFirstName(String fname);
    public List<Customer> findByLastName(String lname);
}
