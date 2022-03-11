package com.heliorodri.imperative.domain.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

  public static final String DEFAULT_CUSTOMER_NAME = "customer default";

  private final CustomerRepository repository;

  public Customer findFirst() {
    return repository.findAll().stream().findAny().orElse(createIfNotExists());
  }

  private Customer createIfNotExists(){
    final Customer customer = Customer.builder()
        .id(1L)
        .name(DEFAULT_CUSTOMER_NAME)
        .build();

    return repository.save(customer);
  }

}
