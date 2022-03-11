package com.heliorodri.reactive.api.v1.webhook;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebHookCreateRequest {

  private String customerName;
  private String productDescription;

}
