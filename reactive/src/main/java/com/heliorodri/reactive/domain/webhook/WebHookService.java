package com.heliorodri.reactive.domain.webhook;

import com.heliorodri.reactive.domain.customer.Customer;
import com.heliorodri.reactive.domain.customer.CustomerService;
import com.heliorodri.reactive.domain.product.Product;
import com.heliorodri.reactive.domain.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class WebHookService {

  private final CustomerService customerService;
  private final ProductService productService;

  public Mono<WebHookResponse> findCustomerAndProduct() {
    return Mono.zip(customerService.findFirst(), productService.findFirst())
        .map(objects -> buildResponse(objects.getT1(), objects.getT2()));
  }

  private WebHookResponse buildResponse(final Customer customer, final Product product) {
    return WebHookResponse.builder()
        .customerId(customer.getId())
        .customerName(customer.getName())
        .productId(product.getId())
        .productDescription(product.getDescription())
        .build();
  }


}
