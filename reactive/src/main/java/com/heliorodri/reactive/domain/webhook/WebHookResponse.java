package com.heliorodri.reactive.domain.webhook;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class WebHookResponse {

  private Long customerId;
  private String customerName;
  private Long productId;
  private String productDescription;

}
