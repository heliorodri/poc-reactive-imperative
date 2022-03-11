package com.heliorodri.imperative.domain.webhook;

import com.heliorodri.imperative.domain.customer.CustomerService;
import com.heliorodri.imperative.domain.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebHookService {

  private final CustomerService customerService;
  private final ProductService productService;

  public WebHookResponse findCustomerAndProduct() {
    final var customer = customerService.findFirst();
    final var product = productService.findFirst();

    return WebHookResponse.builder()
        .customerId(customer.getId())
        .customerName(customer.getName())
        .productId(product.getId())
        .productDescription(product.getDescription())
        .build();
  }


}
