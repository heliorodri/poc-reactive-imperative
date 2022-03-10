package com.heliorodri.pocreactive.api.v1.customer;

import com.heliorodri.pocreactive.domain.customer.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

  public CustomerResponse toResponse(Customer entity) {
    return CustomerResponse.builder()
        .id(entity.getId())
        .name(entity.getName())
        .build();
  }

  public Customer toEntity(CustomerCreateRequest request) {
    return Customer.builder()
        .name(request.getName())
        .build();
  }

}
