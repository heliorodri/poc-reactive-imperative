package com.heliorodri.pocreactive.domain.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

  private final CustomerRepository repository;

  public Customer create(Customer customer) {
    return repository.save(customer);
  }

}
