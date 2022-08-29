package com.herman.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback/v1/customer")
// @CrossOrigin(origins = "http://localhost:3000")
public class CustomerDetailsCOntroller {

    @Autowired
    private CustomerDEtailsRepository customerDEtailsRepository;

    /**
     * @return List<CustomerDetails>
     */
    @GetMapping(value = "/get-all")
    public List<CustomerDetails> getAllDetails() {
        return customerDEtailsRepository.findAll();
    }

    /**
     * @param newCustomerDetails
     * @return CustomerDetails
     */
    @PostMapping(value = "/create")
    public CustomerDetails createCustomerDetails(@RequestBody CustomerDetails newCustomerDetails) {
        return customerDEtailsRepository.save(newCustomerDetails);
    }

}
