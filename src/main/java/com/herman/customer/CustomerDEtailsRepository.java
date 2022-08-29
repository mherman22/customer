package com.herman.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDEtailsRepository extends JpaRepository<CustomerDetails, Long> {

}