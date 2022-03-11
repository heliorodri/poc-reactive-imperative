package com.heliorodri.imperative.api.v1.webhook;

import com.heliorodri.imperative.domain.webhook.WebHookResponse;
import com.heliorodri.imperative.domain.webhook.WebHookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/webhook")
@RequiredArgsConstructor
public class WebHookController {

  private final WebHookService service;

  @PostMapping()
  public ResponseEntity<WebHookResponse> createCustomerAndProduct() {
    return new ResponseEntity<>(service.findCustomerAndProduct(), HttpStatus.OK);
  }

}
