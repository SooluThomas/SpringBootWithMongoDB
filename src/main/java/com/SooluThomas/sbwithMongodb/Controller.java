package com.SooluThomas.sbwithMongodb;

import com.SooluThomas.sbwithMongodb.Entity.Customer;
import com.SooluThomas.sbwithMongodb.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/MongoSpringBoot")
public class Controller {
    @Autowired
    public CustomerRepository customerRepository;

    @GetMapping("/all")
    public List<Customer> getAll(){
        System.out.println("Displaying data in Customer");
        for (Customer customer : customerRepository.findAll()){
            System.out.println(customer);
        }
        return customerRepository.findAll();
    }

    @GetMapping("/Soolu")
    public List<Customer> findByFName(){
        return customerRepository.findByFirstName("Soolu");
    }

    @GetMapping("/Thomas")
    public List<Customer> findByLName(){
        return customerRepository.findByLastName("Thomas");
    }


}
