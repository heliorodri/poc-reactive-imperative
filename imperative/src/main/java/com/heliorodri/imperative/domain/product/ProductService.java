package com.heliorodri.imperative.domain.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

  public static final String DEFAULT_PRODUCT_DESCRIPTION = "product default";

  private final ProductRepository repository;

  public Product findFirst() {
    return repository.findAll().stream().findFirst().orElse(createIfNotExists());
  }

  private Product createIfNotExists() {
    final Product product = Product.builder()
        .id(1L)
        .description(DEFAULT_PRODUCT_DESCRIPTION)
        .build();

    return repository.save(product);
  }

}
