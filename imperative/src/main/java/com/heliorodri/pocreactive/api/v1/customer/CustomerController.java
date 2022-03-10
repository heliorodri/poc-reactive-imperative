package com.heliorodri.pocreactive.api.v1.customer;

import static org.springframework.http.HttpStatus.CREATED;

import com.heliorodri.pocreactive.domain.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/customers")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService service;
  private final CustomerMapper mapper;

  @PostMapping
  public ResponseEntity<CustomerResponse> create(@RequestBody CustomerCreateRequest request) {
    final CustomerResponse createdCustomer = mapper.toResponse(service.create(mapper.toEntity(request)));

    return new ResponseEntity<>(createdCustomer, CREATED);
  }

}
