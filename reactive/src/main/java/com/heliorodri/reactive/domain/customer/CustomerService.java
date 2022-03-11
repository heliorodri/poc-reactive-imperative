package com.heliorodri.reactive.domain.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerService {

  public static final String DEFAULT_CUSTOMER_NAME = "customer default";
  public static final long CUSTOMER_ID = 1L;

  private final CustomerRepository repository;

  public Mono<Customer> findFirst() {
    return repository.findById(CUSTOMER_ID).switchIfEmpty(createIfNotExists());
  }

  private Mono<Customer> createIfNotExists(){
    final Customer customer = Customer.builder()
        .id(1L)
        .name(DEFAULT_CUSTOMER_NAME)
        .build();

    return repository.save(customer);
  }

}
