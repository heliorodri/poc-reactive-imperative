package com.heliorodri.pocreactive.api.v1.customer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerResponse {

  private Long id;
  private String name;

}
