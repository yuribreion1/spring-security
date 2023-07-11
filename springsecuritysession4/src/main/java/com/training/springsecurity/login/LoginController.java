package com.training.springsecurity.login;

import com.training.springsecurity.customer.Customer;
import com.training.springsecurity.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("register")
    public ResponseEntity<Customer> registerUser(@RequestBody Customer customer) {
        Customer receivedCustomer = new Customer();
        receivedCustomer.setEmail(customer.getEmail());
        receivedCustomer.setPwd(passwordEncoder.encode(customer.getPwd()));
        receivedCustomer.setRole(customer.getRole());

        customerRepository.save(receivedCustomer);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(customer);
    }
}
