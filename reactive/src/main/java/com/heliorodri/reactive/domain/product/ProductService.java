package com.heliorodri.reactive.domain.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

  public static final String DEFAULT_PRODUCT_DESCRIPTION = "product default";
  public static final long PRODUCT_ID = 1L;

  private final ProductRepository repository;

  public Mono<Product> findFirst() {
    return repository.findById(PRODUCT_ID).switchIfEmpty(createIfNotExists());
  }

  private Mono<Product> createIfNotExists() {
    final Product product = Product.builder()
        .id(1L)
        .description(DEFAULT_PRODUCT_DESCRIPTION)
        .build();

    return repository.save(product);
  }

}
