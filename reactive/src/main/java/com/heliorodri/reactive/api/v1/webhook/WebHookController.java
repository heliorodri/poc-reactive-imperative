package com.heliorodri.reactive.api.v1.webhook;


import com.heliorodri.reactive.domain.webhook.WebHookResponse;
import com.heliorodri.reactive.domain.webhook.WebHookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/webhook")
@RequiredArgsConstructor
public class WebHookController {

  private final WebHookService service;

  @PostMapping()
  public Mono<WebHookResponse> createCustomerAndProduct() {
    return service.findCustomerAndProduct();
  }

}
