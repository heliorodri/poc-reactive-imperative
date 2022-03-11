package com.heliorodri.imperative.api.v1.webhook;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebHookCreateRequest {

  private String customerName;
  private String productDescription;

}
